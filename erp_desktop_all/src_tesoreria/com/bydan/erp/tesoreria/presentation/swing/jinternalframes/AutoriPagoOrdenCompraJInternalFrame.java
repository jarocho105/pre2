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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.AutoriPagoOrdenCompraConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class AutoriPagoOrdenCompraJInternalFrame extends AutoriPagoOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutoriPagoOrdenCompra;
	
	protected JMenuBar jmenuBarAutoriPagoOrdenCompra;
	
	protected JMenu jmenuAutoriPagoOrdenCompra;
	protected JMenu jmenuDatosAutoriPagoOrdenCompra;
	protected JMenu jmenuArchivoAutoriPagoOrdenCompra;
	protected JMenu jmenuAccionesAutoriPagoOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriPagoOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsAutoriPagoOrdenCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame jInternalFrameDetalleFormAutoriPagoOrdenCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutoriPagoOrdenCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutoriPagoOrdenCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";
	
	public AutoriPagoOrdenCompraSessionBean autoripagoordencompraSessionBean;
		
	
	
	public TipoCambioSessionBean tipocambioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutoriPagoOrdenCompra> autoripagoordencompras;		
	public List<AutoriPagoOrdenCompra> autoripagoordencomprasEliminados;	
	public List<AutoriPagoOrdenCompra> autoripagoordencomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutoriPagoOrdenCompra;		
	protected JButton jButtonAbrirOrderByAutoriPagoOrdenCompra;
	
	
	//protected JPanel jPanelOrderByAutoriPagoOrdenCompra;
	//public JScrollPane jScrollPanelOrderByAutoriPagoOrdenCompra;	
	//protected JButton jButtonCerrarOrderByAutoriPagoOrdenCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutoriPagoOrdenCompraLogic autoripagoordencompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutoriPagoOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionAutoriPagoOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralAutoriPagoOrdenCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosAutoriPagoOrdenCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutoriPagoOrdenCompra;
	//public JScrollPane jScrollPanelImportacionAutoriPagoOrdenCompra;
	
	
	
	protected JPanel jPanelAccionesAutoriPagoOrdenCompra;
	
    protected JPanel jPanelPaginacionAutoriPagoOrdenCompra;
    protected JPanel jPanelParametrosReportesAutoriPagoOrdenCompra;
	protected JPanel jPanelParametrosReportesAccionesAutoriPagoOrdenCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutoriPagoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar2AutoriPagoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar3AutoriPagoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar4AutoriPagoOrdenCompra;
	//protected JPanel jPanelParametrosAuxiliar5AutoriPagoOrdenCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutoriPagoOrdenCompra;
	//protected JPanel jPanelImportacionAutoriPagoOrdenCompra;
	
	
	public JTable jTableDatosAutoriPagoOrdenCompra;
	
	
	
	//public JTable jTableDatosAutoriPagoOrdenCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutoriPagoOrdenCompra;
	protected JButton jButtonDuplicarAutoriPagoOrdenCompra;
	protected JButton jButtonCopiarAutoriPagoOrdenCompra;
	protected JButton jButtonVerFormAutoriPagoOrdenCompra;
	protected JButton jButtonNuevoRelacionesAutoriPagoOrdenCompra;
	protected JButton jButtonModificarAutoriPagoOrdenCompra;
	
    protected JButton jButtonGuardarCambiosTablaAutoriPagoOrdenCompra;
	protected JButton jButtonCerrarAutoriPagoOrdenCompra;
	
	
	protected JButton jButtonRecargarInformacionAutoriPagoOrdenCompra;
	protected JButton jButtonProcesarInformacionAutoriPagoOrdenCompra;
	
	
	protected JButton jButtonAnterioresAutoriPagoOrdenCompra;
	protected JButton jButtonSiguientesAutoriPagoOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra;
	//protected JButton jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutoriPagoOrdenCompra;
	//protected JButton jButtonGenerarImportacionAutoriPagoOrdenCompra;
	//protected JButton jButtonCerrarImportacionAutoriPagoOrdenCompra;
	//protected JFileChooser jFileChooserImportacionAutoriPagoOrdenCompra;
	//protected File fileImportacionAutoriPagoOrdenCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonDuplicarToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonNuevoRelacionesToolBarAutoriPagoOrdenCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonCopiarToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonVerFormToolBarAutoriPagoOrdenCompra;
	public JButton jButtonGuardarCambiosTablaToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonCerrarToolBarAutoriPagoOrdenCompra;
	
	protected JButton jButtonRecargarInformacionToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonProcesarInformacionToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonAnterioresToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonSiguientesToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonAbrirOrderByToolBarAutoriPagoOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDuplicarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemNuevoRelacionesAutoriPagoOrdenCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemCopiarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemVerFormAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemCerrarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemProcesarInformacionAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemAnterioresAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemSiguientesAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemAbrirOrderByAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarAutoriPagoOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriPagoOrdenCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra;
	protected JCheckBox jCheckBoxSeleccionadosAutoriPagoOrdenCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra;
	protected JCheckBox jCheckBoxConGraficoReporteAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutoriPagoOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutoriPagoOrdenCompra;
	protected JTextField jTextFieldValorCampoGeneralAutoriPagoOrdenCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutoriPagoOrdenCompra;
	//public JList<Reporte> jListColumnasSelectReporteAutoriPagoOrdenCompra;
	//public JScrollPane jScrollColumnasSelectReporteAutoriPagoOrdenCompra;
	
	//public JLabel jLabelRelacionesSelectReporteAutoriPagoOrdenCompra;
	//public JList<Reporte> jListRelacionesSelectReporteAutoriPagoOrdenCompra;
	//public JScrollPane jScrollRelacionesSelectReporteAutoriPagoOrdenCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutoriPagoOrdenCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra;
	
		
	//public JLabel jLabelArchivoImportacionAutoriPagoOrdenCompra;	
	//public JLabel jLabelPathArchivoImportacionAutoriPagoOrdenCompra;
	//protected JTextField jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra;
	
	//public JLabel jLabelColumnaCategoriaValorAutoriPagoOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra;
	
	//public JLabel jLabelColumnasValoresGraficoAutoriPagoOrdenCompra;
	//public JList<Reporte> jListColumnasValoresGraficoAutoriPagoOrdenCompra;
	//public JScrollPane jScrollColumnasValoresGraficoAutoriPagoOrdenCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdAsientoContableAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdAsientoContableAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdBancoAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdBancoAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdClienteAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdClienteAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdTipoCambioAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdTipoCambioAutoriPagoOrdenCompra;
	public JPanel jPanelFK_IdTransaccionAutoriPagoOrdenCompra;
	public JButton jButtonFK_IdTransaccionAutoriPagoOrdenCompra;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra;
	
	public JPanel jPanelid_bancoFK_IdBancoAutoriPagoOrdenCompra;
	public JLabel jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra;
	public JButton jButtonid_bancoFK_IdBancoAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteAutoriPagoOrdenCompra;
	public JLabel jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra;
	public JButton jButtonid_clienteFK_IdClienteAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra;
	
	public JPanel jPanelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra;
	public JLabel jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra;
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra;
	public JLabel jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra;
	public JButton jButtonid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompraArbol= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra;
	
	public JPanel jPanelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra;
	public JLabel jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra;
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=432;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AutoriPagoOrdenCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutoriPagoOrdenCompra)	{
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra = jButtonRecargarInformacionAutoriPagoOrdenCompra;
	}
	
	public JButton getjButtonProcesarInformacionAutoriPagoOrdenCompra() {
		return this.jButtonProcesarInformacionAutoriPagoOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriPagoOrdenCompra)	{
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra = jButtonProcesarInformacionAutoriPagoOrdenCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionAutoriPagoOrdenCompra() {
		return this.jButtonRecargarInformacionAutoriPagoOrdenCompra;
	}
	
	
	public List<AutoriPagoOrdenCompra> getautoripagoordencompras() {
		return this.autoripagoordencompras;
	}

	public void setautoripagoordencompras(List<AutoriPagoOrdenCompra> autoripagoordencompras) {
		this.autoripagoordencompras = autoripagoordencompras;
	}
	
	public List<AutoriPagoOrdenCompra> getautoripagoordencomprasAux() {
		return this.autoripagoordencomprasAux;
	}

	public void setautoripagoordencomprasAux(List<AutoriPagoOrdenCompra> autoripagoordencomprasAux) {
		this.autoripagoordencomprasAux = autoripagoordencomprasAux;
	}
	
	public List<AutoriPagoOrdenCompra> getautoripagoordencomprasEliminados() {
		return this.autoripagoordencomprasEliminados;
	}

	public void setAutoriPagoOrdenComprasEliminados(List<AutoriPagoOrdenCompra> autoripagoordencomprasEliminados) {
		this.autoripagoordencomprasEliminados = autoripagoordencomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutoriPagoOrdenCompra() {
		return jComboBoxTiposSeleccionarAutoriPagoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposSeleccionarAutoriPagoOrdenCompra) {
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra = jComboBoxTiposSeleccionarAutoriPagoOrdenCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutoriPagoOrdenCompra() {
		return jTextFieldValorCampoGeneralAutoriPagoOrdenCompra;
	}

	public void setjTextFieldValorCampoGeneralAutoriPagoOrdenCompra(
			JTextField jTextFieldValorCampoGeneralAutoriPagoOrdenCompra) {
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra = jTextFieldValorCampoGeneralAutoriPagoOrdenCompra;
	}

	public void setBorderResaltarValorCampoGeneralAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutoriPagoOrdenCompra() {
		return this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra;
	}

	public void setjCheckBoxSeleccionarTodosAutoriPagoOrdenCompra(
			JCheckBox jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra) {
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra = jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra;
	}

	public void setBorderResaltarSeleccionarTodosAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutoriPagoOrdenCompra() {
		return this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra;
	}

	public void setjCheckBoxSeleccionadosAutoriPagoOrdenCompra(
			JCheckBox jCheckBoxSeleccionadosAutoriPagoOrdenCompra) {
		this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra = jCheckBoxSeleccionadosAutoriPagoOrdenCompra;
	}
	
	public void setBorderResaltarSeleccionadosAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra = jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra;
	}

	public void setBorderResaltarTiposArchivosReportesAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposReportesAutoriPagoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposReportesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra = jComboBoxTiposReportesAutoriPagoOrdenCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra() {
	//	return jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra) {
	//	this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra = jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra = jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra;
	//}
	
	public void setBorderResaltarTiposReportesAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra = jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposPaginacionAutoriPagoOrdenCompra) {
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra = jComboBoxTiposPaginacionAutoriPagoOrdenCompra;
	}
	
	public void setBorderResaltarTiposPaginacionAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposRelacionesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra = jComboBoxTiposRelacionesAutoriPagoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposAccionesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra = jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	}
	
	public void setBorderResaltarTiposRelacionesAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutoriPagoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra() {
	//	return jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra) {
	//	this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra = jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutoriPagoOrdenCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutoriPagoOrdenCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra .setBorder(borderResaltar);		
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
		this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		
		this.autoripagoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoripagoordencompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriPagoOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Pago Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
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
		
		AutoriPagoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutoriPagoOrdenCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"nuevo","nuevo","Nuevo"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"duplicar","duplicar","Duplicar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"copiar","copiar","Copiar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"ver_form","ver_form","Ver"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"recargar","recargar","Recargar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutoriPagoOrdenCompra,this.jTtoolBarAutoriPagoOrdenCompra,
							"cerrar","cerrar","Salir"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutoriPagoOrdenCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutoriPagoOrdenCompra;
			
				this.jButtonProcesarInformacionToolBarAutoriPagoOrdenCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutoriPagoOrdenCompra;
				
		//protected JButton jButtonModificarToolBarAutoriPagoOrdenCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutoriPagoOrdenCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutoriPagoOrdenCompra=new JMenuMe("General");
		this.jmenuArchivoAutoriPagoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuAccionesAutoriPagoOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDatosAutoriPagoOrdenCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriPagoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriPagoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriPagoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutoriPagoOrdenCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutoriPagoOrdenCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutoriPagoOrdenCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutoriPagoOrdenCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutoriPagoOrdenCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutoriPagoOrdenCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutoriPagoOrdenCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutoriPagoOrdenCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutoriPagoOrdenCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutoriPagoOrdenCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutoriPagoOrdenCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutoriPagoOrdenCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriPagoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriPagoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriPagoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutoriPagoOrdenCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutoriPagoOrdenCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutoriPagoOrdenCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutoriPagoOrdenCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutoriPagoOrdenCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutoriPagoOrdenCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutoriPagoOrdenCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutoriPagoOrdenCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutoriPagoOrdenCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutoriPagoOrdenCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutoriPagoOrdenCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutoriPagoOrdenCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutoriPagoOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutoriPagoOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutoriPagoOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutoriPagoOrdenCompra.add(this.jMenuItemCerrarAutoriPagoOrdenCompra);
			
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemNuevoAutoriPagoOrdenCompra);
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra);
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemNuevoRelacionesAutoriPagoOrdenCompra);
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra);		
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemDuplicarAutoriPagoOrdenCompra);		
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemCopiarAutoriPagoOrdenCompra);		
			this.jmenuAccionesAutoriPagoOrdenCompra.add(this.jMenuItemVerFormAutoriPagoOrdenCompra);		
			
			this.jmenuDatosAutoriPagoOrdenCompra.add(this.jMenuItemRecargarInformacionAutoriPagoOrdenCompra);				
			this.jmenuDatosAutoriPagoOrdenCompra.add(this.jMenuItemAnterioresAutoriPagoOrdenCompra);				
			this.jmenuDatosAutoriPagoOrdenCompra.add(this.jMenuItemSiguientesAutoriPagoOrdenCompra);				
			this.jmenuDatosAutoriPagoOrdenCompra.add(this.jMenuItemAbrirOrderByAutoriPagoOrdenCompra);				
			this.jmenuDatosAutoriPagoOrdenCompra.add(this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutoriPagoOrdenCompra.add(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutoriPagoOrdenCompra.add(this.jmenuArchivoAutoriPagoOrdenCompra);		
			this.jmenuBarAutoriPagoOrdenCompra.add(this.jmenuAccionesAutoriPagoOrdenCompra);		
			this.jmenuBarAutoriPagoOrdenCompra.add(this.jmenuDatosAutoriPagoOrdenCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutoriPagoOrdenCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutoriPagoOrdenCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdAsientoContableAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdAsientoContableAutoriPagoOrdenCompra.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableAutoriPagoOrdenCompra,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra.setFocusable(false);

		this.jPanelFK_IdBancoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoAutoriPagoOrdenCompra.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdBancoAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdBancoAutoriPagoOrdenCompra.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoAutoriPagoOrdenCompra,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra.setText("Banco :");
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAutoriPagoOrdenCompra.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdClienteAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdClienteAutoriPagoOrdenCompra.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAutoriPagoOrdenCompra,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra.setText("Cliente :");
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra.setFocusable(false);

		this.jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra.setToolTipText("Buscar Por Cuenta Banco ");
		this.jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra.setToolTipText("Buscar Por Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra,"buscar_button","Buscar Por Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setText("Cuenta Banco :");
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setToolTipText("Cuenta Banco");
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		this.jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra,"buscar_button","Buscar Por Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setText("Orden Compra :");
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setToolTipText("Orden Compra");
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdTipoCambioAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdTipoCambioAutoriPagoOrdenCompra.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioAutoriPagoOrdenCompra,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra.setFocusable(false);

		this.jPanelFK_IdTransaccionAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionAutoriPagoOrdenCompra.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdTransaccionAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdTransaccionAutoriPagoOrdenCompra.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionAutoriPagoOrdenCompra,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAutoriPagoOrdenCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriPagoOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutoriPagoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutoriPagoOrdenCompra = new AutoriPagoOrdenCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autori Pago Orden Compra DATOS");
			this.jInternalFrameDetalleFormAutoriPagoOrdenCompra = new AutoriPagoOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.autoripagoordencompraSessionBean.getConGuardarRelaciones(),this.autoripagoordencompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutoriPagoOrdenCompra = null;//new AutoriPagoOrdenCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriPagoOrdenCompra= new GridBagLayout();
		
		
		this.jTableDatosAutoriPagoOrdenCompra = new JTableMe();      
		
		String sToolTipAutoriPagoOrdenCompra="";
		sToolTipAutoriPagoOrdenCompra=AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriPagoOrdenCompra+="(Tesoreria.AutoriPagoOrdenCompra)";
		}
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriPagoOrdenCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutoriPagoOrdenCompra.setToolTipText(sToolTipAutoriPagoOrdenCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutoriPagoOrdenCompra);
		this.jTableDatosAutoriPagoOrdenCompra.setAutoCreateRowSorter(true);
		this.jTableDatosAutoriPagoOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutoriPagoOrdenCompra.setRowSelectionAllowed(true);
		this.jTableDatosAutoriPagoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonDuplicarAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonCopiarAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonVerFormAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonNuevoRelacionesAutoriPagoOrdenCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonCerrarAutoriPagoOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosAutoriPagoOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Pago Orden Compra";
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriPagoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriPagoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesAutoriPagoOrdenCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra=new ReporteDinamicoJInternalFrame(AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutoriPagoOrdenCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutoriPagoOrdenCompra=new ImportacionJInternalFrame(AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutoriPagoOrdenCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutoriPagoOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByAutoriPagoOrdenCompra.setText("Orden");
		this.jButtonAbrirOrderByAutoriPagoOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriPagoOrdenCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriPagoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriPagoOrdenCompra,false,this);
			
			//this.cargarOrderByAutoriPagoOrdenCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriPagoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriPagoOrdenCompra,true,this);
			
			//this.cargarOrderByAutoriPagoOrdenCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutoriPagoOrdenCompra.setText("Nuevo");
		this.jButtonDuplicarAutoriPagoOrdenCompra.setText("Duplicar");
		this.jButtonCopiarAutoriPagoOrdenCompra.setText("Copiar");
		this.jButtonVerFormAutoriPagoOrdenCompra.setText("Ver");
		this.jButtonNuevoRelacionesAutoriPagoOrdenCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.setText("Guardar");
		this.jButtonCerrarAutoriPagoOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriPagoOrdenCompra,"nuevo_button","Nuevo",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutoriPagoOrdenCompra,"duplicar_button","Duplicar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutoriPagoOrdenCompra,"copiar_button","Copiar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutoriPagoOrdenCompra,"ver_form","Ver",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutoriPagoOrdenCompra,"nuevorelaciones_button","Nuevo Rel",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra,"guardarcambiostabla_button","Guardar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriPagoOrdenCompra,"cerrar_button","Salir",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutoriPagoOrdenCompra.setToolTipText("Nuevo"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutoriPagoOrdenCompra.setToolTipText("Duplicar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutoriPagoOrdenCompra.setToolTipText("Copiar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutoriPagoOrdenCompra.setToolTipText("Ver"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutoriPagoOrdenCompra.setToolTipText("Nuevo Rel"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.setToolTipText("Guardar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriPagoOrdenCompra.setToolTipText("Salir"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriPagoOrdenCompra";
		inputMap = this.jButtonNuevoAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriPagoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriPagoOrdenCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutoriPagoOrdenCompra";
		inputMap = this.jButtonDuplicarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutoriPagoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutoriPagoOrdenCompra"));
		
		//COPIAR
		sMapKey = "CopiarAutoriPagoOrdenCompra";
		inputMap = this.jButtonCopiarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutoriPagoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutoriPagoOrdenCompra"));
		
		//VEr FORM
		sMapKey = "VerFormAutoriPagoOrdenCompra";
		inputMap = this.jButtonVerFormAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutoriPagoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutoriPagoOrdenCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutoriPagoOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutoriPagoOrdenCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutoriPagoOrdenCompra";
		inputMap = this.jButtonModificarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutoriPagoOrdenCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutoriPagoOrdenCompra";
		inputMap = this.jButtonCerrarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriPagoOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriPagoOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriPagoOrdenCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutoriPagoOrdenCompra.setName("jPanelParametrosReportesAutoriPagoOrdenCompra"); 
		
		this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra.setName("jPanelParametrosReportesAccionesAutoriPagoOrdenCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.setText("Recargar");
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.setToolTipText("Recargar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutoriPagoOrdenCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setText("Procesar");
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setToolTipText("Procesar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setVisible(false);
			
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra.setText("Accion");
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutoriPagoOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesAutoriPagoOrdenCompra.setText("Acciones");		
		this.jLabelAccionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutoriPagoOrdenCompra = new JButtonMe();
		//this.jButtonAnterioresAutoriPagoOrdenCompra.setText("<<");
        this.jButtonAnterioresAutoriPagoOrdenCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutoriPagoOrdenCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutoriPagoOrdenCompra = new JButtonMe();
		//this.jButtonSiguientesAutoriPagoOrdenCompra.setText(">>");
        this.jButtonSiguientesAutoriPagoOrdenCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutoriPagoOrdenCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra,"nuevoguardarcambios_button","Nue",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutoriPagoOrdenCompra";
		inputMap = this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutoriPagoOrdenCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutoriPagoOrdenCompra";
		inputMap = this.jButtonRecargarInformacionAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutoriPagoOrdenCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutoriPagoOrdenCompra";
		inputMap = this.jButtonSiguientesAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutoriPagoOrdenCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutoriPagoOrdenCompra";
		inputMap = this.jButtonAnterioresAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutoriPagoOrdenCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutoriPagoOrdenCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutoriPagoOrdenCompra = new GridBagLayout();

			this.jPanelPaginacionAutoriPagoOrdenCompra.setLayout(gridaBagLayoutPaginacionAutoriPagoOrdenCompra);						
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonAnterioresAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					
						
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
			
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonNuevoGuardarCambiosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
						
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonSiguientesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonNuevoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
						
			
			
			if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			}
			
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonDuplicarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonCopiarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonVerFormAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutoriPagoOrdenCompra.add(this.jButtonCerrarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutoriPagoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutoriPagoOrdenCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutoriPagoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutoriPagoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutoriPagoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutoriPagoOrdenCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.setLayout(gridaBagParametrosReportesAutoriPagoOrdenCompra);
			this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra.setLayout(gridaBagParametrosReportesAccionesAutoriPagoOrdenCompra);
			
			
			this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra.setLayout(gridaBagParametrosAuxiliar1AutoriPagoOrdenCompra);
			this.jPanelParametrosAuxiliar2AutoriPagoOrdenCompra.setLayout(gridaBagParametrosAuxiliar2AutoriPagoOrdenCompra);
			this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra.setLayout(gridaBagParametrosAuxiliar3AutoriPagoOrdenCompra);
			this.jPanelParametrosAuxiliar4AutoriPagoOrdenCompra.setLayout(gridaBagParametrosAuxiliar4AutoriPagoOrdenCompra);
			//this.jPanelParametrosAuxiliar5AutoriPagoOrdenCompra.setLayout(gridaBagParametrosAuxiliar2AutoriPagoOrdenCompra);			
			
			
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jButtonRecargarInformacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra.add(this.jComboBoxTiposPaginacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra.add(this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra.add(this.jComboBoxTiposArchivosReportesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jPanelParametrosAuxiliar1AutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutoriPagoOrdenCompra.add(this.jComboBoxTiposReportesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);																		
			
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AutoriPagoOrdenCompra.add(this.jComboBoxTiposGraficosReportesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jPanelParametrosAuxiliar4AutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jComboBoxTiposReportesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jCheckBoxGenerarReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jPanelParametrosAuxiliar2AutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jLabelAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jButtonAbrirOrderByAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jComboBoxTiposSeleccionarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			
			
			/*
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra.add(this.jCheckBoxSeleccionarTodosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);															
				
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra.add(this.jCheckBoxSeleccionadosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);															
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra.add(this.jCheckBoxConGraficoReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jPanelParametrosAuxiliar3AutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jComboBoxTiposAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
	
				
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPagoOrdenCompra.add(this.jTextFieldValorCampoGeneralAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutoriPagoOrdenCompra = new GridBagLayout();

			this.jScrollPanelDatosAutoriPagoOrdenCompra.setLayout(gridaBagLayoutDatosAutoriPagoOrdenCompra);
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
			
			this.jScrollPanelDatosAutoriPagoOrdenCompra.add(this.jTableDatosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setViewportView(this.jTableDatosAutoriPagoOrdenCompra);
		this.jTableDatosAutoriPagoOrdenCompra.setFillsViewportHeight(true);
		this.jTableDatosAutoriPagoOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutoriPagoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesAutoriPagoOrdenCompra.setLayout(gridaBagLayoutAccionesAutoriPagoOrdenCompra);
		
		
		/*	
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
			
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonNuevoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdAsientoContableAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.add(jLabelid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.add(jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);


		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdAsientoContableAutoriPagoOrdenCompra.add(jButtonFK_IdAsientoContableAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdBancoAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdBancoAutoriPagoOrdenCompra.add(jLabelid_bancoFK_IdBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdBancoAutoriPagoOrdenCompra.add(jComboBoxid_bancoFK_IdBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdBancoAutoriPagoOrdenCompra.add(jButtonFK_IdBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("2.-Por Banco ", jPanelFK_IdBancoAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdClienteAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdClienteAutoriPagoOrdenCompra.add(jLabelid_clienteFK_IdClienteAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdClienteAutoriPagoOrdenCompra.add(jComboBoxid_clienteFK_IdClienteAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);


		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdClienteAutoriPagoOrdenCompra.add(this.jButtonBuscarFK_IdClienteid_clienteAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdClienteAutoriPagoOrdenCompra.add(jButtonFK_IdClienteAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("3.-Por Cliente ", jPanelFK_IdClienteAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdCuentaBancoAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra.add(jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra.add(jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra.add(jButtonFK_IdCuentaBancoAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("4.-Por Cuenta Banco ", jPanelFK_IdCuentaBancoAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdOrdenCompraAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra.add(jLabelid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra.add(jComboBoxid_orden_compraFK_IdOrdenCompraAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra.add(jButtonFK_IdOrdenCompraAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("5.-Por Orden Compra ", jPanelFK_IdOrdenCompraAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdTipoCambioAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.add(jLabelid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.add(jComboBoxid_tipo_cambioFK_IdTipoCambioAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);


		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdTipoCambioAutoriPagoOrdenCompra.add(jButtonFK_IdTipoCambioAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("6.-Por Tipo Cambio ", jPanelFK_IdTipoCambioAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionAutoriPagoOrdenCompra.setLayout(gridaBagLayoutFK_IdTransaccionAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		jPanelFK_IdTransaccionAutoriPagoOrdenCompra.add(jLabelid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
		jPanelFK_IdTransaccionAutoriPagoOrdenCompra.add(jComboBoxid_transaccionFK_IdTransaccionAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPagoOrdenCompra.gridy = 1;
		gridBagConstraintsAutoriPagoOrdenCompra.gridx =1;
		jPanelFK_IdTransaccionAutoriPagoOrdenCompra.add(jButtonFK_IdTransaccionAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);

		jTabbedPaneBusquedasAutoriPagoOrdenCompra.addTab("7.-Por Transaccion ", jPanelFK_IdTransaccionAutoriPagoOrdenCompra);
		jTabbedPaneBusquedasAutoriPagoOrdenCompra.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriPagoOrdenCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsAutoriPagoOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;		
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);								
		
		
		/*
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/		
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriPagoOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
				
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AutoriPagoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutoriPagoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriPagoOrdenCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosAutoriPagoOrdenCompra.setLayout(gridaBagLayoutBusquedasParametrosAutoriPagoOrdenCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutoriPagoOrdenCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutoriPagoOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setName("jPanelReporteDinamicoAutoriPagoOrdenCompra"); 
		
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.setLayout(gridaBagLayoutReporteDinamicoAutoriPagoOrdenCompra);
		
		
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelColumnasSelectReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutoriPagoOrdenCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteAutoriPagoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra=new JScrollPane(this.jListColumnasSelectReporteAutoriPagoOrdenCompra);
			
			this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jListColumnasSelectReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutoriPagoOrdenCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutoriPagoOrdenCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutoriPagoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutoriPagoOrdenCompra=new JScrollPane(this.jListRelacionesSelectReporteAutoriPagoOrdenCompra);
			
			this.jScrollRelacionesSelectReporteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutoriPagoOrdenCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelConGraficoDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jCheckBoxConGraficoDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelColumnaCategoriaGraficoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelColumnaCategoriaValorAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jComboBoxColumnaCategoriaValorAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelColumnasValoresGraficoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAutoriPagoOrdenCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoAutoriPagoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAutoriPagoOrdenCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra=new JScrollPane(this.jListColumnasValoresGraficoAutoriPagoOrdenCompra);
			
			this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jListColumnasSelectReporteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jScrollColumnasValoresGraficoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelTiposGraficosReportesDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAutoriPagoOrdenCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jComboBoxTiposGraficosReportesDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelGenerarExcelReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra.setToolTipText("Generar EXCEL"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jButtonGenerarExcelReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jComboBoxTiposReportesDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jLabelTiposArchivoReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jComboBoxTiposArchivosReportesDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra.setToolTipText("Generar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jButtonGenerarReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra.setToolTipText("Cancelar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPagoOrdenCompra.add(this.jButtonCerrarReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutoriPagoOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra= new JScrollPane(jPanelReporteDinamicoAutoriPagoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutoriPagoOrdenCompra);
		this.jInternalFrameReporteDinamicoAutoriPagoOrdenCompra.getContentPane().add(this.jScrollPanelReporteDinamicoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutoriPagoOrdenCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutoriPagoOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutoriPagoOrdenCompra.setName("jPanelImportacionAutoriPagoOrdenCompra"); 
		
		this.jPanelImportacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutoriPagoOrdenCompra.setLayout(gridaBagLayoutImportacionAutoriPagoOrdenCompra);
		
		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutoriPagoOrdenCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutoriPagoOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionAutoriPagoOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelArchivoImportacionAutoriPagoOrdenCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jLabelArchivoImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutoriPagoOrdenCompra = new JFileChooser();		
		this.jFileChooserImportacionAutoriPagoOrdenCompra.setToolTipText("ESCOGER ARCHIVO"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonAbrirImportacionAutoriPagoOrdenCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutoriPagoOrdenCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutoriPagoOrdenCompra.setToolTipText("Generar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jButtonAbrirImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jLabelPathArchivoImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jTextFieldPathArchivoImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonGenerarImportacionAutoriPagoOrdenCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutoriPagoOrdenCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutoriPagoOrdenCompra.setToolTipText("Generar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jButtonGenerarImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonCerrarImportacionAutoriPagoOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutoriPagoOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutoriPagoOrdenCompra.setToolTipText("Cancelar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPagoOrdenCompra.add(this.jButtonCerrarImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutoriPagoOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionAutoriPagoOrdenCompra= new JScrollPane(jPanelImportacionAutoriPagoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutoriPagoOrdenCompra);
		this.jInternalFrameImportacionAutoriPagoOrdenCompra.getContentPane().add(this.jScrollPanelImportacionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutoriPagoOrdenCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutoriPagoOrdenCompra = new JButtonMe();
			this.jButtonAbrirOrderByAutoriPagoOrdenCompra.setText("Orden");
			this.jButtonAbrirOrderByAutoriPagoOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriPagoOrdenCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutoriPagoOrdenCompra";
			inputMap = this.jButtonAbrirOrderByAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutoriPagoOrdenCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutoriPagoOrdenCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutoriPagoOrdenCompra.setName("jPanelOrderByAutoriPagoOrdenCompra"); 
			
			this.jPanelOrderByAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutoriPagoOrdenCompra.setLayout(gridaBagLayoutOrderByAutoriPagoOrdenCompra);
			
			
			this.jTableDatosAutoriPagoOrdenCompraOrderBy = new JTableMe();        
			this.jTableDatosAutoriPagoOrdenCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutoriPagoOrdenCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutoriPagoOrdenCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutoriPagoOrdenCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutoriPagoOrdenCompraOrderBy.setViewportView(this.jTableDatosAutoriPagoOrdenCompraOrderBy);
			this.jTableDatosAutoriPagoOrdenCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutoriPagoOrdenCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutoriPagoOrdenCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutoriPagoOrdenCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutoriPagoOrdenCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutoriPagoOrdenCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setTitle("Orden");
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setResizable(true);
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setClosable(true);
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutoriPagoOrdenCompra.ipady =150;
				
			this.jPanelOrderByAutoriPagoOrdenCompra.add(jScrollPanelDatosAutoriPagoOrdenCompraOrderBy, this.gridBagConstraintsAutoriPagoOrdenCompra);//this.jTableDatosAutoriPagoOrdenCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutoriPagoOrdenCompra = new JButtonMe();
			this.jButtonCerrarOrderByAutoriPagoOrdenCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutoriPagoOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutoriPagoOrdenCompra.setToolTipText("Cancelar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutoriPagoOrdenCompra.add(this.jButtonCerrarOrderByAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutoriPagoOrdenCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByAutoriPagoOrdenCompra= new JScrollPane(jPanelOrderByAutoriPagoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutoriPagoOrdenCompra);
			
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getContentPane().add(this.jScrollPanelOrderByAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
		
		} else {
			this.jButtonAbrirOrderByAutoriPagoOrdenCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//4230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.autoripagoordencompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAutoriPagoOrdenCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutoriPagoOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutoriPagoOrdenCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAutoriPagoOrdenCompra.getRowHeight();//AutoriPagoOrdenCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.isSelected()) {
					iHeightTable=AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriPagoOrdenCompra.isSelected()) {
					iHeightTable=AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriPagoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutoriPagoOrdenCompra!=null && this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutoriPagoOrdenCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=autoripagoordencompraLogic.getAutoriPagoOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoripagoordencompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AutoriPagoOrdenCompra> TraerAutoriPagoOrdenCompraBeans(List<AutoriPagoOrdenCompra> autoripagoordencompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutoriPagoOrdenCompra autoripagoordencompra:autoripagoordencompras) {
					
				if(!(AutoriPagoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutoriPagoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autoripagoordencompra.setsDetalleGeneralEntityReporte(AutoriPagoOrdenCompraConstantesFunciones.getAutoriPagoOrdenCompraDescripcion(autoripagoordencompra));
										
						
					
						
					
				} else  {
							
					//autoripagoordencompra.setsDetalleGeneralEntityReporte(autoripagoordencompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//autoripagoordencomprabeans.add(autoripagoordencomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autoripagoordencompras;
    }
	//PARA REPORTES FIN
}
