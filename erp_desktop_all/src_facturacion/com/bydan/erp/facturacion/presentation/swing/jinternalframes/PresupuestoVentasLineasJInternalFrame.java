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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.facturacion.util.PresupuestoVentasLineasConstantesFunciones;

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
public class PresupuestoVentasLineasJInternalFrame extends PresupuestoVentasLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoVentasLineas;
	
	protected JMenuBar jmenuBarPresupuestoVentasLineas;
	
	protected JMenu jmenuPresupuestoVentasLineas;
	protected JMenu jmenuDatosPresupuestoVentasLineas;
	protected JMenu jmenuArchivoPresupuestoVentasLineas;
	protected JMenu jmenuAccionesPresupuestoVentasLineas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentasLineas;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentasLineas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoVentasLineas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoVentasLineas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoVentasLineas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public PresupuestoVentasLineasSessionBean presupuestoventaslineasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoVentasLineas> presupuestoventaslineass;		
	public List<PresupuestoVentasLineas> presupuestoventaslineassEliminados;	
	public List<PresupuestoVentasLineas> presupuestoventaslineassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoVentasLineas;		
	protected JButton jButtonAbrirOrderByPresupuestoVentasLineas;
	
	
	//protected JPanel jPanelOrderByPresupuestoVentasLineas;
	//public JScrollPane jScrollPanelOrderByPresupuestoVentasLineas;	
	//protected JButton jButtonCerrarOrderByPresupuestoVentasLineas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoVentasLineasLogic presupuestoventaslineasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoVentasLineas;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentasLineas;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentasLineas;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoVentasLineasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoVentasLineas;
	//public JScrollPane jScrollPanelImportacionPresupuestoVentasLineas;
	
	
	
	protected JPanel jPanelAccionesPresupuestoVentasLineas;
	
    protected JPanel jPanelPaginacionPresupuestoVentasLineas;
    protected JPanel jPanelParametrosReportesPresupuestoVentasLineas;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoVentasLineas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoVentasLineas;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoVentasLineas;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoVentasLineas;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoVentasLineas;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoVentasLineas;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoVentasLineas;
	//protected JPanel jPanelImportacionPresupuestoVentasLineas;
	
	
	public JTable jTableDatosPresupuestoVentasLineas;
	
	
	
	//public JTable jTableDatosPresupuestoVentasLineasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoVentasLineas;
	protected JButton jButtonDuplicarPresupuestoVentasLineas;
	protected JButton jButtonCopiarPresupuestoVentasLineas;
	protected JButton jButtonVerFormPresupuestoVentasLineas;
	protected JButton jButtonNuevoRelacionesPresupuestoVentasLineas;
	protected JButton jButtonModificarPresupuestoVentasLineas;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoVentasLineas;
	protected JButton jButtonCerrarPresupuestoVentasLineas;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoVentasLineas;
	protected JButton jButtonProcesarInformacionPresupuestoVentasLineas;
	
	
	protected JButton jButtonAnterioresPresupuestoVentasLineas;
	protected JButton jButtonSiguientesPresupuestoVentasLineas;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoVentasLineas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoVentasLineas;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoVentasLineas;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoVentasLineas;
	//protected JButton jButtonGenerarImportacionPresupuestoVentasLineas;
	//protected JButton jButtonCerrarImportacionPresupuestoVentasLineas;
	//protected JFileChooser jFileChooserImportacionPresupuestoVentasLineas;
	//protected File fileImportacionPresupuestoVentasLineas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentasLineas;
	protected JButton jButtonDuplicarToolBarPresupuestoVentasLineas;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentasLineas;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoVentasLineas;
	protected JButton jButtonCopiarToolBarPresupuestoVentasLineas;
	protected JButton jButtonVerFormToolBarPresupuestoVentasLineas;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentasLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentasLineas;
	protected JButton jButtonCerrarToolBarPresupuestoVentasLineas;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoVentasLineas;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasLineas;
	protected JButton jButtonAnterioresToolBarPresupuestoVentasLineas;
	protected JButton jButtonSiguientesToolBarPresupuestoVentasLineas;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoVentasLineas;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoVentasLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDuplicarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoVentasLineas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentasLineas;
	protected JMenuItem jMenuItemCopiarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemVerFormPresupuestoVentasLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentasLineas;
	protected JMenuItem jMenuItemCerrarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentasLineas;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoVentasLineas;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentasLineas;
	protected JMenuItem jMenuItemAnterioresPresupuestoVentasLineas;
	protected JMenuItem jMenuItemSiguientesPresupuestoVentasLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoVentasLineas;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentasLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentasLineas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentasLineas;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoVentasLineas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoVentasLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoVentasLineas;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoVentasLineas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoVentasLineas;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoVentasLineas;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoVentasLineas;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoVentasLineas;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoVentasLineas;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoVentasLineas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoVentasLineas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentasLineas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoVentasLineas;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoVentasLineas;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoVentasLineas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoVentasLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoVentasLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoVentasLineas;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoVentasLineas;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoVentasLineas;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoVentasLineas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoVentasLineas;
	public JPanel jPanelFK_IdCiudadPresupuestoVentasLineas;
	public JButton jButtonFK_IdCiudadPresupuestoVentasLineas;
	public JPanel jPanelFK_IdLineaPresupuestoVentasLineas;
	public JButton jButtonFK_IdLineaPresupuestoVentasLineas;
	public JPanel jPanelFK_IdLineaCategoriaPresupuestoVentasLineas;
	public JButton jButtonFK_IdLineaCategoriaPresupuestoVentasLineas;
	public JPanel jPanelFK_IdLineaGrupoPresupuestoVentasLineas;
	public JButton jButtonFK_IdLineaGrupoPresupuestoVentasLineas;
	public JPanel jPanelFK_IdLineaMarcaPresupuestoVentasLineas;
	public JButton jButtonFK_IdLineaMarcaPresupuestoVentasLineas;
	public JPanel jPanelFK_IdPaisPresupuestoVentasLineas;
	public JButton jButtonFK_IdPaisPresupuestoVentasLineas;
	public JPanel jPanelFK_IdVendedorPresupuestoVentasLineas;
	public JButton jButtonFK_IdVendedorPresupuestoVentasLineas;
	public JPanel jPanelFK_IdZonaPresupuestoVentasLineas;
	public JButton jButtonFK_IdZonaPresupuestoVentasLineas;
	
	public JPanel jPanelid_ciudadFK_IdCiudadPresupuestoVentasLineas;
	public JLabel jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas;
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadPresupuestoVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaFK_IdLineaPresupuestoVentasLineas;
	public JLabel jLabelid_lineaFK_IdLineaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas;
	public JButton jButtonid_lineaFK_IdLineaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoVentasLineasArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas;
	public JLabel jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas;
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineasArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas;
	public JLabel jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas;
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineasArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas;
	public JLabel jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas;
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineasArbol= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisPresupuestoVentasLineas;
	public JLabel jLabelid_paisFK_IdPaisPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas;
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPresupuestoVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorPresupuestoVentasLineas;
	public JLabel jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas;
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPresupuestoVentasLineasArbol= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaPresupuestoVentasLineas;
	public JLabel jLabelid_zonaFK_IdZonaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas;
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPresupuestoVentasLineasBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresupuestoVentasLineasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoVentasLineas)	{
		this.jButtonRecargarInformacionPresupuestoVentasLineas = jButtonRecargarInformacionPresupuestoVentasLineas;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoVentasLineas() {
		return this.jButtonProcesarInformacionPresupuestoVentasLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentasLineas)	{
		this.jButtonProcesarInformacionPresupuestoVentasLineas = jButtonProcesarInformacionPresupuestoVentasLineas;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoVentasLineas() {
		return this.jButtonRecargarInformacionPresupuestoVentasLineas;
	}
	
	
	public List<PresupuestoVentasLineas> getpresupuestoventaslineass() {
		return this.presupuestoventaslineass;
	}

	public void setpresupuestoventaslineass(List<PresupuestoVentasLineas> presupuestoventaslineass) {
		this.presupuestoventaslineass = presupuestoventaslineass;
	}
	
	public List<PresupuestoVentasLineas> getpresupuestoventaslineassAux() {
		return this.presupuestoventaslineassAux;
	}

	public void setpresupuestoventaslineassAux(List<PresupuestoVentasLineas> presupuestoventaslineassAux) {
		this.presupuestoventaslineassAux = presupuestoventaslineassAux;
	}
	
	public List<PresupuestoVentasLineas> getpresupuestoventaslineassEliminados() {
		return this.presupuestoventaslineassEliminados;
	}

	public void setPresupuestoVentasLineassEliminados(List<PresupuestoVentasLineas> presupuestoventaslineassEliminados) {
		this.presupuestoventaslineassEliminados = presupuestoventaslineassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoVentasLineas() {
		return jComboBoxTiposSeleccionarPresupuestoVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoVentasLineas(
			JComboBox jComboBoxTiposSeleccionarPresupuestoVentasLineas) {
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas = jComboBoxTiposSeleccionarPresupuestoVentasLineas;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoVentasLineas() {
		return jTextFieldValorCampoGeneralPresupuestoVentasLineas;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoVentasLineas(
			JTextField jTextFieldValorCampoGeneralPresupuestoVentasLineas) {
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas = jTextFieldValorCampoGeneralPresupuestoVentasLineas;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoVentasLineas() {
		return this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoVentasLineas(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentasLineas) {
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas = jCheckBoxSeleccionarTodosPresupuestoVentasLineas;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoVentasLineas() {
		return this.jCheckBoxSeleccionadosPresupuestoVentasLineas;
	}

	public void setjCheckBoxSeleccionadosPresupuestoVentasLineas(
			JCheckBox jCheckBoxSeleccionadosPresupuestoVentasLineas) {
		this.jCheckBoxSeleccionadosPresupuestoVentasLineas = jCheckBoxSeleccionadosPresupuestoVentasLineas;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoVentasLineas() {
		return this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoVentasLineas) {
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas = jComboBoxTiposArchivosReportesPresupuestoVentasLineas;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoVentasLineas() {
		return this.jComboBoxTiposReportesPresupuestoVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposReportesPresupuestoVentasLineas) {
		this.jComboBoxTiposReportesPresupuestoVentasLineas = jComboBoxTiposReportesPresupuestoVentasLineas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoVentasLineas() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoVentasLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoVentasLineas(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentasLineas) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas = jComboBoxTiposReportesDinamicoPresupuestoVentasLineas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas = jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoVentasLineas() {
		return this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoVentasLineas) {
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas = jComboBoxTiposGraficosReportesPresupuestoVentasLineas;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoVentasLineas() {
		return this.jComboBoxTiposPaginacionPresupuestoVentasLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoVentasLineas(
			JComboBox jComboBoxTiposPaginacionPresupuestoVentasLineas) {
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas = jComboBoxTiposPaginacionPresupuestoVentasLineas;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoVentasLineas() {
		return this.jComboBoxTiposRelacionesPresupuestoVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentasLineas() {
		return this.jComboBoxTiposAccionesPresupuestoVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentasLineas) {
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas = jComboBoxTiposRelacionesPresupuestoVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposAccionesPresupuestoVentasLineas) {
		this.jComboBoxTiposAccionesPresupuestoVentasLineas = jComboBoxTiposAccionesPresupuestoVentasLineas;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoVentasLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoVentasLineas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoVentasLineas() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoVentasLineas;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoVentasLineas(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentasLineas) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas = jCheckBoxConGraficoDinamicoPresupuestoVentasLineas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoVentasLineas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoVentasLineas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas .setBorder(borderResaltar);		
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
		this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		
		this.presupuestoventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas_lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoVentasLineas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"copiar","copiar","Copiar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"ver_form","ver_form","Ver"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"recargar","recargar","Recargar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoVentasLineas,this.jTtoolBarPresupuestoVentasLineas,
							"cerrar","cerrar","Salir"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoVentasLineas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentasLineas;
			
				this.jButtonProcesarInformacionToolBarPresupuestoVentasLineas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasLineas;
				
		//protected JButton jButtonModificarToolBarPresupuestoVentasLineas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoVentasLineas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoVentasLineas=new JMenuMe("General");
		this.jmenuArchivoPresupuestoVentasLineas=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoVentasLineas=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoVentasLineas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentasLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentasLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentasLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoVentasLineas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoVentasLineas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoVentasLineas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoVentasLineas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoVentasLineas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoVentasLineas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoVentasLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentasLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentasLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoVentasLineas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoVentasLineas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoVentasLineas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoVentasLineas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoVentasLineas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoVentasLineas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasLineas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasLineas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoVentasLineas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoVentasLineas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoVentasLineas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoVentasLineas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoVentasLineas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoVentasLineas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoVentasLineas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoVentasLineas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoVentasLineas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoVentasLineas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoVentasLineas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoVentasLineas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoVentasLineas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoVentasLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoVentasLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoVentasLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoVentasLineas.add(this.jMenuItemCerrarPresupuestoVentasLineas);
			
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemNuevoPresupuestoVentasLineas);
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas);
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemNuevoRelacionesPresupuestoVentasLineas);
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemGuardarCambiosTablaPresupuestoVentasLineas);		
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemDuplicarPresupuestoVentasLineas);		
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemCopiarPresupuestoVentasLineas);		
			this.jmenuAccionesPresupuestoVentasLineas.add(this.jMenuItemVerFormPresupuestoVentasLineas);		
			
			this.jmenuDatosPresupuestoVentasLineas.add(this.jMenuItemRecargarInformacionPresupuestoVentasLineas);				
			this.jmenuDatosPresupuestoVentasLineas.add(this.jMenuItemAnterioresPresupuestoVentasLineas);				
			this.jmenuDatosPresupuestoVentasLineas.add(this.jMenuItemSiguientesPresupuestoVentasLineas);				
			this.jmenuDatosPresupuestoVentasLineas.add(this.jMenuItemAbrirOrderByPresupuestoVentasLineas);				
			this.jmenuDatosPresupuestoVentasLineas.add(this.jMenuItemMostrarOcultarPresupuestoVentasLineas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoVentasLineas.add(this.jMenuItemGuardarCambiosPresupuestoVentasLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoVentasLineas.add(this.jmenuArchivoPresupuestoVentasLineas);		
			this.jmenuBarPresupuestoVentasLineas.add(this.jmenuAccionesPresupuestoVentasLineas);		
			this.jmenuBarPresupuestoVentasLineas.add(this.jmenuDatosPresupuestoVentasLineas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoVentasLineas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoVentasLineas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadPresupuestoVentasLineas.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdCiudadPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdCiudadPresupuestoVentasLineas.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadPresupuestoVentasLineas,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdLineaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdLineaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaPresupuestoVentasLineas,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas = new JLabelMe();
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas.setText("Linea :");
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaCategoriaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCategoriaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Categoria ");
		this.jButtonFK_IdLineaCategoriaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdLineaCategoriaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdLineaCategoriaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Categoria ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCategoriaPresupuestoVentasLineas,"buscar_button","Buscar Por Linea Categoria ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCategoriaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas = new JLabelMe();
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setText("Linea Categoria :");
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaGrupoPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaGrupoPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Grupo ");
		this.jButtonFK_IdLineaGrupoPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdLineaGrupoPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdLineaGrupoPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Grupo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaGrupoPresupuestoVentasLineas,"buscar_button","Buscar Por Linea Grupo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaGrupoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas = new JLabelMe();
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setText("Linea Grupo :");
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaMarcaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaMarcaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Marca ");
		this.jButtonFK_IdLineaMarcaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdLineaMarcaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdLineaMarcaPresupuestoVentasLineas.setToolTipText("Buscar Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaMarcaPresupuestoVentasLineas,"buscar_button","Buscar Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaMarcaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas = new JLabelMe();
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setText("Linea Marca :");
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setToolTipText("Linea Marca");
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisPresupuestoVentasLineas.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdPaisPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdPaisPresupuestoVentasLineas.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisPresupuestoVentasLineas,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas = new JLabelMe();
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas.setText("Pais :");
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorPresupuestoVentasLineas.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdVendedorPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdVendedorPresupuestoVentasLineas.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorPresupuestoVentasLineas,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaPresupuestoVentasLineas.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonFK_IdZonaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonFK_IdZonaPresupuestoVentasLineas.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaPresupuestoVentasLineas,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas = new JLabelMe();
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas.setText("Zona :");
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresupuestoVentasLineas=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoVentasLineas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentasLineas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentasLineas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoVentasLineas = new PresupuestoVentasLineasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Ventas_lineas DATOS");
			this.jInternalFrameDetalleFormPresupuestoVentasLineas = new PresupuestoVentasLineasDetalleFormJInternalFrame(jDesktopPane,this.presupuestoventaslineasSessionBean.getConGuardarRelaciones(),this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoVentasLineas = null;//new PresupuestoVentasLineasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentasLineas= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoVentasLineas = new JTableMe();      
		
		String sToolTipPresupuestoVentasLineas="";
		sToolTipPresupuestoVentasLineas=PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentasLineas+="(Facturacion.PresupuestoVentasLineas)";
		}
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentasLineas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoVentasLineas.setToolTipText(sToolTipPresupuestoVentasLineas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoVentasLineas);
		this.jTableDatosPresupuestoVentasLineas.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoVentasLineas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoVentasLineas.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoVentasLineas = new JButtonMe();
		this.jButtonDuplicarPresupuestoVentasLineas = new JButtonMe();
		this.jButtonCopiarPresupuestoVentasLineas = new JButtonMe();
		this.jButtonVerFormPresupuestoVentasLineas = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoVentasLineas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas = new JButtonMe();
		this.jButtonCerrarPresupuestoVentasLineas = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentasLineas = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoVentasLineas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas_lineas";
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentasLineas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoVentasLineas=new ReporteDinamicoJInternalFrame(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoVentasLineas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoVentasLineas=new ImportacionJInternalFrame(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoVentasLineas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoVentasLineas = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoVentasLineas.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoVentasLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentasLineas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasLineas,false,this);
			
			//this.cargarOrderByPresupuestoVentasLineas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasLineas,true,this);
			
			//this.cargarOrderByPresupuestoVentasLineas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoVentasLineas.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosPresupuestoVentasLineas.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosPresupuestoVentasLineas.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosPresupuestoVentasLineas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentasLineas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentasLineas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoVentasLineas.setText("Nuevo");
		this.jButtonDuplicarPresupuestoVentasLineas.setText("Duplicar");
		this.jButtonCopiarPresupuestoVentasLineas.setText("Copiar");
		this.jButtonVerFormPresupuestoVentasLineas.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoVentasLineas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.setText("Guardar");
		this.jButtonCerrarPresupuestoVentasLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentasLineas,"nuevo_button","Nuevo",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoVentasLineas,"duplicar_button","Duplicar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoVentasLineas,"copiar_button","Copiar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoVentasLineas,"ver_form","Ver",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoVentasLineas,"nuevorelaciones_button","Nuevo Rel",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentasLineas,"guardarcambiostabla_button","Guardar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentasLineas,"cerrar_button","Salir",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoVentasLineas.setToolTipText("Nuevo"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoVentasLineas.setToolTipText("Duplicar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoVentasLineas.setToolTipText("Copiar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoVentasLineas.setToolTipText("Ver"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoVentasLineas.setToolTipText("Nuevo Rel"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.setToolTipText("Guardar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentasLineas.setToolTipText("Salir"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentasLineas";
		inputMap = this.jButtonNuevoPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentasLineas"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoVentasLineas";
		inputMap = this.jButtonDuplicarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoVentasLineas"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoVentasLineas";
		inputMap = this.jButtonCopiarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoVentasLineas"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoVentasLineas";
		inputMap = this.jButtonVerFormPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoVentasLineas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoVentasLineas";
		inputMap = this.jButtonNuevoRelacionesPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoVentasLineas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoVentasLineas";
		inputMap = this.jButtonModificarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoVentasLineas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentasLineas";
		inputMap = this.jButtonCerrarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentasLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentasLineas";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentasLineas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoVentasLineas.setName("jPanelParametrosReportesPresupuestoVentasLineas"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoVentasLineas.setName("jPanelParametrosReportesAccionesPresupuestoVentasLineas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoVentasLineas = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoVentasLineas.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoVentasLineas.setToolTipText("Recargar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoVentasLineas,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoVentasLineas = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setToolTipText("Procesar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentasLineas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoVentasLineas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoVentasLineas.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoVentasLineas.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentasLineas.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoVentasLineas.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentasLineas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoVentasLineas = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentasLineas.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoVentasLineas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoVentasLineas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoVentasLineas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoVentasLineas = new JButtonMe();
		//this.jButtonAnterioresPresupuestoVentasLineas.setText("<<");
        this.jButtonAnterioresPresupuestoVentasLineas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoVentasLineas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoVentasLineas = new JButtonMe();
		//this.jButtonSiguientesPresupuestoVentasLineas.setText(">>");
        this.jButtonSiguientesPresupuestoVentasLineas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoVentasLineas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas,"nuevoguardarcambios_button","Nue",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoVentasLineas";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoVentasLineas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoVentasLineas";
		inputMap = this.jButtonRecargarInformacionPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoVentasLineas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoVentasLineas";
		inputMap = this.jButtonSiguientesPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoVentasLineas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoVentasLineas";
		inputMap = this.jButtonAnterioresPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoVentasLineas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoVentasLineas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoVentasLineas.setMinimumSize(new Dimension(this.getWidth(),PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentasLineas.setMaximumSize(new Dimension(this.getWidth(),PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentasLineas.setPreferredSize(new Dimension(this.getWidth(),PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasLineasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoVentasLineas = new GridBagLayout();

			this.jPanelPaginacionPresupuestoVentasLineas.setLayout(gridaBagLayoutPaginacionPresupuestoVentasLineas);						
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonAnterioresPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					
						
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
			
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonNuevoGuardarCambiosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
						
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonSiguientesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonNuevoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
						
			
			
			if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
				this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonGuardarCambiosTablaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			}
			
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonDuplicarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonCopiarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonVerFormPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoVentasLineas.add(this.jButtonCerrarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		
		this.jButtonRecargarInformacionPresupuestoVentasLineas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentasLineas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentasLineas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentasLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentasLineas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoVentasLineas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentasLineas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentasLineas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoVentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoVentasLineas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoVentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoVentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoVentasLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoVentasLineas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoVentasLineas.setLayout(gridaBagParametrosReportesPresupuestoVentasLineas);
			this.jPanelParametrosReportesAccionesPresupuestoVentasLineas.setLayout(gridaBagParametrosReportesAccionesPresupuestoVentasLineas);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoVentasLineas.setLayout(gridaBagParametrosAuxiliar1PresupuestoVentasLineas);
			this.jPanelParametrosAuxiliar2PresupuestoVentasLineas.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentasLineas);
			this.jPanelParametrosAuxiliar3PresupuestoVentasLineas.setLayout(gridaBagParametrosAuxiliar3PresupuestoVentasLineas);
			this.jPanelParametrosAuxiliar4PresupuestoVentasLineas.setLayout(gridaBagParametrosAuxiliar4PresupuestoVentasLineas);
			//this.jPanelParametrosAuxiliar5PresupuestoVentasLineas.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentasLineas);			
			
			
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jButtonRecargarInformacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasLineas.add(this.jComboBoxTiposPaginacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasLineas.add(this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasLineas.add(this.jComboBoxTiposArchivosReportesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jPanelParametrosAuxiliar1PresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoVentasLineas.add(this.jComboBoxTiposReportesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);																		
			
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoVentasLineas.add(this.jComboBoxTiposGraficosReportesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jPanelParametrosAuxiliar4PresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jComboBoxTiposReportesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jCheckBoxGenerarReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jPanelParametrosAuxiliar2PresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jLabelAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jButtonAbrirOrderByPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jComboBoxTiposSeleccionarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			
			
			/*
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jCheckBoxConGraficoReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasLineas.add(this.jCheckBoxSeleccionarTodosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);															
				
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasLineas.add(this.jCheckBoxSeleccionadosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);															
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasLineas.add(this.jCheckBoxConGraficoReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jPanelParametrosAuxiliar3PresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jComboBoxTiposAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
	
				
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasLineas.add(this.jTextFieldValorCampoGeneralPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoVentasLineas = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoVentasLineas.setLayout(gridaBagLayoutDatosPresupuestoVentasLineas);
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoVentasLineas.add(this.jTableDatosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoVentasLineas.setViewportView(this.jTableDatosPresupuestoVentasLineas);
		this.jTableDatosPresupuestoVentasLineas.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoVentasLineas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentasLineas= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentasLineas.setLayout(gridaBagLayoutAccionesPresupuestoVentasLineas);
		
		
		/*	
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
			
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonNuevoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdCiudadPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdCiudadPresupuestoVentasLineas.add(jLabelid_ciudadFK_IdCiudadPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdCiudadPresupuestoVentasLineas.add(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdCiudadPresupuestoVentasLineas.add(jButtonFK_IdCiudadPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdLineaPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdLineaPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdLineaPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdLineaPresupuestoVentasLineas.add(jLabelid_lineaFK_IdLineaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdLineaPresupuestoVentasLineas.add(jComboBoxid_lineaFK_IdLineaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdLineaPresupuestoVentasLineas.add(jButtonFK_IdLineaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("2.-Por Linea ", jPanelFK_IdLineaPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCategoriaPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdLineaCategoriaPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdLineaCategoriaPresupuestoVentasLineas.add(jLabelid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdLineaCategoriaPresupuestoVentasLineas.add(jComboBoxid_linea_categoriaFK_IdLineaCategoriaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdLineaCategoriaPresupuestoVentasLineas.add(jButtonFK_IdLineaCategoriaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("3.-Por Linea Categoria ", jPanelFK_IdLineaCategoriaPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaGrupoPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdLineaGrupoPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdLineaGrupoPresupuestoVentasLineas.add(jLabelid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdLineaGrupoPresupuestoVentasLineas.add(jComboBoxid_linea_grupoFK_IdLineaGrupoPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdLineaGrupoPresupuestoVentasLineas.add(jButtonFK_IdLineaGrupoPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("4.-Por Linea Grupo ", jPanelFK_IdLineaGrupoPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaMarcaPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdLineaMarcaPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdLineaMarcaPresupuestoVentasLineas.add(jLabelid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdLineaMarcaPresupuestoVentasLineas.add(jComboBoxid_linea_marcaFK_IdLineaMarcaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdLineaMarcaPresupuestoVentasLineas.add(jButtonFK_IdLineaMarcaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("5.-Por Linea Marca ", jPanelFK_IdLineaMarcaPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPaisPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdPaisPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdPaisPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdPaisPresupuestoVentasLineas.add(jLabelid_paisFK_IdPaisPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdPaisPresupuestoVentasLineas.add(jComboBoxid_paisFK_IdPaisPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdPaisPresupuestoVentasLineas.add(jButtonFK_IdPaisPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("6.-Por Pais ", jPanelFK_IdPaisPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdVendedorPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdVendedorPresupuestoVentasLineas.add(jLabelid_vendedorFK_IdVendedorPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdVendedorPresupuestoVentasLineas.add(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdVendedorPresupuestoVentasLineas.add(jButtonFK_IdVendedorPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("7.-Por Vendedor ", jPanelFK_IdVendedorPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdZonaPresupuestoVentasLineas= new GridBagLayout();
		gridaBagLayoutFK_IdZonaPresupuestoVentasLineas.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaPresupuestoVentasLineas.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaPresupuestoVentasLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaPresupuestoVentasLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaPresupuestoVentasLineas.setLayout(gridaBagLayoutFK_IdZonaPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		jPanelFK_IdZonaPresupuestoVentasLineas.add(jLabelid_zonaFK_IdZonaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
		jPanelFK_IdZonaPresupuestoVentasLineas.add(jComboBoxid_zonaFK_IdZonaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasLineas.gridy = 1;
		gridBagConstraintsPresupuestoVentasLineas.gridx =1;
		jPanelFK_IdZonaPresupuestoVentasLineas.add(jButtonFK_IdZonaPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);

		jTabbedPaneBusquedasPresupuestoVentasLineas.addTab("8.-Por Zona ", jPanelFK_IdZonaPresupuestoVentasLineas);
		jTabbedPaneBusquedasPresupuestoVentasLineas.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentasLineas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentasLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;		
		//this.gridBagConstraintsPresupuestoVentasLineas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoVentasLineas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;		
			this.gridBagConstraintsPresupuestoVentasLineas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);								
		
		
		/*
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		*/		
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =0;
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentasLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
				
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoVentasLineasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoVentasLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentasLineas = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoVentasLineas.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoVentasLineas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoVentasLineas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoVentasLineas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoVentasLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setName("jPanelReporteDinamicoPresupuestoVentasLineas"); 
		
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoVentasLineas.setLayout(gridaBagLayoutReporteDinamicoPresupuestoVentasLineas);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentasLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoVentasLineas = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoVentasLineas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelColumnasSelectReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoVentasLineas = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoVentasLineas=new JScrollPane(this.jListColumnasSelectReportePresupuestoVentasLineas);
			
			this.jScrollColumnasSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jListColumnasSelectReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jScrollColumnasSelectReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoVentasLineas = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoVentasLineas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoVentasLineas = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoVentasLineas=new JScrollPane(this.jListRelacionesSelectReportePresupuestoVentasLineas);
			
			this.jScrollRelacionesSelectReportePresupuestoVentasLineas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentasLineas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentasLineas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoVentasLineas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoVentasLineas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelConGraficoDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jCheckBoxConGraficoDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelColumnaCategoriaGraficoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoVentasLineas = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoVentasLineas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelColumnaCategoriaValorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jComboBoxColumnaCategoriaValorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoVentasLineas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelColumnasValoresGraficoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoVentasLineas = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoVentasLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoVentasLineas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoVentasLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentasLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentasLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoVentasLineas=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoVentasLineas);
			
			this.jScrollColumnasValoresGraficoPresupuestoVentasLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentasLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentasLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jListColumnasSelectReportePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jScrollColumnasValoresGraficoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasLineas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas.setToolTipText("Generar EXCEL"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jComboBoxTiposReportesDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoVentasLineas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoVentasLineas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoVentasLineas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoVentasLineas.setToolTipText("Generar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jButtonGenerarReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoVentasLineas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoVentasLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoVentasLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoVentasLineas.setToolTipText("Cancelar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasLineas.add(this.jButtonCerrarReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentasLineas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas= new JScrollPane(jPanelReporteDinamicoPresupuestoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentasLineas);
		this.jInternalFrameReporteDinamicoPresupuestoVentasLineas.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoVentasLineas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoVentasLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoVentasLineas.setName("jPanelImportacionPresupuestoVentasLineas"); 
		
		this.jPanelImportacionPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoVentasLineas.setLayout(gridaBagLayoutImportacionPresupuestoVentasLineas);
		
		
		this.jInternalFrameImportacionPresupuestoVentasLineas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoVentasLineas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoVentasLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentasLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentasLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentasLineas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentasLineas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoVentasLineas = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoVentasLineas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jLabelArchivoImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoVentasLineas = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoVentasLineas.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoVentasLineas = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoVentasLineas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoVentasLineas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoVentasLineas.setToolTipText("Generar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jButtonAbrirImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoVentasLineas = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoVentasLineas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jLabelPathArchivoImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoVentasLineas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoVentasLineas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentasLineas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentasLineas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jTextFieldPathArchivoImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoVentasLineas = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoVentasLineas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoVentasLineas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoVentasLineas.setToolTipText("Generar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jButtonGenerarImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoVentasLineas = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoVentasLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoVentasLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoVentasLineas.setToolTipText("Cancelar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasLineas.add(this.jButtonCerrarImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoVentasLineas = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoVentasLineas= new JScrollPane(jPanelImportacionPresupuestoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoVentasLineas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoVentasLineas);
		this.jInternalFrameImportacionPresupuestoVentasLineas.getContentPane().add(this.jScrollPanelImportacionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoVentasLineas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoVentasLineas = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoVentasLineas.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoVentasLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentasLineas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoVentasLineas";
			inputMap = this.jButtonAbrirOrderByPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoVentasLineas"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoVentasLineas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoVentasLineas.setName("jPanelOrderByPresupuestoVentasLineas"); 
			
			this.jPanelOrderByPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoVentasLineas.setLayout(gridaBagLayoutOrderByPresupuestoVentasLineas);
			
			
			this.jTableDatosPresupuestoVentasLineasOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoVentasLineasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentasLineasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoVentasLineasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoVentasLineasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoVentasLineasOrderBy.setViewportView(this.jTableDatosPresupuestoVentasLineasOrderBy);
			this.jTableDatosPresupuestoVentasLineasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoVentasLineasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoVentasLineas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoVentasLineas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoVentasLineas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoVentasLineas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoVentasLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoVentasLineas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoVentasLineas.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoVentasLineas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoVentasLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoVentasLineas.setResizable(true);
			this.jInternalFrameOrderByPresupuestoVentasLineas.setClosable(true);
			this.jInternalFrameOrderByPresupuestoVentasLineas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoVentasLineas.ipady =150;
				
			this.jPanelOrderByPresupuestoVentasLineas.add(jScrollPanelDatosPresupuestoVentasLineasOrderBy, this.gridBagConstraintsPresupuestoVentasLineas);//this.jTableDatosPresupuestoVentasLineasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoVentasLineas = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoVentasLineas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoVentasLineas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoVentasLineas.setToolTipText("Cancelar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoVentasLineas.add(this.jButtonCerrarOrderByPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoVentasLineas = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoVentasLineas= new JScrollPane(jPanelOrderByPresupuestoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoVentasLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoVentasLineas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoVentasLineas);
			
			this.jInternalFrameOrderByPresupuestoVentasLineas.getContentPane().add(this.jScrollPanelOrderByPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoVentasLineas = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoventaslineasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoVentasLineas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoVentasLineas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoVentasLineas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoVentasLineas.getRowHeight();//PresupuestoVentasLineasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.isSelected()) {
					iHeightTable=PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentasLineas.isSelected()) {
					iHeightTable=PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoVentasLineas!=null && this.jInternalFrameOrderByPresupuestoVentasLineas.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoVentasLineas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoVentasLineas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoventaslineasLogic.getPresupuestoVentasLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventaslineass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoVentasLineas> TraerPresupuestoVentasLineasBeans(List<PresupuestoVentasLineas> presupuestoventaslineass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoVentasLineas presupuestoventaslineas:presupuestoventaslineass) {
					
				if(!(PresupuestoVentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoVentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoventaslineas.setsDetalleGeneralEntityReporte(PresupuestoVentasLineasConstantesFunciones.getPresupuestoVentasLineasDescripcion(presupuestoventaslineas));
										
						
					
						
					
				} else  {
							
					//presupuestoventaslineas.setsDetalleGeneralEntityReporte(presupuestoventaslineas.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoventaslineasbeans.add(presupuestoventaslineasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoventaslineass;
    }
	//PARA REPORTES FIN
}
