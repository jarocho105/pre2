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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuEmpresaConstantesFunciones;

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
public class ParametroFactuEmpresaJInternalFrame extends ParametroFactuEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFactuEmpresa;
	
	protected JMenuBar jmenuBarParametroFactuEmpresa;
	
	protected JMenu jmenuParametroFactuEmpresa;
	protected JMenu jmenuDatosParametroFactuEmpresa;
	protected JMenu jmenuArchivoParametroFactuEmpresa;
	protected JMenu jmenuAccionesParametroFactuEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuEmpresa;	
	protected GridBagConstraints gridBagConstraintsParametroFactuEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFactuEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFactuEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFactuEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpresaBeanSwingJInternalFrame empresaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresaorigen="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccionorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionorigen="";

	protected BodegaBeanSwingJInternalFrame bodegaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaorigen="";

	protected ClienteBeanSwingJInternalFrame clienteorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteorigen="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected SucursalBeanSwingJInternalFrame sucursaldestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursaldestino="";

	protected TransaccionBeanSwingJInternalFrame transacciondestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciondestino="";

	protected BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegadestino="";

	protected ClienteBeanSwingJInternalFrame clientedestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clientedestino="";

	protected EmpresaBeanSwingJInternalFrame empresamultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresamultidestino="";

	protected SucursalBeanSwingJInternalFrame sucursalmultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmultidestino="";

	protected TransaccionBeanSwingJInternalFrame transaccionmultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionmultidestino="";

	protected BodegaBeanSwingJInternalFrame bodegamultiorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamultiorigen="";

	protected BodegaBeanSwingJInternalFrame bodegamultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamultidestino="";
	
	public ParametroFactuEmpresaSessionBean parametrofactuempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpresaSessionBean empresaorigenSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccionorigenSessionBean;
	public BodegaSessionBean bodegaorigenSessionBean;
	public ClienteSessionBean clienteorigenSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public SucursalSessionBean sucursaldestinoSessionBean;
	public TransaccionSessionBean transacciondestinoSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public ClienteSessionBean clientedestinoSessionBean;
	public EmpresaSessionBean empresamultidestinoSessionBean;
	public SucursalSessionBean sucursalmultidestinoSessionBean;
	public TransaccionSessionBean transaccionmultidestinoSessionBean;
	public BodegaSessionBean bodegamultiorigenSessionBean;
	public BodegaSessionBean bodegamultidestinoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFactuEmpresa> parametrofactuempresas;		
	public List<ParametroFactuEmpresa> parametrofactuempresasEliminados;	
	public List<ParametroFactuEmpresa> parametrofactuempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFactuEmpresa;		
	protected JButton jButtonAbrirOrderByParametroFactuEmpresa;
	
	
	//protected JPanel jPanelOrderByParametroFactuEmpresa;
	//public JScrollPane jScrollPanelOrderByParametroFactuEmpresa;	
	//protected JButton jButtonCerrarOrderByParametroFactuEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFactuEmpresaLogic parametrofactuempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFactuEmpresa;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuEmpresa;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFactuEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFactuEmpresa;
	//public JScrollPane jScrollPanelImportacionParametroFactuEmpresa;
	
	
	
	protected JPanel jPanelAccionesParametroFactuEmpresa;
	
    protected JPanel jPanelPaginacionParametroFactuEmpresa;
    protected JPanel jPanelParametrosReportesParametroFactuEmpresa;
	protected JPanel jPanelParametrosReportesAccionesParametroFactuEmpresa;
	
	
	
	
	
	

	protected JPanel jPanelCamposInicioorigenParametroFactuEmpresa;
	protected Integer iXPanelCamposInicioorigenParametroFactuEmpresa=0;
	protected Integer iYPanelCamposInicioorigenParametroFactuEmpresa=0;

	protected JPanel jPanelCamposIniciodestinoParametroFactuEmpresa;
	protected Integer iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
	protected Integer iYPanelCamposIniciodestinoParametroFactuEmpresa=0;

	protected JPanel jPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	protected Integer iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
	protected Integer iYPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFactuEmpresa;
	protected JPanel jPanelParametrosAuxiliar2ParametroFactuEmpresa;
	protected JPanel jPanelParametrosAuxiliar3ParametroFactuEmpresa;
	protected JPanel jPanelParametrosAuxiliar4ParametroFactuEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFactuEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFactuEmpresa;
	//protected JPanel jPanelImportacionParametroFactuEmpresa;
	
	
	public JTable jTableDatosParametroFactuEmpresa;
	
	
	
	//public JTable jTableDatosParametroFactuEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFactuEmpresa;
	protected JButton jButtonDuplicarParametroFactuEmpresa;
	protected JButton jButtonCopiarParametroFactuEmpresa;
	protected JButton jButtonVerFormParametroFactuEmpresa;
	protected JButton jButtonNuevoRelacionesParametroFactuEmpresa;
	protected JButton jButtonModificarParametroFactuEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaParametroFactuEmpresa;
	protected JButton jButtonCerrarParametroFactuEmpresa;
	
	
	protected JButton jButtonRecargarInformacionParametroFactuEmpresa;
	protected JButton jButtonProcesarInformacionParametroFactuEmpresa;
	
	
	protected JButton jButtonAnterioresParametroFactuEmpresa;
	protected JButton jButtonSiguientesParametroFactuEmpresa;
	protected JButton jButtonNuevoGuardarCambiosParametroFactuEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFactuEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoParametroFactuEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFactuEmpresa;
	//protected JButton jButtonGenerarImportacionParametroFactuEmpresa;
	//protected JButton jButtonCerrarImportacionParametroFactuEmpresa;
	//protected JFileChooser jFileChooserImportacionParametroFactuEmpresa;
	//protected File fileImportacionParametroFactuEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuEmpresa;
	protected JButton jButtonDuplicarToolBarParametroFactuEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarParametroFactuEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFactuEmpresa;
	protected JButton jButtonCopiarToolBarParametroFactuEmpresa;
	protected JButton jButtonVerFormToolBarParametroFactuEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFactuEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuEmpresa;
	protected JButton jButtonCerrarToolBarParametroFactuEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFactuEmpresa;
	protected JButton jButtonProcesarInformacionToolBarParametroFactuEmpresa;
	protected JButton jButtonAnterioresToolBarParametroFactuEmpresa;
	protected JButton jButtonSiguientesToolBarParametroFactuEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFactuEmpresa;
	protected JButton jButtonAbrirOrderByToolBarParametroFactuEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuEmpresa;
	protected JMenuItem jMenuItemDuplicarParametroFactuEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFactuEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFactuEmpresa;
	protected JMenuItem jMenuItemCopiarParametroFactuEmpresa;
	protected JMenuItem jMenuItemVerFormParametroFactuEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuEmpresa;
	protected JMenuItem jMenuItemCerrarParametroFactuEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFactuEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFactuEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuEmpresa;
	protected JMenuItem jMenuItemAnterioresParametroFactuEmpresa;
	protected JMenuItem jMenuItemSiguientesParametroFactuEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByParametroFactuEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFactuEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosParametroFactuEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFactuEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFactuEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFactuEmpresa;
	protected JTextField jTextFieldValorCampoGeneralParametroFactuEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFactuEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteParametroFactuEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteParametroFactuEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFactuEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFactuEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFactuEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFactuEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFactuEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionParametroFactuEmpresa;	
	//public JLabel jLabelPathArchivoImportacionParametroFactuEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFactuEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFactuEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFactuEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFactuEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFactuEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFactuEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFactuEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFactuEmpresa;
	public JPanel jPanelFK_IdBodegaDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdBodegaDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdBodegaMultiDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdBodegaMultiOrigenParametroFactuEmpresa;
	public JButton jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa;
	public JPanel jPanelFK_IdBodegaOrigenParametroFactuEmpresa;
	public JButton jButtonFK_IdBodegaOrigenParametroFactuEmpresa;
	public JPanel jPanelFK_IdClienteDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdClienteDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdClienteOrigenParametroFactuEmpresa;
	public JButton jButtonFK_IdClienteOrigenParametroFactuEmpresa;
	public JPanel jPanelFK_IdEmpresaDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdEmpresaDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdEmpresaMultiDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdEmpresaOrigenParametroFactuEmpresa;
	public JButton jButtonFK_IdEmpresaOrigenParametroFactuEmpresa;
	public JPanel jPanelFK_IdSucursalParametroFactuEmpresa;
	public JButton jButtonFK_IdSucursalParametroFactuEmpresa;
	public JPanel jPanelFK_IdSucursalDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdSucursalDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdSucursalMultiDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdTransaccionDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdTransaccionDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdTransaccionMultiDestinoParametroFactuEmpresa;
	public JButton jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa;
	public JPanel jPanelFK_IdTransaccionOrigenParametroFactuEmpresa;
	public JButton jButtonFK_IdTransaccionOrigenParametroFactuEmpresa;
	
	public JPanel jPanelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa;
	public JLabel jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa;
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa;
	public JLabel jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa;
	public JButton jButtonid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa;
	public JLabel jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa;
	public JButton jButtonid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa;
	public JLabel jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa;
	public JButton jButtonid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa;
	public JLabel jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa;
	public JButton jButtonid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa;
	
	public JPanel jPanelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa;
	public JLabel jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa;
	public JButton jButtonid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa;
	
	public JPanel jPanelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa;
	public JLabel jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa;
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa;
	public JLabel jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa;
	public JButton jButtonid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa;
	public JLabel jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa;
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursalFK_IdSucursalParametroFactuEmpresa;
	public JLabel jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa;
	public JButton jButtonid_sucursalFK_IdSucursalParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa;
	public JLabel jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa;
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa;
	public JLabel jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa;
	public JButton jButtonid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa;
	public JButton jButtonid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa;
	public JButton jButtonid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa;
	public JButton jButtonid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFactuEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFactuEmpresa)	{
		this.jButtonRecargarInformacionParametroFactuEmpresa = jButtonRecargarInformacionParametroFactuEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionParametroFactuEmpresa() {
		return this.jButtonProcesarInformacionParametroFactuEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuEmpresa)	{
		this.jButtonProcesarInformacionParametroFactuEmpresa = jButtonProcesarInformacionParametroFactuEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFactuEmpresa() {
		return this.jButtonRecargarInformacionParametroFactuEmpresa;
	}
	
	
	public List<ParametroFactuEmpresa> getparametrofactuempresas() {
		return this.parametrofactuempresas;
	}

	public void setparametrofactuempresas(List<ParametroFactuEmpresa> parametrofactuempresas) {
		this.parametrofactuempresas = parametrofactuempresas;
	}
	
	public List<ParametroFactuEmpresa> getparametrofactuempresasAux() {
		return this.parametrofactuempresasAux;
	}

	public void setparametrofactuempresasAux(List<ParametroFactuEmpresa> parametrofactuempresasAux) {
		this.parametrofactuempresasAux = parametrofactuempresasAux;
	}
	
	public List<ParametroFactuEmpresa> getparametrofactuempresasEliminados() {
		return this.parametrofactuempresasEliminados;
	}

	public void setParametroFactuEmpresasEliminados(List<ParametroFactuEmpresa> parametrofactuempresasEliminados) {
		this.parametrofactuempresasEliminados = parametrofactuempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFactuEmpresa() {
		return jComboBoxTiposSeleccionarParametroFactuEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFactuEmpresa(
			JComboBox jComboBoxTiposSeleccionarParametroFactuEmpresa) {
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa = jComboBoxTiposSeleccionarParametroFactuEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFactuEmpresa() {
		return jTextFieldValorCampoGeneralParametroFactuEmpresa;
	}

	public void setjTextFieldValorCampoGeneralParametroFactuEmpresa(
			JTextField jTextFieldValorCampoGeneralParametroFactuEmpresa) {
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa = jTextFieldValorCampoGeneralParametroFactuEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFactuEmpresa() {
		return this.jCheckBoxSeleccionarTodosParametroFactuEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosParametroFactuEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosParametroFactuEmpresa) {
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa = jCheckBoxSeleccionarTodosParametroFactuEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFactuEmpresa() {
		return this.jCheckBoxSeleccionadosParametroFactuEmpresa;
	}

	public void setjCheckBoxSeleccionadosParametroFactuEmpresa(
			JCheckBox jCheckBoxSeleccionadosParametroFactuEmpresa) {
		this.jCheckBoxSeleccionadosParametroFactuEmpresa = jCheckBoxSeleccionadosParametroFactuEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFactuEmpresa() {
		return this.jComboBoxTiposArchivosReportesParametroFactuEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFactuEmpresa(
			JComboBox jComboBoxTiposArchivosReportesParametroFactuEmpresa) {
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa = jComboBoxTiposArchivosReportesParametroFactuEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFactuEmpresa() {
		return this.jComboBoxTiposReportesParametroFactuEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFactuEmpresa(
			JComboBox jComboBoxTiposReportesParametroFactuEmpresa) {
		this.jComboBoxTiposReportesParametroFactuEmpresa = jComboBoxTiposReportesParametroFactuEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFactuEmpresa() {
	//	return jComboBoxTiposReportesDinamicoParametroFactuEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFactuEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFactuEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa = jComboBoxTiposReportesDinamicoParametroFactuEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa = jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFactuEmpresa() {
		return this.jComboBoxTiposGraficosReportesParametroFactuEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFactuEmpresa(
			JComboBox jComboBoxTiposGraficosReportesParametroFactuEmpresa) {
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa = jComboBoxTiposGraficosReportesParametroFactuEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFactuEmpresa() {
		return this.jComboBoxTiposPaginacionParametroFactuEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFactuEmpresa(
			JComboBox jComboBoxTiposPaginacionParametroFactuEmpresa) {
		this.jComboBoxTiposPaginacionParametroFactuEmpresa = jComboBoxTiposPaginacionParametroFactuEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFactuEmpresa() {
		return this.jComboBoxTiposRelacionesParametroFactuEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuEmpresa() {
		return this.jComboBoxTiposAccionesParametroFactuEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuEmpresa(
			JComboBox jComboBoxTiposRelacionesParametroFactuEmpresa) {
		this.jComboBoxTiposRelacionesParametroFactuEmpresa = jComboBoxTiposRelacionesParametroFactuEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuEmpresa(
			JComboBox jComboBoxTiposAccionesParametroFactuEmpresa) {
		this.jComboBoxTiposAccionesParametroFactuEmpresa = jComboBoxTiposAccionesParametroFactuEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFactuEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFactuEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFactuEmpresa() {
	//	return jCheckBoxConGraficoDinamicoParametroFactuEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFactuEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFactuEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa = jCheckBoxConGraficoDinamicoParametroFactuEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFactuEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFactuEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa .setBorder(borderResaltar);		
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
		this.parametrofactuempresaSessionBean=new ParametroFactuEmpresaSessionBean();
		
		this.parametrofactuempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Empresa  MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFactuEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFactuEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"nuevo","nuevo","Nuevo"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"duplicar","duplicar","Duplicar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"copiar","copiar","Copiar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"ver_form","ver_form","Ver"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"recargar","recargar","Recargar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFactuEmpresa,this.jTtoolBarParametroFactuEmpresa,
							"cerrar","cerrar","Salir"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFactuEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFactuEmpresa;
			
				this.jButtonProcesarInformacionToolBarParametroFactuEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFactuEmpresa;
				
		//protected JButton jButtonModificarToolBarParametroFactuEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFactuEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFactuEmpresa=new JMenuMe("General");
		this.jmenuArchivoParametroFactuEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFactuEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosParametroFactuEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFactuEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFactuEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFactuEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFactuEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFactuEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFactuEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFactuEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFactuEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFactuEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFactuEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFactuEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFactuEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFactuEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFactuEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFactuEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFactuEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFactuEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFactuEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFactuEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFactuEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFactuEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFactuEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFactuEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFactuEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFactuEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFactuEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFactuEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFactuEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFactuEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFactuEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFactuEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFactuEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFactuEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFactuEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFactuEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFactuEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFactuEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFactuEmpresa.add(this.jMenuItemCerrarParametroFactuEmpresa);
			
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemNuevoParametroFactuEmpresa);
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemNuevoGuardarCambiosParametroFactuEmpresa);
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemNuevoRelacionesParametroFactuEmpresa);
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemGuardarCambiosTablaParametroFactuEmpresa);		
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemDuplicarParametroFactuEmpresa);		
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemCopiarParametroFactuEmpresa);		
			this.jmenuAccionesParametroFactuEmpresa.add(this.jMenuItemVerFormParametroFactuEmpresa);		
			
			this.jmenuDatosParametroFactuEmpresa.add(this.jMenuItemRecargarInformacionParametroFactuEmpresa);				
			this.jmenuDatosParametroFactuEmpresa.add(this.jMenuItemAnterioresParametroFactuEmpresa);				
			this.jmenuDatosParametroFactuEmpresa.add(this.jMenuItemSiguientesParametroFactuEmpresa);				
			this.jmenuDatosParametroFactuEmpresa.add(this.jMenuItemAbrirOrderByParametroFactuEmpresa);				
			this.jmenuDatosParametroFactuEmpresa.add(this.jMenuItemMostrarOcultarParametroFactuEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFactuEmpresa.add(this.jMenuItemGuardarCambiosParametroFactuEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFactuEmpresa.add(this.jmenuArchivoParametroFactuEmpresa);		
			this.jmenuBarParametroFactuEmpresa.add(this.jmenuAccionesParametroFactuEmpresa);		
			this.jmenuBarParametroFactuEmpresa.add(this.jmenuDatosParametroFactuEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFactuEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFactuEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Destino ");
		this.jButtonFK_IdBodegaDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdBodegaDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdBodegaDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Bodega Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setText("Bodega Destino :");
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setToolTipText("Bodega Destino");
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoFK_IdBodegaDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaMultiDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Multi Destino ");
		this.jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Multi Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Bodega Multi Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaMultiDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setText("Bodega Multi Destino :");
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setToolTipText("Bodega Multi Destino");
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_multi_destinoFK_IdBodegaMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaMultiOrigenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaMultiOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Multi Origen ");
		this.jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Multi Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa,"buscar_button","Buscar Por Bodega Multi Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaMultiOrigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa = new JLabelMe();
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setText("Bodega Multi Origen :");
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setToolTipText("Bodega Multi Origen");
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_multi_origenFK_IdBodegaMultiOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaOrigenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Origen ");
		this.jButtonFK_IdBodegaOrigenParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdBodegaOrigenParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdBodegaOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Bodega Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaOrigenParametroFactuEmpresa,"buscar_button","Buscar Por Bodega Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaOrigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa = new JLabelMe();
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setText("Bodega Origen :");
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setToolTipText("Bodega Origen");
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_origenFK_IdBodegaOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Cliente Destino ");
		this.jButtonFK_IdClienteDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdClienteDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdClienteDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Cliente Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Cliente Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setText("Cliente Destino :");
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setToolTipText("Cliente Destino");
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_destinoFK_IdClienteDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteDestinoid_cliente_destinoParametroFactuEmpresa.setFocusable(false);

		this.jPanelFK_IdClienteOrigenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Cliente Origen ");
		this.jButtonFK_IdClienteOrigenParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdClienteOrigenParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdClienteOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Cliente Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteOrigenParametroFactuEmpresa,"buscar_button","Buscar Por Cliente Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteOrigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa = new JLabelMe();
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setText("Cliente Origen :");
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setToolTipText("Cliente Origen");
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_origenFK_IdClienteOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteOrigenid_cliente_origenParametroFactuEmpresa.setFocusable(false);

		this.jPanelFK_IdEmpresaDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Destino ");
		this.jButtonFK_IdEmpresaDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdEmpresaDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdEmpresaDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Empresa Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setText("Empresa Destino :");
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setToolTipText("Empresa Destino");
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoFK_IdEmpresaDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpresaMultiDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Multi Destino ");
		this.jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Multi Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Empresa Multi Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaMultiDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setText("Empresa Multi Destino :");
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setToolTipText("Empresa Multi Destino");
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_multi_destinoFK_IdEmpresaMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpresaOrigenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Origen ");
		this.jButtonFK_IdEmpresaOrigenParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdEmpresaOrigenParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdEmpresaOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Empresa Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaOrigenParametroFactuEmpresa,"buscar_button","Buscar Por Empresa Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaOrigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa = new JLabelMe();
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setText("Empresa Origen :");
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setToolTipText("Empresa Origen");
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_origenFK_IdEmpresaOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal ");
		this.jButtonFK_IdSucursalParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdSucursalParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdSucursalParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalParametroFactuEmpresa,"buscar_button","Buscar Por Sucursal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa = new JLabelMe();
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa.setText("Sucursal :");
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa.setToolTipText("Sucursal");
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFK_IdSucursalParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFK_IdSucursalParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal Destino ");
		this.jButtonFK_IdSucursalDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdSucursalDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdSucursalDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Sucursal Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setText("Sucursal Destino :");
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setToolTipText("Sucursal Destino");
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_destinoFK_IdSucursalDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalMultiDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal Multi Destino ");
		this.jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Sucursal Multi Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Sucursal Multi Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalMultiDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setText("Sucursal Multi Destino :");
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setToolTipText("Sucursal Multi Destino");
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_multi_destinoFK_IdSucursalMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Destino ");
		this.jButtonFK_IdTransaccionDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdTransaccionDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdTransaccionDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Transaccion Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setText("Transaccion Destino :");
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setToolTipText("Transaccion Destino");
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_destinoFK_IdTransaccionDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionMultiDestinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Multi Destino ");
		this.jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Multi Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa,"buscar_button","Buscar Por Transaccion Multi Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionMultiDestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa = new JLabelMe();
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setText("Transaccion Multi Destino :");
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setToolTipText("Transaccion Multi Destino");
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_multi_destinoFK_IdTransaccionMultiDestinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionOrigenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Origen ");
		this.jButtonFK_IdTransaccionOrigenParametroFactuEmpresa= new JButtonMe();
		this.jButtonFK_IdTransaccionOrigenParametroFactuEmpresa.setText("Buscar");
		this.jButtonFK_IdTransaccionOrigenParametroFactuEmpresa.setToolTipText("Buscar Por Transaccion Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionOrigenParametroFactuEmpresa,"buscar_button","Buscar Por Transaccion Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionOrigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa = new JLabelMe();
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setText("Transaccion Origen :");
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setToolTipText("Transaccion Origen");
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_origenFK_IdTransaccionOrigenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFactuEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFactuEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroFactuEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroFactuEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFactuEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFactuEmpresa = new ParametroFactuEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Empresa  DATOS");
			this.jInternalFrameDetalleFormParametroFactuEmpresa = new ParametroFactuEmpresaDetalleFormJInternalFrame(jDesktopPane,this.parametrofactuempresaSessionBean.getConGuardarRelaciones(),this.parametrofactuempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFactuEmpresa = null;//new ParametroFactuEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuEmpresa= new GridBagLayout();
		
		
		this.jTableDatosParametroFactuEmpresa = new JTableMe();      
		
		String sToolTipParametroFactuEmpresa="";
		sToolTipParametroFactuEmpresa=ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuEmpresa+="(Facturacion.ParametroFactuEmpresa)";
		}
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFactuEmpresa.setToolTipText(sToolTipParametroFactuEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFactuEmpresa);
		this.jTableDatosParametroFactuEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFactuEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFactuEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosParametroFactuEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFactuEmpresa = new JButtonMe();
		this.jButtonDuplicarParametroFactuEmpresa = new JButtonMe();
		this.jButtonCopiarParametroFactuEmpresa = new JButtonMe();
		this.jButtonVerFormParametroFactuEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFactuEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa = new JButtonMe();
		this.jButtonCerrarParametroFactuEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFactuEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioorigenParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodestinoParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Empresa ";
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioorigenParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Origen"));
		this.jPanelCamposInicioorigenParametroFactuEmpresa.setName("jPanelCamposFinorigenParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioorigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));
		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setName("jPanelCamposFindestinoParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Multi Destino"));
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setName("jPanelCamposFinmulti_destinoParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroFactuEmpresa=new ReporteDinamicoJInternalFrame(ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFactuEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFactuEmpresa=new ImportacionJInternalFrame(ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFactuEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFactuEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFactuEmpresa.setText("Orden");
		this.jButtonAbrirOrderByParametroFactuEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuEmpresa,false,this);
			
			//this.cargarOrderByParametroFactuEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuEmpresa,true,this);
			
			//this.cargarOrderByParametroFactuEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFactuEmpresa.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosParametroFactuEmpresa.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosParametroFactuEmpresa.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosParametroFactuEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFactuEmpresa.setText("Nuevo");
		this.jButtonDuplicarParametroFactuEmpresa.setText("Duplicar");
		this.jButtonCopiarParametroFactuEmpresa.setText("Copiar");
		this.jButtonVerFormParametroFactuEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesParametroFactuEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.setText("Guardar");
		this.jButtonCerrarParametroFactuEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuEmpresa,"nuevo_button","Nuevo",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFactuEmpresa,"duplicar_button","Duplicar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFactuEmpresa,"copiar_button","Copiar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFactuEmpresa,"ver_form","Ver",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFactuEmpresa,"nuevorelaciones_button","Nuevo Rel",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuEmpresa,"guardarcambiostabla_button","Guardar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuEmpresa,"cerrar_button","Salir",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFactuEmpresa.setToolTipText("Nuevo"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFactuEmpresa.setToolTipText("Duplicar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFactuEmpresa.setToolTipText("Copiar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFactuEmpresa.setToolTipText("Ver"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFactuEmpresa.setToolTipText("Nuevo Rel"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.setToolTipText("Guardar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuEmpresa.setToolTipText("Salir"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuEmpresa";
		inputMap = this.jButtonNuevoParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFactuEmpresa";
		inputMap = this.jButtonDuplicarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFactuEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFactuEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarParametroFactuEmpresa";
		inputMap = this.jButtonCopiarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFactuEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFactuEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFactuEmpresa";
		inputMap = this.jButtonVerFormParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFactuEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFactuEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFactuEmpresa";
		inputMap = this.jButtonNuevoRelacionesParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFactuEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFactuEmpresa";
		inputMap = this.jButtonModificarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFactuEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuEmpresa";
		inputMap = this.jButtonCerrarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFactuEmpresa.setName("jPanelParametrosReportesParametroFactuEmpresa"); 
		
		this.jPanelParametrosReportesAccionesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFactuEmpresa.setName("jPanelParametrosReportesAccionesParametroFactuEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFactuEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionParametroFactuEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionParametroFactuEmpresa.setToolTipText("Recargar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFactuEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFactuEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionParametroFactuEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionParametroFactuEmpresa.setToolTipText("Procesar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFactuEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFactuEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFactuEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFactuEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFactuEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFactuEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFactuEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFactuEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFactuEmpresa = new JLabelMe();
		
		this.jLabelAccionesParametroFactuEmpresa.setText("Acciones");		
		this.jLabelAccionesParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFactuEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFactuEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFactuEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFactuEmpresa = new JButtonMe();
		//this.jButtonAnterioresParametroFactuEmpresa.setText("<<");
        this.jButtonAnterioresParametroFactuEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFactuEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFactuEmpresa = new JButtonMe();
		//this.jButtonSiguientesParametroFactuEmpresa.setText(">>");
        this.jButtonSiguientesParametroFactuEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFactuEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFactuEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFactuEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFactuEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFactuEmpresa,"nuevoguardarcambios_button","Nue",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFactuEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFactuEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFactuEmpresa";
		inputMap = this.jButtonRecargarInformacionParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFactuEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFactuEmpresa";
		inputMap = this.jButtonSiguientesParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFactuEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFactuEmpresa";
		inputMap = this.jButtonAnterioresParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFactuEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFactuEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFactuEmpresa.setMinimumSize(new Dimension(this.getWidth(),ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuEmpresa.setMaximumSize(new Dimension(this.getWidth(),ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuEmpresa.setPreferredSize(new Dimension(this.getWidth(),ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFactuEmpresa = new GridBagLayout();

			this.jPanelPaginacionParametroFactuEmpresa.setLayout(gridaBagLayoutPaginacionParametroFactuEmpresa);						
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonAnterioresParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					
						
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
			
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonNuevoGuardarCambiosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
						
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonSiguientesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonNuevoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
						
			
			
			if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
				this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonGuardarCambiosTablaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			}
			
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonDuplicarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonCopiarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonVerFormParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 1;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFactuEmpresa.add(this.jButtonCerrarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		
		this.jButtonRecargarInformacionParametroFactuEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFactuEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFactuEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFactuEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFactuEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFactuEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFactuEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFactuEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFactuEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFactuEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFactuEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFactuEmpresa.setLayout(gridaBagParametrosReportesParametroFactuEmpresa);
			this.jPanelParametrosReportesAccionesParametroFactuEmpresa.setLayout(gridaBagParametrosReportesAccionesParametroFactuEmpresa);
			
			
			this.jPanelParametrosAuxiliar1ParametroFactuEmpresa.setLayout(gridaBagParametrosAuxiliar1ParametroFactuEmpresa);
			this.jPanelParametrosAuxiliar2ParametroFactuEmpresa.setLayout(gridaBagParametrosAuxiliar2ParametroFactuEmpresa);
			this.jPanelParametrosAuxiliar3ParametroFactuEmpresa.setLayout(gridaBagParametrosAuxiliar3ParametroFactuEmpresa);
			this.jPanelParametrosAuxiliar4ParametroFactuEmpresa.setLayout(gridaBagParametrosAuxiliar4ParametroFactuEmpresa);
			//this.jPanelParametrosAuxiliar5ParametroFactuEmpresa.setLayout(gridaBagParametrosAuxiliar2ParametroFactuEmpresa);			
			
			
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jButtonRecargarInformacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuEmpresa.add(this.jComboBoxTiposPaginacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuEmpresa.add(this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuEmpresa.add(this.jComboBoxTiposArchivosReportesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jPanelParametrosAuxiliar1ParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFactuEmpresa.add(this.jComboBoxTiposReportesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);																		
			
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ParametroFactuEmpresa.add(this.jComboBoxTiposGraficosReportesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jPanelParametrosAuxiliar4ParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jComboBoxTiposReportesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jCheckBoxGenerarReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jPanelParametrosAuxiliar2ParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jLabelAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jButtonAbrirOrderByParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jComboBoxTiposSeleccionarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			
			
			/*
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jCheckBoxSeleccionarTodosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jCheckBoxConGraficoReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuEmpresa.add(this.jCheckBoxSeleccionarTodosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);															
				
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuEmpresa.add(this.jCheckBoxSeleccionadosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);															
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuEmpresa.add(this.jCheckBoxConGraficoReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jPanelParametrosAuxiliar3ParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jComboBoxTiposAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
	
				
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuEmpresa.add(this.jTextFieldValorCampoGeneralParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposInicioorigenParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposInicioorigenParametroFactuEmpresa.setLayout(gridaBagLayoutCamposInicioorigenParametroFactuEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciodestinoParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setLayout(gridaBagLayoutCamposIniciodestinoParametroFactuEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciomulti_destinoParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setLayout(gridaBagLayoutCamposIniciomulti_destinoParametroFactuEmpresa);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFactuEmpresa = new GridBagLayout();

			this.jScrollPanelDatosParametroFactuEmpresa.setLayout(gridaBagLayoutDatosParametroFactuEmpresa);
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
			
			this.jScrollPanelDatosParametroFactuEmpresa.add(this.jTableDatosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFactuEmpresa.setViewportView(this.jTableDatosParametroFactuEmpresa);
		this.jTableDatosParametroFactuEmpresa.setFillsViewportHeight(true);
		this.jTableDatosParametroFactuEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuEmpresa= new GridBagLayout();
		this.jPanelAccionesParametroFactuEmpresa.setLayout(gridaBagLayoutAccionesParametroFactuEmpresa);
		
		
		/*	
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
			
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonNuevoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;		
			//this.gridBagConstraintsParametroFactuEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;		
		//this.gridBagConstraintsParametroFactuEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFactuEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);								
		
		
		/*
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		*/		
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuEmpresa.gridx =0;
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
				
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFactuEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFactuEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFactuEmpresa.setLayout(gridaBagLayoutBusquedasParametrosParametroFactuEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFactuEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFactuEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFactuEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFactuEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFactuEmpresa.setName("jPanelReporteDinamicoParametroFactuEmpresa"); 
		
		this.jPanelReporteDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFactuEmpresa.setLayout(gridaBagLayoutReporteDinamicoParametroFactuEmpresa);
		
		
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFactuEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFactuEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelColumnasSelectReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFactuEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFactuEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFactuEmpresa=new JScrollPane(this.jListColumnasSelectReporteParametroFactuEmpresa);
			
			this.jScrollColumnasSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jListColumnasSelectReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jScrollColumnasSelectReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFactuEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFactuEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFactuEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFactuEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFactuEmpresa=new JScrollPane(this.jListRelacionesSelectReporteParametroFactuEmpresa);
			
			this.jScrollRelacionesSelectReporteParametroFactuEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFactuEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoParametroFactuEmpresa = new JLabelMe();

		this.jLabelConGraficoDinamicoParametroFactuEmpresa.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelConGraficoDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jCheckBoxConGraficoDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelColumnaCategoriaGraficoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorParametroFactuEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaValorParametroFactuEmpresa.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelColumnaCategoriaValorParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jComboBoxColumnaCategoriaValorParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoParametroFactuEmpresa = new JLabelMe();

		this.jLabelColumnasValoresGraficoParametroFactuEmpresa.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelColumnasValoresGraficoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoParametroFactuEmpresa = new JList<Reporte>();
		this.jListColumnasValoresGraficoParametroFactuEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoParametroFactuEmpresa.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoParametroFactuEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroFactuEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroFactuEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoParametroFactuEmpresa=new JScrollPane(this.jListColumnasValoresGraficoParametroFactuEmpresa);
			
			this.jScrollColumnasValoresGraficoParametroFactuEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroFactuEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroFactuEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jListColumnasSelectReporteParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jScrollColumnasValoresGraficoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelTiposGraficosReportesDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroFactuEmpresa.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jComboBoxTiposGraficosReportesDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelGenerarExcelReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa.setToolTipText("Generar EXCEL"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jButtonGenerarExcelReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jComboBoxTiposReportesDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jLabelTiposArchivoReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFactuEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFactuEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFactuEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFactuEmpresa.setToolTipText("Generar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jButtonGenerarReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFactuEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFactuEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFactuEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFactuEmpresa.setToolTipText("Cancelar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuEmpresa.add(this.jButtonCerrarReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFactuEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa= new JScrollPane(jPanelReporteDinamicoParametroFactuEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFactuEmpresa);
		this.jInternalFrameReporteDinamicoParametroFactuEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFactuEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFactuEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFactuEmpresa.setName("jPanelImportacionParametroFactuEmpresa"); 
		
		this.jPanelImportacionParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFactuEmpresa.setLayout(gridaBagLayoutImportacionParametroFactuEmpresa);
		
		
		this.jInternalFrameImportacionParametroFactuEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFactuEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFactuEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFactuEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFactuEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuEmpresa.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFactuEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFactuEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuEmpresa.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFactuEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionParametroFactuEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuEmpresa.add(this.jLabelArchivoImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFactuEmpresa = new JFileChooser();		
		this.jFileChooserImportacionParametroFactuEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFactuEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionParametroFactuEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFactuEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFactuEmpresa.setToolTipText("Generar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuEmpresa.add(this.jButtonAbrirImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFactuEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFactuEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuEmpresa.add(this.jLabelPathArchivoImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFactuEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFactuEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuEmpresa.add(this.jTextFieldPathArchivoImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFactuEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionParametroFactuEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFactuEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFactuEmpresa.setToolTipText("Generar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuEmpresa.add(this.jButtonGenerarImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFactuEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionParametroFactuEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFactuEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFactuEmpresa.setToolTipText("Cancelar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuEmpresa.add(this.jButtonCerrarImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFactuEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFactuEmpresa= new JScrollPane(jPanelImportacionParametroFactuEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFactuEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFactuEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFactuEmpresa);
		this.jInternalFrameImportacionParametroFactuEmpresa.getContentPane().add(this.jScrollPanelImportacionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFactuEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFactuEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByParametroFactuEmpresa.setText("Orden");
			this.jButtonAbrirOrderByParametroFactuEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFactuEmpresa";
			inputMap = this.jButtonAbrirOrderByParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFactuEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFactuEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFactuEmpresa.setName("jPanelOrderByParametroFactuEmpresa"); 
			
			this.jPanelOrderByParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFactuEmpresa.setLayout(gridaBagLayoutOrderByParametroFactuEmpresa);
			
			
			this.jTableDatosParametroFactuEmpresaOrderBy = new JTableMe();        
			this.jTableDatosParametroFactuEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFactuEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFactuEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFactuEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFactuEmpresaOrderBy.setViewportView(this.jTableDatosParametroFactuEmpresaOrderBy);
			this.jTableDatosParametroFactuEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFactuEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFactuEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFactuEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFactuEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFactuEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFactuEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFactuEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFactuEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByParametroFactuEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFactuEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFactuEmpresa.setResizable(true);
			this.jInternalFrameOrderByParametroFactuEmpresa.setClosable(true);
			this.jInternalFrameOrderByParametroFactuEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFactuEmpresa.ipady =150;
				
			this.jPanelOrderByParametroFactuEmpresa.add(jScrollPanelDatosParametroFactuEmpresaOrderBy, this.gridBagConstraintsParametroFactuEmpresa);//this.jTableDatosParametroFactuEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFactuEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByParametroFactuEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFactuEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFactuEmpresa.setToolTipText("Cancelar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFactuEmpresa.add(this.jButtonCerrarOrderByParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFactuEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFactuEmpresa= new JScrollPane(jPanelOrderByParametroFactuEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFactuEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFactuEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFactuEmpresa);
			
			this.jInternalFrameOrderByParametroFactuEmpresa.getContentPane().add(this.jScrollPanelOrderByParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByParametroFactuEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//4030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofactuempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFactuEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFactuEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFactuEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFactuEmpresa.getRowHeight();//ParametroFactuEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.isSelected()) {
					iHeightTable=ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuEmpresa.isSelected()) {
					iHeightTable=ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFactuEmpresa!=null && this.jInternalFrameOrderByParametroFactuEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFactuEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFactuEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFactuEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFactuEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFactuEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFactuEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFactuEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofactuempresaLogic.getParametroFactuEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofactuempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFactuEmpresa> TraerParametroFactuEmpresaBeans(List<ParametroFactuEmpresa> parametrofactuempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFactuEmpresa parametrofactuempresa:parametrofactuempresas) {
					
				if(!(ParametroFactuEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFactuEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofactuempresa.setsDetalleGeneralEntityReporte(ParametroFactuEmpresaConstantesFunciones.getParametroFactuEmpresaDescripcion(parametrofactuempresa));
										
					parametrofactuempresa.setcon_transferencia_descripcion(ParametroFactuEmpresaConstantesFunciones.getcon_transferenciaDescripcion(parametrofactuempresa));	
					
						
					
				} else  {
							
					//parametrofactuempresa.setsDetalleGeneralEntityReporte(parametrofactuempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofactuempresabeans.add(parametrofactuempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofactuempresas;
    }
	//PARA REPORTES FIN
}
