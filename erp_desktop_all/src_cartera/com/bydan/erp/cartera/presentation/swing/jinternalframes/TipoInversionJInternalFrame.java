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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoInversionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoInversionJInternalFrame extends TipoInversionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoInversion;
	
	protected JMenuBar jmenuBarTipoInversion;
	
	protected JMenu jmenuTipoInversion;
	protected JMenu jmenuDatosTipoInversion;
	protected JMenu jmenuArchivoTipoInversion;
	protected JMenu jmenuAccionesTipoInversion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInversion;	
	protected GridBagConstraints gridBagConstraintsTipoInversion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoInversionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoInversion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoInversion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoInversion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInversionSessionBean tipoinversionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoInversion> tipoinversions;		
	public List<TipoInversion> tipoinversionsEliminados;	
	public List<TipoInversion> tipoinversionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoInversion;		
	protected JButton jButtonAbrirOrderByTipoInversion;
	
	
	//protected JPanel jPanelOrderByTipoInversion;
	//public JScrollPane jScrollPanelOrderByTipoInversion;	
	//protected JButton jButtonCerrarOrderByTipoInversion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoInversionLogic tipoinversionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoInversion;
	public JScrollPane jScrollPanelDatosEdicionTipoInversion;
	public JScrollPane jScrollPanelDatosGeneralTipoInversion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoInversionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoInversion;
	//public JScrollPane jScrollPanelImportacionTipoInversion;
	
	
	
	protected JPanel jPanelAccionesTipoInversion;
	
    protected JPanel jPanelPaginacionTipoInversion;
    protected JPanel jPanelParametrosReportesTipoInversion;
	protected JPanel jPanelParametrosReportesAccionesTipoInversion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoInversion;
	protected JPanel jPanelParametrosAuxiliar2TipoInversion;
	protected JPanel jPanelParametrosAuxiliar3TipoInversion;
	protected JPanel jPanelParametrosAuxiliar4TipoInversion;
	//protected JPanel jPanelParametrosAuxiliar5TipoInversion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoInversion;
	//protected JPanel jPanelImportacionTipoInversion;
	
	
	public JTable jTableDatosTipoInversion;
	
	
	
	//public JTable jTableDatosTipoInversionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoInversion;
	protected JButton jButtonDuplicarTipoInversion;
	protected JButton jButtonCopiarTipoInversion;
	protected JButton jButtonVerFormTipoInversion;
	protected JButton jButtonNuevoRelacionesTipoInversion;
	protected JButton jButtonModificarTipoInversion;
	
    protected JButton jButtonGuardarCambiosTablaTipoInversion;
	protected JButton jButtonCerrarTipoInversion;
	
	
	protected JButton jButtonRecargarInformacionTipoInversion;
	protected JButton jButtonProcesarInformacionTipoInversion;
	
	
	protected JButton jButtonAnterioresTipoInversion;
	protected JButton jButtonSiguientesTipoInversion;
	protected JButton jButtonNuevoGuardarCambiosTipoInversion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoInversion;
	//protected JButton jButtonCerrarReporteDinamicoTipoInversion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoInversion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoInversion;
	//protected JButton jButtonGenerarImportacionTipoInversion;
	//protected JButton jButtonCerrarImportacionTipoInversion;
	//protected JFileChooser jFileChooserImportacionTipoInversion;
	//protected File fileImportacionTipoInversion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInversion;
	protected JButton jButtonDuplicarToolBarTipoInversion;
	protected JButton jButtonNuevoRelacionesToolBarTipoInversion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoInversion;
	protected JButton jButtonCopiarToolBarTipoInversion;
	protected JButton jButtonVerFormToolBarTipoInversion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoInversion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInversion;
	protected JButton jButtonCerrarToolBarTipoInversion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoInversion;
	protected JButton jButtonProcesarInformacionToolBarTipoInversion;
	protected JButton jButtonAnterioresToolBarTipoInversion;
	protected JButton jButtonSiguientesToolBarTipoInversion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoInversion;
	protected JButton jButtonAbrirOrderByToolBarTipoInversion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInversion;
	protected JMenuItem jMenuItemDuplicarTipoInversion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoInversion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoInversion;
	protected JMenuItem jMenuItemCopiarTipoInversion;
	protected JMenuItem jMenuItemVerFormTipoInversion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInversion;
	protected JMenuItem jMenuItemCerrarTipoInversion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInversion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoInversion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInversion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoInversion;
	protected JMenuItem jMenuItemProcesarInformacionTipoInversion;
	protected JMenuItem jMenuItemAnterioresTipoInversion;
	protected JMenuItem jMenuItemSiguientesTipoInversion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInversion;
	protected JMenuItem jMenuItemAbrirOrderByTipoInversion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInversion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInversion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoInversion;
	protected JCheckBox jCheckBoxSeleccionadosTipoInversion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoInversion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoInversion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoInversion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoInversion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInversion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoInversion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoInversion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoInversion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInversion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInversion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoInversion;
	protected JTextField jTextFieldValorCampoGeneralTipoInversion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoInversion;
	//public JList<Reporte> jListColumnasSelectReporteTipoInversion;
	//public JScrollPane jScrollColumnasSelectReporteTipoInversion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoInversion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoInversion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoInversion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoInversion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoInversion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoInversion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoInversion;
	
		
	//public JLabel jLabelArchivoImportacionTipoInversion;	
	//public JLabel jLabelPathArchivoImportacionTipoInversion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoInversion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoInversion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoInversion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoInversion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoInversion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoInversion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoInversion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoInversion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoInversion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoInversion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoInversion;
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoInversionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoInversion)	{
		this.jButtonRecargarInformacionTipoInversion = jButtonRecargarInformacionTipoInversion;
	}
	
	public JButton getjButtonProcesarInformacionTipoInversion() {
		return this.jButtonProcesarInformacionTipoInversion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInversion)	{
		this.jButtonProcesarInformacionTipoInversion = jButtonProcesarInformacionTipoInversion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoInversion() {
		return this.jButtonRecargarInformacionTipoInversion;
	}
	
	
	public List<TipoInversion> gettipoinversions() {
		return this.tipoinversions;
	}

	public void settipoinversions(List<TipoInversion> tipoinversions) {
		this.tipoinversions = tipoinversions;
	}
	
	public List<TipoInversion> gettipoinversionsAux() {
		return this.tipoinversionsAux;
	}

	public void settipoinversionsAux(List<TipoInversion> tipoinversionsAux) {
		this.tipoinversionsAux = tipoinversionsAux;
	}
	
	public List<TipoInversion> gettipoinversionsEliminados() {
		return this.tipoinversionsEliminados;
	}

	public void setTipoInversionsEliminados(List<TipoInversion> tipoinversionsEliminados) {
		this.tipoinversionsEliminados = tipoinversionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoInversion() {
		return jComboBoxTiposSeleccionarTipoInversion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoInversion(
			JComboBox jComboBoxTiposSeleccionarTipoInversion) {
		this.jComboBoxTiposSeleccionarTipoInversion = jComboBoxTiposSeleccionarTipoInversion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoInversion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoInversion() {
		return jTextFieldValorCampoGeneralTipoInversion;
	}

	public void setjTextFieldValorCampoGeneralTipoInversion(
			JTextField jTextFieldValorCampoGeneralTipoInversion) {
		this.jTextFieldValorCampoGeneralTipoInversion = jTextFieldValorCampoGeneralTipoInversion;
	}

	public void setBorderResaltarValorCampoGeneralTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoInversion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoInversion() {
		return this.jCheckBoxSeleccionarTodosTipoInversion;
	}

	public void setjCheckBoxSeleccionarTodosTipoInversion(
			JCheckBox jCheckBoxSeleccionarTodosTipoInversion) {
		this.jCheckBoxSeleccionarTodosTipoInversion = jCheckBoxSeleccionarTodosTipoInversion;
	}

	public void setBorderResaltarSeleccionarTodosTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoInversion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoInversion() {
		return this.jCheckBoxSeleccionadosTipoInversion;
	}

	public void setjCheckBoxSeleccionadosTipoInversion(
			JCheckBox jCheckBoxSeleccionadosTipoInversion) {
		this.jCheckBoxSeleccionadosTipoInversion = jCheckBoxSeleccionadosTipoInversion;
	}
	
	public void setBorderResaltarSeleccionadosTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoInversion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoInversion() {
		return this.jComboBoxTiposArchivosReportesTipoInversion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoInversion(
			JComboBox jComboBoxTiposArchivosReportesTipoInversion) {
		this.jComboBoxTiposArchivosReportesTipoInversion = jComboBoxTiposArchivosReportesTipoInversion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoInversion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoInversion() {
		return this.jComboBoxTiposReportesTipoInversion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoInversion(
			JComboBox jComboBoxTiposReportesTipoInversion) {
		this.jComboBoxTiposReportesTipoInversion = jComboBoxTiposReportesTipoInversion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoInversion() {
	//	return jComboBoxTiposReportesDinamicoTipoInversion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoInversion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoInversion) {
	//	this.jComboBoxTiposReportesDinamicoTipoInversion = jComboBoxTiposReportesDinamicoTipoInversion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoInversion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoInversion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoInversion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInversion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoInversion = jComboBoxTiposArchivosReportesDinamicoTipoInversion;
	//}
	
	public void setBorderResaltarTiposReportesTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoInversion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoInversion() {
		return this.jComboBoxTiposGraficosReportesTipoInversion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoInversion(
			JComboBox jComboBoxTiposGraficosReportesTipoInversion) {
		this.jComboBoxTiposGraficosReportesTipoInversion = jComboBoxTiposGraficosReportesTipoInversion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoInversion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoInversion() {
		return this.jComboBoxTiposPaginacionTipoInversion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoInversion(
			JComboBox jComboBoxTiposPaginacionTipoInversion) {
		this.jComboBoxTiposPaginacionTipoInversion = jComboBoxTiposPaginacionTipoInversion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoInversion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoInversion() {
		return this.jComboBoxTiposRelacionesTipoInversion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInversion() {
		return this.jComboBoxTiposAccionesTipoInversion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInversion(
			JComboBox jComboBoxTiposRelacionesTipoInversion) {
		this.jComboBoxTiposRelacionesTipoInversion = jComboBoxTiposRelacionesTipoInversion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInversion(
			JComboBox jComboBoxTiposAccionesTipoInversion) {
		this.jComboBoxTiposAccionesTipoInversion = jComboBoxTiposAccionesTipoInversion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoInversion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoInversion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInversion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoInversion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoInversion() {
	//	return jCheckBoxConGraficoDinamicoTipoInversion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoInversion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoInversion) {
	//	this.jCheckBoxConGraficoDinamicoTipoInversion = jCheckBoxConGraficoDinamicoTipoInversion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoInversion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoInversion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoInversion .setBorder(borderResaltar);		
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
		this.tipoinversionSessionBean=new TipoInversionSessionBean();
		
		this.tipoinversionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinversionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinversionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInversionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Inversion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoInversionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoInversion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"nuevo","nuevo","Nuevo"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"duplicar","duplicar","Duplicar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"copiar","copiar","Copiar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"ver_form","ver_form","Ver"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"recargar","recargar","Recargar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoInversion,this.jTtoolBarTipoInversion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoInversion,this.jTtoolBarTipoInversion,
							"cerrar","cerrar","Salir"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoInversion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoInversion;
			
				this.jButtonProcesarInformacionToolBarTipoInversion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoInversion;
				
		//protected JButton jButtonModificarToolBarTipoInversion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoInversion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoInversion=new JMenuMe("General");
		this.jmenuArchivoTipoInversion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoInversion=new JMenuMe("Acciones");
		this.jmenuDatosTipoInversion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInversion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInversion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInversion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoInversion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoInversion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoInversion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoInversion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoInversion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoInversion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoInversion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInversion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInversion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoInversion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoInversion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoInversion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoInversion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoInversion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoInversion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoInversion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoInversion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoInversion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInversion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInversion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInversion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoInversion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoInversion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoInversion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoInversion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoInversion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoInversion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoInversion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoInversion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoInversion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoInversion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoInversion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoInversion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoInversion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoInversion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoInversion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInversion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInversion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInversion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoInversion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoInversion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoInversion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInversion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInversion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInversion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoInversion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoInversion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoInversion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoInversion.add(this.jMenuItemCerrarTipoInversion);
			
			this.jmenuAccionesTipoInversion.add(this.jMenuItemNuevoTipoInversion);
			this.jmenuAccionesTipoInversion.add(this.jMenuItemNuevoGuardarCambiosTipoInversion);
			this.jmenuAccionesTipoInversion.add(this.jMenuItemNuevoRelacionesTipoInversion);
			this.jmenuAccionesTipoInversion.add(this.jMenuItemGuardarCambiosTablaTipoInversion);		
			this.jmenuAccionesTipoInversion.add(this.jMenuItemDuplicarTipoInversion);		
			this.jmenuAccionesTipoInversion.add(this.jMenuItemCopiarTipoInversion);		
			this.jmenuAccionesTipoInversion.add(this.jMenuItemVerFormTipoInversion);		
			
			this.jmenuDatosTipoInversion.add(this.jMenuItemRecargarInformacionTipoInversion);				
			this.jmenuDatosTipoInversion.add(this.jMenuItemAnterioresTipoInversion);				
			this.jmenuDatosTipoInversion.add(this.jMenuItemSiguientesTipoInversion);				
			this.jmenuDatosTipoInversion.add(this.jMenuItemAbrirOrderByTipoInversion);				
			this.jmenuDatosTipoInversion.add(this.jMenuItemMostrarOcultarTipoInversion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoInversion.add(this.jMenuItemGuardarCambiosTipoInversion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoInversion.add(this.jmenuArchivoTipoInversion);		
			this.jmenuBarTipoInversion.add(this.jmenuAccionesTipoInversion);		
			this.jmenuBarTipoInversion.add(this.jmenuDatosTipoInversion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoInversion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoInversion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoInversion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoInversion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInversion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInversion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoInversion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoInversion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoInversion = new TipoInversionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Inversion DATOS");
			this.jInternalFrameDetalleFormTipoInversion = new TipoInversionDetalleFormJInternalFrame(jDesktopPane,this.tipoinversionSessionBean.getConGuardarRelaciones(),this.tipoinversionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoInversion = null;//new TipoInversionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInversion= new GridBagLayout();
		
		
		this.jTableDatosTipoInversion = new JTableMe();      
		
		String sToolTipTipoInversion="";
		sToolTipTipoInversion=TipoInversionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInversion+="(Cartera.TipoInversion)";
		}
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInversion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoInversion.setToolTipText(sToolTipTipoInversion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoInversion);
		this.jTableDatosTipoInversion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoInversion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoInversion.setRowSelectionAllowed(true);
		this.jTableDatosTipoInversion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoInversion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoInversion = new JButtonMe();
		this.jButtonDuplicarTipoInversion = new JButtonMe();
		this.jButtonCopiarTipoInversion = new JButtonMe();
		this.jButtonVerFormTipoInversion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoInversion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoInversion = new JButtonMe();
		this.jButtonCerrarTipoInversion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInversion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoInversion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Inversion";
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInversion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInversion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInversion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoInversion=new ReporteDinamicoJInternalFrame(TipoInversionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoInversion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoInversion=new ImportacionJInternalFrame(TipoInversionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoInversion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoInversion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoInversion.setText("Orden");
		this.jButtonAbrirOrderByTipoInversion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInversion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInversion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInversion,false,this);
			
			//this.cargarOrderByTipoInversion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInversion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInversion,true,this);
			
			//this.cargarOrderByTipoInversion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoInversion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInversion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInversion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoInversion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInversion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInversion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoInversion.setText("Nuevo");
		this.jButtonDuplicarTipoInversion.setText("Duplicar");
		this.jButtonCopiarTipoInversion.setText("Copiar");
		this.jButtonVerFormTipoInversion.setText("Ver");
		this.jButtonNuevoRelacionesTipoInversion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoInversion.setText("Guardar");
		this.jButtonCerrarTipoInversion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInversion,"nuevo_button","Nuevo",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoInversion,"duplicar_button","Duplicar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoInversion,"copiar_button","Copiar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoInversion,"ver_form","Ver",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoInversion,"nuevorelaciones_button","Nuevo Rel",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInversion,"guardarcambiostabla_button","Guardar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInversion,"cerrar_button","Salir",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoInversion.setToolTipText("Nuevo"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoInversion.setToolTipText("Duplicar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoInversion.setToolTipText("Copiar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoInversion.setToolTipText("Ver"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoInversion.setToolTipText("Nuevo Rel"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoInversion.setToolTipText("Guardar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInversion.setToolTipText("Salir"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInversion";
		inputMap = this.jButtonNuevoTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInversion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInversion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoInversion";
		inputMap = this.jButtonDuplicarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoInversion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoInversion"));
		
		//COPIAR
		sMapKey = "CopiarTipoInversion";
		inputMap = this.jButtonCopiarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoInversion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoInversion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoInversion";
		inputMap = this.jButtonVerFormTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoInversion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoInversion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoInversion";
		inputMap = this.jButtonNuevoRelacionesTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoInversion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoInversion";
		inputMap = this.jButtonModificarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoInversion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoInversion";
		inputMap = this.jButtonCerrarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInversion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInversion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInversion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoInversion.setName("jPanelParametrosReportesTipoInversion"); 
		
		this.jPanelParametrosReportesAccionesTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoInversion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoInversion.setName("jPanelParametrosReportesAccionesTipoInversion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoInversion = new JButtonMe();
		this.jButtonRecargarInformacionTipoInversion.setText("Recargar");
		this.jButtonRecargarInformacionTipoInversion.setToolTipText("Recargar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoInversion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoInversion = new JButtonMe();
		this.jButtonProcesarInformacionTipoInversion.setText("Procesar");
		this.jButtonProcesarInformacionTipoInversion.setToolTipText("Procesar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoInversion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoInversion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInversion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInversion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInversion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoInversion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInversion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoInversion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInversion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoInversion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoInversion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoInversion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoInversion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoInversion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInversion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInversion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoInversion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoInversion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoInversion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoInversion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInversion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInversion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoInversion = new JLabelMe();
		
		this.jLabelAccionesTipoInversion.setText("Acciones");		
		this.jLabelAccionesTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoInversion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoInversion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoInversion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoInversion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoInversion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoInversion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoInversion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoInversion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoInversion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoInversion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoInversion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoInversion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoInversion = new JButtonMe();
		//this.jButtonAnterioresTipoInversion.setText("<<");
        this.jButtonAnterioresTipoInversion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoInversion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoInversion = new JButtonMe();
		//this.jButtonSiguientesTipoInversion.setText(">>");
        this.jButtonSiguientesTipoInversion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoInversion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoInversion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoInversion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoInversion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoInversion,"nuevoguardarcambios_button","Nue",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoInversion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoInversion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoInversion";
		inputMap = this.jButtonRecargarInformacionTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoInversion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoInversion";
		inputMap = this.jButtonSiguientesTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoInversion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoInversion";
		inputMap = this.jButtonAnterioresTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoInversion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoInversion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoInversion.setMinimumSize(new Dimension(this.getWidth(),TipoInversionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInversionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInversion.setMaximumSize(new Dimension(this.getWidth(),TipoInversionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInversionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInversion.setPreferredSize(new Dimension(this.getWidth(),TipoInversionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInversionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoInversion = new GridBagLayout();

			this.jPanelPaginacionTipoInversion.setLayout(gridaBagLayoutPaginacionTipoInversion);						
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 0;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoInversion.add(this.jButtonAnterioresTipoInversion, this.gridBagConstraintsTipoInversion);
					
						
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInversion.gridy = 0;
			
			this.jPanelPaginacionTipoInversion.add(this.jButtonNuevoGuardarCambiosTipoInversion, this.gridBagConstraintsTipoInversion);
						
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInversion.gridy = 0;
			this.jPanelPaginacionTipoInversion.add(this.jButtonSiguientesTipoInversion, this.gridBagConstraintsTipoInversion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 1;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInversion.add(this.jButtonNuevoTipoInversion, this.gridBagConstraintsTipoInversion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoInversion = new GridBagConstraints();
				this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInversion.gridy = 1;
				this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoInversion.add(this.jButtonNuevoRelacionesTipoInversion, this.gridBagConstraintsTipoInversion);
			}
			
			
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoInversion = new GridBagConstraints();
				this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInversion.gridy = 1;
				this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoInversion.add(this.jButtonGuardarCambiosTablaTipoInversion, this.gridBagConstraintsTipoInversion);
			}
			
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 1;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInversion.add(this.jButtonDuplicarTipoInversion, this.gridBagConstraintsTipoInversion);
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 1;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInversion.add(this.jButtonCopiarTipoInversion, this.gridBagConstraintsTipoInversion);
		
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 1;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInversion.add(this.jButtonVerFormTipoInversion, this.gridBagConstraintsTipoInversion);
		
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 1;
			this.gridBagConstraintsTipoInversion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoInversion.add(this.jButtonCerrarTipoInversion, this.gridBagConstraintsTipoInversion);
		
		
		
		this.jButtonRecargarInformacionTipoInversion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInversion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInversion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoInversion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInversion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInversion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoInversion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInversion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInversion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoInversion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInversion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInversion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoInversion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInversion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInversion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoInversion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInversion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInversion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoInversion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInversion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInversion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoInversion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInversion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInversion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoInversion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInversion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInversion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoInversion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInversion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInversion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoInversion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInversion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInversion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoInversion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInversion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInversion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoInversion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoInversion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoInversion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoInversion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoInversion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoInversion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoInversion.setLayout(gridaBagParametrosReportesTipoInversion);
			this.jPanelParametrosReportesAccionesTipoInversion.setLayout(gridaBagParametrosReportesAccionesTipoInversion);
			
			
			this.jPanelParametrosAuxiliar1TipoInversion.setLayout(gridaBagParametrosAuxiliar1TipoInversion);
			this.jPanelParametrosAuxiliar2TipoInversion.setLayout(gridaBagParametrosAuxiliar2TipoInversion);
			this.jPanelParametrosAuxiliar3TipoInversion.setLayout(gridaBagParametrosAuxiliar3TipoInversion);
			this.jPanelParametrosAuxiliar4TipoInversion.setLayout(gridaBagParametrosAuxiliar4TipoInversion);
			//this.jPanelParametrosAuxiliar5TipoInversion.setLayout(gridaBagParametrosAuxiliar2TipoInversion);			
			
			
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInversion.add(this.jButtonRecargarInformacionTipoInversion, this.gridBagConstraintsTipoInversion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInversion.add(this.jComboBoxTiposPaginacionTipoInversion, this.gridBagConstraintsTipoInversion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInversion.add(this.jCheckBoxConAltoMaximoTablaTipoInversion, this.gridBagConstraintsTipoInversion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInversion.add(this.jComboBoxTiposArchivosReportesTipoInversion, this.gridBagConstraintsTipoInversion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInversion.add(this.jPanelParametrosAuxiliar1TipoInversion, this.gridBagConstraintsTipoInversion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoInversion.add(this.jComboBoxTiposReportesTipoInversion, this.gridBagConstraintsTipoInversion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInversion.add(this.jPanelParametrosAuxiliar4TipoInversion, this.gridBagConstraintsTipoInversion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInversion.add(this.jComboBoxTiposReportesTipoInversion, this.gridBagConstraintsTipoInversion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInversion.add(this.jCheckBoxGenerarReporteTipoInversion, this.gridBagConstraintsTipoInversion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInversion.add(this.jPanelParametrosAuxiliar2TipoInversion, this.gridBagConstraintsTipoInversion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInversion.add(this.jLabelAccionesTipoInversion, this.gridBagConstraintsTipoInversion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoInversion = new GridBagConstraints();
				this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoInversion.add(this.jButtonAbrirOrderByTipoInversion, this.gridBagConstraintsTipoInversion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInversion.add(this.jComboBoxTiposSeleccionarTipoInversion, this.gridBagConstraintsTipoInversion);			
			
			
			/*
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInversion.add(this.jCheckBoxSeleccionarTodosTipoInversion, this.gridBagConstraintsTipoInversion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInversion.add(this.jCheckBoxSeleccionarTodosTipoInversion, this.gridBagConstraintsTipoInversion);															
				
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInversion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInversion.add(this.jCheckBoxSeleccionadosTipoInversion, this.gridBagConstraintsTipoInversion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInversion.add(this.jPanelParametrosAuxiliar3TipoInversion, this.gridBagConstraintsTipoInversion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInversion.add(this.jComboBoxTiposRelacionesTipoInversion, this.gridBagConstraintsTipoInversion);
				
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInversion.add(this.jComboBoxTiposAccionesTipoInversion, this.gridBagConstraintsTipoInversion);
	
				
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInversion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInversion.add(this.jTextFieldValorCampoGeneralTipoInversion, this.gridBagConstraintsTipoInversion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoInversion = new GridBagLayout();

			this.jScrollPanelDatosTipoInversion.setLayout(gridaBagLayoutDatosTipoInversion);
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = 0;
			this.gridBagConstraintsTipoInversion.gridx = 0;
			
			this.jScrollPanelDatosTipoInversion.add(this.jTableDatosTipoInversion, this.gridBagConstraintsTipoInversion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoInversion.setViewportView(this.jTableDatosTipoInversion);
		this.jTableDatosTipoInversion.setFillsViewportHeight(true);
		this.jTableDatosTipoInversion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoInversion= new GridBagLayout();
		this.jPanelAccionesTipoInversion.setLayout(gridaBagLayoutAccionesTipoInversion);
		
		
		/*	
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = 0;
			
		this.jPanelAccionesTipoInversion.add(this.jButtonNuevoTipoInversion, this.gridBagConstraintsTipoInversion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInversion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInversion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInversion.gridx = 0;		
			//this.gridBagConstraintsTipoInversion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInversion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoInversion, this.gridBagConstraintsTipoInversion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoInversion.gridx = 0;		
		//this.gridBagConstraintsTipoInversion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoInversion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoInversion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoInversion, this.gridBagConstraintsTipoInversion);								
		
		
		/*
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoInversion, this.gridBagConstraintsTipoInversion);
		*/		
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInversion.gridx =0;
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInversion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInversion, this.gridBagConstraintsTipoInversion);
				
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoInversion, this.gridBagConstraintsTipoInversion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoInversion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInversion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoInversion.setLayout(gridaBagLayoutBusquedasParametrosTipoInversion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoInversion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInversion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInversion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInversion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInversion, this.gridBagConstraintsTipoInversion);
			
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInversion, this.gridBagConstraintsTipoInversion);
		
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInversion, this.gridBagConstraintsTipoInversion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoInversion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoInversion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoInversion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoInversion.setName("jPanelReporteDinamicoTipoInversion"); 
		
		this.jPanelReporteDinamicoTipoInversion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInversion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInversion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoInversion.setLayout(gridaBagLayoutReporteDinamicoTipoInversion);
		
		
		this.jInternalFrameReporteDinamicoTipoInversion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoInversion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInversion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoInversion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoInversion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoInversion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoInversion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoInversion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoInversion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoInversion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoInversion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoInversion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInversion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInversion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoInversion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoInversion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInversion.add(this.jLabelColumnasSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoInversion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoInversion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoInversion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoInversion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInversion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInversion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoInversion=new JScrollPane(this.jListColumnasSelectReporteTipoInversion);
			
			this.jScrollColumnasSelectReporteTipoInversion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInversion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInversion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInversion.add(this.jListColumnasSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		this.jPanelReporteDinamicoTipoInversion.add(this.jScrollColumnasSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoInversion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoInversion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInversion.add(this.jLabelRelacionesSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoInversion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoInversion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoInversion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoInversion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInversion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInversion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoInversion=new JScrollPane(this.jListRelacionesSelectReporteTipoInversion);
			
			this.jScrollRelacionesSelectReporteTipoInversion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInversion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInversion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInversion.add(this.jListRelacionesSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		this.jPanelReporteDinamicoTipoInversion.add(this.jScrollRelacionesSelectReporteTipoInversion, this.gridBagConstraintsTipoInversion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoInversion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoInversion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoInversion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoInversion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoInversion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoInversion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInversion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInversion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoInversion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInversion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInversion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInversion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInversion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoInversion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoInversion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInversion.add(this.jLabelGenerarExcelReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoInversion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoInversion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoInversion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoInversion.setToolTipText("Generar EXCEL"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoInversion.add(this.jButtonGenerarExcelReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInversion.add(this.jComboBoxTiposReportesDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoInversion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoInversion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInversion.add(this.jLabelTiposArchivoReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInversion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoInversion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoInversion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoInversion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoInversion.setToolTipText("Generar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInversion.add(this.jButtonGenerarReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoInversion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoInversion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoInversion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoInversion.setToolTipText("Cancelar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInversion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInversion.add(this.jButtonCerrarReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoInversion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoInversion= new JScrollPane(jPanelReporteDinamicoTipoInversion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoInversion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInversion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInversion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoInversion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoInversion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoInversion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoInversion);
		this.jInternalFrameReporteDinamicoTipoInversion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoInversion, this.gridBagConstraintsTipoInversion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoInversion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoInversion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoInversion.setName("jPanelImportacionTipoInversion"); 
		
		this.jPanelImportacionTipoInversion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInversion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInversion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoInversion.setLayout(gridaBagLayoutImportacionTipoInversion);
		
		
		this.jInternalFrameImportacionTipoInversion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoInversion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoInversion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInversion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoInversion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInversion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInversion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoInversion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInversion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInversion.setResizable(true);
	    this.jInternalFrameImportacionTipoInversion.setClosable(true);
	    this.jInternalFrameImportacionTipoInversion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoInversion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInversion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInversion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoInversion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInversion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInversion.setResizable(true);
	    this.jInternalFrameImportacionTipoInversion.setClosable(true);
	    this.jInternalFrameImportacionTipoInversion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoInversion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInversion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInversion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoInversion = new JLabelMe();

		this.jLabelArchivoImportacionTipoInversion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInversion.add(this.jLabelArchivoImportacionTipoInversion, this.gridBagConstraintsTipoInversion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoInversion = new JFileChooser();		
		this.jFileChooserImportacionTipoInversion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoInversion = new JButtonMe();
		this.jButtonAbrirImportacionTipoInversion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoInversion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoInversion.setToolTipText("Generar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInversion.add(this.jButtonAbrirImportacionTipoInversion, this.gridBagConstraintsTipoInversion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoInversion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoInversion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInversion.add(this.jLabelPathArchivoImportacionTipoInversion, this.gridBagConstraintsTipoInversion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoInversion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoInversion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInversion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInversion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInversion.add(this.jTextFieldPathArchivoImportacionTipoInversion, this.gridBagConstraintsTipoInversion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoInversion = new JButtonMe();
		this.jButtonGenerarImportacionTipoInversion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoInversion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoInversion.setToolTipText("Generar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInversion.add(this.jButtonGenerarImportacionTipoInversion, this.gridBagConstraintsTipoInversion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoInversion = new JButtonMe();
		this.jButtonCerrarImportacionTipoInversion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoInversion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoInversion.setToolTipText("Cancelar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInversion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInversion.add(this.jButtonCerrarImportacionTipoInversion, this.gridBagConstraintsTipoInversion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoInversion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoInversion= new JScrollPane(jPanelImportacionTipoInversion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoInversion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoInversion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoInversion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoInversion);
		this.jInternalFrameImportacionTipoInversion.getContentPane().add(this.jScrollPanelImportacionTipoInversion, this.gridBagConstraintsTipoInversion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoInversion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoInversion = new JButtonMe();
			this.jButtonAbrirOrderByTipoInversion.setText("Orden");
			this.jButtonAbrirOrderByTipoInversion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInversion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoInversion";
			inputMap = this.jButtonAbrirOrderByTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoInversion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoInversion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoInversion.setName("jPanelOrderByTipoInversion"); 
			
			this.jPanelOrderByTipoInversion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInversion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInversion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoInversion.setLayout(gridaBagLayoutOrderByTipoInversion);
			
			
			this.jTableDatosTipoInversionOrderBy = new JTableMe();        
			this.jTableDatosTipoInversionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoInversionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoInversionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoInversionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoInversionOrderBy.setViewportView(this.jTableDatosTipoInversionOrderBy);
			this.jTableDatosTipoInversionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoInversionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoInversion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoInversion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoInversion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoInversion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoInversion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoInversion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoInversion.setTitle("Orden");
			this.jInternalFrameOrderByTipoInversion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoInversion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoInversion.setResizable(true);
			this.jInternalFrameOrderByTipoInversion.setClosable(true);
			this.jInternalFrameOrderByTipoInversion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoInversion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInversion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInversion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoInversion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoInversion.ipady =150;
				
			this.jPanelOrderByTipoInversion.add(jScrollPanelDatosTipoInversionOrderBy, this.gridBagConstraintsTipoInversion);//this.jTableDatosTipoInversionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoInversion = new JButtonMe();
			this.jButtonCerrarOrderByTipoInversion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoInversion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoInversion.setToolTipText("Cancelar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoInversion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoInversion.add(this.jButtonCerrarOrderByTipoInversion, this.gridBagConstraintsTipoInversion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoInversion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoInversion= new JScrollPane(jPanelOrderByTipoInversion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoInversion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoInversion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoInversion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoInversion);
			
			this.jInternalFrameOrderByTipoInversion.getContentPane().add(this.jScrollPanelOrderByTipoInversion, this.gridBagConstraintsTipoInversion);			
		
		} else {
			this.jButtonAbrirOrderByTipoInversion = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoinversionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoInversion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoInversion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoInversion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoInversion.getRowHeight();//TipoInversionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoInversionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInversion.isSelected()) {
					iHeightTable=TipoInversionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInversionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInversionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoInversionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInversion.isSelected()) {
					iHeightTable=TipoInversionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInversionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInversionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoInversion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInversion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInversion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoInversion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInversion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInversion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoInversion!=null && this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoInversion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoInversion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoInversion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoInversion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInversion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInversion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoinversionLogic.getTipoInversions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinversions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoInversion> TraerTipoInversionBeans(List<TipoInversion> tipoinversions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoInversion tipoinversion:tipoinversions) {
					
				if(!(TipoInversionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoInversionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoinversion.setsDetalleGeneralEntityReporte(TipoInversionConstantesFunciones.getTipoInversionDescripcion(tipoinversion));
										
						
					
					

					if(tipoinversion.getAccionistas()!=null && Funciones.existeClass(classes,Accionista.class)) {
						try{tipoinversion.setaccionistasDescripcionReporte(new JRBeanCollectionDataSource(AccionistaJInternalFrame.TraerAccionistaBeans(tipoinversion.getAccionistas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoinversion.setsDetalleGeneralEntityReporte(tipoinversion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoinversionbeans.add(tipoinversionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoinversions;
    }
	//PARA REPORTES FIN
}
