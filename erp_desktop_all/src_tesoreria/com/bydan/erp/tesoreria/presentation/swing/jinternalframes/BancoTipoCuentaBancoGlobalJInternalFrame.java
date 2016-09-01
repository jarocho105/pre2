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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.BancoTipoCuentaBancoGlobalConstantesFunciones;

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
public class BancoTipoCuentaBancoGlobalJInternalFrame extends BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBancoTipoCuentaBancoGlobal;
	
	protected JMenuBar jmenuBarBancoTipoCuentaBancoGlobal;
	
	protected JMenu jmenuBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuDatosBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuArchivoBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuAccionesBancoTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBancoTipoCuentaBancoGlobal;	
	protected GridBagConstraints gridBagConstraintsBancoTipoCuentaBancoGlobal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBancoTipoCuentaBancoGlobal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals;		
	public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsEliminados;	
	public List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBancoTipoCuentaBancoGlobal;		
	protected JButton jButtonAbrirOrderByBancoTipoCuentaBancoGlobal;
	
	
	//protected JPanel jPanelOrderByBancoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollPanelOrderByBancoTipoCuentaBancoGlobal;	
	//protected JButton jButtonCerrarOrderByBancoTipoCuentaBancoGlobal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBancoTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal;
    
	
	
	//public JScrollPane jScrollPanelDatosBancoTipoCuentaBancoGlobalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollPanelImportacionBancoTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jPanelAccionesBancoTipoCuentaBancoGlobal;
	
    protected JPanel jPanelPaginacionBancoTipoCuentaBancoGlobal;
    protected JPanel jPanelParametrosReportesBancoTipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar2BancoTipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar4BancoTipoCuentaBancoGlobal;
	//protected JPanel jPanelParametrosAuxiliar5BancoTipoCuentaBancoGlobal;
	
	
	
	//protected JPanel jPanelReporteDinamicoBancoTipoCuentaBancoGlobal;
	//protected JPanel jPanelImportacionBancoTipoCuentaBancoGlobal;
	
	
	public JTable jTableDatosBancoTipoCuentaBancoGlobal;
	
	
	
	//public JTable jTableDatosBancoTipoCuentaBancoGlobalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBancoTipoCuentaBancoGlobal;
	protected JButton jButtonDuplicarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCopiarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonVerFormBancoTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal;
	protected JButton jButtonModificarBancoTipoCuentaBancoGlobal;
	
    protected JButton jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarBancoTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonRecargarInformacionBancoTipoCuentaBancoGlobal;
	protected JButton jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonAnterioresBancoTipoCuentaBancoGlobal;
	protected JButton jButtonSiguientesBancoTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal;
	//protected JButton jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal;
	//protected JButton jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal;	
	
	
	
	//protected JButton jButtonAbrirImportacionBancoTipoCuentaBancoGlobal;
	//protected JButton jButtonGenerarImportacionBancoTipoCuentaBancoGlobal;
	//protected JButton jButtonCerrarImportacionBancoTipoCuentaBancoGlobal;
	//protected JFileChooser jFileChooserImportacionBancoTipoCuentaBancoGlobal;
	//protected File fileImportacionBancoTipoCuentaBancoGlobal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonDuplicarToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal;
	
	
	public JButton jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCopiarToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonVerFormToolBarBancoTipoCuentaBancoGlobal;
	public JButton jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonMostrarOcultarTablaToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarToolBarBancoTipoCuentaBancoGlobal;
	
	protected JButton jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonProcesarInformacionToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonAnterioresToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonSiguientesToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonAbrirOrderByToolBarBancoTipoCuentaBancoGlobal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDuplicarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCopiarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemVerFormBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCerrarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal;
	
	protected JMenuItem jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemProcesarInformacionBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemAnterioresBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemSiguientesBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBancoTipoCuentaBancoGlobal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBancoTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal;
	protected JTextField jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal;
	//public JList<Reporte> jListColumnasSelectReporteBancoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal;
	//public JList<Reporte> jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBancoTipoCuentaBancoGlobal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal;
	//public JLabel jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal;
	
		
	//public JLabel jLabelArchivoImportacionBancoTipoCuentaBancoGlobal;	
	//public JLabel jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal;
	//protected JTextField jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBancoTipoCuentaBancoGlobal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBancoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelColumnaCategoriaValorBancoTipoCuentaBancoGlobal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBancoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelColumnasValoresGraficoBancoTipoCuentaBancoGlobal;
	//public JList<Reporte> jListColumnasValoresGraficoBancoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollColumnasValoresGraficoBancoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBancoTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBancoTipoCuentaBancoGlobal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal;
	public JPanel jPanelFK_IdBancoBancoTipoCuentaBancoGlobal;
	public JButton jButtonFK_IdBancoBancoTipoCuentaBancoGlobal;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal;
	
	public JPanel jPanelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal;
	public JLabel jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal;
	public JButton jButtonid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BancoTipoCuentaBancoGlobalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBancoTipoCuentaBancoGlobal)	{
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal = jButtonRecargarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonProcesarInformacionBancoTipoCuentaBancoGlobal() {
		return this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBancoTipoCuentaBancoGlobal)	{
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal = jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	
	public JButton getjButtonRecargarInformacionBancoTipoCuentaBancoGlobal() {
		return this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	
	public List<BancoTipoCuentaBancoGlobal> getbancotipocuentabancoglobals() {
		return this.bancotipocuentabancoglobals;
	}

	public void setbancotipocuentabancoglobals(List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals) {
		this.bancotipocuentabancoglobals = bancotipocuentabancoglobals;
	}
	
	public List<BancoTipoCuentaBancoGlobal> getbancotipocuentabancoglobalsAux() {
		return this.bancotipocuentabancoglobalsAux;
	}

	public void setbancotipocuentabancoglobalsAux(List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsAux) {
		this.bancotipocuentabancoglobalsAux = bancotipocuentabancoglobalsAux;
	}
	
	public List<BancoTipoCuentaBancoGlobal> getbancotipocuentabancoglobalsEliminados() {
		return this.bancotipocuentabancoglobalsEliminados;
	}

	public void setBancoTipoCuentaBancoGlobalsEliminados(List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobalsEliminados) {
		this.bancotipocuentabancoglobalsEliminados = bancotipocuentabancoglobalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal() {
		return jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal = jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposSeleccionarBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal() {
		return jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal;
	}

	public void setjTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal(
			JTextField jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal) {
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal = jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarValorCampoGeneralBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal() {
		return this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal;
	}

	public void setjCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal(
			JCheckBox jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal) {
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal = jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarSeleccionarTodosBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal() {
		return this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal;
	}

	public void setjCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal(
			JCheckBox jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal) {
		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal = jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarSeleccionadosBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal = jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarTiposArchivosReportesBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposReportesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal = jComboBoxTiposReportesBancoTipoCuentaBancoGlobal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal() {
	//	return jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal(
	//		JComboBox jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal) {
	//	this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal = jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal() {
	//	return jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal = jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal;
	//}
	
	public void setBorderResaltarTiposReportesBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal = jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposGraficosReportesBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal = jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposPaginacionBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal = jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal = jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposRelacionesBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBancoTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal() {
	//	return jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal;
	//}

	//public void setjCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal(
	//		JCheckBox jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal) {
	//	this.jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal = jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBancoTipoCuentaBancoGlobal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBancoTipoCuentaBancoGlobal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
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
		this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		
		this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoTipoCuentaBancoGlobalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco Tipo Cuenta Banco Global MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
		
		BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBancoTipoCuentaBancoGlobal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"nuevo","nuevo","Nuevo"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"duplicar","duplicar","Duplicar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"copiar","copiar","Copiar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"ver_form","ver_form","Ver"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"recargar","recargar","Recargar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarBancoTipoCuentaBancoGlobal,
							"cerrar","cerrar","Salir"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBancoTipoCuentaBancoGlobal;
			
				this.jButtonProcesarInformacionToolBarBancoTipoCuentaBancoGlobal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBancoTipoCuentaBancoGlobal;
				
		//protected JButton jButtonModificarToolBarBancoTipoCuentaBancoGlobal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBancoTipoCuentaBancoGlobal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBancoTipoCuentaBancoGlobal=new JMenuMe("General");
		this.jmenuArchivoBancoTipoCuentaBancoGlobal=new JMenuMe("Archivo");
		this.jmenuAccionesBancoTipoCuentaBancoGlobal=new JMenuMe("Acciones");
		this.jmenuDatosBancoTipoCuentaBancoGlobal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBancoTipoCuentaBancoGlobal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBancoTipoCuentaBancoGlobal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBancoTipoCuentaBancoGlobal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBancoTipoCuentaBancoGlobal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBancoTipoCuentaBancoGlobal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBancoTipoCuentaBancoGlobal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBancoTipoCuentaBancoGlobal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBancoTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBancoTipoCuentaBancoGlobal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBancoTipoCuentaBancoGlobal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBancoTipoCuentaBancoGlobal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBancoTipoCuentaBancoGlobal.add(this.jMenuItemCerrarBancoTipoCuentaBancoGlobal);
			
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemNuevoBancoTipoCuentaBancoGlobal);
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal);
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemNuevoRelacionesBancoTipoCuentaBancoGlobal);
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal);		
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemDuplicarBancoTipoCuentaBancoGlobal);		
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemCopiarBancoTipoCuentaBancoGlobal);		
			this.jmenuAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemVerFormBancoTipoCuentaBancoGlobal);		
			
			this.jmenuDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemRecargarInformacionBancoTipoCuentaBancoGlobal);				
			this.jmenuDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemAnterioresBancoTipoCuentaBancoGlobal);				
			this.jmenuDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemSiguientesBancoTipoCuentaBancoGlobal);				
			this.jmenuDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemAbrirOrderByBancoTipoCuentaBancoGlobal);				
			this.jmenuDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBancoTipoCuentaBancoGlobal.add(this.jmenuArchivoBancoTipoCuentaBancoGlobal);		
			this.jmenuBarBancoTipoCuentaBancoGlobal.add(this.jmenuAccionesBancoTipoCuentaBancoGlobal);		
			this.jmenuBarBancoTipoCuentaBancoGlobal.add(this.jmenuDatosBancoTipoCuentaBancoGlobal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBancoTipoCuentaBancoGlobal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBancoTipoCuentaBancoGlobal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoBancoTipoCuentaBancoGlobal.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal= new JButtonMe();
		this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal.setText("Buscar");
		this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal = new JLabelMe();
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setText("Banco :");
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal,"buscar_button","Buscar Por Tipo Cuenta Banco Global ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setText("Tipo Cuenta Banco Global :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setToolTipText("Tipo Cuenta Banco Global");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal=new JTabbedPane();


		this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBancoTipoCuentaBancoGlobal = new BancoTipoCuentaBancoGlobalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Banco Tipo Cuenta Banco Global DATOS");
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal = new BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(jDesktopPane,this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBancoTipoCuentaBancoGlobal = null;//new BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal= new GridBagLayout();
		
		
		this.jTableDatosBancoTipoCuentaBancoGlobal = new JTableMe();      
		
		String sToolTipBancoTipoCuentaBancoGlobal="";
		sToolTipBancoTipoCuentaBancoGlobal=BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBancoTipoCuentaBancoGlobal+="(Tesoreria.BancoTipoCuentaBancoGlobal)";
		}
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			sToolTipBancoTipoCuentaBancoGlobal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.setToolTipText(sToolTipBancoTipoCuentaBancoGlobal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBancoTipoCuentaBancoGlobal);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setAutoCreateRowSorter(true);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBancoTipoCuentaBancoGlobal.setRowSelectionAllowed(true);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCopiarBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonVerFormBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarBancoTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal = new JScrollPane();   
        this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Banco Tipo Cuenta Banco Global";
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales" + this.sPath));
		} else {
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal=new ReporteDinamicoJInternalFrame(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBancoTipoCuentaBancoGlobal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal=new ImportacionJInternalFrame(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBancoTipoCuentaBancoGlobal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setText("Orden");
		this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,false,this);
			
			//this.cargarOrderByBancoTipoCuentaBancoGlobal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,true,this);
			
			//this.cargarOrderByBancoTipoCuentaBancoGlobal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBancoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal.setText("Duplicar");
		this.jButtonCopiarBancoTipoCuentaBancoGlobal.setText("Copiar");
		this.jButtonVerFormBancoTipoCuentaBancoGlobal.setText("Ver");
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBancoTipoCuentaBancoGlobal,"nuevo_button","Nuevo",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBancoTipoCuentaBancoGlobal,"duplicar_button","Duplicar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBancoTipoCuentaBancoGlobal,"copiar_button","Copiar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBancoTipoCuentaBancoGlobal,"ver_form","Ver",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal,"nuevorelaciones_button","Nuevo Rel",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBancoTipoCuentaBancoGlobal,"cerrar_button","Salir",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.setToolTipText("Nuevo"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal.setToolTipText("Duplicar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBancoTipoCuentaBancoGlobal.setToolTipText("Copiar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBancoTipoCuentaBancoGlobal.setToolTipText("Ver"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.setToolTipText("Nuevo Rel"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.setToolTipText("Salir"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBancoTipoCuentaBancoGlobal"));
		
		//DUPLICAR
		sMapKey = "DuplicarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonDuplicarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBancoTipoCuentaBancoGlobal"));
		
		//COPIAR
		sMapKey = "CopiarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCopiarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBancoTipoCuentaBancoGlobal"));
		
		//VEr FORM
		sMapKey = "VerFormBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonVerFormBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBancoTipoCuentaBancoGlobal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBancoTipoCuentaBancoGlobal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonModificarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBancoTipoCuentaBancoGlobal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBancoTipoCuentaBancoGlobal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBancoTipoCuentaBancoGlobal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setName("jPanelParametrosReportesBancoTipoCuentaBancoGlobal"); 
		
		this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal.setName("jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.setText("Recargar");
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.setToolTipText("Recargar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setText("Procesar");
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setToolTipText("Procesar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setVisible(false);
			
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setText("Paginacion");
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBancoTipoCuentaBancoGlobal = new JLabelMe();
		
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setText("Acciones");		
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setText("Graf.");
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBancoTipoCuentaBancoGlobal = new JButtonMe();
		//this.jButtonAnterioresBancoTipoCuentaBancoGlobal.setText("<<");
        this.jButtonAnterioresBancoTipoCuentaBancoGlobal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBancoTipoCuentaBancoGlobal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBancoTipoCuentaBancoGlobal = new JButtonMe();
		//this.jButtonSiguientesBancoTipoCuentaBancoGlobal.setText(">>");
        this.jButtonSiguientesBancoTipoCuentaBancoGlobal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBancoTipoCuentaBancoGlobal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.setText("Nue");
        this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal,"nuevoguardarcambios_button","Nue",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBancoTipoCuentaBancoGlobal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBancoTipoCuentaBancoGlobal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonSiguientesBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBancoTipoCuentaBancoGlobal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonAnterioresBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBancoTipoCuentaBancoGlobal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBancoTipoCuentaBancoGlobal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(this.getWidth(),BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(this.getWidth(),BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(this.getWidth(),BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoTipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBancoTipoCuentaBancoGlobal = new GridBagLayout();

			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutPaginacionBancoTipoCuentaBancoGlobal);						
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonAnterioresBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					
						
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
			
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonNuevoGuardarCambiosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
						
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonSiguientesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonNuevoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
						
			
			
			if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			}
			
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonDuplicarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonCopiarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonVerFormBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBancoTipoCuentaBancoGlobal.add(this.jButtonCerrarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
		
		
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBancoTipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBancoTipoCuentaBancoGlobal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BancoTipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BancoTipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BancoTipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BancoTipoCuentaBancoGlobal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosReportesBancoTipoCuentaBancoGlobal);
			this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosReportesAccionesBancoTipoCuentaBancoGlobal);
			
			
			this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar1BancoTipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar2BancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar2BancoTipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar3BancoTipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar4BancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar4BancoTipoCuentaBancoGlobal);
			//this.jPanelParametrosAuxiliar5BancoTipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar2BancoTipoCuentaBancoGlobal);			
			
			
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jButtonRecargarInformacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposPaginacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal.add(this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposArchivosReportesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar1BancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar4BancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jCheckBoxGenerarReporteBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar2BancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jLabelAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposSeleccionarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			
			
			/*
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionarTodosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);															
				
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionadosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar3BancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	
				
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal.add(this.jTextFieldValorCampoGeneralBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBancoTipoCuentaBancoGlobal = new GridBagLayout();

			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutDatosBancoTipoCuentaBancoGlobal);
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
			
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.add(this.jTableDatosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setViewportView(this.jTableDatosBancoTipoCuentaBancoGlobal);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setFillsViewportHeight(true);
		this.jTableDatosBancoTipoCuentaBancoGlobal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBancoTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesBancoTipoCuentaBancoGlobal);
		
		
		/*	
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
			
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonNuevoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal= new GridBagLayout();
		gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutFK_IdBancoBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
		jPanelFK_IdBancoBancoTipoCuentaBancoGlobal.add(jLabelid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
		jPanelFK_IdBancoBancoTipoCuentaBancoGlobal.add(jComboBoxid_bancoFK_IdBancoBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =1;
		jPanelFK_IdBancoBancoTipoCuentaBancoGlobal.add(jButtonFK_IdBancoBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.addTab("1.-Por Banco ", jPanelFK_IdBancoBancoTipoCuentaBancoGlobal);
		jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 1;
		gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal.add(jButtonFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);

		jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.addTab("2.-Por Tipo Cuenta Banco Global ", jPanelFK_IdTipoCuentaBancoGlobalBancoTipoCuentaBancoGlobal);
		jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBancoTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBancoTipoCuentaBancoGlobal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();						
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;		
			//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;		
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);								
		
		
		/*
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/		
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
				
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBancoTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBancoTipoCuentaBancoGlobal = new GridBagLayout();
			this.jPanelBusquedasParametrosBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutBusquedasParametrosBancoTipoCuentaBancoGlobal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBancoTipoCuentaBancoGlobal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBancoTipoCuentaBancoGlobal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setName("jPanelReporteDinamicoBancoTipoCuentaBancoGlobal"); 
		
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutReporteDinamicoBancoTipoCuentaBancoGlobal);
		
		
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jLabelColumnasSelectReporteBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal = new JList<Reporte>();
		this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal=new JScrollPane(this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal);
			
			this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jListColumnasSelectReporteBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal = new JList<Reporte>();
		this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal=new JScrollPane(this.jListRelacionesSelectReporteBancoTipoCuentaBancoGlobal);
			
			this.jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		this.jListColumnasValoresGraficoBancoTipoCuentaBancoGlobal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jLabelGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal.setToolTipText("Generar EXCEL"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jButtonGenerarExcelReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jLabelTiposArchivoReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposArchivosReportesDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jButtonGenerarReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoTipoCuentaBancoGlobal.add(this.jButtonCerrarReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBancoTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal= new JScrollPane(jPanelReporteDinamicoBancoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBancoTipoCuentaBancoGlobal);
		this.jInternalFrameReporteDinamicoBancoTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelReporteDinamicoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBancoTipoCuentaBancoGlobal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBancoTipoCuentaBancoGlobal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setName("jPanelImportacionBancoTipoCuentaBancoGlobal"); 
		
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutImportacionBancoTipoCuentaBancoGlobal);
		
		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jLabelArchivoImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBancoTipoCuentaBancoGlobal = new JFileChooser();		
		this.jFileChooserImportacionBancoTipoCuentaBancoGlobal.setToolTipText("ESCOGER ARCHIVO"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jButtonAbrirImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jLabelPathArchivoImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jTextFieldPathArchivoImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jButtonGenerarImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoTipoCuentaBancoGlobal.add(this.jButtonCerrarImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBancoTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal= new JScrollPane(jPanelImportacionBancoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iPosYImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXImportacion;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBancoTipoCuentaBancoGlobal);
		this.jInternalFrameImportacionBancoTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelImportacionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBancoTipoCuentaBancoGlobal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal = new JButtonMe();
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setText("Orden");
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBancoTipoCuentaBancoGlobal";
			inputMap = this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBancoTipoCuentaBancoGlobal"));
		
		
			GridBagLayout gridaBagLayoutOrderByBancoTipoCuentaBancoGlobal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setName("jPanelOrderByBancoTipoCuentaBancoGlobal"); 
			
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutOrderByBancoTipoCuentaBancoGlobal);
			
			
			this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy = new JTableMe();        
			this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBancoTipoCuentaBancoGlobalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobalOrderBy.setViewportView(this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy);
			this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBancoTipoCuentaBancoGlobalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBancoTipoCuentaBancoGlobal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setTitle("Orden");
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setResizable(true);
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setClosable(true);
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXOrderBy;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipady =150;
				
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.add(jScrollPanelDatosBancoTipoCuentaBancoGlobalOrderBy, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);//this.jTableDatosBancoTipoCuentaBancoGlobalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal = new JButtonMe();
			this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBancoTipoCuentaBancoGlobal.add(this.jButtonCerrarOrderByBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBancoTipoCuentaBancoGlobal = new GridBagLayout();
			
			this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal= new JScrollPane(jPanelOrderByBancoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iPosYOrderBy;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXOrderBy;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBancoTipoCuentaBancoGlobal);
			
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelOrderByBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
		
		} else {
			this.jButtonAbrirOrderByBancoTipoCuentaBancoGlobal = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBancoTipoCuentaBancoGlobal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBancoTipoCuentaBancoGlobal.getRowHeight();//BancoTipoCuentaBancoGlobalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.isSelected()) {
					iHeightTable=BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBancoTipoCuentaBancoGlobal.isSelected()) {
					iHeightTable=BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoTipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal!=null && this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy()!=null) {
			//if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBancoTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancotipocuentabancoglobals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BancoTipoCuentaBancoGlobal> TraerBancoTipoCuentaBancoGlobalBeans(List<BancoTipoCuentaBancoGlobal> bancotipocuentabancoglobals,ArrayList<Classe> classes)throws Exception {
		try {
			for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal:bancotipocuentabancoglobals) {
					
				if(!(BancoTipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BancoTipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bancotipocuentabancoglobal.setsDetalleGeneralEntityReporte(BancoTipoCuentaBancoGlobalConstantesFunciones.getBancoTipoCuentaBancoGlobalDescripcion(bancotipocuentabancoglobal));
										
						
					
						
					
				} else  {
							
					//bancotipocuentabancoglobal.setsDetalleGeneralEntityReporte(bancotipocuentabancoglobal.getsDetalleGeneralEntityReporte());
										
				}
				
				//bancotipocuentabancoglobalbeans.add(bancotipocuentabancoglobalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bancotipocuentabancoglobals;
    }
	//PARA REPORTES FIN
}
