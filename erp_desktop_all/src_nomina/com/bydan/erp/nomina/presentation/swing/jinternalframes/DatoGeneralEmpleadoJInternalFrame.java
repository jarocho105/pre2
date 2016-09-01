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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.nomina.util.DatoGeneralEmpleadoConstantesFunciones;

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
public class DatoGeneralEmpleadoJInternalFrame extends DatoGeneralEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDatoGeneralEmpleado;
	
	protected JMenuBar jmenuBarDatoGeneralEmpleado;
	
	protected JMenu jmenuDatoGeneralEmpleado;
	protected JMenu jmenuDatosDatoGeneralEmpleado;
	protected JMenu jmenuArchivoDatoGeneralEmpleado;
	protected JMenu jmenuAccionesDatoGeneralEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoGeneralEmpleado;	
	protected GridBagConstraints gridBagConstraintsDatoGeneralEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormDatoGeneralEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDatoGeneralEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDatoGeneralEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoafiliacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoLibretaMiliBeanSwingJInternalFrame tipolibretamiliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolibretamili="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected TipoSangreBeanSwingJInternalFrame tiposangreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposangre="";
	
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;
		
	
	
	public EmpleadoSessionBean empleadoSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoLibretaMiliSessionBean tipolibretamiliSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public TipoSangreSessionBean tiposangreSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DatoGeneralEmpleado> datogeneralempleados;		
	public List<DatoGeneralEmpleado> datogeneralempleadosEliminados;	
	public List<DatoGeneralEmpleado> datogeneralempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDatoGeneralEmpleado;		
	protected JButton jButtonAbrirOrderByDatoGeneralEmpleado;
	
	
	//protected JPanel jPanelOrderByDatoGeneralEmpleado;
	//public JScrollPane jScrollPanelOrderByDatoGeneralEmpleado;	
	//protected JButton jButtonCerrarOrderByDatoGeneralEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDatoGeneralEmpleado;
	public JScrollPane jScrollPanelDatosEdicionDatoGeneralEmpleado;
	public JScrollPane jScrollPanelDatosGeneralDatoGeneralEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosDatoGeneralEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDatoGeneralEmpleado;
	//public JScrollPane jScrollPanelImportacionDatoGeneralEmpleado;
	
	
	
	protected JPanel jPanelAccionesDatoGeneralEmpleado;
	
    protected JPanel jPanelPaginacionDatoGeneralEmpleado;
    protected JPanel jPanelParametrosReportesDatoGeneralEmpleado;
	protected JPanel jPanelParametrosReportesAccionesDatoGeneralEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DatoGeneralEmpleado;
	protected JPanel jPanelParametrosAuxiliar2DatoGeneralEmpleado;
	protected JPanel jPanelParametrosAuxiliar3DatoGeneralEmpleado;
	protected JPanel jPanelParametrosAuxiliar4DatoGeneralEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5DatoGeneralEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoDatoGeneralEmpleado;
	//protected JPanel jPanelImportacionDatoGeneralEmpleado;
	
	
	public JTable jTableDatosDatoGeneralEmpleado;
	
	
	
	//public JTable jTableDatosDatoGeneralEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDatoGeneralEmpleado;
	protected JButton jButtonDuplicarDatoGeneralEmpleado;
	protected JButton jButtonCopiarDatoGeneralEmpleado;
	protected JButton jButtonVerFormDatoGeneralEmpleado;
	protected JButton jButtonNuevoRelacionesDatoGeneralEmpleado;
	protected JButton jButtonModificarDatoGeneralEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaDatoGeneralEmpleado;
	protected JButton jButtonCerrarDatoGeneralEmpleado;
	
	
	protected JButton jButtonRecargarInformacionDatoGeneralEmpleado;
	protected JButton jButtonProcesarInformacionDatoGeneralEmpleado;
	
	
	protected JButton jButtonAnterioresDatoGeneralEmpleado;
	protected JButton jButtonSiguientesDatoGeneralEmpleado;
	protected JButton jButtonNuevoGuardarCambiosDatoGeneralEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDatoGeneralEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoDatoGeneralEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionDatoGeneralEmpleado;
	//protected JButton jButtonGenerarImportacionDatoGeneralEmpleado;
	//protected JButton jButtonCerrarImportacionDatoGeneralEmpleado;
	//protected JFileChooser jFileChooserImportacionDatoGeneralEmpleado;
	//protected File fileImportacionDatoGeneralEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoGeneralEmpleado;
	protected JButton jButtonDuplicarToolBarDatoGeneralEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarDatoGeneralEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarDatoGeneralEmpleado;
	protected JButton jButtonCopiarToolBarDatoGeneralEmpleado;
	protected JButton jButtonVerFormToolBarDatoGeneralEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarDatoGeneralEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoGeneralEmpleado;
	protected JButton jButtonCerrarToolBarDatoGeneralEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarDatoGeneralEmpleado;
	protected JButton jButtonProcesarInformacionToolBarDatoGeneralEmpleado;
	protected JButton jButtonAnterioresToolBarDatoGeneralEmpleado;
	protected JButton jButtonSiguientesToolBarDatoGeneralEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarDatoGeneralEmpleado;
	protected JButton jButtonAbrirOrderByToolBarDatoGeneralEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDuplicarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesDatoGeneralEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDatoGeneralEmpleado;
	protected JMenuItem jMenuItemCopiarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemVerFormDatoGeneralEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoGeneralEmpleado;
	protected JMenuItem jMenuItemCerrarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoGeneralEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionDatoGeneralEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionDatoGeneralEmpleado;
	protected JMenuItem jMenuItemAnterioresDatoGeneralEmpleado;
	protected JMenuItem jMenuItemSiguientesDatoGeneralEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByDatoGeneralEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarDatoGeneralEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoGeneralEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDatoGeneralEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosDatoGeneralEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDatoGeneralEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDatoGeneralEmpleado;
	protected JTextField jTextFieldValorCampoGeneralDatoGeneralEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDatoGeneralEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteDatoGeneralEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteDatoGeneralEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteDatoGeneralEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteDatoGeneralEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteDatoGeneralEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDatoGeneralEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDatoGeneralEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionDatoGeneralEmpleado;	
	//public JLabel jLabelPathArchivoImportacionDatoGeneralEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionDatoGeneralEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDatoGeneralEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorDatoGeneralEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDatoGeneralEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoDatoGeneralEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoDatoGeneralEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoDatoGeneralEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDatoGeneralEmpleado;
	public JPanel jPanelFK_IdBancoDatoGeneralEmpleado;
	public JButton jButtonFK_IdBancoDatoGeneralEmpleado;
	public JPanel jPanelFK_IdCantonDatoGeneralEmpleado;
	public JButton jButtonFK_IdCantonDatoGeneralEmpleado;
	public JPanel jPanelFK_IdEmpleadoDatoGeneralEmpleado;
	public JButton jButtonFK_IdEmpleadoDatoGeneralEmpleado;
	public JPanel jPanelFK_IdNumeroPatronalDatoGeneralEmpleado;
	public JButton jButtonFK_IdNumeroPatronalDatoGeneralEmpleado;
	public JPanel jPanelFK_IdPaisDatoGeneralEmpleado;
	public JButton jButtonFK_IdPaisDatoGeneralEmpleado;
	public JPanel jPanelFK_IdParroquiaDatoGeneralEmpleado;
	public JButton jButtonFK_IdParroquiaDatoGeneralEmpleado;
	public JPanel jPanelFK_IdProvinciaDatoGeneralEmpleado;
	public JButton jButtonFK_IdProvinciaDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoContratoDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoContratoDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado;
	public JPanel jPanelFK_IdTipoSangreDatoGeneralEmpleado;
	public JButton jButtonFK_IdTipoSangreDatoGeneralEmpleado;
	
	public JPanel jPanelid_bancoFK_IdBancoDatoGeneralEmpleado;
	public JLabel jLabelid_bancoFK_IdBancoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado;
	public JButton jButtonid_bancoFK_IdBancoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cantonFK_IdCantonDatoGeneralEmpleado;
	public JLabel jLabelid_cantonFK_IdCantonDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado;
	public JButton jButtonid_cantonFK_IdCantonDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado;
	public JLabel jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado;
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisDatoGeneralEmpleado;
	public JLabel jLabelid_paisFK_IdPaisDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado;
	public JButton jButtonid_paisFK_IdPaisDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado;
	public JLabel jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado;
	public JButton jButtonid_parroquiaFK_IdParroquiaDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaDatoGeneralEmpleado;
	public JLabel jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado;
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado;
	public JButton jButtonid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado;
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado;
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado;
	public JButton jButtonid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado;
	public JButton jButtonid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DatoGeneralEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDatoGeneralEmpleado)	{
		this.jButtonRecargarInformacionDatoGeneralEmpleado = jButtonRecargarInformacionDatoGeneralEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionDatoGeneralEmpleado() {
		return this.jButtonProcesarInformacionDatoGeneralEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoGeneralEmpleado)	{
		this.jButtonProcesarInformacionDatoGeneralEmpleado = jButtonProcesarInformacionDatoGeneralEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionDatoGeneralEmpleado() {
		return this.jButtonRecargarInformacionDatoGeneralEmpleado;
	}
	
	
	public List<DatoGeneralEmpleado> getdatogeneralempleados() {
		return this.datogeneralempleados;
	}

	public void setdatogeneralempleados(List<DatoGeneralEmpleado> datogeneralempleados) {
		this.datogeneralempleados = datogeneralempleados;
	}
	
	public List<DatoGeneralEmpleado> getdatogeneralempleadosAux() {
		return this.datogeneralempleadosAux;
	}

	public void setdatogeneralempleadosAux(List<DatoGeneralEmpleado> datogeneralempleadosAux) {
		this.datogeneralempleadosAux = datogeneralempleadosAux;
	}
	
	public List<DatoGeneralEmpleado> getdatogeneralempleadosEliminados() {
		return this.datogeneralempleadosEliminados;
	}

	public void setDatoGeneralEmpleadosEliminados(List<DatoGeneralEmpleado> datogeneralempleadosEliminados) {
		this.datogeneralempleadosEliminados = datogeneralempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDatoGeneralEmpleado() {
		return jComboBoxTiposSeleccionarDatoGeneralEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDatoGeneralEmpleado(
			JComboBox jComboBoxTiposSeleccionarDatoGeneralEmpleado) {
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado = jComboBoxTiposSeleccionarDatoGeneralEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDatoGeneralEmpleado() {
		return jTextFieldValorCampoGeneralDatoGeneralEmpleado;
	}

	public void setjTextFieldValorCampoGeneralDatoGeneralEmpleado(
			JTextField jTextFieldValorCampoGeneralDatoGeneralEmpleado) {
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado = jTextFieldValorCampoGeneralDatoGeneralEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDatoGeneralEmpleado() {
		return this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosDatoGeneralEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosDatoGeneralEmpleado) {
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado = jCheckBoxSeleccionarTodosDatoGeneralEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDatoGeneralEmpleado() {
		return this.jCheckBoxSeleccionadosDatoGeneralEmpleado;
	}

	public void setjCheckBoxSeleccionadosDatoGeneralEmpleado(
			JCheckBox jCheckBoxSeleccionadosDatoGeneralEmpleado) {
		this.jCheckBoxSeleccionadosDatoGeneralEmpleado = jCheckBoxSeleccionadosDatoGeneralEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDatoGeneralEmpleado() {
		return this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposArchivosReportesDatoGeneralEmpleado) {
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado = jComboBoxTiposArchivosReportesDatoGeneralEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDatoGeneralEmpleado() {
		return this.jComboBoxTiposReportesDatoGeneralEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposReportesDatoGeneralEmpleado) {
		this.jComboBoxTiposReportesDatoGeneralEmpleado = jComboBoxTiposReportesDatoGeneralEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDatoGeneralEmpleado() {
	//	return jComboBoxTiposReportesDinamicoDatoGeneralEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDatoGeneralEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoDatoGeneralEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado = jComboBoxTiposReportesDinamicoDatoGeneralEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado = jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDatoGeneralEmpleado() {
		return this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposGraficosReportesDatoGeneralEmpleado) {
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado = jComboBoxTiposGraficosReportesDatoGeneralEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDatoGeneralEmpleado() {
		return this.jComboBoxTiposPaginacionDatoGeneralEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDatoGeneralEmpleado(
			JComboBox jComboBoxTiposPaginacionDatoGeneralEmpleado) {
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado = jComboBoxTiposPaginacionDatoGeneralEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDatoGeneralEmpleado() {
		return this.jComboBoxTiposRelacionesDatoGeneralEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoGeneralEmpleado() {
		return this.jComboBoxTiposAccionesDatoGeneralEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposRelacionesDatoGeneralEmpleado) {
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado = jComboBoxTiposRelacionesDatoGeneralEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposAccionesDatoGeneralEmpleado) {
		this.jComboBoxTiposAccionesDatoGeneralEmpleado = jComboBoxTiposAccionesDatoGeneralEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDatoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDatoGeneralEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDatoGeneralEmpleado() {
	//	return jCheckBoxConGraficoDinamicoDatoGeneralEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoDatoGeneralEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoDatoGeneralEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado = jCheckBoxConGraficoDinamicoDatoGeneralEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDatoGeneralEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDatoGeneralEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado .setBorder(borderResaltar);		
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
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datogeneralempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoGeneralEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato General Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDatoGeneralEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"nuevo","nuevo","Nuevo"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"duplicar","duplicar","Duplicar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"copiar","copiar","Copiar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"ver_form","ver_form","Ver"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"recargar","recargar","Recargar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDatoGeneralEmpleado,this.jTtoolBarDatoGeneralEmpleado,
							"cerrar","cerrar","Salir"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDatoGeneralEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDatoGeneralEmpleado;
			
				this.jButtonProcesarInformacionToolBarDatoGeneralEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDatoGeneralEmpleado;
				
		//protected JButton jButtonModificarToolBarDatoGeneralEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDatoGeneralEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDatoGeneralEmpleado=new JMenuMe("General");
		this.jmenuArchivoDatoGeneralEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesDatoGeneralEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosDatoGeneralEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoGeneralEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoGeneralEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoGeneralEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDatoGeneralEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDatoGeneralEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDatoGeneralEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDatoGeneralEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDatoGeneralEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDatoGeneralEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDatoGeneralEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoGeneralEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoGeneralEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDatoGeneralEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDatoGeneralEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDatoGeneralEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDatoGeneralEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDatoGeneralEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDatoGeneralEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDatoGeneralEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDatoGeneralEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDatoGeneralEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoGeneralEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoGeneralEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoGeneralEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDatoGeneralEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDatoGeneralEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDatoGeneralEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDatoGeneralEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDatoGeneralEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDatoGeneralEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDatoGeneralEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDatoGeneralEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDatoGeneralEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDatoGeneralEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDatoGeneralEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDatoGeneralEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDatoGeneralEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDatoGeneralEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDatoGeneralEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoGeneralEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoGeneralEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoGeneralEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDatoGeneralEmpleado.add(this.jMenuItemCerrarDatoGeneralEmpleado);
			
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemNuevoDatoGeneralEmpleado);
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado);
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemNuevoRelacionesDatoGeneralEmpleado);
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemGuardarCambiosTablaDatoGeneralEmpleado);		
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemDuplicarDatoGeneralEmpleado);		
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemCopiarDatoGeneralEmpleado);		
			this.jmenuAccionesDatoGeneralEmpleado.add(this.jMenuItemVerFormDatoGeneralEmpleado);		
			
			this.jmenuDatosDatoGeneralEmpleado.add(this.jMenuItemRecargarInformacionDatoGeneralEmpleado);				
			this.jmenuDatosDatoGeneralEmpleado.add(this.jMenuItemAnterioresDatoGeneralEmpleado);				
			this.jmenuDatosDatoGeneralEmpleado.add(this.jMenuItemSiguientesDatoGeneralEmpleado);				
			this.jmenuDatosDatoGeneralEmpleado.add(this.jMenuItemAbrirOrderByDatoGeneralEmpleado);				
			this.jmenuDatosDatoGeneralEmpleado.add(this.jMenuItemMostrarOcultarDatoGeneralEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDatoGeneralEmpleado.add(this.jMenuItemGuardarCambiosDatoGeneralEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDatoGeneralEmpleado.add(this.jmenuArchivoDatoGeneralEmpleado);		
			this.jmenuBarDatoGeneralEmpleado.add(this.jmenuAccionesDatoGeneralEmpleado);		
			this.jmenuBarDatoGeneralEmpleado.add(this.jmenuDatosDatoGeneralEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDatoGeneralEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDatoGeneralEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoDatoGeneralEmpleado.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdBancoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdBancoDatoGeneralEmpleado.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoDatoGeneralEmpleado,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado = new JLabelMe();
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado.setText("Banco :");
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCantonDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCantonDatoGeneralEmpleado.setToolTipText("Buscar Por Canton ");
		this.jButtonFK_IdCantonDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdCantonDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdCantonDatoGeneralEmpleado.setToolTipText("Buscar Por Canton ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCantonDatoGeneralEmpleado,"buscar_button","Buscar Por Canton ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCantonDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado = new JLabelMe();
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado.setText("Canton :");
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado.setToolTipText("Canton");
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cantonFK_IdCantonDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoDatoGeneralEmpleado.setToolTipText("Buscar Por  ");
		this.jButtonFK_IdEmpleadoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoDatoGeneralEmpleado.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoDatoGeneralEmpleado,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setText(" :");
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setToolTipText("");
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNumeroPatronalDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNumeroPatronalDatoGeneralEmpleado.setToolTipText("Buscar Por Numero Patronal ");
		this.jButtonFK_IdNumeroPatronalDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdNumeroPatronalDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdNumeroPatronalDatoGeneralEmpleado.setToolTipText("Buscar Por Numero Patronal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNumeroPatronalDatoGeneralEmpleado,"buscar_button","Buscar Por Numero Patronal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNumeroPatronalDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado = new JLabelMe();
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setText("Numero Patronal :");
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisDatoGeneralEmpleado.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdPaisDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdPaisDatoGeneralEmpleado.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisDatoGeneralEmpleado,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado = new JLabelMe();
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado.setText("Pais :");
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParroquiaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParroquiaDatoGeneralEmpleado.setToolTipText("Buscar Por Parroquia ");
		this.jButtonFK_IdParroquiaDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdParroquiaDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdParroquiaDatoGeneralEmpleado.setToolTipText("Buscar Por Parroquia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParroquiaDatoGeneralEmpleado,"buscar_button","Buscar Por Parroquia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParroquiaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado = new JLabelMe();
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setText("Parroquia :");
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setToolTipText("Parroquia");
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaDatoGeneralEmpleado.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdProvinciaDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdProvinciaDatoGeneralEmpleado.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaDatoGeneralEmpleado,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Afiliacion ");
		this.jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Afiliacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Afiliacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setText("Tipo Afiliacion :");
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setToolTipText("Tipo Afiliacion");
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoContratoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoContratoDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Contrato ");
		this.jButtonFK_IdTipoContratoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoContratoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoContratoDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Contrato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoContratoDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Contrato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoContratoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setText("Tipo Contrato :");
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setToolTipText("Tipo Contrato");
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		this.jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Cuenta Banco Global ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setText("Tipo Cuenta Banco Global :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setToolTipText("Tipo Cuenta Banco Global");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Grupo Forma Pago ");
		this.jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Grupo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Grupo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setText("Tipo Grupo Forma Pago :");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setToolTipText("Tipo Grupo Forma Pago");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Libreta Mili ");
		this.jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Libreta Mili ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Libreta Mili ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setText("Tipo Libreta Mili :");
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setToolTipText("Tipo Libreta Mili");
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoSangreDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoSangreDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Sangre ");
		this.jButtonFK_IdTipoSangreDatoGeneralEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoSangreDatoGeneralEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoSangreDatoGeneralEmpleado.setToolTipText("Buscar Por Tipo Sangre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoSangreDatoGeneralEmpleado,"buscar_button","Buscar Por Tipo Sangre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoSangreDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado = new JLabelMe();
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setText("Tipo Sangre :");
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setToolTipText("Tipo Sangre");
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDatoGeneralEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasDatoGeneralEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDatoGeneralEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDatoGeneralEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDatoGeneralEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDatoGeneralEmpleado = new DatoGeneralEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dato General Empleado DATOS");
			this.jInternalFrameDetalleFormDatoGeneralEmpleado = new DatoGeneralEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.datogeneralempleadoSessionBean.getConGuardarRelaciones(),this.datogeneralempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDatoGeneralEmpleado = null;//new DatoGeneralEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoGeneralEmpleado= new GridBagLayout();
		
		
		this.jTableDatosDatoGeneralEmpleado = new JTableMe();      
		
		String sToolTipDatoGeneralEmpleado="";
		sToolTipDatoGeneralEmpleado=DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoGeneralEmpleado+="(Nomina.DatoGeneralEmpleado)";
		}
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoGeneralEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDatoGeneralEmpleado.setToolTipText(sToolTipDatoGeneralEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDatoGeneralEmpleado);
		this.jTableDatosDatoGeneralEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosDatoGeneralEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDatoGeneralEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosDatoGeneralEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDatoGeneralEmpleado = new JButtonMe();
		this.jButtonDuplicarDatoGeneralEmpleado = new JButtonMe();
		this.jButtonCopiarDatoGeneralEmpleado = new JButtonMe();
		this.jButtonVerFormDatoGeneralEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesDatoGeneralEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado = new JButtonMe();
		this.jButtonCerrarDatoGeneralEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosDatoGeneralEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralDatoGeneralEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dato General Empleado";
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoGeneralEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoGeneralEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesDatoGeneralEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDatoGeneralEmpleado=new ReporteDinamicoJInternalFrame(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDatoGeneralEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDatoGeneralEmpleado=new ImportacionJInternalFrame(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDatoGeneralEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDatoGeneralEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByDatoGeneralEmpleado.setText("Orden");
		this.jButtonAbrirOrderByDatoGeneralEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoGeneralEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoGeneralEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralEmpleado,false,this);
			
			//this.cargarOrderByDatoGeneralEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoGeneralEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralEmpleado,true,this);
			
			//this.cargarOrderByDatoGeneralEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDatoGeneralEmpleado.setMinimumSize(new Dimension(400,50));//3830
		this.jTableDatosDatoGeneralEmpleado.setMaximumSize(new Dimension(400,50));//3830
		this.jTableDatosDatoGeneralEmpleado.setPreferredSize(new Dimension(400,50));//3830
		
		this.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDatoGeneralEmpleado.setText("Nuevo");
		this.jButtonDuplicarDatoGeneralEmpleado.setText("Duplicar");
		this.jButtonCopiarDatoGeneralEmpleado.setText("Copiar");
		this.jButtonVerFormDatoGeneralEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesDatoGeneralEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.setText("Guardar");
		this.jButtonCerrarDatoGeneralEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoGeneralEmpleado,"nuevo_button","Nuevo",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDatoGeneralEmpleado,"duplicar_button","Duplicar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDatoGeneralEmpleado,"copiar_button","Copiar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDatoGeneralEmpleado,"ver_form","Ver",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDatoGeneralEmpleado,"nuevorelaciones_button","Nuevo Rel",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoGeneralEmpleado,"guardarcambiostabla_button","Guardar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoGeneralEmpleado,"cerrar_button","Salir",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDatoGeneralEmpleado.setToolTipText("Nuevo"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDatoGeneralEmpleado.setToolTipText("Duplicar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDatoGeneralEmpleado.setToolTipText("Copiar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDatoGeneralEmpleado.setToolTipText("Ver"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDatoGeneralEmpleado.setToolTipText("Nuevo Rel"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.setToolTipText("Guardar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoGeneralEmpleado.setToolTipText("Salir"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoGeneralEmpleado";
		inputMap = this.jButtonNuevoDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoGeneralEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoGeneralEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarDatoGeneralEmpleado";
		inputMap = this.jButtonDuplicarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDatoGeneralEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDatoGeneralEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarDatoGeneralEmpleado";
		inputMap = this.jButtonCopiarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDatoGeneralEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDatoGeneralEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormDatoGeneralEmpleado";
		inputMap = this.jButtonVerFormDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDatoGeneralEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDatoGeneralEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDatoGeneralEmpleado";
		inputMap = this.jButtonNuevoRelacionesDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDatoGeneralEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDatoGeneralEmpleado";
		inputMap = this.jButtonModificarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDatoGeneralEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDatoGeneralEmpleado";
		inputMap = this.jButtonCerrarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoGeneralEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoGeneralEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoGeneralEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDatoGeneralEmpleado.setName("jPanelParametrosReportesDatoGeneralEmpleado"); 
		
		this.jPanelParametrosReportesAccionesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDatoGeneralEmpleado.setName("jPanelParametrosReportesAccionesDatoGeneralEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDatoGeneralEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionDatoGeneralEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionDatoGeneralEmpleado.setToolTipText("Recargar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDatoGeneralEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDatoGeneralEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setToolTipText("Procesar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoGeneralEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesDatoGeneralEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDatoGeneralEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDatoGeneralEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoGeneralEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDatoGeneralEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoGeneralEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDatoGeneralEmpleado = new JLabelMe();
		
		this.jLabelAccionesDatoGeneralEmpleado.setText("Acciones");		
		this.jLabelAccionesDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDatoGeneralEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDatoGeneralEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDatoGeneralEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDatoGeneralEmpleado = new JButtonMe();
		//this.jButtonAnterioresDatoGeneralEmpleado.setText("<<");
        this.jButtonAnterioresDatoGeneralEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDatoGeneralEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDatoGeneralEmpleado = new JButtonMe();
		//this.jButtonSiguientesDatoGeneralEmpleado.setText(">>");
        this.jButtonSiguientesDatoGeneralEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDatoGeneralEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado,"nuevoguardarcambios_button","Nue",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDatoGeneralEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDatoGeneralEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDatoGeneralEmpleado";
		inputMap = this.jButtonRecargarInformacionDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDatoGeneralEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDatoGeneralEmpleado";
		inputMap = this.jButtonSiguientesDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDatoGeneralEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDatoGeneralEmpleado";
		inputMap = this.jButtonAnterioresDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDatoGeneralEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDatoGeneralEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDatoGeneralEmpleado.setMinimumSize(new Dimension(this.getWidth(),DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoGeneralEmpleado.setMaximumSize(new Dimension(this.getWidth(),DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoGeneralEmpleado.setPreferredSize(new Dimension(this.getWidth(),DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDatoGeneralEmpleado = new GridBagLayout();

			this.jPanelPaginacionDatoGeneralEmpleado.setLayout(gridaBagLayoutPaginacionDatoGeneralEmpleado);						
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonAnterioresDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					
						
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
			
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonNuevoGuardarCambiosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
						
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonSiguientesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonNuevoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
						
			
			
			if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
				this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonGuardarCambiosTablaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			}
			
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonDuplicarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonCopiarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonVerFormDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDatoGeneralEmpleado.add(this.jButtonCerrarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		
		this.jButtonRecargarInformacionDatoGeneralEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoGeneralEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoGeneralEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDatoGeneralEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoGeneralEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoGeneralEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoGeneralEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDatoGeneralEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoGeneralEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoGeneralEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDatoGeneralEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDatoGeneralEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DatoGeneralEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DatoGeneralEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DatoGeneralEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DatoGeneralEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDatoGeneralEmpleado.setLayout(gridaBagParametrosReportesDatoGeneralEmpleado);
			this.jPanelParametrosReportesAccionesDatoGeneralEmpleado.setLayout(gridaBagParametrosReportesAccionesDatoGeneralEmpleado);
			
			
			this.jPanelParametrosAuxiliar1DatoGeneralEmpleado.setLayout(gridaBagParametrosAuxiliar1DatoGeneralEmpleado);
			this.jPanelParametrosAuxiliar2DatoGeneralEmpleado.setLayout(gridaBagParametrosAuxiliar2DatoGeneralEmpleado);
			this.jPanelParametrosAuxiliar3DatoGeneralEmpleado.setLayout(gridaBagParametrosAuxiliar3DatoGeneralEmpleado);
			this.jPanelParametrosAuxiliar4DatoGeneralEmpleado.setLayout(gridaBagParametrosAuxiliar4DatoGeneralEmpleado);
			//this.jPanelParametrosAuxiliar5DatoGeneralEmpleado.setLayout(gridaBagParametrosAuxiliar2DatoGeneralEmpleado);			
			
			
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jButtonRecargarInformacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralEmpleado.add(this.jComboBoxTiposPaginacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralEmpleado.add(this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralEmpleado.add(this.jComboBoxTiposArchivosReportesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jPanelParametrosAuxiliar1DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DatoGeneralEmpleado.add(this.jComboBoxTiposReportesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);																		
			
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DatoGeneralEmpleado.add(this.jComboBoxTiposGraficosReportesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jPanelParametrosAuxiliar4DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jComboBoxTiposReportesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jCheckBoxGenerarReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jPanelParametrosAuxiliar2DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jLabelAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jComboBoxTiposSeleccionarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
			
			
			/*
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jCheckBoxConGraficoReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoGeneralEmpleado.add(this.jCheckBoxSeleccionarTodosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);															
				
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoGeneralEmpleado.add(this.jCheckBoxSeleccionadosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);															
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoGeneralEmpleado.add(this.jCheckBoxConGraficoReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jPanelParametrosAuxiliar3DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralEmpleado.add(this.jComboBoxTiposAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDatoGeneralEmpleado = new GridBagLayout();

			this.jScrollPanelDatosDatoGeneralEmpleado.setLayout(gridaBagLayoutDatosDatoGeneralEmpleado);
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
			
			this.jScrollPanelDatosDatoGeneralEmpleado.add(this.jTableDatosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDatoGeneralEmpleado.setViewportView(this.jTableDatosDatoGeneralEmpleado);
		this.jTableDatosDatoGeneralEmpleado.setFillsViewportHeight(true);
		this.jTableDatosDatoGeneralEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoGeneralEmpleado= new GridBagLayout();
		this.jPanelAccionesDatoGeneralEmpleado.setLayout(gridaBagLayoutAccionesDatoGeneralEmpleado);
		
		
		/*	
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
			
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonNuevoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdBancoDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdBancoDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdBancoDatoGeneralEmpleado.add(jLabelid_bancoFK_IdBancoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdBancoDatoGeneralEmpleado.add(jComboBoxid_bancoFK_IdBancoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdBancoDatoGeneralEmpleado.add(jButtonFK_IdBancoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("1.-Por Banco ", jPanelFK_IdBancoDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCantonDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdCantonDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCantonDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCantonDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCantonDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCantonDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdCantonDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdCantonDatoGeneralEmpleado.add(jLabelid_cantonFK_IdCantonDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdCantonDatoGeneralEmpleado.add(jComboBoxid_cantonFK_IdCantonDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdCantonDatoGeneralEmpleado.add(jButtonFK_IdCantonDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("2.-Por Canton ", jPanelFK_IdCantonDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoDatoGeneralEmpleado.add(jLabelid_empleadoFK_IdEmpleadoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoDatoGeneralEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdEmpleadoDatoGeneralEmpleado.add(jButtonFK_IdEmpleadoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("3.-Por  ", jPanelFK_IdEmpleadoDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNumeroPatronalDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdNumeroPatronalDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdNumeroPatronalDatoGeneralEmpleado.add(jLabelid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdNumeroPatronalDatoGeneralEmpleado.add(jComboBoxid_numero_patronalFK_IdNumeroPatronalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdNumeroPatronalDatoGeneralEmpleado.add(jButtonFK_IdNumeroPatronalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("4.-Por Numero Patronal ", jPanelFK_IdNumeroPatronalDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPaisDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdPaisDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdPaisDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdPaisDatoGeneralEmpleado.add(jLabelid_paisFK_IdPaisDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdPaisDatoGeneralEmpleado.add(jComboBoxid_paisFK_IdPaisDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdPaisDatoGeneralEmpleado.add(jButtonFK_IdPaisDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("5.-Por Pais ", jPanelFK_IdPaisDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParroquiaDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdParroquiaDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdParroquiaDatoGeneralEmpleado.add(jLabelid_parroquiaFK_IdParroquiaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdParroquiaDatoGeneralEmpleado.add(jComboBoxid_parroquiaFK_IdParroquiaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdParroquiaDatoGeneralEmpleado.add(jButtonFK_IdParroquiaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("6.-Por Parroquia ", jPanelFK_IdParroquiaDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdProvinciaDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdProvinciaDatoGeneralEmpleado.add(jLabelid_provinciaFK_IdProvinciaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdProvinciaDatoGeneralEmpleado.add(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdProvinciaDatoGeneralEmpleado.add(jButtonFK_IdProvinciaDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("7.-Por Provincia ", jPanelFK_IdProvinciaDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoAfiliacionDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado.add(jLabelid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado.add(jComboBoxid_tipo_afiliacionFK_IdTipoAfiliacionDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado.add(jButtonFK_IdTipoAfiliacionDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("8.-Por Tipo Afiliacion ", jPanelFK_IdTipoAfiliacionDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoContratoDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoContratoDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoContratoDatoGeneralEmpleado.add(jLabelid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoContratoDatoGeneralEmpleado.add(jComboBoxid_tipo_contratoFK_IdTipoContratoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoContratoDatoGeneralEmpleado.add(jButtonFK_IdTipoContratoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("9.-Por Tipo Contrato ", jPanelFK_IdTipoContratoDatoGeneralEmpleado);
		jTabbedPaneBusquedasDatoGeneralEmpleado.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado.add(jButtonFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("10.-Por Tipo Cuenta Banco Global ", jPanelFK_IdTipoCuentaBancoGlobalDatoGeneralEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.add(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.add(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado.add(jButtonFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("11.-Por Tipo Grupo Forma Pago ", jPanelFK_IdTipoGrupoFormaPagoDatoGeneralEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoLibretaMiliDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado.add(jLabelid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado.add(jComboBoxid_tipo_libreta_miliFK_IdTipoLibretaMiliDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado.add(jButtonFK_IdTipoLibretaMiliDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("12.-Por Tipo Libreta Mili ", jPanelFK_IdTipoLibretaMiliDatoGeneralEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoSangreDatoGeneralEmpleado.setLayout(gridaBagLayoutFK_IdTipoSangreDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		jPanelFK_IdTipoSangreDatoGeneralEmpleado.add(jLabelid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
		jPanelFK_IdTipoSangreDatoGeneralEmpleado.add(jComboBoxid_tipo_sangreFK_IdTipoSangreDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralEmpleado.gridy = 1;
		gridBagConstraintsDatoGeneralEmpleado.gridx =1;
		jPanelFK_IdTipoSangreDatoGeneralEmpleado.add(jButtonFK_IdTipoSangreDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);

		jTabbedPaneBusquedasDatoGeneralEmpleado.addTab("13.-Por Tipo Sangre ", jPanelFK_IdTipoSangreDatoGeneralEmpleado);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoGeneralEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;		
			//this.gridBagConstraintsDatoGeneralEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;		
		//this.gridBagConstraintsDatoGeneralEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDatoGeneralEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;		
			this.gridBagConstraintsDatoGeneralEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);								
		
		
		/*
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		*/		
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =0;
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoGeneralEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
				
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DatoGeneralEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDatoGeneralEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoGeneralEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosDatoGeneralEmpleado.setLayout(gridaBagLayoutBusquedasParametrosDatoGeneralEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDatoGeneralEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDatoGeneralEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDatoGeneralEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setName("jPanelReporteDinamicoDatoGeneralEmpleado"); 
		
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDatoGeneralEmpleado.setLayout(gridaBagLayoutReporteDinamicoDatoGeneralEmpleado);
		
		
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoGeneralEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDatoGeneralEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteDatoGeneralEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelColumnasSelectReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDatoGeneralEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteDatoGeneralEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDatoGeneralEmpleado=new JScrollPane(this.jListColumnasSelectReporteDatoGeneralEmpleado);
			
			this.jScrollColumnasSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jListColumnasSelectReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jScrollColumnasSelectReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDatoGeneralEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteDatoGeneralEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDatoGeneralEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteDatoGeneralEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDatoGeneralEmpleado=new JScrollPane(this.jListRelacionesSelectReporteDatoGeneralEmpleado);
			
			this.jScrollRelacionesSelectReporteDatoGeneralEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoGeneralEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoGeneralEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoDatoGeneralEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoDatoGeneralEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelConGraficoDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jCheckBoxConGraficoDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelColumnaCategoriaGraficoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDatoGeneralEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorDatoGeneralEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelColumnaCategoriaValorDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jComboBoxColumnaCategoriaValorDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoDatoGeneralEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelColumnasValoresGraficoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDatoGeneralEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoDatoGeneralEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDatoGeneralEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDatoGeneralEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDatoGeneralEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDatoGeneralEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDatoGeneralEmpleado=new JScrollPane(this.jListColumnasValoresGraficoDatoGeneralEmpleado);
			
			this.jScrollColumnasValoresGraficoDatoGeneralEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDatoGeneralEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDatoGeneralEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jListColumnasSelectReporteDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jScrollColumnasValoresGraficoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelTiposGraficosReportesDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDatoGeneralEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelGenerarExcelReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado.setToolTipText("Generar EXCEL"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jButtonGenerarExcelReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jComboBoxTiposReportesDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jLabelTiposArchivoReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDatoGeneralEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDatoGeneralEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDatoGeneralEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDatoGeneralEmpleado.setToolTipText("Generar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jButtonGenerarReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDatoGeneralEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDatoGeneralEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDatoGeneralEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDatoGeneralEmpleado.setToolTipText("Cancelar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralEmpleado.add(this.jButtonCerrarReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDatoGeneralEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado= new JScrollPane(jPanelReporteDinamicoDatoGeneralEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDatoGeneralEmpleado);
		this.jInternalFrameReporteDinamicoDatoGeneralEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDatoGeneralEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDatoGeneralEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDatoGeneralEmpleado.setName("jPanelImportacionDatoGeneralEmpleado"); 
		
		this.jPanelImportacionDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDatoGeneralEmpleado.setLayout(gridaBagLayoutImportacionDatoGeneralEmpleado);
		
		
		this.jInternalFrameImportacionDatoGeneralEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDatoGeneralEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDatoGeneralEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoGeneralEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDatoGeneralEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoGeneralEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoGeneralEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setResizable(true);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setClosable(true);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDatoGeneralEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoGeneralEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoGeneralEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setResizable(true);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setClosable(true);
	    this.jInternalFrameImportacionDatoGeneralEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDatoGeneralEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionDatoGeneralEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jLabelArchivoImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDatoGeneralEmpleado = new JFileChooser();		
		this.jFileChooserImportacionDatoGeneralEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDatoGeneralEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionDatoGeneralEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDatoGeneralEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDatoGeneralEmpleado.setToolTipText("Generar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jButtonAbrirImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDatoGeneralEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionDatoGeneralEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jLabelPathArchivoImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDatoGeneralEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDatoGeneralEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoGeneralEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoGeneralEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jTextFieldPathArchivoImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDatoGeneralEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionDatoGeneralEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDatoGeneralEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDatoGeneralEmpleado.setToolTipText("Generar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jButtonGenerarImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDatoGeneralEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionDatoGeneralEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDatoGeneralEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDatoGeneralEmpleado.setToolTipText("Cancelar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralEmpleado.add(this.jButtonCerrarImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDatoGeneralEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionDatoGeneralEmpleado= new JScrollPane(jPanelImportacionDatoGeneralEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDatoGeneralEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDatoGeneralEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDatoGeneralEmpleado);
		this.jInternalFrameImportacionDatoGeneralEmpleado.getContentPane().add(this.jScrollPanelImportacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDatoGeneralEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDatoGeneralEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByDatoGeneralEmpleado.setText("Orden");
			this.jButtonAbrirOrderByDatoGeneralEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoGeneralEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDatoGeneralEmpleado";
			inputMap = this.jButtonAbrirOrderByDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDatoGeneralEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByDatoGeneralEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDatoGeneralEmpleado.setName("jPanelOrderByDatoGeneralEmpleado"); 
			
			this.jPanelOrderByDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDatoGeneralEmpleado.setLayout(gridaBagLayoutOrderByDatoGeneralEmpleado);
			
			
			this.jTableDatosDatoGeneralEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosDatoGeneralEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDatoGeneralEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDatoGeneralEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDatoGeneralEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDatoGeneralEmpleadoOrderBy.setViewportView(this.jTableDatosDatoGeneralEmpleadoOrderBy);
			this.jTableDatosDatoGeneralEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDatoGeneralEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDatoGeneralEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDatoGeneralEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDatoGeneralEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDatoGeneralEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDatoGeneralEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDatoGeneralEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDatoGeneralEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByDatoGeneralEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDatoGeneralEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDatoGeneralEmpleado.setResizable(true);
			this.jInternalFrameOrderByDatoGeneralEmpleado.setClosable(true);
			this.jInternalFrameOrderByDatoGeneralEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDatoGeneralEmpleado.ipady =150;
				
			this.jPanelOrderByDatoGeneralEmpleado.add(jScrollPanelDatosDatoGeneralEmpleadoOrderBy, this.gridBagConstraintsDatoGeneralEmpleado);//this.jTableDatosDatoGeneralEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDatoGeneralEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByDatoGeneralEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDatoGeneralEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDatoGeneralEmpleado.setToolTipText("Cancelar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDatoGeneralEmpleado.add(this.jButtonCerrarOrderByDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDatoGeneralEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByDatoGeneralEmpleado= new JScrollPane(jPanelOrderByDatoGeneralEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDatoGeneralEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDatoGeneralEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDatoGeneralEmpleado);
			
			this.jInternalFrameOrderByDatoGeneralEmpleado.getContentPane().add(this.jScrollPanelOrderByDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByDatoGeneralEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//7530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.datogeneralempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDatoGeneralEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDatoGeneralEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDatoGeneralEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDatoGeneralEmpleado.getRowHeight();//DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.isSelected()) {
					iHeightTable=DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoGeneralEmpleado.isSelected()) {
					iHeightTable=DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoGeneralEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDatoGeneralEmpleado!=null && this.jInternalFrameOrderByDatoGeneralEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDatoGeneralEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDatoGeneralEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=datogeneralempleadoLogic.getDatoGeneralEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datogeneralempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DatoGeneralEmpleado> TraerDatoGeneralEmpleadoBeans(List<DatoGeneralEmpleado> datogeneralempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(DatoGeneralEmpleado datogeneralempleado:datogeneralempleados) {
					
				if(!(DatoGeneralEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DatoGeneralEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					datogeneralempleado.setsDetalleGeneralEntityReporte(DatoGeneralEmpleadoConstantesFunciones.getDatoGeneralEmpleadoDescripcion(datogeneralempleado));
										
					datogeneralempleado.setcon_aporta_seguro_social_descripcion(DatoGeneralEmpleadoConstantesFunciones.getcon_aporta_seguro_socialDescripcion(datogeneralempleado));datogeneralempleado.setcon_recibe_horas_extras_descripcion(DatoGeneralEmpleadoConstantesFunciones.getcon_recibe_horas_extrasDescripcion(datogeneralempleado));datogeneralempleado.setcon_descuento_impuestos_descripcion(DatoGeneralEmpleadoConstantesFunciones.getcon_descuento_impuestosDescripcion(datogeneralempleado));datogeneralempleado.setcon_pago_por_horas_descripcion(DatoGeneralEmpleadoConstantesFunciones.getcon_pago_por_horasDescripcion(datogeneralempleado));datogeneralempleado.setcon_anticipo_descripcion(DatoGeneralEmpleadoConstantesFunciones.getcon_anticipoDescripcion(datogeneralempleado));	
					
						
					
				} else  {
							
					//datogeneralempleado.setsDetalleGeneralEntityReporte(datogeneralempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//datogeneralempleadobeans.add(datogeneralempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return datogeneralempleados;
    }
	//PARA REPORTES FIN
}
