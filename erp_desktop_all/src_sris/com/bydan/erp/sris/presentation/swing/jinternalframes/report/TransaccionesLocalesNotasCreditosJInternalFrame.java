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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.TransaccionesLocalesNotasCreditosConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class TransaccionesLocalesNotasCreditosJInternalFrame extends TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionesLocalesNotasCreditos;
	
	protected JMenuBar jmenuBarTransaccionesLocalesNotasCreditos;
	
	protected JMenu jmenuTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuDatosTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuArchivoTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuAccionesTransaccionesLocalesNotasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionesLocalesNotasCreditos;	
	protected GridBagConstraints gridBagConstraintsTransaccionesLocalesNotasCreditos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionesLocalesNotasCreditos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public TransaccionesLocalesNotasCreditosSessionBean transaccioneslocalesnotascreditosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss;		
	public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossEliminados;	
	public List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionesLocalesNotasCreditos;		
	protected JButton jButtonAbrirOrderByTransaccionesLocalesNotasCreditos;
	
	
	//protected JPanel jPanelOrderByTransaccionesLocalesNotasCreditos;
	//public JScrollPane jScrollPanelOrderByTransaccionesLocalesNotasCreditos;	
	//protected JButton jButtonCerrarOrderByTransaccionesLocalesNotasCreditos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionesLocalesNotasCreditosLogic transaccioneslocalesnotascreditosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionesLocalesNotasCreditos;
	public JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos;
	public JScrollPane jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionesLocalesNotasCreditosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos;
	//public JScrollPane jScrollPanelImportacionTransaccionesLocalesNotasCreditos;
	
	
	
	protected JPanel jPanelAccionesTransaccionesLocalesNotasCreditos;
	
    protected JPanel jPanelPaginacionTransaccionesLocalesNotasCreditos;
    protected JPanel jPanelParametrosReportesTransaccionesLocalesNotasCreditos;
	protected JPanel jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos;
	protected JPanel jPanelParametrosAuxiliar2TransaccionesLocalesNotasCreditos;
	protected JPanel jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos;
	protected JPanel jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionesLocalesNotasCreditos;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionesLocalesNotasCreditos;
	//protected JPanel jPanelImportacionTransaccionesLocalesNotasCreditos;
	
	
	public JTable jTableDatosTransaccionesLocalesNotasCreditos;
	
	
	
	//public JTable jTableDatosTransaccionesLocalesNotasCreditosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionesLocalesNotasCreditos;
	protected JButton jButtonDuplicarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCopiarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonVerFormTransaccionesLocalesNotasCreditos;
	protected JButton jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos;
	protected JButton jButtonModificarTransaccionesLocalesNotasCreditos;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCerrarTransaccionesLocalesNotasCreditos;
	
	
	protected JButton jButtonRecargarInformacionTransaccionesLocalesNotasCreditos;
	protected JButton jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	
	
	protected JButton jButtonAnterioresTransaccionesLocalesNotasCreditos;
	protected JButton jButtonSiguientesTransaccionesLocalesNotasCreditos;
	protected JButton jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionesLocalesNotasCreditos;
	//protected JButton jButtonGenerarImportacionTransaccionesLocalesNotasCreditos;
	//protected JButton jButtonCerrarImportacionTransaccionesLocalesNotasCreditos;
	//protected JFileChooser jFileChooserImportacionTransaccionesLocalesNotasCreditos;
	//protected File fileImportacionTransaccionesLocalesNotasCreditos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonDuplicarToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCopiarToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonVerFormToolBarTransaccionesLocalesNotasCreditos;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCerrarToolBarTransaccionesLocalesNotasCreditos;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonAnterioresToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonSiguientesToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonAbrirOrderByToolBarTransaccionesLocalesNotasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDuplicarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemCopiarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemVerFormTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemCerrarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemAnterioresTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemSiguientesTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionesLocalesNotasCreditos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionesLocalesNotasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos;
	protected JTextField jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionesLocalesNotasCreditos;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionesLocalesNotasCreditos;	
	//public JLabel jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos;
	public JPanel jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JButton jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	
	public JPanel jPanelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JLabel jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JLabel jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;

	public JDateChooser jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JButton jButtonfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JLabel jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;

	public JDateChooser jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos;
	public JButton jButtonfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionesLocalesNotasCreditosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionesLocalesNotasCreditos)	{
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos = jButtonRecargarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionesLocalesNotasCreditos() {
		return this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionesLocalesNotasCreditos)	{
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos = jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionesLocalesNotasCreditos() {
		return this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	
	public List<TransaccionesLocalesNotasCreditos> gettransaccioneslocalesnotascreditoss() {
		return this.transaccioneslocalesnotascreditoss;
	}

	public void settransaccioneslocalesnotascreditoss(List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss) {
		this.transaccioneslocalesnotascreditoss = transaccioneslocalesnotascreditoss;
	}
	
	public List<TransaccionesLocalesNotasCreditos> gettransaccioneslocalesnotascreditossAux() {
		return this.transaccioneslocalesnotascreditossAux;
	}

	public void settransaccioneslocalesnotascreditossAux(List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossAux) {
		this.transaccioneslocalesnotascreditossAux = transaccioneslocalesnotascreditossAux;
	}
	
	public List<TransaccionesLocalesNotasCreditos> gettransaccioneslocalesnotascreditossEliminados() {
		return this.transaccioneslocalesnotascreditossEliminados;
	}

	public void setTransaccionesLocalesNotasCreditossEliminados(List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditossEliminados) {
		this.transaccioneslocalesnotascreditossEliminados = transaccioneslocalesnotascreditossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos() {
		return jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos = jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos() {
		return jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos;
	}

	public void setjTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos(
			JTextField jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos) {
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos = jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos() {
		return this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos) {
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos = jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos() {
		return this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos;
	}

	public void setjCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos(
			JCheckBox jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos) {
		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos = jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos = jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposReportesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos = jComboBoxTiposReportesTransaccionesLocalesNotasCreditos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos() {
	//	return jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos = jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos = jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos = jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos = jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos = jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos = jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionesLocalesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos() {
	//	return jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos = jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionesLocalesNotasCreditos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionesLocalesNotasCreditos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos .setBorder(borderResaltar);		
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
		this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
		
		this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesnotascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionesLocalesNotasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transacciones Locales Notas Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionesLocalesNotasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionesLocalesNotasCreditos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"nuevo","nuevo","Nuevo"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"duplicar","duplicar","Duplicar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"copiar","copiar","Copiar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"ver_form","ver_form","Ver"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"recargar","recargar","Buscar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarTransaccionesLocalesNotasCreditos,
							"cerrar","cerrar","Salir"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionesLocalesNotasCreditos;
			
				this.jButtonProcesarInformacionToolBarTransaccionesLocalesNotasCreditos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesNotasCreditos;
				
		//protected JButton jButtonModificarToolBarTransaccionesLocalesNotasCreditos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionesLocalesNotasCreditos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionesLocalesNotasCreditos=new JMenuMe("General");
		this.jmenuArchivoTransaccionesLocalesNotasCreditos=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionesLocalesNotasCreditos=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionesLocalesNotasCreditos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionesLocalesNotasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionesLocalesNotasCreditos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionesLocalesNotasCreditos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionesLocalesNotasCreditos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionesLocalesNotasCreditos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionesLocalesNotasCreditos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionesLocalesNotasCreditos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionesLocalesNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionesLocalesNotasCreditos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionesLocalesNotasCreditos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionesLocalesNotasCreditos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionesLocalesNotasCreditos.add(this.jMenuItemCerrarTransaccionesLocalesNotasCreditos);
			
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemNuevoTransaccionesLocalesNotasCreditos);
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos);
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemNuevoRelacionesTransaccionesLocalesNotasCreditos);
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos);		
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemDuplicarTransaccionesLocalesNotasCreditos);		
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemCopiarTransaccionesLocalesNotasCreditos);		
			this.jmenuAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemVerFormTransaccionesLocalesNotasCreditos);		
			
			this.jmenuDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemRecargarInformacionTransaccionesLocalesNotasCreditos);				
			this.jmenuDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemAnterioresTransaccionesLocalesNotasCreditos);				
			this.jmenuDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemSiguientesTransaccionesLocalesNotasCreditos);				
			this.jmenuDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemAbrirOrderByTransaccionesLocalesNotasCreditos);				
			this.jmenuDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionesLocalesNotasCreditos.add(this.jmenuArchivoTransaccionesLocalesNotasCreditos);		
			this.jmenuBarTransaccionesLocalesNotasCreditos.add(this.jmenuAccionesTransaccionesLocalesNotasCreditos);		
			this.jmenuBarTransaccionesLocalesNotasCreditos.add(this.jmenuDatosTransaccionesLocalesNotasCreditos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionesLocalesNotasCreditos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionesLocalesNotasCreditos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new JButtonMe();
		this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText("Buscar");
		this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,"buscar_button","Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos = new JLabelMe();
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos = new JLabelMe();
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new JDateChooser();
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setDate(new Date());
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos = new JLabelMe();
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new JDateChooser();
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setDate(new Date());
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionesLocalesNotasCreditos = new TransaccionesLocalesNotasCreditosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transacciones Locales Notas Creditos DATOS");
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos = new TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(jDesktopPane,this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones(),this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionesLocalesNotasCreditos = null;//new TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos= new GridBagLayout();
		
		
		this.jTableDatosTransaccionesLocalesNotasCreditos = new JTableMe();      
		
		String sToolTipTransaccionesLocalesNotasCreditos="";
		sToolTipTransaccionesLocalesNotasCreditos=TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionesLocalesNotasCreditos+="(Sris.TransaccionesLocalesNotasCreditos)";
		}
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionesLocalesNotasCreditos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.setToolTipText(sToolTipTransaccionesLocalesNotasCreditos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionesLocalesNotasCreditos);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionesLocalesNotasCreditos.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonCopiarTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonVerFormTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonCerrarTransaccionesLocalesNotasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transacciones Locales Notas Creditos";
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos=new ReporteDinamicoJInternalFrame(TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionesLocalesNotasCreditos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos=new ImportacionJInternalFrame(TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionesLocalesNotasCreditos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setText("Orden");
		this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,false,this);
			
			//this.cargarOrderByTransaccionesLocalesNotasCreditos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,true,this);
			
			//this.cargarOrderByTransaccionesLocalesNotasCreditos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionesLocalesNotasCreditos.setText("Nuevo");
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos.setText("Duplicar");
		this.jButtonCopiarTransaccionesLocalesNotasCreditos.setText("Copiar");
		this.jButtonVerFormTransaccionesLocalesNotasCreditos.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setText("Guardar");
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionesLocalesNotasCreditos,"nuevo_button","Nuevo",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionesLocalesNotasCreditos,"duplicar_button","Duplicar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionesLocalesNotasCreditos,"copiar_button","Copiar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionesLocalesNotasCreditos,"ver_form","Ver",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos,"nuevorelaciones_button","Nuevo Rel",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos,"guardarcambiostabla_button","Guardar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionesLocalesNotasCreditos,"cerrar_button","Salir",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.setToolTipText("Nuevo"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos.setToolTipText("Duplicar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionesLocalesNotasCreditos.setToolTipText("Copiar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionesLocalesNotasCreditos.setToolTipText("Ver"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.setToolTipText("Nuevo Rel"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setToolTipText("Guardar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.setToolTipText("Salir"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionesLocalesNotasCreditos"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonDuplicarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionesLocalesNotasCreditos"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCopiarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionesLocalesNotasCreditos"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonVerFormTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionesLocalesNotasCreditos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionesLocalesNotasCreditos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonModificarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionesLocalesNotasCreditos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCerrarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionesLocalesNotasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionesLocalesNotasCreditos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setName("jPanelParametrosReportesTransaccionesLocalesNotasCreditos"); 
		
		this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos.setName("jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setText("Buscar");
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setToolTipText("Buscar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setVisible(false);
		
		
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setToolTipText("Procesar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionesLocalesNotasCreditos = new JLabelMe();
		
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setText("Acciones");		
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionesLocalesNotasCreditos = new JButtonMe();
		//this.jButtonAnterioresTransaccionesLocalesNotasCreditos.setText("<<");
        this.jButtonAnterioresTransaccionesLocalesNotasCreditos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionesLocalesNotasCreditos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionesLocalesNotasCreditos = new JButtonMe();
		//this.jButtonSiguientesTransaccionesLocalesNotasCreditos.setText(">>");
        this.jButtonSiguientesTransaccionesLocalesNotasCreditos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionesLocalesNotasCreditos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos,"nuevoguardarcambios_button","Nue",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionesLocalesNotasCreditos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionesLocalesNotasCreditos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonSiguientesTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionesLocalesNotasCreditos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonAnterioresTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionesLocalesNotasCreditos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionesLocalesNotasCreditos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(this.getWidth(),TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(this.getWidth(),TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(this.getWidth(),TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesNotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionesLocalesNotasCreditos = new GridBagLayout();

			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutPaginacionTransaccionesLocalesNotasCreditos);						
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonAnterioresTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					
						
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
			
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonNuevoGuardarCambiosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
						
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonSiguientesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonNuevoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
						
			
			
			if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			}
			
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonDuplicarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonCopiarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonVerFormTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionesLocalesNotasCreditos.add(this.jButtonCerrarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionesLocalesNotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionesLocalesNotasCreditos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionesLocalesNotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionesLocalesNotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionesLocalesNotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionesLocalesNotasCreditos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosReportesTransaccionesLocalesNotasCreditos);
			this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosReportesAccionesTransaccionesLocalesNotasCreditos);
			
			
			this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosAuxiliar1TransaccionesLocalesNotasCreditos);
			this.jPanelParametrosAuxiliar2TransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosAuxiliar2TransaccionesLocalesNotasCreditos);
			this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosAuxiliar3TransaccionesLocalesNotasCreditos);
			this.jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosAuxiliar4TransaccionesLocalesNotasCreditos);
			//this.jPanelParametrosAuxiliar5TransaccionesLocalesNotasCreditos.setLayout(gridaBagParametrosAuxiliar2TransaccionesLocalesNotasCreditos);			
			
			
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jButtonRecargarInformacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposPaginacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos.add(this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposArchivosReportesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jPanelParametrosAuxiliar1TransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);																		
			
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposGraficosReportesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jPanelParametrosAuxiliar4TransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposReportesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jCheckBoxGenerarReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jPanelParametrosAuxiliar2TransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jLabelAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposSeleccionarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
			
			
			/*
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos.add(this.jCheckBoxSeleccionarTodosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);															
				
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos.add(this.jCheckBoxSeleccionadosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);															
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos.add(this.jCheckBoxConGraficoReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jPanelParametrosAuxiliar3TransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionesLocalesNotasCreditos = new GridBagLayout();

			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutDatosTransaccionesLocalesNotasCreditos);
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
			
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.add(this.jTableDatosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setViewportView(this.jTableDatosTransaccionesLocalesNotasCreditos);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setFillsViewportHeight(true);
		this.jTableDatosTransaccionesLocalesNotasCreditos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionesLocalesNotasCreditos= new GridBagLayout();
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutAccionesTransaccionesLocalesNotasCreditos);
		
		
		/*	
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
			
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonNuevoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos= new GridBagLayout();
		gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);

		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jLabelid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);

		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jComboBoxid_ejercicioBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);


		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jLabelfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);

		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 1;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jDateChooserfecha_desdeBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);


		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 2;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jLabelfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);

		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 2;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jDateChooserfecha_hastaBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);

		gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 3;
		gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =1;
		jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos.add(jButtonBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);

		jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.addTab("1.-Por Ejercicio Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaTransaccionesLocalesNotasCreditosTransaccionesLocalesNotasCreditos);
		jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionesLocalesNotasCreditos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;		
			//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;		
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);								
		
		
		/*
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/		
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
				
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionesLocalesNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionesLocalesNotasCreditos = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutBusquedasParametrosTransaccionesLocalesNotasCreditos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionesLocalesNotasCreditos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionesLocalesNotasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setName("jPanelReporteDinamicoTransaccionesLocalesNotasCreditos"); 
		
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutReporteDinamicoTransaccionesLocalesNotasCreditos);
		
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelColumnasSelectReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos=new JScrollPane(this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos);
			
			this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos=new JScrollPane(this.jListRelacionesSelectReporteTransaccionesLocalesNotasCreditos);
			
			this.jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelConGraficoDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jCheckBoxConGraficoDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelColumnaCategoriaValorTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jComboBoxColumnaCategoriaValorTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelColumnasValoresGraficoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos=new JScrollPane(this.jListColumnasValoresGraficoTransaccionesLocalesNotasCreditos);
			
			this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jListColumnasSelectReporteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jScrollColumnasValoresGraficoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesNotasCreditos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Generar EXCEL"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposReportesDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Generar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jButtonGenerarReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos.setToolTipText("Cancelar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesNotasCreditos.add(this.jButtonCerrarReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionesLocalesNotasCreditos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos= new JScrollPane(jPanelReporteDinamicoTransaccionesLocalesNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionesLocalesNotasCreditos);
		this.jInternalFrameReporteDinamicoTransaccionesLocalesNotasCreditos.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionesLocalesNotasCreditos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionesLocalesNotasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setName("jPanelImportacionTransaccionesLocalesNotasCreditos"); 
		
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutImportacionTransaccionesLocalesNotasCreditos);
		
		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setResizable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setClosable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setResizable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setClosable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jLabelArchivoImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionesLocalesNotasCreditos = new JFileChooser();		
		this.jFileChooserImportacionTransaccionesLocalesNotasCreditos.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos.setToolTipText("Generar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jButtonAbrirImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jLabelPathArchivoImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jTextFieldPathArchivoImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos.setToolTipText("Generar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jButtonGenerarImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos.setToolTipText("Cancelar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesNotasCreditos.add(this.jButtonCerrarImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionesLocalesNotasCreditos = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos= new JScrollPane(jPanelImportacionTransaccionesLocalesNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionesLocalesNotasCreditos);
		this.jInternalFrameImportacionTransaccionesLocalesNotasCreditos.getContentPane().add(this.jScrollPanelImportacionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionesLocalesNotasCreditos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setText("Orden");
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionesLocalesNotasCreditos";
			inputMap = this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionesLocalesNotasCreditos"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionesLocalesNotasCreditos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setName("jPanelOrderByTransaccionesLocalesNotasCreditos"); 
			
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutOrderByTransaccionesLocalesNotasCreditos);
			
			
			this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy = new JTableMe();        
			this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionesLocalesNotasCreditosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditosOrderBy.setViewportView(this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy);
			this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionesLocalesNotasCreditosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionesLocalesNotasCreditos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setResizable(true);
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setClosable(true);
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipady =150;
				
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.add(jScrollPanelDatosTransaccionesLocalesNotasCreditosOrderBy, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);//this.jTableDatosTransaccionesLocalesNotasCreditosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos.setToolTipText("Cancelar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionesLocalesNotasCreditos.add(this.jButtonCerrarOrderByTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionesLocalesNotasCreditos = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos= new JScrollPane(jPanelOrderByTransaccionesLocalesNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionesLocalesNotasCreditos);
			
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getContentPane().add(this.jScrollPanelOrderByTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionesLocalesNotasCreditos = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionesLocalesNotasCreditos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosTransaccionesLocalesNotasCreditos.getRowHeight();//TransaccionesLocalesNotasCreditosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.isSelected()) {
					iHeightTable=TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesNotasCreditos.isSelected()) {
					iHeightTable=TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionesLocalesNotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos!=null && this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionesLocalesNotasCreditos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=transaccioneslocalesnotascreditosLogic.getTransaccionesLocalesNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesnotascreditoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionesLocalesNotasCreditos> TraerTransaccionesLocalesNotasCreditosBeans(List<TransaccionesLocalesNotasCreditos> transaccioneslocalesnotascreditoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionesLocalesNotasCreditos transaccioneslocalesnotascreditos:transaccioneslocalesnotascreditoss) {
					
				if(!(TransaccionesLocalesNotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionesLocalesNotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccioneslocalesnotascreditos.setsDetalleGeneralEntityReporte(TransaccionesLocalesNotasCreditosConstantesFunciones.getTransaccionesLocalesNotasCreditosDescripcion(transaccioneslocalesnotascreditos));
										
						
					
						
					
				} else  {
							
					//transaccioneslocalesnotascreditos.setsDetalleGeneralEntityReporte(transaccioneslocalesnotascreditos.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccioneslocalesnotascreditosbeans.add(transaccioneslocalesnotascreditosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccioneslocalesnotascreditoss;
    }
	//PARA REPORTES FIN
}
