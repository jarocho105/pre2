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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.MayooresGeneralesConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class MayooresGeneralesJInternalFrame extends MayooresGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMayooresGenerales;
	
	protected JMenuBar jmenuBarMayooresGenerales;
	
	protected JMenu jmenuMayooresGenerales;
	protected JMenu jmenuDatosMayooresGenerales;
	protected JMenu jmenuArchivoMayooresGenerales;
	protected JMenu jmenuAccionesMayooresGenerales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMayooresGenerales;	
	protected GridBagConstraints gridBagConstraintsMayooresGenerales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MayooresGeneralesDetalleFormJInternalFrame jInternalFrameDetalleFormMayooresGenerales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMayooresGenerales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMayooresGenerales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public MayooresGeneralesSessionBean mayooresgeneralesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MayooresGenerales> mayooresgeneraless;		
	public List<MayooresGenerales> mayooresgeneralessEliminados;	
	public List<MayooresGenerales> mayooresgeneralessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMayooresGenerales;		
	protected JButton jButtonAbrirOrderByMayooresGenerales;
	
	
	//protected JPanel jPanelOrderByMayooresGenerales;
	//public JScrollPane jScrollPanelOrderByMayooresGenerales;	
	//protected JButton jButtonCerrarOrderByMayooresGenerales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MayooresGeneralesLogic mayooresgeneralesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMayooresGenerales;
	public JScrollPane jScrollPanelDatosEdicionMayooresGenerales;
	public JScrollPane jScrollPanelDatosGeneralMayooresGenerales;
    
	
	
	//public JScrollPane jScrollPanelDatosMayooresGeneralesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMayooresGenerales;
	//public JScrollPane jScrollPanelImportacionMayooresGenerales;
	
	
	
	protected JPanel jPanelAccionesMayooresGenerales;
	
    protected JPanel jPanelPaginacionMayooresGenerales;
    protected JPanel jPanelParametrosReportesMayooresGenerales;
	protected JPanel jPanelParametrosReportesAccionesMayooresGenerales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MayooresGenerales;
	protected JPanel jPanelParametrosAuxiliar2MayooresGenerales;
	protected JPanel jPanelParametrosAuxiliar3MayooresGenerales;
	protected JPanel jPanelParametrosAuxiliar4MayooresGenerales;
	//protected JPanel jPanelParametrosAuxiliar5MayooresGenerales;
	
	
	
	//protected JPanel jPanelReporteDinamicoMayooresGenerales;
	//protected JPanel jPanelImportacionMayooresGenerales;
	
	
	public JTable jTableDatosMayooresGenerales;
	
	
	
	//public JTable jTableDatosMayooresGeneralesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMayooresGenerales;
	protected JButton jButtonDuplicarMayooresGenerales;
	protected JButton jButtonCopiarMayooresGenerales;
	protected JButton jButtonVerFormMayooresGenerales;
	protected JButton jButtonNuevoRelacionesMayooresGenerales;
	protected JButton jButtonModificarMayooresGenerales;
	
    protected JButton jButtonGuardarCambiosTablaMayooresGenerales;
	protected JButton jButtonCerrarMayooresGenerales;
	
	
	protected JButton jButtonRecargarInformacionMayooresGenerales;
	protected JButton jButtonProcesarInformacionMayooresGenerales;
	
	
	protected JButton jButtonAnterioresMayooresGenerales;
	protected JButton jButtonSiguientesMayooresGenerales;
	protected JButton jButtonNuevoGuardarCambiosMayooresGenerales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMayooresGenerales;
	//protected JButton jButtonCerrarReporteDinamicoMayooresGenerales;
	//protected JButton jButtonGenerarExcelReporteDinamicoMayooresGenerales;	
	
	
	
	//protected JButton jButtonAbrirImportacionMayooresGenerales;
	//protected JButton jButtonGenerarImportacionMayooresGenerales;
	//protected JButton jButtonCerrarImportacionMayooresGenerales;
	//protected JFileChooser jFileChooserImportacionMayooresGenerales;
	//protected File fileImportacionMayooresGenerales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMayooresGenerales;
	protected JButton jButtonDuplicarToolBarMayooresGenerales;
	protected JButton jButtonNuevoRelacionesToolBarMayooresGenerales;
	
	
	public JButton jButtonGuardarCambiosToolBarMayooresGenerales;
	protected JButton jButtonCopiarToolBarMayooresGenerales;
	protected JButton jButtonVerFormToolBarMayooresGenerales;
	public JButton jButtonGuardarCambiosTablaToolBarMayooresGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarMayooresGenerales;
	protected JButton jButtonCerrarToolBarMayooresGenerales;
	
	protected JButton jButtonRecargarInformacionToolBarMayooresGenerales;
	protected JButton jButtonProcesarInformacionToolBarMayooresGenerales;
	protected JButton jButtonAnterioresToolBarMayooresGenerales;
	protected JButton jButtonSiguientesToolBarMayooresGenerales;
	protected JButton jButtonNuevoGuardarCambiosToolBarMayooresGenerales;
	protected JButton jButtonAbrirOrderByToolBarMayooresGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMayooresGenerales;
	protected JMenuItem jMenuItemDuplicarMayooresGenerales;
	protected JMenuItem jMenuItemNuevoRelacionesMayooresGenerales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMayooresGenerales;
	protected JMenuItem jMenuItemCopiarMayooresGenerales;
	protected JMenuItem jMenuItemVerFormMayooresGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaMayooresGenerales;
	protected JMenuItem jMenuItemCerrarMayooresGenerales;
	protected JMenuItem jMenuItemDetalleCerrarMayooresGenerales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMayooresGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarMayooresGenerales;
	
	protected JMenuItem jMenuItemRecargarInformacionMayooresGenerales;
	protected JMenuItem jMenuItemProcesarInformacionMayooresGenerales;
	protected JMenuItem jMenuItemAnterioresMayooresGenerales;
	protected JMenuItem jMenuItemSiguientesMayooresGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMayooresGenerales;
	protected JMenuItem jMenuItemAbrirOrderByMayooresGenerales;
	protected JMenuItem jMenuItemMostrarOcultarMayooresGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMayooresGenerales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMayooresGenerales;
	protected JCheckBox jCheckBoxSeleccionadosMayooresGenerales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMayooresGenerales;
	protected JCheckBox jCheckBoxConGraficoReporteMayooresGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMayooresGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMayooresGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMayooresGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMayooresGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMayooresGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMayooresGenerales;
	protected JTextField jTextFieldValorCampoGeneralMayooresGenerales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMayooresGenerales;
	//public JList<Reporte> jListColumnasSelectReporteMayooresGenerales;
	//public JScrollPane jScrollColumnasSelectReporteMayooresGenerales;
	
	//public JLabel jLabelRelacionesSelectReporteMayooresGenerales;
	//public JList<Reporte> jListRelacionesSelectReporteMayooresGenerales;
	//public JScrollPane jScrollRelacionesSelectReporteMayooresGenerales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMayooresGenerales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMayooresGenerales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMayooresGenerales;
	//public JLabel jLabelTiposArchivoReporteDinamicoMayooresGenerales;
	
		
	//public JLabel jLabelArchivoImportacionMayooresGenerales;	
	//public JLabel jLabelPathArchivoImportacionMayooresGenerales;
	//protected JTextField jTextFieldPathArchivoImportacionMayooresGenerales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMayooresGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMayooresGenerales;
	
	//public JLabel jLabelColumnaCategoriaValorMayooresGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMayooresGenerales;
	
	//public JLabel jLabelColumnasValoresGraficoMayooresGenerales;
	//public JList<Reporte> jListColumnasValoresGraficoMayooresGenerales;
	//public JScrollPane jScrollColumnasValoresGraficoMayooresGenerales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMayooresGenerales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMayooresGenerales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMayooresGenerales;
	public JPanel jPanelBusquedaMayooresGeneralesMayooresGenerales;
	public JButton jButtonBusquedaMayooresGeneralesMayooresGenerales;
	
	public JPanel jPanelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales;
	public JLabel jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales;
	public JButton jButtonid_ejercicioBusquedaMayooresGeneralesMayooresGenerales= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaMayooresGeneralesMayooresGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaMayooresGeneralesMayooresGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales;
	public JLabel jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales;
	public JButton jButtonid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaMayooresGeneralesMayooresGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaMayooresGeneralesMayooresGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales;
	public JLabel jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales;
	public JButton jButtonfecha_emision_desdeBusquedaMayooresGeneralesMayooresGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales;
	public JLabel jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales;
	public JButton jButtonfecha_emision_hastaBusquedaMayooresGeneralesMayooresGeneralesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MayooresGeneralesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMayooresGenerales)	{
		this.jButtonRecargarInformacionMayooresGenerales = jButtonRecargarInformacionMayooresGenerales;
	}
	
	public JButton getjButtonProcesarInformacionMayooresGenerales() {
		return this.jButtonProcesarInformacionMayooresGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMayooresGenerales)	{
		this.jButtonProcesarInformacionMayooresGenerales = jButtonProcesarInformacionMayooresGenerales;
	}
	
	
	public JButton getjButtonRecargarInformacionMayooresGenerales() {
		return this.jButtonRecargarInformacionMayooresGenerales;
	}
	
	
	public List<MayooresGenerales> getmayooresgeneraless() {
		return this.mayooresgeneraless;
	}

	public void setmayooresgeneraless(List<MayooresGenerales> mayooresgeneraless) {
		this.mayooresgeneraless = mayooresgeneraless;
	}
	
	public List<MayooresGenerales> getmayooresgeneralessAux() {
		return this.mayooresgeneralessAux;
	}

	public void setmayooresgeneralessAux(List<MayooresGenerales> mayooresgeneralessAux) {
		this.mayooresgeneralessAux = mayooresgeneralessAux;
	}
	
	public List<MayooresGenerales> getmayooresgeneralessEliminados() {
		return this.mayooresgeneralessEliminados;
	}

	public void setMayooresGeneralessEliminados(List<MayooresGenerales> mayooresgeneralessEliminados) {
		this.mayooresgeneralessEliminados = mayooresgeneralessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMayooresGenerales() {
		return jComboBoxTiposSeleccionarMayooresGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMayooresGenerales(
			JComboBox jComboBoxTiposSeleccionarMayooresGenerales) {
		this.jComboBoxTiposSeleccionarMayooresGenerales = jComboBoxTiposSeleccionarMayooresGenerales;
	}
	
	public void setBorderResaltarTiposSeleccionarMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMayooresGenerales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMayooresGenerales() {
		return jTextFieldValorCampoGeneralMayooresGenerales;
	}

	public void setjTextFieldValorCampoGeneralMayooresGenerales(
			JTextField jTextFieldValorCampoGeneralMayooresGenerales) {
		this.jTextFieldValorCampoGeneralMayooresGenerales = jTextFieldValorCampoGeneralMayooresGenerales;
	}

	public void setBorderResaltarValorCampoGeneralMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMayooresGenerales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMayooresGenerales() {
		return this.jCheckBoxSeleccionarTodosMayooresGenerales;
	}

	public void setjCheckBoxSeleccionarTodosMayooresGenerales(
			JCheckBox jCheckBoxSeleccionarTodosMayooresGenerales) {
		this.jCheckBoxSeleccionarTodosMayooresGenerales = jCheckBoxSeleccionarTodosMayooresGenerales;
	}

	public void setBorderResaltarSeleccionarTodosMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMayooresGenerales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMayooresGenerales() {
		return this.jCheckBoxSeleccionadosMayooresGenerales;
	}

	public void setjCheckBoxSeleccionadosMayooresGenerales(
			JCheckBox jCheckBoxSeleccionadosMayooresGenerales) {
		this.jCheckBoxSeleccionadosMayooresGenerales = jCheckBoxSeleccionadosMayooresGenerales;
	}
	
	public void setBorderResaltarSeleccionadosMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMayooresGenerales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMayooresGenerales() {
		return this.jComboBoxTiposArchivosReportesMayooresGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMayooresGenerales(
			JComboBox jComboBoxTiposArchivosReportesMayooresGenerales) {
		this.jComboBoxTiposArchivosReportesMayooresGenerales = jComboBoxTiposArchivosReportesMayooresGenerales;
	}

	public void setBorderResaltarTiposArchivosReportesMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMayooresGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMayooresGenerales() {
		return this.jComboBoxTiposReportesMayooresGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMayooresGenerales(
			JComboBox jComboBoxTiposReportesMayooresGenerales) {
		this.jComboBoxTiposReportesMayooresGenerales = jComboBoxTiposReportesMayooresGenerales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMayooresGenerales() {
	//	return jComboBoxTiposReportesDinamicoMayooresGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMayooresGenerales(
	//		JComboBox jComboBoxTiposReportesDinamicoMayooresGenerales) {
	//	this.jComboBoxTiposReportesDinamicoMayooresGenerales = jComboBoxTiposReportesDinamicoMayooresGenerales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMayooresGenerales() {
	//	return jComboBoxTiposArchivosReportesDinamicoMayooresGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMayooresGenerales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMayooresGenerales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales = jComboBoxTiposArchivosReportesDinamicoMayooresGenerales;
	//}
	
	public void setBorderResaltarTiposReportesMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMayooresGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMayooresGenerales() {
		return this.jComboBoxTiposGraficosReportesMayooresGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMayooresGenerales(
			JComboBox jComboBoxTiposGraficosReportesMayooresGenerales) {
		this.jComboBoxTiposGraficosReportesMayooresGenerales = jComboBoxTiposGraficosReportesMayooresGenerales;
	}
	
	public void setBorderResaltarTiposGraficosReportesMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMayooresGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMayooresGenerales() {
		return this.jComboBoxTiposPaginacionMayooresGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMayooresGenerales(
			JComboBox jComboBoxTiposPaginacionMayooresGenerales) {
		this.jComboBoxTiposPaginacionMayooresGenerales = jComboBoxTiposPaginacionMayooresGenerales;
	}
	
	public void setBorderResaltarTiposPaginacionMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMayooresGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMayooresGenerales() {
		return this.jComboBoxTiposRelacionesMayooresGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMayooresGenerales() {
		return this.jComboBoxTiposAccionesMayooresGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMayooresGenerales(
			JComboBox jComboBoxTiposRelacionesMayooresGenerales) {
		this.jComboBoxTiposRelacionesMayooresGenerales = jComboBoxTiposRelacionesMayooresGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMayooresGenerales(
			JComboBox jComboBoxTiposAccionesMayooresGenerales) {
		this.jComboBoxTiposAccionesMayooresGenerales = jComboBoxTiposAccionesMayooresGenerales;
	}
	
	public void setBorderResaltarTiposRelacionesMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMayooresGenerales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMayooresGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMayooresGenerales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMayooresGenerales() {
	//	return jCheckBoxConGraficoDinamicoMayooresGenerales;
	//}

	//public void setjCheckBoxConGraficoDinamicoMayooresGenerales(
	//		JCheckBox jCheckBoxConGraficoDinamicoMayooresGenerales) {
	//	this.jCheckBoxConGraficoDinamicoMayooresGenerales = jCheckBoxConGraficoDinamicoMayooresGenerales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMayooresGenerales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMayooresGenerales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMayooresGenerales .setBorder(borderResaltar);		
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
		this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
		
		this.mayooresgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mayooresgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mayooresgeneralesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MayooresGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mayores Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
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
		
		MayooresGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMayooresGenerales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"nuevo","nuevo","Nuevo"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"duplicar","duplicar","Duplicar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"copiar","copiar","Copiar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"ver_form","ver_form","Ver"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"recargar","recargar","Buscar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMayooresGenerales,this.jTtoolBarMayooresGenerales,
							"cerrar","cerrar","Salir"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMayooresGenerales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMayooresGenerales;
			
				this.jButtonProcesarInformacionToolBarMayooresGenerales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMayooresGenerales;
				
		//protected JButton jButtonModificarToolBarMayooresGenerales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMayooresGenerales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMayooresGenerales=new JMenuMe("General");
		this.jmenuArchivoMayooresGenerales=new JMenuMe("Archivo");
		this.jmenuAccionesMayooresGenerales=new JMenuMe("Acciones");
		this.jmenuDatosMayooresGenerales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMayooresGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMayooresGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMayooresGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMayooresGenerales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMayooresGenerales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMayooresGenerales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMayooresGenerales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMayooresGenerales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMayooresGenerales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMayooresGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMayooresGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMayooresGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMayooresGenerales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMayooresGenerales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMayooresGenerales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMayooresGenerales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMayooresGenerales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMayooresGenerales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMayooresGenerales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMayooresGenerales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMayooresGenerales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMayooresGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMayooresGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMayooresGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMayooresGenerales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMayooresGenerales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMayooresGenerales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMayooresGenerales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMayooresGenerales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMayooresGenerales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMayooresGenerales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMayooresGenerales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMayooresGenerales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMayooresGenerales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMayooresGenerales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMayooresGenerales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMayooresGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMayooresGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMayooresGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMayooresGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMayooresGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMayooresGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMayooresGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMayooresGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMayooresGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMayooresGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMayooresGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMayooresGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMayooresGenerales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMayooresGenerales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMayooresGenerales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMayooresGenerales.add(this.jMenuItemCerrarMayooresGenerales);
			
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemNuevoMayooresGenerales);
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemNuevoGuardarCambiosMayooresGenerales);
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemNuevoRelacionesMayooresGenerales);
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemGuardarCambiosTablaMayooresGenerales);		
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemDuplicarMayooresGenerales);		
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemCopiarMayooresGenerales);		
			this.jmenuAccionesMayooresGenerales.add(this.jMenuItemVerFormMayooresGenerales);		
			
			this.jmenuDatosMayooresGenerales.add(this.jMenuItemRecargarInformacionMayooresGenerales);				
			this.jmenuDatosMayooresGenerales.add(this.jMenuItemAnterioresMayooresGenerales);				
			this.jmenuDatosMayooresGenerales.add(this.jMenuItemSiguientesMayooresGenerales);				
			this.jmenuDatosMayooresGenerales.add(this.jMenuItemAbrirOrderByMayooresGenerales);				
			this.jmenuDatosMayooresGenerales.add(this.jMenuItemMostrarOcultarMayooresGenerales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMayooresGenerales.add(this.jMenuItemGuardarCambiosMayooresGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMayooresGenerales.add(this.jmenuArchivoMayooresGenerales);		
			this.jmenuBarMayooresGenerales.add(this.jmenuAccionesMayooresGenerales);		
			this.jmenuBarMayooresGenerales.add(this.jmenuDatosMayooresGenerales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMayooresGenerales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMayooresGenerales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaMayooresGeneralesMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Buscar Por Ejercicio Por Cuenta Contable Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaMayooresGeneralesMayooresGenerales= new JButtonMe();
		this.jButtonBusquedaMayooresGeneralesMayooresGenerales.setText("Buscar");
		this.jButtonBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Buscar Por Ejercicio Por Cuenta Contable Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaMayooresGeneralesMayooresGenerales,"buscar_button","Buscar Por Ejercicio Por Cuenta Contable Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaMayooresGeneralesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales = new JLabelMe();
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales = new JLabelMe();
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setText("Cuenta Contable :");
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales= new JComboBoxMe();
		jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasMayooresGenerales=new JTabbedPane();


		this.jTabbedPaneBusquedasMayooresGenerales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasMayooresGenerales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasMayooresGenerales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMayooresGenerales = new MayooresGeneralesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mayores Generales DATOS");
			this.jInternalFrameDetalleFormMayooresGenerales = new MayooresGeneralesDetalleFormJInternalFrame(jDesktopPane,this.mayooresgeneralesSessionBean.getConGuardarRelaciones(),this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMayooresGenerales = null;//new MayooresGeneralesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMayooresGenerales= new GridBagLayout();
		
		
		this.jTableDatosMayooresGenerales = new JTableMe();      
		
		String sToolTipMayooresGenerales="";
		sToolTipMayooresGenerales=MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMayooresGenerales+="(Contabilidad.MayooresGenerales)";
		}
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipMayooresGenerales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMayooresGenerales.setToolTipText(sToolTipMayooresGenerales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMayooresGenerales);
		this.jTableDatosMayooresGenerales.setAutoCreateRowSorter(true);
		this.jTableDatosMayooresGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMayooresGenerales.setRowSelectionAllowed(true);
		this.jTableDatosMayooresGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMayooresGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMayooresGenerales = new JButtonMe();
		this.jButtonDuplicarMayooresGenerales = new JButtonMe();
		this.jButtonCopiarMayooresGenerales = new JButtonMe();
		this.jButtonVerFormMayooresGenerales = new JButtonMe();
		this.jButtonNuevoRelacionesMayooresGenerales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMayooresGenerales = new JButtonMe();
		this.jButtonCerrarMayooresGenerales = new JButtonMe();
		
		this.jScrollPanelDatosMayooresGenerales = new JScrollPane();   
        this.jScrollPanelDatosGeneralMayooresGenerales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mayores Generales";
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMayooresGenerales.setToolTipText("Acciones");
        this.jPanelAccionesMayooresGenerales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMayooresGenerales=new ReporteDinamicoJInternalFrame(MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMayooresGenerales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMayooresGenerales=new ImportacionJInternalFrame(MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMayooresGenerales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMayooresGenerales = new JButtonMe();
		
		this.jButtonAbrirOrderByMayooresGenerales.setText("Orden");
		this.jButtonAbrirOrderByMayooresGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMayooresGenerales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMayooresGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMayooresGenerales,false,this);
			
			//this.cargarOrderByMayooresGenerales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMayooresGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMayooresGenerales,true,this);
			
			//this.cargarOrderByMayooresGenerales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMayooresGenerales.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosMayooresGenerales.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosMayooresGenerales.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosMayooresGenerales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMayooresGenerales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMayooresGenerales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMayooresGenerales.setText("Nuevo");
		this.jButtonDuplicarMayooresGenerales.setText("Duplicar");
		this.jButtonCopiarMayooresGenerales.setText("Copiar");
		this.jButtonVerFormMayooresGenerales.setText("Ver");
		this.jButtonNuevoRelacionesMayooresGenerales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.setText("Guardar");
		this.jButtonCerrarMayooresGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMayooresGenerales,"nuevo_button","Nuevo",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMayooresGenerales,"duplicar_button","Duplicar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMayooresGenerales,"copiar_button","Copiar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMayooresGenerales,"ver_form","Ver",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMayooresGenerales,"nuevorelaciones_button","Nuevo Rel",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMayooresGenerales,"guardarcambiostabla_button","Guardar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMayooresGenerales,"cerrar_button","Salir",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMayooresGenerales.setToolTipText("Nuevo"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMayooresGenerales.setToolTipText("Duplicar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMayooresGenerales.setToolTipText("Copiar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMayooresGenerales.setToolTipText("Ver"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMayooresGenerales.setToolTipText("Nuevo Rel"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.setToolTipText("Guardar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMayooresGenerales.setToolTipText("Salir"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMayooresGenerales";
		inputMap = this.jButtonNuevoMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMayooresGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMayooresGenerales"));
		
		//DUPLICAR
		sMapKey = "DuplicarMayooresGenerales";
		inputMap = this.jButtonDuplicarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMayooresGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMayooresGenerales"));
		
		//COPIAR
		sMapKey = "CopiarMayooresGenerales";
		inputMap = this.jButtonCopiarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMayooresGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMayooresGenerales"));
		
		//VEr FORM
		sMapKey = "VerFormMayooresGenerales";
		inputMap = this.jButtonVerFormMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMayooresGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMayooresGenerales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMayooresGenerales";
		inputMap = this.jButtonNuevoRelacionesMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMayooresGenerales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMayooresGenerales";
		inputMap = this.jButtonModificarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMayooresGenerales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMayooresGenerales";
		inputMap = this.jButtonCerrarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMayooresGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMayooresGenerales";
		inputMap = this.jButtonGuardarCambiosTablaMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMayooresGenerales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMayooresGenerales.setName("jPanelParametrosReportesMayooresGenerales"); 
		
		this.jPanelParametrosReportesAccionesMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMayooresGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMayooresGenerales.setName("jPanelParametrosReportesAccionesMayooresGenerales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMayooresGenerales = new JButtonMe();
		this.jButtonRecargarInformacionMayooresGenerales.setText("Buscar");
		this.jButtonRecargarInformacionMayooresGenerales.setToolTipText("Buscar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMayooresGenerales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionMayooresGenerales.setVisible(false);
		
		
		this.jButtonProcesarInformacionMayooresGenerales = new JButtonMe();
		this.jButtonProcesarInformacionMayooresGenerales.setText("Procesar");
		this.jButtonProcesarInformacionMayooresGenerales.setToolTipText("Procesar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMayooresGenerales.setVisible(false);
			
		this.jButtonProcesarInformacionMayooresGenerales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMayooresGenerales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMayooresGenerales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMayooresGenerales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMayooresGenerales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMayooresGenerales.setText("TIPO");       
		this.jComboBoxTiposReportesMayooresGenerales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMayooresGenerales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMayooresGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMayooresGenerales.setText("Paginacion");
		this.jComboBoxTiposPaginacionMayooresGenerales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMayooresGenerales.setText("Accion");
		this.jComboBoxTiposRelacionesMayooresGenerales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMayooresGenerales.setText("Accion");
		this.jComboBoxTiposAccionesMayooresGenerales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMayooresGenerales.setText("Accion");
		this.jComboBoxTiposSeleccionarMayooresGenerales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMayooresGenerales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMayooresGenerales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMayooresGenerales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMayooresGenerales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMayooresGenerales = new JLabelMe();
		
		this.jLabelAccionesMayooresGenerales.setText("Acciones");		
		this.jLabelAccionesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMayooresGenerales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMayooresGenerales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMayooresGenerales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMayooresGenerales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMayooresGenerales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMayooresGenerales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMayooresGenerales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMayooresGenerales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMayooresGenerales.setText("Graf.");
		this.jCheckBoxConGraficoReporteMayooresGenerales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMayooresGenerales = new JButtonMe();
		//this.jButtonAnterioresMayooresGenerales.setText("<<");
        this.jButtonAnterioresMayooresGenerales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMayooresGenerales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMayooresGenerales = new JButtonMe();
		//this.jButtonSiguientesMayooresGenerales.setText(">>");
        this.jButtonSiguientesMayooresGenerales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMayooresGenerales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMayooresGenerales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMayooresGenerales.setText("Nue");
        this.jButtonNuevoGuardarCambiosMayooresGenerales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMayooresGenerales,"nuevoguardarcambios_button","Nue",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMayooresGenerales";
		inputMap = this.jButtonNuevoGuardarCambiosMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMayooresGenerales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMayooresGenerales";
		inputMap = this.jButtonRecargarInformacionMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMayooresGenerales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMayooresGenerales";
		inputMap = this.jButtonSiguientesMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMayooresGenerales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMayooresGenerales";
		inputMap = this.jButtonAnterioresMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMayooresGenerales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMayooresGenerales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMayooresGenerales.setMinimumSize(new Dimension(this.getWidth(),MayooresGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MayooresGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMayooresGenerales.setMaximumSize(new Dimension(this.getWidth(),MayooresGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MayooresGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMayooresGenerales.setPreferredSize(new Dimension(this.getWidth(),MayooresGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MayooresGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMayooresGenerales = new GridBagLayout();

			this.jPanelPaginacionMayooresGenerales.setLayout(gridaBagLayoutPaginacionMayooresGenerales);						
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 0;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonAnterioresMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					
						
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMayooresGenerales.gridy = 0;
			
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonNuevoGuardarCambiosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
						
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMayooresGenerales.gridy = 0;
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonSiguientesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 1;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonNuevoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
						
			
			
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
				this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMayooresGenerales.gridy = 1;
				this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMayooresGenerales.add(this.jButtonGuardarCambiosTablaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			}
			
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 1;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonDuplicarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 1;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonCopiarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 1;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonVerFormMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 1;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMayooresGenerales.add(this.jButtonCerrarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		
		this.jButtonRecargarInformacionMayooresGenerales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMayooresGenerales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMayooresGenerales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMayooresGenerales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMayooresGenerales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMayooresGenerales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMayooresGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMayooresGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMayooresGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMayooresGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMayooresGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMayooresGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMayooresGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMayooresGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMayooresGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMayooresGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMayooresGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMayooresGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMayooresGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMayooresGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMayooresGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMayooresGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMayooresGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMayooresGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMayooresGenerales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMayooresGenerales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMayooresGenerales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMayooresGenerales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMayooresGenerales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMayooresGenerales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMayooresGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMayooresGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMayooresGenerales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMayooresGenerales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMayooresGenerales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMayooresGenerales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMayooresGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMayooresGenerales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MayooresGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MayooresGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MayooresGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MayooresGenerales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMayooresGenerales.setLayout(gridaBagParametrosReportesMayooresGenerales);
			this.jPanelParametrosReportesAccionesMayooresGenerales.setLayout(gridaBagParametrosReportesAccionesMayooresGenerales);
			
			
			this.jPanelParametrosAuxiliar1MayooresGenerales.setLayout(gridaBagParametrosAuxiliar1MayooresGenerales);
			this.jPanelParametrosAuxiliar2MayooresGenerales.setLayout(gridaBagParametrosAuxiliar2MayooresGenerales);
			this.jPanelParametrosAuxiliar3MayooresGenerales.setLayout(gridaBagParametrosAuxiliar3MayooresGenerales);
			this.jPanelParametrosAuxiliar4MayooresGenerales.setLayout(gridaBagParametrosAuxiliar4MayooresGenerales);
			//this.jPanelParametrosAuxiliar5MayooresGenerales.setLayout(gridaBagParametrosAuxiliar2MayooresGenerales);			
			
			
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMayooresGenerales.add(this.jButtonRecargarInformacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MayooresGenerales.add(this.jComboBoxTiposPaginacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MayooresGenerales.add(this.jCheckBoxConAltoMaximoTablaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MayooresGenerales.add(this.jComboBoxTiposArchivosReportesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMayooresGenerales.add(this.jPanelParametrosAuxiliar1MayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MayooresGenerales.add(this.jComboBoxTiposReportesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);																		
			
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MayooresGenerales.add(this.jComboBoxTiposGraficosReportesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMayooresGenerales.add(this.jPanelParametrosAuxiliar4MayooresGenerales, this.gridBagConstraintsMayooresGenerales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMayooresGenerales.add(this.jComboBoxTiposReportesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMayooresGenerales.add(this.jCheckBoxGenerarReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMayooresGenerales.add(this.jPanelParametrosAuxiliar2MayooresGenerales, this.gridBagConstraintsMayooresGenerales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMayooresGenerales.add(this.jLabelAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
				this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMayooresGenerales.add(this.jButtonAbrirOrderByMayooresGenerales, this.gridBagConstraintsMayooresGenerales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMayooresGenerales.add(this.jComboBoxTiposSeleccionarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
			
			
			/*
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMayooresGenerales.add(this.jCheckBoxSeleccionarTodosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMayooresGenerales.add(this.jCheckBoxConGraficoReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MayooresGenerales.add(this.jCheckBoxSeleccionarTodosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);															
				
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MayooresGenerales.add(this.jCheckBoxSeleccionadosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);															
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMayooresGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MayooresGenerales.add(this.jCheckBoxConGraficoReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMayooresGenerales.add(this.jPanelParametrosAuxiliar3MayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMayooresGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMayooresGenerales.add(this.jComboBoxTiposAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMayooresGenerales = new GridBagLayout();

			this.jScrollPanelDatosMayooresGenerales.setLayout(gridaBagLayoutDatosMayooresGenerales);
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = 0;
			this.gridBagConstraintsMayooresGenerales.gridx = 0;
			
			this.jScrollPanelDatosMayooresGenerales.add(this.jTableDatosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMayooresGenerales.setViewportView(this.jTableDatosMayooresGenerales);
		this.jTableDatosMayooresGenerales.setFillsViewportHeight(true);
		this.jTableDatosMayooresGenerales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMayooresGenerales= new GridBagLayout();
		this.jPanelAccionesMayooresGenerales.setLayout(gridaBagLayoutAccionesMayooresGenerales);
		
		
		/*	
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
			
		this.jPanelAccionesMayooresGenerales.add(this.jButtonNuevoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales= new GridBagLayout();
		gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaMayooresGeneralesMayooresGenerales.setLayout(gridaBagLayoutBusquedaMayooresGeneralesMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 0;
		gridBagConstraintsMayooresGenerales.gridx = 0;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jLabelid_ejercicioBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 0;
		gridBagConstraintsMayooresGenerales.gridx = 1;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);


		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 1;
		gridBagConstraintsMayooresGenerales.gridx = 0;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jLabelid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 1;
		gridBagConstraintsMayooresGenerales.gridx = 1;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);


		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 2;
		gridBagConstraintsMayooresGenerales.gridx = 0;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jLabelfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 2;
		gridBagConstraintsMayooresGenerales.gridx = 1;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);


		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 3;
		gridBagConstraintsMayooresGenerales.gridx = 0;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jLabelfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 3;
		gridBagConstraintsMayooresGenerales.gridx = 1;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMayooresGenerales.gridy = 4;
		gridBagConstraintsMayooresGenerales.gridx =1;
		jPanelBusquedaMayooresGeneralesMayooresGenerales.add(jButtonBusquedaMayooresGeneralesMayooresGenerales, gridBagConstraintsMayooresGenerales);

		jTabbedPaneBusquedasMayooresGenerales.addTab("1.-Por Ejercicio Por Cuenta Contable Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaMayooresGeneralesMayooresGenerales);
		jTabbedPaneBusquedasMayooresGenerales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMayooresGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMayooresGenerales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();						
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMayooresGenerales.gridx = 0;		
			//this.gridBagConstraintsMayooresGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMayooresGenerales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMayooresGenerales.gridx = 0;		
		//this.gridBagConstraintsMayooresGenerales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMayooresGenerales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMayooresGenerales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMayooresGenerales.gridx = 0;		
			this.gridBagConstraintsMayooresGenerales.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMayooresGenerales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMayooresGenerales, this.gridBagConstraintsMayooresGenerales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);								
		
		
		/*
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		*/		
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMayooresGenerales.gridx =0;
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMayooresGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
				
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMayooresGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMayooresGenerales = new GridBagLayout();
			this.jPanelBusquedasParametrosMayooresGenerales.setLayout(gridaBagLayoutBusquedasParametrosMayooresGenerales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMayooresGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMayooresGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMayooresGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMayooresGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMayooresGenerales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMayooresGenerales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMayooresGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMayooresGenerales.setName("jPanelReporteDinamicoMayooresGenerales"); 
		
		this.jPanelReporteDinamicoMayooresGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMayooresGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMayooresGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMayooresGenerales.setLayout(gridaBagLayoutReporteDinamicoMayooresGenerales);
		
		
		this.jInternalFrameReporteDinamicoMayooresGenerales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMayooresGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMayooresGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMayooresGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMayooresGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMayooresGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMayooresGenerales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMayooresGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMayooresGenerales.setResizable(true);
	    this.jInternalFrameReporteDinamicoMayooresGenerales.setClosable(true);
	    this.jInternalFrameReporteDinamicoMayooresGenerales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMayooresGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMayooresGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMayooresGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMayooresGenerales = new JLabelMe();

		this.jLabelColumnasSelectReporteMayooresGenerales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelColumnasSelectReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMayooresGenerales = new JList<Reporte>();
		this.jListColumnasSelectReporteMayooresGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMayooresGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMayooresGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMayooresGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMayooresGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMayooresGenerales=new JScrollPane(this.jListColumnasSelectReporteMayooresGenerales);
			
			this.jScrollColumnasSelectReporteMayooresGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMayooresGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMayooresGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMayooresGenerales.add(this.jListColumnasSelectReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jScrollColumnasSelectReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMayooresGenerales = new JLabelMe();

		this.jLabelRelacionesSelectReporteMayooresGenerales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMayooresGenerales = new JList<Reporte>();
		this.jListRelacionesSelectReporteMayooresGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMayooresGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMayooresGenerales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMayooresGenerales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMayooresGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMayooresGenerales=new JScrollPane(this.jListRelacionesSelectReporteMayooresGenerales);
			
			this.jScrollRelacionesSelectReporteMayooresGenerales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMayooresGenerales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMayooresGenerales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMayooresGenerales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMayooresGenerales = new JComboBoxMe();
		this.jListColumnasValoresGraficoMayooresGenerales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMayooresGenerales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMayooresGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMayooresGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMayooresGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMayooresGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMayooresGenerales = new JLabelMe();

		this.jLabelConGraficoDinamicoMayooresGenerales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelConGraficoDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMayooresGenerales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMayooresGenerales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMayooresGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMayooresGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMayooresGenerales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jCheckBoxConGraficoDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMayooresGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMayooresGenerales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelColumnaCategoriaGraficoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jComboBoxColumnaCategoriaGraficoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMayooresGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaValorMayooresGenerales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelColumnaCategoriaValorMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMayooresGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMayooresGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMayooresGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMayooresGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMayooresGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jComboBoxColumnaCategoriaValorMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMayooresGenerales = new JLabelMe();

		this.jLabelColumnasValoresGraficoMayooresGenerales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelColumnasValoresGraficoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMayooresGenerales = new JList<Reporte>();
		this.jListColumnasValoresGraficoMayooresGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMayooresGenerales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMayooresGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMayooresGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMayooresGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMayooresGenerales=new JScrollPane(this.jListColumnasValoresGraficoMayooresGenerales);
			
			this.jScrollColumnasValoresGraficoMayooresGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMayooresGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMayooresGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMayooresGenerales.add(this.jListColumnasSelectReporteMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jScrollColumnasValoresGraficoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMayooresGenerales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMayooresGenerales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelTiposGraficosReportesDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMayooresGenerales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jComboBoxTiposGraficosReportesDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMayooresGenerales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMayooresGenerales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelGenerarExcelReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMayooresGenerales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMayooresGenerales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMayooresGenerales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMayooresGenerales.setToolTipText("Generar EXCEL"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMayooresGenerales.add(this.jButtonGenerarExcelReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jComboBoxTiposReportesDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMayooresGenerales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMayooresGenerales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jLabelTiposArchivoReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jComboBoxTiposArchivosReportesDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMayooresGenerales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMayooresGenerales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMayooresGenerales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMayooresGenerales.setToolTipText("Generar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jButtonGenerarReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMayooresGenerales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMayooresGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMayooresGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMayooresGenerales.setToolTipText("Cancelar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMayooresGenerales.add(this.jButtonCerrarReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMayooresGenerales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMayooresGenerales= new JScrollPane(jPanelReporteDinamicoMayooresGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMayooresGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMayooresGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMayooresGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMayooresGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMayooresGenerales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMayooresGenerales);
		this.jInternalFrameReporteDinamicoMayooresGenerales.getContentPane().add(this.jScrollPanelReporteDinamicoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMayooresGenerales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMayooresGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMayooresGenerales.setName("jPanelImportacionMayooresGenerales"); 
		
		this.jPanelImportacionMayooresGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMayooresGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMayooresGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMayooresGenerales.setLayout(gridaBagLayoutImportacionMayooresGenerales);
		
		
		this.jInternalFrameImportacionMayooresGenerales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMayooresGenerales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMayooresGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMayooresGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMayooresGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMayooresGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMayooresGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMayooresGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMayooresGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMayooresGenerales.setResizable(true);
	    this.jInternalFrameImportacionMayooresGenerales.setClosable(true);
	    this.jInternalFrameImportacionMayooresGenerales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMayooresGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMayooresGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMayooresGenerales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMayooresGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMayooresGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMayooresGenerales.setResizable(true);
	    this.jInternalFrameImportacionMayooresGenerales.setClosable(true);
	    this.jInternalFrameImportacionMayooresGenerales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMayooresGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMayooresGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMayooresGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMayooresGenerales = new JLabelMe();

		this.jLabelArchivoImportacionMayooresGenerales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMayooresGenerales.add(this.jLabelArchivoImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMayooresGenerales = new JFileChooser();		
		this.jFileChooserImportacionMayooresGenerales.setToolTipText("ESCOGER ARCHIVO"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMayooresGenerales = new JButtonMe();
		this.jButtonAbrirImportacionMayooresGenerales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMayooresGenerales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMayooresGenerales.setToolTipText("Generar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMayooresGenerales.add(this.jButtonAbrirImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMayooresGenerales = new JLabelMe();

		this.jLabelPathArchivoImportacionMayooresGenerales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMayooresGenerales.add(this.jLabelPathArchivoImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMayooresGenerales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMayooresGenerales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMayooresGenerales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMayooresGenerales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMayooresGenerales.add(this.jTextFieldPathArchivoImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMayooresGenerales = new JButtonMe();
		this.jButtonGenerarImportacionMayooresGenerales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMayooresGenerales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMayooresGenerales.setToolTipText("Generar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMayooresGenerales.add(this.jButtonGenerarImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMayooresGenerales = new JButtonMe();
		this.jButtonCerrarImportacionMayooresGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMayooresGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMayooresGenerales.setToolTipText("Cancelar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMayooresGenerales.add(this.jButtonCerrarImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMayooresGenerales = new GridBagLayout();
		
		this.jScrollPanelImportacionMayooresGenerales= new JScrollPane(jPanelImportacionMayooresGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iPosYImportacion;
		this.gridBagConstraintsMayooresGenerales.gridx =iPosXImportacion;
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMayooresGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMayooresGenerales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMayooresGenerales);
		this.jInternalFrameImportacionMayooresGenerales.getContentPane().add(this.jScrollPanelImportacionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMayooresGenerales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMayooresGenerales = new JButtonMe();
			this.jButtonAbrirOrderByMayooresGenerales.setText("Orden");
			this.jButtonAbrirOrderByMayooresGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMayooresGenerales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMayooresGenerales";
			inputMap = this.jButtonAbrirOrderByMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMayooresGenerales"));
		
		
			GridBagLayout gridaBagLayoutOrderByMayooresGenerales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMayooresGenerales.setName("jPanelOrderByMayooresGenerales"); 
			
			this.jPanelOrderByMayooresGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMayooresGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMayooresGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMayooresGenerales.setLayout(gridaBagLayoutOrderByMayooresGenerales);
			
			
			this.jTableDatosMayooresGeneralesOrderBy = new JTableMe();        
			this.jTableDatosMayooresGeneralesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMayooresGeneralesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMayooresGeneralesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMayooresGeneralesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMayooresGeneralesOrderBy.setViewportView(this.jTableDatosMayooresGeneralesOrderBy);
			this.jTableDatosMayooresGeneralesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMayooresGeneralesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMayooresGenerales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMayooresGenerales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMayooresGenerales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMayooresGenerales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMayooresGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMayooresGenerales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMayooresGenerales.setTitle("Orden");
			this.jInternalFrameOrderByMayooresGenerales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMayooresGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMayooresGenerales.setResizable(true);
			this.jInternalFrameOrderByMayooresGenerales.setClosable(true);
			this.jInternalFrameOrderByMayooresGenerales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMayooresGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMayooresGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMayooresGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMayooresGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMayooresGenerales.ipady =150;
				
			this.jPanelOrderByMayooresGenerales.add(jScrollPanelDatosMayooresGeneralesOrderBy, this.gridBagConstraintsMayooresGenerales);//this.jTableDatosMayooresGeneralesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMayooresGenerales = new JButtonMe();
			this.jButtonCerrarOrderByMayooresGenerales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMayooresGenerales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMayooresGenerales.setToolTipText("Cancelar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMayooresGenerales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMayooresGenerales.add(this.jButtonCerrarOrderByMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMayooresGenerales = new GridBagLayout();
			
			this.jScrollPanelOrderByMayooresGenerales= new JScrollPane(jPanelOrderByMayooresGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy =iPosYOrderBy;
			this.gridBagConstraintsMayooresGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMayooresGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMayooresGenerales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMayooresGenerales);
			
			this.jInternalFrameOrderByMayooresGenerales.getContentPane().add(this.jScrollPanelOrderByMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
		
		} else {
			this.jButtonAbrirOrderByMayooresGenerales = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.mayooresgeneralesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMayooresGenerales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosMayooresGenerales.getRowHeight();//MayooresGeneralesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMayooresGenerales.isSelected()) {
					iHeightTable=MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMayooresGenerales.isSelected()) {
					iHeightTable=MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MayooresGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMayooresGenerales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMayooresGenerales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMayooresGenerales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMayooresGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMayooresGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMayooresGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMayooresGenerales!=null && this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy()!=null) {
			//if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMayooresGenerales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMayooresGenerales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMayooresGenerales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMayooresGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMayooresGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMayooresGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=mayooresgeneralesLogic.getMayooresGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mayooresgeneraless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MayooresGenerales> TraerMayooresGeneralesBeans(List<MayooresGenerales> mayooresgeneraless,ArrayList<Classe> classes)throws Exception {
		try {
			for(MayooresGenerales mayooresgenerales:mayooresgeneraless) {
					
				if(!(MayooresGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MayooresGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mayooresgenerales.setsDetalleGeneralEntityReporte(MayooresGeneralesConstantesFunciones.getMayooresGeneralesDescripcion(mayooresgenerales));
										
						
					
						
					
				} else  {
							
					//mayooresgenerales.setsDetalleGeneralEntityReporte(mayooresgenerales.getsDetalleGeneralEntityReporte());
										
				}
				
				//mayooresgeneralesbeans.add(mayooresgeneralesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mayooresgeneraless;
    }
	//PARA REPORTES FIN
}
