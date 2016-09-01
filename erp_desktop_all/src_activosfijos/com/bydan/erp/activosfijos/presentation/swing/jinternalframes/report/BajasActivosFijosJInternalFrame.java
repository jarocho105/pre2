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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.BajasActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class BajasActivosFijosJInternalFrame extends BajasActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBajasActivosFijos;
	
	protected JMenuBar jmenuBarBajasActivosFijos;
	
	protected JMenu jmenuBajasActivosFijos;
	protected JMenu jmenuDatosBajasActivosFijos;
	protected JMenu jmenuArchivoBajasActivosFijos;
	protected JMenu jmenuAccionesBajasActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBajasActivosFijos;	
	protected GridBagConstraints gridBagConstraintsBajasActivosFijos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BajasActivosFijosDetalleFormJInternalFrame jInternalFrameDetalleFormBajasActivosFijos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBajasActivosFijos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBajasActivosFijos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public BajasActivosFijosSessionBean bajasactivosfijosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BajasActivosFijos> bajasactivosfijoss;		
	public List<BajasActivosFijos> bajasactivosfijossEliminados;	
	public List<BajasActivosFijos> bajasactivosfijossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBajasActivosFijos;		
	protected JButton jButtonAbrirOrderByBajasActivosFijos;
	
	
	//protected JPanel jPanelOrderByBajasActivosFijos;
	//public JScrollPane jScrollPanelOrderByBajasActivosFijos;	
	//protected JButton jButtonCerrarOrderByBajasActivosFijos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BajasActivosFijosLogic bajasactivosfijosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBajasActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionBajasActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralBajasActivosFijos;
    
	
	
	//public JScrollPane jScrollPanelDatosBajasActivosFijosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBajasActivosFijos;
	//public JScrollPane jScrollPanelImportacionBajasActivosFijos;
	
	
	
	protected JPanel jPanelAccionesBajasActivosFijos;
	
    protected JPanel jPanelPaginacionBajasActivosFijos;
    protected JPanel jPanelParametrosReportesBajasActivosFijos;
	protected JPanel jPanelParametrosReportesAccionesBajasActivosFijos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BajasActivosFijos;
	protected JPanel jPanelParametrosAuxiliar2BajasActivosFijos;
	protected JPanel jPanelParametrosAuxiliar3BajasActivosFijos;
	protected JPanel jPanelParametrosAuxiliar4BajasActivosFijos;
	//protected JPanel jPanelParametrosAuxiliar5BajasActivosFijos;
	
	
	
	//protected JPanel jPanelReporteDinamicoBajasActivosFijos;
	//protected JPanel jPanelImportacionBajasActivosFijos;
	
	
	public JTable jTableDatosBajasActivosFijos;
	
	
	
	//public JTable jTableDatosBajasActivosFijosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBajasActivosFijos;
	protected JButton jButtonDuplicarBajasActivosFijos;
	protected JButton jButtonCopiarBajasActivosFijos;
	protected JButton jButtonVerFormBajasActivosFijos;
	protected JButton jButtonNuevoRelacionesBajasActivosFijos;
	protected JButton jButtonModificarBajasActivosFijos;
	
    protected JButton jButtonGuardarCambiosTablaBajasActivosFijos;
	protected JButton jButtonCerrarBajasActivosFijos;
	
	
	protected JButton jButtonRecargarInformacionBajasActivosFijos;
	protected JButton jButtonProcesarInformacionBajasActivosFijos;
	
	
	protected JButton jButtonAnterioresBajasActivosFijos;
	protected JButton jButtonSiguientesBajasActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosBajasActivosFijos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBajasActivosFijos;
	//protected JButton jButtonCerrarReporteDinamicoBajasActivosFijos;
	//protected JButton jButtonGenerarExcelReporteDinamicoBajasActivosFijos;	
	
	
	
	//protected JButton jButtonAbrirImportacionBajasActivosFijos;
	//protected JButton jButtonGenerarImportacionBajasActivosFijos;
	//protected JButton jButtonCerrarImportacionBajasActivosFijos;
	//protected JFileChooser jFileChooserImportacionBajasActivosFijos;
	//protected File fileImportacionBajasActivosFijos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBajasActivosFijos;
	protected JButton jButtonDuplicarToolBarBajasActivosFijos;
	protected JButton jButtonNuevoRelacionesToolBarBajasActivosFijos;
	
	
	public JButton jButtonGuardarCambiosToolBarBajasActivosFijos;
	protected JButton jButtonCopiarToolBarBajasActivosFijos;
	protected JButton jButtonVerFormToolBarBajasActivosFijos;
	public JButton jButtonGuardarCambiosTablaToolBarBajasActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarBajasActivosFijos;
	protected JButton jButtonCerrarToolBarBajasActivosFijos;
	
	protected JButton jButtonRecargarInformacionToolBarBajasActivosFijos;
	protected JButton jButtonProcesarInformacionToolBarBajasActivosFijos;
	protected JButton jButtonAnterioresToolBarBajasActivosFijos;
	protected JButton jButtonSiguientesToolBarBajasActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosToolBarBajasActivosFijos;
	protected JButton jButtonAbrirOrderByToolBarBajasActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBajasActivosFijos;
	protected JMenuItem jMenuItemDuplicarBajasActivosFijos;
	protected JMenuItem jMenuItemNuevoRelacionesBajasActivosFijos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBajasActivosFijos;
	protected JMenuItem jMenuItemCopiarBajasActivosFijos;
	protected JMenuItem jMenuItemVerFormBajasActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaBajasActivosFijos;
	protected JMenuItem jMenuItemCerrarBajasActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarBajasActivosFijos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBajasActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarBajasActivosFijos;
	
	protected JMenuItem jMenuItemRecargarInformacionBajasActivosFijos;
	protected JMenuItem jMenuItemProcesarInformacionBajasActivosFijos;
	protected JMenuItem jMenuItemAnterioresBajasActivosFijos;
	protected JMenuItem jMenuItemSiguientesBajasActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBajasActivosFijos;
	protected JMenuItem jMenuItemAbrirOrderByBajasActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarBajasActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBajasActivosFijos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBajasActivosFijos;
	protected JCheckBox jCheckBoxSeleccionadosBajasActivosFijos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBajasActivosFijos;
	protected JCheckBox jCheckBoxConGraficoReporteBajasActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBajasActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBajasActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBajasActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBajasActivosFijos;
	protected JTextField jTextFieldValorCampoGeneralBajasActivosFijos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBajasActivosFijos;
	//public JList<Reporte> jListColumnasSelectReporteBajasActivosFijos;
	//public JScrollPane jScrollColumnasSelectReporteBajasActivosFijos;
	
	//public JLabel jLabelRelacionesSelectReporteBajasActivosFijos;
	//public JList<Reporte> jListRelacionesSelectReporteBajasActivosFijos;
	//public JScrollPane jScrollRelacionesSelectReporteBajasActivosFijos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBajasActivosFijos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBajasActivosFijos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBajasActivosFijos;
	//public JLabel jLabelTiposArchivoReporteDinamicoBajasActivosFijos;
	
		
	//public JLabel jLabelArchivoImportacionBajasActivosFijos;	
	//public JLabel jLabelPathArchivoImportacionBajasActivosFijos;
	//protected JTextField jTextFieldPathArchivoImportacionBajasActivosFijos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBajasActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBajasActivosFijos;
	
	//public JLabel jLabelColumnaCategoriaValorBajasActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBajasActivosFijos;
	
	//public JLabel jLabelColumnasValoresGraficoBajasActivosFijos;
	//public JList<Reporte> jListColumnasValoresGraficoBajasActivosFijos;
	//public JScrollPane jScrollColumnasValoresGraficoBajasActivosFijos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBajasActivosFijos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBajasActivosFijos;
	public JPanel jPanelBusquedaBajasActivosFijosBajasActivosFijos;
	public JButton jButtonBusquedaBajasActivosFijosBajasActivosFijos;
	
	public JPanel jPanelIdIdBusquedaBajasActivosFijosBajasActivosFijos;
	public JLabel jLabelidBusquedaBajasActivosFijosBajasActivosFijos;
	public JTextFieldMe jLabelidBajasActivosFijosBusquedaBajasActivosFijos;
	public JButton jButtonidBusquedaBajasActivosFijosBajasActivosFijosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BajasActivosFijosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBajasActivosFijos)	{
		this.jButtonRecargarInformacionBajasActivosFijos = jButtonRecargarInformacionBajasActivosFijos;
	}
	
	public JButton getjButtonProcesarInformacionBajasActivosFijos() {
		return this.jButtonProcesarInformacionBajasActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBajasActivosFijos)	{
		this.jButtonProcesarInformacionBajasActivosFijos = jButtonProcesarInformacionBajasActivosFijos;
	}
	
	
	public JButton getjButtonRecargarInformacionBajasActivosFijos() {
		return this.jButtonRecargarInformacionBajasActivosFijos;
	}
	
	
	public List<BajasActivosFijos> getbajasactivosfijoss() {
		return this.bajasactivosfijoss;
	}

	public void setbajasactivosfijoss(List<BajasActivosFijos> bajasactivosfijoss) {
		this.bajasactivosfijoss = bajasactivosfijoss;
	}
	
	public List<BajasActivosFijos> getbajasactivosfijossAux() {
		return this.bajasactivosfijossAux;
	}

	public void setbajasactivosfijossAux(List<BajasActivosFijos> bajasactivosfijossAux) {
		this.bajasactivosfijossAux = bajasactivosfijossAux;
	}
	
	public List<BajasActivosFijos> getbajasactivosfijossEliminados() {
		return this.bajasactivosfijossEliminados;
	}

	public void setBajasActivosFijossEliminados(List<BajasActivosFijos> bajasactivosfijossEliminados) {
		this.bajasactivosfijossEliminados = bajasactivosfijossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBajasActivosFijos() {
		return jComboBoxTiposSeleccionarBajasActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBajasActivosFijos(
			JComboBox jComboBoxTiposSeleccionarBajasActivosFijos) {
		this.jComboBoxTiposSeleccionarBajasActivosFijos = jComboBoxTiposSeleccionarBajasActivosFijos;
	}
	
	public void setBorderResaltarTiposSeleccionarBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBajasActivosFijos() {
		return jTextFieldValorCampoGeneralBajasActivosFijos;
	}

	public void setjTextFieldValorCampoGeneralBajasActivosFijos(
			JTextField jTextFieldValorCampoGeneralBajasActivosFijos) {
		this.jTextFieldValorCampoGeneralBajasActivosFijos = jTextFieldValorCampoGeneralBajasActivosFijos;
	}

	public void setBorderResaltarValorCampoGeneralBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBajasActivosFijos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBajasActivosFijos() {
		return this.jCheckBoxSeleccionarTodosBajasActivosFijos;
	}

	public void setjCheckBoxSeleccionarTodosBajasActivosFijos(
			JCheckBox jCheckBoxSeleccionarTodosBajasActivosFijos) {
		this.jCheckBoxSeleccionarTodosBajasActivosFijos = jCheckBoxSeleccionarTodosBajasActivosFijos;
	}

	public void setBorderResaltarSeleccionarTodosBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBajasActivosFijos() {
		return this.jCheckBoxSeleccionadosBajasActivosFijos;
	}

	public void setjCheckBoxSeleccionadosBajasActivosFijos(
			JCheckBox jCheckBoxSeleccionadosBajasActivosFijos) {
		this.jCheckBoxSeleccionadosBajasActivosFijos = jCheckBoxSeleccionadosBajasActivosFijos;
	}
	
	public void setBorderResaltarSeleccionadosBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBajasActivosFijos() {
		return this.jComboBoxTiposArchivosReportesBajasActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBajasActivosFijos(
			JComboBox jComboBoxTiposArchivosReportesBajasActivosFijos) {
		this.jComboBoxTiposArchivosReportesBajasActivosFijos = jComboBoxTiposArchivosReportesBajasActivosFijos;
	}

	public void setBorderResaltarTiposArchivosReportesBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBajasActivosFijos() {
		return this.jComboBoxTiposReportesBajasActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBajasActivosFijos(
			JComboBox jComboBoxTiposReportesBajasActivosFijos) {
		this.jComboBoxTiposReportesBajasActivosFijos = jComboBoxTiposReportesBajasActivosFijos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBajasActivosFijos() {
	//	return jComboBoxTiposReportesDinamicoBajasActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBajasActivosFijos(
	//		JComboBox jComboBoxTiposReportesDinamicoBajasActivosFijos) {
	//	this.jComboBoxTiposReportesDinamicoBajasActivosFijos = jComboBoxTiposReportesDinamicoBajasActivosFijos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBajasActivosFijos() {
	//	return jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBajasActivosFijos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos = jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos;
	//}
	
	public void setBorderResaltarTiposReportesBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBajasActivosFijos() {
		return this.jComboBoxTiposGraficosReportesBajasActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBajasActivosFijos(
			JComboBox jComboBoxTiposGraficosReportesBajasActivosFijos) {
		this.jComboBoxTiposGraficosReportesBajasActivosFijos = jComboBoxTiposGraficosReportesBajasActivosFijos;
	}
	
	public void setBorderResaltarTiposGraficosReportesBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBajasActivosFijos() {
		return this.jComboBoxTiposPaginacionBajasActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBajasActivosFijos(
			JComboBox jComboBoxTiposPaginacionBajasActivosFijos) {
		this.jComboBoxTiposPaginacionBajasActivosFijos = jComboBoxTiposPaginacionBajasActivosFijos;
	}
	
	public void setBorderResaltarTiposPaginacionBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBajasActivosFijos() {
		return this.jComboBoxTiposRelacionesBajasActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBajasActivosFijos() {
		return this.jComboBoxTiposAccionesBajasActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBajasActivosFijos(
			JComboBox jComboBoxTiposRelacionesBajasActivosFijos) {
		this.jComboBoxTiposRelacionesBajasActivosFijos = jComboBoxTiposRelacionesBajasActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBajasActivosFijos(
			JComboBox jComboBoxTiposAccionesBajasActivosFijos) {
		this.jComboBoxTiposAccionesBajasActivosFijos = jComboBoxTiposAccionesBajasActivosFijos;
	}
	
	public void setBorderResaltarTiposRelacionesBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBajasActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBajasActivosFijos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBajasActivosFijos() {
	//	return jCheckBoxConGraficoDinamicoBajasActivosFijos;
	//}

	//public void setjCheckBoxConGraficoDinamicoBajasActivosFijos(
	//		JCheckBox jCheckBoxConGraficoDinamicoBajasActivosFijos) {
	//	this.jCheckBoxConGraficoDinamicoBajasActivosFijos = jCheckBoxConGraficoDinamicoBajasActivosFijos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBajasActivosFijos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBajasActivosFijos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBajasActivosFijos .setBorder(borderResaltar);		
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
		this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
		
		this.bajasactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bajasactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bajasactivosfijosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BajasActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bajas Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
		
		BajasActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBajasActivosFijos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"nuevo","nuevo","Nuevo"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"duplicar","duplicar","Duplicar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"copiar","copiar","Copiar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"ver_form","ver_form","Ver"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"recargar","recargar","Buscar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBajasActivosFijos,this.jTtoolBarBajasActivosFijos,
							"cerrar","cerrar","Salir"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBajasActivosFijos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBajasActivosFijos;
			
				this.jButtonProcesarInformacionToolBarBajasActivosFijos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBajasActivosFijos;
				
		//protected JButton jButtonModificarToolBarBajasActivosFijos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBajasActivosFijos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBajasActivosFijos=new JMenuMe("General");
		this.jmenuArchivoBajasActivosFijos=new JMenuMe("Archivo");
		this.jmenuAccionesBajasActivosFijos=new JMenuMe("Acciones");
		this.jmenuDatosBajasActivosFijos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBajasActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBajasActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBajasActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBajasActivosFijos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBajasActivosFijos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBajasActivosFijos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBajasActivosFijos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBajasActivosFijos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBajasActivosFijos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBajasActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBajasActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBajasActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBajasActivosFijos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBajasActivosFijos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBajasActivosFijos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBajasActivosFijos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBajasActivosFijos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBajasActivosFijos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBajasActivosFijos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBajasActivosFijos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBajasActivosFijos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBajasActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBajasActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBajasActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBajasActivosFijos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBajasActivosFijos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBajasActivosFijos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBajasActivosFijos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBajasActivosFijos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBajasActivosFijos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBajasActivosFijos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBajasActivosFijos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBajasActivosFijos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBajasActivosFijos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBajasActivosFijos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBajasActivosFijos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBajasActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBajasActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBajasActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBajasActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBajasActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBajasActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBajasActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBajasActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBajasActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBajasActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBajasActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBajasActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBajasActivosFijos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBajasActivosFijos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBajasActivosFijos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBajasActivosFijos.add(this.jMenuItemCerrarBajasActivosFijos);
			
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemNuevoBajasActivosFijos);
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemNuevoGuardarCambiosBajasActivosFijos);
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemNuevoRelacionesBajasActivosFijos);
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemGuardarCambiosTablaBajasActivosFijos);		
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemDuplicarBajasActivosFijos);		
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemCopiarBajasActivosFijos);		
			this.jmenuAccionesBajasActivosFijos.add(this.jMenuItemVerFormBajasActivosFijos);		
			
			this.jmenuDatosBajasActivosFijos.add(this.jMenuItemRecargarInformacionBajasActivosFijos);				
			this.jmenuDatosBajasActivosFijos.add(this.jMenuItemAnterioresBajasActivosFijos);				
			this.jmenuDatosBajasActivosFijos.add(this.jMenuItemSiguientesBajasActivosFijos);				
			this.jmenuDatosBajasActivosFijos.add(this.jMenuItemAbrirOrderByBajasActivosFijos);				
			this.jmenuDatosBajasActivosFijos.add(this.jMenuItemMostrarOcultarBajasActivosFijos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBajasActivosFijos.add(this.jMenuItemGuardarCambiosBajasActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBajasActivosFijos.add(this.jmenuArchivoBajasActivosFijos);		
			this.jmenuBarBajasActivosFijos.add(this.jmenuAccionesBajasActivosFijos);		
			this.jmenuBarBajasActivosFijos.add(this.jmenuDatosBajasActivosFijos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBajasActivosFijos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBajasActivosFijos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaBajasActivosFijosBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaBajasActivosFijosBajasActivosFijos.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaBajasActivosFijosBajasActivosFijos= new JButtonMe();
		this.jButtonBusquedaBajasActivosFijosBajasActivosFijos.setText("Buscar");
		this.jButtonBusquedaBajasActivosFijosBajasActivosFijos.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaBajasActivosFijosBajasActivosFijos,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaBajasActivosFijosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaBajasActivosFijosBajasActivosFijos = new JLabelMe();
		jLabelidBusquedaBajasActivosFijosBajasActivosFijos.setText("Id :");
		jLabelidBusquedaBajasActivosFijosBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaBajasActivosFijosBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaBajasActivosFijosBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaBajasActivosFijosBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidBajasActivosFijosBusquedaBajasActivosFijos= new JTextFieldMe();
		jLabelidBajasActivosFijosBusquedaBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBajasActivosFijosBusquedaBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBajasActivosFijosBusquedaBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidBajasActivosFijosBusquedaBajasActivosFijos.setVisible(false);




		this.jTabbedPaneBusquedasBajasActivosFijos=new JTabbedPane();


		this.jTabbedPaneBusquedasBajasActivosFijos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBajasActivosFijos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBajasActivosFijos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBajasActivosFijos = new BajasActivosFijosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bajas Activos Fijos DATOS");
			this.jInternalFrameDetalleFormBajasActivosFijos = new BajasActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.bajasactivosfijosSessionBean.getConGuardarRelaciones(),this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBajasActivosFijos = null;//new BajasActivosFijosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBajasActivosFijos= new GridBagLayout();
		
		
		this.jTableDatosBajasActivosFijos = new JTableMe();      
		
		String sToolTipBajasActivosFijos="";
		sToolTipBajasActivosFijos=BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBajasActivosFijos+="(ActivosFijos.BajasActivosFijos)";
		}
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipBajasActivosFijos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBajasActivosFijos.setToolTipText(sToolTipBajasActivosFijos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBajasActivosFijos);
		this.jTableDatosBajasActivosFijos.setAutoCreateRowSorter(true);
		this.jTableDatosBajasActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBajasActivosFijos.setRowSelectionAllowed(true);
		this.jTableDatosBajasActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBajasActivosFijos = new JButtonMe();
		this.jButtonDuplicarBajasActivosFijos = new JButtonMe();
		this.jButtonCopiarBajasActivosFijos = new JButtonMe();
		this.jButtonVerFormBajasActivosFijos = new JButtonMe();
		this.jButtonNuevoRelacionesBajasActivosFijos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos = new JButtonMe();
		this.jButtonCerrarBajasActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosBajasActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosGeneralBajasActivosFijos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Bajas Activos Fijos";
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBajasActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesBajasActivosFijos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBajasActivosFijos=new ReporteDinamicoJInternalFrame(BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBajasActivosFijos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBajasActivosFijos=new ImportacionJInternalFrame(BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBajasActivosFijos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBajasActivosFijos = new JButtonMe();
		
		this.jButtonAbrirOrderByBajasActivosFijos.setText("Orden");
		this.jButtonAbrirOrderByBajasActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBajasActivosFijos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBajasActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBajasActivosFijos,false,this);
			
			//this.cargarOrderByBajasActivosFijos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBajasActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBajasActivosFijos,true,this);
			
			//this.cargarOrderByBajasActivosFijos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBajasActivosFijos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosBajasActivosFijos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosBajasActivosFijos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosBajasActivosFijos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBajasActivosFijos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBajasActivosFijos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBajasActivosFijos.setText("Nuevo");
		this.jButtonDuplicarBajasActivosFijos.setText("Duplicar");
		this.jButtonCopiarBajasActivosFijos.setText("Copiar");
		this.jButtonVerFormBajasActivosFijos.setText("Ver");
		this.jButtonNuevoRelacionesBajasActivosFijos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.setText("Guardar");
		this.jButtonCerrarBajasActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBajasActivosFijos,"nuevo_button","Nuevo",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBajasActivosFijos,"duplicar_button","Duplicar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBajasActivosFijos,"copiar_button","Copiar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBajasActivosFijos,"ver_form","Ver",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBajasActivosFijos,"nuevorelaciones_button","Nuevo Rel",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBajasActivosFijos,"guardarcambiostabla_button","Guardar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBajasActivosFijos,"cerrar_button","Salir",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBajasActivosFijos.setToolTipText("Nuevo"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBajasActivosFijos.setToolTipText("Duplicar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBajasActivosFijos.setToolTipText("Copiar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBajasActivosFijos.setToolTipText("Ver"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBajasActivosFijos.setToolTipText("Nuevo Rel"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.setToolTipText("Guardar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBajasActivosFijos.setToolTipText("Salir"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBajasActivosFijos";
		inputMap = this.jButtonNuevoBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBajasActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBajasActivosFijos"));
		
		//DUPLICAR
		sMapKey = "DuplicarBajasActivosFijos";
		inputMap = this.jButtonDuplicarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBajasActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBajasActivosFijos"));
		
		//COPIAR
		sMapKey = "CopiarBajasActivosFijos";
		inputMap = this.jButtonCopiarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBajasActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBajasActivosFijos"));
		
		//VEr FORM
		sMapKey = "VerFormBajasActivosFijos";
		inputMap = this.jButtonVerFormBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBajasActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBajasActivosFijos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBajasActivosFijos";
		inputMap = this.jButtonNuevoRelacionesBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBajasActivosFijos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBajasActivosFijos";
		inputMap = this.jButtonModificarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBajasActivosFijos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBajasActivosFijos";
		inputMap = this.jButtonCerrarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBajasActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBajasActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBajasActivosFijos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBajasActivosFijos.setName("jPanelParametrosReportesBajasActivosFijos"); 
		
		this.jPanelParametrosReportesAccionesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBajasActivosFijos.setName("jPanelParametrosReportesAccionesBajasActivosFijos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBajasActivosFijos = new JButtonMe();
		this.jButtonRecargarInformacionBajasActivosFijos.setText("Buscar");
		this.jButtonRecargarInformacionBajasActivosFijos.setToolTipText("Buscar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBajasActivosFijos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionBajasActivosFijos.setVisible(false);
		
		
		this.jButtonProcesarInformacionBajasActivosFijos = new JButtonMe();
		this.jButtonProcesarInformacionBajasActivosFijos.setText("Procesar");
		this.jButtonProcesarInformacionBajasActivosFijos.setToolTipText("Procesar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBajasActivosFijos.setVisible(false);
			
		this.jButtonProcesarInformacionBajasActivosFijos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBajasActivosFijos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBajasActivosFijos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBajasActivosFijos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBajasActivosFijos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBajasActivosFijos.setText("TIPO");       
		this.jComboBoxTiposReportesBajasActivosFijos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBajasActivosFijos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBajasActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBajasActivosFijos.setText("Paginacion");
		this.jComboBoxTiposPaginacionBajasActivosFijos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBajasActivosFijos.setText("Accion");
		this.jComboBoxTiposRelacionesBajasActivosFijos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBajasActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesBajasActivosFijos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBajasActivosFijos.setText("Accion");
		this.jComboBoxTiposSeleccionarBajasActivosFijos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBajasActivosFijos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBajasActivosFijos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBajasActivosFijos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBajasActivosFijos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBajasActivosFijos = new JLabelMe();
		
		this.jLabelAccionesBajasActivosFijos.setText("Acciones");		
		this.jLabelAccionesBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBajasActivosFijos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBajasActivosFijos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBajasActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBajasActivosFijos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBajasActivosFijos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBajasActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBajasActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoReporteBajasActivosFijos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBajasActivosFijos = new JButtonMe();
		//this.jButtonAnterioresBajasActivosFijos.setText("<<");
        this.jButtonAnterioresBajasActivosFijos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBajasActivosFijos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBajasActivosFijos = new JButtonMe();
		//this.jButtonSiguientesBajasActivosFijos.setText(">>");
        this.jButtonSiguientesBajasActivosFijos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBajasActivosFijos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBajasActivosFijos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBajasActivosFijos.setText("Nue");
        this.jButtonNuevoGuardarCambiosBajasActivosFijos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBajasActivosFijos,"nuevoguardarcambios_button","Nue",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBajasActivosFijos";
		inputMap = this.jButtonNuevoGuardarCambiosBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBajasActivosFijos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBajasActivosFijos";
		inputMap = this.jButtonRecargarInformacionBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBajasActivosFijos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBajasActivosFijos";
		inputMap = this.jButtonSiguientesBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBajasActivosFijos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBajasActivosFijos";
		inputMap = this.jButtonAnterioresBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBajasActivosFijos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBajasActivosFijos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBajasActivosFijos.setMinimumSize(new Dimension(this.getWidth(),BajasActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BajasActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBajasActivosFijos.setMaximumSize(new Dimension(this.getWidth(),BajasActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BajasActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBajasActivosFijos.setPreferredSize(new Dimension(this.getWidth(),BajasActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BajasActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBajasActivosFijos = new GridBagLayout();

			this.jPanelPaginacionBajasActivosFijos.setLayout(gridaBagLayoutPaginacionBajasActivosFijos);						
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 0;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonAnterioresBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					
						
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBajasActivosFijos.gridy = 0;
			
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonNuevoGuardarCambiosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
						
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBajasActivosFijos.gridy = 0;
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonSiguientesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 1;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonNuevoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
						
			
			
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBajasActivosFijos.gridy = 1;
				this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBajasActivosFijos.add(this.jButtonGuardarCambiosTablaBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			}
			
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 1;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonDuplicarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 1;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonCopiarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 1;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonVerFormBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 1;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBajasActivosFijos.add(this.jButtonCerrarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		
		this.jButtonRecargarInformacionBajasActivosFijos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBajasActivosFijos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBajasActivosFijos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBajasActivosFijos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBajasActivosFijos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBajasActivosFijos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBajasActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBajasActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBajasActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBajasActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBajasActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBajasActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBajasActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBajasActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBajasActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBajasActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBajasActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBajasActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBajasActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBajasActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBajasActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBajasActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBajasActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBajasActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBajasActivosFijos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBajasActivosFijos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBajasActivosFijos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBajasActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBajasActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBajasActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBajasActivosFijos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBajasActivosFijos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBajasActivosFijos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBajasActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBajasActivosFijos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BajasActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BajasActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BajasActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BajasActivosFijos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBajasActivosFijos.setLayout(gridaBagParametrosReportesBajasActivosFijos);
			this.jPanelParametrosReportesAccionesBajasActivosFijos.setLayout(gridaBagParametrosReportesAccionesBajasActivosFijos);
			
			
			this.jPanelParametrosAuxiliar1BajasActivosFijos.setLayout(gridaBagParametrosAuxiliar1BajasActivosFijos);
			this.jPanelParametrosAuxiliar2BajasActivosFijos.setLayout(gridaBagParametrosAuxiliar2BajasActivosFijos);
			this.jPanelParametrosAuxiliar3BajasActivosFijos.setLayout(gridaBagParametrosAuxiliar3BajasActivosFijos);
			this.jPanelParametrosAuxiliar4BajasActivosFijos.setLayout(gridaBagParametrosAuxiliar4BajasActivosFijos);
			//this.jPanelParametrosAuxiliar5BajasActivosFijos.setLayout(gridaBagParametrosAuxiliar2BajasActivosFijos);			
			
			
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jButtonRecargarInformacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BajasActivosFijos.add(this.jComboBoxTiposPaginacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BajasActivosFijos.add(this.jCheckBoxConAltoMaximoTablaBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BajasActivosFijos.add(this.jComboBoxTiposArchivosReportesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jPanelParametrosAuxiliar1BajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BajasActivosFijos.add(this.jComboBoxTiposReportesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);																		
			
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BajasActivosFijos.add(this.jComboBoxTiposGraficosReportesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jPanelParametrosAuxiliar4BajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jComboBoxTiposReportesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jCheckBoxGenerarReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jPanelParametrosAuxiliar2BajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jLabelAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBajasActivosFijos.add(this.jButtonAbrirOrderByBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jComboBoxTiposSeleccionarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
			
			
			/*
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jCheckBoxSeleccionarTodosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jCheckBoxConGraficoReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BajasActivosFijos.add(this.jCheckBoxSeleccionarTodosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);															
				
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BajasActivosFijos.add(this.jCheckBoxSeleccionadosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);															
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBajasActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BajasActivosFijos.add(this.jCheckBoxConGraficoReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jPanelParametrosAuxiliar3BajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBajasActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBajasActivosFijos.add(this.jComboBoxTiposAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBajasActivosFijos = new GridBagLayout();

			this.jScrollPanelDatosBajasActivosFijos.setLayout(gridaBagLayoutDatosBajasActivosFijos);
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = 0;
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;
			
			this.jScrollPanelDatosBajasActivosFijos.add(this.jTableDatosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBajasActivosFijos.setViewportView(this.jTableDatosBajasActivosFijos);
		this.jTableDatosBajasActivosFijos.setFillsViewportHeight(true);
		this.jTableDatosBajasActivosFijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBajasActivosFijos= new GridBagLayout();
		this.jPanelAccionesBajasActivosFijos.setLayout(gridaBagLayoutAccionesBajasActivosFijos);
		
		
		/*	
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
			
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonNuevoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos= new GridBagLayout();
		gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaBajasActivosFijosBajasActivosFijos.setLayout(gridaBagLayoutBusquedaBajasActivosFijosBajasActivosFijos);

		gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBajasActivosFijos.gridy = 0;
		gridBagConstraintsBajasActivosFijos.gridx = 0;
		jPanelBusquedaBajasActivosFijosBajasActivosFijos.add(jLabelidBusquedaBajasActivosFijosBajasActivosFijos, gridBagConstraintsBajasActivosFijos);

		gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBajasActivosFijos.gridy = 0;
		gridBagConstraintsBajasActivosFijos.gridx = 1;
		jPanelBusquedaBajasActivosFijosBajasActivosFijos.add(jLabelidBajasActivosFijosBusquedaBajasActivosFijos, gridBagConstraintsBajasActivosFijos);

		gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBajasActivosFijos.gridy = 1;
		gridBagConstraintsBajasActivosFijos.gridx =1;
		jPanelBusquedaBajasActivosFijosBajasActivosFijos.add(jButtonBusquedaBajasActivosFijosBajasActivosFijos, gridBagConstraintsBajasActivosFijos);

		jTabbedPaneBusquedasBajasActivosFijos.addTab("1.-Por  ", jPanelBusquedaBajasActivosFijosBajasActivosFijos);
		jTabbedPaneBusquedasBajasActivosFijos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBajasActivosFijos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;		
			//this.gridBagConstraintsBajasActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBajasActivosFijos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;		
		//this.gridBagConstraintsBajasActivosFijos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBajasActivosFijos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;		
			this.gridBagConstraintsBajasActivosFijos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBajasActivosFijos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);								
		
		
		/*
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		*/		
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBajasActivosFijos.gridx =0;
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBajasActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
				
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBajasActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBajasActivosFijos = new GridBagLayout();
			this.jPanelBusquedasParametrosBajasActivosFijos.setLayout(gridaBagLayoutBusquedasParametrosBajasActivosFijos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBajasActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBajasActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBajasActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBajasActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBajasActivosFijos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBajasActivosFijos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBajasActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBajasActivosFijos.setName("jPanelReporteDinamicoBajasActivosFijos"); 
		
		this.jPanelReporteDinamicoBajasActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBajasActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBajasActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBajasActivosFijos.setLayout(gridaBagLayoutReporteDinamicoBajasActivosFijos);
		
		
		this.jInternalFrameReporteDinamicoBajasActivosFijos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBajasActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBajasActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBajasActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBajasActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBajasActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBajasActivosFijos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBajasActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBajasActivosFijos.setResizable(true);
	    this.jInternalFrameReporteDinamicoBajasActivosFijos.setClosable(true);
	    this.jInternalFrameReporteDinamicoBajasActivosFijos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBajasActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBajasActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBajasActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBajasActivosFijos = new JLabelMe();

		this.jLabelColumnasSelectReporteBajasActivosFijos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelColumnasSelectReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBajasActivosFijos = new JList<Reporte>();
		this.jListColumnasSelectReporteBajasActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBajasActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBajasActivosFijos=new JScrollPane(this.jListColumnasSelectReporteBajasActivosFijos);
			
			this.jScrollColumnasSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBajasActivosFijos.add(this.jListColumnasSelectReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jScrollColumnasSelectReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBajasActivosFijos = new JLabelMe();

		this.jLabelRelacionesSelectReporteBajasActivosFijos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBajasActivosFijos = new JList<Reporte>();
		this.jListRelacionesSelectReporteBajasActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBajasActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBajasActivosFijos=new JScrollPane(this.jListRelacionesSelectReporteBajasActivosFijos);
			
			this.jScrollRelacionesSelectReporteBajasActivosFijos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBajasActivosFijos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBajasActivosFijos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBajasActivosFijos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos = new JComboBoxMe();
		this.jListColumnasValoresGraficoBajasActivosFijos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBajasActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBajasActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBajasActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBajasActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBajasActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBajasActivosFijos = new JLabelMe();

		this.jLabelConGraficoDinamicoBajasActivosFijos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelConGraficoDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBajasActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBajasActivosFijos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBajasActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBajasActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBajasActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jCheckBoxConGraficoDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBajasActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBajasActivosFijos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelColumnaCategoriaGraficoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBajasActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaValorBajasActivosFijos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelColumnaCategoriaValorBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBajasActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBajasActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBajasActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBajasActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBajasActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jComboBoxColumnaCategoriaValorBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBajasActivosFijos = new JLabelMe();

		this.jLabelColumnasValoresGraficoBajasActivosFijos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelColumnasValoresGraficoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBajasActivosFijos = new JList<Reporte>();
		this.jListColumnasValoresGraficoBajasActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBajasActivosFijos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBajasActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBajasActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBajasActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBajasActivosFijos=new JScrollPane(this.jListColumnasValoresGraficoBajasActivosFijos);
			
			this.jScrollColumnasValoresGraficoBajasActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBajasActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBajasActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBajasActivosFijos.add(this.jListColumnasSelectReporteBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jScrollColumnasValoresGraficoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelTiposGraficosReportesDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBajasActivosFijos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jComboBoxTiposGraficosReportesDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelGenerarExcelReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos.setToolTipText("Generar EXCEL"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBajasActivosFijos.add(this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jComboBoxTiposReportesDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jLabelTiposArchivoReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jComboBoxTiposArchivosReportesDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBajasActivosFijos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBajasActivosFijos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBajasActivosFijos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBajasActivosFijos.setToolTipText("Generar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jButtonGenerarReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBajasActivosFijos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBajasActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBajasActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBajasActivosFijos.setToolTipText("Cancelar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBajasActivosFijos.add(this.jButtonCerrarReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBajasActivosFijos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBajasActivosFijos= new JScrollPane(jPanelReporteDinamicoBajasActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBajasActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBajasActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBajasActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBajasActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBajasActivosFijos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBajasActivosFijos);
		this.jInternalFrameReporteDinamicoBajasActivosFijos.getContentPane().add(this.jScrollPanelReporteDinamicoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBajasActivosFijos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBajasActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBajasActivosFijos.setName("jPanelImportacionBajasActivosFijos"); 
		
		this.jPanelImportacionBajasActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBajasActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBajasActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBajasActivosFijos.setLayout(gridaBagLayoutImportacionBajasActivosFijos);
		
		
		this.jInternalFrameImportacionBajasActivosFijos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBajasActivosFijos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBajasActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBajasActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBajasActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBajasActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBajasActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBajasActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBajasActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBajasActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionBajasActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionBajasActivosFijos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBajasActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBajasActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBajasActivosFijos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBajasActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBajasActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBajasActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionBajasActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionBajasActivosFijos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBajasActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBajasActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBajasActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBajasActivosFijos = new JLabelMe();

		this.jLabelArchivoImportacionBajasActivosFijos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBajasActivosFijos.add(this.jLabelArchivoImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBajasActivosFijos = new JFileChooser();		
		this.jFileChooserImportacionBajasActivosFijos.setToolTipText("ESCOGER ARCHIVO"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBajasActivosFijos = new JButtonMe();
		this.jButtonAbrirImportacionBajasActivosFijos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBajasActivosFijos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBajasActivosFijos.setToolTipText("Generar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBajasActivosFijos.add(this.jButtonAbrirImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBajasActivosFijos = new JLabelMe();

		this.jLabelPathArchivoImportacionBajasActivosFijos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBajasActivosFijos.add(this.jLabelPathArchivoImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBajasActivosFijos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBajasActivosFijos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBajasActivosFijos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBajasActivosFijos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBajasActivosFijos.add(this.jTextFieldPathArchivoImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBajasActivosFijos = new JButtonMe();
		this.jButtonGenerarImportacionBajasActivosFijos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBajasActivosFijos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBajasActivosFijos.setToolTipText("Generar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBajasActivosFijos.add(this.jButtonGenerarImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBajasActivosFijos = new JButtonMe();
		this.jButtonCerrarImportacionBajasActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBajasActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBajasActivosFijos.setToolTipText("Cancelar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBajasActivosFijos.add(this.jButtonCerrarImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBajasActivosFijos = new GridBagLayout();
		
		this.jScrollPanelImportacionBajasActivosFijos= new JScrollPane(jPanelImportacionBajasActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iPosYImportacion;
		this.gridBagConstraintsBajasActivosFijos.gridx =iPosXImportacion;
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBajasActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBajasActivosFijos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBajasActivosFijos);
		this.jInternalFrameImportacionBajasActivosFijos.getContentPane().add(this.jScrollPanelImportacionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBajasActivosFijos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBajasActivosFijos = new JButtonMe();
			this.jButtonAbrirOrderByBajasActivosFijos.setText("Orden");
			this.jButtonAbrirOrderByBajasActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBajasActivosFijos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBajasActivosFijos";
			inputMap = this.jButtonAbrirOrderByBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBajasActivosFijos"));
		
		
			GridBagLayout gridaBagLayoutOrderByBajasActivosFijos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBajasActivosFijos.setName("jPanelOrderByBajasActivosFijos"); 
			
			this.jPanelOrderByBajasActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBajasActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBajasActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBajasActivosFijos.setLayout(gridaBagLayoutOrderByBajasActivosFijos);
			
			
			this.jTableDatosBajasActivosFijosOrderBy = new JTableMe();        
			this.jTableDatosBajasActivosFijosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBajasActivosFijosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBajasActivosFijosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBajasActivosFijosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBajasActivosFijosOrderBy.setViewportView(this.jTableDatosBajasActivosFijosOrderBy);
			this.jTableDatosBajasActivosFijosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBajasActivosFijosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBajasActivosFijos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBajasActivosFijos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBajasActivosFijos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBajasActivosFijos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBajasActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBajasActivosFijos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBajasActivosFijos.setTitle("Orden");
			this.jInternalFrameOrderByBajasActivosFijos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBajasActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBajasActivosFijos.setResizable(true);
			this.jInternalFrameOrderByBajasActivosFijos.setClosable(true);
			this.jInternalFrameOrderByBajasActivosFijos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBajasActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBajasActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBajasActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBajasActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBajasActivosFijos.ipady =150;
				
			this.jPanelOrderByBajasActivosFijos.add(jScrollPanelDatosBajasActivosFijosOrderBy, this.gridBagConstraintsBajasActivosFijos);//this.jTableDatosBajasActivosFijosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBajasActivosFijos = new JButtonMe();
			this.jButtonCerrarOrderByBajasActivosFijos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBajasActivosFijos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBajasActivosFijos.setToolTipText("Cancelar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBajasActivosFijos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBajasActivosFijos.add(this.jButtonCerrarOrderByBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBajasActivosFijos = new GridBagLayout();
			
			this.jScrollPanelOrderByBajasActivosFijos= new JScrollPane(jPanelOrderByBajasActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy =iPosYOrderBy;
			this.gridBagConstraintsBajasActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBajasActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBajasActivosFijos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBajasActivosFijos);
			
			this.jInternalFrameOrderByBajasActivosFijos.getContentPane().add(this.jScrollPanelOrderByBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
		
		} else {
			this.jButtonAbrirOrderByBajasActivosFijos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.bajasactivosfijosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosBajasActivosFijos.getRowHeight();//BajasActivosFijosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.isSelected()) {
					iHeightTable=BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBajasActivosFijos.isSelected()) {
					iHeightTable=BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BajasActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBajasActivosFijos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBajasActivosFijos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBajasActivosFijos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBajasActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBajasActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBajasActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBajasActivosFijos!=null && this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy()!=null) {
			//if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBajasActivosFijos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBajasActivosFijos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBajasActivosFijos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBajasActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBajasActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBajasActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=bajasactivosfijosLogic.getBajasActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bajasactivosfijoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BajasActivosFijos> TraerBajasActivosFijosBeans(List<BajasActivosFijos> bajasactivosfijoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(BajasActivosFijos bajasactivosfijos:bajasactivosfijoss) {
					
				if(!(BajasActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BajasActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bajasactivosfijos.setsDetalleGeneralEntityReporte(BajasActivosFijosConstantesFunciones.getBajasActivosFijosDescripcion(bajasactivosfijos));
										
						
					
						
					
				} else  {
							
					//bajasactivosfijos.setsDetalleGeneralEntityReporte(bajasactivosfijos.getsDetalleGeneralEntityReporte());
										
				}
				
				//bajasactivosfijosbeans.add(bajasactivosfijosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bajasactivosfijoss;
    }
	//PARA REPORTES FIN
}
