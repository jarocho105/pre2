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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.SaldosDiariosBancosConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class SaldosDiariosBancosJInternalFrame extends SaldosDiariosBancosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSaldosDiariosBancos;
	
	protected JMenuBar jmenuBarSaldosDiariosBancos;
	
	protected JMenu jmenuSaldosDiariosBancos;
	protected JMenu jmenuDatosSaldosDiariosBancos;
	protected JMenu jmenuArchivoSaldosDiariosBancos;
	protected JMenu jmenuAccionesSaldosDiariosBancos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosDiariosBancos;	
	protected GridBagConstraints gridBagConstraintsSaldosDiariosBancos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SaldosDiariosBancosDetalleFormJInternalFrame jInternalFrameDetalleFormSaldosDiariosBancos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSaldosDiariosBancos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSaldosDiariosBancos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public SaldosDiariosBancosSessionBean saldosdiariosbancosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SaldosDiariosBancos> saldosdiariosbancoss;		
	public List<SaldosDiariosBancos> saldosdiariosbancossEliminados;	
	public List<SaldosDiariosBancos> saldosdiariosbancossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySaldosDiariosBancos;		
	protected JButton jButtonAbrirOrderBySaldosDiariosBancos;
	
	
	//protected JPanel jPanelOrderBySaldosDiariosBancos;
	//public JScrollPane jScrollPanelOrderBySaldosDiariosBancos;	
	//protected JButton jButtonCerrarOrderBySaldosDiariosBancos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SaldosDiariosBancosLogic saldosdiariosbancosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSaldosDiariosBancos;
	public JScrollPane jScrollPanelDatosEdicionSaldosDiariosBancos;
	public JScrollPane jScrollPanelDatosGeneralSaldosDiariosBancos;
    
	
	
	//public JScrollPane jScrollPanelDatosSaldosDiariosBancosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSaldosDiariosBancos;
	//public JScrollPane jScrollPanelImportacionSaldosDiariosBancos;
	
	
	
	protected JPanel jPanelAccionesSaldosDiariosBancos;
	
    protected JPanel jPanelPaginacionSaldosDiariosBancos;
    protected JPanel jPanelParametrosReportesSaldosDiariosBancos;
	protected JPanel jPanelParametrosReportesAccionesSaldosDiariosBancos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SaldosDiariosBancos;
	protected JPanel jPanelParametrosAuxiliar2SaldosDiariosBancos;
	protected JPanel jPanelParametrosAuxiliar3SaldosDiariosBancos;
	protected JPanel jPanelParametrosAuxiliar4SaldosDiariosBancos;
	//protected JPanel jPanelParametrosAuxiliar5SaldosDiariosBancos;
	
	
	
	//protected JPanel jPanelReporteDinamicoSaldosDiariosBancos;
	//protected JPanel jPanelImportacionSaldosDiariosBancos;
	
	
	public JTable jTableDatosSaldosDiariosBancos;
	
	
	
	//public JTable jTableDatosSaldosDiariosBancosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSaldosDiariosBancos;
	protected JButton jButtonDuplicarSaldosDiariosBancos;
	protected JButton jButtonCopiarSaldosDiariosBancos;
	protected JButton jButtonVerFormSaldosDiariosBancos;
	protected JButton jButtonNuevoRelacionesSaldosDiariosBancos;
	protected JButton jButtonModificarSaldosDiariosBancos;
	
    protected JButton jButtonGuardarCambiosTablaSaldosDiariosBancos;
	protected JButton jButtonCerrarSaldosDiariosBancos;
	
	
	protected JButton jButtonRecargarInformacionSaldosDiariosBancos;
	protected JButton jButtonProcesarInformacionSaldosDiariosBancos;
	
	
	protected JButton jButtonAnterioresSaldosDiariosBancos;
	protected JButton jButtonSiguientesSaldosDiariosBancos;
	protected JButton jButtonNuevoGuardarCambiosSaldosDiariosBancos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSaldosDiariosBancos;
	//protected JButton jButtonCerrarReporteDinamicoSaldosDiariosBancos;
	//protected JButton jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos;	
	
	
	
	//protected JButton jButtonAbrirImportacionSaldosDiariosBancos;
	//protected JButton jButtonGenerarImportacionSaldosDiariosBancos;
	//protected JButton jButtonCerrarImportacionSaldosDiariosBancos;
	//protected JFileChooser jFileChooserImportacionSaldosDiariosBancos;
	//protected File fileImportacionSaldosDiariosBancos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosDiariosBancos;
	protected JButton jButtonDuplicarToolBarSaldosDiariosBancos;
	protected JButton jButtonNuevoRelacionesToolBarSaldosDiariosBancos;
	
	
	public JButton jButtonGuardarCambiosToolBarSaldosDiariosBancos;
	protected JButton jButtonCopiarToolBarSaldosDiariosBancos;
	protected JButton jButtonVerFormToolBarSaldosDiariosBancos;
	public JButton jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosDiariosBancos;
	protected JButton jButtonCerrarToolBarSaldosDiariosBancos;
	
	protected JButton jButtonRecargarInformacionToolBarSaldosDiariosBancos;
	protected JButton jButtonProcesarInformacionToolBarSaldosDiariosBancos;
	protected JButton jButtonAnterioresToolBarSaldosDiariosBancos;
	protected JButton jButtonSiguientesToolBarSaldosDiariosBancos;
	protected JButton jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos;
	protected JButton jButtonAbrirOrderByToolBarSaldosDiariosBancos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosDiariosBancos;
	protected JMenuItem jMenuItemDuplicarSaldosDiariosBancos;
	protected JMenuItem jMenuItemNuevoRelacionesSaldosDiariosBancos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSaldosDiariosBancos;
	protected JMenuItem jMenuItemCopiarSaldosDiariosBancos;
	protected JMenuItem jMenuItemVerFormSaldosDiariosBancos;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosDiariosBancos;
	protected JMenuItem jMenuItemCerrarSaldosDiariosBancos;
	protected JMenuItem jMenuItemDetalleCerrarSaldosDiariosBancos;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySaldosDiariosBancos;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosDiariosBancos;
	
	protected JMenuItem jMenuItemRecargarInformacionSaldosDiariosBancos;
	protected JMenuItem jMenuItemProcesarInformacionSaldosDiariosBancos;
	protected JMenuItem jMenuItemAnterioresSaldosDiariosBancos;
	protected JMenuItem jMenuItemSiguientesSaldosDiariosBancos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosDiariosBancos;
	protected JMenuItem jMenuItemAbrirOrderBySaldosDiariosBancos;
	protected JMenuItem jMenuItemMostrarOcultarSaldosDiariosBancos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosDiariosBancos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSaldosDiariosBancos;
	protected JCheckBox jCheckBoxSeleccionadosSaldosDiariosBancos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSaldosDiariosBancos;
	protected JCheckBox jCheckBoxConGraficoReporteSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSaldosDiariosBancos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSaldosDiariosBancos;
	protected JTextField jTextFieldValorCampoGeneralSaldosDiariosBancos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSaldosDiariosBancos;
	//public JList<Reporte> jListColumnasSelectReporteSaldosDiariosBancos;
	//public JScrollPane jScrollColumnasSelectReporteSaldosDiariosBancos;
	
	//public JLabel jLabelRelacionesSelectReporteSaldosDiariosBancos;
	//public JList<Reporte> jListRelacionesSelectReporteSaldosDiariosBancos;
	//public JScrollPane jScrollRelacionesSelectReporteSaldosDiariosBancos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSaldosDiariosBancos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSaldosDiariosBancos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos;
	//public JLabel jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos;
	
		
	//public JLabel jLabelArchivoImportacionSaldosDiariosBancos;	
	//public JLabel jLabelPathArchivoImportacionSaldosDiariosBancos;
	//protected JTextField jTextFieldPathArchivoImportacionSaldosDiariosBancos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSaldosDiariosBancos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos;
	
	//public JLabel jLabelColumnaCategoriaValorSaldosDiariosBancos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSaldosDiariosBancos;
	
	//public JLabel jLabelColumnasValoresGraficoSaldosDiariosBancos;
	//public JList<Reporte> jListColumnasValoresGraficoSaldosDiariosBancos;
	//public JScrollPane jScrollColumnasValoresGraficoSaldosDiariosBancos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSaldosDiariosBancos;
	public JPanel jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JButton jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	
	public JPanel jPanelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JLabel jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JButton jButtonid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JLabel jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos;

	public JDateChooser jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JButton jButtonfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JLabel jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos;

	public JDateChooser jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos;
	public JButton jButtonfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public SaldosDiariosBancosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSaldosDiariosBancos)	{
		this.jButtonRecargarInformacionSaldosDiariosBancos = jButtonRecargarInformacionSaldosDiariosBancos;
	}
	
	public JButton getjButtonProcesarInformacionSaldosDiariosBancos() {
		return this.jButtonProcesarInformacionSaldosDiariosBancos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosDiariosBancos)	{
		this.jButtonProcesarInformacionSaldosDiariosBancos = jButtonProcesarInformacionSaldosDiariosBancos;
	}
	
	
	public JButton getjButtonRecargarInformacionSaldosDiariosBancos() {
		return this.jButtonRecargarInformacionSaldosDiariosBancos;
	}
	
	
	public List<SaldosDiariosBancos> getsaldosdiariosbancoss() {
		return this.saldosdiariosbancoss;
	}

	public void setsaldosdiariosbancoss(List<SaldosDiariosBancos> saldosdiariosbancoss) {
		this.saldosdiariosbancoss = saldosdiariosbancoss;
	}
	
	public List<SaldosDiariosBancos> getsaldosdiariosbancossAux() {
		return this.saldosdiariosbancossAux;
	}

	public void setsaldosdiariosbancossAux(List<SaldosDiariosBancos> saldosdiariosbancossAux) {
		this.saldosdiariosbancossAux = saldosdiariosbancossAux;
	}
	
	public List<SaldosDiariosBancos> getsaldosdiariosbancossEliminados() {
		return this.saldosdiariosbancossEliminados;
	}

	public void setSaldosDiariosBancossEliminados(List<SaldosDiariosBancos> saldosdiariosbancossEliminados) {
		this.saldosdiariosbancossEliminados = saldosdiariosbancossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSaldosDiariosBancos() {
		return jComboBoxTiposSeleccionarSaldosDiariosBancos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSaldosDiariosBancos(
			JComboBox jComboBoxTiposSeleccionarSaldosDiariosBancos) {
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos = jComboBoxTiposSeleccionarSaldosDiariosBancos;
	}
	
	public void setBorderResaltarTiposSeleccionarSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSaldosDiariosBancos() {
		return jTextFieldValorCampoGeneralSaldosDiariosBancos;
	}

	public void setjTextFieldValorCampoGeneralSaldosDiariosBancos(
			JTextField jTextFieldValorCampoGeneralSaldosDiariosBancos) {
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos = jTextFieldValorCampoGeneralSaldosDiariosBancos;
	}

	public void setBorderResaltarValorCampoGeneralSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSaldosDiariosBancos() {
		return this.jCheckBoxSeleccionarTodosSaldosDiariosBancos;
	}

	public void setjCheckBoxSeleccionarTodosSaldosDiariosBancos(
			JCheckBox jCheckBoxSeleccionarTodosSaldosDiariosBancos) {
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos = jCheckBoxSeleccionarTodosSaldosDiariosBancos;
	}

	public void setBorderResaltarSeleccionarTodosSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSaldosDiariosBancos() {
		return this.jCheckBoxSeleccionadosSaldosDiariosBancos;
	}

	public void setjCheckBoxSeleccionadosSaldosDiariosBancos(
			JCheckBox jCheckBoxSeleccionadosSaldosDiariosBancos) {
		this.jCheckBoxSeleccionadosSaldosDiariosBancos = jCheckBoxSeleccionadosSaldosDiariosBancos;
	}
	
	public void setBorderResaltarSeleccionadosSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSaldosDiariosBancos() {
		return this.jComboBoxTiposArchivosReportesSaldosDiariosBancos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSaldosDiariosBancos(
			JComboBox jComboBoxTiposArchivosReportesSaldosDiariosBancos) {
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos = jComboBoxTiposArchivosReportesSaldosDiariosBancos;
	}

	public void setBorderResaltarTiposArchivosReportesSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSaldosDiariosBancos() {
		return this.jComboBoxTiposReportesSaldosDiariosBancos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSaldosDiariosBancos(
			JComboBox jComboBoxTiposReportesSaldosDiariosBancos) {
		this.jComboBoxTiposReportesSaldosDiariosBancos = jComboBoxTiposReportesSaldosDiariosBancos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSaldosDiariosBancos() {
	//	return jComboBoxTiposReportesDinamicoSaldosDiariosBancos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSaldosDiariosBancos(
	//		JComboBox jComboBoxTiposReportesDinamicoSaldosDiariosBancos) {
	//	this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos = jComboBoxTiposReportesDinamicoSaldosDiariosBancos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos() {
	//	return jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos = jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos;
	//}
	
	public void setBorderResaltarTiposReportesSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSaldosDiariosBancos() {
		return this.jComboBoxTiposGraficosReportesSaldosDiariosBancos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSaldosDiariosBancos(
			JComboBox jComboBoxTiposGraficosReportesSaldosDiariosBancos) {
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos = jComboBoxTiposGraficosReportesSaldosDiariosBancos;
	}
	
	public void setBorderResaltarTiposGraficosReportesSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSaldosDiariosBancos() {
		return this.jComboBoxTiposPaginacionSaldosDiariosBancos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSaldosDiariosBancos(
			JComboBox jComboBoxTiposPaginacionSaldosDiariosBancos) {
		this.jComboBoxTiposPaginacionSaldosDiariosBancos = jComboBoxTiposPaginacionSaldosDiariosBancos;
	}
	
	public void setBorderResaltarTiposPaginacionSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSaldosDiariosBancos() {
		return this.jComboBoxTiposRelacionesSaldosDiariosBancos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosDiariosBancos() {
		return this.jComboBoxTiposAccionesSaldosDiariosBancos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosDiariosBancos(
			JComboBox jComboBoxTiposRelacionesSaldosDiariosBancos) {
		this.jComboBoxTiposRelacionesSaldosDiariosBancos = jComboBoxTiposRelacionesSaldosDiariosBancos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosDiariosBancos(
			JComboBox jComboBoxTiposAccionesSaldosDiariosBancos) {
		this.jComboBoxTiposAccionesSaldosDiariosBancos = jComboBoxTiposAccionesSaldosDiariosBancos;
	}
	
	public void setBorderResaltarTiposRelacionesSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSaldosDiariosBancos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSaldosDiariosBancos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSaldosDiariosBancos() {
	//	return jCheckBoxConGraficoDinamicoSaldosDiariosBancos;
	//}

	//public void setjCheckBoxConGraficoDinamicoSaldosDiariosBancos(
	//		JCheckBox jCheckBoxConGraficoDinamicoSaldosDiariosBancos) {
	//	this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos = jCheckBoxConGraficoDinamicoSaldosDiariosBancos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSaldosDiariosBancos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSaldosDiariosBancos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos .setBorder(borderResaltar);		
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
		this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
		
		this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosdiariosbancosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosDiariosBancosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Diarios Bancos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
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
		
		SaldosDiariosBancosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSaldosDiariosBancos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"nuevo","nuevo","Nuevo"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"duplicar","duplicar","Duplicar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"copiar","copiar","Copiar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"ver_form","ver_form","Ver"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"recargar","recargar","Buscar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,
							"cerrar","cerrar","Salir"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSaldosDiariosBancos;
			
				this.jButtonProcesarInformacionToolBarSaldosDiariosBancos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSaldosDiariosBancos;
				
		//protected JButton jButtonModificarToolBarSaldosDiariosBancos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSaldosDiariosBancos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSaldosDiariosBancos=new JMenuMe("General");
		this.jmenuArchivoSaldosDiariosBancos=new JMenuMe("Archivo");
		this.jmenuAccionesSaldosDiariosBancos=new JMenuMe("Acciones");
		this.jmenuDatosSaldosDiariosBancos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosDiariosBancos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosDiariosBancos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosDiariosBancos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSaldosDiariosBancos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSaldosDiariosBancos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSaldosDiariosBancos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSaldosDiariosBancos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSaldosDiariosBancos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSaldosDiariosBancos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSaldosDiariosBancos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosDiariosBancos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosDiariosBancos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSaldosDiariosBancos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSaldosDiariosBancos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSaldosDiariosBancos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSaldosDiariosBancos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSaldosDiariosBancos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSaldosDiariosBancos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosDiariosBancos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosDiariosBancos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosDiariosBancos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSaldosDiariosBancos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSaldosDiariosBancos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSaldosDiariosBancos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSaldosDiariosBancos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSaldosDiariosBancos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSaldosDiariosBancos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSaldosDiariosBancos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSaldosDiariosBancos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSaldosDiariosBancos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSaldosDiariosBancos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSaldosDiariosBancos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSaldosDiariosBancos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySaldosDiariosBancos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySaldosDiariosBancos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySaldosDiariosBancos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosDiariosBancos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosDiariosBancos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosDiariosBancos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSaldosDiariosBancos.add(this.jMenuItemCerrarSaldosDiariosBancos);
			
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemNuevoSaldosDiariosBancos);
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos);
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemNuevoRelacionesSaldosDiariosBancos);
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos);		
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemDuplicarSaldosDiariosBancos);		
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemCopiarSaldosDiariosBancos);		
			this.jmenuAccionesSaldosDiariosBancos.add(this.jMenuItemVerFormSaldosDiariosBancos);		
			
			this.jmenuDatosSaldosDiariosBancos.add(this.jMenuItemRecargarInformacionSaldosDiariosBancos);				
			this.jmenuDatosSaldosDiariosBancos.add(this.jMenuItemAnterioresSaldosDiariosBancos);				
			this.jmenuDatosSaldosDiariosBancos.add(this.jMenuItemSiguientesSaldosDiariosBancos);				
			this.jmenuDatosSaldosDiariosBancos.add(this.jMenuItemAbrirOrderBySaldosDiariosBancos);				
			this.jmenuDatosSaldosDiariosBancos.add(this.jMenuItemMostrarOcultarSaldosDiariosBancos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSaldosDiariosBancos.add(this.jMenuItemGuardarCambiosSaldosDiariosBancos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSaldosDiariosBancos.add(this.jmenuArchivoSaldosDiariosBancos);		
			this.jmenuBarSaldosDiariosBancos.add(this.jmenuAccionesSaldosDiariosBancos);		
			this.jmenuBarSaldosDiariosBancos.add(this.jmenuDatosSaldosDiariosBancos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSaldosDiariosBancos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSaldosDiariosBancos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos= new JButtonMe();
		this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText("Buscar");
		this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos,"buscar_button","Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos = new JLabelMe();
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos = new JLabelMe();
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos= new JDateChooser();
		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setDate(new Date());
		jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos = new JLabelMe();
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos= new JDateChooser();
		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setDate(new Date());
		jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasSaldosDiariosBancos=new JTabbedPane();


		this.jTabbedPaneBusquedasSaldosDiariosBancos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSaldosDiariosBancos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSaldosDiariosBancos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSaldosDiariosBancos = new SaldosDiariosBancosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Saldos Diarios Bancos DATOS");
			this.jInternalFrameDetalleFormSaldosDiariosBancos = new SaldosDiariosBancosDetalleFormJInternalFrame(jDesktopPane,this.saldosdiariosbancosSessionBean.getConGuardarRelaciones(),this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSaldosDiariosBancos = null;//new SaldosDiariosBancosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosDiariosBancos= new GridBagLayout();
		
		
		this.jTableDatosSaldosDiariosBancos = new JTableMe();      
		
		String sToolTipSaldosDiariosBancos="";
		sToolTipSaldosDiariosBancos=SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosDiariosBancos+="(Tesoreria.SaldosDiariosBancos)";
		}
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosDiariosBancos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSaldosDiariosBancos.setToolTipText(sToolTipSaldosDiariosBancos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSaldosDiariosBancos);
		this.jTableDatosSaldosDiariosBancos.setAutoCreateRowSorter(true);
		this.jTableDatosSaldosDiariosBancos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSaldosDiariosBancos.setRowSelectionAllowed(true);
		this.jTableDatosSaldosDiariosBancos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSaldosDiariosBancos = new JButtonMe();
		this.jButtonDuplicarSaldosDiariosBancos = new JButtonMe();
		this.jButtonCopiarSaldosDiariosBancos = new JButtonMe();
		this.jButtonVerFormSaldosDiariosBancos = new JButtonMe();
		this.jButtonNuevoRelacionesSaldosDiariosBancos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos = new JButtonMe();
		this.jButtonCerrarSaldosDiariosBancos = new JButtonMe();
		
		this.jScrollPanelDatosSaldosDiariosBancos = new JScrollPane();   
        this.jScrollPanelDatosGeneralSaldosDiariosBancos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Diarios Bancos";
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosDiariosBancos.setToolTipText("Acciones");
        this.jPanelAccionesSaldosDiariosBancos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSaldosDiariosBancos=new ReporteDinamicoJInternalFrame(SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSaldosDiariosBancos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSaldosDiariosBancos=new ImportacionJInternalFrame(SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSaldosDiariosBancos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySaldosDiariosBancos = new JButtonMe();
		
		this.jButtonAbrirOrderBySaldosDiariosBancos.setText("Orden");
		this.jButtonAbrirOrderBySaldosDiariosBancos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosDiariosBancos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosDiariosBancos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosDiariosBancos,false,this);
			
			//this.cargarOrderBySaldosDiariosBancos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosDiariosBancos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosDiariosBancos,true,this);
			
			//this.cargarOrderBySaldosDiariosBancos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSaldosDiariosBancos.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosSaldosDiariosBancos.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosSaldosDiariosBancos.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosSaldosDiariosBancos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosDiariosBancos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosDiariosBancos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSaldosDiariosBancos.setText("Nuevo");
		this.jButtonDuplicarSaldosDiariosBancos.setText("Duplicar");
		this.jButtonCopiarSaldosDiariosBancos.setText("Copiar");
		this.jButtonVerFormSaldosDiariosBancos.setText("Ver");
		this.jButtonNuevoRelacionesSaldosDiariosBancos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setText("Guardar");
		this.jButtonCerrarSaldosDiariosBancos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosDiariosBancos,"nuevo_button","Nuevo",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSaldosDiariosBancos,"duplicar_button","Duplicar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSaldosDiariosBancos,"copiar_button","Copiar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSaldosDiariosBancos,"ver_form","Ver",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSaldosDiariosBancos,"nuevorelaciones_button","Nuevo Rel",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosDiariosBancos,"guardarcambiostabla_button","Guardar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosDiariosBancos,"cerrar_button","Salir",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSaldosDiariosBancos.setToolTipText("Nuevo"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSaldosDiariosBancos.setToolTipText("Duplicar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSaldosDiariosBancos.setToolTipText("Copiar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSaldosDiariosBancos.setToolTipText("Ver"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSaldosDiariosBancos.setToolTipText("Nuevo Rel"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setToolTipText("Guardar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosDiariosBancos.setToolTipText("Salir"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosDiariosBancos";
		inputMap = this.jButtonNuevoSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosDiariosBancos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosDiariosBancos"));
		
		//DUPLICAR
		sMapKey = "DuplicarSaldosDiariosBancos";
		inputMap = this.jButtonDuplicarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSaldosDiariosBancos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSaldosDiariosBancos"));
		
		//COPIAR
		sMapKey = "CopiarSaldosDiariosBancos";
		inputMap = this.jButtonCopiarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSaldosDiariosBancos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSaldosDiariosBancos"));
		
		//VEr FORM
		sMapKey = "VerFormSaldosDiariosBancos";
		inputMap = this.jButtonVerFormSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSaldosDiariosBancos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSaldosDiariosBancos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSaldosDiariosBancos";
		inputMap = this.jButtonNuevoRelacionesSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSaldosDiariosBancos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSaldosDiariosBancos";
		inputMap = this.jButtonModificarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSaldosDiariosBancos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSaldosDiariosBancos";
		inputMap = this.jButtonCerrarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosDiariosBancos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosDiariosBancos";
		inputMap = this.jButtonGuardarCambiosTablaSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosDiariosBancos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSaldosDiariosBancos.setName("jPanelParametrosReportesSaldosDiariosBancos"); 
		
		this.jPanelParametrosReportesAccionesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSaldosDiariosBancos.setName("jPanelParametrosReportesAccionesSaldosDiariosBancos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSaldosDiariosBancos = new JButtonMe();
		this.jButtonRecargarInformacionSaldosDiariosBancos.setText("Buscar");
		this.jButtonRecargarInformacionSaldosDiariosBancos.setToolTipText("Buscar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSaldosDiariosBancos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSaldosDiariosBancos.setVisible(false);
		
		
		this.jButtonProcesarInformacionSaldosDiariosBancos = new JButtonMe();
		this.jButtonProcesarInformacionSaldosDiariosBancos.setText("Procesar");
		this.jButtonProcesarInformacionSaldosDiariosBancos.setToolTipText("Procesar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSaldosDiariosBancos.setVisible(false);
			
		this.jButtonProcesarInformacionSaldosDiariosBancos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosDiariosBancos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosDiariosBancos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setText("TIPO");       
		this.jComboBoxTiposReportesSaldosDiariosBancos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSaldosDiariosBancos.setText("Paginacion");
		this.jComboBoxTiposPaginacionSaldosDiariosBancos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSaldosDiariosBancos.setText("Accion");
		this.jComboBoxTiposRelacionesSaldosDiariosBancos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosDiariosBancos.setText("Accion");
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setText("Accion");
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSaldosDiariosBancos = new JLabelMe();
		
		this.jLabelAccionesSaldosDiariosBancos.setText("Acciones");		
		this.jLabelAccionesSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSaldosDiariosBancos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSaldosDiariosBancos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSaldosDiariosBancos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setText("Graf.");
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSaldosDiariosBancos = new JButtonMe();
		//this.jButtonAnterioresSaldosDiariosBancos.setText("<<");
        this.jButtonAnterioresSaldosDiariosBancos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSaldosDiariosBancos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSaldosDiariosBancos = new JButtonMe();
		//this.jButtonSiguientesSaldosDiariosBancos.setText(">>");
        this.jButtonSiguientesSaldosDiariosBancos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSaldosDiariosBancos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSaldosDiariosBancos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.setText("Nue");
        this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSaldosDiariosBancos,"nuevoguardarcambios_button","Nue",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSaldosDiariosBancos";
		inputMap = this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSaldosDiariosBancos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSaldosDiariosBancos";
		inputMap = this.jButtonRecargarInformacionSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSaldosDiariosBancos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSaldosDiariosBancos";
		inputMap = this.jButtonSiguientesSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSaldosDiariosBancos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSaldosDiariosBancos";
		inputMap = this.jButtonAnterioresSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSaldosDiariosBancos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSaldosDiariosBancos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSaldosDiariosBancos.setMinimumSize(new Dimension(this.getWidth(),SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosDiariosBancos.setMaximumSize(new Dimension(this.getWidth(),SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosDiariosBancos.setPreferredSize(new Dimension(this.getWidth(),SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosDiariosBancosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSaldosDiariosBancos = new GridBagLayout();

			this.jPanelPaginacionSaldosDiariosBancos.setLayout(gridaBagLayoutPaginacionSaldosDiariosBancos);						
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonAnterioresSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					
						
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
			
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonNuevoGuardarCambiosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
						
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonSiguientesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonNuevoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
						
			
			
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
				this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
				this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonGuardarCambiosTablaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			}
			
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonDuplicarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonCopiarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonVerFormSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 1;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSaldosDiariosBancos.add(this.jButtonCerrarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		
		this.jButtonRecargarInformacionSaldosDiariosBancos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosDiariosBancos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosDiariosBancos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSaldosDiariosBancos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosDiariosBancos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosDiariosBancos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSaldosDiariosBancos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosDiariosBancos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosDiariosBancos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSaldosDiariosBancos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosDiariosBancos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosDiariosBancos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSaldosDiariosBancos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSaldosDiariosBancos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SaldosDiariosBancos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SaldosDiariosBancos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SaldosDiariosBancos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SaldosDiariosBancos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSaldosDiariosBancos.setLayout(gridaBagParametrosReportesSaldosDiariosBancos);
			this.jPanelParametrosReportesAccionesSaldosDiariosBancos.setLayout(gridaBagParametrosReportesAccionesSaldosDiariosBancos);
			
			
			this.jPanelParametrosAuxiliar1SaldosDiariosBancos.setLayout(gridaBagParametrosAuxiliar1SaldosDiariosBancos);
			this.jPanelParametrosAuxiliar2SaldosDiariosBancos.setLayout(gridaBagParametrosAuxiliar2SaldosDiariosBancos);
			this.jPanelParametrosAuxiliar3SaldosDiariosBancos.setLayout(gridaBagParametrosAuxiliar3SaldosDiariosBancos);
			this.jPanelParametrosAuxiliar4SaldosDiariosBancos.setLayout(gridaBagParametrosAuxiliar4SaldosDiariosBancos);
			//this.jPanelParametrosAuxiliar5SaldosDiariosBancos.setLayout(gridaBagParametrosAuxiliar2SaldosDiariosBancos);			
			
			
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jButtonRecargarInformacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosDiariosBancos.add(this.jComboBoxTiposPaginacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosDiariosBancos.add(this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosDiariosBancos.add(this.jComboBoxTiposArchivosReportesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jPanelParametrosAuxiliar1SaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SaldosDiariosBancos.add(this.jComboBoxTiposReportesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);																		
			
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SaldosDiariosBancos.add(this.jComboBoxTiposGraficosReportesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jPanelParametrosAuxiliar4SaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jComboBoxTiposReportesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jCheckBoxGenerarReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jPanelParametrosAuxiliar2SaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jLabelAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
				this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jButtonAbrirOrderBySaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jComboBoxTiposSeleccionarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
			
			
			/*
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jCheckBoxSeleccionarTodosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jCheckBoxConGraficoReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosDiariosBancos.add(this.jCheckBoxSeleccionarTodosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);															
				
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosDiariosBancos.add(this.jCheckBoxSeleccionadosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);															
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosDiariosBancos.add(this.jCheckBoxConGraficoReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jPanelParametrosAuxiliar3SaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosDiariosBancos.add(this.jComboBoxTiposAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSaldosDiariosBancos = new GridBagLayout();

			this.jScrollPanelDatosSaldosDiariosBancos.setLayout(gridaBagLayoutDatosSaldosDiariosBancos);
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
			
			this.jScrollPanelDatosSaldosDiariosBancos.add(this.jTableDatosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSaldosDiariosBancos.setViewportView(this.jTableDatosSaldosDiariosBancos);
		this.jTableDatosSaldosDiariosBancos.setFillsViewportHeight(true);
		this.jTableDatosSaldosDiariosBancos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSaldosDiariosBancos= new GridBagLayout();
		this.jPanelAccionesSaldosDiariosBancos.setLayout(gridaBagLayoutAccionesSaldosDiariosBancos);
		
		
		/*	
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
			
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonNuevoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos= new GridBagLayout();
		gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.setLayout(gridaBagLayoutBusquedaSaldosDiariosBancosSaldosDiariosBancos);

		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jLabelid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);

		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		gridBagConstraintsSaldosDiariosBancos.gridx = 1;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);


		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 1;
		gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jLabelfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);

		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 1;
		gridBagConstraintsSaldosDiariosBancos.gridx = 1;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);


		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 2;
		gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jLabelfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);

		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 2;
		gridBagConstraintsSaldosDiariosBancos.gridx = 1;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);

		gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosDiariosBancos.gridy = 3;
		gridBagConstraintsSaldosDiariosBancos.gridx =1;
		jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos.add(jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);

		jTabbedPaneBusquedasSaldosDiariosBancos.addTab("1.-Por Ejercicio Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);
		jTabbedPaneBusquedasSaldosDiariosBancos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosDiariosBancos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();						
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;		
			//this.gridBagConstraintsSaldosDiariosBancos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosDiariosBancos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;		
		//this.gridBagConstraintsSaldosDiariosBancos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSaldosDiariosBancos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;		
			this.gridBagConstraintsSaldosDiariosBancos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSaldosDiariosBancos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);								
		
		
		/*
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		*/		
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosDiariosBancos.gridx =0;
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosDiariosBancos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
				
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSaldosDiariosBancos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosDiariosBancos = new GridBagLayout();
			this.jPanelBusquedasParametrosSaldosDiariosBancos.setLayout(gridaBagLayoutBusquedasParametrosSaldosDiariosBancos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSaldosDiariosBancos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSaldosDiariosBancos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSaldosDiariosBancos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSaldosDiariosBancos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSaldosDiariosBancos.setName("jPanelReporteDinamicoSaldosDiariosBancos"); 
		
		this.jPanelReporteDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSaldosDiariosBancos.setLayout(gridaBagLayoutReporteDinamicoSaldosDiariosBancos);
		
		
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosDiariosBancos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setResizable(true);
	    this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setClosable(true);
	    this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSaldosDiariosBancos = new JLabelMe();

		this.jLabelColumnasSelectReporteSaldosDiariosBancos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelColumnasSelectReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSaldosDiariosBancos = new JList<Reporte>();
		this.jListColumnasSelectReporteSaldosDiariosBancos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSaldosDiariosBancos=new JScrollPane(this.jListColumnasSelectReporteSaldosDiariosBancos);
			
			this.jScrollColumnasSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jListColumnasSelectReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jScrollColumnasSelectReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSaldosDiariosBancos = new JLabelMe();

		this.jLabelRelacionesSelectReporteSaldosDiariosBancos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSaldosDiariosBancos = new JList<Reporte>();
		this.jListRelacionesSelectReporteSaldosDiariosBancos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSaldosDiariosBancos=new JScrollPane(this.jListRelacionesSelectReporteSaldosDiariosBancos);
			
			this.jScrollRelacionesSelectReporteSaldosDiariosBancos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosDiariosBancos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosDiariosBancos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos = new JComboBoxMe();
		this.jListColumnasValoresGraficoSaldosDiariosBancos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSaldosDiariosBancos = new JLabelMe();

		this.jLabelConGraficoDinamicoSaldosDiariosBancos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelConGraficoDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jCheckBoxConGraficoDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelColumnaCategoriaGraficoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSaldosDiariosBancos = new JLabelMe();

		this.jLabelColumnaCategoriaValorSaldosDiariosBancos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelColumnaCategoriaValorSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jComboBoxColumnaCategoriaValorSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSaldosDiariosBancos = new JLabelMe();

		this.jLabelColumnasValoresGraficoSaldosDiariosBancos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelColumnasValoresGraficoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSaldosDiariosBancos = new JList<Reporte>();
		this.jListColumnasValoresGraficoSaldosDiariosBancos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSaldosDiariosBancos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSaldosDiariosBancos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosDiariosBancos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosDiariosBancos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSaldosDiariosBancos=new JScrollPane(this.jListColumnasValoresGraficoSaldosDiariosBancos);
			
			this.jScrollColumnasValoresGraficoSaldosDiariosBancos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosDiariosBancos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosDiariosBancos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jListColumnasSelectReporteSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jScrollColumnasValoresGraficoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelTiposGraficosReportesDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosDiariosBancos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jComboBoxTiposGraficosReportesDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelGenerarExcelReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos.setToolTipText("Generar EXCEL"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jComboBoxTiposReportesDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jLabelTiposArchivoReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jComboBoxTiposArchivosReportesDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSaldosDiariosBancos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSaldosDiariosBancos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSaldosDiariosBancos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSaldosDiariosBancos.setToolTipText("Generar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jButtonGenerarReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSaldosDiariosBancos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSaldosDiariosBancos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSaldosDiariosBancos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSaldosDiariosBancos.setToolTipText("Cancelar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosDiariosBancos.add(this.jButtonCerrarReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSaldosDiariosBancos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos= new JScrollPane(jPanelReporteDinamicoSaldosDiariosBancos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSaldosDiariosBancos);
		this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getContentPane().add(this.jScrollPanelReporteDinamicoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSaldosDiariosBancos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSaldosDiariosBancos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSaldosDiariosBancos.setName("jPanelImportacionSaldosDiariosBancos"); 
		
		this.jPanelImportacionSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSaldosDiariosBancos.setLayout(gridaBagLayoutImportacionSaldosDiariosBancos);
		
		
		this.jInternalFrameImportacionSaldosDiariosBancos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSaldosDiariosBancos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSaldosDiariosBancos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosDiariosBancos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSaldosDiariosBancos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosDiariosBancos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSaldosDiariosBancos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosDiariosBancos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosDiariosBancos.setResizable(true);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setClosable(true);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSaldosDiariosBancos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosDiariosBancos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSaldosDiariosBancos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosDiariosBancos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosDiariosBancos.setResizable(true);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setClosable(true);
	    this.jInternalFrameImportacionSaldosDiariosBancos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSaldosDiariosBancos = new JLabelMe();

		this.jLabelArchivoImportacionSaldosDiariosBancos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosDiariosBancos.add(this.jLabelArchivoImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSaldosDiariosBancos = new JFileChooser();		
		this.jFileChooserImportacionSaldosDiariosBancos.setToolTipText("ESCOGER ARCHIVO"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSaldosDiariosBancos = new JButtonMe();
		this.jButtonAbrirImportacionSaldosDiariosBancos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSaldosDiariosBancos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSaldosDiariosBancos.setToolTipText("Generar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosDiariosBancos.add(this.jButtonAbrirImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSaldosDiariosBancos = new JLabelMe();

		this.jLabelPathArchivoImportacionSaldosDiariosBancos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosDiariosBancos.add(this.jLabelPathArchivoImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSaldosDiariosBancos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSaldosDiariosBancos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosDiariosBancos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosDiariosBancos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosDiariosBancos.add(this.jTextFieldPathArchivoImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSaldosDiariosBancos = new JButtonMe();
		this.jButtonGenerarImportacionSaldosDiariosBancos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSaldosDiariosBancos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSaldosDiariosBancos.setToolTipText("Generar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosDiariosBancos.add(this.jButtonGenerarImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSaldosDiariosBancos = new JButtonMe();
		this.jButtonCerrarImportacionSaldosDiariosBancos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSaldosDiariosBancos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSaldosDiariosBancos.setToolTipText("Cancelar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosDiariosBancos.add(this.jButtonCerrarImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSaldosDiariosBancos = new GridBagLayout();
		
		this.jScrollPanelImportacionSaldosDiariosBancos= new JScrollPane(jPanelImportacionSaldosDiariosBancos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iPosYImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXImportacion;
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSaldosDiariosBancos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSaldosDiariosBancos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSaldosDiariosBancos);
		this.jInternalFrameImportacionSaldosDiariosBancos.getContentPane().add(this.jScrollPanelImportacionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySaldosDiariosBancos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySaldosDiariosBancos = new JButtonMe();
			this.jButtonAbrirOrderBySaldosDiariosBancos.setText("Orden");
			this.jButtonAbrirOrderBySaldosDiariosBancos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosDiariosBancos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySaldosDiariosBancos";
			inputMap = this.jButtonAbrirOrderBySaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySaldosDiariosBancos"));
		
		
			GridBagLayout gridaBagLayoutOrderBySaldosDiariosBancos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySaldosDiariosBancos.setName("jPanelOrderBySaldosDiariosBancos"); 
			
			this.jPanelOrderBySaldosDiariosBancos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosDiariosBancos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosDiariosBancos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySaldosDiariosBancos.setLayout(gridaBagLayoutOrderBySaldosDiariosBancos);
			
			
			this.jTableDatosSaldosDiariosBancosOrderBy = new JTableMe();        
			this.jTableDatosSaldosDiariosBancosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSaldosDiariosBancosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSaldosDiariosBancosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSaldosDiariosBancosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSaldosDiariosBancosOrderBy.setViewportView(this.jTableDatosSaldosDiariosBancosOrderBy);
			this.jTableDatosSaldosDiariosBancosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSaldosDiariosBancosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySaldosDiariosBancos= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySaldosDiariosBancos= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySaldosDiariosBancos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSaldosDiariosBancos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySaldosDiariosBancos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySaldosDiariosBancos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySaldosDiariosBancos.setTitle("Orden");
			this.jInternalFrameOrderBySaldosDiariosBancos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySaldosDiariosBancos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySaldosDiariosBancos.setResizable(true);
			this.jInternalFrameOrderBySaldosDiariosBancos.setClosable(true);
			this.jInternalFrameOrderBySaldosDiariosBancos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySaldosDiariosBancos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosDiariosBancos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosDiariosBancos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSaldosDiariosBancos.ipady =150;
				
			this.jPanelOrderBySaldosDiariosBancos.add(jScrollPanelDatosSaldosDiariosBancosOrderBy, this.gridBagConstraintsSaldosDiariosBancos);//this.jTableDatosSaldosDiariosBancosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySaldosDiariosBancos = new JButtonMe();
			this.jButtonCerrarOrderBySaldosDiariosBancos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySaldosDiariosBancos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySaldosDiariosBancos.setToolTipText("Cancelar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySaldosDiariosBancos.add(this.jButtonCerrarOrderBySaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSaldosDiariosBancos = new GridBagLayout();
			
			this.jScrollPanelOrderBySaldosDiariosBancos= new JScrollPane(jPanelOrderBySaldosDiariosBancos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iPosYOrderBy;
			this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySaldosDiariosBancos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySaldosDiariosBancos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSaldosDiariosBancos);
			
			this.jInternalFrameOrderBySaldosDiariosBancos.getContentPane().add(this.jScrollPanelOrderBySaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
		
		} else {
			this.jButtonAbrirOrderBySaldosDiariosBancos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSaldosDiariosBancos.getRowHeight();//SaldosDiariosBancosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.isSelected()) {
					iHeightTable=SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosDiariosBancos.isSelected()) {
					iHeightTable=SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosDiariosBancosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySaldosDiariosBancos!=null && this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy()!=null) {
			//if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySaldosDiariosBancos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySaldosDiariosBancos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySaldosDiariosBancos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=saldosdiariosbancosLogic.getSaldosDiariosBancoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosdiariosbancoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SaldosDiariosBancos> TraerSaldosDiariosBancosBeans(List<SaldosDiariosBancos> saldosdiariosbancoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancoss) {
					
				if(!(SaldosDiariosBancosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SaldosDiariosBancosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					saldosdiariosbancos.setsDetalleGeneralEntityReporte(SaldosDiariosBancosConstantesFunciones.getSaldosDiariosBancosDescripcion(saldosdiariosbancos));
										
						
					
						
					
				} else  {
							
					//saldosdiariosbancos.setsDetalleGeneralEntityReporte(saldosdiariosbancos.getsDetalleGeneralEntityReporte());
										
				}
				
				//saldosdiariosbancosbeans.add(saldosdiariosbancosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return saldosdiariosbancoss;
    }
	//PARA REPORTES FIN
}
