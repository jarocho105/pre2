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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoInstruccionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoInstruccionJInternalFrame extends TipoInstruccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoInstruccion;
	
	protected JMenuBar jmenuBarTipoInstruccion;
	
	protected JMenu jmenuTipoInstruccion;
	protected JMenu jmenuDatosTipoInstruccion;
	protected JMenu jmenuArchivoTipoInstruccion;
	protected JMenu jmenuAccionesTipoInstruccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInstruccion;	
	protected GridBagConstraints gridBagConstraintsTipoInstruccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoInstruccionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoInstruccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoInstruccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoInstruccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoInstruccionSessionBean tipoinstruccionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoInstruccion> tipoinstruccions;		
	public List<TipoInstruccion> tipoinstruccionsEliminados;	
	public List<TipoInstruccion> tipoinstruccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoInstruccion;		
	protected JButton jButtonAbrirOrderByTipoInstruccion;
	
	
	//protected JPanel jPanelOrderByTipoInstruccion;
	//public JScrollPane jScrollPanelOrderByTipoInstruccion;	
	//protected JButton jButtonCerrarOrderByTipoInstruccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoInstruccionLogic tipoinstruccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoInstruccion;
	public JScrollPane jScrollPanelDatosEdicionTipoInstruccion;
	public JScrollPane jScrollPanelDatosGeneralTipoInstruccion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoInstruccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoInstruccion;
	//public JScrollPane jScrollPanelImportacionTipoInstruccion;
	
	
	
	protected JPanel jPanelAccionesTipoInstruccion;
	
    protected JPanel jPanelPaginacionTipoInstruccion;
    protected JPanel jPanelParametrosReportesTipoInstruccion;
	protected JPanel jPanelParametrosReportesAccionesTipoInstruccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoInstruccion;
	protected JPanel jPanelParametrosAuxiliar2TipoInstruccion;
	protected JPanel jPanelParametrosAuxiliar3TipoInstruccion;
	protected JPanel jPanelParametrosAuxiliar4TipoInstruccion;
	//protected JPanel jPanelParametrosAuxiliar5TipoInstruccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoInstruccion;
	//protected JPanel jPanelImportacionTipoInstruccion;
	
	
	public JTable jTableDatosTipoInstruccion;
	
	
	
	//public JTable jTableDatosTipoInstruccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoInstruccion;
	protected JButton jButtonDuplicarTipoInstruccion;
	protected JButton jButtonCopiarTipoInstruccion;
	protected JButton jButtonVerFormTipoInstruccion;
	protected JButton jButtonNuevoRelacionesTipoInstruccion;
	protected JButton jButtonModificarTipoInstruccion;
	
    protected JButton jButtonGuardarCambiosTablaTipoInstruccion;
	protected JButton jButtonCerrarTipoInstruccion;
	
	
	protected JButton jButtonRecargarInformacionTipoInstruccion;
	protected JButton jButtonProcesarInformacionTipoInstruccion;
	
	
	protected JButton jButtonAnterioresTipoInstruccion;
	protected JButton jButtonSiguientesTipoInstruccion;
	protected JButton jButtonNuevoGuardarCambiosTipoInstruccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoInstruccion;
	//protected JButton jButtonCerrarReporteDinamicoTipoInstruccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoInstruccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoInstruccion;
	//protected JButton jButtonGenerarImportacionTipoInstruccion;
	//protected JButton jButtonCerrarImportacionTipoInstruccion;
	//protected JFileChooser jFileChooserImportacionTipoInstruccion;
	//protected File fileImportacionTipoInstruccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInstruccion;
	protected JButton jButtonDuplicarToolBarTipoInstruccion;
	protected JButton jButtonNuevoRelacionesToolBarTipoInstruccion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoInstruccion;
	protected JButton jButtonCopiarToolBarTipoInstruccion;
	protected JButton jButtonVerFormToolBarTipoInstruccion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoInstruccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInstruccion;
	protected JButton jButtonCerrarToolBarTipoInstruccion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoInstruccion;
	protected JButton jButtonProcesarInformacionToolBarTipoInstruccion;
	protected JButton jButtonAnterioresToolBarTipoInstruccion;
	protected JButton jButtonSiguientesToolBarTipoInstruccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoInstruccion;
	protected JButton jButtonAbrirOrderByToolBarTipoInstruccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInstruccion;
	protected JMenuItem jMenuItemDuplicarTipoInstruccion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoInstruccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoInstruccion;
	protected JMenuItem jMenuItemCopiarTipoInstruccion;
	protected JMenuItem jMenuItemVerFormTipoInstruccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInstruccion;
	protected JMenuItem jMenuItemCerrarTipoInstruccion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInstruccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoInstruccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInstruccion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoInstruccion;
	protected JMenuItem jMenuItemProcesarInformacionTipoInstruccion;
	protected JMenuItem jMenuItemAnterioresTipoInstruccion;
	protected JMenuItem jMenuItemSiguientesTipoInstruccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInstruccion;
	protected JMenuItem jMenuItemAbrirOrderByTipoInstruccion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInstruccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInstruccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoInstruccion;
	protected JCheckBox jCheckBoxSeleccionadosTipoInstruccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoInstruccion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoInstruccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoInstruccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoInstruccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInstruccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoInstruccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoInstruccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoInstruccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInstruccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInstruccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoInstruccion;
	protected JTextField jTextFieldValorCampoGeneralTipoInstruccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoInstruccion;
	//public JList<Reporte> jListColumnasSelectReporteTipoInstruccion;
	//public JScrollPane jScrollColumnasSelectReporteTipoInstruccion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoInstruccion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoInstruccion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoInstruccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoInstruccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoInstruccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoInstruccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoInstruccion;
	
		
	//public JLabel jLabelArchivoImportacionTipoInstruccion;	
	//public JLabel jLabelPathArchivoImportacionTipoInstruccion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoInstruccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoInstruccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoInstruccion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoInstruccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoInstruccion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoInstruccion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoInstruccion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoInstruccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoInstruccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoInstruccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoInstruccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoInstruccion)	{
		this.jButtonRecargarInformacionTipoInstruccion = jButtonRecargarInformacionTipoInstruccion;
	}
	
	public JButton getjButtonProcesarInformacionTipoInstruccion() {
		return this.jButtonProcesarInformacionTipoInstruccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInstruccion)	{
		this.jButtonProcesarInformacionTipoInstruccion = jButtonProcesarInformacionTipoInstruccion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoInstruccion() {
		return this.jButtonRecargarInformacionTipoInstruccion;
	}
	
	
	public List<TipoInstruccion> gettipoinstruccions() {
		return this.tipoinstruccions;
	}

	public void settipoinstruccions(List<TipoInstruccion> tipoinstruccions) {
		this.tipoinstruccions = tipoinstruccions;
	}
	
	public List<TipoInstruccion> gettipoinstruccionsAux() {
		return this.tipoinstruccionsAux;
	}

	public void settipoinstruccionsAux(List<TipoInstruccion> tipoinstruccionsAux) {
		this.tipoinstruccionsAux = tipoinstruccionsAux;
	}
	
	public List<TipoInstruccion> gettipoinstruccionsEliminados() {
		return this.tipoinstruccionsEliminados;
	}

	public void setTipoInstruccionsEliminados(List<TipoInstruccion> tipoinstruccionsEliminados) {
		this.tipoinstruccionsEliminados = tipoinstruccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoInstruccion() {
		return jComboBoxTiposSeleccionarTipoInstruccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoInstruccion(
			JComboBox jComboBoxTiposSeleccionarTipoInstruccion) {
		this.jComboBoxTiposSeleccionarTipoInstruccion = jComboBoxTiposSeleccionarTipoInstruccion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoInstruccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoInstruccion() {
		return jTextFieldValorCampoGeneralTipoInstruccion;
	}

	public void setjTextFieldValorCampoGeneralTipoInstruccion(
			JTextField jTextFieldValorCampoGeneralTipoInstruccion) {
		this.jTextFieldValorCampoGeneralTipoInstruccion = jTextFieldValorCampoGeneralTipoInstruccion;
	}

	public void setBorderResaltarValorCampoGeneralTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoInstruccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoInstruccion() {
		return this.jCheckBoxSeleccionarTodosTipoInstruccion;
	}

	public void setjCheckBoxSeleccionarTodosTipoInstruccion(
			JCheckBox jCheckBoxSeleccionarTodosTipoInstruccion) {
		this.jCheckBoxSeleccionarTodosTipoInstruccion = jCheckBoxSeleccionarTodosTipoInstruccion;
	}

	public void setBorderResaltarSeleccionarTodosTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoInstruccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoInstruccion() {
		return this.jCheckBoxSeleccionadosTipoInstruccion;
	}

	public void setjCheckBoxSeleccionadosTipoInstruccion(
			JCheckBox jCheckBoxSeleccionadosTipoInstruccion) {
		this.jCheckBoxSeleccionadosTipoInstruccion = jCheckBoxSeleccionadosTipoInstruccion;
	}
	
	public void setBorderResaltarSeleccionadosTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoInstruccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoInstruccion() {
		return this.jComboBoxTiposArchivosReportesTipoInstruccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoInstruccion(
			JComboBox jComboBoxTiposArchivosReportesTipoInstruccion) {
		this.jComboBoxTiposArchivosReportesTipoInstruccion = jComboBoxTiposArchivosReportesTipoInstruccion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoInstruccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoInstruccion() {
		return this.jComboBoxTiposReportesTipoInstruccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoInstruccion(
			JComboBox jComboBoxTiposReportesTipoInstruccion) {
		this.jComboBoxTiposReportesTipoInstruccion = jComboBoxTiposReportesTipoInstruccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoInstruccion() {
	//	return jComboBoxTiposReportesDinamicoTipoInstruccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoInstruccion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoInstruccion) {
	//	this.jComboBoxTiposReportesDinamicoTipoInstruccion = jComboBoxTiposReportesDinamicoTipoInstruccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoInstruccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoInstruccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoInstruccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInstruccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion = jComboBoxTiposArchivosReportesDinamicoTipoInstruccion;
	//}
	
	public void setBorderResaltarTiposReportesTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoInstruccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoInstruccion() {
		return this.jComboBoxTiposGraficosReportesTipoInstruccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoInstruccion(
			JComboBox jComboBoxTiposGraficosReportesTipoInstruccion) {
		this.jComboBoxTiposGraficosReportesTipoInstruccion = jComboBoxTiposGraficosReportesTipoInstruccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoInstruccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoInstruccion() {
		return this.jComboBoxTiposPaginacionTipoInstruccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoInstruccion(
			JComboBox jComboBoxTiposPaginacionTipoInstruccion) {
		this.jComboBoxTiposPaginacionTipoInstruccion = jComboBoxTiposPaginacionTipoInstruccion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoInstruccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoInstruccion() {
		return this.jComboBoxTiposRelacionesTipoInstruccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInstruccion() {
		return this.jComboBoxTiposAccionesTipoInstruccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInstruccion(
			JComboBox jComboBoxTiposRelacionesTipoInstruccion) {
		this.jComboBoxTiposRelacionesTipoInstruccion = jComboBoxTiposRelacionesTipoInstruccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInstruccion(
			JComboBox jComboBoxTiposAccionesTipoInstruccion) {
		this.jComboBoxTiposAccionesTipoInstruccion = jComboBoxTiposAccionesTipoInstruccion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoInstruccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoInstruccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoInstruccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoInstruccion() {
	//	return jCheckBoxConGraficoDinamicoTipoInstruccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoInstruccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoInstruccion) {
	//	this.jCheckBoxConGraficoDinamicoTipoInstruccion = jCheckBoxConGraficoDinamicoTipoInstruccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoInstruccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoInstruccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoInstruccion .setBorder(borderResaltar);		
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
		this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		
		this.tipoinstruccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstruccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinstruccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInstruccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Instruccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoInstruccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoInstruccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"nuevo","nuevo","Nuevo"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"duplicar","duplicar","Duplicar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"copiar","copiar","Copiar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"ver_form","ver_form","Ver"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"recargar","recargar","Recargar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoInstruccion,this.jTtoolBarTipoInstruccion,
							"cerrar","cerrar","Salir"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoInstruccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoInstruccion;
			
				this.jButtonProcesarInformacionToolBarTipoInstruccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoInstruccion;
				
		//protected JButton jButtonModificarToolBarTipoInstruccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoInstruccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoInstruccion=new JMenuMe("General");
		this.jmenuArchivoTipoInstruccion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoInstruccion=new JMenuMe("Acciones");
		this.jmenuDatosTipoInstruccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInstruccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInstruccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInstruccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoInstruccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoInstruccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoInstruccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoInstruccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoInstruccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoInstruccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoInstruccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInstruccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInstruccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoInstruccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoInstruccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoInstruccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoInstruccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoInstruccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoInstruccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoInstruccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoInstruccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoInstruccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInstruccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInstruccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInstruccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoInstruccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoInstruccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoInstruccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoInstruccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoInstruccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoInstruccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoInstruccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoInstruccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoInstruccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoInstruccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoInstruccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoInstruccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoInstruccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoInstruccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoInstruccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInstruccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInstruccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInstruccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoInstruccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoInstruccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoInstruccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInstruccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInstruccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInstruccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoInstruccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoInstruccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoInstruccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoInstruccion.add(this.jMenuItemCerrarTipoInstruccion);
			
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemNuevoTipoInstruccion);
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemNuevoGuardarCambiosTipoInstruccion);
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemNuevoRelacionesTipoInstruccion);
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemGuardarCambiosTablaTipoInstruccion);		
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemDuplicarTipoInstruccion);		
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemCopiarTipoInstruccion);		
			this.jmenuAccionesTipoInstruccion.add(this.jMenuItemVerFormTipoInstruccion);		
			
			this.jmenuDatosTipoInstruccion.add(this.jMenuItemRecargarInformacionTipoInstruccion);				
			this.jmenuDatosTipoInstruccion.add(this.jMenuItemAnterioresTipoInstruccion);				
			this.jmenuDatosTipoInstruccion.add(this.jMenuItemSiguientesTipoInstruccion);				
			this.jmenuDatosTipoInstruccion.add(this.jMenuItemAbrirOrderByTipoInstruccion);				
			this.jmenuDatosTipoInstruccion.add(this.jMenuItemMostrarOcultarTipoInstruccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoInstruccion.add(this.jMenuItemGuardarCambiosTipoInstruccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoInstruccion.add(this.jmenuArchivoTipoInstruccion);		
			this.jmenuBarTipoInstruccion.add(this.jmenuAccionesTipoInstruccion);		
			this.jmenuBarTipoInstruccion.add(this.jmenuDatosTipoInstruccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoInstruccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoInstruccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoInstruccion = new TipoInstruccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Instruccion DATOS");
			this.jInternalFrameDetalleFormTipoInstruccion = new TipoInstruccionDetalleFormJInternalFrame(jDesktopPane,this.tipoinstruccionSessionBean.getConGuardarRelaciones(),this.tipoinstruccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoInstruccion = null;//new TipoInstruccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInstruccion= new GridBagLayout();
		
		
		this.jTableDatosTipoInstruccion = new JTableMe();      
		
		String sToolTipTipoInstruccion="";
		sToolTipTipoInstruccion=TipoInstruccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInstruccion+="(Nomina.TipoInstruccion)";
		}
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInstruccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoInstruccion.setToolTipText(sToolTipTipoInstruccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoInstruccion);
		this.jTableDatosTipoInstruccion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoInstruccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoInstruccion.setRowSelectionAllowed(true);
		this.jTableDatosTipoInstruccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoInstruccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoInstruccion = new JButtonMe();
		this.jButtonDuplicarTipoInstruccion = new JButtonMe();
		this.jButtonCopiarTipoInstruccion = new JButtonMe();
		this.jButtonVerFormTipoInstruccion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoInstruccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoInstruccion = new JButtonMe();
		this.jButtonCerrarTipoInstruccion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInstruccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoInstruccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Instruccion";
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInstruccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInstruccion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInstruccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoInstruccion=new ReporteDinamicoJInternalFrame(TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoInstruccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoInstruccion=new ImportacionJInternalFrame(TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoInstruccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoInstruccion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoInstruccion.setText("Orden");
		this.jButtonAbrirOrderByTipoInstruccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInstruccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInstruccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstruccion,false,this);
			
			//this.cargarOrderByTipoInstruccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInstruccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstruccion,true,this);
			
			//this.cargarOrderByTipoInstruccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoInstruccion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInstruccion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInstruccion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoInstruccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInstruccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInstruccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoInstruccion.setText("Nuevo");
		this.jButtonDuplicarTipoInstruccion.setText("Duplicar");
		this.jButtonCopiarTipoInstruccion.setText("Copiar");
		this.jButtonVerFormTipoInstruccion.setText("Ver");
		this.jButtonNuevoRelacionesTipoInstruccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.setText("Guardar");
		this.jButtonCerrarTipoInstruccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInstruccion,"nuevo_button","Nuevo",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoInstruccion,"duplicar_button","Duplicar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoInstruccion,"copiar_button","Copiar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoInstruccion,"ver_form","Ver",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoInstruccion,"nuevorelaciones_button","Nuevo Rel",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInstruccion,"guardarcambiostabla_button","Guardar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInstruccion,"cerrar_button","Salir",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoInstruccion.setToolTipText("Nuevo"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoInstruccion.setToolTipText("Duplicar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoInstruccion.setToolTipText("Copiar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoInstruccion.setToolTipText("Ver"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoInstruccion.setToolTipText("Nuevo Rel"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.setToolTipText("Guardar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInstruccion.setToolTipText("Salir"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInstruccion";
		inputMap = this.jButtonNuevoTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInstruccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInstruccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoInstruccion";
		inputMap = this.jButtonDuplicarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoInstruccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoInstruccion"));
		
		//COPIAR
		sMapKey = "CopiarTipoInstruccion";
		inputMap = this.jButtonCopiarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoInstruccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoInstruccion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoInstruccion";
		inputMap = this.jButtonVerFormTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoInstruccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoInstruccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoInstruccion";
		inputMap = this.jButtonNuevoRelacionesTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoInstruccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoInstruccion";
		inputMap = this.jButtonModificarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoInstruccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoInstruccion";
		inputMap = this.jButtonCerrarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInstruccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInstruccion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInstruccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoInstruccion.setName("jPanelParametrosReportesTipoInstruccion"); 
		
		this.jPanelParametrosReportesAccionesTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoInstruccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoInstruccion.setName("jPanelParametrosReportesAccionesTipoInstruccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoInstruccion = new JButtonMe();
		this.jButtonRecargarInformacionTipoInstruccion.setText("Recargar");
		this.jButtonRecargarInformacionTipoInstruccion.setToolTipText("Recargar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoInstruccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoInstruccion = new JButtonMe();
		this.jButtonProcesarInformacionTipoInstruccion.setText("Procesar");
		this.jButtonProcesarInformacionTipoInstruccion.setToolTipText("Procesar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoInstruccion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoInstruccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInstruccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInstruccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstruccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoInstruccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstruccion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoInstruccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstruccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoInstruccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoInstruccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoInstruccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoInstruccion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoInstruccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInstruccion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInstruccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoInstruccion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoInstruccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoInstruccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoInstruccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInstruccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInstruccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoInstruccion = new JLabelMe();
		
		this.jLabelAccionesTipoInstruccion.setText("Acciones");		
		this.jLabelAccionesTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoInstruccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoInstruccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoInstruccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoInstruccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoInstruccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoInstruccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoInstruccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoInstruccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoInstruccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoInstruccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoInstruccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoInstruccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoInstruccion = new JButtonMe();
		//this.jButtonAnterioresTipoInstruccion.setText("<<");
        this.jButtonAnterioresTipoInstruccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoInstruccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoInstruccion = new JButtonMe();
		//this.jButtonSiguientesTipoInstruccion.setText(">>");
        this.jButtonSiguientesTipoInstruccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoInstruccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoInstruccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoInstruccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoInstruccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoInstruccion,"nuevoguardarcambios_button","Nue",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoInstruccion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoInstruccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoInstruccion";
		inputMap = this.jButtonRecargarInformacionTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoInstruccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoInstruccion";
		inputMap = this.jButtonSiguientesTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoInstruccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoInstruccion";
		inputMap = this.jButtonAnterioresTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoInstruccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoInstruccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoInstruccion.setMinimumSize(new Dimension(this.getWidth(),TipoInstruccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstruccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInstruccion.setMaximumSize(new Dimension(this.getWidth(),TipoInstruccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstruccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInstruccion.setPreferredSize(new Dimension(this.getWidth(),TipoInstruccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstruccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoInstruccion = new GridBagLayout();

			this.jPanelPaginacionTipoInstruccion.setLayout(gridaBagLayoutPaginacionTipoInstruccion);						
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 0;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonAnterioresTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					
						
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInstruccion.gridy = 0;
			
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonNuevoGuardarCambiosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
						
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInstruccion.gridy = 0;
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonSiguientesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 1;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonNuevoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInstruccion.gridy = 1;
				this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoInstruccion.add(this.jButtonNuevoRelacionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			}
			
			
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInstruccion.gridy = 1;
				this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoInstruccion.add(this.jButtonGuardarCambiosTablaTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			}
			
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 1;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonDuplicarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 1;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonCopiarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 1;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonVerFormTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 1;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoInstruccion.add(this.jButtonCerrarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
		
		
		this.jButtonRecargarInformacionTipoInstruccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInstruccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInstruccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoInstruccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInstruccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInstruccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoInstruccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInstruccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInstruccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoInstruccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInstruccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInstruccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoInstruccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInstruccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInstruccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoInstruccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInstruccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInstruccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoInstruccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstruccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstruccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoInstruccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInstruccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInstruccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoInstruccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInstruccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInstruccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoInstruccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInstruccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInstruccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoInstruccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInstruccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInstruccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoInstruccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInstruccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInstruccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoInstruccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoInstruccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoInstruccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoInstruccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoInstruccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoInstruccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoInstruccion.setLayout(gridaBagParametrosReportesTipoInstruccion);
			this.jPanelParametrosReportesAccionesTipoInstruccion.setLayout(gridaBagParametrosReportesAccionesTipoInstruccion);
			
			
			this.jPanelParametrosAuxiliar1TipoInstruccion.setLayout(gridaBagParametrosAuxiliar1TipoInstruccion);
			this.jPanelParametrosAuxiliar2TipoInstruccion.setLayout(gridaBagParametrosAuxiliar2TipoInstruccion);
			this.jPanelParametrosAuxiliar3TipoInstruccion.setLayout(gridaBagParametrosAuxiliar3TipoInstruccion);
			this.jPanelParametrosAuxiliar4TipoInstruccion.setLayout(gridaBagParametrosAuxiliar4TipoInstruccion);
			//this.jPanelParametrosAuxiliar5TipoInstruccion.setLayout(gridaBagParametrosAuxiliar2TipoInstruccion);			
			
			
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstruccion.add(this.jButtonRecargarInformacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstruccion.add(this.jComboBoxTiposPaginacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstruccion.add(this.jCheckBoxConAltoMaximoTablaTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstruccion.add(this.jComboBoxTiposArchivosReportesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstruccion.add(this.jPanelParametrosAuxiliar1TipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoInstruccion.add(this.jComboBoxTiposReportesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstruccion.add(this.jPanelParametrosAuxiliar4TipoInstruccion, this.gridBagConstraintsTipoInstruccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstruccion.add(this.jComboBoxTiposReportesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstruccion.add(this.jCheckBoxGenerarReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstruccion.add(this.jPanelParametrosAuxiliar2TipoInstruccion, this.gridBagConstraintsTipoInstruccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstruccion.add(this.jLabelAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoInstruccion.add(this.jButtonAbrirOrderByTipoInstruccion, this.gridBagConstraintsTipoInstruccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstruccion.add(this.jComboBoxTiposSeleccionarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
			
			
			/*
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstruccion.add(this.jCheckBoxSeleccionarTodosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInstruccion.add(this.jCheckBoxSeleccionarTodosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);															
				
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstruccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInstruccion.add(this.jCheckBoxSeleccionadosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstruccion.add(this.jPanelParametrosAuxiliar3TipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstruccion.add(this.jComboBoxTiposRelacionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
				
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstruccion.add(this.jComboBoxTiposAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoInstruccion = new GridBagLayout();

			this.jScrollPanelDatosTipoInstruccion.setLayout(gridaBagLayoutDatosTipoInstruccion);
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = 0;
			this.gridBagConstraintsTipoInstruccion.gridx = 0;
			
			this.jScrollPanelDatosTipoInstruccion.add(this.jTableDatosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoInstruccion.setViewportView(this.jTableDatosTipoInstruccion);
		this.jTableDatosTipoInstruccion.setFillsViewportHeight(true);
		this.jTableDatosTipoInstruccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoInstruccion= new GridBagLayout();
		this.jPanelAccionesTipoInstruccion.setLayout(gridaBagLayoutAccionesTipoInstruccion);
		
		
		/*	
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = 0;
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
			
		this.jPanelAccionesTipoInstruccion.add(this.jButtonNuevoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInstruccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInstruccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInstruccion.gridx = 0;		
			//this.gridBagConstraintsTipoInstruccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInstruccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoInstruccion.gridx = 0;		
		//this.gridBagConstraintsTipoInstruccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoInstruccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoInstruccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);								
		
		
		/*
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		*/		
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInstruccion.gridx =0;
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInstruccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
				
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoInstruccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInstruccion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoInstruccion.setLayout(gridaBagLayoutBusquedasParametrosTipoInstruccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoInstruccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInstruccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstruccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstruccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoInstruccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoInstruccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoInstruccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoInstruccion.setName("jPanelReporteDinamicoTipoInstruccion"); 
		
		this.jPanelReporteDinamicoTipoInstruccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInstruccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInstruccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoInstruccion.setLayout(gridaBagLayoutReporteDinamicoTipoInstruccion);
		
		
		this.jInternalFrameReporteDinamicoTipoInstruccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoInstruccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInstruccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoInstruccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoInstruccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoInstruccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoInstruccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoInstruccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoInstruccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoInstruccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoInstruccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoInstruccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInstruccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInstruccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoInstruccion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoInstruccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jLabelColumnasSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoInstruccion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoInstruccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoInstruccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoInstruccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInstruccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInstruccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoInstruccion=new JScrollPane(this.jListColumnasSelectReporteTipoInstruccion);
			
			this.jScrollColumnasSelectReporteTipoInstruccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInstruccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInstruccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInstruccion.add(this.jListColumnasSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jScrollColumnasSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoInstruccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoInstruccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jLabelRelacionesSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoInstruccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoInstruccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoInstruccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoInstruccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInstruccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInstruccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoInstruccion=new JScrollPane(this.jListRelacionesSelectReporteTipoInstruccion);
			
			this.jScrollRelacionesSelectReporteTipoInstruccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInstruccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInstruccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInstruccion.add(this.jListRelacionesSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jScrollRelacionesSelectReporteTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoInstruccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoInstruccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoInstruccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoInstruccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoInstruccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoInstruccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInstruccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInstruccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoInstruccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoInstruccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jLabelGenerarExcelReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoInstruccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoInstruccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoInstruccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoInstruccion.setToolTipText("Generar EXCEL"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoInstruccion.add(this.jButtonGenerarExcelReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jComboBoxTiposReportesDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoInstruccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoInstruccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jLabelTiposArchivoReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoInstruccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoInstruccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoInstruccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoInstruccion.setToolTipText("Generar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jButtonGenerarReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoInstruccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoInstruccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoInstruccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoInstruccion.setToolTipText("Cancelar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstruccion.add(this.jButtonCerrarReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoInstruccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoInstruccion= new JScrollPane(jPanelReporteDinamicoTipoInstruccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoInstruccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInstruccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInstruccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoInstruccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoInstruccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoInstruccion);
		this.jInternalFrameReporteDinamicoTipoInstruccion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoInstruccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoInstruccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoInstruccion.setName("jPanelImportacionTipoInstruccion"); 
		
		this.jPanelImportacionTipoInstruccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInstruccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInstruccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoInstruccion.setLayout(gridaBagLayoutImportacionTipoInstruccion);
		
		
		this.jInternalFrameImportacionTipoInstruccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoInstruccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoInstruccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInstruccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoInstruccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInstruccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInstruccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoInstruccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInstruccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInstruccion.setResizable(true);
	    this.jInternalFrameImportacionTipoInstruccion.setClosable(true);
	    this.jInternalFrameImportacionTipoInstruccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoInstruccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInstruccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInstruccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoInstruccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInstruccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInstruccion.setResizable(true);
	    this.jInternalFrameImportacionTipoInstruccion.setClosable(true);
	    this.jInternalFrameImportacionTipoInstruccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoInstruccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInstruccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInstruccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoInstruccion = new JLabelMe();

		this.jLabelArchivoImportacionTipoInstruccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInstruccion.add(this.jLabelArchivoImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoInstruccion = new JFileChooser();		
		this.jFileChooserImportacionTipoInstruccion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoInstruccion = new JButtonMe();
		this.jButtonAbrirImportacionTipoInstruccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoInstruccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoInstruccion.setToolTipText("Generar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstruccion.add(this.jButtonAbrirImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoInstruccion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoInstruccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInstruccion.add(this.jLabelPathArchivoImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoInstruccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoInstruccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInstruccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInstruccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstruccion.add(this.jTextFieldPathArchivoImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoInstruccion = new JButtonMe();
		this.jButtonGenerarImportacionTipoInstruccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoInstruccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoInstruccion.setToolTipText("Generar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstruccion.add(this.jButtonGenerarImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoInstruccion = new JButtonMe();
		this.jButtonCerrarImportacionTipoInstruccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoInstruccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoInstruccion.setToolTipText("Cancelar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstruccion.add(this.jButtonCerrarImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoInstruccion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoInstruccion= new JScrollPane(jPanelImportacionTipoInstruccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoInstruccion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoInstruccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoInstruccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoInstruccion);
		this.jInternalFrameImportacionTipoInstruccion.getContentPane().add(this.jScrollPanelImportacionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoInstruccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoInstruccion = new JButtonMe();
			this.jButtonAbrirOrderByTipoInstruccion.setText("Orden");
			this.jButtonAbrirOrderByTipoInstruccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInstruccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoInstruccion";
			inputMap = this.jButtonAbrirOrderByTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoInstruccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoInstruccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoInstruccion.setName("jPanelOrderByTipoInstruccion"); 
			
			this.jPanelOrderByTipoInstruccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInstruccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInstruccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoInstruccion.setLayout(gridaBagLayoutOrderByTipoInstruccion);
			
			
			this.jTableDatosTipoInstruccionOrderBy = new JTableMe();        
			this.jTableDatosTipoInstruccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoInstruccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoInstruccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoInstruccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoInstruccionOrderBy.setViewportView(this.jTableDatosTipoInstruccionOrderBy);
			this.jTableDatosTipoInstruccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoInstruccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoInstruccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoInstruccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoInstruccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoInstruccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoInstruccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoInstruccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoInstruccion.setTitle("Orden");
			this.jInternalFrameOrderByTipoInstruccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoInstruccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoInstruccion.setResizable(true);
			this.jInternalFrameOrderByTipoInstruccion.setClosable(true);
			this.jInternalFrameOrderByTipoInstruccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoInstruccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInstruccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInstruccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoInstruccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoInstruccion.ipady =150;
				
			this.jPanelOrderByTipoInstruccion.add(jScrollPanelDatosTipoInstruccionOrderBy, this.gridBagConstraintsTipoInstruccion);//this.jTableDatosTipoInstruccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoInstruccion = new JButtonMe();
			this.jButtonCerrarOrderByTipoInstruccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoInstruccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoInstruccion.setToolTipText("Cancelar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoInstruccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoInstruccion.add(this.jButtonCerrarOrderByTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoInstruccion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoInstruccion= new JScrollPane(jPanelOrderByTipoInstruccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoInstruccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoInstruccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoInstruccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoInstruccion);
			
			this.jInternalFrameOrderByTipoInstruccion.getContentPane().add(this.jScrollPanelOrderByTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
		
		} else {
			this.jButtonAbrirOrderByTipoInstruccion = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoinstruccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoInstruccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoInstruccion.getRowHeight();//TipoInstruccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInstruccion.isSelected()) {
					iHeightTable=TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInstruccion.isSelected()) {
					iHeightTable=TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInstruccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoInstruccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInstruccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInstruccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoInstruccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInstruccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInstruccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoInstruccion!=null && this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoInstruccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoInstruccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoInstruccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoInstruccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInstruccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInstruccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoinstruccionLogic.getTipoInstruccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstruccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoInstruccion> TraerTipoInstruccionBeans(List<TipoInstruccion> tipoinstruccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoInstruccion tipoinstruccion:tipoinstruccions) {
					
				if(!(TipoInstruccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoInstruccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoinstruccion.setsDetalleGeneralEntityReporte(TipoInstruccionConstantesFunciones.getTipoInstruccionDescripcion(tipoinstruccion));
										
						
					
					

					if(tipoinstruccion.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{tipoinstruccion.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(tipoinstruccion.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoinstruccion.setsDetalleGeneralEntityReporte(tipoinstruccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoinstruccionbeans.add(tipoinstruccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoinstruccions;
    }
	//PARA REPORTES FIN
}
