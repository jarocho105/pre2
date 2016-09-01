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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.AsientoContableConstantesFunciones;

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
public class AsientoContableJInternalFrame extends AsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAsientoContable;
	
	protected JMenuBar jmenuBarAsientoContable;
	
	protected JMenu jmenuAsientoContable;
	protected JMenu jmenuDatosAsientoContable;
	protected JMenu jmenuArchivoAsientoContable;
	protected JMenu jmenuAccionesAsientoContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsientoContable;	
	protected GridBagConstraints gridBagConstraintsAsientoContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AsientoContableDetalleFormJInternalFrame jInternalFrameDetalleFormAsientoContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAsientoContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAsientoContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDescripcionAsientoBeanSwingJInternalFrame tipodescripcionasientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodescripcionasiento="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EstadoAsientoContableBeanSwingJInternalFrame estadoasientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontable="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public AsientoContableSessionBean asientocontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AsientoContable> asientocontables;		
	public List<AsientoContable> asientocontablesEliminados;	
	public List<AsientoContable> asientocontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAsientoContable;		
	protected JButton jButtonAbrirOrderByAsientoContable;
	
	
	//protected JPanel jPanelOrderByAsientoContable;
	//public JScrollPane jScrollPanelOrderByAsientoContable;	
	//protected JButton jButtonCerrarOrderByAsientoContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AsientoContableLogic asientocontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralAsientoContable;
    
	
	
	//public JScrollPane jScrollPanelDatosAsientoContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAsientoContable;
	//public JScrollPane jScrollPanelImportacionAsientoContable;
	
	
	
	protected JPanel jPanelAccionesAsientoContable;
	
    protected JPanel jPanelPaginacionAsientoContable;
    protected JPanel jPanelParametrosReportesAsientoContable;
	protected JPanel jPanelParametrosReportesAccionesAsientoContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AsientoContable;
	protected JPanel jPanelParametrosAuxiliar2AsientoContable;
	protected JPanel jPanelParametrosAuxiliar3AsientoContable;
	protected JPanel jPanelParametrosAuxiliar4AsientoContable;
	//protected JPanel jPanelParametrosAuxiliar5AsientoContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoAsientoContable;
	//protected JPanel jPanelImportacionAsientoContable;
	
	
	public JTable jTableDatosAsientoContable;
	
	
	
	//public JTable jTableDatosAsientoContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAsientoContable;
	protected JButton jButtonDuplicarAsientoContable;
	protected JButton jButtonCopiarAsientoContable;
	protected JButton jButtonVerFormAsientoContable;
	protected JButton jButtonNuevoRelacionesAsientoContable;
	protected JButton jButtonModificarAsientoContable;
	
    protected JButton jButtonGuardarCambiosTablaAsientoContable;
	protected JButton jButtonCerrarAsientoContable;
	
	
	protected JButton jButtonRecargarInformacionAsientoContable;
	protected JButton jButtonProcesarInformacionAsientoContable;
	
	
	protected JButton jButtonAnterioresAsientoContable;
	protected JButton jButtonSiguientesAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosAsientoContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAsientoContable;
	//protected JButton jButtonCerrarReporteDinamicoAsientoContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoAsientoContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionAsientoContable;
	//protected JButton jButtonGenerarImportacionAsientoContable;
	//protected JButton jButtonCerrarImportacionAsientoContable;
	//protected JFileChooser jFileChooserImportacionAsientoContable;
	//protected File fileImportacionAsientoContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsientoContable;
	protected JButton jButtonDuplicarToolBarAsientoContable;
	protected JButton jButtonNuevoRelacionesToolBarAsientoContable;
	
	
	public JButton jButtonGuardarCambiosToolBarAsientoContable;
	protected JButton jButtonCopiarToolBarAsientoContable;
	protected JButton jButtonVerFormToolBarAsientoContable;
	public JButton jButtonGuardarCambiosTablaToolBarAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarAsientoContable;
	protected JButton jButtonCerrarToolBarAsientoContable;
	
	protected JButton jButtonRecargarInformacionToolBarAsientoContable;
	protected JButton jButtonProcesarInformacionToolBarAsientoContable;
	protected JButton jButtonAnterioresToolBarAsientoContable;
	protected JButton jButtonSiguientesToolBarAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarAsientoContable;
	protected JButton jButtonAbrirOrderByToolBarAsientoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsientoContable;
	protected JMenuItem jMenuItemDuplicarAsientoContable;
	protected JMenuItem jMenuItemNuevoRelacionesAsientoContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAsientoContable;
	protected JMenuItem jMenuItemCopiarAsientoContable;
	protected JMenuItem jMenuItemVerFormAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsientoContable;
	protected JMenuItem jMenuItemCerrarAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarAsientoContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsientoContable;
	
	protected JMenuItem jMenuItemRecargarInformacionAsientoContable;
	protected JMenuItem jMenuItemProcesarInformacionAsientoContable;
	protected JMenuItem jMenuItemAnterioresAsientoContable;
	protected JMenuItem jMenuItemSiguientesAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsientoContable;
	protected JMenuItem jMenuItemAbrirOrderByAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarAsientoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsientoContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAsientoContable;
	protected JCheckBox jCheckBoxSeleccionadosAsientoContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAsientoContable;
	protected JCheckBox jCheckBoxConGraficoReporteAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAsientoContable;
	protected JTextField jTextFieldValorCampoGeneralAsientoContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAsientoContable;
	//public JList<Reporte> jListColumnasSelectReporteAsientoContable;
	//public JScrollPane jScrollColumnasSelectReporteAsientoContable;
	
	//public JLabel jLabelRelacionesSelectReporteAsientoContable;
	//public JList<Reporte> jListRelacionesSelectReporteAsientoContable;
	//public JScrollPane jScrollRelacionesSelectReporteAsientoContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAsientoContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAsientoContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAsientoContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoAsientoContable;
	
		
	//public JLabel jLabelArchivoImportacionAsientoContable;	
	//public JLabel jLabelPathArchivoImportacionAsientoContable;
	//protected JTextField jTextFieldPathArchivoImportacionAsientoContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAsientoContable;
	
	//public JLabel jLabelColumnaCategoriaValorAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAsientoContable;
	
	//public JLabel jLabelColumnasValoresGraficoAsientoContable;
	//public JList<Reporte> jListColumnasValoresGraficoAsientoContable;
	//public JScrollPane jScrollColumnasValoresGraficoAsientoContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAsientoContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAsientoContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAsientoContable;
	public JPanel jPanelBusquedaPorBeneficiarioAsientoContable;
	public JButton jButtonBusquedaPorBeneficiarioAsientoContable;
	public JPanel jPanelBusquedaPorCodigoAsientoContable;
	public JButton jButtonBusquedaPorCodigoAsientoContable;
	public JPanel jPanelBusquedaPorFechaEmisionAsientoContable;
	public JButton jButtonBusquedaPorFechaEmisionAsientoContable;
	public JPanel jPanelBusquedaPorNumeroMayorAsientoContable;
	public JButton jButtonBusquedaPorNumeroMayorAsientoContable;
	public JPanel jPanelBusquedaPorNumeroRetencionAsientoContable;
	public JButton jButtonBusquedaPorNumeroRetencionAsientoContable;
	public JPanel jPanelBusquedaPorValorAsientoContable;
	public JButton jButtonBusquedaPorValorAsientoContable;
	public JPanel jPanelFK_IdClienteAsientoContable;
	public JButton jButtonFK_IdClienteAsientoContable;
	public JPanel jPanelFK_IdTipoDescripcionAsientoAsientoContable;
	public JButton jButtonFK_IdTipoDescripcionAsientoAsientoContable;
	public JPanel jPanelFK_IdTipoDocumentoAsientoContable;
	public JButton jButtonFK_IdTipoDocumentoAsientoContable;
	public JPanel jPanelFK_IdTipoMovimientoModuloAsientoContable;
	public JButton jButtonFK_IdTipoMovimientoModuloAsientoContable;
	
	public JPanel jPanelbeneficiarioBusquedaPorBeneficiarioAsientoContable;
	public JLabel jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable;
	public JTextArea jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable;
	public JButton jButtonbeneficiarioBusquedaPorBeneficiarioAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaPorCodigoAsientoContable;
	public JLabel jLabelcodigoBusquedaPorCodigoAsientoContable;
	public JTextField jTextFieldcodigoBusquedaPorCodigoAsientoContable;
	public JButton jButtoncodigoBusquedaPorCodigoAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emisionBusquedaPorFechaEmisionAsientoContable;
	public JLabel jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable;
	//public JFormattedTextField jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable;

	public JDateChooser jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable;
	public JButton jButtonfecha_emisionBusquedaPorFechaEmisionAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable;
	public JLabel jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable;
	//public JFormattedTextField jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable;

	public JDateChooser jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable;
	public JButton jButtonfecha_emisionBusquedaPorFechaEmisionFinalAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_mayorBusquedaPorNumeroMayorAsientoContable;
	public JLabel jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable;
	public JTextArea jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable;
	public JButton jButtonnumero_mayorBusquedaPorNumeroMayorAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_retencionBusquedaPorNumeroRetencionAsientoContable;
	public JLabel jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable;
	public JTextField jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable;
	public JButton jButtonnumero_retencionBusquedaPorNumeroRetencionAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelvalorBusquedaPorValorAsientoContable;
	public JLabel jLabelvalorBusquedaPorValorAsientoContable;
	public JTextField jTextFieldvalorBusquedaPorValorAsientoContable;
	public JButton jButtonvalorBusquedaPorValorAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelvalorBusquedaPorValorFinalAsientoContable;
	public JLabel jLabelvalorBusquedaPorValorFinalAsientoContable;
	public JTextField jTextFieldvalorBusquedaPorValorFinalAsientoContable;
	public JButton jButtonvalorBusquedaPorValorFinalAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteAsientoContable;
	public JLabel jLabelid_clienteFK_IdClienteAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteAsientoContable;
	public JButton jButtonid_clienteFK_IdClienteAsientoContable= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAsientoContableBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteAsientoContable;
	
	public JPanel jPanelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable;
	public JLabel jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable;
	public JButton jButtonid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoAsientoContable;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable;
	public JLabel jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable;
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AsientoContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAsientoContable)	{
		this.jButtonRecargarInformacionAsientoContable = jButtonRecargarInformacionAsientoContable;
	}
	
	public JButton getjButtonProcesarInformacionAsientoContable() {
		return this.jButtonProcesarInformacionAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsientoContable)	{
		this.jButtonProcesarInformacionAsientoContable = jButtonProcesarInformacionAsientoContable;
	}
	
	
	public JButton getjButtonRecargarInformacionAsientoContable() {
		return this.jButtonRecargarInformacionAsientoContable;
	}
	
	
	public List<AsientoContable> getasientocontables() {
		return this.asientocontables;
	}

	public void setasientocontables(List<AsientoContable> asientocontables) {
		this.asientocontables = asientocontables;
	}
	
	public List<AsientoContable> getasientocontablesAux() {
		return this.asientocontablesAux;
	}

	public void setasientocontablesAux(List<AsientoContable> asientocontablesAux) {
		this.asientocontablesAux = asientocontablesAux;
	}
	
	public List<AsientoContable> getasientocontablesEliminados() {
		return this.asientocontablesEliminados;
	}

	public void setAsientoContablesEliminados(List<AsientoContable> asientocontablesEliminados) {
		this.asientocontablesEliminados = asientocontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAsientoContable() {
		return jComboBoxTiposSeleccionarAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAsientoContable(
			JComboBox jComboBoxTiposSeleccionarAsientoContable) {
		this.jComboBoxTiposSeleccionarAsientoContable = jComboBoxTiposSeleccionarAsientoContable;
	}
	
	public void setBorderResaltarTiposSeleccionarAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAsientoContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAsientoContable() {
		return jTextFieldValorCampoGeneralAsientoContable;
	}

	public void setjTextFieldValorCampoGeneralAsientoContable(
			JTextField jTextFieldValorCampoGeneralAsientoContable) {
		this.jTextFieldValorCampoGeneralAsientoContable = jTextFieldValorCampoGeneralAsientoContable;
	}

	public void setBorderResaltarValorCampoGeneralAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAsientoContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAsientoContable() {
		return this.jCheckBoxSeleccionarTodosAsientoContable;
	}

	public void setjCheckBoxSeleccionarTodosAsientoContable(
			JCheckBox jCheckBoxSeleccionarTodosAsientoContable) {
		this.jCheckBoxSeleccionarTodosAsientoContable = jCheckBoxSeleccionarTodosAsientoContable;
	}

	public void setBorderResaltarSeleccionarTodosAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAsientoContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAsientoContable() {
		return this.jCheckBoxSeleccionadosAsientoContable;
	}

	public void setjCheckBoxSeleccionadosAsientoContable(
			JCheckBox jCheckBoxSeleccionadosAsientoContable) {
		this.jCheckBoxSeleccionadosAsientoContable = jCheckBoxSeleccionadosAsientoContable;
	}
	
	public void setBorderResaltarSeleccionadosAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAsientoContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAsientoContable() {
		return this.jComboBoxTiposArchivosReportesAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAsientoContable(
			JComboBox jComboBoxTiposArchivosReportesAsientoContable) {
		this.jComboBoxTiposArchivosReportesAsientoContable = jComboBoxTiposArchivosReportesAsientoContable;
	}

	public void setBorderResaltarTiposArchivosReportesAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAsientoContable() {
		return this.jComboBoxTiposReportesAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAsientoContable(
			JComboBox jComboBoxTiposReportesAsientoContable) {
		this.jComboBoxTiposReportesAsientoContable = jComboBoxTiposReportesAsientoContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAsientoContable() {
	//	return jComboBoxTiposReportesDinamicoAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAsientoContable(
	//		JComboBox jComboBoxTiposReportesDinamicoAsientoContable) {
	//	this.jComboBoxTiposReportesDinamicoAsientoContable = jComboBoxTiposReportesDinamicoAsientoContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAsientoContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAsientoContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAsientoContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAsientoContable = jComboBoxTiposArchivosReportesDinamicoAsientoContable;
	//}
	
	public void setBorderResaltarTiposReportesAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAsientoContable() {
		return this.jComboBoxTiposGraficosReportesAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAsientoContable(
			JComboBox jComboBoxTiposGraficosReportesAsientoContable) {
		this.jComboBoxTiposGraficosReportesAsientoContable = jComboBoxTiposGraficosReportesAsientoContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAsientoContable() {
		return this.jComboBoxTiposPaginacionAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAsientoContable(
			JComboBox jComboBoxTiposPaginacionAsientoContable) {
		this.jComboBoxTiposPaginacionAsientoContable = jComboBoxTiposPaginacionAsientoContable;
	}
	
	public void setBorderResaltarTiposPaginacionAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAsientoContable() {
		return this.jComboBoxTiposRelacionesAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsientoContable() {
		return this.jComboBoxTiposAccionesAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsientoContable(
			JComboBox jComboBoxTiposRelacionesAsientoContable) {
		this.jComboBoxTiposRelacionesAsientoContable = jComboBoxTiposRelacionesAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsientoContable(
			JComboBox jComboBoxTiposAccionesAsientoContable) {
		this.jComboBoxTiposAccionesAsientoContable = jComboBoxTiposAccionesAsientoContable;
	}
	
	public void setBorderResaltarTiposRelacionesAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAsientoContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAsientoContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAsientoContable() {
	//	return jCheckBoxConGraficoDinamicoAsientoContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoAsientoContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoAsientoContable) {
	//	this.jCheckBoxConGraficoDinamicoAsientoContable = jCheckBoxConGraficoDinamicoAsientoContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAsientoContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAsientoContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAsientoContable .setBorder(borderResaltar);		
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
		this.asientocontableSessionBean=new AsientoContableSessionBean();
		
		this.asientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asientocontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
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
		
		AsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAsientoContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"nuevo","nuevo","Nuevo"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"duplicar","duplicar","Duplicar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"copiar","copiar","Copiar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"ver_form","ver_form","Ver"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"recargar","recargar","Recargar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAsientoContable,this.jTtoolBarAsientoContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAsientoContable,this.jTtoolBarAsientoContable,
							"cerrar","cerrar","Salir"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAsientoContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAsientoContable;
			
				this.jButtonProcesarInformacionToolBarAsientoContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAsientoContable;
				
		//protected JButton jButtonModificarToolBarAsientoContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAsientoContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAsientoContable=new JMenuMe("General");
		this.jmenuArchivoAsientoContable=new JMenuMe("Archivo");
		this.jmenuAccionesAsientoContable=new JMenuMe("Acciones");
		this.jmenuDatosAsientoContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAsientoContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAsientoContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAsientoContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAsientoContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAsientoContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAsientoContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAsientoContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAsientoContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAsientoContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAsientoContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAsientoContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAsientoContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAsientoContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAsientoContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAsientoContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAsientoContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAsientoContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAsientoContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAsientoContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAsientoContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAsientoContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAsientoContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAsientoContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAsientoContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAsientoContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAsientoContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAsientoContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAsientoContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAsientoContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAsientoContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAsientoContable.add(this.jMenuItemCerrarAsientoContable);
			
			this.jmenuAccionesAsientoContable.add(this.jMenuItemNuevoAsientoContable);
			this.jmenuAccionesAsientoContable.add(this.jMenuItemNuevoGuardarCambiosAsientoContable);
			this.jmenuAccionesAsientoContable.add(this.jMenuItemNuevoRelacionesAsientoContable);
			this.jmenuAccionesAsientoContable.add(this.jMenuItemGuardarCambiosTablaAsientoContable);		
			this.jmenuAccionesAsientoContable.add(this.jMenuItemDuplicarAsientoContable);		
			this.jmenuAccionesAsientoContable.add(this.jMenuItemCopiarAsientoContable);		
			this.jmenuAccionesAsientoContable.add(this.jMenuItemVerFormAsientoContable);		
			
			this.jmenuDatosAsientoContable.add(this.jMenuItemRecargarInformacionAsientoContable);				
			this.jmenuDatosAsientoContable.add(this.jMenuItemAnterioresAsientoContable);				
			this.jmenuDatosAsientoContable.add(this.jMenuItemSiguientesAsientoContable);				
			this.jmenuDatosAsientoContable.add(this.jMenuItemAbrirOrderByAsientoContable);				
			this.jmenuDatosAsientoContable.add(this.jMenuItemMostrarOcultarAsientoContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAsientoContable.add(this.jMenuItemGuardarCambiosAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAsientoContable.add(this.jmenuArchivoAsientoContable);		
			this.jmenuBarAsientoContable.add(this.jmenuAccionesAsientoContable);		
			this.jmenuBarAsientoContable.add(this.jmenuDatosAsientoContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAsientoContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAsientoContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorBeneficiarioAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorBeneficiarioAsientoContable.setToolTipText("Buscar Por Beneficiario ");
		this.jButtonBusquedaPorBeneficiarioAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorBeneficiarioAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorBeneficiarioAsientoContable.setToolTipText("Buscar Por Beneficiario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorBeneficiarioAsientoContable,"buscar_button","Buscar Por Beneficiario ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorBeneficiarioAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable = new JLabelMe();
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable.setText("Beneficiario :");
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable.setToolTipText("Beneficiario");
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable= new JTextAreaMe();
		jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorCodigoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoAsientoContable.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorCodigoAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorCodigoAsientoContable.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoAsientoContable,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoAsientoContable = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoAsientoContable.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoAsientoContable.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoAsientoContable= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorFechaEmisionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaEmisionAsientoContable.setToolTipText("Buscar Por Fecha Emision ");
		this.jButtonBusquedaPorFechaEmisionAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorFechaEmisionAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorFechaEmisionAsientoContable.setToolTipText("Buscar Por Fecha Emision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaEmisionAsientoContable,"buscar_button","Buscar Por Fecha Emision ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaEmisionAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable = new JLabelMe();
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable.setText("Fecha Emision :");
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable.setToolTipText("Fecha Emision");
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable= new JDateChooser();
		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setDate(new Date());
		jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable = new JLabelMe();
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setText("Fecha Emision Final :");
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setToolTipText("Fecha Emision");
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable= new JDateChooser();
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setDate(new Date());
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNumeroMayorAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroMayorAsientoContable.setToolTipText("Buscar Por No Comp. ");
		this.jButtonBusquedaPorNumeroMayorAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorNumeroMayorAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorNumeroMayorAsientoContable.setToolTipText("Buscar Por No Comp. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroMayorAsientoContable,"buscar_button","Buscar Por No Comp. ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroMayorAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable = new JLabelMe();
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable.setText("No Comp. :");
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable.setToolTipText("No Comp.");
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable= new JTextAreaMe();
		jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroRetencionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroRetencionAsientoContable.setToolTipText("Buscar Por Num. Ret. ");
		this.jButtonBusquedaPorNumeroRetencionAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorNumeroRetencionAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorNumeroRetencionAsientoContable.setToolTipText("Buscar Por Num. Ret. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroRetencionAsientoContable,"buscar_button","Buscar Por Num. Ret. ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroRetencionAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable = new JLabelMe();
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setText("Num. Ret. :");
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setToolTipText("Num. Ret.");
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable= new JTextFieldMe();
		jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorValorAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorValorAsientoContable.setToolTipText("Buscar Por Valor ");
		this.jButtonBusquedaPorValorAsientoContable= new JButtonMe();
		this.jButtonBusquedaPorValorAsientoContable.setText("Buscar");
		this.jButtonBusquedaPorValorAsientoContable.setToolTipText("Buscar Por Valor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorValorAsientoContable,"buscar_button","Buscar Por Valor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorValorAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelvalorBusquedaPorValorAsientoContable = new JLabelMe();
		jLabelvalorBusquedaPorValorAsientoContable.setText("Valor :");
		jLabelvalorBusquedaPorValorAsientoContable.setToolTipText("Valor");
		jLabelvalorBusquedaPorValorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelvalorBusquedaPorValorAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldvalorBusquedaPorValorAsientoContable= new JTextFieldMe();
		jTextFieldvalorBusquedaPorValorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldvalorBusquedaPorValorAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldvalorBusquedaPorValorAsientoContable.setText("0.0");



	
		jLabelvalorBusquedaPorValorFinalAsientoContable = new JLabelMe();
		jLabelvalorBusquedaPorValorFinalAsientoContable.setText("Valor Final :");
		jLabelvalorBusquedaPorValorFinalAsientoContable.setToolTipText("Valor");
		jLabelvalorBusquedaPorValorFinalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorFinalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorFinalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelvalorBusquedaPorValorFinalAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldvalorBusquedaPorValorFinalAsientoContable= new JTextFieldMe();
		jTextFieldvalorBusquedaPorValorFinalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorFinalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorFinalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldvalorBusquedaPorValorFinalAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldvalorBusquedaPorValorFinalAsientoContable.setText("0.0");



		this.jPanelFK_IdClienteAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAsientoContable.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteAsientoContable= new JButtonMe();
		this.jButtonFK_IdClienteAsientoContable.setText("Buscar");
		this.jButtonFK_IdClienteAsientoContable.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAsientoContable,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteAsientoContable = new JLabelMe();
		jLabelid_clienteFK_IdClienteAsientoContable.setText("Cliente :");
		jLabelid_clienteFK_IdClienteAsientoContable.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteAsientoContable= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContable.setFocusable(false);

		this.jPanelFK_IdTipoDescripcionAsientoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDescripcionAsientoAsientoContable.setToolTipText("Buscar Por T. Descripcion ");
		this.jButtonFK_IdTipoDescripcionAsientoAsientoContable= new JButtonMe();
		this.jButtonFK_IdTipoDescripcionAsientoAsientoContable.setText("Buscar");
		this.jButtonFK_IdTipoDescripcionAsientoAsientoContable.setToolTipText("Buscar Por T. Descripcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDescripcionAsientoAsientoContable,"buscar_button","Buscar Por T. Descripcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDescripcionAsientoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable = new JLabelMe();
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setText("T. Descripcion :");
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setToolTipText("T. Descripcion");
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoAsientoContable.setToolTipText("Buscar Por Documento ");
		this.jButtonFK_IdTipoDocumentoAsientoContable= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoAsientoContable.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoAsientoContable.setToolTipText("Buscar Por Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoAsientoContable,"buscar_button","Buscar Por Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setText("Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setToolTipText("Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoModuloAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoModuloAsientoContable.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		this.jButtonFK_IdTipoMovimientoModuloAsientoContable= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoModuloAsientoContable.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoModuloAsientoContable.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoModuloAsientoContable,"buscar_button","Buscar Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoModuloAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable = new JLabelMe();
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAsientoContable=new JTabbedPane();


		this.jTabbedPaneBusquedasAsientoContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasAsientoContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasAsientoContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAsientoContable = new AsientoContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asiento Contable DATOS");
			this.jInternalFrameDetalleFormAsientoContable = new AsientoContableDetalleFormJInternalFrame(jDesktopPane,this.asientocontableSessionBean.getConGuardarRelaciones(),this.asientocontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAsientoContable = null;//new AsientoContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsientoContable= new GridBagLayout();
		
		
		this.jTableDatosAsientoContable = new JTableMe();      
		
		String sToolTipAsientoContable="";
		sToolTipAsientoContable=AsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsientoContable+="(Contabilidad.AsientoContable)";
		}
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsientoContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAsientoContable.setToolTipText(sToolTipAsientoContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAsientoContable);
		this.jTableDatosAsientoContable.setAutoCreateRowSorter(true);
		this.jTableDatosAsientoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAsientoContable.setRowSelectionAllowed(true);
		this.jTableDatosAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAsientoContable = new JButtonMe();
		this.jButtonDuplicarAsientoContable = new JButtonMe();
		this.jButtonCopiarAsientoContable = new JButtonMe();
		this.jButtonVerFormAsientoContable = new JButtonMe();
		this.jButtonNuevoRelacionesAsientoContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAsientoContable = new JButtonMe();
		this.jButtonCerrarAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralAsientoContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asiento Contable";
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesAsientoContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAsientoContable=new ReporteDinamicoJInternalFrame(AsientoContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAsientoContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAsientoContable=new ImportacionJInternalFrame(AsientoContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAsientoContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAsientoContable = new JButtonMe();
		
		this.jButtonAbrirOrderByAsientoContable.setText("Orden");
		this.jButtonAbrirOrderByAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsientoContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsientoContable,false,this);
			
			//this.cargarOrderByAsientoContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsientoContable,true,this);
			
			//this.cargarOrderByAsientoContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAsientoContable.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosAsientoContable.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosAsientoContable.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosAsientoContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsientoContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsientoContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAsientoContable.setText("Nuevo");
		this.jButtonDuplicarAsientoContable.setText("Duplicar");
		this.jButtonCopiarAsientoContable.setText("Copiar");
		this.jButtonVerFormAsientoContable.setText("Ver");
		this.jButtonNuevoRelacionesAsientoContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAsientoContable.setText("Guardar");
		this.jButtonCerrarAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsientoContable,"nuevo_button","Nuevo",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAsientoContable,"duplicar_button","Duplicar",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAsientoContable,"copiar_button","Copiar",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAsientoContable,"ver_form","Ver",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAsientoContable,"nuevorelaciones_button","Nuevo Rel",this.asientocontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsientoContable,"guardarcambiostabla_button","Guardar",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsientoContable,"cerrar_button","Salir",this.asientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAsientoContable.setToolTipText("Nuevo"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAsientoContable.setToolTipText("Duplicar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAsientoContable.setToolTipText("Copiar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAsientoContable.setToolTipText("Ver"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAsientoContable.setToolTipText("Nuevo Rel"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAsientoContable.setToolTipText("Guardar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsientoContable.setToolTipText("Salir"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsientoContable";
		inputMap = this.jButtonNuevoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsientoContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarAsientoContable";
		inputMap = this.jButtonDuplicarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAsientoContable"));
		
		//COPIAR
		sMapKey = "CopiarAsientoContable";
		inputMap = this.jButtonCopiarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAsientoContable"));
		
		//VEr FORM
		sMapKey = "VerFormAsientoContable";
		inputMap = this.jButtonVerFormAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAsientoContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAsientoContable";
		inputMap = this.jButtonNuevoRelacionesAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAsientoContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAsientoContable";
		inputMap = this.jButtonModificarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAsientoContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAsientoContable";
		inputMap = this.jButtonCerrarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsientoContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAsientoContable.setName("jPanelParametrosReportesAsientoContable"); 
		
		this.jPanelParametrosReportesAccionesAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAsientoContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAsientoContable.setName("jPanelParametrosReportesAccionesAsientoContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAsientoContable = new JButtonMe();
		this.jButtonRecargarInformacionAsientoContable.setText("Recargar");
		this.jButtonRecargarInformacionAsientoContable.setToolTipText("Recargar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAsientoContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAsientoContable = new JButtonMe();
		this.jButtonProcesarInformacionAsientoContable.setText("Procesar");
		this.jButtonProcesarInformacionAsientoContable.setToolTipText("Procesar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAsientoContable.setVisible(false);
			
		this.jButtonProcesarInformacionAsientoContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsientoContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsientoContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAsientoContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContable.setText("TIPO");       
		this.jComboBoxTiposReportesAsientoContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAsientoContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionAsientoContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAsientoContable.setText("Accion");
		this.jComboBoxTiposRelacionesAsientoContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesAsientoContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAsientoContable.setText("Accion");
		this.jComboBoxTiposSeleccionarAsientoContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAsientoContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAsientoContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsientoContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsientoContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAsientoContable = new JLabelMe();
		
		this.jLabelAccionesAsientoContable.setText("Acciones");		
		this.jLabelAccionesAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAsientoContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAsientoContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAsientoContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAsientoContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAsientoContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAsientoContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAsientoContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAsientoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAsientoContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteAsientoContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAsientoContable = new JButtonMe();
		//this.jButtonAnterioresAsientoContable.setText("<<");
        this.jButtonAnterioresAsientoContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAsientoContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAsientoContable = new JButtonMe();
		//this.jButtonSiguientesAsientoContable.setText(">>");
        this.jButtonSiguientesAsientoContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAsientoContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAsientoContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAsientoContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosAsientoContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAsientoContable,"nuevoguardarcambios_button","Nue",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAsientoContable";
		inputMap = this.jButtonNuevoGuardarCambiosAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAsientoContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAsientoContable";
		inputMap = this.jButtonRecargarInformacionAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAsientoContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAsientoContable";
		inputMap = this.jButtonSiguientesAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAsientoContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAsientoContable";
		inputMap = this.jButtonAnterioresAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAsientoContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAsientoContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAsientoContable.setMinimumSize(new Dimension(this.getWidth(),AsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsientoContable.setMaximumSize(new Dimension(this.getWidth(),AsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsientoContable.setPreferredSize(new Dimension(this.getWidth(),AsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAsientoContable = new GridBagLayout();

			this.jPanelPaginacionAsientoContable.setLayout(gridaBagLayoutPaginacionAsientoContable);						
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = 0;
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAsientoContable.add(this.jButtonAnterioresAsientoContable, this.gridBagConstraintsAsientoContable);
					
						
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsAsientoContable.gridy = 0;//
			
			this.jPanelPaginacionAsientoContable.add(this.jButtonNuevoGuardarCambiosAsientoContable, this.gridBagConstraintsAsientoContable);//
						
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsientoContable.gridy = 0;
			this.jPanelPaginacionAsientoContable.add(this.jButtonSiguientesAsientoContable, this.gridBagConstraintsAsientoContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContable.gridy = 1;//
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContable.add(this.jButtonNuevoAsientoContable, this.gridBagConstraintsAsientoContable);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAsientoContable.gridy = 1;
				this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAsientoContable.add(this.jButtonNuevoRelacionesAsientoContable, this.gridBagConstraintsAsientoContable);
			}
			
			
			if(!this.asientocontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
				this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsAsientoContable.gridy = 1;//
				this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionAsientoContable.add(this.jButtonGuardarCambiosTablaAsientoContable, this.gridBagConstraintsAsientoContable);//
			}
			
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContable.gridy = 1;//
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContable.add(this.jButtonDuplicarAsientoContable, this.gridBagConstraintsAsientoContable);//
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContable.gridy = 1;//
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContable.add(this.jButtonCopiarAsientoContable, this.gridBagConstraintsAsientoContable);//
		
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContable.gridy = 1;//
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContable.add(this.jButtonVerFormAsientoContable, this.gridBagConstraintsAsientoContable);//
		
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = 1;
			this.gridBagConstraintsAsientoContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAsientoContable.add(this.jButtonCerrarAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		
		this.jButtonRecargarInformacionAsientoContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsientoContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsientoContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAsientoContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsientoContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsientoContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAsientoContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsientoContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsientoContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAsientoContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsientoContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsientoContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAsientoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsientoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsientoContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAsientoContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsientoContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsientoContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAsientoContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AsientoContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAsientoContable.setLayout(gridaBagParametrosReportesAsientoContable);
			this.jPanelParametrosReportesAccionesAsientoContable.setLayout(gridaBagParametrosReportesAccionesAsientoContable);
			
			
			this.jPanelParametrosAuxiliar1AsientoContable.setLayout(gridaBagParametrosAuxiliar1AsientoContable);
			this.jPanelParametrosAuxiliar2AsientoContable.setLayout(gridaBagParametrosAuxiliar2AsientoContable);
			this.jPanelParametrosAuxiliar3AsientoContable.setLayout(gridaBagParametrosAuxiliar3AsientoContable);
			this.jPanelParametrosAuxiliar4AsientoContable.setLayout(gridaBagParametrosAuxiliar4AsientoContable);
			//this.jPanelParametrosAuxiliar5AsientoContable.setLayout(gridaBagParametrosAuxiliar2AsientoContable);			
			
			
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContable.add(this.jButtonRecargarInformacionAsientoContable, this.gridBagConstraintsAsientoContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContable.add(this.jComboBoxTiposPaginacionAsientoContable, this.gridBagConstraintsAsientoContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContable.add(this.jCheckBoxConAltoMaximoTablaAsientoContable, this.gridBagConstraintsAsientoContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContable.add(this.jComboBoxTiposArchivosReportesAsientoContable, this.gridBagConstraintsAsientoContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContable.add(this.jPanelParametrosAuxiliar1AsientoContable, this.gridBagConstraintsAsientoContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AsientoContable.add(this.jComboBoxTiposReportesAsientoContable, this.gridBagConstraintsAsientoContable);																		
			
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AsientoContable.add(this.jComboBoxTiposGraficosReportesAsientoContable, this.gridBagConstraintsAsientoContable);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContable.add(this.jPanelParametrosAuxiliar4AsientoContable, this.gridBagConstraintsAsientoContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContable.add(this.jComboBoxTiposReportesAsientoContable, this.gridBagConstraintsAsientoContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContable.add(this.jCheckBoxGenerarReporteAsientoContable, this.gridBagConstraintsAsientoContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContable.add(this.jPanelParametrosAuxiliar2AsientoContable, this.gridBagConstraintsAsientoContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContable.add(this.jLabelAccionesAsientoContable, this.gridBagConstraintsAsientoContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAsientoContable.add(this.jButtonAbrirOrderByAsientoContable, this.gridBagConstraintsAsientoContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContable.add(this.jComboBoxTiposSeleccionarAsientoContable, this.gridBagConstraintsAsientoContable);			
			
			
			/*
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContable.add(this.jCheckBoxSeleccionarTodosAsientoContable, this.gridBagConstraintsAsientoContable);
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContable.add(this.jCheckBoxConGraficoReporteAsientoContable, this.gridBagConstraintsAsientoContable);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsientoContable.add(this.jCheckBoxSeleccionarTodosAsientoContable, this.gridBagConstraintsAsientoContable);															
				
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsientoContable.add(this.jCheckBoxSeleccionadosAsientoContable, this.gridBagConstraintsAsientoContable);															
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsientoContable.add(this.jCheckBoxConGraficoReporteAsientoContable, this.gridBagConstraintsAsientoContable);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContable.add(this.jPanelParametrosAuxiliar3AsientoContable, this.gridBagConstraintsAsientoContable);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContable.add(this.jComboBoxTiposRelacionesAsientoContable, this.gridBagConstraintsAsientoContable);
				
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContable.add(this.jComboBoxTiposAccionesAsientoContable, this.gridBagConstraintsAsientoContable);
	
				
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContable.add(this.jTextFieldValorCampoGeneralAsientoContable, this.gridBagConstraintsAsientoContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAsientoContable = new GridBagLayout();

			this.jScrollPanelDatosAsientoContable.setLayout(gridaBagLayoutDatosAsientoContable);
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = 0;
			this.gridBagConstraintsAsientoContable.gridx = 0;
			
			this.jScrollPanelDatosAsientoContable.add(this.jTableDatosAsientoContable, this.gridBagConstraintsAsientoContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAsientoContable.setViewportView(this.jTableDatosAsientoContable);
		this.jTableDatosAsientoContable.setFillsViewportHeight(true);
		this.jTableDatosAsientoContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAsientoContable= new GridBagLayout();
		this.jPanelAccionesAsientoContable.setLayout(gridaBagLayoutAccionesAsientoContable);
		
		
		/*	
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 0;
			
		this.jPanelAccionesAsientoContable.add(this.jButtonNuevoAsientoContable, this.gridBagConstraintsAsientoContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorBeneficiarioAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorBeneficiarioAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorBeneficiarioAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorBeneficiarioAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorBeneficiarioAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorBeneficiarioAsientoContable.setLayout(gridaBagLayoutBusquedaPorBeneficiarioAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorBeneficiarioAsientoContable.add(jLabelbeneficiarioBusquedaPorBeneficiarioAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorBeneficiarioAsientoContable.add(jTextAreabeneficiarioBusquedaPorBeneficiarioAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorBeneficiarioAsientoContable.add(jButtonBusquedaPorBeneficiarioAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("1.-Por Beneficiario ", jPanelBusquedaPorBeneficiarioAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorCodigoAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoAsientoContable.setLayout(gridaBagLayoutBusquedaPorCodigoAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorCodigoAsientoContable.add(jLabelcodigoBusquedaPorCodigoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorCodigoAsientoContable.add(jTextFieldcodigoBusquedaPorCodigoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorCodigoAsientoContable.add(jButtonBusquedaPorCodigoAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("2.-Por Codigo ", jPanelBusquedaPorCodigoAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorFechaEmisionAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaEmisionAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEmisionAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEmisionAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaEmisionAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaEmisionAsientoContable.setLayout(gridaBagLayoutBusquedaPorFechaEmisionAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorFechaEmisionAsientoContable.add(jLabelfecha_emisionBusquedaPorFechaEmisionAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorFechaEmisionAsientoContable.add(jDateChooserfecha_emisionBusquedaPorFechaEmisionAsientoContable, gridBagConstraintsAsientoContable);


		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorFechaEmisionAsientoContable.add(jLabelfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorFechaEmisionAsientoContable.add(jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 2;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorFechaEmisionAsientoContable.add(jButtonBusquedaPorFechaEmisionAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("3.-Por Fecha Emision Por Fecha Emision Final", jPanelBusquedaPorFechaEmisionAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroMayorAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroMayorAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroMayorAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroMayorAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroMayorAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroMayorAsientoContable.setLayout(gridaBagLayoutBusquedaPorNumeroMayorAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorNumeroMayorAsientoContable.add(jLabelnumero_mayorBusquedaPorNumeroMayorAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorNumeroMayorAsientoContable.add(jTextAreanumero_mayorBusquedaPorNumeroMayorAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorNumeroMayorAsientoContable.add(jButtonBusquedaPorNumeroMayorAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("4.-Por No Comp. ", jPanelBusquedaPorNumeroMayorAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroRetencionAsientoContable.setLayout(gridaBagLayoutBusquedaPorNumeroRetencionAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorNumeroRetencionAsientoContable.add(jLabelnumero_retencionBusquedaPorNumeroRetencionAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorNumeroRetencionAsientoContable.add(jTextFieldnumero_retencionBusquedaPorNumeroRetencionAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorNumeroRetencionAsientoContable.add(jButtonBusquedaPorNumeroRetencionAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("5.-Por Num. Ret. ", jPanelBusquedaPorNumeroRetencionAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutBusquedaPorValorAsientoContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorValorAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorValorAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorValorAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorValorAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorValorAsientoContable.setLayout(gridaBagLayoutBusquedaPorValorAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorValorAsientoContable.add(jLabelvalorBusquedaPorValorAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorValorAsientoContable.add(jTextFieldvalorBusquedaPorValorAsientoContable, gridBagConstraintsAsientoContable);


		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelBusquedaPorValorAsientoContable.add(jLabelvalorBusquedaPorValorFinalAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelBusquedaPorValorAsientoContable.add(jTextFieldvalorBusquedaPorValorFinalAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 2;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelBusquedaPorValorAsientoContable.add(jButtonBusquedaPorValorAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("6.-Por Valor Por Valor Final", jPanelBusquedaPorValorAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdClienteAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAsientoContable.setLayout(gridaBagLayoutFK_IdClienteAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelFK_IdClienteAsientoContable.add(jLabelid_clienteFK_IdClienteAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelFK_IdClienteAsientoContable.add(jComboBoxid_clienteFK_IdClienteAsientoContable, gridBagConstraintsAsientoContable);


		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelFK_IdClienteAsientoContable.add(this.jButtonBuscarFK_IdClienteid_clienteAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelFK_IdClienteAsientoContable.add(jButtonFK_IdClienteAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("7.-Por Cliente ", jPanelFK_IdClienteAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDescripcionAsientoAsientoContable.setLayout(gridaBagLayoutFK_IdTipoDescripcionAsientoAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelFK_IdTipoDescripcionAsientoAsientoContable.add(jLabelid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelFK_IdTipoDescripcionAsientoAsientoContable.add(jComboBoxid_tipo_descripcion_asientoFK_IdTipoDescripcionAsientoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelFK_IdTipoDescripcionAsientoAsientoContable.add(jButtonFK_IdTipoDescripcionAsientoAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("8.-Por T. Descripcion ", jPanelFK_IdTipoDescripcionAsientoAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoAsientoContable.setLayout(gridaBagLayoutFK_IdTipoDocumentoAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelFK_IdTipoDocumentoAsientoContable.add(jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelFK_IdTipoDocumentoAsientoContable.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelFK_IdTipoDocumentoAsientoContable.add(jButtonFK_IdTipoDocumentoAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("9.-Por Documento ", jPanelFK_IdTipoDocumentoAsientoContable);
		jTabbedPaneBusquedasAsientoContable.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoModuloAsientoContable.setLayout(gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 0;
		jPanelFK_IdTipoMovimientoModuloAsientoContable.add(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 0;
		gridBagConstraintsAsientoContable.gridx = 1;
		jPanelFK_IdTipoMovimientoModuloAsientoContable.add(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContable, gridBagConstraintsAsientoContable);

		gridBagConstraintsAsientoContable = new GridBagConstraints();
		gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContable.gridy = 1;
		gridBagConstraintsAsientoContable.gridx =1;
		jPanelFK_IdTipoMovimientoModuloAsientoContable.add(jButtonFK_IdTipoMovimientoModuloAsientoContable, gridBagConstraintsAsientoContable);

		jTabbedPaneBusquedasAsientoContable.addTab("10.-Por Tipo Movimiento Modulo ", jPanelFK_IdTipoMovimientoModuloAsientoContable);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsientoContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asientocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContable.gridx = 0;		
			//this.gridBagConstraintsAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsientoContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAsientoContable, this.gridBagConstraintsAsientoContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAsientoContable.gridx = 0;		
		//this.gridBagConstraintsAsientoContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAsientoContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAsientoContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContable.gridx = 0;		
			this.gridBagConstraintsAsientoContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAsientoContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAsientoContable, this.gridBagConstraintsAsientoContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAsientoContable, this.gridBagConstraintsAsientoContable);								
		
		
		/*
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAsientoContable, this.gridBagConstraintsAsientoContable);
		*/		
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsientoContable.gridx =0;
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsientoContable, this.gridBagConstraintsAsientoContable);
				
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAsientoContable, this.gridBagConstraintsAsientoContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsientoContable = new GridBagLayout();
			this.jPanelBusquedasParametrosAsientoContable.setLayout(gridaBagLayoutBusquedasParametrosAsientoContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsientoContable, this.gridBagConstraintsAsientoContable);
			
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsientoContable, this.gridBagConstraintsAsientoContable);
		
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsientoContable, this.gridBagConstraintsAsientoContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAsientoContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAsientoContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAsientoContable.setName("jPanelReporteDinamicoAsientoContable"); 
		
		this.jPanelReporteDinamicoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAsientoContable.setLayout(gridaBagLayoutReporteDinamicoAsientoContable);
		
		
		this.jInternalFrameReporteDinamicoAsientoContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAsientoContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAsientoContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoAsientoContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoAsientoContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAsientoContable = new JLabelMe();

		this.jLabelColumnasSelectReporteAsientoContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelColumnasSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAsientoContable = new JList<Reporte>();
		this.jListColumnasSelectReporteAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAsientoContable=new JScrollPane(this.jListColumnasSelectReporteAsientoContable);
			
			this.jScrollColumnasSelectReporteAsientoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsientoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsientoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsientoContable.add(this.jListColumnasSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		this.jPanelReporteDinamicoAsientoContable.add(this.jScrollColumnasSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAsientoContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteAsientoContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelRelacionesSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAsientoContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAsientoContable=new JScrollPane(this.jListRelacionesSelectReporteAsientoContable);
			
			this.jScrollRelacionesSelectReporteAsientoContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsientoContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsientoContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsientoContable.add(this.jListRelacionesSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		this.jPanelReporteDinamicoAsientoContable.add(this.jScrollRelacionesSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAsientoContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAsientoContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoAsientoContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAsientoContable = new JLabelMe();

		this.jLabelConGraficoDinamicoAsientoContable.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelConGraficoDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAsientoContable.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAsientoContable.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAsientoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsientoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsientoContable.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jCheckBoxConGraficoDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAsientoContable = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAsientoContable.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelColumnaCategoriaGraficoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsientoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAsientoContable.add(this.jComboBoxColumnaCategoriaGraficoAsientoContable, this.gridBagConstraintsAsientoContable);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAsientoContable = new JLabelMe();

		this.jLabelColumnaCategoriaValorAsientoContable.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelColumnaCategoriaValorAsientoContable, this.gridBagConstraintsAsientoContable);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAsientoContable.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAsientoContable.add(this.jComboBoxColumnaCategoriaValorAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAsientoContable = new JLabelMe();

		this.jLabelColumnasValoresGraficoAsientoContable.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelColumnasValoresGraficoAsientoContable, this.gridBagConstraintsAsientoContable);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAsientoContable = new JList<Reporte>();
		this.jListColumnasValoresGraficoAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAsientoContable.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAsientoContable=new JScrollPane(this.jListColumnasValoresGraficoAsientoContable);
			
			this.jScrollColumnasValoresGraficoAsientoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsientoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsientoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAsientoContable.add(this.jListColumnasSelectReporteAsientoContable, this.gridBagConstraintsAsientoContable);
		this.jPanelReporteDinamicoAsientoContable.add(this.jScrollColumnasValoresGraficoAsientoContable, this.gridBagConstraintsAsientoContable);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAsientoContable = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAsientoContable.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelTiposGraficosReportesDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAsientoContable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsientoContable.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAsientoContable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsientoContable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jComboBoxTiposGraficosReportesDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAsientoContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAsientoContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelGenerarExcelReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAsientoContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAsientoContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAsientoContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAsientoContable.setToolTipText("Generar EXCEL"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAsientoContable.add(this.jButtonGenerarExcelReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContable.add(this.jComboBoxTiposReportesDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAsientoContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAsientoContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContable.add(this.jLabelTiposArchivoReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContable.add(this.jComboBoxTiposArchivosReportesDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAsientoContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAsientoContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAsientoContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAsientoContable.setToolTipText("Generar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContable.add(this.jButtonGenerarReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAsientoContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAsientoContable.setToolTipText("Cancelar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContable.add(this.jButtonCerrarReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAsientoContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAsientoContable= new JScrollPane(jPanelReporteDinamicoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAsientoContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAsientoContable);
		this.jInternalFrameReporteDinamicoAsientoContable.getContentPane().add(this.jScrollPanelReporteDinamicoAsientoContable, this.gridBagConstraintsAsientoContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAsientoContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAsientoContable.setName("jPanelImportacionAsientoContable"); 
		
		this.jPanelImportacionAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAsientoContable.setLayout(gridaBagLayoutImportacionAsientoContable);
		
		
		this.jInternalFrameImportacionAsientoContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAsientoContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionAsientoContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsientoContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionAsientoContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAsientoContable = new JLabelMe();

		this.jLabelArchivoImportacionAsientoContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsientoContable.add(this.jLabelArchivoImportacionAsientoContable, this.gridBagConstraintsAsientoContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAsientoContable = new JFileChooser();		
		this.jFileChooserImportacionAsientoContable.setToolTipText("ESCOGER ARCHIVO"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAsientoContable = new JButtonMe();
		this.jButtonAbrirImportacionAsientoContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAsientoContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAsientoContable.setToolTipText("Generar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContable.add(this.jButtonAbrirImportacionAsientoContable, this.gridBagConstraintsAsientoContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAsientoContable = new JLabelMe();

		this.jLabelPathArchivoImportacionAsientoContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsientoContable.add(this.jLabelPathArchivoImportacionAsientoContable, this.gridBagConstraintsAsientoContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAsientoContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAsientoContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsientoContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsientoContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContable.add(this.jTextFieldPathArchivoImportacionAsientoContable, this.gridBagConstraintsAsientoContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAsientoContable = new JButtonMe();
		this.jButtonGenerarImportacionAsientoContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAsientoContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAsientoContable.setToolTipText("Generar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContable.add(this.jButtonGenerarImportacionAsientoContable, this.gridBagConstraintsAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAsientoContable = new JButtonMe();
		this.jButtonCerrarImportacionAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAsientoContable.setToolTipText("Cancelar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContable.add(this.jButtonCerrarImportacionAsientoContable, this.gridBagConstraintsAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAsientoContable = new GridBagLayout();
		
		this.jScrollPanelImportacionAsientoContable= new JScrollPane(jPanelImportacionAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iPosYImportacion;
		this.gridBagConstraintsAsientoContable.gridx =iPosXImportacion;
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAsientoContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAsientoContable);
		this.jInternalFrameImportacionAsientoContable.getContentPane().add(this.jScrollPanelImportacionAsientoContable, this.gridBagConstraintsAsientoContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAsientoContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAsientoContable = new JButtonMe();
			this.jButtonAbrirOrderByAsientoContable.setText("Orden");
			this.jButtonAbrirOrderByAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsientoContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAsientoContable";
			inputMap = this.jButtonAbrirOrderByAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAsientoContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByAsientoContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAsientoContable.setName("jPanelOrderByAsientoContable"); 
			
			this.jPanelOrderByAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAsientoContable.setLayout(gridaBagLayoutOrderByAsientoContable);
			
			
			this.jTableDatosAsientoContableOrderBy = new JTableMe();        
			this.jTableDatosAsientoContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAsientoContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAsientoContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAsientoContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAsientoContableOrderBy.setViewportView(this.jTableDatosAsientoContableOrderBy);
			this.jTableDatosAsientoContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAsientoContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAsientoContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAsientoContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAsientoContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAsientoContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAsientoContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAsientoContable.setTitle("Orden");
			this.jInternalFrameOrderByAsientoContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAsientoContable.setResizable(true);
			this.jInternalFrameOrderByAsientoContable.setClosable(true);
			this.jInternalFrameOrderByAsientoContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAsientoContable.ipady =150;
				
			this.jPanelOrderByAsientoContable.add(jScrollPanelDatosAsientoContableOrderBy, this.gridBagConstraintsAsientoContable);//this.jTableDatosAsientoContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAsientoContable = new JButtonMe();
			this.jButtonCerrarOrderByAsientoContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAsientoContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAsientoContable.setToolTipText("Cancelar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAsientoContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAsientoContable.add(this.jButtonCerrarOrderByAsientoContable, this.gridBagConstraintsAsientoContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAsientoContable = new GridBagLayout();
			
			this.jScrollPanelOrderByAsientoContable= new JScrollPane(jPanelOrderByAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAsientoContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAsientoContable);
			
			this.jInternalFrameOrderByAsientoContable.getContentPane().add(this.jScrollPanelOrderByAsientoContable, this.gridBagConstraintsAsientoContable);			
		
		} else {
			this.jButtonAbrirOrderByAsientoContable = new JButtonMe();
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
		int iWidthTableCalculado=0;//5530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.asientocontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAsientoContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAsientoContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAsientoContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAsientoContable.getRowHeight();//AsientoContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsientoContable.isSelected()) {
					iHeightTable=AsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsientoContable.isSelected()) {
					iHeightTable=AsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAsientoContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsientoContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsientoContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAsientoContable!=null && this.jInternalFrameOrderByAsientoContable.getjTableDatosOrderBy()!=null) {
			//if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAsientoContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAsientoContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAsientoContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAsientoContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAsientoContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAsientoContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAsientoContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=asientocontableLogic.getAsientoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asientocontables.size();
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
	public static List<AsientoContable> TraerAsientoContableBeans(List<AsientoContable> asientocontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(AsientoContable asientocontable:asientocontables) {
					
				if(!(AsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					asientocontable.setsDetalleGeneralEntityReporte(AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontable));
										
					asientocontable.setes_retencion_descripcion(AsientoContableConstantesFunciones.getes_retencionDescripcion(asientocontable));asientocontable.setes_retencion_iva_descripcion(AsientoContableConstantesFunciones.getes_retencion_ivaDescripcion(asientocontable));	
					
					

					if(asientocontable.getSris()!=null && Funciones.existeClass(classes,Sri.class)) {
						try{asientocontable.setsrisDescripcionReporte(new JRBeanCollectionDataSource(SriJInternalFrame.TraerSriBeans(asientocontable.getSris(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(asientocontable.getImportarExportars()!=null && Funciones.existeClass(classes,ImportarExportar.class)) {
						try{asientocontable.setimportarexportarsDescripcionReporte(new JRBeanCollectionDataSource(ImportarExportarJInternalFrame.TraerImportarExportarBeans(asientocontable.getImportarExportars(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(asientocontable.getDetalleMoviClienProves()!=null && Funciones.existeClass(classes,DetalleMoviClienProve.class)) {
						try{asientocontable.setdetallemoviclienprovesDescripcionReporte(new JRBeanCollectionDataSource(DetalleMoviClienProveJInternalFrame.TraerDetalleMoviClienProveBeans(asientocontable.getDetalleMoviClienProves(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(asientocontable.getPrestamos()!=null && Funciones.existeClass(classes,Prestamo.class)) {
						try{asientocontable.setprestamosDescripcionReporte(new JRBeanCollectionDataSource(PrestamoJInternalFrame.TraerPrestamoBeans(asientocontable.getPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(asientocontable.getDetalleAsientoContables()!=null && Funciones.existeClass(classes,DetalleAsientoContable.class)) {
						try{asientocontable.setdetalleasientocontablesDescripcionReporte(new JRBeanCollectionDataSource(DetalleAsientoContableJInternalFrame.TraerDetalleAsientoContableBeans(asientocontable.getDetalleAsientoContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(asientocontable.getRetencions()!=null && Funciones.existeClass(classes,Retencion.class)) {
						try{asientocontable.setretencionsDescripcionReporte(new JRBeanCollectionDataSource(RetencionJInternalFrame.TraerRetencionBeans(asientocontable.getRetencions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//asientocontable.setsDetalleGeneralEntityReporte(asientocontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//asientocontablebeans.add(asientocontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return asientocontables;
    }
	//PARA REPORTES FIN
}
