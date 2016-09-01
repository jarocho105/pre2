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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DetalleActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DetalleActivoFijoJInternalFrame extends DetalleActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleActivoFijo;
	
	protected JMenuBar jmenuBarDetalleActivoFijo;
	
	protected JMenu jmenuDetalleActivoFijo;
	protected JMenu jmenuDatosDetalleActivoFijo;
	protected JMenu jmenuArchivoDetalleActivoFijo;
	protected JMenu jmenuAccionesDetalleActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDetalleActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";

	protected SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoactivofijo="";

	protected TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporamoactivofijo="";

	protected TipoActivoFijoEmpresaBeanSwingJInternalFrame tipoactivofijoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoactivofijoempresa="";

	protected TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodepreciacionempresa="";

	protected EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoactivofijo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PartidaPresuBeanSwingJInternalFrame partidapresuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_partidapresu="";
	
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;
	public TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean;
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PartidaPresuSessionBean partidapresuSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleActivoFijo> detalleactivofijos;		
	public List<DetalleActivoFijo> detalleactivofijosEliminados;	
	public List<DetalleActivoFijo> detalleactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleActivoFijo;		
	protected JButton jButtonAbrirOrderByDetalleActivoFijo;
	
	
	//protected JPanel jPanelOrderByDetalleActivoFijo;
	//public JScrollPane jScrollPanelOrderByDetalleActivoFijo;	
	//protected JButton jButtonCerrarOrderByDetalleActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDetalleActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDetalleActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleActivoFijo;
	//public JScrollPane jScrollPanelImportacionDetalleActivoFijo;
	
	
	
	protected JPanel jPanelAccionesDetalleActivoFijo;
	
    protected JPanel jPanelPaginacionDetalleActivoFijo;
    protected JPanel jPanelParametrosReportesDetalleActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesDetalleActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2DetalleActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3DetalleActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4DetalleActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5DetalleActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleActivoFijo;
	//protected JPanel jPanelImportacionDetalleActivoFijo;
	
	
	public JTable jTableDatosDetalleActivoFijo;
	
	
	
	//public JTable jTableDatosDetalleActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleActivoFijo;
	protected JButton jButtonDuplicarDetalleActivoFijo;
	protected JButton jButtonCopiarDetalleActivoFijo;
	protected JButton jButtonVerFormDetalleActivoFijo;
	protected JButton jButtonNuevoRelacionesDetalleActivoFijo;
	protected JButton jButtonModificarDetalleActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaDetalleActivoFijo;
	protected JButton jButtonCerrarDetalleActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionDetalleActivoFijo;
	protected JButton jButtonProcesarInformacionDetalleActivoFijo;
	
	
	protected JButton jButtonAnterioresDetalleActivoFijo;
	protected JButton jButtonSiguientesDetalleActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosDetalleActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoDetalleActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleActivoFijo;
	//protected JButton jButtonGenerarImportacionDetalleActivoFijo;
	//protected JButton jButtonCerrarImportacionDetalleActivoFijo;
	//protected JFileChooser jFileChooserImportacionDetalleActivoFijo;
	//protected File fileImportacionDetalleActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleActivoFijo;
	protected JButton jButtonDuplicarToolBarDetalleActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarDetalleActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleActivoFijo;
	protected JButton jButtonCopiarToolBarDetalleActivoFijo;
	protected JButton jButtonVerFormToolBarDetalleActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleActivoFijo;
	protected JButton jButtonCerrarToolBarDetalleActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarDetalleActivoFijo;
	protected JButton jButtonAnterioresToolBarDetalleActivoFijo;
	protected JButton jButtonSiguientesToolBarDetalleActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarDetalleActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleActivoFijo;
	protected JMenuItem jMenuItemDuplicarDetalleActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleActivoFijo;
	protected JMenuItem jMenuItemCopiarDetalleActivoFijo;
	protected JMenuItem jMenuItemVerFormDetalleActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleActivoFijo;
	protected JMenuItem jMenuItemCerrarDetalleActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDetalleActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionDetalleActivoFijo;
	protected JMenuItem jMenuItemAnterioresDetalleActivoFijo;
	protected JMenuItem jMenuItemSiguientesDetalleActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByDetalleActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDetalleActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosDetalleActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralDetalleActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteDetalleActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteDetalleActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionDetalleActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionDetalleActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleActivoFijo;
	public JPanel jPanelFK_IdClienteDetalleActivoFijo;
	public JButton jButtonFK_IdClienteDetalleActivoFijo;
	public JPanel jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo;
	public JButton jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo;
	public JPanel jPanelFK_IdEstadoActivoFijoDetalleActivoFijo;
	public JButton jButtonFK_IdEstadoActivoFijoDetalleActivoFijo;
	public JPanel jPanelFK_IdPartidaPresuDetalleActivoFijo;
	public JButton jButtonFK_IdPartidaPresuDetalleActivoFijo;
	public JPanel jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo;
	public JButton jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo;
	public JPanel jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo;
	public JButton jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo;
	public JPanel jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo;
	public JButton jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo;
	public JPanel jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo;
	public JButton jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleActivoFijo;
	public JLabel jLabelid_clienteFK_IdClienteDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleActivoFijo;
	public JButton jButtonid_clienteFK_IdClienteDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleActivoFijoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo;
	
	public JPanel jPanelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo;
	public JLabel jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo;
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo;
	public JLabel jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo;
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo;
	public JLabel jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo;
	public JButton jButtonid_partida_presuFK_IdPartidaPresuDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_partida_presuFK_IdPartidaPresuDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_partida_presuFK_IdPartidaPresuDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo;
	public JLabel jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo;
	public JButton jButtonid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo;
	public JLabel jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo;
	public JButton jButtonid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo;
	public JLabel jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo;
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo;
	public JLabel jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo;
	public JButton jButtonid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1496;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleActivoFijo)	{
		this.jButtonRecargarInformacionDetalleActivoFijo = jButtonRecargarInformacionDetalleActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionDetalleActivoFijo() {
		return this.jButtonProcesarInformacionDetalleActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleActivoFijo)	{
		this.jButtonProcesarInformacionDetalleActivoFijo = jButtonProcesarInformacionDetalleActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleActivoFijo() {
		return this.jButtonRecargarInformacionDetalleActivoFijo;
	}
	
	
	public List<DetalleActivoFijo> getdetalleactivofijos() {
		return this.detalleactivofijos;
	}

	public void setdetalleactivofijos(List<DetalleActivoFijo> detalleactivofijos) {
		this.detalleactivofijos = detalleactivofijos;
	}
	
	public List<DetalleActivoFijo> getdetalleactivofijosAux() {
		return this.detalleactivofijosAux;
	}

	public void setdetalleactivofijosAux(List<DetalleActivoFijo> detalleactivofijosAux) {
		this.detalleactivofijosAux = detalleactivofijosAux;
	}
	
	public List<DetalleActivoFijo> getdetalleactivofijosEliminados() {
		return this.detalleactivofijosEliminados;
	}

	public void setDetalleActivoFijosEliminados(List<DetalleActivoFijo> detalleactivofijosEliminados) {
		this.detalleactivofijosEliminados = detalleactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleActivoFijo() {
		return jComboBoxTiposSeleccionarDetalleActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleActivoFijo(
			JComboBox jComboBoxTiposSeleccionarDetalleActivoFijo) {
		this.jComboBoxTiposSeleccionarDetalleActivoFijo = jComboBoxTiposSeleccionarDetalleActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleActivoFijo() {
		return jTextFieldValorCampoGeneralDetalleActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralDetalleActivoFijo(
			JTextField jTextFieldValorCampoGeneralDetalleActivoFijo) {
		this.jTextFieldValorCampoGeneralDetalleActivoFijo = jTextFieldValorCampoGeneralDetalleActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleActivoFijo() {
		return this.jCheckBoxSeleccionarTodosDetalleActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosDetalleActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosDetalleActivoFijo) {
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo = jCheckBoxSeleccionarTodosDetalleActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleActivoFijo() {
		return this.jCheckBoxSeleccionadosDetalleActivoFijo;
	}

	public void setjCheckBoxSeleccionadosDetalleActivoFijo(
			JCheckBox jCheckBoxSeleccionadosDetalleActivoFijo) {
		this.jCheckBoxSeleccionadosDetalleActivoFijo = jCheckBoxSeleccionadosDetalleActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleActivoFijo() {
		return this.jComboBoxTiposArchivosReportesDetalleActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesDetalleActivoFijo) {
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo = jComboBoxTiposArchivosReportesDetalleActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleActivoFijo() {
		return this.jComboBoxTiposReportesDetalleActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleActivoFijo(
			JComboBox jComboBoxTiposReportesDetalleActivoFijo) {
		this.jComboBoxTiposReportesDetalleActivoFijo = jComboBoxTiposReportesDetalleActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoDetalleActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoDetalleActivoFijo = jComboBoxTiposReportesDinamicoDetalleActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo = jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleActivoFijo() {
		return this.jComboBoxTiposGraficosReportesDetalleActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesDetalleActivoFijo) {
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo = jComboBoxTiposGraficosReportesDetalleActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleActivoFijo() {
		return this.jComboBoxTiposPaginacionDetalleActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleActivoFijo(
			JComboBox jComboBoxTiposPaginacionDetalleActivoFijo) {
		this.jComboBoxTiposPaginacionDetalleActivoFijo = jComboBoxTiposPaginacionDetalleActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleActivoFijo() {
		return this.jComboBoxTiposRelacionesDetalleActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleActivoFijo() {
		return this.jComboBoxTiposAccionesDetalleActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleActivoFijo(
			JComboBox jComboBoxTiposRelacionesDetalleActivoFijo) {
		this.jComboBoxTiposRelacionesDetalleActivoFijo = jComboBoxTiposRelacionesDetalleActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleActivoFijo(
			JComboBox jComboBoxTiposAccionesDetalleActivoFijo) {
		this.jComboBoxTiposAccionesDetalleActivoFijo = jComboBoxTiposAccionesDetalleActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoDetalleActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoDetalleActivoFijo = jCheckBoxConGraficoDinamicoDetalleActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleActivoFijo .setBorder(borderResaltar);		
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
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"copiar","copiar","Copiar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"ver_form","ver_form","Ver"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"recargar","recargar","Recargar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleActivoFijo,this.jTtoolBarDetalleActivoFijo,
							"cerrar","cerrar","Salir"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleActivoFijo;
			
				this.jButtonProcesarInformacionToolBarDetalleActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleActivoFijo;
				
		//protected JButton jButtonModificarToolBarDetalleActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleActivoFijo=new JMenuMe("General");
		this.jmenuArchivoDetalleActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosDetalleActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleActivoFijo.add(this.jMenuItemCerrarDetalleActivoFijo);
			
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemNuevoDetalleActivoFijo);
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemNuevoGuardarCambiosDetalleActivoFijo);
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemNuevoRelacionesDetalleActivoFijo);
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemGuardarCambiosTablaDetalleActivoFijo);		
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemDuplicarDetalleActivoFijo);		
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemCopiarDetalleActivoFijo);		
			this.jmenuAccionesDetalleActivoFijo.add(this.jMenuItemVerFormDetalleActivoFijo);		
			
			this.jmenuDatosDetalleActivoFijo.add(this.jMenuItemRecargarInformacionDetalleActivoFijo);				
			this.jmenuDatosDetalleActivoFijo.add(this.jMenuItemAnterioresDetalleActivoFijo);				
			this.jmenuDatosDetalleActivoFijo.add(this.jMenuItemSiguientesDetalleActivoFijo);				
			this.jmenuDatosDetalleActivoFijo.add(this.jMenuItemAbrirOrderByDetalleActivoFijo);				
			this.jmenuDatosDetalleActivoFijo.add(this.jMenuItemMostrarOcultarDetalleActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleActivoFijo.add(this.jMenuItemGuardarCambiosDetalleActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleActivoFijo.add(this.jmenuArchivoDetalleActivoFijo);		
			this.jmenuBarDetalleActivoFijo.add(this.jmenuAccionesDetalleActivoFijo);		
			this.jmenuBarDetalleActivoFijo.add(this.jmenuDatosDetalleActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleActivoFijo.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdClienteDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdClienteDetalleActivoFijo.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleActivoFijo,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleActivoFijo = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleActivoFijo.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDetalleActivoFijo.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo.setFocusable(false);

		this.jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		this.jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo,"buscar_button","Buscar Por Detalle Grupo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo = new JLabelMe();
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setText("Detalle Grupo Activo Fijo :");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setToolTipText("Detalle Grupo Activo Fijo");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoActivoFijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Estado Activo Fijo ");
		this.jButtonFK_IdEstadoActivoFijoDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdEstadoActivoFijoDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdEstadoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Estado Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoActivoFijoDetalleActivoFijo,"buscar_button","Buscar Por Estado Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoActivoFijoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo = new JLabelMe();
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setText("Estado Activo Fijo :");
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setToolTipText("Estado Activo Fijo");
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPartidaPresuDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPartidaPresuDetalleActivoFijo.setToolTipText("Buscar Por Parta Presu ");
		this.jButtonFK_IdPartidaPresuDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdPartidaPresuDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdPartidaPresuDetalleActivoFijo.setToolTipText("Buscar Por Parta Presu ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPartidaPresuDetalleActivoFijo,"buscar_button","Buscar Por Parta Presu ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPartidaPresuDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo = new JLabelMe();
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setText("Parta Presu :");
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setToolTipText("Parta Presu");
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Sub Grupo Activo Fijo ");
		this.jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Sub Grupo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo,"buscar_button","Buscar Por Sub Grupo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo = new JLabelMe();
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setText("Sub Grupo Activo Fijo :");
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setToolTipText("Sub Grupo Activo Fijo");
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setToolTipText("Buscar Por Tipo Activo Fijo Empresa ");
		this.jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setToolTipText("Buscar Por Tipo Activo Fijo Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo,"buscar_button","Buscar Por Tipo Activo Fijo Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo = new JLabelMe();
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setText("Tipo Activo Fijo Empresa :");
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setToolTipText("Tipo Activo Fijo Empresa");
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setToolTipText("Buscar Por Tipo Depreciacion Empresa ");
		this.jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setToolTipText("Buscar Por Tipo Depreciacion Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo,"buscar_button","Buscar Por Tipo Depreciacion Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo = new JLabelMe();
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setText("Tipo Depreciacion Empresa :");
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setToolTipText("Tipo Depreciacion Empresa");
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Tipo Ramo Activo Fijo ");
		this.jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo= new JButtonMe();
		this.jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo.setText("Buscar");
		this.jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo.setToolTipText("Buscar Por Tipo Ramo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo,"buscar_button","Buscar Por Tipo Ramo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo = new JLabelMe();
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setText("Tipo Ramo Activo Fijo :");
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setToolTipText("Tipo Ramo Activo Fijo");
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleActivoFijo = new DetalleActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Activo Fijo DATOS");
			this.jInternalFrameDetalleFormDetalleActivoFijo = new DetalleActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.detalleactivofijoSessionBean.getConGuardarRelaciones(),this.detalleactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleActivoFijo = null;//new DetalleActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosDetalleActivoFijo = new JTableMe();      
		
		String sToolTipDetalleActivoFijo="";
		sToolTipDetalleActivoFijo=DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleActivoFijo+="(ActivosFijos.DetalleActivoFijo)";
		}
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleActivoFijo.setToolTipText(sToolTipDetalleActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleActivoFijo);
		this.jTableDatosDetalleActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosDetalleActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleActivoFijo = new JButtonMe();
		this.jButtonDuplicarDetalleActivoFijo = new JButtonMe();
		this.jButtonCopiarDetalleActivoFijo = new JButtonMe();
		this.jButtonVerFormDetalleActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleActivoFijo = new JButtonMe();
		this.jButtonCerrarDetalleActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDetalleActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Activo Fijo";
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDetalleActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleActivoFijo=new ReporteDinamicoJInternalFrame(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleActivoFijo=new ImportacionJInternalFrame(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByDetalleActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleActivoFijo,false,this);
			
			//this.cargarOrderByDetalleActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleActivoFijo,true,this);
			
			//this.cargarOrderByDetalleActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleActivoFijo.setMinimumSize(new Dimension(400,50));//3830
		this.jTableDatosDetalleActivoFijo.setMaximumSize(new Dimension(400,50));//3830
		this.jTableDatosDetalleActivoFijo.setPreferredSize(new Dimension(400,50));//3830
		
		this.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleActivoFijo.setText("Nuevo");
		this.jButtonDuplicarDetalleActivoFijo.setText("Duplicar");
		this.jButtonCopiarDetalleActivoFijo.setText("Copiar");
		this.jButtonVerFormDetalleActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesDetalleActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.setText("Guardar");
		this.jButtonCerrarDetalleActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleActivoFijo,"nuevo_button","Nuevo",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleActivoFijo,"duplicar_button","Duplicar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleActivoFijo,"copiar_button","Copiar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleActivoFijo,"ver_form","Ver",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleActivoFijo,"guardarcambiostabla_button","Guardar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleActivoFijo,"cerrar_button","Salir",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleActivoFijo.setToolTipText("Nuevo"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleActivoFijo.setToolTipText("Duplicar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleActivoFijo.setToolTipText("Copiar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleActivoFijo.setToolTipText("Ver"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleActivoFijo.setToolTipText("Nuevo Rel"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.setToolTipText("Guardar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleActivoFijo.setToolTipText("Salir"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleActivoFijo";
		inputMap = this.jButtonNuevoDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleActivoFijo";
		inputMap = this.jButtonDuplicarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarDetalleActivoFijo";
		inputMap = this.jButtonCopiarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleActivoFijo";
		inputMap = this.jButtonVerFormDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleActivoFijo";
		inputMap = this.jButtonNuevoRelacionesDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleActivoFijo";
		inputMap = this.jButtonModificarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleActivoFijo";
		inputMap = this.jButtonCerrarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleActivoFijo.setName("jPanelParametrosReportesDetalleActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleActivoFijo.setName("jPanelParametrosReportesAccionesDetalleActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionDetalleActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionDetalleActivoFijo.setToolTipText("Recargar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionDetalleActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionDetalleActivoFijo.setToolTipText("Procesar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDetalleActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDetalleActivoFijo.setText("Acciones");		
		this.jLabelAccionesDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleActivoFijo = new JButtonMe();
		//this.jButtonAnterioresDetalleActivoFijo.setText("<<");
        this.jButtonAnterioresDetalleActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleActivoFijo = new JButtonMe();
		//this.jButtonSiguientesDetalleActivoFijo.setText(">>");
        this.jButtonSiguientesDetalleActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleActivoFijo,"nuevoguardarcambios_button","Nue",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleActivoFijo";
		inputMap = this.jButtonRecargarInformacionDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleActivoFijo";
		inputMap = this.jButtonSiguientesDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleActivoFijo";
		inputMap = this.jButtonAnterioresDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleActivoFijo.setMinimumSize(new Dimension(this.getWidth(),DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleActivoFijo.setMaximumSize(new Dimension(this.getWidth(),DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleActivoFijo.setPreferredSize(new Dimension(this.getWidth(),DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleActivoFijo = new GridBagLayout();

			this.jPanelPaginacionDetalleActivoFijo.setLayout(gridaBagLayoutPaginacionDetalleActivoFijo);						
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonAnterioresDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					
						
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
			
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonNuevoGuardarCambiosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
						
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonSiguientesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonNuevoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
				this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonNuevoRelacionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			}
			
			
			if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
				this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonGuardarCambiosTablaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			}
			
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonDuplicarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonCopiarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonVerFormDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 1;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleActivoFijo.add(this.jButtonCerrarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		
		this.jButtonRecargarInformacionDetalleActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleActivoFijo.setLayout(gridaBagParametrosReportesDetalleActivoFijo);
			this.jPanelParametrosReportesAccionesDetalleActivoFijo.setLayout(gridaBagParametrosReportesAccionesDetalleActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1DetalleActivoFijo.setLayout(gridaBagParametrosAuxiliar1DetalleActivoFijo);
			this.jPanelParametrosAuxiliar2DetalleActivoFijo.setLayout(gridaBagParametrosAuxiliar2DetalleActivoFijo);
			this.jPanelParametrosAuxiliar3DetalleActivoFijo.setLayout(gridaBagParametrosAuxiliar3DetalleActivoFijo);
			this.jPanelParametrosAuxiliar4DetalleActivoFijo.setLayout(gridaBagParametrosAuxiliar4DetalleActivoFijo);
			//this.jPanelParametrosAuxiliar5DetalleActivoFijo.setLayout(gridaBagParametrosAuxiliar2DetalleActivoFijo);			
			
			
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jButtonRecargarInformacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleActivoFijo.add(this.jComboBoxTiposPaginacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleActivoFijo.add(this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleActivoFijo.add(this.jComboBoxTiposArchivosReportesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jPanelParametrosAuxiliar1DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleActivoFijo.add(this.jComboBoxTiposReportesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);																		
			
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleActivoFijo.add(this.jComboBoxTiposGraficosReportesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jPanelParametrosAuxiliar4DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jComboBoxTiposReportesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jCheckBoxGenerarReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jPanelParametrosAuxiliar2DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jLabelAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleActivoFijo.add(this.jButtonAbrirOrderByDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jComboBoxTiposSeleccionarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			
			
			/*
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jCheckBoxSeleccionarTodosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jCheckBoxConGraficoReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleActivoFijo.add(this.jCheckBoxSeleccionarTodosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);															
				
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleActivoFijo.add(this.jCheckBoxSeleccionadosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);															
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleActivoFijo.add(this.jCheckBoxConGraficoReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jPanelParametrosAuxiliar3DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jComboBoxTiposRelacionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
				
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jComboBoxTiposAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
	
				
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleActivoFijo.add(this.jTextFieldValorCampoGeneralDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosDetalleActivoFijo.setLayout(gridaBagLayoutDatosDetalleActivoFijo);
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosDetalleActivoFijo.add(this.jTableDatosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleActivoFijo.setViewportView(this.jTableDatosDetalleActivoFijo);
		this.jTableDatosDetalleActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosDetalleActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleActivoFijo= new GridBagLayout();
		this.jPanelAccionesDetalleActivoFijo.setLayout(gridaBagLayoutAccionesDetalleActivoFijo);
		
		
		/*	
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
			
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonNuevoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdClienteDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdClienteDetalleActivoFijo.add(jLabelid_clienteFK_IdClienteDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdClienteDetalleActivoFijo.add(jComboBoxid_clienteFK_IdClienteDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);


		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdClienteDetalleActivoFijo.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdClienteDetalleActivoFijo.add(jButtonFK_IdClienteDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("1.-Por Cliente ", jPanelFK_IdClienteDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleGrupoActivoFijoDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.add(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.add(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo.add(jButtonFK_IdDetalleGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("2.-Por Detalle Grupo Activo Fijo ", jPanelFK_IdDetalleGrupoActivoFijoDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoActivoFijoDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdEstadoActivoFijoDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdEstadoActivoFijoDetalleActivoFijo.add(jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdEstadoActivoFijoDetalleActivoFijo.add(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdEstadoActivoFijoDetalleActivoFijo.add(jButtonFK_IdEstadoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("3.-Por Estado Activo Fijo ", jPanelFK_IdEstadoActivoFijoDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPartidaPresuDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdPartidaPresuDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdPartidaPresuDetalleActivoFijo.add(jLabelid_partida_presuFK_IdPartidaPresuDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdPartidaPresuDetalleActivoFijo.add(jComboBoxid_partida_presuFK_IdPartidaPresuDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdPartidaPresuDetalleActivoFijo.add(jButtonFK_IdPartidaPresuDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("4.-Por Parta Presu ", jPanelFK_IdPartidaPresuDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdSubGrupoActivoFijoDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo.add(jLabelid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo.add(jComboBoxid_sub_grupo_activo_fijoFK_IdSubGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo.add(jButtonFK_IdSubGrupoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("5.-Por Sub Grupo Activo Fijo ", jPanelFK_IdSubGrupoActivoFijoDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdTipoActivoFijoEmpresaDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.add(jLabelid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.add(jComboBoxid_tipo_activo_fijo_empresaFK_IdTipoActivoFijoEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo.add(jButtonFK_IdTipoActivoFijoEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("6.-Por Tipo Activo Fijo Empresa ", jPanelFK_IdTipoActivoFijoEmpresaDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdTipoDepreciacionEmpresaDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.add(jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.add(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo.add(jButtonFK_IdTipoDepreciacionEmpresaDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("7.-Por Tipo Depreciacion Empresa ", jPanelFK_IdTipoDepreciacionEmpresaDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo.setLayout(gridaBagLayoutFK_IdTipoRamoActivoFijoDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 0;
		jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo.add(jLabelid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 0;
		gridBagConstraintsDetalleActivoFijo.gridx = 1;
		jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo.add(jComboBoxid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleActivoFijo.gridy = 1;
		gridBagConstraintsDetalleActivoFijo.gridx =1;
		jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo.add(jButtonFK_IdTipoRamoActivoFijoDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);

		jTabbedPaneBusquedasDetalleActivoFijo.addTab("8.-Por Tipo Ramo Activo Fijo ", jPanelFK_IdTipoRamoActivoFijoDetalleActivoFijo);
		jTabbedPaneBusquedasDetalleActivoFijo.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDetalleActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;		
		//this.gridBagConstraintsDetalleActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;		
			this.gridBagConstraintsDetalleActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);								
		
		
		/*
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		*/		
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleActivoFijo.gridx =0;
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
				
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetalleActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosDetalleActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleActivoFijo.setName("jPanelReporteDinamicoDetalleActivoFijo"); 
		
		this.jPanelReporteDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleActivoFijo.setLayout(gridaBagLayoutReporteDinamicoDetalleActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoDetalleActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelColumnasSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleActivoFijo=new JScrollPane(this.jListColumnasSelectReporteDetalleActivoFijo);
			
			this.jScrollColumnasSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jListColumnasSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jScrollColumnasSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelRelacionesSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteDetalleActivoFijo);
			
			this.jScrollRelacionesSelectReporteDetalleActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jListRelacionesSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jScrollRelacionesSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetalleActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleActivoFijo = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleActivoFijo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelConGraficoDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleActivoFijo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jCheckBoxConGraficoDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleActivoFijo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelColumnaCategoriaGraficoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleActivoFijo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelColumnaCategoriaValorDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jComboBoxColumnaCategoriaValorDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleActivoFijo = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleActivoFijo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelColumnasValoresGraficoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleActivoFijo = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleActivoFijo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleActivoFijo=new JScrollPane(this.jListColumnasValoresGraficoDetalleActivoFijo);
			
			this.jScrollColumnasValoresGraficoDetalleActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jListColumnasSelectReporteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jScrollColumnasValoresGraficoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelTiposGraficosReportesDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleActivoFijo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleActivoFijo.setToolTipText("Generar EXCEL"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jComboBoxTiposReportesDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleActivoFijo.setToolTipText("Generar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jButtonGenerarReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleActivoFijo.setToolTipText("Cancelar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleActivoFijo.add(this.jButtonCerrarReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleActivoFijo= new JScrollPane(jPanelReporteDinamicoDetalleActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleActivoFijo);
		this.jInternalFrameReporteDinamicoDetalleActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleActivoFijo.setName("jPanelImportacionDetalleActivoFijo"); 
		
		this.jPanelImportacionDetalleActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleActivoFijo.setLayout(gridaBagLayoutImportacionDetalleActivoFijo);
		
		
		this.jInternalFrameImportacionDetalleActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDetalleActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDetalleActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDetalleActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDetalleActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionDetalleActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleActivoFijo.add(this.jLabelArchivoImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionDetalleActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionDetalleActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleActivoFijo.setToolTipText("Generar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleActivoFijo.add(this.jButtonAbrirImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleActivoFijo.add(this.jLabelPathArchivoImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleActivoFijo.add(this.jTextFieldPathArchivoImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionDetalleActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleActivoFijo.setToolTipText("Generar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleActivoFijo.add(this.jButtonGenerarImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionDetalleActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleActivoFijo.setToolTipText("Cancelar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleActivoFijo.add(this.jButtonCerrarImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleActivoFijo= new JScrollPane(jPanelImportacionDetalleActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleActivoFijo);
		this.jInternalFrameImportacionDetalleActivoFijo.getContentPane().add(this.jScrollPanelImportacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByDetalleActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByDetalleActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleActivoFijo";
			inputMap = this.jButtonAbrirOrderByDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleActivoFijo.setName("jPanelOrderByDetalleActivoFijo"); 
			
			this.jPanelOrderByDetalleActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleActivoFijo.setLayout(gridaBagLayoutOrderByDetalleActivoFijo);
			
			
			this.jTableDatosDetalleActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosDetalleActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleActivoFijoOrderBy.setViewportView(this.jTableDatosDetalleActivoFijoOrderBy);
			this.jTableDatosDetalleActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByDetalleActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleActivoFijo.setResizable(true);
			this.jInternalFrameOrderByDetalleActivoFijo.setClosable(true);
			this.jInternalFrameOrderByDetalleActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleActivoFijo.ipady =150;
				
			this.jPanelOrderByDetalleActivoFijo.add(jScrollPanelDatosDetalleActivoFijoOrderBy, this.gridBagConstraintsDetalleActivoFijo);//this.jTableDatosDetalleActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByDetalleActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleActivoFijo.setToolTipText("Cancelar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleActivoFijo.add(this.jButtonCerrarOrderByDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleActivoFijo= new JScrollPane(jPanelOrderByDetalleActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleActivoFijo);
			
			this.jInternalFrameOrderByDetalleActivoFijo.getContentPane().add(this.jScrollPanelOrderByDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByDetalleActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//8630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=900;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleActivoFijo.getRowHeight();//DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.isSelected()) {
					iHeightTable=DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleActivoFijo.isSelected()) {
					iHeightTable=DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleActivoFijo!=null && this.jInternalFrameOrderByDetalleActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleactivofijoLogic.getDetalleActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleActivoFijo> TraerDetalleActivoFijoBeans(List<DetalleActivoFijo> detalleactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleActivoFijo detalleactivofijo:detalleactivofijos) {
					
				if(!(DetalleActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleactivofijo.setsDetalleGeneralEntityReporte(DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijo));
										
					detalleactivofijo.setcon_partes_descripcion(DetalleActivoFijoConstantesFunciones.getcon_partesDescripcion(detalleactivofijo));detalleactivofijo.setcon_garantia_descripcion(DetalleActivoFijoConstantesFunciones.getcon_garantiaDescripcion(detalleactivofijo));detalleactivofijo.setcon_existencia_descripcion(DetalleActivoFijoConstantesFunciones.getcon_existenciaDescripcion(detalleactivofijo));	
					
					

					if(detalleactivofijo.getMantenimientoActivoFijos()!=null && Funciones.existeClass(classes,MantenimientoActivoFijo.class)) {
						try{detalleactivofijo.setmantenimientoactivofijosDescripcionReporte(new JRBeanCollectionDataSource(MantenimientoActivoFijoJInternalFrame.TraerMantenimientoActivoFijoBeans(detalleactivofijo.getMantenimientoActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getServicioTransportes()!=null && Funciones.existeClass(classes,ServicioTransporte.class)) {
						try{detalleactivofijo.setserviciotransportesDescripcionReporte(new JRBeanCollectionDataSource(ServicioTransporteJInternalFrame.TraerServicioTransporteBeans(detalleactivofijo.getServicioTransportes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getMovimientoActivoFijoDestinos()!=null && Funciones.existeClass(classes,MovimientoActivoFijo.class)) {
						try{detalleactivofijo.setmovimientoactivofijoDestinosDescripcionReporte(new JRBeanCollectionDataSource(MovimientoActivoFijoJInternalFrame.TraerMovimientoActivoFijoBeans(detalleactivofijo.getMovimientoActivoFijoDestinos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getVehiculos()!=null && Funciones.existeClass(classes,Vehiculo.class)) {
						try{detalleactivofijo.setvehiculosDescripcionReporte(new JRBeanCollectionDataSource(VehiculoJInternalFrame.TraerVehiculoBeans(detalleactivofijo.getVehiculos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getMetodoDepreciacions()!=null && Funciones.existeClass(classes,MetodoDepreciacion.class)) {
						try{detalleactivofijo.setmetododepreciacionsDescripcionReporte(new JRBeanCollectionDataSource(MetodoDepreciacionJInternalFrame.TraerMetodoDepreciacionBeans(detalleactivofijo.getMetodoDepreciacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getResponsableActivoFijos()!=null && Funciones.existeClass(classes,ResponsableActivoFijo.class)) {
						try{detalleactivofijo.setresponsableactivofijosDescripcionReporte(new JRBeanCollectionDataSource(ResponsableActivoFijoJInternalFrame.TraerResponsableActivoFijoBeans(detalleactivofijo.getResponsableActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getDepreciacionActivoFijos()!=null && Funciones.existeClass(classes,DepreciacionActivoFijo.class)) {
						try{detalleactivofijo.setdepreciacionactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DepreciacionActivoFijoJInternalFrame.TraerDepreciacionActivoFijoBeans(detalleactivofijo.getDepreciacionActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getGastoDepreciacionCentroCostos()!=null && Funciones.existeClass(classes,GastoDepreciacionCentroCosto.class)) {
						try{detalleactivofijo.setgastodepreciacioncentrocostosDescripcionReporte(new JRBeanCollectionDataSource(GastoDepreciacionCentroCostoJInternalFrame.TraerGastoDepreciacionCentroCostoBeans(detalleactivofijo.getGastoDepreciacionCentroCostos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleactivofijo.getParteActivoFijos()!=null && Funciones.existeClass(classes,ParteActivoFijo.class)) {
						try{detalleactivofijo.setparteactivofijosDescripcionReporte(new JRBeanCollectionDataSource(ParteActivoFijoJInternalFrame.TraerParteActivoFijoBeans(detalleactivofijo.getParteActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detalleactivofijo.setsDetalleGeneralEntityReporte(detalleactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleactivofijobeans.add(detalleactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleactivofijos;
    }
	//PARA REPORTES FIN
}
