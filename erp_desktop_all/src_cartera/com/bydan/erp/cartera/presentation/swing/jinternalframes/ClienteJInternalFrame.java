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
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.ClienteConstantesFunciones;

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
public class ClienteJInternalFrame extends ClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCliente;
	
	protected JMenuBar jmenuBarCliente;
	
	protected JMenu jmenuCliente;
	protected JMenu jmenuDatosCliente;
	protected JMenu jmenuArchivoCliente;
	protected JMenu jmenuAccionesCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCliente;	
	protected GridBagConstraints gridBagConstraintsCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClienteDetalleFormJInternalFrame jInternalFrameDetalleFormCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_titulocliente="";

	protected AreaCrBeanSwingJInternalFrame areacrBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_areacr="";

	protected EstadoClienteBeanSwingJInternalFrame estadoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocliente="";

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

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargolabo="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ruta="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogarantiaempresa="";

	protected CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_catetipoafiliacion="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TipoListaPrecioBeanSwingJInternalFrame tipolistaprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolistaprecio="";
	
	public ClienteSessionBean clienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public TituloClienteSessionBean tituloclienteSessionBean;
	public AreaCrSessionBean areacrSessionBean;
	public EstadoClienteSessionBean estadoclienteSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public ProfesionSessionBean profesionSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public RutaSessionBean rutaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;
	public DiaSessionBean diaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Cliente> clientes;		
	public List<Cliente> clientesEliminados;	
	public List<Cliente> clientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCliente;		
	protected JButton jButtonAbrirOrderByCliente;
	
	
	//protected JPanel jPanelOrderByCliente;
	//public JScrollPane jScrollPanelOrderByCliente;	
	//protected JButton jButtonCerrarOrderByCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClienteLogic clienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCliente;
	public JScrollPane jScrollPanelDatosEdicionCliente;
	public JScrollPane jScrollPanelDatosGeneralCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCliente;
	//public JScrollPane jScrollPanelImportacionCliente;
	
	
	
	protected JPanel jPanelAccionesCliente;
	
    protected JPanel jPanelPaginacionCliente;
    protected JPanel jPanelParametrosReportesCliente;
	protected JPanel jPanelParametrosReportesAccionesCliente;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralCliente;
	protected Integer iXPanelCamposIniciogeneralCliente=0;
	protected Integer iYPanelCamposIniciogeneralCliente=0;

	protected JPanel jPanelCamposInicioubicacionCliente;
	protected Integer iXPanelCamposInicioubicacionCliente=0;
	protected Integer iYPanelCamposInicioubicacionCliente=0;

	protected JPanel jPanelCamposIniciopersonalCliente;
	protected Integer iXPanelCamposIniciopersonalCliente=0;
	protected Integer iYPanelCamposIniciopersonalCliente=0;

	protected JPanel jPanelCamposIniciocontableCliente;
	protected Integer iXPanelCamposIniciocontableCliente=0;
	protected Integer iYPanelCamposIniciocontableCliente=0;

	protected JPanel jPanelCamposIniciofacturaCliente;
	protected Integer iXPanelCamposIniciofacturaCliente=0;
	protected Integer iYPanelCamposIniciofacturaCliente=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cliente;
	protected JPanel jPanelParametrosAuxiliar2Cliente;
	protected JPanel jPanelParametrosAuxiliar3Cliente;
	protected JPanel jPanelParametrosAuxiliar4Cliente;
	//protected JPanel jPanelParametrosAuxiliar5Cliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoCliente;
	//protected JPanel jPanelImportacionCliente;
	
	
	public JTable jTableDatosCliente;
	
	
	
	//public JTable jTableDatosClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCliente;
	protected JButton jButtonDuplicarCliente;
	protected JButton jButtonCopiarCliente;
	protected JButton jButtonVerFormCliente;
	protected JButton jButtonNuevoRelacionesCliente;
	protected JButton jButtonModificarCliente;
	
    protected JButton jButtonGuardarCambiosTablaCliente;
	protected JButton jButtonCerrarCliente;
	
	
	protected JButton jButtonRecargarInformacionCliente;
	protected JButton jButtonProcesarInformacionCliente;
	
	
	protected JButton jButtonAnterioresCliente;
	protected JButton jButtonSiguientesCliente;
	protected JButton jButtonNuevoGuardarCambiosCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCliente;
	//protected JButton jButtonCerrarReporteDinamicoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionCliente;
	//protected JButton jButtonGenerarImportacionCliente;
	//protected JButton jButtonCerrarImportacionCliente;
	//protected JFileChooser jFileChooserImportacionCliente;
	//protected File fileImportacionCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCliente;
	protected JButton jButtonDuplicarToolBarCliente;
	protected JButton jButtonNuevoRelacionesToolBarCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarCliente;
	protected JButton jButtonCopiarToolBarCliente;
	protected JButton jButtonVerFormToolBarCliente;
	public JButton jButtonGuardarCambiosTablaToolBarCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarCliente;
	protected JButton jButtonCerrarToolBarCliente;
	
	protected JButton jButtonRecargarInformacionToolBarCliente;
	protected JButton jButtonProcesarInformacionToolBarCliente;
	protected JButton jButtonAnterioresToolBarCliente;
	protected JButton jButtonSiguientesToolBarCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarCliente;
	protected JButton jButtonAbrirOrderByToolBarCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCliente;
	protected JMenuItem jMenuItemDuplicarCliente;
	protected JMenuItem jMenuItemNuevoRelacionesCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCliente;
	protected JMenuItem jMenuItemCopiarCliente;
	protected JMenuItem jMenuItemVerFormCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaCliente;
	protected JMenuItem jMenuItemCerrarCliente;
	protected JMenuItem jMenuItemDetalleCerrarCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionCliente;
	protected JMenuItem jMenuItemProcesarInformacionCliente;
	protected JMenuItem jMenuItemAnterioresCliente;
	protected JMenuItem jMenuItemSiguientesCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCliente;
	protected JMenuItem jMenuItemAbrirOrderByCliente;
	protected JMenuItem jMenuItemMostrarOcultarCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCliente;
	protected JCheckBox jCheckBoxSeleccionadosCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCliente;
	protected JTextField jTextFieldValorCampoGeneralCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCliente;
	//public JList<Reporte> jListColumnasSelectReporteCliente;
	//public JScrollPane jScrollColumnasSelectReporteCliente;
	
	//public JLabel jLabelRelacionesSelectReporteCliente;
	//public JList<Reporte> jListRelacionesSelectReporteCliente;
	//public JScrollPane jScrollRelacionesSelectReporteCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoCliente;
	
		
	//public JLabel jLabelArchivoImportacionCliente;	
	//public JLabel jLabelPathArchivoImportacionCliente;
	//protected JTextField jTextFieldPathArchivoImportacionCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCliente;
	
	//public JLabel jLabelColumnasValoresGraficoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCliente;
	public JPanel jPanelBusquedaPorIdentificacionCliente;
	public JButton jButtonBusquedaPorIdentificacionCliente;
	public JPanel jPanelBusquedaPorNombreComercialCliente;
	public JButton jButtonBusquedaPorNombreComercialCliente;
	public JPanel jPanelBusquedaPorNombreCompletoCliente;
	public JButton jButtonBusquedaPorNombreCompletoCliente;
	public JPanel jPanelFK_IdEstadoClienteCliente;
	public JButton jButtonFK_IdEstadoClienteCliente;
	public JPanel jPanelFK_IdEstadoLegalCliente;
	public JButton jButtonFK_IdEstadoLegalCliente;
	public JPanel jPanelFK_IdGrupoClienteCliente;
	public JButton jButtonFK_IdGrupoClienteCliente;
	public JPanel jPanelFK_IdRutaCliente;
	public JButton jButtonFK_IdRutaCliente;
	public JPanel jPanelFK_IdTipoPrecioCliente;
	public JButton jButtonFK_IdTipoPrecioCliente;
	public JPanel jPanelFK_IdTituloClienteCliente;
	public JButton jButtonFK_IdTituloClienteCliente;
	public JPanel jPanelFK_IdVendedorCliente;
	public JButton jButtonFK_IdVendedorCliente;
	public JPanel jPanelFK_IdZonaCliente;
	public JButton jButtonFK_IdZonaCliente;
	
	public JPanel jPanelidentificacionBusquedaPorIdentificacionCliente;
	public JLabel jLabelidentificacionBusquedaPorIdentificacionCliente;
	public JTextField jTextFieldidentificacionBusquedaPorIdentificacionCliente;
	public JButton jButtonidentificacionBusquedaPorIdentificacionClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_comercialBusquedaPorNombreComercialCliente;
	public JLabel jLabelnombre_comercialBusquedaPorNombreComercialCliente;
	public JTextArea jTextAreanombre_comercialBusquedaPorNombreComercialCliente;
	public JButton jButtonnombre_comercialBusquedaPorNombreComercialClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_completoBusquedaPorNombreCompletoCliente;
	public JLabel jLabelnombre_completoBusquedaPorNombreCompletoCliente;
	public JTextArea jTextAreanombre_completoBusquedaPorNombreCompletoCliente;
	public JButton jButtonnombre_completoBusquedaPorNombreCompletoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_clienteFK_IdEstadoClienteCliente;
	public JLabel jLabelid_estado_clienteFK_IdEstadoClienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_clienteFK_IdEstadoClienteCliente;
	public JButton jButtonid_estado_clienteFK_IdEstadoClienteCliente= new JButtonMe();
	public JButton jButtonid_estado_clienteFK_IdEstadoClienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_clienteFK_IdEstadoClienteClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_legalFK_IdEstadoLegalCliente;
	public JLabel jLabelid_estado_legalFK_IdEstadoLegalCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalFK_IdEstadoLegalCliente;
	public JButton jButtonid_estado_legalFK_IdEstadoLegalCliente= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteFK_IdGrupoClienteCliente;
	public JLabel jLabelid_grupo_clienteFK_IdGrupoClienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente;
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteCliente= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rutaFK_IdRutaCliente;
	public JLabel jLabelid_rutaFK_IdRutaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rutaFK_IdRutaCliente;
	public JButton jButtonid_rutaFK_IdRutaCliente= new JButtonMe();
	public JButton jButtonid_rutaFK_IdRutaClienteUpdate= new JButtonMe();
	public JButton jButtonid_rutaFK_IdRutaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioCliente;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioCliente;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_titulo_clienteFK_IdTituloClienteCliente;
	public JLabel jLabelid_titulo_clienteFK_IdTituloClienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_titulo_clienteFK_IdTituloClienteCliente;
	public JButton jButtonid_titulo_clienteFK_IdTituloClienteCliente= new JButtonMe();
	public JButton jButtonid_titulo_clienteFK_IdTituloClienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_titulo_clienteFK_IdTituloClienteClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorCliente;
	public JLabel jLabelid_vendedorFK_IdVendedorCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorCliente;
	public JButton jButtonid_vendedorFK_IdVendedorCliente= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorClienteUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorClienteBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorClienteArbol= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaCliente;
	public JLabel jLabelid_zonaFK_IdZonaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaCliente;
	public JButton jButtonid_zonaFK_IdZonaCliente= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaClienteUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=2200;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCliente)	{
		this.jButtonRecargarInformacionCliente = jButtonRecargarInformacionCliente;
	}
	
	public JButton getjButtonProcesarInformacionCliente() {
		return this.jButtonProcesarInformacionCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCliente)	{
		this.jButtonProcesarInformacionCliente = jButtonProcesarInformacionCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionCliente() {
		return this.jButtonRecargarInformacionCliente;
	}
	
	
	public List<Cliente> getclientes() {
		return this.clientes;
	}

	public void setclientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getclientesAux() {
		return this.clientesAux;
	}

	public void setclientesAux(List<Cliente> clientesAux) {
		this.clientesAux = clientesAux;
	}
	
	public List<Cliente> getclientesEliminados() {
		return this.clientesEliminados;
	}

	public void setClientesEliminados(List<Cliente> clientesEliminados) {
		this.clientesEliminados = clientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCliente() {
		return jComboBoxTiposSeleccionarCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCliente(
			JComboBox jComboBoxTiposSeleccionarCliente) {
		this.jComboBoxTiposSeleccionarCliente = jComboBoxTiposSeleccionarCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCliente() {
		return jTextFieldValorCampoGeneralCliente;
	}

	public void setjTextFieldValorCampoGeneralCliente(
			JTextField jTextFieldValorCampoGeneralCliente) {
		this.jTextFieldValorCampoGeneralCliente = jTextFieldValorCampoGeneralCliente;
	}

	public void setBorderResaltarValorCampoGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCliente() {
		return this.jCheckBoxSeleccionarTodosCliente;
	}

	public void setjCheckBoxSeleccionarTodosCliente(
			JCheckBox jCheckBoxSeleccionarTodosCliente) {
		this.jCheckBoxSeleccionarTodosCliente = jCheckBoxSeleccionarTodosCliente;
	}

	public void setBorderResaltarSeleccionarTodosCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCliente() {
		return this.jCheckBoxSeleccionadosCliente;
	}

	public void setjCheckBoxSeleccionadosCliente(
			JCheckBox jCheckBoxSeleccionadosCliente) {
		this.jCheckBoxSeleccionadosCliente = jCheckBoxSeleccionadosCliente;
	}
	
	public void setBorderResaltarSeleccionadosCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCliente() {
		return this.jComboBoxTiposArchivosReportesCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCliente(
			JComboBox jComboBoxTiposArchivosReportesCliente) {
		this.jComboBoxTiposArchivosReportesCliente = jComboBoxTiposArchivosReportesCliente;
	}

	public void setBorderResaltarTiposArchivosReportesCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCliente() {
		return this.jComboBoxTiposReportesCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCliente(
			JComboBox jComboBoxTiposReportesCliente) {
		this.jComboBoxTiposReportesCliente = jComboBoxTiposReportesCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCliente() {
	//	return jComboBoxTiposReportesDinamicoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoCliente) {
	//	this.jComboBoxTiposReportesDinamicoCliente = jComboBoxTiposReportesDinamicoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCliente = jComboBoxTiposArchivosReportesDinamicoCliente;
	//}
	
	public void setBorderResaltarTiposReportesCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCliente() {
		return this.jComboBoxTiposGraficosReportesCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCliente(
			JComboBox jComboBoxTiposGraficosReportesCliente) {
		this.jComboBoxTiposGraficosReportesCliente = jComboBoxTiposGraficosReportesCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCliente() {
		return this.jComboBoxTiposPaginacionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCliente(
			JComboBox jComboBoxTiposPaginacionCliente) {
		this.jComboBoxTiposPaginacionCliente = jComboBoxTiposPaginacionCliente;
	}
	
	public void setBorderResaltarTiposPaginacionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCliente() {
		return this.jComboBoxTiposRelacionesCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCliente() {
		return this.jComboBoxTiposAccionesCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCliente(
			JComboBox jComboBoxTiposRelacionesCliente) {
		this.jComboBoxTiposRelacionesCliente = jComboBoxTiposRelacionesCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCliente(
			JComboBox jComboBoxTiposAccionesCliente) {
		this.jComboBoxTiposAccionesCliente = jComboBoxTiposAccionesCliente;
	}
	
	public void setBorderResaltarTiposRelacionesCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCliente() {
	//	return jCheckBoxConGraficoDinamicoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoCliente) {
	//	this.jCheckBoxConGraficoDinamicoCliente = jCheckBoxConGraficoDinamicoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCliente .setBorder(borderResaltar);		
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
		this.clienteSessionBean=new ClienteSessionBean();
		
		this.clienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 6050) {
			iWidth=6050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
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
		
		ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCliente,this.jTtoolBarCliente,
							"nuevo","nuevo","Nuevo"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCliente,this.jTtoolBarCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCliente,this.jTtoolBarCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCliente,this.jTtoolBarCliente,
							"duplicar","duplicar","Duplicar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCliente,this.jTtoolBarCliente,
							"copiar","copiar","Copiar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCliente,this.jTtoolBarCliente,
							"ver_form","ver_form","Ver"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCliente,this.jTtoolBarCliente,
							"recargar","recargar","Recargar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCliente,this.jTtoolBarCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCliente,this.jTtoolBarCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCliente,this.jTtoolBarCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCliente,this.jTtoolBarCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCliente,this.jTtoolBarCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCliente,this.jTtoolBarCliente,
							"cerrar","cerrar","Salir"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCliente;
			
				this.jButtonProcesarInformacionToolBarCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCliente;
				
		//protected JButton jButtonModificarToolBarCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCliente=new JMenuMe("General");
		this.jmenuArchivoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesCliente=new JMenuMe("Acciones");
		this.jmenuDatosCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCliente.add(this.jMenuItemCerrarCliente);
			
			this.jmenuAccionesCliente.add(this.jMenuItemNuevoCliente);
			this.jmenuAccionesCliente.add(this.jMenuItemNuevoGuardarCambiosCliente);
			this.jmenuAccionesCliente.add(this.jMenuItemNuevoRelacionesCliente);
			this.jmenuAccionesCliente.add(this.jMenuItemGuardarCambiosTablaCliente);		
			this.jmenuAccionesCliente.add(this.jMenuItemDuplicarCliente);		
			this.jmenuAccionesCliente.add(this.jMenuItemCopiarCliente);		
			this.jmenuAccionesCliente.add(this.jMenuItemVerFormCliente);		
			
			this.jmenuDatosCliente.add(this.jMenuItemRecargarInformacionCliente);				
			this.jmenuDatosCliente.add(this.jMenuItemAnterioresCliente);				
			this.jmenuDatosCliente.add(this.jMenuItemSiguientesCliente);				
			this.jmenuDatosCliente.add(this.jMenuItemAbrirOrderByCliente);				
			this.jmenuDatosCliente.add(this.jMenuItemMostrarOcultarCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCliente.add(this.jMenuItemGuardarCambiosCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCliente.add(this.jmenuArchivoCliente);		
			this.jmenuBarCliente.add(this.jmenuAccionesCliente);		
			this.jmenuBarCliente.add(this.jmenuDatosCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdentificacionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdentificacionCliente.setToolTipText("Buscar Por Identificacion ");
		this.jButtonBusquedaPorIdentificacionCliente= new JButtonMe();
		this.jButtonBusquedaPorIdentificacionCliente.setText("Buscar");
		this.jButtonBusquedaPorIdentificacionCliente.setToolTipText("Buscar Por Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdentificacionCliente,"buscar_button","Buscar Por Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdentificacionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidentificacionBusquedaPorIdentificacionCliente = new JLabelMe();
		jLabelidentificacionBusquedaPorIdentificacionCliente.setText("Identificacion :");
		jLabelidentificacionBusquedaPorIdentificacionCliente.setToolTipText("Identificacion");
		jLabelidentificacionBusquedaPorIdentificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidentificacionBusquedaPorIdentificacionCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidentificacionBusquedaPorIdentificacionCliente= new JTextFieldMe();
		jTextFieldidentificacionBusquedaPorIdentificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionBusquedaPorIdentificacionCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreComercialCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreComercialCliente.setToolTipText("Buscar Por Nombre Comercial ");
		this.jButtonBusquedaPorNombreComercialCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreComercialCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreComercialCliente.setToolTipText("Buscar Por Nombre Comercial ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreComercialCliente,"buscar_button","Buscar Por Nombre Comercial ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreComercialCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_comercialBusquedaPorNombreComercialCliente = new JLabelMe();
		jLabelnombre_comercialBusquedaPorNombreComercialCliente.setText("Nombre Comercial :");
		jLabelnombre_comercialBusquedaPorNombreComercialCliente.setToolTipText("Nombre Comercial");
		jLabelnombre_comercialBusquedaPorNombreComercialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_comercialBusquedaPorNombreComercialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_comercialBusquedaPorNombreComercialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_comercialBusquedaPorNombreComercialCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_comercialBusquedaPorNombreComercialCliente= new JTextAreaMe();
		jTextAreanombre_comercialBusquedaPorNombreComercialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialBusquedaPorNombreComercialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialBusquedaPorNombreComercialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_comercialBusquedaPorNombreComercialCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCompletoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCompletoCliente.setToolTipText("Buscar Por Nombre Completo ");
		this.jButtonBusquedaPorNombreCompletoCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreCompletoCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreCompletoCliente.setToolTipText("Buscar Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCompletoCliente,"buscar_button","Buscar Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCompletoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_completoBusquedaPorNombreCompletoCliente = new JLabelMe();
		jLabelnombre_completoBusquedaPorNombreCompletoCliente.setText("Nombre Completo :");
		jLabelnombre_completoBusquedaPorNombreCompletoCliente.setToolTipText("Nombre Completo");
		jLabelnombre_completoBusquedaPorNombreCompletoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoBusquedaPorNombreCompletoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_completoBusquedaPorNombreCompletoCliente= new JTextAreaMe();
		jTextAreanombre_completoBusquedaPorNombreCompletoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoBusquedaPorNombreCompletoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoClienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoClienteCliente.setToolTipText("Buscar Por Estado Cliente ");
		this.jButtonFK_IdEstadoClienteCliente= new JButtonMe();
		this.jButtonFK_IdEstadoClienteCliente.setText("Buscar");
		this.jButtonFK_IdEstadoClienteCliente.setToolTipText("Buscar Por Estado Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoClienteCliente,"buscar_button","Buscar Por Estado Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoClienteCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_clienteFK_IdEstadoClienteCliente = new JLabelMe();
		jLabelid_estado_clienteFK_IdEstadoClienteCliente.setText("Estado Cliente :");
		jLabelid_estado_clienteFK_IdEstadoClienteCliente.setToolTipText("Estado Cliente");
		jLabelid_estado_clienteFK_IdEstadoClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_clienteFK_IdEstadoClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_clienteFK_IdEstadoClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_clienteFK_IdEstadoClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_clienteFK_IdEstadoClienteCliente= new JComboBoxMe();
		jComboBoxid_estado_clienteFK_IdEstadoClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_clienteFK_IdEstadoClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_clienteFK_IdEstadoClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_clienteFK_IdEstadoClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoLegalCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoLegalCliente.setToolTipText("Buscar Por Estado Legal ");
		this.jButtonFK_IdEstadoLegalCliente= new JButtonMe();
		this.jButtonFK_IdEstadoLegalCliente.setText("Buscar");
		this.jButtonFK_IdEstadoLegalCliente.setToolTipText("Buscar Por Estado Legal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoLegalCliente,"buscar_button","Buscar Por Estado Legal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoLegalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_legalFK_IdEstadoLegalCliente = new JLabelMe();
		jLabelid_estado_legalFK_IdEstadoLegalCliente.setText("Estado Legal :");
		jLabelid_estado_legalFK_IdEstadoLegalCliente.setToolTipText("Estado Legal");
		jLabelid_estado_legalFK_IdEstadoLegalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalFK_IdEstadoLegalCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_legalFK_IdEstadoLegalCliente= new JComboBoxMe();
		jComboBoxid_estado_legalFK_IdEstadoLegalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalFK_IdEstadoLegalCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGrupoClienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoClienteCliente.setToolTipText("Buscar Por Grupo Cliente ");
		this.jButtonFK_IdGrupoClienteCliente= new JButtonMe();
		this.jButtonFK_IdGrupoClienteCliente.setText("Buscar");
		this.jButtonFK_IdGrupoClienteCliente.setToolTipText("Buscar Por Grupo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoClienteCliente,"buscar_button","Buscar Por Grupo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoClienteCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente = new JLabelMe();
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente.setText("Grupo Cliente :");
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteFK_IdGrupoClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente= new JComboBoxMe();
		jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRutaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRutaCliente.setToolTipText("Buscar Por Ruta ");
		this.jButtonFK_IdRutaCliente= new JButtonMe();
		this.jButtonFK_IdRutaCliente.setText("Buscar");
		this.jButtonFK_IdRutaCliente.setToolTipText("Buscar Por Ruta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRutaCliente,"buscar_button","Buscar Por Ruta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRutaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rutaFK_IdRutaCliente = new JLabelMe();
		jLabelid_rutaFK_IdRutaCliente.setText("Ruta :");
		jLabelid_rutaFK_IdRutaCliente.setToolTipText("Ruta");
		jLabelid_rutaFK_IdRutaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rutaFK_IdRutaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rutaFK_IdRutaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rutaFK_IdRutaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rutaFK_IdRutaCliente= new JComboBoxMe();
		jComboBoxid_rutaFK_IdRutaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaFK_IdRutaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaFK_IdRutaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rutaFK_IdRutaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioCliente.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioCliente= new JButtonMe();
		this.jButtonFK_IdTipoPrecioCliente.setText("Buscar");
		this.jButtonFK_IdTipoPrecioCliente.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioCliente,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioCliente = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioCliente.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioCliente.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTituloClienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTituloClienteCliente.setToolTipText("Buscar Por Titulo Cliente ");
		this.jButtonFK_IdTituloClienteCliente= new JButtonMe();
		this.jButtonFK_IdTituloClienteCliente.setText("Buscar");
		this.jButtonFK_IdTituloClienteCliente.setToolTipText("Buscar Por Titulo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTituloClienteCliente,"buscar_button","Buscar Por Titulo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTituloClienteCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_titulo_clienteFK_IdTituloClienteCliente = new JLabelMe();
		jLabelid_titulo_clienteFK_IdTituloClienteCliente.setText("Titulo Cliente :");
		jLabelid_titulo_clienteFK_IdTituloClienteCliente.setToolTipText("Titulo Cliente");
		jLabelid_titulo_clienteFK_IdTituloClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_titulo_clienteFK_IdTituloClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_titulo_clienteFK_IdTituloClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_titulo_clienteFK_IdTituloClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_titulo_clienteFK_IdTituloClienteCliente= new JComboBoxMe();
		jComboBoxid_titulo_clienteFK_IdTituloClienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteFK_IdTituloClienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteFK_IdTituloClienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_titulo_clienteFK_IdTituloClienteCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorCliente.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorCliente= new JButtonMe();
		this.jButtonFK_IdVendedorCliente.setText("Buscar");
		this.jButtonFK_IdVendedorCliente.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorCliente,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorCliente = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorCliente.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorCliente.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorCliente= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaCliente.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaCliente= new JButtonMe();
		this.jButtonFK_IdZonaCliente.setText("Buscar");
		this.jButtonFK_IdZonaCliente.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaCliente,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaCliente = new JLabelMe();
		jLabelid_zonaFK_IdZonaCliente.setText("Zona :");
		jLabelid_zonaFK_IdZonaCliente.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaCliente= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));
		this.jTabbedPaneBusquedasCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));
		this.jTabbedPaneBusquedasCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));

		//this.jTabbedPaneBusquedasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCliente = new ClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cliente DATOS");
			this.jInternalFrameDetalleFormCliente = new ClienteDetalleFormJInternalFrame(jDesktopPane,this.clienteSessionBean.getConGuardarRelaciones(),this.clienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCliente = null;//new ClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCliente= new GridBagLayout();
		
		
		this.jTableDatosCliente = new JTableMe();      
		
		String sToolTipCliente="";
		sToolTipCliente=ClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCliente+="(Cartera.Cliente)";
		}
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCliente.setToolTipText(sToolTipCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCliente);
		this.jTableDatosCliente.setAutoCreateRowSorter(true);
		this.jTableDatosCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCliente.setRowSelectionAllowed(true);
		this.jTableDatosCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCliente = new JButtonMe();
		this.jButtonDuplicarCliente = new JButtonMe();
		this.jButtonCopiarCliente = new JButtonMe();
		this.jButtonVerFormCliente = new JButtonMe();
		this.jButtonNuevoRelacionesCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCliente = new JButtonMe();
		this.jButtonCerrarCliente = new JButtonMe();
		
		this.jScrollPanelDatosCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioubicacionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopersonalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciofacturaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Cliente";
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCliente.setToolTipText("Acciones");
        this.jPanelAccionesCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCliente.setName("jPanelCamposFingeneralCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioubicacionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionCliente.setName("jPanelCamposFinubicacionCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopersonalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal"));
		this.jPanelCamposIniciopersonalCliente.setName("jPanelCamposFinpersonalCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopersonalCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableCliente.setName("jPanelCamposFincontableCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciofacturaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
		this.jPanelCamposIniciofacturaCliente.setName("jPanelCamposFinfacturaCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciofacturaCliente, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCliente=new ReporteDinamicoJInternalFrame(ClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCliente=new ImportacionJInternalFrame(ClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByCliente.setText("Orden");
		this.jButtonAbrirOrderByCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCliente,false,this);
			
			//this.cargarOrderByCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCliente,true,this);
			
			//this.cargarOrderByCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCliente.setMinimumSize(new Dimension(400,50));//6030
		this.jTableDatosCliente.setMaximumSize(new Dimension(400,50));//6030
		this.jTableDatosCliente.setPreferredSize(new Dimension(400,50));//6030
		
		this.jScrollPanelDatosCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCliente.setText("Nuevo");
		this.jButtonDuplicarCliente.setText("Duplicar");
		this.jButtonCopiarCliente.setText("Copiar");
		this.jButtonVerFormCliente.setText("Ver");
		this.jButtonNuevoRelacionesCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCliente.setText("Guardar");
		this.jButtonCerrarCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCliente,"nuevo_button","Nuevo",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCliente,"duplicar_button","Duplicar",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCliente,"copiar_button","Copiar",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCliente,"ver_form","Ver",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCliente,"nuevorelaciones_button","Nuevo Rel",this.clienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCliente,"guardarcambiostabla_button","Guardar",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCliente,"cerrar_button","Salir",this.clienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCliente.setToolTipText("Nuevo"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCliente.setToolTipText("Duplicar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCliente.setToolTipText("Copiar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCliente.setToolTipText("Ver"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCliente.setToolTipText("Nuevo Rel"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCliente.setToolTipText("Guardar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCliente.setToolTipText("Salir"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCliente";
		inputMap = this.jButtonNuevoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarCliente";
		inputMap = this.jButtonDuplicarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCliente"));
		
		//COPIAR
		sMapKey = "CopiarCliente";
		inputMap = this.jButtonCopiarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCliente"));
		
		//VEr FORM
		sMapKey = "VerFormCliente";
		inputMap = this.jButtonVerFormCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCliente";
		inputMap = this.jButtonNuevoRelacionesCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCliente";
		inputMap = this.jButtonModificarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCliente";
		inputMap = this.jButtonCerrarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCliente";
		inputMap = this.jButtonGuardarCambiosTablaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCliente.setName("jPanelParametrosReportesCliente"); 
		
		this.jPanelParametrosReportesAccionesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCliente.setName("jPanelParametrosReportesAccionesCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCliente = new JButtonMe();
		this.jButtonRecargarInformacionCliente.setText("Recargar");
		this.jButtonRecargarInformacionCliente.setToolTipText("Recargar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCliente = new JButtonMe();
		this.jButtonProcesarInformacionCliente.setText("Procesar");
		this.jButtonProcesarInformacionCliente.setToolTipText("Procesar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCliente.setVisible(false);
			
		this.jButtonProcesarInformacionCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCliente.setText("TIPO");       
		this.jComboBoxTiposReportesCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCliente.setText("Accion");
		this.jComboBoxTiposRelacionesCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCliente.setText("Accion");
		this.jComboBoxTiposAccionesCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCliente = new JLabelMe();
		
		this.jLabelAccionesCliente.setText("Acciones");		
		this.jLabelAccionesCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCliente = new JButtonMe();
		//this.jButtonAnterioresCliente.setText("<<");
        this.jButtonAnterioresCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCliente = new JButtonMe();
		//this.jButtonSiguientesCliente.setText(">>");
        this.jButtonSiguientesCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCliente,"nuevoguardarcambios_button","Nue",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCliente";
		inputMap = this.jButtonNuevoGuardarCambiosCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCliente";
		inputMap = this.jButtonRecargarInformacionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCliente";
		inputMap = this.jButtonSiguientesCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCliente";
		inputMap = this.jButtonAnterioresCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCliente.setMinimumSize(new Dimension(this.getWidth(),ClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCliente.setMaximumSize(new Dimension(this.getWidth(),ClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCliente.setPreferredSize(new Dimension(this.getWidth(),ClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCliente = new GridBagLayout();

			this.jPanelPaginacionCliente.setLayout(gridaBagLayoutPaginacionCliente);						
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 0;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCliente.add(this.jButtonAnterioresCliente, this.gridBagConstraintsCliente);
					
						
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCliente.gridy = 0;
			
			this.jPanelPaginacionCliente.add(this.jButtonNuevoGuardarCambiosCliente, this.gridBagConstraintsCliente);
						
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCliente.gridy = 0;
			this.jPanelPaginacionCliente.add(this.jButtonSiguientesCliente, this.gridBagConstraintsCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 1;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCliente.add(this.jButtonNuevoCliente, this.gridBagConstraintsCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCliente = new GridBagConstraints();
				this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCliente.gridy = 1;
				this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCliente.add(this.jButtonNuevoRelacionesCliente, this.gridBagConstraintsCliente);
			}
			
			
			if(!this.clienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCliente = new GridBagConstraints();
				this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCliente.gridy = 1;
				this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCliente.add(this.jButtonGuardarCambiosTablaCliente, this.gridBagConstraintsCliente);
			}
			
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 1;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCliente.add(this.jButtonDuplicarCliente, this.gridBagConstraintsCliente);
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 1;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCliente.add(this.jButtonCopiarCliente, this.gridBagConstraintsCliente);
		
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 1;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCliente.add(this.jButtonVerFormCliente, this.gridBagConstraintsCliente);
		
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 1;
			this.gridBagConstraintsCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCliente.add(this.jButtonCerrarCliente, this.gridBagConstraintsCliente);
		
		
		
		this.jButtonRecargarInformacionCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCliente.setLayout(gridaBagParametrosReportesCliente);
			this.jPanelParametrosReportesAccionesCliente.setLayout(gridaBagParametrosReportesAccionesCliente);
			
			
			this.jPanelParametrosAuxiliar1Cliente.setLayout(gridaBagParametrosAuxiliar1Cliente);
			this.jPanelParametrosAuxiliar2Cliente.setLayout(gridaBagParametrosAuxiliar2Cliente);
			this.jPanelParametrosAuxiliar3Cliente.setLayout(gridaBagParametrosAuxiliar3Cliente);
			this.jPanelParametrosAuxiliar4Cliente.setLayout(gridaBagParametrosAuxiliar4Cliente);
			//this.jPanelParametrosAuxiliar5Cliente.setLayout(gridaBagParametrosAuxiliar2Cliente);			
			
			
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCliente.add(this.jButtonRecargarInformacionCliente, this.gridBagConstraintsCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cliente.add(this.jComboBoxTiposPaginacionCliente, this.gridBagConstraintsCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cliente.add(this.jCheckBoxConAltoMaximoTablaCliente, this.gridBagConstraintsCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cliente.add(this.jComboBoxTiposArchivosReportesCliente, this.gridBagConstraintsCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCliente.add(this.jPanelParametrosAuxiliar1Cliente, this.gridBagConstraintsCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cliente.add(this.jComboBoxTiposReportesCliente, this.gridBagConstraintsCliente);																		
			
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Cliente.add(this.jComboBoxTiposGraficosReportesCliente, this.gridBagConstraintsCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCliente.add(this.jPanelParametrosAuxiliar4Cliente, this.gridBagConstraintsCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCliente.add(this.jComboBoxTiposReportesCliente, this.gridBagConstraintsCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCliente.add(this.jCheckBoxGenerarReporteCliente, this.gridBagConstraintsCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCliente.add(this.jPanelParametrosAuxiliar2Cliente, this.gridBagConstraintsCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCliente.add(this.jLabelAccionesCliente, this.gridBagConstraintsCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCliente = new GridBagConstraints();
				this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCliente.add(this.jButtonAbrirOrderByCliente, this.gridBagConstraintsCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCliente.add(this.jComboBoxTiposSeleccionarCliente, this.gridBagConstraintsCliente);			
			
			
			/*
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCliente.add(this.jCheckBoxSeleccionarTodosCliente, this.gridBagConstraintsCliente);
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCliente.add(this.jCheckBoxConGraficoReporteCliente, this.gridBagConstraintsCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cliente.add(this.jCheckBoxSeleccionarTodosCliente, this.gridBagConstraintsCliente);															
				
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cliente.add(this.jCheckBoxSeleccionadosCliente, this.gridBagConstraintsCliente);															
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cliente.add(this.jCheckBoxConGraficoReporteCliente, this.gridBagConstraintsCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCliente.add(this.jPanelParametrosAuxiliar3Cliente, this.gridBagConstraintsCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCliente.add(this.jComboBoxTiposRelacionesCliente, this.gridBagConstraintsCliente);
				
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCliente.add(this.jComboBoxTiposAccionesCliente, this.gridBagConstraintsCliente);
	
				
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCliente.add(this.jTextFieldValorCampoGeneralCliente, this.gridBagConstraintsCliente);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCliente= new GridBagLayout();
		this.jPanelCamposIniciogeneralCliente.setLayout(gridaBagLayoutCamposIniciogeneralCliente);

		GridBagLayout gridaBagLayoutCamposInicioubicacionCliente= new GridBagLayout();
		this.jPanelCamposInicioubicacionCliente.setLayout(gridaBagLayoutCamposInicioubicacionCliente);

		GridBagLayout gridaBagLayoutCamposIniciopersonalCliente= new GridBagLayout();
		this.jPanelCamposIniciopersonalCliente.setLayout(gridaBagLayoutCamposIniciopersonalCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontableCliente= new GridBagLayout();
		this.jPanelCamposIniciocontableCliente.setLayout(gridaBagLayoutCamposIniciocontableCliente);

		GridBagLayout gridaBagLayoutCamposIniciofacturaCliente= new GridBagLayout();
		this.jPanelCamposIniciofacturaCliente.setLayout(gridaBagLayoutCamposIniciofacturaCliente);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCliente = new GridBagLayout();

			this.jScrollPanelDatosCliente.setLayout(gridaBagLayoutDatosCliente);
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = 0;
			this.gridBagConstraintsCliente.gridx = 0;
			
			this.jScrollPanelDatosCliente.add(this.jTableDatosCliente, this.gridBagConstraintsCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCliente.setViewportView(this.jTableDatosCliente);
		this.jTableDatosCliente.setFillsViewportHeight(true);
		this.jTableDatosCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCliente= new GridBagLayout();
		this.jPanelAccionesCliente.setLayout(gridaBagLayoutAccionesCliente);
		
		
		/*	
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 0;
			
		this.jPanelAccionesCliente.add(this.jButtonNuevoCliente, this.gridBagConstraintsCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdentificacionCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdentificacionCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdentificacionCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdentificacionCliente.setLayout(gridaBagLayoutBusquedaPorIdentificacionCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelBusquedaPorIdentificacionCliente.add(jLabelidentificacionBusquedaPorIdentificacionCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelBusquedaPorIdentificacionCliente.add(jTextFieldidentificacionBusquedaPorIdentificacionCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelBusquedaPorIdentificacionCliente.add(jButtonBusquedaPorIdentificacionCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("1.-Por Identificacion ", jPanelBusquedaPorIdentificacionCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreComercialCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreComercialCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreComercialCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreComercialCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreComercialCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreComercialCliente.setLayout(gridaBagLayoutBusquedaPorNombreComercialCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelBusquedaPorNombreComercialCliente.add(jLabelnombre_comercialBusquedaPorNombreComercialCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelBusquedaPorNombreComercialCliente.add(jTextAreanombre_comercialBusquedaPorNombreComercialCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelBusquedaPorNombreComercialCliente.add(jButtonBusquedaPorNombreComercialCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("2.-Por Nombre Comercial ", jPanelBusquedaPorNombreComercialCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCompletoCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCompletoCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCompletoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCompletoCliente.setLayout(gridaBagLayoutBusquedaPorNombreCompletoCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelBusquedaPorNombreCompletoCliente.add(jLabelnombre_completoBusquedaPorNombreCompletoCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelBusquedaPorNombreCompletoCliente.add(jTextAreanombre_completoBusquedaPorNombreCompletoCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelBusquedaPorNombreCompletoCliente.add(jButtonBusquedaPorNombreCompletoCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("3.-Por Nombre Completo ", jPanelBusquedaPorNombreCompletoCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoClienteCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoClienteCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoClienteCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoClienteCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoClienteCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoClienteCliente.setLayout(gridaBagLayoutFK_IdEstadoClienteCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdEstadoClienteCliente.add(jLabelid_estado_clienteFK_IdEstadoClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdEstadoClienteCliente.add(jComboBoxid_estado_clienteFK_IdEstadoClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdEstadoClienteCliente.add(jButtonFK_IdEstadoClienteCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("4.-Por Estado Cliente ", jPanelFK_IdEstadoClienteCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoLegalCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoLegalCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoLegalCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoLegalCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoLegalCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoLegalCliente.setLayout(gridaBagLayoutFK_IdEstadoLegalCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdEstadoLegalCliente.add(jLabelid_estado_legalFK_IdEstadoLegalCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdEstadoLegalCliente.add(jComboBoxid_estado_legalFK_IdEstadoLegalCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdEstadoLegalCliente.add(jButtonFK_IdEstadoLegalCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("5.-Por Estado Legal ", jPanelFK_IdEstadoLegalCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdGrupoClienteCliente= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoClienteCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoClienteCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoClienteCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoClienteCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoClienteCliente.setLayout(gridaBagLayoutFK_IdGrupoClienteCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdGrupoClienteCliente.add(jLabelid_grupo_clienteFK_IdGrupoClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdGrupoClienteCliente.add(jComboBoxid_grupo_clienteFK_IdGrupoClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdGrupoClienteCliente.add(jButtonFK_IdGrupoClienteCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("6.-Por Grupo Cliente ", jPanelFK_IdGrupoClienteCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdRutaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdRutaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRutaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRutaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRutaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRutaCliente.setLayout(gridaBagLayoutFK_IdRutaCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdRutaCliente.add(jLabelid_rutaFK_IdRutaCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdRutaCliente.add(jComboBoxid_rutaFK_IdRutaCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdRutaCliente.add(jButtonFK_IdRutaCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("7.-Por Ruta ", jPanelFK_IdRutaCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioCliente.setLayout(gridaBagLayoutFK_IdTipoPrecioCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdTipoPrecioCliente.add(jLabelid_tipo_precioFK_IdTipoPrecioCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdTipoPrecioCliente.add(jComboBoxid_tipo_precioFK_IdTipoPrecioCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdTipoPrecioCliente.add(jButtonFK_IdTipoPrecioCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("8.-Por Tipo Precio ", jPanelFK_IdTipoPrecioCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTituloClienteCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTituloClienteCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTituloClienteCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTituloClienteCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTituloClienteCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTituloClienteCliente.setLayout(gridaBagLayoutFK_IdTituloClienteCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdTituloClienteCliente.add(jLabelid_titulo_clienteFK_IdTituloClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdTituloClienteCliente.add(jComboBoxid_titulo_clienteFK_IdTituloClienteCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdTituloClienteCliente.add(jButtonFK_IdTituloClienteCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("9.-Por Titulo Cliente ", jPanelFK_IdTituloClienteCliente);
		jTabbedPaneBusquedasCliente.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdVendedorCliente= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorCliente.setLayout(gridaBagLayoutFK_IdVendedorCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdVendedorCliente.add(jLabelid_vendedorFK_IdVendedorCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdVendedorCliente.add(jComboBoxid_vendedorFK_IdVendedorCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdVendedorCliente.add(jButtonFK_IdVendedorCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("10.-Por Vendedor ", jPanelFK_IdVendedorCliente);

		GridBagLayout gridaBagLayoutFK_IdZonaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdZonaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaCliente.setLayout(gridaBagLayoutFK_IdZonaCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 0;
		jPanelFK_IdZonaCliente.add(jLabelid_zonaFK_IdZonaCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 0;
		gridBagConstraintsCliente.gridx = 1;
		jPanelFK_IdZonaCliente.add(jComboBoxid_zonaFK_IdZonaCliente, gridBagConstraintsCliente);

		gridBagConstraintsCliente = new GridBagConstraints();
		gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCliente.gridy = 1;
		gridBagConstraintsCliente.gridx =1;
		jPanelFK_IdZonaCliente.add(jButtonFK_IdZonaCliente, gridBagConstraintsCliente);

		jTabbedPaneBusquedasCliente.addTab("11.-Por Zona ", jPanelFK_IdZonaCliente);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCliente = new GridBagConstraints();						
			this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCliente.gridx = 0;		
			//this.gridBagConstraintsCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCliente, this.gridBagConstraintsCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCliente.gridx = 0;		
		//this.gridBagConstraintsCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCliente.gridx = 0;		
			this.gridBagConstraintsCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCliente, this.gridBagConstraintsCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCliente, this.gridBagConstraintsCliente);								
		
		
		/*
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCliente, this.gridBagConstraintsCliente);
		*/		
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCliente.gridx =0;
		this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCliente, this.gridBagConstraintsCliente);
				
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCliente, this.gridBagConstraintsCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosCliente.setLayout(gridaBagLayoutBusquedasParametrosCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCliente, this.gridBagConstraintsCliente);
			
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCliente, this.gridBagConstraintsCliente);
		
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCliente, this.gridBagConstraintsCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCliente.setName("jPanelReporteDinamicoCliente"); 
		
		this.jPanelReporteDinamicoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCliente.setLayout(gridaBagLayoutReporteDinamicoCliente);
		
		
		this.jInternalFrameReporteDinamicoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCliente.add(this.jLabelColumnasSelectReporteCliente, this.gridBagConstraintsCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCliente=new JScrollPane(this.jListColumnasSelectReporteCliente);
			
			this.jScrollColumnasSelectReporteCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCliente.add(this.jListColumnasSelectReporteCliente, this.gridBagConstraintsCliente);
		this.jPanelReporteDinamicoCliente.add(this.jScrollColumnasSelectReporteCliente, this.gridBagConstraintsCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCliente.add(this.jLabelRelacionesSelectReporteCliente, this.gridBagConstraintsCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCliente=new JScrollPane(this.jListRelacionesSelectReporteCliente);
			
			this.jScrollRelacionesSelectReporteCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCliente.add(this.jListRelacionesSelectReporteCliente, this.gridBagConstraintsCliente);
		this.jPanelReporteDinamicoCliente.add(this.jScrollRelacionesSelectReporteCliente, this.gridBagConstraintsCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCliente.add(this.jLabelConGraficoDinamicoCliente, this.gridBagConstraintsCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jCheckBoxConGraficoDinamicoCliente, this.gridBagConstraintsCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCliente.add(this.jLabelColumnaCategoriaGraficoCliente, this.gridBagConstraintsCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCliente.add(this.jComboBoxColumnaCategoriaGraficoCliente, this.gridBagConstraintsCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jLabelColumnaCategoriaValorCliente, this.gridBagConstraintsCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCliente.add(this.jComboBoxColumnaCategoriaValorCliente, this.gridBagConstraintsCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jLabelColumnasValoresGraficoCliente, this.gridBagConstraintsCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCliente=new JScrollPane(this.jListColumnasValoresGraficoCliente);
			
			this.jScrollColumnasValoresGraficoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCliente.add(this.jListColumnasSelectReporteCliente, this.gridBagConstraintsCliente);
		this.jPanelReporteDinamicoCliente.add(this.jScrollColumnasValoresGraficoCliente, this.gridBagConstraintsCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jLabelTiposGraficosReportesDinamicoCliente, this.gridBagConstraintsCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jComboBoxTiposGraficosReportesDinamicoCliente, this.gridBagConstraintsCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jLabelGenerarExcelReporteDinamicoCliente, this.gridBagConstraintsCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCliente.setToolTipText("Generar EXCEL"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCliente.add(this.jButtonGenerarExcelReporteDinamicoCliente, this.gridBagConstraintsCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCliente.add(this.jComboBoxTiposReportesDinamicoCliente, this.gridBagConstraintsCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCliente.add(this.jLabelTiposArchivoReporteDinamicoCliente, this.gridBagConstraintsCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoCliente, this.gridBagConstraintsCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCliente.setToolTipText("Generar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCliente.add(this.jButtonGenerarReporteDinamicoCliente, this.gridBagConstraintsCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCliente.setToolTipText("Cancelar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCliente.add(this.jButtonCerrarReporteDinamicoCliente, this.gridBagConstraintsCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCliente= new JScrollPane(jPanelReporteDinamicoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCliente);
		this.jInternalFrameReporteDinamicoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoCliente, this.gridBagConstraintsCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCliente.setName("jPanelImportacionCliente"); 
		
		this.jPanelImportacionCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCliente.setLayout(gridaBagLayoutImportacionCliente);
		
		
		this.jInternalFrameImportacionCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCliente.setResizable(true);
	    this.jInternalFrameImportacionCliente.setClosable(true);
	    this.jInternalFrameImportacionCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCliente.setResizable(true);
	    this.jInternalFrameImportacionCliente.setClosable(true);
	    this.jInternalFrameImportacionCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCliente = new JLabelMe();

		this.jLabelArchivoImportacionCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCliente.add(this.jLabelArchivoImportacionCliente, this.gridBagConstraintsCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCliente = new JFileChooser();		
		this.jFileChooserImportacionCliente.setToolTipText("ESCOGER ARCHIVO"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCliente = new JButtonMe();
		this.jButtonAbrirImportacionCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCliente.setToolTipText("Generar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCliente.add(this.jButtonAbrirImportacionCliente, this.gridBagConstraintsCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCliente.add(this.jLabelPathArchivoImportacionCliente, this.gridBagConstraintsCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCliente.add(this.jTextFieldPathArchivoImportacionCliente, this.gridBagConstraintsCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCliente = new JButtonMe();
		this.jButtonGenerarImportacionCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCliente.setToolTipText("Generar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCliente.add(this.jButtonGenerarImportacionCliente, this.gridBagConstraintsCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCliente = new JButtonMe();
		this.jButtonCerrarImportacionCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCliente.setToolTipText("Cancelar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCliente.add(this.jButtonCerrarImportacionCliente, this.gridBagConstraintsCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionCliente= new JScrollPane(jPanelImportacionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCliente);
		this.jInternalFrameImportacionCliente.getContentPane().add(this.jScrollPanelImportacionCliente, this.gridBagConstraintsCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCliente = new JButtonMe();
			this.jButtonAbrirOrderByCliente.setText("Orden");
			this.jButtonAbrirOrderByCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCliente";
			inputMap = this.jButtonAbrirOrderByCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCliente.setName("jPanelOrderByCliente"); 
			
			this.jPanelOrderByCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCliente.setLayout(gridaBagLayoutOrderByCliente);
			
			
			this.jTableDatosClienteOrderBy = new JTableMe();        
			this.jTableDatosClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClienteOrderBy.setViewportView(this.jTableDatosClienteOrderBy);
			this.jTableDatosClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCliente.setTitle("Orden");
			this.jInternalFrameOrderByCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCliente.setResizable(true);
			this.jInternalFrameOrderByCliente.setClosable(true);
			this.jInternalFrameOrderByCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCliente.ipady =150;
				
			this.jPanelOrderByCliente.add(jScrollPanelDatosClienteOrderBy, this.gridBagConstraintsCliente);//this.jTableDatosClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCliente = new JButtonMe();
			this.jButtonCerrarOrderByCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCliente.setToolTipText("Cancelar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCliente.add(this.jButtonCerrarOrderByCliente, this.gridBagConstraintsCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByCliente= new JScrollPane(jPanelOrderByCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCliente);
			
			this.jInternalFrameOrderByCliente.getContentPane().add(this.jScrollPanelOrderByCliente, this.gridBagConstraintsCliente);			
		
		} else {
			this.jButtonAbrirOrderByCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//15830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=6030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=6100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=3700;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.clienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCliente.getRowHeight();//ClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCliente.isSelected()) {
					iHeightTable=ClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCliente.isSelected()) {
					iHeightTable=ClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCliente!=null && this.jInternalFrameOrderByCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.clienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=clienteLogic.getClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cliente> TraerClienteBeans(List<Cliente> clientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cliente cliente:clientes) {
					
				if(!(ClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cliente.setsDetalleGeneralEntityReporte(ClienteConstantesFunciones.getClienteDescripcion(cliente));
										
					cliente.setes_prove_descripcion(ClienteConstantesFunciones.getes_proveDescripcion(cliente));cliente.setcon_separacion_bienes_descripcion(ClienteConstantesFunciones.getcon_separacion_bienesDescripcion(cliente));cliente.setes_contribuyente_especial_descripcion(ClienteConstantesFunciones.getes_contribuyente_especialDescripcion(cliente));	
					
					

					if(cliente.getContactoClientes()!=null && Funciones.existeClass(classes,ContactoCliente.class)) {
						try{cliente.setcontactoclientesDescripcionReporte(new JRBeanCollectionDataSource(ContactoClienteJInternalFrame.TraerContactoClienteBeans(cliente.getContactoClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getBiens()!=null && Funciones.existeClass(classes,Bien.class)) {
						try{cliente.setbiensDescripcionReporte(new JRBeanCollectionDataSource(BienJInternalFrame.TraerBienBeans(cliente.getBiens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getCargaFamiliars()!=null && Funciones.existeClass(classes,CargaFamiliar.class)) {
						try{cliente.setcargafamiliarsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliarJInternalFrame.TraerCargaFamiliarBeans(cliente.getCargaFamiliars(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getChequePostFechados()!=null && Funciones.existeClass(classes,ChequePostFechado.class)) {
						try{cliente.setchequepostfechadosDescripcionReporte(new JRBeanCollectionDataSource(ChequePostFechadoJInternalFrame.TraerChequePostFechadoBeans(cliente.getChequePostFechados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getEMails()!=null && Funciones.existeClass(classes,EMail.class)) {
						try{cliente.setemailsDescripcionReporte(new JRBeanCollectionDataSource(EMailJInternalFrame.TraerEMailBeans(cliente.getEMails(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getReferenciaPersonals()!=null && Funciones.existeClass(classes,ReferenciaPersonal.class)) {
						try{cliente.setreferenciapersonalsDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaPersonalJInternalFrame.TraerReferenciaPersonalBeans(cliente.getReferenciaPersonals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getGarantiaClientes()!=null && Funciones.existeClass(classes,GarantiaCliente.class)) {
						try{cliente.setgarantiaclientesDescripcionReporte(new JRBeanCollectionDataSource(GarantiaClienteJInternalFrame.TraerGarantiaClienteBeans(cliente.getGarantiaClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getClienteArchivos()!=null && Funciones.existeClass(classes,ClienteArchivo.class)) {
						try{cliente.setclientearchivosDescripcionReporte(new JRBeanCollectionDataSource(ClienteArchivoJInternalFrame.TraerClienteArchivoBeans(cliente.getClienteArchivos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					List<PoliticasCliente> politicasclientes=new ArrayList<PoliticasCliente>(); 

					if(cliente.getPoliticasCliente()!=null && Funciones.existeClass(classes,PoliticasCliente.class))
				{
						politicasclientes.add(cliente.getPoliticasCliente()); 
					}
					if(cliente.getPoliticasCliente()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {

						try{cliente.setPoliticasClienteDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(politicasclientes,classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getFirmaClientes()!=null && Funciones.existeClass(classes,FirmaCliente.class)) {
						try{cliente.setfirmaclientesDescripcionReporte(new JRBeanCollectionDataSource(FirmaClienteJInternalFrame.TraerFirmaClienteBeans(cliente.getFirmaClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getReferenciaComercials()!=null && Funciones.existeClass(classes,ReferenciaComercial.class)) {
						try{cliente.setreferenciacomercialsDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaComercialJInternalFrame.TraerReferenciaComercialBeans(cliente.getReferenciaComercials(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getNovedads()!=null && Funciones.existeClass(classes,Novedad.class)) {
						try{cliente.setnovedadsDescripcionReporte(new JRBeanCollectionDataSource(NovedadJInternalFrame.TraerNovedadBeans(cliente.getNovedads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getInformacionLaborals()!=null && Funciones.existeClass(classes,InformacionLaboral.class)) {
						try{cliente.setinformacionlaboralsDescripcionReporte(new JRBeanCollectionDataSource(InformacionLaboralJInternalFrame.TraerInformacionLaboralBeans(cliente.getInformacionLaborals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getInformacionFinancieras()!=null && Funciones.existeClass(classes,InformacionFinanciera.class)) {
						try{cliente.setinformacionfinancierasDescripcionReporte(new JRBeanCollectionDataSource(InformacionFinancieraJInternalFrame.TraerInformacionFinancieraBeans(cliente.getInformacionFinancieras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getTelefonos()!=null && Funciones.existeClass(classes,Telefono.class)) {
						try{cliente.settelefonosDescripcionReporte(new JRBeanCollectionDataSource(TelefonoJInternalFrame.TraerTelefonoBeans(cliente.getTelefonos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getCuentaPorCobrars()!=null && Funciones.existeClass(classes,CuentaPorCobrar.class)) {
						try{cliente.setcuentaporcobrarsDescripcionReporte(new JRBeanCollectionDataSource(CuentaPorCobrarJInternalFrame.TraerCuentaPorCobrarBeans(cliente.getCuentaPorCobrars(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getResponsables()!=null && Funciones.existeClass(classes,Responsable.class)) {
						try{cliente.setresponsablesDescripcionReporte(new JRBeanCollectionDataSource(ResponsableJInternalFrame.TraerResponsableBeans(cliente.getResponsables(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getTransportistas()!=null && Funciones.existeClass(classes,Transportista.class)) {
						try{cliente.settransportistasDescripcionReporte(new JRBeanCollectionDataSource(TransportistaJInternalFrame.TraerTransportistaBeans(cliente.getTransportistas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getPoliticaClientes()!=null && Funciones.existeClass(classes,PoliticaCliente.class)) {
						try{cliente.setpoliticaclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticaClienteJInternalFrame.TraerPoliticaClienteBeans(cliente.getPoliticaClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					List<Conyuge> conyuges=new ArrayList<Conyuge>(); 

					if(cliente.getConyuge()!=null && Funciones.existeClass(classes,Conyuge.class))
				{
						conyuges.add(cliente.getConyuge()); 
					}
					if(cliente.getConyuge()!=null && Funciones.existeClass(classes,Conyuge.class)) {

						try{cliente.setConyugeDescripcionReporte(new JRBeanCollectionDataSource(ConyugeJInternalFrame.TraerConyugeBeans(conyuges,classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getReferenciaBancarias()!=null && Funciones.existeClass(classes,ReferenciaBancaria.class)) {
						try{cliente.setreferenciabancariasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaBancariaJInternalFrame.TraerReferenciaBancariaBeans(cliente.getReferenciaBancarias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getBalanceGeneralClientes()!=null && Funciones.existeClass(classes,BalanceGeneralCliente.class)) {
						try{cliente.setbalancegeneralclientesDescripcionReporte(new JRBeanCollectionDataSource(BalanceGeneralClienteJInternalFrame.TraerBalanceGeneralClienteBeans(cliente.getBalanceGeneralClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getDatoConstitucions()!=null && Funciones.existeClass(classes,DatoConstitucion.class)) {
						try{cliente.setdatoconstitucionsDescripcionReporte(new JRBeanCollectionDataSource(DatoConstitucionJInternalFrame.TraerDatoConstitucionBeans(cliente.getDatoConstitucions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getActividadEconomicas()!=null && Funciones.existeClass(classes,ActividadEconomica.class)) {
						try{cliente.setactividadeconomicasDescripcionReporte(new JRBeanCollectionDataSource(ActividadEconomicaJInternalFrame.TraerActividadEconomicaBeans(cliente.getActividadEconomicas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getProveedorProductos()!=null && Funciones.existeClass(classes,ProveedorProducto.class)) {
						try{cliente.setproveedorproductosDescripcionReporte(new JRBeanCollectionDataSource(ProveedorProductoJInternalFrame.TraerProveedorProductoBeans(cliente.getProveedorProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getConsignatarios()!=null && Funciones.existeClass(classes,Consignatario.class)) {
						try{cliente.setconsignatariosDescripcionReporte(new JRBeanCollectionDataSource(ConsignatarioJInternalFrame.TraerConsignatarioBeans(cliente.getConsignatarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getHobbyClientes()!=null && Funciones.existeClass(classes,HobbyCliente.class)) {
						try{cliente.sethobbyclientesDescripcionReporte(new JRBeanCollectionDataSource(HobbyClienteJInternalFrame.TraerHobbyClienteBeans(cliente.getHobbyClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getRepresentanteLegals()!=null && Funciones.existeClass(classes,RepresentanteLegal.class)) {
						try{cliente.setrepresentantelegalsDescripcionReporte(new JRBeanCollectionDataSource(RepresentanteLegalJInternalFrame.TraerRepresentanteLegalBeans(cliente.getRepresentanteLegals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getClienteCoas()!=null && Funciones.existeClass(classes,ClienteCoa.class)) {
						try{cliente.setclientecoasDescripcionReporte(new JRBeanCollectionDataSource(ClienteCoaJInternalFrame.TraerClienteCoaBeans(cliente.getClienteCoas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getDireccions()!=null && Funciones.existeClass(classes,Direccion.class)) {
						try{cliente.setdireccionsDescripcionReporte(new JRBeanCollectionDataSource(DireccionJInternalFrame.TraerDireccionBeans(cliente.getDireccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getClienteImagens()!=null && Funciones.existeClass(classes,ClienteImagen.class)) {
						try{cliente.setclienteimagensDescripcionReporte(new JRBeanCollectionDataSource(ClienteImagenJInternalFrame.TraerClienteImagenBeans(cliente.getClienteImagens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{cliente.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(cliente.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getServicioClientes()!=null && Funciones.existeClass(classes,ServicioCliente.class)) {
						try{cliente.setservicioclientesDescripcionReporte(new JRBeanCollectionDataSource(ServicioClienteJInternalFrame.TraerServicioClienteBeans(cliente.getServicioClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getInformacionEconomicas()!=null && Funciones.existeClass(classes,InformacionEconomica.class)) {
						try{cliente.setinformacioneconomicasDescripcionReporte(new JRBeanCollectionDataSource(InformacionEconomicaJInternalFrame.TraerInformacionEconomicaBeans(cliente.getInformacionEconomicas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getVehiculoClientes()!=null && Funciones.existeClass(classes,VehiculoCliente.class)) {
						try{cliente.setvehiculoclientesDescripcionReporte(new JRBeanCollectionDataSource(VehiculoClienteJInternalFrame.TraerVehiculoClienteBeans(cliente.getVehiculoClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getNegocioClientes()!=null && Funciones.existeClass(classes,NegocioCliente.class)) {
						try{cliente.setnegocioclientesDescripcionReporte(new JRBeanCollectionDataSource(NegocioClienteJInternalFrame.TraerNegocioClienteBeans(cliente.getNegocioClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cliente.getMontos()!=null && Funciones.existeClass(classes,Monto.class)) {
						try{cliente.setmontosDescripcionReporte(new JRBeanCollectionDataSource(MontoJInternalFrame.TraerMontoBeans(cliente.getMontos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cliente.setsDetalleGeneralEntityReporte(cliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//clientebeans.add(clientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return clientes;
    }
	//PARA REPORTES FIN
}
