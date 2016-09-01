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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesDetalladosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesDetalladosJInternalFrame extends CobrarClientesDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesDetallados;
	
	protected JMenuBar jmenuBarCobrarClientesDetallados;
	
	protected JMenu jmenuCobrarClientesDetallados;
	protected JMenu jmenuDatosCobrarClientesDetallados;
	protected JMenu jmenuArchivoCobrarClientesDetallados;
	protected JMenu jmenuAccionesCobrarClientesDetallados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesDetallados;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesDetallados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesDetallados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesDetallados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesDetallados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarClientesDetalladosSessionBean cobrarclientesdetalladosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesDetallados> cobrarclientesdetalladoss;		
	public List<CobrarClientesDetallados> cobrarclientesdetalladossEliminados;	
	public List<CobrarClientesDetallados> cobrarclientesdetalladossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesDetallados;		
	protected JButton jButtonAbrirOrderByCobrarClientesDetallados;
	
	
	//protected JPanel jPanelOrderByCobrarClientesDetallados;
	//public JScrollPane jScrollPanelOrderByCobrarClientesDetallados;	
	//protected JButton jButtonCerrarOrderByCobrarClientesDetallados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesDetalladosLogic cobrarclientesdetalladosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesDetallados;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesDetallados;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesDetallados;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesDetalladosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesDetallados;
	//public JScrollPane jScrollPanelImportacionCobrarClientesDetallados;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesDetallados;
	
    protected JPanel jPanelPaginacionCobrarClientesDetallados;
    protected JPanel jPanelParametrosReportesCobrarClientesDetallados;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesDetallados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesDetallados;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesDetallados;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesDetallados;
	//protected JPanel jPanelImportacionCobrarClientesDetallados;
	
	
	public JTable jTableDatosCobrarClientesDetallados;
	
	
	
	//public JTable jTableDatosCobrarClientesDetalladosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesDetallados;
	protected JButton jButtonDuplicarCobrarClientesDetallados;
	protected JButton jButtonCopiarCobrarClientesDetallados;
	protected JButton jButtonVerFormCobrarClientesDetallados;
	protected JButton jButtonNuevoRelacionesCobrarClientesDetallados;
	protected JButton jButtonModificarCobrarClientesDetallados;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesDetallados;
	protected JButton jButtonCerrarCobrarClientesDetallados;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesDetallados;
	protected JButton jButtonProcesarInformacionCobrarClientesDetallados;
	
	
	protected JButton jButtonAnterioresCobrarClientesDetallados;
	protected JButton jButtonSiguientesCobrarClientesDetallados;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesDetallados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesDetallados;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesDetallados;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesDetallados;
	//protected JButton jButtonGenerarImportacionCobrarClientesDetallados;
	//protected JButton jButtonCerrarImportacionCobrarClientesDetallados;
	//protected JFileChooser jFileChooserImportacionCobrarClientesDetallados;
	//protected File fileImportacionCobrarClientesDetallados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesDetallados;
	protected JButton jButtonDuplicarToolBarCobrarClientesDetallados;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesDetallados;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesDetallados;
	protected JButton jButtonCopiarToolBarCobrarClientesDetallados;
	protected JButton jButtonVerFormToolBarCobrarClientesDetallados;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesDetallados;
	protected JButton jButtonCerrarToolBarCobrarClientesDetallados;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesDetallados;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesDetallados;
	protected JButton jButtonAnterioresToolBarCobrarClientesDetallados;
	protected JButton jButtonSiguientesToolBarCobrarClientesDetallados;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesDetallados;
	protected JMenuItem jMenuItemDuplicarCobrarClientesDetallados;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesDetallados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesDetallados;
	protected JMenuItem jMenuItemCopiarCobrarClientesDetallados;
	protected JMenuItem jMenuItemVerFormCobrarClientesDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesDetallados;
	protected JMenuItem jMenuItemCerrarCobrarClientesDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesDetallados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesDetallados;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesDetallados;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesDetallados;
	protected JMenuItem jMenuItemAnterioresCobrarClientesDetallados;
	protected JMenuItem jMenuItemSiguientesCobrarClientesDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesDetallados;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesDetallados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesDetallados;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesDetallados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesDetallados;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesDetallados;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesDetallados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesDetallados;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesDetallados;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesDetallados;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesDetallados;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesDetallados;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesDetallados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesDetallados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesDetallados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesDetallados;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesDetallados;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesDetallados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesDetallados;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesDetallados;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesDetallados;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesDetallados;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesDetallados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesDetallados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesDetallados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesDetallados;
	public JPanel jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados;
	public JButton jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados;
	
	public JPanel jPanelIdIdBusquedaCobrarClientesDetalladosCobrarClientesDetallados;
	public JLabel jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados;
	public JTextFieldMe jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados;
	public JButton jButtonidBusquedaCobrarClientesDetalladosCobrarClientesDetalladosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarClientesDetalladosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesDetallados)	{
		this.jButtonRecargarInformacionCobrarClientesDetallados = jButtonRecargarInformacionCobrarClientesDetallados;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesDetallados() {
		return this.jButtonProcesarInformacionCobrarClientesDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesDetallados)	{
		this.jButtonProcesarInformacionCobrarClientesDetallados = jButtonProcesarInformacionCobrarClientesDetallados;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesDetallados() {
		return this.jButtonRecargarInformacionCobrarClientesDetallados;
	}
	
	
	public List<CobrarClientesDetallados> getcobrarclientesdetalladoss() {
		return this.cobrarclientesdetalladoss;
	}

	public void setcobrarclientesdetalladoss(List<CobrarClientesDetallados> cobrarclientesdetalladoss) {
		this.cobrarclientesdetalladoss = cobrarclientesdetalladoss;
	}
	
	public List<CobrarClientesDetallados> getcobrarclientesdetalladossAux() {
		return this.cobrarclientesdetalladossAux;
	}

	public void setcobrarclientesdetalladossAux(List<CobrarClientesDetallados> cobrarclientesdetalladossAux) {
		this.cobrarclientesdetalladossAux = cobrarclientesdetalladossAux;
	}
	
	public List<CobrarClientesDetallados> getcobrarclientesdetalladossEliminados() {
		return this.cobrarclientesdetalladossEliminados;
	}

	public void setCobrarClientesDetalladossEliminados(List<CobrarClientesDetallados> cobrarclientesdetalladossEliminados) {
		this.cobrarclientesdetalladossEliminados = cobrarclientesdetalladossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesDetallados() {
		return jComboBoxTiposSeleccionarCobrarClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesDetallados(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesDetallados) {
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados = jComboBoxTiposSeleccionarCobrarClientesDetallados;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesDetallados() {
		return jTextFieldValorCampoGeneralCobrarClientesDetallados;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesDetallados(
			JTextField jTextFieldValorCampoGeneralCobrarClientesDetallados) {
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados = jTextFieldValorCampoGeneralCobrarClientesDetallados;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesDetallados() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesDetallados;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesDetallados(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesDetallados) {
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados = jCheckBoxSeleccionarTodosCobrarClientesDetallados;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesDetallados() {
		return this.jCheckBoxSeleccionadosCobrarClientesDetallados;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesDetallados(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesDetallados) {
		this.jCheckBoxSeleccionadosCobrarClientesDetallados = jCheckBoxSeleccionadosCobrarClientesDetallados;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesDetallados() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesDetallados(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesDetallados) {
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados = jComboBoxTiposArchivosReportesCobrarClientesDetallados;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesDetallados() {
		return this.jComboBoxTiposReportesCobrarClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesDetallados(
			JComboBox jComboBoxTiposReportesCobrarClientesDetallados) {
		this.jComboBoxTiposReportesCobrarClientesDetallados = jComboBoxTiposReportesCobrarClientesDetallados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesDetallados() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesDetallados(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesDetallados) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados = jComboBoxTiposReportesDinamicoCobrarClientesDetallados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados = jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesDetallados() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesDetallados(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesDetallados) {
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados = jComboBoxTiposGraficosReportesCobrarClientesDetallados;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesDetallados() {
		return this.jComboBoxTiposPaginacionCobrarClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesDetallados(
			JComboBox jComboBoxTiposPaginacionCobrarClientesDetallados) {
		this.jComboBoxTiposPaginacionCobrarClientesDetallados = jComboBoxTiposPaginacionCobrarClientesDetallados;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesDetallados() {
		return this.jComboBoxTiposRelacionesCobrarClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesDetallados() {
		return this.jComboBoxTiposAccionesCobrarClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesDetallados(
			JComboBox jComboBoxTiposRelacionesCobrarClientesDetallados) {
		this.jComboBoxTiposRelacionesCobrarClientesDetallados = jComboBoxTiposRelacionesCobrarClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesDetallados(
			JComboBox jComboBoxTiposAccionesCobrarClientesDetallados) {
		this.jComboBoxTiposAccionesCobrarClientesDetallados = jComboBoxTiposAccionesCobrarClientesDetallados;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesDetallados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesDetallados() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesDetallados;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesDetallados(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesDetallados) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesDetallados = jCheckBoxConGraficoDinamicoCobrarClientesDetallados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesDetallados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesDetallados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesDetallados .setBorder(borderResaltar);		
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
		this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
		
		this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesDetallados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"copiar","copiar","Copiar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"ver_form","ver_form","Ver"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"recargar","recargar","Buscar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,
							"cerrar","cerrar","Salir"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesDetallados;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesDetallados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesDetallados;
				
		//protected JButton jButtonModificarToolBarCobrarClientesDetallados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesDetallados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesDetallados=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesDetallados=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesDetallados=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesDetallados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesDetallados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesDetallados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesDetallados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesDetallados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesDetallados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesDetallados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesDetallados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesDetallados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesDetallados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesDetallados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesDetallados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesDetallados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesDetallados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesDetallados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesDetallados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesDetallados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesDetallados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesDetallados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesDetallados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesDetallados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesDetallados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesDetallados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesDetallados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesDetallados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesDetallados.add(this.jMenuItemCerrarCobrarClientesDetallados);
			
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemNuevoCobrarClientesDetallados);
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados);
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemNuevoRelacionesCobrarClientesDetallados);
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados);		
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemDuplicarCobrarClientesDetallados);		
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemCopiarCobrarClientesDetallados);		
			this.jmenuAccionesCobrarClientesDetallados.add(this.jMenuItemVerFormCobrarClientesDetallados);		
			
			this.jmenuDatosCobrarClientesDetallados.add(this.jMenuItemRecargarInformacionCobrarClientesDetallados);				
			this.jmenuDatosCobrarClientesDetallados.add(this.jMenuItemAnterioresCobrarClientesDetallados);				
			this.jmenuDatosCobrarClientesDetallados.add(this.jMenuItemSiguientesCobrarClientesDetallados);				
			this.jmenuDatosCobrarClientesDetallados.add(this.jMenuItemAbrirOrderByCobrarClientesDetallados);				
			this.jmenuDatosCobrarClientesDetallados.add(this.jMenuItemMostrarOcultarCobrarClientesDetallados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesDetallados.add(this.jMenuItemGuardarCambiosCobrarClientesDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesDetallados.add(this.jmenuArchivoCobrarClientesDetallados);		
			this.jmenuBarCobrarClientesDetallados.add(this.jmenuAccionesCobrarClientesDetallados);		
			this.jmenuBarCobrarClientesDetallados.add(this.jmenuDatosCobrarClientesDetallados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesDetallados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesDetallados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados= new JButtonMe();
		this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setText("Buscar");
		this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados = new JLabelMe();
		jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setText("Id :");
		jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados= new JTextFieldMe();
		jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados.setVisible(false);




		this.jTabbedPaneBusquedasCobrarClientesDetallados=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesDetallados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesDetallados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesDetallados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesDetallados = new CobrarClientesDetalladosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Detallados DATOS");
			this.jInternalFrameDetalleFormCobrarClientesDetallados = new CobrarClientesDetalladosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones(),this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesDetallados = null;//new CobrarClientesDetalladosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesDetallados= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesDetallados = new JTableMe();      
		
		String sToolTipCobrarClientesDetallados="";
		sToolTipCobrarClientesDetallados=CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesDetallados+="(Cartera.CobrarClientesDetallados)";
		}
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesDetallados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesDetallados.setToolTipText(sToolTipCobrarClientesDetallados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesDetallados);
		this.jTableDatosCobrarClientesDetallados.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesDetallados.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesDetallados = new JButtonMe();
		this.jButtonDuplicarCobrarClientesDetallados = new JButtonMe();
		this.jButtonCopiarCobrarClientesDetallados = new JButtonMe();
		this.jButtonVerFormCobrarClientesDetallados = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesDetallados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados = new JButtonMe();
		this.jButtonCerrarCobrarClientesDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesDetallados = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesDetallados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Detallados";
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesDetallados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesDetallados=new ReporteDinamicoJInternalFrame(CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesDetallados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesDetallados=new ImportacionJInternalFrame(CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesDetallados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesDetallados = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesDetallados.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesDetallados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesDetallados,false,this);
			
			//this.cargarOrderByCobrarClientesDetallados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesDetallados,true,this);
			
			//this.cargarOrderByCobrarClientesDetallados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesDetallados.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCobrarClientesDetallados.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCobrarClientesDetallados.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCobrarClientesDetallados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesDetallados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesDetallados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesDetallados.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesDetallados.setText("Duplicar");
		this.jButtonCopiarCobrarClientesDetallados.setText("Copiar");
		this.jButtonVerFormCobrarClientesDetallados.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesDetallados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setText("Guardar");
		this.jButtonCerrarCobrarClientesDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesDetallados,"nuevo_button","Nuevo",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesDetallados,"duplicar_button","Duplicar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesDetallados,"copiar_button","Copiar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesDetallados,"ver_form","Ver",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesDetallados,"nuevorelaciones_button","Nuevo Rel",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesDetallados,"guardarcambiostabla_button","Guardar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesDetallados,"cerrar_button","Salir",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesDetallados.setToolTipText("Nuevo"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesDetallados.setToolTipText("Duplicar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesDetallados.setToolTipText("Copiar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesDetallados.setToolTipText("Ver"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesDetallados.setToolTipText("Nuevo Rel"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setToolTipText("Guardar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesDetallados.setToolTipText("Salir"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesDetallados";
		inputMap = this.jButtonNuevoCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesDetallados"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesDetallados";
		inputMap = this.jButtonDuplicarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesDetallados"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesDetallados";
		inputMap = this.jButtonCopiarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesDetallados"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesDetallados";
		inputMap = this.jButtonVerFormCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesDetallados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesDetallados";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesDetallados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesDetallados";
		inputMap = this.jButtonModificarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesDetallados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesDetallados";
		inputMap = this.jButtonCerrarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesDetallados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesDetallados.setName("jPanelParametrosReportesCobrarClientesDetallados"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesDetallados.setName("jPanelParametrosReportesAccionesCobrarClientesDetallados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesDetallados = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesDetallados.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesDetallados.setToolTipText("Buscar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesDetallados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesDetallados.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesDetallados = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesDetallados.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesDetallados.setToolTipText("Procesar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesDetallados.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesDetallados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesDetallados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesDetallados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesDetallados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesDetallados.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesDetallados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesDetallados.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesDetallados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesDetallados = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesDetallados.setText("Acciones");		
		this.jLabelAccionesCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesDetallados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesDetallados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesDetallados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesDetallados = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesDetallados.setText("<<");
        this.jButtonAnterioresCobrarClientesDetallados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesDetallados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesDetallados = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesDetallados.setText(">>");
        this.jButtonSiguientesCobrarClientesDetallados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesDetallados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesDetallados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesDetallados,"nuevoguardarcambios_button","Nue",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesDetallados";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesDetallados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesDetallados";
		inputMap = this.jButtonRecargarInformacionCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesDetallados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesDetallados";
		inputMap = this.jButtonSiguientesCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesDetallados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesDetallados";
		inputMap = this.jButtonAnterioresCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesDetallados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesDetallados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesDetallados.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesDetallados.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesDetallados.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesDetallados = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesDetallados.setLayout(gridaBagLayoutPaginacionCobrarClientesDetallados);						
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonAnterioresCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					
						
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonNuevoGuardarCambiosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
						
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonSiguientesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonNuevoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
						
			
			
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
				this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonGuardarCambiosTablaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonDuplicarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonCopiarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonVerFormCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesDetallados.add(this.jButtonCerrarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesDetallados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesDetallados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesDetallados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesDetallados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesDetallados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesDetallados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesDetallados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesDetallados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesDetallados.setLayout(gridaBagParametrosReportesCobrarClientesDetallados);
			this.jPanelParametrosReportesAccionesCobrarClientesDetallados.setLayout(gridaBagParametrosReportesAccionesCobrarClientesDetallados);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesDetallados.setLayout(gridaBagParametrosAuxiliar1CobrarClientesDetallados);
			this.jPanelParametrosAuxiliar2CobrarClientesDetallados.setLayout(gridaBagParametrosAuxiliar2CobrarClientesDetallados);
			this.jPanelParametrosAuxiliar3CobrarClientesDetallados.setLayout(gridaBagParametrosAuxiliar3CobrarClientesDetallados);
			this.jPanelParametrosAuxiliar4CobrarClientesDetallados.setLayout(gridaBagParametrosAuxiliar4CobrarClientesDetallados);
			//this.jPanelParametrosAuxiliar5CobrarClientesDetallados.setLayout(gridaBagParametrosAuxiliar2CobrarClientesDetallados);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jButtonRecargarInformacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesDetallados.add(this.jComboBoxTiposPaginacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesDetallados.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesDetallados.add(this.jComboBoxTiposArchivosReportesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jPanelParametrosAuxiliar1CobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesDetallados.add(this.jComboBoxTiposReportesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jPanelParametrosAuxiliar4CobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jComboBoxTiposReportesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jCheckBoxGenerarReporteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jPanelParametrosAuxiliar2CobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jLabelAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jButtonAbrirOrderByCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jComboBoxTiposSeleccionarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jCheckBoxSeleccionarTodosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesDetallados.add(this.jCheckBoxSeleccionarTodosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);															
				
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesDetallados.add(this.jCheckBoxSeleccionadosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jPanelParametrosAuxiliar3CobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesDetallados.add(this.jComboBoxTiposAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesDetallados = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesDetallados.setLayout(gridaBagLayoutDatosCobrarClientesDetallados);
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesDetallados.add(this.jTableDatosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesDetallados.setViewportView(this.jTableDatosCobrarClientesDetallados);
		this.jTableDatosCobrarClientesDetallados.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesDetallados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesDetallados= new GridBagLayout();
		this.jPanelAccionesCobrarClientesDetallados.setLayout(gridaBagLayoutAccionesCobrarClientesDetallados);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
			
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonNuevoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados.setLayout(gridaBagLayoutBusquedaCobrarClientesDetalladosCobrarClientesDetallados);

		gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		gridBagConstraintsCobrarClientesDetallados.gridx = 0;
		jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados.add(jLabelidBusquedaCobrarClientesDetalladosCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);

		gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		gridBagConstraintsCobrarClientesDetallados.gridx = 1;
		jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados.add(jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);

		gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesDetallados.gridy = 1;
		gridBagConstraintsCobrarClientesDetallados.gridx =1;
		jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados.add(jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);

		jTabbedPaneBusquedasCobrarClientesDetallados.addTab("1.-Por  ", jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
		jTabbedPaneBusquedasCobrarClientesDetallados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesDetallados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesDetallados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesDetallados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesDetallados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;		
			this.gridBagConstraintsCobrarClientesDetallados.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesDetallados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		*/		
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesDetallados.gridx =0;
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
				
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesDetallados = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesDetallados.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesDetallados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesDetallados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesDetallados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesDetallados.setName("jPanelReporteDinamicoCobrarClientesDetallados"); 
		
		this.jPanelReporteDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesDetallados.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesDetallados);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesDetallados = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesDetallados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jLabelColumnasSelectReporteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesDetallados = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesDetallados=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesDetallados);
			
			this.jScrollColumnasSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jListColumnasSelectReporteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jScrollColumnasSelectReporteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesDetallados = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesDetallados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesDetallados = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesDetallados=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesDetallados);
			
			this.jScrollRelacionesSelectReporteCobrarClientesDetallados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesDetallados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesDetallados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesDetallados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesDetallados = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesDetallados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados.setToolTipText("Generar EXCEL"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jComboBoxTiposReportesDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesDetallados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesDetallados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesDetallados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesDetallados.setToolTipText("Generar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jButtonGenerarReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesDetallados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesDetallados.setToolTipText("Cancelar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesDetallados.add(this.jButtonCerrarReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesDetallados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados= new JScrollPane(jPanelReporteDinamicoCobrarClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesDetallados);
		this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesDetallados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesDetallados.setName("jPanelImportacionCobrarClientesDetallados"); 
		
		this.jPanelImportacionCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesDetallados.setLayout(gridaBagLayoutImportacionCobrarClientesDetallados);
		
		
		this.jInternalFrameImportacionCobrarClientesDetallados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesDetallados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesDetallados.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesDetallados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesDetallados.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesDetallados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesDetallados = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesDetallados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesDetallados.add(this.jLabelArchivoImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesDetallados = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesDetallados.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesDetallados = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesDetallados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesDetallados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesDetallados.setToolTipText("Generar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesDetallados.add(this.jButtonAbrirImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesDetallados = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesDetallados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesDetallados.add(this.jLabelPathArchivoImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesDetallados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesDetallados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesDetallados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesDetallados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesDetallados.add(this.jTextFieldPathArchivoImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesDetallados = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesDetallados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesDetallados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesDetallados.setToolTipText("Generar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesDetallados.add(this.jButtonGenerarImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesDetallados = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesDetallados.setToolTipText("Cancelar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesDetallados.add(this.jButtonCerrarImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesDetallados = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesDetallados= new JScrollPane(jPanelImportacionCobrarClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesDetallados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesDetallados);
		this.jInternalFrameImportacionCobrarClientesDetallados.getContentPane().add(this.jScrollPanelImportacionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesDetallados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesDetallados = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesDetallados.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesDetallados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesDetallados";
			inputMap = this.jButtonAbrirOrderByCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesDetallados"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesDetallados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesDetallados.setName("jPanelOrderByCobrarClientesDetallados"); 
			
			this.jPanelOrderByCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesDetallados.setLayout(gridaBagLayoutOrderByCobrarClientesDetallados);
			
			
			this.jTableDatosCobrarClientesDetalladosOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesDetalladosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesDetalladosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesDetalladosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesDetalladosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesDetalladosOrderBy.setViewportView(this.jTableDatosCobrarClientesDetalladosOrderBy);
			this.jTableDatosCobrarClientesDetalladosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesDetalladosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesDetallados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesDetallados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesDetallados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesDetallados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesDetallados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesDetallados.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesDetallados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesDetallados.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesDetallados.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesDetallados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesDetallados.ipady =150;
				
			this.jPanelOrderByCobrarClientesDetallados.add(jScrollPanelDatosCobrarClientesDetalladosOrderBy, this.gridBagConstraintsCobrarClientesDetallados);//this.jTableDatosCobrarClientesDetalladosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesDetallados = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesDetallados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesDetallados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesDetallados.setToolTipText("Cancelar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesDetallados.add(this.jButtonCerrarOrderByCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesDetallados = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesDetallados= new JScrollPane(jPanelOrderByCobrarClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesDetallados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesDetallados);
			
			this.jInternalFrameOrderByCobrarClientesDetallados.getContentPane().add(this.jScrollPanelOrderByCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesDetallados = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesDetallados.getRowHeight();//CobrarClientesDetalladosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.isSelected()) {
					iHeightTable=CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesDetallados.isSelected()) {
					iHeightTable=CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesDetallados!=null && this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesDetallados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesDetallados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesDetallados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesdetalladoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesDetallados> TraerCobrarClientesDetalladosBeans(List<CobrarClientesDetallados> cobrarclientesdetalladoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladoss) {
					
				if(!(CobrarClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarclientesdetallados.setsDetalleGeneralEntityReporte(CobrarClientesDetalladosConstantesFunciones.getCobrarClientesDetalladosDescripcion(cobrarclientesdetallados));
										
						
					
						
					
				} else  {
							
					//cobrarclientesdetallados.setsDetalleGeneralEntityReporte(cobrarclientesdetallados.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclientesdetalladosbeans.add(cobrarclientesdetalladosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclientesdetalladoss;
    }
	//PARA REPORTES FIN
}
