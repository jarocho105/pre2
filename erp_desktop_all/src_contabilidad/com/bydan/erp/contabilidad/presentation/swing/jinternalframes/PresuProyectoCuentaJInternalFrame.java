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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.PresuProyectoCuentaConstantesFunciones;

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
public class PresuProyectoCuentaJInternalFrame extends PresuProyectoCuentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuProyectoCuenta;
	
	protected JMenuBar jmenuBarPresuProyectoCuenta;
	
	protected JMenu jmenuPresuProyectoCuenta;
	protected JMenu jmenuDatosPresuProyectoCuenta;
	protected JMenu jmenuArchivoPresuProyectoCuenta;
	protected JMenu jmenuAccionesPresuProyectoCuenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuProyectoCuenta;	
	protected GridBagConstraints gridBagConstraintsPresuProyectoCuenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuProyectoCuentaDetalleFormJInternalFrame jInternalFrameDetalleFormPresuProyectoCuenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuProyectoCuenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuProyectoCuenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyecto="";

	protected PresuTipoCuentaProyectoBeanSwingJInternalFrame presutipocuentaproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presutipocuentaproyecto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean;
		
	
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
	public PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuProyectoCuenta> presuproyectocuentas;		
	public List<PresuProyectoCuenta> presuproyectocuentasEliminados;	
	public List<PresuProyectoCuenta> presuproyectocuentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuProyectoCuenta;		
	protected JButton jButtonAbrirOrderByPresuProyectoCuenta;
	
	
	//protected JPanel jPanelOrderByPresuProyectoCuenta;
	//public JScrollPane jScrollPanelOrderByPresuProyectoCuenta;	
	//protected JButton jButtonCerrarOrderByPresuProyectoCuenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuProyectoCuentaLogic presuproyectocuentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuProyectoCuenta;
	public JScrollPane jScrollPanelDatosEdicionPresuProyectoCuenta;
	public JScrollPane jScrollPanelDatosGeneralPresuProyectoCuenta;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuProyectoCuentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuProyectoCuenta;
	//public JScrollPane jScrollPanelImportacionPresuProyectoCuenta;
	
	
	
	protected JPanel jPanelAccionesPresuProyectoCuenta;
	
    protected JPanel jPanelPaginacionPresuProyectoCuenta;
    protected JPanel jPanelParametrosReportesPresuProyectoCuenta;
	protected JPanel jPanelParametrosReportesAccionesPresuProyectoCuenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuProyectoCuenta;
	protected JPanel jPanelParametrosAuxiliar2PresuProyectoCuenta;
	protected JPanel jPanelParametrosAuxiliar3PresuProyectoCuenta;
	protected JPanel jPanelParametrosAuxiliar4PresuProyectoCuenta;
	//protected JPanel jPanelParametrosAuxiliar5PresuProyectoCuenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuProyectoCuenta;
	//protected JPanel jPanelImportacionPresuProyectoCuenta;
	
	
	public JTable jTableDatosPresuProyectoCuenta;
	
	
	
	//public JTable jTableDatosPresuProyectoCuentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuProyectoCuenta;
	protected JButton jButtonDuplicarPresuProyectoCuenta;
	protected JButton jButtonCopiarPresuProyectoCuenta;
	protected JButton jButtonVerFormPresuProyectoCuenta;
	protected JButton jButtonNuevoRelacionesPresuProyectoCuenta;
	protected JButton jButtonModificarPresuProyectoCuenta;
	
    protected JButton jButtonGuardarCambiosTablaPresuProyectoCuenta;
	protected JButton jButtonCerrarPresuProyectoCuenta;
	
	
	protected JButton jButtonRecargarInformacionPresuProyectoCuenta;
	protected JButton jButtonProcesarInformacionPresuProyectoCuenta;
	
	
	protected JButton jButtonAnterioresPresuProyectoCuenta;
	protected JButton jButtonSiguientesPresuProyectoCuenta;
	protected JButton jButtonNuevoGuardarCambiosPresuProyectoCuenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuProyectoCuenta;
	//protected JButton jButtonCerrarReporteDinamicoPresuProyectoCuenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuProyectoCuenta;
	//protected JButton jButtonGenerarImportacionPresuProyectoCuenta;
	//protected JButton jButtonCerrarImportacionPresuProyectoCuenta;
	//protected JFileChooser jFileChooserImportacionPresuProyectoCuenta;
	//protected File fileImportacionPresuProyectoCuenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuProyectoCuenta;
	protected JButton jButtonDuplicarToolBarPresuProyectoCuenta;
	protected JButton jButtonNuevoRelacionesToolBarPresuProyectoCuenta;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuProyectoCuenta;
	protected JButton jButtonCopiarToolBarPresuProyectoCuenta;
	protected JButton jButtonVerFormToolBarPresuProyectoCuenta;
	public JButton jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuProyectoCuenta;
	protected JButton jButtonCerrarToolBarPresuProyectoCuenta;
	
	protected JButton jButtonRecargarInformacionToolBarPresuProyectoCuenta;
	protected JButton jButtonProcesarInformacionToolBarPresuProyectoCuenta;
	protected JButton jButtonAnterioresToolBarPresuProyectoCuenta;
	protected JButton jButtonSiguientesToolBarPresuProyectoCuenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta;
	protected JButton jButtonAbrirOrderByToolBarPresuProyectoCuenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuProyectoCuenta;
	protected JMenuItem jMenuItemDuplicarPresuProyectoCuenta;
	protected JMenuItem jMenuItemNuevoRelacionesPresuProyectoCuenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuProyectoCuenta;
	protected JMenuItem jMenuItemCopiarPresuProyectoCuenta;
	protected JMenuItem jMenuItemVerFormPresuProyectoCuenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuProyectoCuenta;
	protected JMenuItem jMenuItemCerrarPresuProyectoCuenta;
	protected JMenuItem jMenuItemDetalleCerrarPresuProyectoCuenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuProyectoCuenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuProyectoCuenta;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuProyectoCuenta;
	protected JMenuItem jMenuItemProcesarInformacionPresuProyectoCuenta;
	protected JMenuItem jMenuItemAnterioresPresuProyectoCuenta;
	protected JMenuItem jMenuItemSiguientesPresuProyectoCuenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuProyectoCuenta;
	protected JMenuItem jMenuItemAbrirOrderByPresuProyectoCuenta;
	protected JMenuItem jMenuItemMostrarOcultarPresuProyectoCuenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuProyectoCuenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuProyectoCuenta;
	protected JCheckBox jCheckBoxSeleccionadosPresuProyectoCuenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuProyectoCuenta;
	protected JCheckBox jCheckBoxConGraficoReportePresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuProyectoCuenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuProyectoCuenta;
	protected JTextField jTextFieldValorCampoGeneralPresuProyectoCuenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuProyectoCuenta;
	//public JList<Reporte> jListColumnasSelectReportePresuProyectoCuenta;
	//public JScrollPane jScrollColumnasSelectReportePresuProyectoCuenta;
	
	//public JLabel jLabelRelacionesSelectReportePresuProyectoCuenta;
	//public JList<Reporte> jListRelacionesSelectReportePresuProyectoCuenta;
	//public JScrollPane jScrollRelacionesSelectReportePresuProyectoCuenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuProyectoCuenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuProyectoCuenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta;
	
		
	//public JLabel jLabelArchivoImportacionPresuProyectoCuenta;	
	//public JLabel jLabelPathArchivoImportacionPresuProyectoCuenta;
	//protected JTextField jTextFieldPathArchivoImportacionPresuProyectoCuenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuProyectoCuenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta;
	
	//public JLabel jLabelColumnaCategoriaValorPresuProyectoCuenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuProyectoCuenta;
	
	//public JLabel jLabelColumnasValoresGraficoPresuProyectoCuenta;
	//public JList<Reporte> jListColumnasValoresGraficoPresuProyectoCuenta;
	//public JScrollPane jScrollColumnasValoresGraficoPresuProyectoCuenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuProyectoCuenta;
	public JPanel jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JButton jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JPanel jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JButton jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JPanel jPanelFK_IdCuentaContablePresuProyectoCuenta;
	public JButton jButtonFK_IdCuentaContablePresuProyectoCuenta;
	public JPanel jPanelFK_IdEmpleadoPresuProyectoCuenta;
	public JButton jButtonFK_IdEmpleadoPresuProyectoCuenta;
	public JPanel jPanelFK_IdPresuEstadoPresuProyectoCuenta;
	public JButton jButtonFK_IdPresuEstadoPresuProyectoCuenta;
	public JPanel jPanelFK_IdPresuProyectoPresuProyectoCuenta;
	public JButton jButtonFK_IdPresuProyectoPresuProyectoCuenta;
	public JPanel jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta;
	public JButton jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta;
	
	public JPanel jPanelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JLabel jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JLabel jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JTextField jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta;
	public JButton jButtoncodigoBusquedaPorProyectoPorCodigoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JLabel jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JLabel jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JTextArea jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta;
	public JButton jButtonnombreBusquedaPorProyectoPorNombrePresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuProyectoCuentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresuProyectoCuentaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPresuProyectoCuenta;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta;
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPresuProyectoCuentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta;
	
	public JPanel jPanelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta;
	public JLabel jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta;
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_estadoFK_IdPresuEstadoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta;
	public JLabel jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta;
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta;
	public JLabel jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta;
	public JButton jButtonid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresuProyectoCuentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuProyectoCuenta)	{
		this.jButtonRecargarInformacionPresuProyectoCuenta = jButtonRecargarInformacionPresuProyectoCuenta;
	}
	
	public JButton getjButtonProcesarInformacionPresuProyectoCuenta() {
		return this.jButtonProcesarInformacionPresuProyectoCuenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuProyectoCuenta)	{
		this.jButtonProcesarInformacionPresuProyectoCuenta = jButtonProcesarInformacionPresuProyectoCuenta;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuProyectoCuenta() {
		return this.jButtonRecargarInformacionPresuProyectoCuenta;
	}
	
	
	public List<PresuProyectoCuenta> getpresuproyectocuentas() {
		return this.presuproyectocuentas;
	}

	public void setpresuproyectocuentas(List<PresuProyectoCuenta> presuproyectocuentas) {
		this.presuproyectocuentas = presuproyectocuentas;
	}
	
	public List<PresuProyectoCuenta> getpresuproyectocuentasAux() {
		return this.presuproyectocuentasAux;
	}

	public void setpresuproyectocuentasAux(List<PresuProyectoCuenta> presuproyectocuentasAux) {
		this.presuproyectocuentasAux = presuproyectocuentasAux;
	}
	
	public List<PresuProyectoCuenta> getpresuproyectocuentasEliminados() {
		return this.presuproyectocuentasEliminados;
	}

	public void setPresuProyectoCuentasEliminados(List<PresuProyectoCuenta> presuproyectocuentasEliminados) {
		this.presuproyectocuentasEliminados = presuproyectocuentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuProyectoCuenta() {
		return jComboBoxTiposSeleccionarPresuProyectoCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuProyectoCuenta(
			JComboBox jComboBoxTiposSeleccionarPresuProyectoCuenta) {
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta = jComboBoxTiposSeleccionarPresuProyectoCuenta;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuProyectoCuenta() {
		return jTextFieldValorCampoGeneralPresuProyectoCuenta;
	}

	public void setjTextFieldValorCampoGeneralPresuProyectoCuenta(
			JTextField jTextFieldValorCampoGeneralPresuProyectoCuenta) {
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta = jTextFieldValorCampoGeneralPresuProyectoCuenta;
	}

	public void setBorderResaltarValorCampoGeneralPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuProyectoCuenta() {
		return this.jCheckBoxSeleccionarTodosPresuProyectoCuenta;
	}

	public void setjCheckBoxSeleccionarTodosPresuProyectoCuenta(
			JCheckBox jCheckBoxSeleccionarTodosPresuProyectoCuenta) {
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta = jCheckBoxSeleccionarTodosPresuProyectoCuenta;
	}

	public void setBorderResaltarSeleccionarTodosPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuProyectoCuenta() {
		return this.jCheckBoxSeleccionadosPresuProyectoCuenta;
	}

	public void setjCheckBoxSeleccionadosPresuProyectoCuenta(
			JCheckBox jCheckBoxSeleccionadosPresuProyectoCuenta) {
		this.jCheckBoxSeleccionadosPresuProyectoCuenta = jCheckBoxSeleccionadosPresuProyectoCuenta;
	}
	
	public void setBorderResaltarSeleccionadosPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuProyectoCuenta() {
		return this.jComboBoxTiposArchivosReportesPresuProyectoCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuProyectoCuenta(
			JComboBox jComboBoxTiposArchivosReportesPresuProyectoCuenta) {
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta = jComboBoxTiposArchivosReportesPresuProyectoCuenta;
	}

	public void setBorderResaltarTiposArchivosReportesPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuProyectoCuenta() {
		return this.jComboBoxTiposReportesPresuProyectoCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuProyectoCuenta(
			JComboBox jComboBoxTiposReportesPresuProyectoCuenta) {
		this.jComboBoxTiposReportesPresuProyectoCuenta = jComboBoxTiposReportesPresuProyectoCuenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuProyectoCuenta() {
	//	return jComboBoxTiposReportesDinamicoPresuProyectoCuenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuProyectoCuenta(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuProyectoCuenta) {
	//	this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta = jComboBoxTiposReportesDinamicoPresuProyectoCuenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta = jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta;
	//}
	
	public void setBorderResaltarTiposReportesPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuProyectoCuenta() {
		return this.jComboBoxTiposGraficosReportesPresuProyectoCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuProyectoCuenta(
			JComboBox jComboBoxTiposGraficosReportesPresuProyectoCuenta) {
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta = jComboBoxTiposGraficosReportesPresuProyectoCuenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuProyectoCuenta() {
		return this.jComboBoxTiposPaginacionPresuProyectoCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuProyectoCuenta(
			JComboBox jComboBoxTiposPaginacionPresuProyectoCuenta) {
		this.jComboBoxTiposPaginacionPresuProyectoCuenta = jComboBoxTiposPaginacionPresuProyectoCuenta;
	}
	
	public void setBorderResaltarTiposPaginacionPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuProyectoCuenta() {
		return this.jComboBoxTiposRelacionesPresuProyectoCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuProyectoCuenta() {
		return this.jComboBoxTiposAccionesPresuProyectoCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuProyectoCuenta(
			JComboBox jComboBoxTiposRelacionesPresuProyectoCuenta) {
		this.jComboBoxTiposRelacionesPresuProyectoCuenta = jComboBoxTiposRelacionesPresuProyectoCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuProyectoCuenta(
			JComboBox jComboBoxTiposAccionesPresuProyectoCuenta) {
		this.jComboBoxTiposAccionesPresuProyectoCuenta = jComboBoxTiposAccionesPresuProyectoCuenta;
	}
	
	public void setBorderResaltarTiposRelacionesPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuProyectoCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuProyectoCuenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuProyectoCuenta() {
	//	return jCheckBoxConGraficoDinamicoPresuProyectoCuenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuProyectoCuenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuProyectoCuenta) {
	//	this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta = jCheckBoxConGraficoDinamicoPresuProyectoCuenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuProyectoCuenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuProyectoCuenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta .setBorder(borderResaltar);		
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
		this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		
		this.presuproyectocuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuproyectocuentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuProyectoCuentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuProyectoCuenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"nuevo","nuevo","Nuevo"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"duplicar","duplicar","Duplicar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"copiar","copiar","Copiar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"ver_form","ver_form","Ver"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"recargar","recargar","Recargar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,
							"cerrar","cerrar","Salir"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuProyectoCuenta;
			
				this.jButtonProcesarInformacionToolBarPresuProyectoCuenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuProyectoCuenta;
				
		//protected JButton jButtonModificarToolBarPresuProyectoCuenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuProyectoCuenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuProyectoCuenta=new JMenuMe("General");
		this.jmenuArchivoPresuProyectoCuenta=new JMenuMe("Archivo");
		this.jmenuAccionesPresuProyectoCuenta=new JMenuMe("Acciones");
		this.jmenuDatosPresuProyectoCuenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuProyectoCuenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuProyectoCuenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuProyectoCuenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuProyectoCuenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuProyectoCuenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuProyectoCuenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuProyectoCuenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuProyectoCuenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuProyectoCuenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuProyectoCuenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuProyectoCuenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuProyectoCuenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuProyectoCuenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuProyectoCuenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuProyectoCuenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuProyectoCuenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuProyectoCuenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuProyectoCuenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuProyectoCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuProyectoCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuProyectoCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuProyectoCuenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuProyectoCuenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuProyectoCuenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuProyectoCuenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuProyectoCuenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuProyectoCuenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuProyectoCuenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuProyectoCuenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuProyectoCuenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuProyectoCuenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuProyectoCuenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuProyectoCuenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuProyectoCuenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuProyectoCuenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuProyectoCuenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuProyectoCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuProyectoCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuProyectoCuenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuProyectoCuenta.add(this.jMenuItemCerrarPresuProyectoCuenta);
			
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemNuevoPresuProyectoCuenta);
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta);
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemNuevoRelacionesPresuProyectoCuenta);
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta);		
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemDuplicarPresuProyectoCuenta);		
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemCopiarPresuProyectoCuenta);		
			this.jmenuAccionesPresuProyectoCuenta.add(this.jMenuItemVerFormPresuProyectoCuenta);		
			
			this.jmenuDatosPresuProyectoCuenta.add(this.jMenuItemRecargarInformacionPresuProyectoCuenta);				
			this.jmenuDatosPresuProyectoCuenta.add(this.jMenuItemAnterioresPresuProyectoCuenta);				
			this.jmenuDatosPresuProyectoCuenta.add(this.jMenuItemSiguientesPresuProyectoCuenta);				
			this.jmenuDatosPresuProyectoCuenta.add(this.jMenuItemAbrirOrderByPresuProyectoCuenta);				
			this.jmenuDatosPresuProyectoCuenta.add(this.jMenuItemMostrarOcultarPresuProyectoCuenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuProyectoCuenta.add(this.jMenuItemGuardarCambiosPresuProyectoCuenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuProyectoCuenta.add(this.jmenuArchivoPresuProyectoCuenta);		
			this.jmenuBarPresuProyectoCuenta.add(this.jmenuAccionesPresuProyectoCuenta);		
			this.jmenuBarPresuProyectoCuenta.add(this.jmenuDatosPresuProyectoCuenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuProyectoCuenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuProyectoCuenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setToolTipText("Buscar Por Proyecto Por Codigo ");
		this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta= new JButtonMe();
		this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setText("Buscar");
		this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setToolTipText("Buscar Por Proyecto Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta,"buscar_button","Buscar Por Proyecto Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta = new JLabelMe();
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setText("Proyecto :");
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setToolTipText("Proyecto");
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta = new JLabelMe();
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setText("Codigo :");
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.setToolTipText("Buscar Por Proyecto Por Nombre ");
		this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta= new JButtonMe();
		this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta.setText("Buscar");
		this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta.setToolTipText("Buscar Por Proyecto Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta,"buscar_button","Buscar Por Proyecto Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta = new JLabelMe();
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setText("Proyecto :");
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setToolTipText("Proyecto");
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta = new JLabelMe();
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setText("Nombre :");
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setToolTipText("Nombre");
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta= new JTextAreaMe();
		jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContablePresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePresuProyectoCuenta.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContablePresuProyectoCuenta= new JButtonMe();
		this.jButtonFK_IdCuentaContablePresuProyectoCuenta.setText("Buscar");
		this.jButtonFK_IdCuentaContablePresuProyectoCuenta.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePresuProyectoCuenta,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.setFocusable(false);

		this.jPanelFK_IdEmpleadoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPresuProyectoCuenta.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPresuProyectoCuenta= new JButtonMe();
		this.jButtonFK_IdEmpleadoPresuProyectoCuenta.setText("Buscar");
		this.jButtonFK_IdEmpleadoPresuProyectoCuenta.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPresuProyectoCuenta,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.setFocusable(false);

		this.jPanelFK_IdPresuEstadoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuEstadoPresuProyectoCuenta.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdPresuEstadoPresuProyectoCuenta= new JButtonMe();
		this.jButtonFK_IdPresuEstadoPresuProyectoCuenta.setText("Buscar");
		this.jButtonFK_IdPresuEstadoPresuProyectoCuenta.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuEstadoPresuProyectoCuenta,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuEstadoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta = new JLabelMe();
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setText("Estado :");
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setToolTipText("Estado");
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPresuProyectoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuProyectoPresuProyectoCuenta.setToolTipText("Buscar Por Proyecto ");
		this.jButtonFK_IdPresuProyectoPresuProyectoCuenta= new JButtonMe();
		this.jButtonFK_IdPresuProyectoPresuProyectoCuenta.setText("Buscar");
		this.jButtonFK_IdPresuProyectoPresuProyectoCuenta.setToolTipText("Buscar Por Proyecto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuProyectoPresuProyectoCuenta,"buscar_button","Buscar Por Proyecto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuProyectoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta = new JLabelMe();
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setText("Proyecto :");
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setToolTipText("Proyecto");
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setToolTipText("Buscar Por Tipo Cuenta Proyecto ");
		this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta= new JButtonMe();
		this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setText("Buscar");
		this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setToolTipText("Buscar Por Tipo Cuenta Proyecto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta,"buscar_button","Buscar Por Tipo Cuenta Proyecto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta = new JLabelMe();
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setText("Tipo Cuenta Proyecto :");
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setToolTipText("Tipo Cuenta Proyecto");
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuProyectoCuenta=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuProyectoCuenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuProyectoCuenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuProyectoCuenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuProyectoCuenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuProyectoCuenta = new PresuProyectoCuentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Contable Proyecto DATOS");
			this.jInternalFrameDetalleFormPresuProyectoCuenta = new PresuProyectoCuentaDetalleFormJInternalFrame(jDesktopPane,this.presuproyectocuentaSessionBean.getConGuardarRelaciones(),this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuProyectoCuenta = null;//new PresuProyectoCuentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuProyectoCuenta= new GridBagLayout();
		
		
		this.jTableDatosPresuProyectoCuenta = new JTableMe();      
		
		String sToolTipPresuProyectoCuenta="";
		sToolTipPresuProyectoCuenta=PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuProyectoCuenta+="(Contabilidad.PresuProyectoCuenta)";
		}
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuProyectoCuenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuProyectoCuenta.setToolTipText(sToolTipPresuProyectoCuenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuProyectoCuenta);
		this.jTableDatosPresuProyectoCuenta.setAutoCreateRowSorter(true);
		this.jTableDatosPresuProyectoCuenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuProyectoCuenta.setRowSelectionAllowed(true);
		this.jTableDatosPresuProyectoCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuProyectoCuenta = new JButtonMe();
		this.jButtonDuplicarPresuProyectoCuenta = new JButtonMe();
		this.jButtonCopiarPresuProyectoCuenta = new JButtonMe();
		this.jButtonVerFormPresuProyectoCuenta = new JButtonMe();
		this.jButtonNuevoRelacionesPresuProyectoCuenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta = new JButtonMe();
		this.jButtonCerrarPresuProyectoCuenta = new JButtonMe();
		
		this.jScrollPanelDatosPresuProyectoCuenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuProyectoCuenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable Proyecto";
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuProyectoCuenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuProyectoCuenta.setToolTipText("Acciones");
        this.jPanelAccionesPresuProyectoCuenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuProyectoCuenta=new ReporteDinamicoJInternalFrame(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuProyectoCuenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuProyectoCuenta=new ImportacionJInternalFrame(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuProyectoCuenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuProyectoCuenta = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuProyectoCuenta.setText("Orden");
		this.jButtonAbrirOrderByPresuProyectoCuenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuProyectoCuenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuProyectoCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyectoCuenta,false,this);
			
			//this.cargarOrderByPresuProyectoCuenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuProyectoCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyectoCuenta,true,this);
			
			//this.cargarOrderByPresuProyectoCuenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuProyectoCuenta.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPresuProyectoCuenta.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPresuProyectoCuenta.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPresuProyectoCuenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuProyectoCuenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuProyectoCuenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuProyectoCuenta.setText("Nuevo");
		this.jButtonDuplicarPresuProyectoCuenta.setText("Duplicar");
		this.jButtonCopiarPresuProyectoCuenta.setText("Copiar");
		this.jButtonVerFormPresuProyectoCuenta.setText("Ver");
		this.jButtonNuevoRelacionesPresuProyectoCuenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setText("Guardar");
		this.jButtonCerrarPresuProyectoCuenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuProyectoCuenta,"nuevo_button","Nuevo",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuProyectoCuenta,"duplicar_button","Duplicar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuProyectoCuenta,"copiar_button","Copiar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuProyectoCuenta,"ver_form","Ver",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuProyectoCuenta,"nuevorelaciones_button","Nuevo Rel",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuProyectoCuenta,"guardarcambiostabla_button","Guardar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuProyectoCuenta,"cerrar_button","Salir",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuProyectoCuenta.setToolTipText("Nuevo"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuProyectoCuenta.setToolTipText("Duplicar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuProyectoCuenta.setToolTipText("Copiar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuProyectoCuenta.setToolTipText("Ver"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuProyectoCuenta.setToolTipText("Nuevo Rel"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setToolTipText("Guardar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuProyectoCuenta.setToolTipText("Salir"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuProyectoCuenta";
		inputMap = this.jButtonNuevoPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuProyectoCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuProyectoCuenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuProyectoCuenta";
		inputMap = this.jButtonDuplicarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuProyectoCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuProyectoCuenta"));
		
		//COPIAR
		sMapKey = "CopiarPresuProyectoCuenta";
		inputMap = this.jButtonCopiarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuProyectoCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuProyectoCuenta"));
		
		//VEr FORM
		sMapKey = "VerFormPresuProyectoCuenta";
		inputMap = this.jButtonVerFormPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuProyectoCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuProyectoCuenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuProyectoCuenta";
		inputMap = this.jButtonNuevoRelacionesPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuProyectoCuenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuProyectoCuenta";
		inputMap = this.jButtonModificarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuProyectoCuenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuProyectoCuenta";
		inputMap = this.jButtonCerrarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuProyectoCuenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuProyectoCuenta";
		inputMap = this.jButtonGuardarCambiosTablaPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuProyectoCuenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuProyectoCuenta.setName("jPanelParametrosReportesPresuProyectoCuenta"); 
		
		this.jPanelParametrosReportesAccionesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuProyectoCuenta.setName("jPanelParametrosReportesAccionesPresuProyectoCuenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuProyectoCuenta = new JButtonMe();
		this.jButtonRecargarInformacionPresuProyectoCuenta.setText("Recargar");
		this.jButtonRecargarInformacionPresuProyectoCuenta.setToolTipText("Recargar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuProyectoCuenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuProyectoCuenta = new JButtonMe();
		this.jButtonProcesarInformacionPresuProyectoCuenta.setText("Procesar");
		this.jButtonProcesarInformacionPresuProyectoCuenta.setToolTipText("Procesar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuProyectoCuenta.setVisible(false);
			
		this.jButtonProcesarInformacionPresuProyectoCuenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuProyectoCuenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuProyectoCuenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setText("TIPO");       
		this.jComboBoxTiposReportesPresuProyectoCuenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuProyectoCuenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuProyectoCuenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuProyectoCuenta.setText("Accion");
		this.jComboBoxTiposRelacionesPresuProyectoCuenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuProyectoCuenta.setText("Accion");
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuProyectoCuenta = new JLabelMe();
		
		this.jLabelAccionesPresuProyectoCuenta.setText("Acciones");		
		this.jLabelAccionesPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuProyectoCuenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuProyectoCuenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuProyectoCuenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuProyectoCuenta.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuProyectoCuenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuProyectoCuenta = new JButtonMe();
		//this.jButtonAnterioresPresuProyectoCuenta.setText("<<");
        this.jButtonAnterioresPresuProyectoCuenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuProyectoCuenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuProyectoCuenta = new JButtonMe();
		//this.jButtonSiguientesPresuProyectoCuenta.setText(">>");
        this.jButtonSiguientesPresuProyectoCuenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuProyectoCuenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuProyectoCuenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuProyectoCuenta,"nuevoguardarcambios_button","Nue",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuProyectoCuenta";
		inputMap = this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuProyectoCuenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuProyectoCuenta";
		inputMap = this.jButtonRecargarInformacionPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuProyectoCuenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuProyectoCuenta";
		inputMap = this.jButtonSiguientesPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuProyectoCuenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuProyectoCuenta";
		inputMap = this.jButtonAnterioresPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuProyectoCuenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuProyectoCuenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuProyectoCuenta.setMinimumSize(new Dimension(this.getWidth(),PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuProyectoCuenta.setMaximumSize(new Dimension(this.getWidth(),PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuProyectoCuenta.setPreferredSize(new Dimension(this.getWidth(),PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuProyectoCuenta = new GridBagLayout();

			this.jPanelPaginacionPresuProyectoCuenta.setLayout(gridaBagLayoutPaginacionPresuProyectoCuenta);						
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonAnterioresPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					
						
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
			
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonNuevoGuardarCambiosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
						
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonSiguientesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonNuevoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
				this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
				this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonNuevoRelacionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			}
			
			
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
				this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
				this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonGuardarCambiosTablaPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			}
			
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonDuplicarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonCopiarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonVerFormPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 1;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuProyectoCuenta.add(this.jButtonCerrarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		
		this.jButtonRecargarInformacionPresuProyectoCuenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuProyectoCuenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuProyectoCuenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuProyectoCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuProyectoCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuProyectoCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuProyectoCuenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuProyectoCuenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuProyectoCuenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuProyectoCuenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuProyectoCuenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuProyectoCuenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuProyectoCuenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuProyectoCuenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuProyectoCuenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuProyectoCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuProyectoCuenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuProyectoCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuProyectoCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuProyectoCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuProyectoCuenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuProyectoCuenta.setLayout(gridaBagParametrosReportesPresuProyectoCuenta);
			this.jPanelParametrosReportesAccionesPresuProyectoCuenta.setLayout(gridaBagParametrosReportesAccionesPresuProyectoCuenta);
			
			
			this.jPanelParametrosAuxiliar1PresuProyectoCuenta.setLayout(gridaBagParametrosAuxiliar1PresuProyectoCuenta);
			this.jPanelParametrosAuxiliar2PresuProyectoCuenta.setLayout(gridaBagParametrosAuxiliar2PresuProyectoCuenta);
			this.jPanelParametrosAuxiliar3PresuProyectoCuenta.setLayout(gridaBagParametrosAuxiliar3PresuProyectoCuenta);
			this.jPanelParametrosAuxiliar4PresuProyectoCuenta.setLayout(gridaBagParametrosAuxiliar4PresuProyectoCuenta);
			//this.jPanelParametrosAuxiliar5PresuProyectoCuenta.setLayout(gridaBagParametrosAuxiliar2PresuProyectoCuenta);			
			
			
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jButtonRecargarInformacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyectoCuenta.add(this.jComboBoxTiposPaginacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyectoCuenta.add(this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyectoCuenta.add(this.jComboBoxTiposArchivosReportesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jPanelParametrosAuxiliar1PresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuProyectoCuenta.add(this.jComboBoxTiposReportesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);																		
			
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresuProyectoCuenta.add(this.jComboBoxTiposGraficosReportesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jPanelParametrosAuxiliar4PresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jComboBoxTiposReportesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jCheckBoxGenerarReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jPanelParametrosAuxiliar2PresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jLabelAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
				this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jButtonAbrirOrderByPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jComboBoxTiposSeleccionarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			
			
			/*
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jCheckBoxSeleccionarTodosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jCheckBoxConGraficoReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyectoCuenta.add(this.jCheckBoxSeleccionarTodosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);															
				
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyectoCuenta.add(this.jCheckBoxSeleccionadosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);															
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyectoCuenta.add(this.jCheckBoxConGraficoReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jPanelParametrosAuxiliar3PresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jComboBoxTiposRelacionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
				
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jComboBoxTiposAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
	
				
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyectoCuenta.add(this.jTextFieldValorCampoGeneralPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuProyectoCuenta = new GridBagLayout();

			this.jScrollPanelDatosPresuProyectoCuenta.setLayout(gridaBagLayoutDatosPresuProyectoCuenta);
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
			
			this.jScrollPanelDatosPresuProyectoCuenta.add(this.jTableDatosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuProyectoCuenta.setViewportView(this.jTableDatosPresuProyectoCuenta);
		this.jTableDatosPresuProyectoCuenta.setFillsViewportHeight(true);
		this.jTableDatosPresuProyectoCuenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuProyectoCuenta= new GridBagLayout();
		this.jPanelAccionesPresuProyectoCuenta.setLayout(gridaBagLayoutAccionesPresuProyectoCuenta);
		
		
		/*	
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
			
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonNuevoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setLayout(gridaBagLayoutBusquedaPorProyectoPorCodigoPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.add(jLabelid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.add(jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);


		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.add(jLabelcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.add(jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 2;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta.add(jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("1.-Por Proyecto Por Codigo ", jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.setLayout(gridaBagLayoutBusquedaPorProyectoPorNombrePresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.add(jLabelid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.add(jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);


		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.add(jLabelnombreBusquedaPorProyectoPorNombrePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.add(jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 2;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta.add(jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("2.-Por Proyecto Por Nombre ", jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContablePresuProyectoCuenta.setLayout(gridaBagLayoutFK_IdCuentaContablePresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdCuentaContablePresuProyectoCuenta.add(jLabelid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelFK_IdCuentaContablePresuProyectoCuenta.add(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);


		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdCuentaContablePresuProyectoCuenta.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelFK_IdCuentaContablePresuProyectoCuenta.add(jButtonFK_IdCuentaContablePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("3.-Por Cuenta Contable ", jPanelFK_IdCuentaContablePresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPresuProyectoCuenta.setLayout(gridaBagLayoutFK_IdEmpleadoPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdEmpleadoPresuProyectoCuenta.add(jLabelid_empleadoFK_IdEmpleadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelFK_IdEmpleadoPresuProyectoCuenta.add(jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);


		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdEmpleadoPresuProyectoCuenta.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelFK_IdEmpleadoPresuProyectoCuenta.add(jButtonFK_IdEmpleadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoPresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuEstadoPresuProyectoCuenta.setLayout(gridaBagLayoutFK_IdPresuEstadoPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdPresuEstadoPresuProyectoCuenta.add(jLabelid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelFK_IdPresuEstadoPresuProyectoCuenta.add(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelFK_IdPresuEstadoPresuProyectoCuenta.add(jButtonFK_IdPresuEstadoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("5.-Por Estado ", jPanelFK_IdPresuEstadoPresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuProyectoPresuProyectoCuenta.setLayout(gridaBagLayoutFK_IdPresuProyectoPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdPresuProyectoPresuProyectoCuenta.add(jLabelid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelFK_IdPresuProyectoPresuProyectoCuenta.add(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelFK_IdPresuProyectoPresuProyectoCuenta.add(jButtonFK_IdPresuProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("6.-Por Proyecto ", jPanelFK_IdPresuProyectoPresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta= new GridBagLayout();
		gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setLayout(gridaBagLayoutFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.add(jLabelid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		gridBagConstraintsPresuProyectoCuenta.gridx = 1;
		jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.add(jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyectoCuenta.gridy = 1;
		gridBagConstraintsPresuProyectoCuenta.gridx =1;
		jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.add(jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);

		jTabbedPaneBusquedasPresuProyectoCuenta.addTab("7.-Por Tipo Cuenta Proyecto ", jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
		jTabbedPaneBusquedasPresuProyectoCuenta.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuProyectoCuenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();						
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;		
			//this.gridBagConstraintsPresuProyectoCuenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuProyectoCuenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;		
		//this.gridBagConstraintsPresuProyectoCuenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuProyectoCuenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;		
			this.gridBagConstraintsPresuProyectoCuenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuProyectoCuenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);								
		
		
		/*
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		*/		
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuProyectoCuenta.gridx =0;
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuProyectoCuenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
				
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuProyectoCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuProyectoCuenta = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuProyectoCuenta.setLayout(gridaBagLayoutBusquedasParametrosPresuProyectoCuenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuProyectoCuenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuProyectoCuenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuProyectoCuenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuProyectoCuenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuProyectoCuenta.setName("jPanelReporteDinamicoPresuProyectoCuenta"); 
		
		this.jPanelReporteDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuProyectoCuenta.setLayout(gridaBagLayoutReporteDinamicoPresuProyectoCuenta);
		
		
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuProyectoCuenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuProyectoCuenta = new JLabelMe();

		this.jLabelColumnasSelectReportePresuProyectoCuenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelColumnasSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuProyectoCuenta = new JList<Reporte>();
		this.jListColumnasSelectReportePresuProyectoCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuProyectoCuenta=new JScrollPane(this.jListColumnasSelectReportePresuProyectoCuenta);
			
			this.jScrollColumnasSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jListColumnasSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jScrollColumnasSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuProyectoCuenta = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuProyectoCuenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelRelacionesSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuProyectoCuenta = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuProyectoCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuProyectoCuenta=new JScrollPane(this.jListRelacionesSelectReportePresuProyectoCuenta);
			
			this.jScrollRelacionesSelectReportePresuProyectoCuenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuProyectoCuenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuProyectoCuenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jListRelacionesSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jScrollRelacionesSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuProyectoCuenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresuProyectoCuenta = new JLabelMe();

		this.jLabelConGraficoDinamicoPresuProyectoCuenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelConGraficoDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jCheckBoxConGraficoDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelColumnaCategoriaGraficoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresuProyectoCuenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresuProyectoCuenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelColumnaCategoriaValorPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jComboBoxColumnaCategoriaValorPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresuProyectoCuenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresuProyectoCuenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelColumnasValoresGraficoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresuProyectoCuenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresuProyectoCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresuProyectoCuenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresuProyectoCuenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuProyectoCuenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuProyectoCuenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresuProyectoCuenta=new JScrollPane(this.jListColumnasValoresGraficoPresuProyectoCuenta);
			
			this.jScrollColumnasValoresGraficoPresuProyectoCuenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuProyectoCuenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuProyectoCuenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jListColumnasSelectReportePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jScrollColumnasValoresGraficoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelTiposGraficosReportesDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuProyectoCuenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jComboBoxTiposGraficosReportesDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelGenerarExcelReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta.setToolTipText("Generar EXCEL"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jComboBoxTiposReportesDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jLabelTiposArchivoReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jComboBoxTiposArchivosReportesDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuProyectoCuenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuProyectoCuenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuProyectoCuenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuProyectoCuenta.setToolTipText("Generar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jButtonGenerarReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuProyectoCuenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuProyectoCuenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuProyectoCuenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuProyectoCuenta.setToolTipText("Cancelar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyectoCuenta.add(this.jButtonCerrarReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuProyectoCuenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta= new JScrollPane(jPanelReporteDinamicoPresuProyectoCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuProyectoCuenta);
		this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getContentPane().add(this.jScrollPanelReporteDinamicoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuProyectoCuenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuProyectoCuenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuProyectoCuenta.setName("jPanelImportacionPresuProyectoCuenta"); 
		
		this.jPanelImportacionPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuProyectoCuenta.setLayout(gridaBagLayoutImportacionPresuProyectoCuenta);
		
		
		this.jInternalFrameImportacionPresuProyectoCuenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuProyectoCuenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuProyectoCuenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuProyectoCuenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuProyectoCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuProyectoCuenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuProyectoCuenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuProyectoCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuProyectoCuenta.setResizable(true);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setClosable(true);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuProyectoCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuProyectoCuenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuProyectoCuenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuProyectoCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuProyectoCuenta.setResizable(true);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setClosable(true);
	    this.jInternalFrameImportacionPresuProyectoCuenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuProyectoCuenta = new JLabelMe();

		this.jLabelArchivoImportacionPresuProyectoCuenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuProyectoCuenta.add(this.jLabelArchivoImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuProyectoCuenta = new JFileChooser();		
		this.jFileChooserImportacionPresuProyectoCuenta.setToolTipText("ESCOGER ARCHIVO"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuProyectoCuenta = new JButtonMe();
		this.jButtonAbrirImportacionPresuProyectoCuenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuProyectoCuenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuProyectoCuenta.setToolTipText("Generar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyectoCuenta.add(this.jButtonAbrirImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuProyectoCuenta = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuProyectoCuenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuProyectoCuenta.add(this.jLabelPathArchivoImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuProyectoCuenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuProyectoCuenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuProyectoCuenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuProyectoCuenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyectoCuenta.add(this.jTextFieldPathArchivoImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuProyectoCuenta = new JButtonMe();
		this.jButtonGenerarImportacionPresuProyectoCuenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuProyectoCuenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuProyectoCuenta.setToolTipText("Generar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyectoCuenta.add(this.jButtonGenerarImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuProyectoCuenta = new JButtonMe();
		this.jButtonCerrarImportacionPresuProyectoCuenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuProyectoCuenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuProyectoCuenta.setToolTipText("Cancelar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyectoCuenta.add(this.jButtonCerrarImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuProyectoCuenta = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuProyectoCuenta= new JScrollPane(jPanelImportacionPresuProyectoCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuProyectoCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuProyectoCuenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuProyectoCuenta);
		this.jInternalFrameImportacionPresuProyectoCuenta.getContentPane().add(this.jScrollPanelImportacionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuProyectoCuenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuProyectoCuenta = new JButtonMe();
			this.jButtonAbrirOrderByPresuProyectoCuenta.setText("Orden");
			this.jButtonAbrirOrderByPresuProyectoCuenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuProyectoCuenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuProyectoCuenta";
			inputMap = this.jButtonAbrirOrderByPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuProyectoCuenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuProyectoCuenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuProyectoCuenta.setName("jPanelOrderByPresuProyectoCuenta"); 
			
			this.jPanelOrderByPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuProyectoCuenta.setLayout(gridaBagLayoutOrderByPresuProyectoCuenta);
			
			
			this.jTableDatosPresuProyectoCuentaOrderBy = new JTableMe();        
			this.jTableDatosPresuProyectoCuentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuProyectoCuentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuProyectoCuentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuProyectoCuentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuProyectoCuentaOrderBy.setViewportView(this.jTableDatosPresuProyectoCuentaOrderBy);
			this.jTableDatosPresuProyectoCuentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuProyectoCuentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuProyectoCuenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuProyectoCuenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuProyectoCuenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuProyectoCuenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuProyectoCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuProyectoCuenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuProyectoCuenta.setTitle("Orden");
			this.jInternalFrameOrderByPresuProyectoCuenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuProyectoCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuProyectoCuenta.setResizable(true);
			this.jInternalFrameOrderByPresuProyectoCuenta.setClosable(true);
			this.jInternalFrameOrderByPresuProyectoCuenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuProyectoCuenta.ipady =150;
				
			this.jPanelOrderByPresuProyectoCuenta.add(jScrollPanelDatosPresuProyectoCuentaOrderBy, this.gridBagConstraintsPresuProyectoCuenta);//this.jTableDatosPresuProyectoCuentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuProyectoCuenta = new JButtonMe();
			this.jButtonCerrarOrderByPresuProyectoCuenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuProyectoCuenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuProyectoCuenta.setToolTipText("Cancelar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuProyectoCuenta.add(this.jButtonCerrarOrderByPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuProyectoCuenta = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuProyectoCuenta= new JScrollPane(jPanelOrderByPresuProyectoCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuProyectoCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuProyectoCuenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuProyectoCuenta);
			
			this.jInternalFrameOrderByPresuProyectoCuenta.getContentPane().add(this.jScrollPanelOrderByPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
		
		} else {
			this.jButtonAbrirOrderByPresuProyectoCuenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presuproyectocuentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuProyectoCuenta.getRowHeight();//PresuProyectoCuentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.isSelected()) {
					iHeightTable=PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuProyectoCuenta.isSelected()) {
					iHeightTable=PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuProyectoCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuProyectoCuenta!=null && this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy()!=null) {
			//if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuProyectoCuenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuProyectoCuenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuProyectoCuenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presuproyectocuentaLogic.getPresuProyectoCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectocuentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuProyectoCuenta> TraerPresuProyectoCuentaBeans(List<PresuProyectoCuenta> presuproyectocuentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentas) {
					
				if(!(PresuProyectoCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuProyectoCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presuproyectocuenta.setsDetalleGeneralEntityReporte(PresuProyectoCuentaConstantesFunciones.getPresuProyectoCuentaDescripcion(presuproyectocuenta));
										
						
					
					

					if(presuproyectocuenta.getPresuAsignacions()!=null && Funciones.existeClass(classes,PresuAsignacion.class)) {
						try{presuproyectocuenta.setpresuasignacionsDescripcionReporte(new JRBeanCollectionDataSource(PresuAsignacionJInternalFrame.TraerPresuAsignacionBeans(presuproyectocuenta.getPresuAsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//presuproyectocuenta.setsDetalleGeneralEntityReporte(presuproyectocuenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//presuproyectocuentabeans.add(presuproyectocuentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presuproyectocuentas;
    }
	//PARA REPORTES FIN
}
