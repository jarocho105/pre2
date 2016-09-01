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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class FormaPagoPuntoVentaJInternalFrame extends FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarFormaPagoPuntoVenta;
	
	protected JMenuBar jmenuBarFormaPagoPuntoVenta;
	
	protected JMenu jmenuFormaPagoPuntoVenta;
	protected JMenu jmenuDatosFormaPagoPuntoVenta;
	protected JMenu jmenuArchivoFormaPagoPuntoVenta;
	protected JMenu jmenuAccionesFormaPagoPuntoVenta;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPagoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFormaPagoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormFormaPagoPuntoVenta;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormaPagoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormaPagoPuntoVenta;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabancopunven="";

	protected TipoRiesgoChequeBeanSwingJInternalFrame tiporiesgochequeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporiesgocheque="";

	protected BancoBeanSwingJInternalFrame bancotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bancotarjeta="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";

	protected TipoInteresTarjetaBeanSwingJInternalFrame tipointerestarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointerestarjeta="";

	protected TipoPagoTarjetaBeanSwingJInternalFrame tipopagotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopagotarjeta="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean;
	public TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean;
	public BancoSessionBean bancotarjetaSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	public TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean;
	public TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean;
	public ConexionSessionBean conexionSessionBean;
	public MesSessionBean mesSessionBean;
	public AnioSessionBean anioSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormaPagoPuntoVenta> formapagopuntoventas;		
	public List<FormaPagoPuntoVenta> formapagopuntoventasEliminados;	
	public List<FormaPagoPuntoVenta> formapagopuntoventasAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByFormaPagoPuntoVenta;		
	protected JButton jButtonAbrirOrderByFormaPagoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByFormaPagoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByFormaPagoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByFormaPagoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFormaPagoPuntoVenta;
    
	
	/*
	//public JScrollPane jScrollPanelDatosFormaPagoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormaPagoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionFormaPagoPuntoVenta;
	*/
	
	
	protected JPanel jPanelAccionesFormaPagoPuntoVenta;
	
    protected JPanel jPanelPaginacionFormaPagoPuntoVenta;
    protected JPanel jPanelParametrosReportesFormaPagoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesFormaPagoPuntoVenta;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciogeneralFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciocreditoFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciocreditoFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciocreditoFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciochequeFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciochequeFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1FormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2FormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3FormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4FormaPagoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5FormaPagoPuntoVenta;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoFormaPagoPuntoVenta;
	//protected JPanel jPanelImportacionFormaPagoPuntoVenta;
	*/
	
	public JTable jTableDatosFormaPagoPuntoVenta;
	
	
	/*
	//public JTable jTableDatosFormaPagoPuntoVentaOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormaPagoPuntoVenta;
	protected JButton jButtonDuplicarFormaPagoPuntoVenta;
	protected JButton jButtonCopiarFormaPagoPuntoVenta;
	protected JButton jButtonVerFormFormaPagoPuntoVenta;
	protected JButton jButtonNuevoRelacionesFormaPagoPuntoVenta;
	protected JButton jButtonModificarFormaPagoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaFormaPagoPuntoVenta;
	protected JButton jButtonCerrarFormaPagoPuntoVenta;
	
	/*
	protected JButton jButtonRecargarInformacionFormaPagoPuntoVenta;
	protected JButton jButtonProcesarInformacionFormaPagoPuntoVenta;
	*/
	
	protected JButton jButtonAnterioresFormaPagoPuntoVenta;
	protected JButton jButtonSiguientesFormaPagoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosFormaPagoPuntoVenta;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoFormaPagoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoFormaPagoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormaPagoPuntoVenta;
	//protected JButton jButtonGenerarImportacionFormaPagoPuntoVenta;
	//protected JButton jButtonCerrarImportacionFormaPagoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionFormaPagoPuntoVenta;
	//protected File fileImportacionFormaPagoPuntoVenta;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarFormaPagoPuntoVenta;
	protected JButton jButtonDuplicarToolBarFormaPagoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarFormaPagoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarFormaPagoPuntoVenta;
	protected JButton jButtonCopiarToolBarFormaPagoPuntoVenta;
	protected JButton jButtonVerFormToolBarFormaPagoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarFormaPagoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPagoPuntoVenta;
	protected JButton jButtonCerrarToolBarFormaPagoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarFormaPagoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarFormaPagoPuntoVenta;
	protected JButton jButtonAnterioresToolBarFormaPagoPuntoVenta;
	protected JButton jButtonSiguientesToolBarFormaPagoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormaPagoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarFormaPagoPuntoVenta;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesFormaPagoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCopiarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemVerFormFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCerrarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFormaPagoPuntoVenta;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPagoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosFormaPagoPuntoVenta;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormaPagoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralFormaPagoPuntoVenta;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteFormaPagoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteFormaPagoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteFormaPagoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteFormaPagoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteFormaPagoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteFormaPagoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormaPagoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionFormaPagoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionFormaPagoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionFormaPagoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorFormaPagoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoFormaPagoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoFormaPagoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoFormaPagoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdAsientoContableFormaPagoPuntoVenta;
	public JButton jButtonFK_IdAsientoContableFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdBancoFormaPagoPuntoVenta;
	public JButton jButtonFK_IdBancoFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta;
	public JButton jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdConexionFormaPagoPuntoVenta;
	public JButton jButtonFK_IdConexionFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta;
	public JButton jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdCuentaContableFormaPagoPuntoVenta;
	public JButton jButtonFK_IdCuentaContableFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta;
	public JButton jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta;
	public JButton jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta;
	public JButton jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta;
	public JButton jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta;
	public JButton jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta;
	public JButton jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta;
	
	public JPanel jPanelid_bancoFK_IdBancoFormaPagoPuntoVenta;
	public JLabel jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta;
	public JButton jButtonid_bancoFK_IdBancoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_conexionFK_IdConexionFormaPagoPuntoVenta;
	public JLabel jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta;
	public JButton jButtonid_conexionFK_IdConexionFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta;
	public JLabel jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta;
	public JButton jButtonid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVentaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta;
	
	public JPanel jPanelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta;
	public JLabel jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta;
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	*/
	
	
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
	//public int iHeightFormulario=2618;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormaPagoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormaPagoPuntoVenta)	{
		this.jButtonRecargarInformacionFormaPagoPuntoVenta = jButtonRecargarInformacionFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionFormaPagoPuntoVenta() {
		return this.jButtonProcesarInformacionFormaPagoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPagoPuntoVenta)	{
		this.jButtonProcesarInformacionFormaPagoPuntoVenta = jButtonProcesarInformacionFormaPagoPuntoVenta;
	}
	*/
	
	public JButton getjButtonRecargarInformacionFormaPagoPuntoVenta() {
		return new JButton();
	}
	
	
	public List<FormaPagoPuntoVenta> getformapagopuntoventas() {
		return this.formapagopuntoventas;
	}

	public void setformapagopuntoventas(List<FormaPagoPuntoVenta> formapagopuntoventas) {
		this.formapagopuntoventas = formapagopuntoventas;
	}
	
	public List<FormaPagoPuntoVenta> getformapagopuntoventasAux() {
		return this.formapagopuntoventasAux;
	}

	public void setformapagopuntoventasAux(List<FormaPagoPuntoVenta> formapagopuntoventasAux) {
		this.formapagopuntoventasAux = formapagopuntoventasAux;
	}
	
	public List<FormaPagoPuntoVenta> getformapagopuntoventasEliminados() {
		return this.formapagopuntoventasEliminados;
	}

	public void setFormaPagoPuntoVentasEliminados(List<FormaPagoPuntoVenta> formapagopuntoventasEliminados) {
		this.formapagopuntoventasEliminados = formapagopuntoventasEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormaPagoPuntoVenta() {
		return jComboBoxTiposSeleccionarFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarFormaPagoPuntoVenta) {
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta = jComboBoxTiposSeleccionarFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormaPagoPuntoVenta() {
		return jTextFieldValorCampoGeneralFormaPagoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralFormaPagoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralFormaPagoPuntoVenta) {
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta = jTextFieldValorCampoGeneralFormaPagoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormaPagoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosFormaPagoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosFormaPagoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta = jCheckBoxSeleccionarTodosFormaPagoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormaPagoPuntoVenta() {
		return this.jCheckBoxSeleccionadosFormaPagoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosFormaPagoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosFormaPagoPuntoVenta) {
		this.jCheckBoxSeleccionadosFormaPagoPuntoVenta = jCheckBoxSeleccionadosFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesFormaPagoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta = jComboBoxTiposArchivosReportesFormaPagoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposReportesFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposReportesFormaPagoPuntoVenta) {
		this.jComboBoxTiposReportesFormaPagoPuntoVenta = jComboBoxTiposReportesFormaPagoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormaPagoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormaPagoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta = jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesFormaPagoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta = jComboBoxTiposGraficosReportesFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormaPagoPuntoVenta() {
		return this.jComboBoxTiposPaginacionFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionFormaPagoPuntoVenta) {
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta = jComboBoxTiposPaginacionFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposRelacionesFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFormaPagoPuntoVenta) {
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta = jComboBoxTiposRelacionesFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta = jComboBoxTiposAccionesFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormaPagoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormaPagoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta = jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormaPagoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormaPagoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 3650) {
			iWidth=3650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarFormaPagoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"copiar","copiar","Copiar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"recargar","recargar","Recargar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormaPagoPuntoVenta,this.jTtoolBarFormaPagoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormaPagoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormaPagoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarFormaPagoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormaPagoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarFormaPagoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarFormaPagoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormaPagoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoFormaPagoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesFormaPagoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosFormaPagoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPagoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPagoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPagoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormaPagoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormaPagoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormaPagoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormaPagoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormaPagoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormaPagoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormaPagoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPagoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormaPagoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormaPagoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormaPagoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormaPagoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormaPagoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormaPagoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormaPagoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormaPagoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormaPagoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormaPagoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormaPagoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormaPagoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormaPagoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormaPagoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormaPagoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormaPagoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormaPagoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormaPagoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormaPagoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormaPagoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormaPagoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormaPagoPuntoVenta.add(this.jMenuItemCerrarFormaPagoPuntoVenta);
			
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemNuevoFormaPagoPuntoVenta);
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta);
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemNuevoRelacionesFormaPagoPuntoVenta);
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta);		
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemDuplicarFormaPagoPuntoVenta);		
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemCopiarFormaPagoPuntoVenta);		
			this.jmenuAccionesFormaPagoPuntoVenta.add(this.jMenuItemVerFormFormaPagoPuntoVenta);		
			
			this.jmenuDatosFormaPagoPuntoVenta.add(this.jMenuItemRecargarInformacionFormaPagoPuntoVenta);				
			this.jmenuDatosFormaPagoPuntoVenta.add(this.jMenuItemAnterioresFormaPagoPuntoVenta);				
			this.jmenuDatosFormaPagoPuntoVenta.add(this.jMenuItemSiguientesFormaPagoPuntoVenta);				
			this.jmenuDatosFormaPagoPuntoVenta.add(this.jMenuItemAbrirOrderByFormaPagoPuntoVenta);				
			this.jmenuDatosFormaPagoPuntoVenta.add(this.jMenuItemMostrarOcultarFormaPagoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormaPagoPuntoVenta.add(this.jmenuArchivoFormaPagoPuntoVenta);		
			this.jmenuBarFormaPagoPuntoVenta.add(this.jmenuAccionesFormaPagoPuntoVenta);		
			this.jmenuBarFormaPagoPuntoVenta.add(this.jmenuDatosFormaPagoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormaPagoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasFormaPagoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableFormaPagoPuntoVenta.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdAsientoContableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdAsientoContableFormaPagoPuntoVenta.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableFormaPagoPuntoVenta,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdBancoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoFormaPagoPuntoVenta.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBancoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBancoFormaPagoPuntoVenta.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoFormaPagoPuntoVenta,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta.setText("Banco :");
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setText("Banco :");
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setToolTipText("Banco");
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdConexionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConexionFormaPagoPuntoVenta.setToolTipText("Buscar Por Conexion ");
		this.jButtonFK_IdConexionFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdConexionFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdConexionFormaPagoPuntoVenta.setToolTipText("Buscar Por Conexion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConexionFormaPagoPuntoVenta,"buscar_button","Buscar Por Conexion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConexionFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta.setText("Conexion :");
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta.setToolTipText("Conexion");
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setToolTipText("Buscar Por Cuenta Banco Pun Ven ");
		this.jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setToolTipText("Buscar Por Cuenta Banco Pun Ven ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta,"buscar_button","Buscar Por Cuenta Banco Pun Ven ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setText("Cuenta Banco Pun Ven :");
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setToolTipText("Cuenta Banco Pun Ven");
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFormaPagoPuntoVenta.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdCuentaContableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdCuentaContableFormaPagoPuntoVenta.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFormaPagoPuntoVenta,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setToolTipText("Buscar Por Factura Punto Venta ");
		this.jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setToolTipText("Buscar Por Factura Punto Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta,"buscar_button","Buscar Por Factura Punto Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setText("Factura Punto Venta :");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setToolTipText("Factura Punto Venta");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta.setToolTipText("Buscar Por Tarjeta Credito ");
		this.jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta.setToolTipText("Buscar Por Tarjeta Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta,"buscar_button","Buscar Por Tarjeta Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setText("Tarjeta Credito :");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setToolTipText("Tarjeta Credito");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Interes Tarjeta ");
		this.jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Interes Tarjeta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta,"buscar_button","Buscar Por Tipo Interes Tarjeta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setText("Tipo Interes Tarjeta :");
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setToolTipText("Tipo Interes Tarjeta");
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Pago Tarjeta ");
		this.jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Pago Tarjeta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta,"buscar_button","Buscar Por Tipo Pago Tarjeta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setText("Tipo Pago Tarjeta :");
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setToolTipText("Tipo Pago Tarjeta");
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Riesgo Cheque ");
		this.jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setToolTipText("Buscar Por Tipo Riesgo Cheque ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta,"buscar_button","Buscar Por Tipo Riesgo Cheque ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setText("Tipo Riesgo Cheque :");
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setToolTipText("Tipo Riesgo Cheque");
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormaPagoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasFormaPagoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFormaPagoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFormaPagoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleFormaPagoPuntoVenta = new FormaPagoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
			this.jInternalFrameDetalleFormFormaPagoPuntoVenta = new FormaPagoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.formapagopuntoventaSessionBean.getConGuardarRelaciones(),this.formapagopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormaPagoPuntoVenta = null;//new FormaPagoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutFormaPagoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosFormaPagoPuntoVenta = new JTableMe();      
		
		String sToolTipFormaPagoPuntoVenta="";
		sToolTipFormaPagoPuntoVenta=FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPagoPuntoVenta+="(PuntoVenta.FormaPagoPuntoVenta)";
		}
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPagoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormaPagoPuntoVenta.setToolTipText(sToolTipFormaPagoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormaPagoPuntoVenta);
		this.jTableDatosFormaPagoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosFormaPagoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormaPagoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCopiarFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonVerFormFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesFormaPagoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarFormaPagoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFormaPagoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormaPagoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormaPagoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setName("jPanelCamposFingeneralFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Credito"));
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setName("jPanelCamposFincreditoFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocreditoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque"));
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setName("jPanelCamposFinchequeFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciochequeFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarjeta"));
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setName("jPanelCamposFintarjetaFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta=new ReporteDinamicoJInternalFrame(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormaPagoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormaPagoPuntoVenta=new ImportacionJInternalFrame(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormaPagoPuntoVenta();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByFormaPagoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByFormaPagoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByFormaPagoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPagoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoPuntoVenta,false,this);
			
			//this.cargarOrderByFormaPagoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoPuntoVenta,true,this);
			
			//this.cargarOrderByFormaPagoPuntoVenta(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormaPagoPuntoVenta.setMinimumSize(new Dimension(400,50));//3630
		this.jTableDatosFormaPagoPuntoVenta.setMaximumSize(new Dimension(400,50));//3630
		this.jTableDatosFormaPagoPuntoVenta.setPreferredSize(new Dimension(400,50));//3630
		
		this.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormaPagoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarFormaPagoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarFormaPagoPuntoVenta.setText("Copiar");
		this.jButtonVerFormFormaPagoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesFormaPagoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonCerrarFormaPagoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPagoPuntoVenta,"nuevo_button","Nuevo",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormaPagoPuntoVenta,"duplicar_button","Duplicar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormaPagoPuntoVenta,"copiar_button","Copiar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormaPagoPuntoVenta,"ver_form","Ver",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormaPagoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPagoPuntoVenta,"cerrar_button","Salir",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormaPagoPuntoVenta.setToolTipText("Nuevo"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormaPagoPuntoVenta.setToolTipText("Duplicar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormaPagoPuntoVenta.setToolTipText("Copiar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormaPagoPuntoVenta.setToolTipText("Ver"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormaPagoPuntoVenta.setToolTipText("Nuevo Rel"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPagoPuntoVenta.setToolTipText("Salir"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPagoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormaPagoPuntoVenta";
		inputMap = this.jButtonDuplicarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormaPagoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarFormaPagoPuntoVenta";
		inputMap = this.jButtonCopiarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormaPagoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormFormaPagoPuntoVenta";
		inputMap = this.jButtonVerFormFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormaPagoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormaPagoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormaPagoPuntoVenta";
		inputMap = this.jButtonModificarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormaPagoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormaPagoPuntoVenta";
		inputMap = this.jButtonCerrarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPagoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPagoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPagoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormaPagoPuntoVenta.setName("jPanelParametrosReportesFormaPagoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta.setName("jPanelParametrosReportesAccionesFormaPagoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.setToolTipText("Recargar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormaPagoPuntoVenta,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setToolTipText("Procesar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormaPagoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesFormaPagoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFormaPagoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormaPagoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormaPagoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormaPagoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresFormaPagoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresFormaPagoPuntoVenta.setText("<<");
        this.jButtonAnterioresFormaPagoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormaPagoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormaPagoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesFormaPagoPuntoVenta.setText(">>");
        this.jButtonSiguientesFormaPagoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormaPagoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta,"nuevoguardarcambios_button","Nue",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormaPagoPuntoVenta"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionFormaPagoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormaPagoPuntoVenta"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormaPagoPuntoVenta";
		inputMap = this.jButtonSiguientesFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormaPagoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormaPagoPuntoVenta";
		inputMap = this.jButtonAnterioresFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormaPagoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasFormaPagoPuntoVenta();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormaPagoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionFormaPagoPuntoVenta.setLayout(gridaBagLayoutPaginacionFormaPagoPuntoVenta);						
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonAnterioresFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					
						
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonNuevoGuardarCambiosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
						
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonSiguientesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonNuevoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
						
			
			
			if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
				this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonDuplicarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonCopiarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonVerFormFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormaPagoPuntoVenta.add(this.jButtonCerrarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		/*
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormaPagoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPagoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPagoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormaPagoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormaPagoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormaPagoPuntoVenta.setLayout(gridaBagParametrosReportesFormaPagoPuntoVenta);
			this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesFormaPagoPuntoVenta);
			
			/*
			this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1FormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar2FormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3FormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar4FormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4FormaPagoPuntoVenta);
			//this.jPanelParametrosAuxiliar5FormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FormaPagoPuntoVenta);			
			*/
			
			
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jButtonRecargarInformacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta.add(this.jComboBoxTiposPaginacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta.add(this.jComboBoxTiposArchivosReportesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar1FormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormaPagoPuntoVenta.add(this.jComboBoxTiposReportesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);																		
			*/
			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormaPagoPuntoVenta.add(this.jComboBoxTiposGraficosReportesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar4FormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jComboBoxTiposReportesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jCheckBoxGenerarReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar2FormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jLabelAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jButtonAbrirOrderByFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jComboBoxTiposSeleccionarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			*/
			
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta.add(this.jCheckBoxSeleccionarTodosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);															
				
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta.add(this.jCheckBoxSeleccionadosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);															
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta.add(this.jCheckBoxConGraficoReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar3FormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jComboBoxTiposAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
	
				
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoPuntoVenta.add(this.jTextFieldValorCampoGeneralFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciogeneralFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciocreditoFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciocreditoFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciochequeFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciochequeFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciotarjetaFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciotarjetaFormaPagoPuntoVenta);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormaPagoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosFormaPagoPuntoVenta.setLayout(gridaBagLayoutDatosFormaPagoPuntoVenta);
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosFormaPagoPuntoVenta.add(this.jTableDatosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormaPagoPuntoVenta.setViewportView(this.jTableDatosFormaPagoPuntoVenta);
		this.jTableDatosFormaPagoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosFormaPagoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesFormaPagoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonNuevoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdAsientoContableFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableFormaPagoPuntoVenta.add(jLabelid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdAsientoContableFormaPagoPuntoVenta.add(jComboBoxid_asiento_contableFK_IdAsientoContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);


		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableFormaPagoPuntoVenta.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdAsientoContableFormaPagoPuntoVenta.add(jButtonFK_IdAsientoContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdBancoFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdBancoFormaPagoPuntoVenta.add(jLabelid_bancoFK_IdBancoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdBancoFormaPagoPuntoVenta.add(jComboBoxid_bancoFK_IdBancoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdBancoFormaPagoPuntoVenta.add(jButtonFK_IdBancoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("2.-Por Banco ", jPanelFK_IdBancoFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdBancoTarjetaFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta.add(jLabelid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta.add(jComboBoxid_banco_tarjetaFK_IdBancoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta.add(jButtonFK_IdBancoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("3.-Por Banco ", jPanelFK_IdBancoTarjetaFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConexionFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdConexionFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdConexionFormaPagoPuntoVenta.add(jLabelid_conexionFK_IdConexionFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdConexionFormaPagoPuntoVenta.add(jComboBoxid_conexionFK_IdConexionFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdConexionFormaPagoPuntoVenta.add(jButtonFK_IdConexionFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("4.-Por Conexion ", jPanelFK_IdConexionFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdCuentaBancoPunVenFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.add(jLabelid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.add(jComboBoxid_cuenta_banco_pun_venFK_IdCuentaBancoPunVenFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta.add(jButtonFK_IdCuentaBancoPunVenFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("5.-Por Cuenta Banco Pun Ven ", jPanelFK_IdCuentaBancoPunVenFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdCuentaContableFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdCuentaContableFormaPagoPuntoVenta.add(jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdCuentaContableFormaPagoPuntoVenta.add(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);


		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdCuentaContableFormaPagoPuntoVenta.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdCuentaContableFormaPagoPuntoVenta.add(jButtonFK_IdCuentaContableFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("6.-Por Cuenta Contable ", jPanelFK_IdCuentaContableFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdFacturaPuntoVentaFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.add(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.add(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta.add(jButtonFK_IdFacturaPuntoVentaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("7.-Por Factura Punto Venta ", jPanelFK_IdFacturaPuntoVentaFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdTarjetaCreditoFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta.add(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta.add(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta.add(jButtonFK_IdTarjetaCreditoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("8.-Por Tarjeta Credito ", jPanelFK_IdTarjetaCreditoFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoFormaPagoFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta.add(jButtonFK_IdTipoFormaPagoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("9.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoFormaPagoPuntoVenta);
		jTabbedPaneBusquedasFormaPagoPuntoVenta.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoInteresTarjetaFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.add(jLabelid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.add(jComboBoxid_tipo_interes_tarjetaFK_IdTipoInteresTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta.add(jButtonFK_IdTipoInteresTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("10.-Por Tipo Interes Tarjeta ", jPanelFK_IdTipoInteresTarjetaFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoPagoTarjetaFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.add(jLabelid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.add(jComboBoxid_tipo_pago_tarjetaFK_IdTipoPagoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta.add(jButtonFK_IdTipoPagoTarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("11.-Por Tipo Pago Tarjeta ", jPanelFK_IdTipoPagoTarjetaFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoRiesgoChequeFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.add(jLabelid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.add(jComboBoxid_tipo_riesgo_chequeFK_IdTipoRiesgoChequeFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta.add(jButtonFK_IdTipoRiesgoChequeFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);

		jTabbedPaneBusquedasFormaPagoPuntoVenta.addTab("12.-Por Tipo Riesgo Cheque ", jPanelFK_IdTipoRiesgoChequeFormaPagoPuntoVenta);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPagoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsFormaPagoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);								
		*/
		
		/*
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/		
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =0;
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPagoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
				
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPagoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosFormaPagoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosFormaPagoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormaPagoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormaPagoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormaPagoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setName("jPanelReporteDinamicoFormaPagoPuntoVenta"); 
		
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoFormaPagoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPagoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteFormaPagoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelColumnasSelectReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormaPagoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormaPagoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteFormaPagoPuntoVenta);
			
			this.jScrollColumnasSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jListColumnasSelectReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jScrollColumnasSelectReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormaPagoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormaPagoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormaPagoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteFormaPagoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteFormaPagoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPagoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPagoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormaPagoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoFormaPagoPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelConGraficoDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jCheckBoxConGraficoDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelColumnaCategoriaGraficoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelColumnaCategoriaValorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jComboBoxColumnaCategoriaValorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelColumnasValoresGraficoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormaPagoPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormaPagoPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoFormaPagoPuntoVenta);
			
			this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jListColumnasSelectReporteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jScrollColumnasValoresGraficoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPagoPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta.setToolTipText("Generar EXCEL"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormaPagoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormaPagoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormaPagoPuntoVenta.setToolTipText("Generar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jButtonGenerarReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormaPagoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormaPagoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoPuntoVenta.add(this.jButtonCerrarReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta= new JScrollPane(jPanelReporteDinamicoFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormaPagoPuntoVenta);
		this.jInternalFrameReporteDinamicoFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormaPagoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormaPagoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormaPagoPuntoVenta.setName("jPanelImportacionFormaPagoPuntoVenta"); 
		
		this.jPanelImportacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormaPagoPuntoVenta.setLayout(gridaBagLayoutImportacionFormaPagoPuntoVenta);
		
		
		this.jInternalFrameImportacionFormaPagoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormaPagoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormaPagoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPagoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFormaPagoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionFormaPagoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jLabelArchivoImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormaPagoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionFormaPagoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionFormaPagoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormaPagoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormaPagoPuntoVenta.setToolTipText("Generar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jButtonAbrirImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionFormaPagoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jLabelPathArchivoImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormaPagoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jTextFieldPathArchivoImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionFormaPagoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormaPagoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormaPagoPuntoVenta.setToolTipText("Generar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jButtonGenerarImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionFormaPagoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormaPagoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoPuntoVenta.add(this.jButtonCerrarImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionFormaPagoPuntoVenta= new JScrollPane(jPanelImportacionFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormaPagoPuntoVenta);
		this.jInternalFrameImportacionFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormaPagoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormaPagoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByFormaPagoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByFormaPagoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPagoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormaPagoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormaPagoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormaPagoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormaPagoPuntoVenta.setName("jPanelOrderByFormaPagoPuntoVenta"); 
			
			this.jPanelOrderByFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormaPagoPuntoVenta.setLayout(gridaBagLayoutOrderByFormaPagoPuntoVenta);
			
			
			this.jTableDatosFormaPagoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosFormaPagoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormaPagoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormaPagoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormaPagoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormaPagoPuntoVentaOrderBy.setViewportView(this.jTableDatosFormaPagoPuntoVentaOrderBy);
			this.jTableDatosFormaPagoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormaPagoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormaPagoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormaPagoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormaPagoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormaPagoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormaPagoPuntoVenta.ipady =150;
				
			this.jPanelOrderByFormaPagoPuntoVenta.add(jScrollPanelDatosFormaPagoPuntoVentaOrderBy, this.gridBagConstraintsFormaPagoPuntoVenta);//this.jTableDatosFormaPagoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormaPagoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByFormaPagoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormaPagoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormaPagoPuntoVenta.add(this.jButtonCerrarOrderByFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormaPagoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByFormaPagoPuntoVenta= new JScrollPane(jPanelOrderByFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormaPagoPuntoVenta);
			
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByFormaPagoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//7830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formapagopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormaPagoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormaPagoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormaPagoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormaPagoPuntoVenta.getRowHeight();//FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.isSelected()) {
					iHeightTable=FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaFormaPagoPuntoVenta.isSelected()) {
					iHeightTable=FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormaPagoPuntoVenta!=null && this.jInternalFrameOrderByFormaPagoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormaPagoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formapagopuntoventaLogic.getFormaPagoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formapagopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormaPagoPuntoVenta> TraerFormaPagoPuntoVentaBeans(List<FormaPagoPuntoVenta> formapagopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormaPagoPuntoVenta formapagopuntoventa:formapagopuntoventas) {
					
				if(!(FormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formapagopuntoventa.setsDetalleGeneralEntityReporte(FormaPagoPuntoVentaConstantesFunciones.getFormaPagoPuntoVentaDescripcion(formapagopuntoventa));
										
						
					
						
					
				} else  {
							
					//formapagopuntoventa.setsDetalleGeneralEntityReporte(formapagopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//formapagopuntoventabeans.add(formapagopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formapagopuntoventas;
    }
	//PARA REPORTES FIN
}
