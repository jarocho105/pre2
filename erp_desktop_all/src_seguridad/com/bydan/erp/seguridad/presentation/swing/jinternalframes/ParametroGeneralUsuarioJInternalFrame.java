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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ParametroGeneralUsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ParametroGeneralUsuarioJInternalFrame extends ParametroGeneralUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroGeneralUsuario;
	
	protected JMenuBar jmenuBarParametroGeneralUsuario;
	
	protected JMenu jmenuParametroGeneralUsuario;
	protected JMenu jmenuDatosParametroGeneralUsuario;
	protected JMenu jmenuArchivoParametroGeneralUsuario;
	protected JMenu jmenuAccionesParametroGeneralUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneralUsuario;	
	protected GridBagConstraints gridBagConstraintsParametroGeneralUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormParametroGeneralUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroGeneralUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroGeneralUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovisual="";

	protected TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondo="";

	protected TipoFondoBeanSwingJInternalFrame tipofondobordeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondoborde="";

	protected TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondocontrol="";

	protected TipoFuenteBeanSwingJInternalFrame tipofuenteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofuente="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolnormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrolnormal="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolrelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrolrelacion="";

	protected TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoexportar="";

	protected TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodelimiter="";
	
	public ParametroGeneralUsuarioSessionBean parametrogeneralusuarioSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoVisualSessionBean tipovisualSessionBean;
	public TipoFondoSessionBean tipofondoSessionBean;
	public TipoFondoSessionBean tipofondobordeSessionBean;
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
	public TipoFuenteSessionBean tipofuenteSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolnormalSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolrelacionSessionBean;
	public TipoExportarSessionBean tipoexportarSessionBean;
	public TipoDelimiterSessionBean tipodelimiterSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroGeneralUsuario> parametrogeneralusuarios;		
	public List<ParametroGeneralUsuario> parametrogeneralusuariosEliminados;	
	public List<ParametroGeneralUsuario> parametrogeneralusuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroGeneralUsuario;		
	protected JButton jButtonAbrirOrderByParametroGeneralUsuario;
	
	
	//protected JPanel jPanelOrderByParametroGeneralUsuario;
	//public JScrollPane jScrollPanelOrderByParametroGeneralUsuario;	
	//protected JButton jButtonCerrarOrderByParametroGeneralUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroGeneralUsuarioLogic parametrogeneralusuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroGeneralUsuario;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneralUsuario;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneralUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroGeneralUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroGeneralUsuario;
	//public JScrollPane jScrollPanelImportacionParametroGeneralUsuario;
	
	
	
	protected JPanel jPanelAccionesParametroGeneralUsuario;
	
    protected JPanel jPanelPaginacionParametroGeneralUsuario;
    protected JPanel jPanelParametrosReportesParametroGeneralUsuario;
	protected JPanel jPanelParametrosReportesAccionesParametroGeneralUsuario;
	
	
	
	
	
	

	protected JPanel jPanelCamposInicioprincipalParametroGeneralUsuario;
	protected Integer iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioprincipalParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciovisualParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciovisualParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciovisualParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciofuncionalParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciofuncionalParametroGeneralUsuario=0;

	protected JPanel jPanelCamposInicioexportarParametroGeneralUsuario;
	protected Integer iXPanelCamposInicioexportarParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioexportarParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciorecargarParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciorecargarParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciorecargarParametroGeneralUsuario=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar2ParametroGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar3ParametroGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar4ParametroGeneralUsuario;
	//protected JPanel jPanelParametrosAuxiliar5ParametroGeneralUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroGeneralUsuario;
	//protected JPanel jPanelImportacionParametroGeneralUsuario;
	
	
	public JTable jTableDatosParametroGeneralUsuario;
	
	
	
	//public JTable jTableDatosParametroGeneralUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroGeneralUsuario;
	protected JButton jButtonDuplicarParametroGeneralUsuario;
	protected JButton jButtonCopiarParametroGeneralUsuario;
	protected JButton jButtonVerFormParametroGeneralUsuario;
	protected JButton jButtonNuevoRelacionesParametroGeneralUsuario;
	protected JButton jButtonModificarParametroGeneralUsuario;
	
    protected JButton jButtonGuardarCambiosTablaParametroGeneralUsuario;
	protected JButton jButtonCerrarParametroGeneralUsuario;
	
	
	protected JButton jButtonRecargarInformacionParametroGeneralUsuario;
	protected JButton jButtonProcesarInformacionParametroGeneralUsuario;
	
	
	protected JButton jButtonAnterioresParametroGeneralUsuario;
	protected JButton jButtonSiguientesParametroGeneralUsuario;
	protected JButton jButtonNuevoGuardarCambiosParametroGeneralUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroGeneralUsuario;
	//protected JButton jButtonCerrarReporteDinamicoParametroGeneralUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroGeneralUsuario;
	//protected JButton jButtonGenerarImportacionParametroGeneralUsuario;
	//protected JButton jButtonCerrarImportacionParametroGeneralUsuario;
	//protected JFileChooser jFileChooserImportacionParametroGeneralUsuario;
	//protected File fileImportacionParametroGeneralUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneralUsuario;
	protected JButton jButtonDuplicarToolBarParametroGeneralUsuario;
	protected JButton jButtonNuevoRelacionesToolBarParametroGeneralUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroGeneralUsuario;
	protected JButton jButtonCopiarToolBarParametroGeneralUsuario;
	protected JButton jButtonVerFormToolBarParametroGeneralUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarParametroGeneralUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneralUsuario;
	protected JButton jButtonCerrarToolBarParametroGeneralUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarParametroGeneralUsuario;
	protected JButton jButtonProcesarInformacionToolBarParametroGeneralUsuario;
	protected JButton jButtonAnterioresToolBarParametroGeneralUsuario;
	protected JButton jButtonSiguientesToolBarParametroGeneralUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroGeneralUsuario;
	protected JButton jButtonAbrirOrderByToolBarParametroGeneralUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneralUsuario;
	protected JMenuItem jMenuItemDuplicarParametroGeneralUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesParametroGeneralUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroGeneralUsuario;
	protected JMenuItem jMenuItemCopiarParametroGeneralUsuario;
	protected JMenuItem jMenuItemVerFormParametroGeneralUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneralUsuario;
	protected JMenuItem jMenuItemCerrarParametroGeneralUsuario;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneralUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroGeneralUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneralUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroGeneralUsuario;
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneralUsuario;
	protected JMenuItem jMenuItemAnterioresParametroGeneralUsuario;
	protected JMenuItem jMenuItemSiguientesParametroGeneralUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneralUsuario;
	protected JMenuItem jMenuItemAbrirOrderByParametroGeneralUsuario;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneralUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneralUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroGeneralUsuario;
	protected JCheckBox jCheckBoxSeleccionadosParametroGeneralUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroGeneralUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroGeneralUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroGeneralUsuario;
	protected JTextField jTextFieldValorCampoGeneralParametroGeneralUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroGeneralUsuario;
	//public JList<Reporte> jListColumnasSelectReporteParametroGeneralUsuario;
	//public JScrollPane jScrollColumnasSelectReporteParametroGeneralUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteParametroGeneralUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteParametroGeneralUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteParametroGeneralUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroGeneralUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroGeneralUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario;
	
		
	//public JLabel jLabelArchivoImportacionParametroGeneralUsuario;	
	//public JLabel jLabelPathArchivoImportacionParametroGeneralUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionParametroGeneralUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroGeneralUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroGeneralUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorParametroGeneralUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroGeneralUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoParametroGeneralUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoParametroGeneralUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoParametroGeneralUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroGeneralUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroGeneralUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroGeneralUsuario;
	public JPanel jPanelFK_IdEmpresaParametroGeneralUsuario;
	public JButton jButtonFK_IdEmpresaParametroGeneralUsuario;
	public JPanel jPanelFK_IdMonedaParametroGeneralUsuario;
	public JButton jButtonFK_IdMonedaParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoDelimiterParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoDelimiterParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoExportarParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoExportarParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoFondoParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoFondoParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoFondoBordeParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoFondoBordeParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoFondoControlParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoFondoControlParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoFuenteParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoFuenteParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario;
	public JPanel jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario;
	public JButton jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario;
	public JPanel jPanelFK_IdUsuarioParametroGeneralUsuario;
	public JButton jButtonFK_IdUsuarioParametroGeneralUsuario;
	
	public JPanel jPanelid_empresaFK_IdEmpresaParametroGeneralUsuario;
	public JLabel jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario;
	public JButton jButtonid_empresaFK_IdEmpresaParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_empresaFK_IdEmpresaParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaFK_IdEmpresaParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_monedaFK_IdMonedaParametroGeneralUsuario;
	public JLabel jLabelid_monedaFK_IdMonedaParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario;
	public JButton jButtonid_monedaFK_IdMonedaParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_monedaFK_IdMonedaParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_monedaFK_IdMonedaParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario;
	public JLabel jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario;
	public JButton jButtonid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario;
	public JLabel jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario;
	public JButton jButtonid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario;
	public JButton jButtonid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario;
	public JLabel jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario;
	public JButton jButtonid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario;
	public JLabel jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario;
	public JButton jButtonid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioFK_IdUsuarioParametroGeneralUsuario;
	public JLabel jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario;
	public JButton jButtonid_usuarioFK_IdUsuarioParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroGeneralUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroGeneralUsuario)	{
		this.jButtonRecargarInformacionParametroGeneralUsuario = jButtonRecargarInformacionParametroGeneralUsuario;
	}
	
	public JButton getjButtonProcesarInformacionParametroGeneralUsuario() {
		return this.jButtonProcesarInformacionParametroGeneralUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneralUsuario)	{
		this.jButtonProcesarInformacionParametroGeneralUsuario = jButtonProcesarInformacionParametroGeneralUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroGeneralUsuario() {
		return this.jButtonRecargarInformacionParametroGeneralUsuario;
	}
	
	
	public List<ParametroGeneralUsuario> getparametrogeneralusuarios() {
		return this.parametrogeneralusuarios;
	}

	public void setparametrogeneralusuarios(List<ParametroGeneralUsuario> parametrogeneralusuarios) {
		this.parametrogeneralusuarios = parametrogeneralusuarios;
	}
	
	public List<ParametroGeneralUsuario> getparametrogeneralusuariosAux() {
		return this.parametrogeneralusuariosAux;
	}

	public void setparametrogeneralusuariosAux(List<ParametroGeneralUsuario> parametrogeneralusuariosAux) {
		this.parametrogeneralusuariosAux = parametrogeneralusuariosAux;
	}
	
	public List<ParametroGeneralUsuario> getparametrogeneralusuariosEliminados() {
		return this.parametrogeneralusuariosEliminados;
	}

	public void setParametroGeneralUsuariosEliminados(List<ParametroGeneralUsuario> parametrogeneralusuariosEliminados) {
		this.parametrogeneralusuariosEliminados = parametrogeneralusuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroGeneralUsuario() {
		return jComboBoxTiposSeleccionarParametroGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroGeneralUsuario(
			JComboBox jComboBoxTiposSeleccionarParametroGeneralUsuario) {
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario = jComboBoxTiposSeleccionarParametroGeneralUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroGeneralUsuario() {
		return jTextFieldValorCampoGeneralParametroGeneralUsuario;
	}

	public void setjTextFieldValorCampoGeneralParametroGeneralUsuario(
			JTextField jTextFieldValorCampoGeneralParametroGeneralUsuario) {
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario = jTextFieldValorCampoGeneralParametroGeneralUsuario;
	}

	public void setBorderResaltarValorCampoGeneralParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroGeneralUsuario() {
		return this.jCheckBoxSeleccionarTodosParametroGeneralUsuario;
	}

	public void setjCheckBoxSeleccionarTodosParametroGeneralUsuario(
			JCheckBox jCheckBoxSeleccionarTodosParametroGeneralUsuario) {
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario = jCheckBoxSeleccionarTodosParametroGeneralUsuario;
	}

	public void setBorderResaltarSeleccionarTodosParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroGeneralUsuario() {
		return this.jCheckBoxSeleccionadosParametroGeneralUsuario;
	}

	public void setjCheckBoxSeleccionadosParametroGeneralUsuario(
			JCheckBox jCheckBoxSeleccionadosParametroGeneralUsuario) {
		this.jCheckBoxSeleccionadosParametroGeneralUsuario = jCheckBoxSeleccionadosParametroGeneralUsuario;
	}
	
	public void setBorderResaltarSeleccionadosParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroGeneralUsuario() {
		return this.jComboBoxTiposArchivosReportesParametroGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroGeneralUsuario(
			JComboBox jComboBoxTiposArchivosReportesParametroGeneralUsuario) {
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario = jComboBoxTiposArchivosReportesParametroGeneralUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroGeneralUsuario() {
		return this.jComboBoxTiposReportesParametroGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroGeneralUsuario(
			JComboBox jComboBoxTiposReportesParametroGeneralUsuario) {
		this.jComboBoxTiposReportesParametroGeneralUsuario = jComboBoxTiposReportesParametroGeneralUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroGeneralUsuario() {
	//	return jComboBoxTiposReportesDinamicoParametroGeneralUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroGeneralUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroGeneralUsuario) {
	//	this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario = jComboBoxTiposReportesDinamicoParametroGeneralUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario = jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario;
	//}
	
	public void setBorderResaltarTiposReportesParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroGeneralUsuario() {
		return this.jComboBoxTiposGraficosReportesParametroGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroGeneralUsuario(
			JComboBox jComboBoxTiposGraficosReportesParametroGeneralUsuario) {
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario = jComboBoxTiposGraficosReportesParametroGeneralUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroGeneralUsuario() {
		return this.jComboBoxTiposPaginacionParametroGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroGeneralUsuario(
			JComboBox jComboBoxTiposPaginacionParametroGeneralUsuario) {
		this.jComboBoxTiposPaginacionParametroGeneralUsuario = jComboBoxTiposPaginacionParametroGeneralUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroGeneralUsuario() {
		return this.jComboBoxTiposRelacionesParametroGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneralUsuario() {
		return this.jComboBoxTiposAccionesParametroGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneralUsuario(
			JComboBox jComboBoxTiposRelacionesParametroGeneralUsuario) {
		this.jComboBoxTiposRelacionesParametroGeneralUsuario = jComboBoxTiposRelacionesParametroGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneralUsuario(
			JComboBox jComboBoxTiposAccionesParametroGeneralUsuario) {
		this.jComboBoxTiposAccionesParametroGeneralUsuario = jComboBoxTiposAccionesParametroGeneralUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroGeneralUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroGeneralUsuario() {
	//	return jCheckBoxConGraficoDinamicoParametroGeneralUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroGeneralUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroGeneralUsuario) {
	//	this.jCheckBoxConGraficoDinamicoParametroGeneralUsuario = jCheckBoxConGraficoDinamicoParametroGeneralUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroGeneralUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroGeneralUsuario .setBorder(borderResaltar);		
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
		this.parametrogeneralusuarioSessionBean=new ParametroGeneralUsuarioSessionBean();
		
		this.parametrogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroGeneralUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"nuevo","nuevo","Nuevo"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"duplicar","duplicar","Duplicar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"copiar","copiar","Copiar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"ver_form","ver_form","Ver"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"recargar","recargar","Recargar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroGeneralUsuario,this.jTtoolBarParametroGeneralUsuario,
							"cerrar","cerrar","Salir"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroGeneralUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroGeneralUsuario;
			
				this.jButtonProcesarInformacionToolBarParametroGeneralUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroGeneralUsuario;
				
		//protected JButton jButtonModificarToolBarParametroGeneralUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroGeneralUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroGeneralUsuario=new JMenuMe("General");
		this.jmenuArchivoParametroGeneralUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesParametroGeneralUsuario=new JMenuMe("Acciones");
		this.jmenuDatosParametroGeneralUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneralUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneralUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneralUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroGeneralUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroGeneralUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroGeneralUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroGeneralUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroGeneralUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroGeneralUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroGeneralUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneralUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneralUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroGeneralUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroGeneralUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroGeneralUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroGeneralUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroGeneralUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroGeneralUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroGeneralUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroGeneralUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroGeneralUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroGeneralUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroGeneralUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroGeneralUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroGeneralUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroGeneralUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroGeneralUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroGeneralUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroGeneralUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroGeneralUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroGeneralUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroGeneralUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroGeneralUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroGeneralUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroGeneralUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroGeneralUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroGeneralUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroGeneralUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroGeneralUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroGeneralUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroGeneralUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroGeneralUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroGeneralUsuario.add(this.jMenuItemCerrarParametroGeneralUsuario);
			
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemNuevoParametroGeneralUsuario);
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemNuevoGuardarCambiosParametroGeneralUsuario);
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemNuevoRelacionesParametroGeneralUsuario);
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemGuardarCambiosTablaParametroGeneralUsuario);		
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemDuplicarParametroGeneralUsuario);		
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemCopiarParametroGeneralUsuario);		
			this.jmenuAccionesParametroGeneralUsuario.add(this.jMenuItemVerFormParametroGeneralUsuario);		
			
			this.jmenuDatosParametroGeneralUsuario.add(this.jMenuItemRecargarInformacionParametroGeneralUsuario);				
			this.jmenuDatosParametroGeneralUsuario.add(this.jMenuItemAnterioresParametroGeneralUsuario);				
			this.jmenuDatosParametroGeneralUsuario.add(this.jMenuItemSiguientesParametroGeneralUsuario);				
			this.jmenuDatosParametroGeneralUsuario.add(this.jMenuItemAbrirOrderByParametroGeneralUsuario);				
			this.jmenuDatosParametroGeneralUsuario.add(this.jMenuItemMostrarOcultarParametroGeneralUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroGeneralUsuario.add(this.jMenuItemGuardarCambiosParametroGeneralUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroGeneralUsuario.add(this.jmenuArchivoParametroGeneralUsuario);		
			this.jmenuBarParametroGeneralUsuario.add(this.jmenuAccionesParametroGeneralUsuario);		
			this.jmenuBarParametroGeneralUsuario.add(this.jmenuDatosParametroGeneralUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroGeneralUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroGeneralUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpresaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaParametroGeneralUsuario.setToolTipText("Buscar Por Empresa ");
		this.jButtonFK_IdEmpresaParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdEmpresaParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdEmpresaParametroGeneralUsuario.setToolTipText("Buscar Por Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaParametroGeneralUsuario,"buscar_button","Buscar Por Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario = new JLabelMe();
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario.setText("Empresa :");
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario.setToolTipText("Empresa");
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMonedaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMonedaParametroGeneralUsuario.setToolTipText("Buscar Por Moneda ");
		this.jButtonFK_IdMonedaParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdMonedaParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdMonedaParametroGeneralUsuario.setToolTipText("Buscar Por Moneda ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMonedaParametroGeneralUsuario,"buscar_button","Buscar Por Moneda ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMonedaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario = new JLabelMe();
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario.setText("Moneda :");
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario.setToolTipText("Moneda");
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_monedaFK_IdMonedaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_monedaFK_IdMonedaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDelimiterParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDelimiterParametroGeneralUsuario.setToolTipText("Buscar Por T. Delimiter ");
		this.jButtonFK_IdTipoDelimiterParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoDelimiterParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoDelimiterParametroGeneralUsuario.setToolTipText("Buscar Por T. Delimiter ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDelimiterParametroGeneralUsuario,"buscar_button","Buscar Por T. Delimiter ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDelimiterParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setText("T. Delimiter :");
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setToolTipText("T. Delimiter");
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoExportarParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoExportarParametroGeneralUsuario.setToolTipText("Buscar Por T. Exportar ");
		this.jButtonFK_IdTipoExportarParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoExportarParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoExportarParametroGeneralUsuario.setToolTipText("Buscar Por T. Exportar ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoExportarParametroGeneralUsuario,"buscar_button","Buscar Por T. Exportar ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoExportarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setText("T. Exportar :");
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setToolTipText("T. Exportar");
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFondoParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFondoParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo ");
		this.jButtonFK_IdTipoFondoParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoFondoParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoFondoParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFondoParametroGeneralUsuario,"buscar_button","Buscar Por Tipo Fondo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFondoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setText("Tipo Fondo :");
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setToolTipText("Tipo Fondo");
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFondoBordeParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFondoBordeParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo Borde ");
		this.jButtonFK_IdTipoFondoBordeParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoFondoBordeParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoFondoBordeParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo Borde ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFondoBordeParametroGeneralUsuario,"buscar_button","Buscar Por Tipo Fondo Borde ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFondoBordeParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setText("Tipo Fondo Borde :");
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setToolTipText("Tipo Fondo Borde");
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFondoControlParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFondoControlParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo Control ");
		this.jButtonFK_IdTipoFondoControlParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoFondoControlParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoFondoControlParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fondo Control ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFondoControlParametroGeneralUsuario,"buscar_button","Buscar Por Tipo Fondo Control ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFondoControlParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setText("Tipo Fondo Control :");
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setToolTipText("Tipo Fondo Control");
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFuenteParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFuenteParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fuente ");
		this.jButtonFK_IdTipoFuenteParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoFuenteParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoFuenteParametroGeneralUsuario.setToolTipText("Buscar Por Tipo Fuente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFuenteParametroGeneralUsuario,"buscar_button","Buscar Por Tipo Fuente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFuenteParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setText("Tipo Fuente :");
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setToolTipText("Tipo Fuente");
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setToolTipText("Buscar Por Tam. Control Normal ");
		this.jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setToolTipText("Buscar Por Tam. Control Normal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario,"buscar_button","Buscar Por Tam. Control Normal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setText("Tam. Control Normal :");
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setToolTipText("Tam. Control Normal");
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setToolTipText("Buscar Por Tam. Control Relacion ");
		this.jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setToolTipText("Buscar Por Tam. Control Relacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario,"buscar_button","Buscar Por Tam. Control Relacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario = new JLabelMe();
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setText("Tam. Control Relacion :");
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setToolTipText("Tam. Control Relacion");
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUsuarioParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUsuarioParametroGeneralUsuario.setToolTipText("Buscar Por Id ");
		this.jButtonFK_IdUsuarioParametroGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdUsuarioParametroGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdUsuarioParametroGeneralUsuario.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUsuarioParametroGeneralUsuario,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUsuarioParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario = new JLabelMe();
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario.setText("Id :");
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario.setToolTipText("Id");
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroGeneralUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroGeneralUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroGeneralUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroGeneralUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroGeneralUsuario = new ParametroGeneralUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
			this.jInternalFrameDetalleFormParametroGeneralUsuario = new ParametroGeneralUsuarioDetalleFormJInternalFrame(jDesktopPane,this.parametrogeneralusuarioSessionBean.getConGuardarRelaciones(),this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroGeneralUsuario = null;//new ParametroGeneralUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneralUsuario= new GridBagLayout();
		
		
		this.jTableDatosParametroGeneralUsuario = new JTableMe();      
		
		String sToolTipParametroGeneralUsuario="";
		sToolTipParametroGeneralUsuario=ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneralUsuario+="(Seguridad.ParametroGeneralUsuario)";
		}
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneralUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroGeneralUsuario.setToolTipText(sToolTipParametroGeneralUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroGeneralUsuario);
		this.jTableDatosParametroGeneralUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosParametroGeneralUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroGeneralUsuario.setRowSelectionAllowed(true);
		this.jTableDatosParametroGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroGeneralUsuario = new JButtonMe();
		this.jButtonDuplicarParametroGeneralUsuario = new JButtonMe();
		this.jButtonCopiarParametroGeneralUsuario = new JButtonMe();
		this.jButtonVerFormParametroGeneralUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesParametroGeneralUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario = new JButtonMe();
		this.jButtonCerrarParametroGeneralUsuario = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneralUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroGeneralUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioprincipalParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovisualParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioexportarParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorecargarParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneralUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));
		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setName("jPanelCamposFinprincipalParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioprincipalParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovisualParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Visual"));
		this.jPanelCamposIniciovisualParametroGeneralUsuario.setName("jPanelCamposFinvisualParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovisualParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcional"));
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setName("jPanelCamposFinfuncionalParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciofuncionalParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioexportarParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Exportar"));
		this.jPanelCamposInicioexportarParametroGeneralUsuario.setName("jPanelCamposFinexportarParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioexportarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargar"));
		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setName("jPanelCamposFinrecargarParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorecargarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroGeneralUsuario=new ReporteDinamicoJInternalFrame(ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroGeneralUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroGeneralUsuario=new ImportacionJInternalFrame(ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroGeneralUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroGeneralUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroGeneralUsuario.setText("Orden");
		this.jButtonAbrirOrderByParametroGeneralUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneralUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralUsuario,false,this);
			
			//this.cargarOrderByParametroGeneralUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralUsuario,true,this);
			
			//this.cargarOrderByParametroGeneralUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroGeneralUsuario.setMinimumSize(new Dimension(400,50));//3130
		this.jTableDatosParametroGeneralUsuario.setMaximumSize(new Dimension(400,50));//3130
		this.jTableDatosParametroGeneralUsuario.setPreferredSize(new Dimension(400,50));//3130
		
		this.jScrollPanelDatosParametroGeneralUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneralUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneralUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroGeneralUsuario.setText("Nuevo");
		this.jButtonDuplicarParametroGeneralUsuario.setText("Duplicar");
		this.jButtonCopiarParametroGeneralUsuario.setText("Copiar");
		this.jButtonVerFormParametroGeneralUsuario.setText("Ver");
		this.jButtonNuevoRelacionesParametroGeneralUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.setText("Guardar");
		this.jButtonCerrarParametroGeneralUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneralUsuario,"nuevo_button","Nuevo",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroGeneralUsuario,"duplicar_button","Duplicar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroGeneralUsuario,"copiar_button","Copiar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroGeneralUsuario,"ver_form","Ver",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroGeneralUsuario,"nuevorelaciones_button","Nuevo Rel",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneralUsuario,"guardarcambiostabla_button","Guardar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneralUsuario,"cerrar_button","Salir",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroGeneralUsuario.setToolTipText("Nuevo"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroGeneralUsuario.setToolTipText("Duplicar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroGeneralUsuario.setToolTipText("Copiar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroGeneralUsuario.setToolTipText("Ver"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroGeneralUsuario.setToolTipText("Nuevo Rel"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.setToolTipText("Guardar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneralUsuario.setToolTipText("Salir"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneralUsuario";
		inputMap = this.jButtonNuevoParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneralUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroGeneralUsuario";
		inputMap = this.jButtonDuplicarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroGeneralUsuario"));
		
		//COPIAR
		sMapKey = "CopiarParametroGeneralUsuario";
		inputMap = this.jButtonCopiarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroGeneralUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormParametroGeneralUsuario";
		inputMap = this.jButtonVerFormParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroGeneralUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroGeneralUsuario";
		inputMap = this.jButtonNuevoRelacionesParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroGeneralUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroGeneralUsuario";
		inputMap = this.jButtonModificarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroGeneralUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneralUsuario";
		inputMap = this.jButtonCerrarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneralUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneralUsuario";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneralUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroGeneralUsuario.setName("jPanelParametrosReportesParametroGeneralUsuario"); 
		
		this.jPanelParametrosReportesAccionesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroGeneralUsuario.setName("jPanelParametrosReportesAccionesParametroGeneralUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroGeneralUsuario = new JButtonMe();
		this.jButtonRecargarInformacionParametroGeneralUsuario.setText("Recargar");
		this.jButtonRecargarInformacionParametroGeneralUsuario.setToolTipText("Recargar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroGeneralUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroGeneralUsuario = new JButtonMe();
		this.jButtonProcesarInformacionParametroGeneralUsuario.setText("Procesar");
		this.jButtonProcesarInformacionParametroGeneralUsuario.setToolTipText("Procesar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroGeneralUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionParametroGeneralUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneralUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneralUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesParametroGeneralUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroGeneralUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroGeneralUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroGeneralUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesParametroGeneralUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneralUsuario.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroGeneralUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneralUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroGeneralUsuario = new JLabelMe();
		
		this.jLabelAccionesParametroGeneralUsuario.setText("Acciones");		
		this.jLabelAccionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroGeneralUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroGeneralUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroGeneralUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroGeneralUsuario = new JButtonMe();
		//this.jButtonAnterioresParametroGeneralUsuario.setText("<<");
        this.jButtonAnterioresParametroGeneralUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroGeneralUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroGeneralUsuario = new JButtonMe();
		//this.jButtonSiguientesParametroGeneralUsuario.setText(">>");
        this.jButtonSiguientesParametroGeneralUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroGeneralUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroGeneralUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroGeneralUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroGeneralUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroGeneralUsuario,"nuevoguardarcambios_button","Nue",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroGeneralUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroGeneralUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroGeneralUsuario";
		inputMap = this.jButtonRecargarInformacionParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroGeneralUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroGeneralUsuario";
		inputMap = this.jButtonSiguientesParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroGeneralUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroGeneralUsuario";
		inputMap = this.jButtonAnterioresParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroGeneralUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroGeneralUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroGeneralUsuario.setMinimumSize(new Dimension(this.getWidth(),ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneralUsuario.setMaximumSize(new Dimension(this.getWidth(),ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneralUsuario.setPreferredSize(new Dimension(this.getWidth(),ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroGeneralUsuario = new GridBagLayout();

			this.jPanelPaginacionParametroGeneralUsuario.setLayout(gridaBagLayoutPaginacionParametroGeneralUsuario);						
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonAnterioresParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					
						
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
			
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonNuevoGuardarCambiosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
						
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonSiguientesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonNuevoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
						
			
			
			if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
				this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonGuardarCambiosTablaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			}
			
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonDuplicarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonCopiarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonVerFormParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 1;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroGeneralUsuario.add(this.jButtonCerrarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
		
		
		this.jButtonRecargarInformacionParametroGeneralUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneralUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneralUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneralUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneralUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroGeneralUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneralUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneralUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneralUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroGeneralUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneralUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneralUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroGeneralUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneralUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneralUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroGeneralUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroGeneralUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroGeneralUsuario.setLayout(gridaBagParametrosReportesParametroGeneralUsuario);
			this.jPanelParametrosReportesAccionesParametroGeneralUsuario.setLayout(gridaBagParametrosReportesAccionesParametroGeneralUsuario);
			
			
			this.jPanelParametrosAuxiliar1ParametroGeneralUsuario.setLayout(gridaBagParametrosAuxiliar1ParametroGeneralUsuario);
			this.jPanelParametrosAuxiliar2ParametroGeneralUsuario.setLayout(gridaBagParametrosAuxiliar2ParametroGeneralUsuario);
			this.jPanelParametrosAuxiliar3ParametroGeneralUsuario.setLayout(gridaBagParametrosAuxiliar3ParametroGeneralUsuario);
			this.jPanelParametrosAuxiliar4ParametroGeneralUsuario.setLayout(gridaBagParametrosAuxiliar4ParametroGeneralUsuario);
			//this.jPanelParametrosAuxiliar5ParametroGeneralUsuario.setLayout(gridaBagParametrosAuxiliar2ParametroGeneralUsuario);			
			
			
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jButtonRecargarInformacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralUsuario.add(this.jComboBoxTiposPaginacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralUsuario.add(this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralUsuario.add(this.jComboBoxTiposArchivosReportesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jPanelParametrosAuxiliar1ParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroGeneralUsuario.add(this.jComboBoxTiposReportesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jPanelParametrosAuxiliar4ParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jComboBoxTiposReportesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jCheckBoxGenerarReporteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jPanelParametrosAuxiliar2ParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jLabelAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jComboBoxTiposSeleccionarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			
			
			/*
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jCheckBoxSeleccionarTodosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneralUsuario.add(this.jCheckBoxSeleccionarTodosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);															
				
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneralUsuario.add(this.jCheckBoxSeleccionadosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jPanelParametrosAuxiliar3ParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jComboBoxTiposAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
	
				
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralUsuario.add(this.jTextFieldValorCampoGeneralParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setLayout(gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciovisualParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciovisualParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciovisualParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciofuncionalParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciofuncionalParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposInicioexportarParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioexportarParametroGeneralUsuario.setLayout(gridaBagLayoutCamposInicioexportarParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciorecargarParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciorecargarParametroGeneralUsuario);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroGeneralUsuario = new GridBagLayout();

			this.jScrollPanelDatosParametroGeneralUsuario.setLayout(gridaBagLayoutDatosParametroGeneralUsuario);
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
			
			this.jScrollPanelDatosParametroGeneralUsuario.add(this.jTableDatosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroGeneralUsuario.setViewportView(this.jTableDatosParametroGeneralUsuario);
		this.jTableDatosParametroGeneralUsuario.setFillsViewportHeight(true);
		this.jTableDatosParametroGeneralUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesParametroGeneralUsuario.setLayout(gridaBagLayoutAccionesParametroGeneralUsuario);
		
		
		/*	
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
			
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonNuevoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpresaParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdEmpresaParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdEmpresaParametroGeneralUsuario.add(jLabelid_empresaFK_IdEmpresaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdEmpresaParametroGeneralUsuario.add(jComboBoxid_empresaFK_IdEmpresaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdEmpresaParametroGeneralUsuario.add(jButtonFK_IdEmpresaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("1.-Por Empresa ", jPanelFK_IdEmpresaParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMonedaParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdMonedaParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMonedaParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMonedaParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMonedaParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMonedaParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdMonedaParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdMonedaParametroGeneralUsuario.add(jLabelid_monedaFK_IdMonedaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdMonedaParametroGeneralUsuario.add(jComboBoxid_monedaFK_IdMonedaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdMonedaParametroGeneralUsuario.add(jButtonFK_IdMonedaParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("2.-Por Moneda ", jPanelFK_IdMonedaParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDelimiterParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoDelimiterParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoDelimiterParametroGeneralUsuario.add(jLabelid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoDelimiterParametroGeneralUsuario.add(jComboBoxid_tipo_delimiterFK_IdTipoDelimiterParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoDelimiterParametroGeneralUsuario.add(jButtonFK_IdTipoDelimiterParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("3.-Por T. Delimiter ", jPanelFK_IdTipoDelimiterParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoExportarParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoExportarParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoExportarParametroGeneralUsuario.add(jLabelid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoExportarParametroGeneralUsuario.add(jComboBoxid_tipo_exportarFK_IdTipoExportarParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoExportarParametroGeneralUsuario.add(jButtonFK_IdTipoExportarParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("4.-Por T. Exportar ", jPanelFK_IdTipoExportarParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFondoParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoFondoParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoFondoParametroGeneralUsuario.add(jLabelid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoFondoParametroGeneralUsuario.add(jComboBoxid_tipo_fondoFK_IdTipoFondoParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoFondoParametroGeneralUsuario.add(jButtonFK_IdTipoFondoParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("5.-Por Tipo Fondo ", jPanelFK_IdTipoFondoParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFondoBordeParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoFondoBordeParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoFondoBordeParametroGeneralUsuario.add(jLabelid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoFondoBordeParametroGeneralUsuario.add(jComboBoxid_tipo_fondo_bordeFK_IdTipoFondoBordeParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoFondoBordeParametroGeneralUsuario.add(jButtonFK_IdTipoFondoBordeParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("6.-Por Tipo Fondo Borde ", jPanelFK_IdTipoFondoBordeParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFondoControlParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoFondoControlParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoFondoControlParametroGeneralUsuario.add(jLabelid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoFondoControlParametroGeneralUsuario.add(jComboBoxid_tipo_fondo_controlFK_IdTipoFondoControlParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoFondoControlParametroGeneralUsuario.add(jButtonFK_IdTipoFondoControlParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("7.-Por Tipo Fondo Control ", jPanelFK_IdTipoFondoControlParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFuenteParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoFuenteParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoFuenteParametroGeneralUsuario.add(jLabelid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoFuenteParametroGeneralUsuario.add(jComboBoxid_tipo_fuenteFK_IdTipoFuenteParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoFuenteParametroGeneralUsuario.add(jButtonFK_IdTipoFuenteParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("8.-Por Tipo Fuente ", jPanelFK_IdTipoFuenteParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoTamanioControlNormalParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario.add(jLabelid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario.add(jComboBoxid_tipo_tamanio_control_normalFK_IdTipoTamanioControlNormalParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario.add(jButtonFK_IdTipoTamanioControlNormalParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("9.-Por Tam. Control Normal ", jPanelFK_IdTipoTamanioControlNormalParametroGeneralUsuario);
		jTabbedPaneBusquedasParametroGeneralUsuario.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdTipoTamanioControlRelacionParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.add(jLabelid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.add(jComboBoxid_tipo_tamanio_control_relacionFK_IdTipoTamanioControlRelacionParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario.add(jButtonFK_IdTipoTamanioControlRelacionParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("10.-Por Tam. Control Relacion ", jPanelFK_IdTipoTamanioControlRelacionParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUsuarioParametroGeneralUsuario.setLayout(gridaBagLayoutFK_IdUsuarioParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		jPanelFK_IdUsuarioParametroGeneralUsuario.add(jLabelid_usuarioFK_IdUsuarioParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		gridBagConstraintsParametroGeneralUsuario.gridx = 1;
		jPanelFK_IdUsuarioParametroGeneralUsuario.add(jComboBoxid_usuarioFK_IdUsuarioParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneralUsuario.gridy = 1;
		gridBagConstraintsParametroGeneralUsuario.gridx =1;
		jPanelFK_IdUsuarioParametroGeneralUsuario.add(jButtonFK_IdUsuarioParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);

		jTabbedPaneBusquedasParametroGeneralUsuario.addTab("11.-Por Id ", jPanelFK_IdUsuarioParametroGeneralUsuario);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneralUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;		
			//this.gridBagConstraintsParametroGeneralUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneralUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;		
		//this.gridBagConstraintsParametroGeneralUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroGeneralUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;		
			this.gridBagConstraintsParametroGeneralUsuario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroGeneralUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);								
		
		
		/*
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		*/		
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx =0;
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneralUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
				
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneralUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroGeneralUsuario.setLayout(gridaBagLayoutBusquedasParametrosParametroGeneralUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroGeneralUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroGeneralUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroGeneralUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroGeneralUsuario.setName("jPanelReporteDinamicoParametroGeneralUsuario"); 
		
		this.jPanelReporteDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroGeneralUsuario.setLayout(gridaBagLayoutReporteDinamicoParametroGeneralUsuario);
		
		
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneralUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroGeneralUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroGeneralUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jLabelColumnasSelectReporteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroGeneralUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroGeneralUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroGeneralUsuario=new JScrollPane(this.jListColumnasSelectReporteParametroGeneralUsuario);
			
			this.jScrollColumnasSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jListColumnasSelectReporteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jScrollColumnasSelectReporteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroGeneralUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroGeneralUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroGeneralUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroGeneralUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroGeneralUsuario=new JScrollPane(this.jListRelacionesSelectReporteParametroGeneralUsuario);
			
			this.jScrollRelacionesSelectReporteParametroGeneralUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneralUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneralUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroGeneralUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroGeneralUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroGeneralUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jLabelGenerarExcelReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario.setToolTipText("Generar EXCEL"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jButtonGenerarExcelReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jComboBoxTiposReportesDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jLabelTiposArchivoReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroGeneralUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroGeneralUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroGeneralUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroGeneralUsuario.setToolTipText("Generar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jButtonGenerarReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroGeneralUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroGeneralUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroGeneralUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroGeneralUsuario.setToolTipText("Cancelar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralUsuario.add(this.jButtonCerrarReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroGeneralUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario= new JScrollPane(jPanelReporteDinamicoParametroGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroGeneralUsuario);
		this.jInternalFrameReporteDinamicoParametroGeneralUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroGeneralUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroGeneralUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroGeneralUsuario.setName("jPanelImportacionParametroGeneralUsuario"); 
		
		this.jPanelImportacionParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroGeneralUsuario.setLayout(gridaBagLayoutImportacionParametroGeneralUsuario);
		
		
		this.jInternalFrameImportacionParametroGeneralUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroGeneralUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroGeneralUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneralUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneralUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroGeneralUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneralUsuario.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneralUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroGeneralUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneralUsuario.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneralUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroGeneralUsuario = new JLabelMe();

		this.jLabelArchivoImportacionParametroGeneralUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneralUsuario.add(this.jLabelArchivoImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroGeneralUsuario = new JFileChooser();		
		this.jFileChooserImportacionParametroGeneralUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroGeneralUsuario = new JButtonMe();
		this.jButtonAbrirImportacionParametroGeneralUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroGeneralUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroGeneralUsuario.setToolTipText("Generar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralUsuario.add(this.jButtonAbrirImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroGeneralUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroGeneralUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneralUsuario.add(this.jLabelPathArchivoImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroGeneralUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroGeneralUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneralUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneralUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralUsuario.add(this.jTextFieldPathArchivoImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroGeneralUsuario = new JButtonMe();
		this.jButtonGenerarImportacionParametroGeneralUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroGeneralUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroGeneralUsuario.setToolTipText("Generar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralUsuario.add(this.jButtonGenerarImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroGeneralUsuario = new JButtonMe();
		this.jButtonCerrarImportacionParametroGeneralUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroGeneralUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroGeneralUsuario.setToolTipText("Cancelar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralUsuario.add(this.jButtonCerrarImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroGeneralUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroGeneralUsuario= new JScrollPane(jPanelImportacionParametroGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroGeneralUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroGeneralUsuario);
		this.jInternalFrameImportacionParametroGeneralUsuario.getContentPane().add(this.jScrollPanelImportacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroGeneralUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroGeneralUsuario = new JButtonMe();
			this.jButtonAbrirOrderByParametroGeneralUsuario.setText("Orden");
			this.jButtonAbrirOrderByParametroGeneralUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneralUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroGeneralUsuario";
			inputMap = this.jButtonAbrirOrderByParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroGeneralUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroGeneralUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroGeneralUsuario.setName("jPanelOrderByParametroGeneralUsuario"); 
			
			this.jPanelOrderByParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroGeneralUsuario.setLayout(gridaBagLayoutOrderByParametroGeneralUsuario);
			
			
			this.jTableDatosParametroGeneralUsuarioOrderBy = new JTableMe();        
			this.jTableDatosParametroGeneralUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroGeneralUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroGeneralUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroGeneralUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroGeneralUsuarioOrderBy.setViewportView(this.jTableDatosParametroGeneralUsuarioOrderBy);
			this.jTableDatosParametroGeneralUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroGeneralUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroGeneralUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroGeneralUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroGeneralUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroGeneralUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroGeneralUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroGeneralUsuario.setTitle("Orden");
			this.jInternalFrameOrderByParametroGeneralUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroGeneralUsuario.setResizable(true);
			this.jInternalFrameOrderByParametroGeneralUsuario.setClosable(true);
			this.jInternalFrameOrderByParametroGeneralUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroGeneralUsuario.ipady =150;
				
			this.jPanelOrderByParametroGeneralUsuario.add(jScrollPanelDatosParametroGeneralUsuarioOrderBy, this.gridBagConstraintsParametroGeneralUsuario);//this.jTableDatosParametroGeneralUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroGeneralUsuario = new JButtonMe();
			this.jButtonCerrarOrderByParametroGeneralUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroGeneralUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroGeneralUsuario.setToolTipText("Cancelar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroGeneralUsuario.add(this.jButtonCerrarOrderByParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroGeneralUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroGeneralUsuario= new JScrollPane(jPanelOrderByParametroGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroGeneralUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroGeneralUsuario);
			
			this.jInternalFrameOrderByParametroGeneralUsuario.getContentPane().add(this.jScrollPanelOrderByParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
		
		} else {
			this.jButtonAbrirOrderByParametroGeneralUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//6330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrogeneralusuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroGeneralUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroGeneralUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroGeneralUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroGeneralUsuario.getRowHeight();//ParametroGeneralUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.isSelected()) {
					iHeightTable=ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneralUsuario.isSelected()) {
					iHeightTable=ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroGeneralUsuario!=null && this.jInternalFrameOrderByParametroGeneralUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroGeneralUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroGeneralUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroGeneralUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroGeneralUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroGeneralUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroGeneralUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroGeneralUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrogeneralusuarioLogic.getParametroGeneralUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogeneralusuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroGeneralUsuario> TraerParametroGeneralUsuarioBeans(List<ParametroGeneralUsuario> parametrogeneralusuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
					
				if(!(ParametroGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrogeneralusuario.setsDetalleGeneralEntityReporte(ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioDescripcion(parametrogeneralusuario));
										
					parametrogeneralusuario.setcon_tamanio_control_manual_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_tamanio_control_manualDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_tamanio_control_todo_relacion_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_tamanio_control_todo_relacionDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_guardar_relaciones_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_guardar_relacionesDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_mensaje_confirmacion_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_mensaje_confirmacionDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_botones_tool_bar_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_botones_tool_barDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_mostrar_acciones_campo_general_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_mostrar_acciones_campo_generalDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_mostrar_acciones_campo_relaciones_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_mostrar_acciones_campo_relacionesDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_exportar_cabecera_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_exportar_cabeceraDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_exportar_campo_version_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_exportar_campo_versionDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_precargar_ventanas_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_precargar_ventanasDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_precargar_por_usuario_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_precargar_por_usuarioDescripcion(parametrogeneralusuario));parametrogeneralusuario.setcon_cargar_por_parte_descripcion(ParametroGeneralUsuarioConstantesFunciones.getcon_cargar_por_parteDescripcion(parametrogeneralusuario));	
					
						
					
				} else  {
							
					//parametrogeneralusuario.setsDetalleGeneralEntityReporte(parametrogeneralusuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrogeneralusuariobeans.add(parametrogeneralusuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrogeneralusuarios;
    }
	//PARA REPORTES FIN
}
