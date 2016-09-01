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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ProcesoCierreCajaJInternalFrame extends ProcesoCierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCierreCaja;
	
	protected JMenuBar jmenuBarProcesoCierreCaja;
	
	protected JMenu jmenuProcesoCierreCaja;
	protected JMenu jmenuDatosProcesoCierreCaja;
	protected JMenu jmenuArchivoProcesoCierreCaja;
	protected JMenu jmenuAccionesProcesoCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreCaja;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCierreCajaDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCierreCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCierreCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCierreCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ProcesoCierreCajaSessionBean procesocierrecajaSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCierreCaja> procesocierrecajas;		
	public List<ProcesoCierreCaja> procesocierrecajasEliminados;	
	public List<ProcesoCierreCaja> procesocierrecajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCierreCaja;		
	protected JButton jButtonAbrirOrderByProcesoCierreCaja;
	
	
	//protected JPanel jPanelOrderByProcesoCierreCaja;
	//public JScrollPane jScrollPanelOrderByProcesoCierreCaja;	
	//protected JButton jButtonCerrarOrderByProcesoCierreCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCierreCajaLogic procesocierrecajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCierreCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCierreCaja;
	//public JScrollPane jScrollPanelImportacionProcesoCierreCaja;
	
	
	
	protected JPanel jPanelAccionesProcesoCierreCaja;
	
    protected JPanel jPanelPaginacionProcesoCierreCaja;
    protected JPanel jPanelParametrosReportesProcesoCierreCaja;
	protected JPanel jPanelParametrosReportesAccionesProcesoCierreCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCierreCaja;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCierreCaja;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCierreCaja;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCierreCaja;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCierreCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCierreCaja;
	//protected JPanel jPanelImportacionProcesoCierreCaja;
	
	
	public JTable jTableDatosProcesoCierreCaja;
	
	
	
	//public JTable jTableDatosProcesoCierreCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCierreCaja;
	protected JButton jButtonDuplicarProcesoCierreCaja;
	protected JButton jButtonCopiarProcesoCierreCaja;
	protected JButton jButtonVerFormProcesoCierreCaja;
	protected JButton jButtonNuevoRelacionesProcesoCierreCaja;
	protected JButton jButtonModificarProcesoCierreCaja;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCierreCaja;
	protected JButton jButtonCerrarProcesoCierreCaja;
	
	
	protected JButton jButtonRecargarInformacionProcesoCierreCaja;
	protected JButton jButtonProcesarInformacionProcesoCierreCaja;
	
	
	protected JButton jButtonAnterioresProcesoCierreCaja;
	protected JButton jButtonSiguientesProcesoCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosProcesoCierreCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCierreCaja;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCierreCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCierreCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCierreCaja;
	//protected JButton jButtonGenerarImportacionProcesoCierreCaja;
	//protected JButton jButtonCerrarImportacionProcesoCierreCaja;
	//protected JFileChooser jFileChooserImportacionProcesoCierreCaja;
	//protected File fileImportacionProcesoCierreCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreCaja;
	protected JButton jButtonDuplicarToolBarProcesoCierreCaja;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCierreCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCierreCaja;
	protected JButton jButtonCopiarToolBarProcesoCierreCaja;
	protected JButton jButtonVerFormToolBarProcesoCierreCaja;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreCaja;
	protected JButton jButtonCerrarToolBarProcesoCierreCaja;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCierreCaja;
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreCaja;
	protected JButton jButtonAnterioresToolBarProcesoCierreCaja;
	protected JButton jButtonSiguientesToolBarProcesoCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja;
	protected JButton jButtonAbrirOrderByToolBarProcesoCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreCaja;
	protected JMenuItem jMenuItemDuplicarProcesoCierreCaja;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCierreCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCierreCaja;
	protected JMenuItem jMenuItemCopiarProcesoCierreCaja;
	protected JMenuItem jMenuItemVerFormProcesoCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreCaja;
	protected JMenuItem jMenuItemCerrarProcesoCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCierreCaja;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreCaja;
	protected JMenuItem jMenuItemAnterioresProcesoCierreCaja;
	protected JMenuItem jMenuItemSiguientesProcesoCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreCaja;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCierreCaja;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCierreCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCierreCaja;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCierreCaja;
	protected JTextField jTextFieldValorCampoGeneralProcesoCierreCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCierreCaja;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCierreCaja;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCierreCaja;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCierreCaja;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCierreCaja;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCierreCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCierreCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCierreCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCierreCaja;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCierreCaja;	
	//public JLabel jLabelPathArchivoImportacionProcesoCierreCaja;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCierreCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCierreCaja;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCierreCaja;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCierreCaja;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCierreCaja;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCierreCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCierreCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCierreCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCierreCaja;
	public JPanel jPanelBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JButton jButtonBusquedaProcesoCierreCajaProcesoCierreCaja;
	
	public JPanel jPanelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JLabel jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JButton jButtonid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaProcesoCierreCajaProcesoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaProcesoCierreCajaProcesoCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JLabel jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JButton jButtonid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja= new JButtonMe();
	public JButton jButtonid_cajaBusquedaProcesoCierreCajaProcesoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaBusquedaProcesoCierreCajaProcesoCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelfechaBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JLabel jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja;
	//public JFormattedTextField jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja;

	public JDateChooser jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja;
	public JButton jButtonfechaBusquedaProcesoCierreCajaProcesoCierreCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoCierreCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCierreCaja)	{
		this.jButtonRecargarInformacionProcesoCierreCaja = jButtonRecargarInformacionProcesoCierreCaja;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCierreCaja() {
		return this.jButtonProcesarInformacionProcesoCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreCaja)	{
		this.jButtonProcesarInformacionProcesoCierreCaja = jButtonProcesarInformacionProcesoCierreCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCierreCaja() {
		return this.jButtonRecargarInformacionProcesoCierreCaja;
	}
	
	
	public List<ProcesoCierreCaja> getprocesocierrecajas() {
		return this.procesocierrecajas;
	}

	public void setprocesocierrecajas(List<ProcesoCierreCaja> procesocierrecajas) {
		this.procesocierrecajas = procesocierrecajas;
	}
	
	public List<ProcesoCierreCaja> getprocesocierrecajasAux() {
		return this.procesocierrecajasAux;
	}

	public void setprocesocierrecajasAux(List<ProcesoCierreCaja> procesocierrecajasAux) {
		this.procesocierrecajasAux = procesocierrecajasAux;
	}
	
	public List<ProcesoCierreCaja> getprocesocierrecajasEliminados() {
		return this.procesocierrecajasEliminados;
	}

	public void setProcesoCierreCajasEliminados(List<ProcesoCierreCaja> procesocierrecajasEliminados) {
		this.procesocierrecajasEliminados = procesocierrecajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCierreCaja() {
		return jComboBoxTiposSeleccionarProcesoCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCierreCaja(
			JComboBox jComboBoxTiposSeleccionarProcesoCierreCaja) {
		this.jComboBoxTiposSeleccionarProcesoCierreCaja = jComboBoxTiposSeleccionarProcesoCierreCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCierreCaja() {
		return jTextFieldValorCampoGeneralProcesoCierreCaja;
	}

	public void setjTextFieldValorCampoGeneralProcesoCierreCaja(
			JTextField jTextFieldValorCampoGeneralProcesoCierreCaja) {
		this.jTextFieldValorCampoGeneralProcesoCierreCaja = jTextFieldValorCampoGeneralProcesoCierreCaja;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCierreCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCierreCaja() {
		return this.jCheckBoxSeleccionarTodosProcesoCierreCaja;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCierreCaja(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCierreCaja) {
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja = jCheckBoxSeleccionarTodosProcesoCierreCaja;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCierreCaja() {
		return this.jCheckBoxSeleccionadosProcesoCierreCaja;
	}

	public void setjCheckBoxSeleccionadosProcesoCierreCaja(
			JCheckBox jCheckBoxSeleccionadosProcesoCierreCaja) {
		this.jCheckBoxSeleccionadosProcesoCierreCaja = jCheckBoxSeleccionadosProcesoCierreCaja;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCierreCaja() {
		return this.jComboBoxTiposArchivosReportesProcesoCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCierreCaja(
			JComboBox jComboBoxTiposArchivosReportesProcesoCierreCaja) {
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja = jComboBoxTiposArchivosReportesProcesoCierreCaja;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCierreCaja() {
		return this.jComboBoxTiposReportesProcesoCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCierreCaja(
			JComboBox jComboBoxTiposReportesProcesoCierreCaja) {
		this.jComboBoxTiposReportesProcesoCierreCaja = jComboBoxTiposReportesProcesoCierreCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCierreCaja() {
	//	return jComboBoxTiposReportesDinamicoProcesoCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCierreCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCierreCaja) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCierreCaja = jComboBoxTiposReportesDinamicoProcesoCierreCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja = jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCierreCaja() {
		return this.jComboBoxTiposGraficosReportesProcesoCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCierreCaja(
			JComboBox jComboBoxTiposGraficosReportesProcesoCierreCaja) {
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja = jComboBoxTiposGraficosReportesProcesoCierreCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCierreCaja() {
		return this.jComboBoxTiposPaginacionProcesoCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCierreCaja(
			JComboBox jComboBoxTiposPaginacionProcesoCierreCaja) {
		this.jComboBoxTiposPaginacionProcesoCierreCaja = jComboBoxTiposPaginacionProcesoCierreCaja;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCierreCaja() {
		return this.jComboBoxTiposRelacionesProcesoCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreCaja() {
		return this.jComboBoxTiposAccionesProcesoCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreCaja(
			JComboBox jComboBoxTiposRelacionesProcesoCierreCaja) {
		this.jComboBoxTiposRelacionesProcesoCierreCaja = jComboBoxTiposRelacionesProcesoCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreCaja(
			JComboBox jComboBoxTiposAccionesProcesoCierreCaja) {
		this.jComboBoxTiposAccionesProcesoCierreCaja = jComboBoxTiposAccionesProcesoCierreCaja;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCierreCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCierreCaja() {
	//	return jCheckBoxConGraficoDinamicoProcesoCierreCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCierreCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreCaja) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreCaja = jCheckBoxConGraficoDinamicoProcesoCierreCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCierreCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCierreCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreCaja .setBorder(borderResaltar);		
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
		this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
		
		this.procesocierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierrecajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCierreCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"copiar","copiar","Copiar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"ver_form","ver_form","Ver"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"recargar","recargar","Procesar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,
							"cerrar","cerrar","Salir"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCierreCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCierreCaja;
			
				this.jButtonProcesarInformacionToolBarProcesoCierreCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCierreCaja;
				
		//protected JButton jButtonModificarToolBarProcesoCierreCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCierreCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCierreCaja=new JMenuMe("General");
		this.jmenuArchivoProcesoCierreCaja=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCierreCaja=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCierreCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCierreCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCierreCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCierreCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCierreCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCierreCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCierreCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCierreCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCierreCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCierreCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCierreCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCierreCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCierreCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCierreCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCierreCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCierreCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCierreCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCierreCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCierreCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCierreCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCierreCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCierreCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCierreCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCierreCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCierreCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCierreCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCierreCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCierreCaja.add(this.jMenuItemCerrarProcesoCierreCaja);
			
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemNuevoProcesoCierreCaja);
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja);
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemNuevoRelacionesProcesoCierreCaja);
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemGuardarCambiosTablaProcesoCierreCaja);		
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemDuplicarProcesoCierreCaja);		
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemCopiarProcesoCierreCaja);		
			this.jmenuAccionesProcesoCierreCaja.add(this.jMenuItemVerFormProcesoCierreCaja);		
			
			this.jmenuDatosProcesoCierreCaja.add(this.jMenuItemRecargarInformacionProcesoCierreCaja);				
			this.jmenuDatosProcesoCierreCaja.add(this.jMenuItemAnterioresProcesoCierreCaja);				
			this.jmenuDatosProcesoCierreCaja.add(this.jMenuItemSiguientesProcesoCierreCaja);				
			this.jmenuDatosProcesoCierreCaja.add(this.jMenuItemAbrirOrderByProcesoCierreCaja);				
			this.jmenuDatosProcesoCierreCaja.add(this.jMenuItemMostrarOcultarProcesoCierreCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCierreCaja.add(this.jMenuItemGuardarCambiosProcesoCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCierreCaja.add(this.jmenuArchivoProcesoCierreCaja);		
			this.jmenuBarProcesoCierreCaja.add(this.jmenuAccionesProcesoCierreCaja);		
			this.jmenuBarProcesoCierreCaja.add(this.jmenuDatosProcesoCierreCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCierreCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCierreCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.setToolTipText("Procesar Proceso Cierre Caja");
		this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja= new JButtonMe();
		this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja.setText("Procesar");
		this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja.setToolTipText("Procesar Proceso Cierre Caja");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja,"buscar_button","Procesar Proceso Cierre Caja");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja = new JLabelMe();
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setText("Usuario :");
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja = new JLabelMe();
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setText("Caja :");
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setToolTipText("Caja");
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja= new JComboBoxMe();
		jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja = new JLabelMe();
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setText("Fecha :");
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setToolTipText("Fecha");
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja= new JDateChooser();
		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setDate(new Date());
		jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoCierreCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCierreCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierreCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierreCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cierre Caja"));
		this.jTabbedPaneBusquedasProcesoCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCierreCaja = new ProcesoCierreCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cierre Caja DATOS");
			this.jInternalFrameDetalleFormProcesoCierreCaja = new ProcesoCierreCajaDetalleFormJInternalFrame(jDesktopPane,this.procesocierrecajaSessionBean.getConGuardarRelaciones(),this.procesocierrecajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCierreCaja = null;//new ProcesoCierreCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreCaja= new GridBagLayout();
		
		
		this.jTableDatosProcesoCierreCaja = new JTableMe();      
		
		String sToolTipProcesoCierreCaja="";
		sToolTipProcesoCierreCaja=ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreCaja+="(PuntoVenta.ProcesoCierreCaja)";
		}
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCierreCaja.setToolTipText(sToolTipProcesoCierreCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCierreCaja);
		this.jTableDatosProcesoCierreCaja.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCierreCaja.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCierreCaja = new JButtonMe();
		this.jButtonDuplicarProcesoCierreCaja = new JButtonMe();
		this.jButtonCopiarProcesoCierreCaja = new JButtonMe();
		this.jButtonVerFormProcesoCierreCaja = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCierreCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja = new JButtonMe();
		this.jButtonCerrarProcesoCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCierreCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Caja";
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCierreCaja=new ReporteDinamicoJInternalFrame(ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCierreCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCierreCaja=new ImportacionJInternalFrame(ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCierreCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCierreCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCierreCaja.setText("Orden");
		this.jButtonAbrirOrderByProcesoCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreCaja,false,this);
			
			//this.cargarOrderByProcesoCierreCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreCaja,true,this);
			
			//this.cargarOrderByProcesoCierreCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCierreCaja.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoCierreCaja.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoCierreCaja.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesoCierreCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCierreCaja.setText("Nuevo");
		this.jButtonDuplicarProcesoCierreCaja.setText("Duplicar");
		this.jButtonCopiarProcesoCierreCaja.setText("Copiar");
		this.jButtonVerFormProcesoCierreCaja.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCierreCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.setText("Guardar");
		this.jButtonCerrarProcesoCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreCaja,"nuevo_button","Nuevo",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCierreCaja,"duplicar_button","Duplicar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCierreCaja,"copiar_button","Copiar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCierreCaja,"ver_form","Ver",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCierreCaja,"nuevorelaciones_button","Nuevo Rel",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreCaja,"guardarcambiostabla_button","Guardar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreCaja,"cerrar_button","Salir",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCierreCaja.setToolTipText("Nuevo"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCierreCaja.setToolTipText("Duplicar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCierreCaja.setToolTipText("Copiar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCierreCaja.setToolTipText("Ver"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCierreCaja.setToolTipText("Nuevo Rel"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.setToolTipText("Guardar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreCaja.setToolTipText("Salir"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreCaja";
		inputMap = this.jButtonNuevoProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCierreCaja";
		inputMap = this.jButtonDuplicarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCierreCaja"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCierreCaja";
		inputMap = this.jButtonCopiarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCierreCaja"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCierreCaja";
		inputMap = this.jButtonVerFormProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCierreCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCierreCaja";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCierreCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCierreCaja";
		inputMap = this.jButtonModificarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCierreCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreCaja";
		inputMap = this.jButtonCerrarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCierreCaja.setName("jPanelParametrosReportesProcesoCierreCaja"); 
		
		this.jPanelParametrosReportesAccionesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCierreCaja.setName("jPanelParametrosReportesAccionesProcesoCierreCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCierreCaja = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCierreCaja.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCierreCaja.setToolTipText("Procesar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCierreCaja,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCierreCaja.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCierreCaja = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCierreCaja.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCierreCaja.setToolTipText("Procesar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCierreCaja.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCierreCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCierreCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCierreCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCierreCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCierreCaja.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCierreCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCierreCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCierreCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCierreCaja = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreCaja.setText("Acciones");		
		this.jLabelAccionesProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCierreCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCierreCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCierreCaja = new JButtonMe();
		//this.jButtonAnterioresProcesoCierreCaja.setText("<<");
        this.jButtonAnterioresProcesoCierreCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCierreCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCierreCaja = new JButtonMe();
		//this.jButtonSiguientesProcesoCierreCaja.setText(">>");
        this.jButtonSiguientesProcesoCierreCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCierreCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCierreCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCierreCaja,"nuevoguardarcambios_button","Nue",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCierreCaja";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCierreCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCierreCaja";
		inputMap = this.jButtonRecargarInformacionProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCierreCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCierreCaja";
		inputMap = this.jButtonSiguientesProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCierreCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCierreCaja";
		inputMap = this.jButtonAnterioresProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCierreCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCierreCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCierreCaja.setMinimumSize(new Dimension(this.getWidth(),ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreCaja.setMaximumSize(new Dimension(this.getWidth(),ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreCaja.setPreferredSize(new Dimension(this.getWidth(),ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCierreCaja = new GridBagLayout();

			this.jPanelPaginacionProcesoCierreCaja.setLayout(gridaBagLayoutPaginacionProcesoCierreCaja);						
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonAnterioresProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					
						
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
			
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonNuevoGuardarCambiosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
						
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonSiguientesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonNuevoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
						
			
			
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
				this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonGuardarCambiosTablaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			}
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonProcesarInformacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonDuplicarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonCopiarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonVerFormProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 1;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCierreCaja.add(this.jButtonCerrarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
		
		
		this.jButtonRecargarInformacionProcesoCierreCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCierreCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCierreCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCierreCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCierreCaja.setLayout(gridaBagParametrosReportesProcesoCierreCaja);
			this.jPanelParametrosReportesAccionesProcesoCierreCaja.setLayout(gridaBagParametrosReportesAccionesProcesoCierreCaja);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCierreCaja.setLayout(gridaBagParametrosAuxiliar1ProcesoCierreCaja);
			this.jPanelParametrosAuxiliar2ProcesoCierreCaja.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreCaja);
			this.jPanelParametrosAuxiliar3ProcesoCierreCaja.setLayout(gridaBagParametrosAuxiliar3ProcesoCierreCaja);
			this.jPanelParametrosAuxiliar4ProcesoCierreCaja.setLayout(gridaBagParametrosAuxiliar4ProcesoCierreCaja);
			//this.jPanelParametrosAuxiliar5ProcesoCierreCaja.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreCaja);			
			
			
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jButtonRecargarInformacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreCaja.add(this.jComboBoxTiposPaginacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreCaja.add(this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreCaja.add(this.jComboBoxTiposArchivosReportesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jPanelParametrosAuxiliar1ProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCierreCaja.add(this.jComboBoxTiposReportesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jPanelParametrosAuxiliar4ProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jComboBoxTiposReportesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jCheckBoxGenerarReporteProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jPanelParametrosAuxiliar2ProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jLabelAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jComboBoxTiposSeleccionarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
			
			
			/*
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jCheckBoxSeleccionarTodosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreCaja.add(this.jCheckBoxSeleccionarTodosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);															
				
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreCaja.add(this.jCheckBoxSeleccionadosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jPanelParametrosAuxiliar3ProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreCaja.add(this.jComboBoxTiposAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCierreCaja = new GridBagLayout();

			this.jScrollPanelDatosProcesoCierreCaja.setLayout(gridaBagLayoutDatosProcesoCierreCaja);
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
			
			this.jScrollPanelDatosProcesoCierreCaja.add(this.jTableDatosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCierreCaja.setViewportView(this.jTableDatosProcesoCierreCaja);
		this.jTableDatosProcesoCierreCaja.setFillsViewportHeight(true);
		this.jTableDatosProcesoCierreCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreCaja= new GridBagLayout();
		this.jPanelAccionesProcesoCierreCaja.setLayout(gridaBagLayoutAccionesProcesoCierreCaja);
		
		
		/*	
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
			
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonNuevoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.setLayout(gridaBagLayoutBusquedaProcesoCierreCajaProcesoCierreCaja);

		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 0;
		gridBagConstraintsProcesoCierreCaja.gridx = 0;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jLabelid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);

		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 0;
		gridBagConstraintsProcesoCierreCaja.gridx = 1;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);


		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 1;
		gridBagConstraintsProcesoCierreCaja.gridx = 0;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jLabelid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);

		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 1;
		gridBagConstraintsProcesoCierreCaja.gridx = 1;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);


		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 2;
		gridBagConstraintsProcesoCierreCaja.gridx = 0;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jLabelfechaBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);

		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 2;
		gridBagConstraintsProcesoCierreCaja.gridx = 1;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);

		gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreCaja.gridy = 3;
		gridBagConstraintsProcesoCierreCaja.gridx =1;
		jPanelBusquedaProcesoCierreCajaProcesoCierreCaja.add(jButtonBusquedaProcesoCierreCajaProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);

		jTabbedPaneBusquedasProcesoCierreCaja.addTab("1.-Por Usuario Por Caja Por Fecha ", jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);
		jTabbedPaneBusquedasProcesoCierreCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;		
		//this.gridBagConstraintsProcesoCierreCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCierreCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;		
			this.gridBagConstraintsProcesoCierreCaja.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCierreCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);								
		
		
		/*
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		*/		
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreCaja.gridx =0;
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
				
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCierreCaja.setLayout(gridaBagLayoutBusquedasParametrosProcesoCierreCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCierreCaja.setVisible(false);
		this.jButtonAnterioresProcesoCierreCaja.setVisible(false);
		this.jButtonSiguientesProcesoCierreCaja.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCierreCaja.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCierreCaja.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCierreCaja.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCierreCaja.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposReportesProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCierreCaja.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCierreCaja.setVisible(false);
		
		
		this.jTtoolBarProcesoCierreCaja.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCierreCaja.setVisible(false);
		this.jMenuItemSiguientesProcesoCierreCaja.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCierreCaja.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCierreCaja.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreCaja.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCierreCaja.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCierreCaja.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCierreCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCierreCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCierreCaja.setName("jPanelReporteDinamicoProcesoCierreCaja"); 
		
		this.jPanelReporteDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCierreCaja.setLayout(gridaBagLayoutReporteDinamicoProcesoCierreCaja);
		
		
		this.jInternalFrameReporteDinamicoProcesoCierreCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCierreCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCierreCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCierreCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCierreCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jLabelColumnasSelectReporteProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCierreCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCierreCaja=new JScrollPane(this.jListColumnasSelectReporteProcesoCierreCaja);
			
			this.jScrollColumnasSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jListColumnasSelectReporteProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jScrollColumnasSelectReporteProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCierreCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCierreCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCierreCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCierreCaja=new JScrollPane(this.jListRelacionesSelectReporteProcesoCierreCaja);
			
			this.jScrollRelacionesSelectReporteProcesoCierreCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCierreCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCierreCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCierreCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jLabelGenerarExcelReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja.setToolTipText("Generar EXCEL"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jComboBoxTiposReportesDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jLabelTiposArchivoReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCierreCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCierreCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCierreCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCierreCaja.setToolTipText("Generar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jButtonGenerarReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCierreCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCierreCaja.setToolTipText("Cancelar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreCaja.add(this.jButtonCerrarReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCierreCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCierreCaja= new JScrollPane(jPanelReporteDinamicoProcesoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCierreCaja);
		this.jInternalFrameReporteDinamicoProcesoCierreCaja.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCierreCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCierreCaja.setName("jPanelImportacionProcesoCierreCaja"); 
		
		this.jPanelImportacionProcesoCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCierreCaja.setLayout(gridaBagLayoutImportacionProcesoCierreCaja);
		
		
		this.jInternalFrameImportacionProcesoCierreCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCierreCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCierreCaja = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCierreCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreCaja.add(this.jLabelArchivoImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCierreCaja = new JFileChooser();		
		this.jFileChooserImportacionProcesoCierreCaja.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCierreCaja = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCierreCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCierreCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCierreCaja.setToolTipText("Generar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreCaja.add(this.jButtonAbrirImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCierreCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCierreCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreCaja.add(this.jLabelPathArchivoImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCierreCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCierreCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreCaja.add(this.jTextFieldPathArchivoImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCierreCaja = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCierreCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCierreCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCierreCaja.setToolTipText("Generar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreCaja.add(this.jButtonGenerarImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCierreCaja = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCierreCaja.setToolTipText("Cancelar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreCaja.add(this.jButtonCerrarImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCierreCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCierreCaja= new JScrollPane(jPanelImportacionProcesoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCierreCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCierreCaja);
		this.jInternalFrameImportacionProcesoCierreCaja.getContentPane().add(this.jScrollPanelImportacionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCierreCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCierreCaja = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCierreCaja.setText("Orden");
			this.jButtonAbrirOrderByProcesoCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCierreCaja";
			inputMap = this.jButtonAbrirOrderByProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCierreCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCierreCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCierreCaja.setName("jPanelOrderByProcesoCierreCaja"); 
			
			this.jPanelOrderByProcesoCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCierreCaja.setLayout(gridaBagLayoutOrderByProcesoCierreCaja);
			
			
			this.jTableDatosProcesoCierreCajaOrderBy = new JTableMe();        
			this.jTableDatosProcesoCierreCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCierreCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCierreCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCierreCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCierreCajaOrderBy.setViewportView(this.jTableDatosProcesoCierreCajaOrderBy);
			this.jTableDatosProcesoCierreCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCierreCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCierreCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCierreCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCierreCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCierreCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCierreCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCierreCaja.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCierreCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCierreCaja.setResizable(true);
			this.jInternalFrameOrderByProcesoCierreCaja.setClosable(true);
			this.jInternalFrameOrderByProcesoCierreCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCierreCaja.ipady =150;
				
			this.jPanelOrderByProcesoCierreCaja.add(jScrollPanelDatosProcesoCierreCajaOrderBy, this.gridBagConstraintsProcesoCierreCaja);//this.jTableDatosProcesoCierreCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCierreCaja = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCierreCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCierreCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCierreCaja.setToolTipText("Cancelar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCierreCaja.add(this.jButtonCerrarOrderByProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCierreCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCierreCaja= new JScrollPane(jPanelOrderByProcesoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCierreCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCierreCaja);
			
			this.jInternalFrameOrderByProcesoCierreCaja.getContentPane().add(this.jScrollPanelOrderByProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCierreCaja = new JButtonMe();
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
		//if(this.conMaximoRelaciones 
		//	&& this.procesocierrecajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCierreCaja.getRowHeight();//ProcesoCierreCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.isSelected()) {
					iHeightTable=ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreCaja.isSelected()) {
					iHeightTable=ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCierreCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCierreCaja!=null && this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCierreCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCierreCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCierreCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocierrecajaLogic.getProcesoCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierrecajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCierreCaja> TraerProcesoCierreCajaBeans(List<ProcesoCierreCaja> procesocierrecajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCierreCaja procesocierrecaja:procesocierrecajas) {
					
				if(!(ProcesoCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocierrecaja.setsDetalleGeneralEntityReporte(ProcesoCierreCajaConstantesFunciones.getProcesoCierreCajaDescripcion(procesocierrecaja));
										
						
					
						
					
				} else  {
							
					//procesocierrecaja.setsDetalleGeneralEntityReporte(procesocierrecaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocierrecajabeans.add(procesocierrecajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocierrecajas;
    }
	//PARA REPORTES FIN
}
