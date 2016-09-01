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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.TipoValorVariableNomiConstantesFunciones;

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
public class TipoValorVariableNomiJInternalFrame extends TipoValorVariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoValorVariableNomi;
	
	protected JMenuBar jmenuBarTipoValorVariableNomi;
	
	protected JMenu jmenuTipoValorVariableNomi;
	protected JMenu jmenuDatosTipoValorVariableNomi;
	protected JMenu jmenuArchivoTipoValorVariableNomi;
	protected JMenu jmenuAccionesTipoValorVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoValorVariableNomi;	
	protected GridBagConstraints gridBagConstraintsTipoValorVariableNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoValorVariableNomiDetalleFormJInternalFrame jInternalFrameDetalleFormTipoValorVariableNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoValorVariableNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoValorVariableNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoValorVariableNomi> tipovalorvariablenomis;		
	public List<TipoValorVariableNomi> tipovalorvariablenomisEliminados;	
	public List<TipoValorVariableNomi> tipovalorvariablenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoValorVariableNomi;		
	protected JButton jButtonAbrirOrderByTipoValorVariableNomi;
	
	
	//protected JPanel jPanelOrderByTipoValorVariableNomi;
	//public JScrollPane jScrollPanelOrderByTipoValorVariableNomi;	
	//protected JButton jButtonCerrarOrderByTipoValorVariableNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoValorVariableNomiLogic tipovalorvariablenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoValorVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoValorVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoValorVariableNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoValorVariableNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoValorVariableNomi;
	//public JScrollPane jScrollPanelImportacionTipoValorVariableNomi;
	
	
	
	protected JPanel jPanelAccionesTipoValorVariableNomi;
	
    protected JPanel jPanelPaginacionTipoValorVariableNomi;
    protected JPanel jPanelParametrosReportesTipoValorVariableNomi;
	protected JPanel jPanelParametrosReportesAccionesTipoValorVariableNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoValorVariableNomi;
	protected JPanel jPanelParametrosAuxiliar2TipoValorVariableNomi;
	protected JPanel jPanelParametrosAuxiliar3TipoValorVariableNomi;
	protected JPanel jPanelParametrosAuxiliar4TipoValorVariableNomi;
	//protected JPanel jPanelParametrosAuxiliar5TipoValorVariableNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoValorVariableNomi;
	//protected JPanel jPanelImportacionTipoValorVariableNomi;
	
	
	public JTable jTableDatosTipoValorVariableNomi;
	
	
	
	//public JTable jTableDatosTipoValorVariableNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoValorVariableNomi;
	protected JButton jButtonDuplicarTipoValorVariableNomi;
	protected JButton jButtonCopiarTipoValorVariableNomi;
	protected JButton jButtonVerFormTipoValorVariableNomi;
	protected JButton jButtonNuevoRelacionesTipoValorVariableNomi;
	protected JButton jButtonModificarTipoValorVariableNomi;
	
    protected JButton jButtonGuardarCambiosTablaTipoValorVariableNomi;
	protected JButton jButtonCerrarTipoValorVariableNomi;
	
	
	protected JButton jButtonRecargarInformacionTipoValorVariableNomi;
	protected JButton jButtonProcesarInformacionTipoValorVariableNomi;
	
	
	protected JButton jButtonAnterioresTipoValorVariableNomi;
	protected JButton jButtonSiguientesTipoValorVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosTipoValorVariableNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoValorVariableNomi;
	//protected JButton jButtonCerrarReporteDinamicoTipoValorVariableNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoValorVariableNomi;
	//protected JButton jButtonGenerarImportacionTipoValorVariableNomi;
	//protected JButton jButtonCerrarImportacionTipoValorVariableNomi;
	//protected JFileChooser jFileChooserImportacionTipoValorVariableNomi;
	//protected File fileImportacionTipoValorVariableNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoValorVariableNomi;
	protected JButton jButtonDuplicarToolBarTipoValorVariableNomi;
	protected JButton jButtonNuevoRelacionesToolBarTipoValorVariableNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoValorVariableNomi;
	protected JButton jButtonCopiarToolBarTipoValorVariableNomi;
	protected JButton jButtonVerFormToolBarTipoValorVariableNomi;
	public JButton jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoValorVariableNomi;
	protected JButton jButtonCerrarToolBarTipoValorVariableNomi;
	
	protected JButton jButtonRecargarInformacionToolBarTipoValorVariableNomi;
	protected JButton jButtonProcesarInformacionToolBarTipoValorVariableNomi;
	protected JButton jButtonAnterioresToolBarTipoValorVariableNomi;
	protected JButton jButtonSiguientesToolBarTipoValorVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi;
	protected JButton jButtonAbrirOrderByToolBarTipoValorVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoValorVariableNomi;
	protected JMenuItem jMenuItemDuplicarTipoValorVariableNomi;
	protected JMenuItem jMenuItemNuevoRelacionesTipoValorVariableNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoValorVariableNomi;
	protected JMenuItem jMenuItemCopiarTipoValorVariableNomi;
	protected JMenuItem jMenuItemVerFormTipoValorVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoValorVariableNomi;
	protected JMenuItem jMenuItemCerrarTipoValorVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoValorVariableNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoValorVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoValorVariableNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoValorVariableNomi;
	protected JMenuItem jMenuItemProcesarInformacionTipoValorVariableNomi;
	protected JMenuItem jMenuItemAnterioresTipoValorVariableNomi;
	protected JMenuItem jMenuItemSiguientesTipoValorVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoValorVariableNomi;
	protected JMenuItem jMenuItemAbrirOrderByTipoValorVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoValorVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoValorVariableNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoValorVariableNomi;
	protected JCheckBox jCheckBoxSeleccionadosTipoValorVariableNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoValorVariableNomi;
	protected JCheckBox jCheckBoxConGraficoReporteTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoValorVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoValorVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoValorVariableNomi;
	protected JTextField jTextFieldValorCampoGeneralTipoValorVariableNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoValorVariableNomi;
	//public JList<Reporte> jListColumnasSelectReporteTipoValorVariableNomi;
	//public JScrollPane jScrollColumnasSelectReporteTipoValorVariableNomi;
	
	//public JLabel jLabelRelacionesSelectReporteTipoValorVariableNomi;
	//public JList<Reporte> jListRelacionesSelectReporteTipoValorVariableNomi;
	//public JScrollPane jScrollRelacionesSelectReporteTipoValorVariableNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoValorVariableNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoValorVariableNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi;
	
		
	//public JLabel jLabelArchivoImportacionTipoValorVariableNomi;	
	//public JLabel jLabelPathArchivoImportacionTipoValorVariableNomi;
	//protected JTextField jTextFieldPathArchivoImportacionTipoValorVariableNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoValorVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoValorVariableNomi;
	
	//public JLabel jLabelColumnaCategoriaValorTipoValorVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoValorVariableNomi;
	
	//public JLabel jLabelColumnasValoresGraficoTipoValorVariableNomi;
	//public JList<Reporte> jListColumnasValoresGraficoTipoValorVariableNomi;
	//public JScrollPane jScrollColumnasValoresGraficoTipoValorVariableNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoValorVariableNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoValorVariableNomi;	
	
	
	
	
	
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
	public TipoValorVariableNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValorVariableNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoValorVariableNomi)	{
		this.jButtonRecargarInformacionTipoValorVariableNomi = jButtonRecargarInformacionTipoValorVariableNomi;
	}
	
	public JButton getjButtonProcesarInformacionTipoValorVariableNomi() {
		return this.jButtonProcesarInformacionTipoValorVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoValorVariableNomi)	{
		this.jButtonProcesarInformacionTipoValorVariableNomi = jButtonProcesarInformacionTipoValorVariableNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoValorVariableNomi() {
		return this.jButtonRecargarInformacionTipoValorVariableNomi;
	}
	
	
	public List<TipoValorVariableNomi> gettipovalorvariablenomis() {
		return this.tipovalorvariablenomis;
	}

	public void settipovalorvariablenomis(List<TipoValorVariableNomi> tipovalorvariablenomis) {
		this.tipovalorvariablenomis = tipovalorvariablenomis;
	}
	
	public List<TipoValorVariableNomi> gettipovalorvariablenomisAux() {
		return this.tipovalorvariablenomisAux;
	}

	public void settipovalorvariablenomisAux(List<TipoValorVariableNomi> tipovalorvariablenomisAux) {
		this.tipovalorvariablenomisAux = tipovalorvariablenomisAux;
	}
	
	public List<TipoValorVariableNomi> gettipovalorvariablenomisEliminados() {
		return this.tipovalorvariablenomisEliminados;
	}

	public void setTipoValorVariableNomisEliminados(List<TipoValorVariableNomi> tipovalorvariablenomisEliminados) {
		this.tipovalorvariablenomisEliminados = tipovalorvariablenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoValorVariableNomi() {
		return jComboBoxTiposSeleccionarTipoValorVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoValorVariableNomi(
			JComboBox jComboBoxTiposSeleccionarTipoValorVariableNomi) {
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi = jComboBoxTiposSeleccionarTipoValorVariableNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoValorVariableNomi() {
		return jTextFieldValorCampoGeneralTipoValorVariableNomi;
	}

	public void setjTextFieldValorCampoGeneralTipoValorVariableNomi(
			JTextField jTextFieldValorCampoGeneralTipoValorVariableNomi) {
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi = jTextFieldValorCampoGeneralTipoValorVariableNomi;
	}

	public void setBorderResaltarValorCampoGeneralTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoValorVariableNomi() {
		return this.jCheckBoxSeleccionarTodosTipoValorVariableNomi;
	}

	public void setjCheckBoxSeleccionarTodosTipoValorVariableNomi(
			JCheckBox jCheckBoxSeleccionarTodosTipoValorVariableNomi) {
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi = jCheckBoxSeleccionarTodosTipoValorVariableNomi;
	}

	public void setBorderResaltarSeleccionarTodosTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoValorVariableNomi() {
		return this.jCheckBoxSeleccionadosTipoValorVariableNomi;
	}

	public void setjCheckBoxSeleccionadosTipoValorVariableNomi(
			JCheckBox jCheckBoxSeleccionadosTipoValorVariableNomi) {
		this.jCheckBoxSeleccionadosTipoValorVariableNomi = jCheckBoxSeleccionadosTipoValorVariableNomi;
	}
	
	public void setBorderResaltarSeleccionadosTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoValorVariableNomi() {
		return this.jComboBoxTiposArchivosReportesTipoValorVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoValorVariableNomi(
			JComboBox jComboBoxTiposArchivosReportesTipoValorVariableNomi) {
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi = jComboBoxTiposArchivosReportesTipoValorVariableNomi;
	}

	public void setBorderResaltarTiposArchivosReportesTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoValorVariableNomi() {
		return this.jComboBoxTiposReportesTipoValorVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoValorVariableNomi(
			JComboBox jComboBoxTiposReportesTipoValorVariableNomi) {
		this.jComboBoxTiposReportesTipoValorVariableNomi = jComboBoxTiposReportesTipoValorVariableNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoValorVariableNomi() {
	//	return jComboBoxTiposReportesDinamicoTipoValorVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoValorVariableNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoValorVariableNomi) {
	//	this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi = jComboBoxTiposReportesDinamicoTipoValorVariableNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi = jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi;
	//}
	
	public void setBorderResaltarTiposReportesTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoValorVariableNomi() {
		return this.jComboBoxTiposGraficosReportesTipoValorVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoValorVariableNomi(
			JComboBox jComboBoxTiposGraficosReportesTipoValorVariableNomi) {
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi = jComboBoxTiposGraficosReportesTipoValorVariableNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoValorVariableNomi() {
		return this.jComboBoxTiposPaginacionTipoValorVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoValorVariableNomi(
			JComboBox jComboBoxTiposPaginacionTipoValorVariableNomi) {
		this.jComboBoxTiposPaginacionTipoValorVariableNomi = jComboBoxTiposPaginacionTipoValorVariableNomi;
	}
	
	public void setBorderResaltarTiposPaginacionTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoValorVariableNomi() {
		return this.jComboBoxTiposRelacionesTipoValorVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoValorVariableNomi() {
		return this.jComboBoxTiposAccionesTipoValorVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoValorVariableNomi(
			JComboBox jComboBoxTiposRelacionesTipoValorVariableNomi) {
		this.jComboBoxTiposRelacionesTipoValorVariableNomi = jComboBoxTiposRelacionesTipoValorVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoValorVariableNomi(
			JComboBox jComboBoxTiposAccionesTipoValorVariableNomi) {
		this.jComboBoxTiposAccionesTipoValorVariableNomi = jComboBoxTiposAccionesTipoValorVariableNomi;
	}
	
	public void setBorderResaltarTiposRelacionesTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoValorVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoValorVariableNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoValorVariableNomi() {
	//	return jCheckBoxConGraficoDinamicoTipoValorVariableNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoValorVariableNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoValorVariableNomi) {
	//	this.jCheckBoxConGraficoDinamicoTipoValorVariableNomi = jCheckBoxConGraficoDinamicoTipoValorVariableNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoValorVariableNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoValorVariableNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoValorVariableNomi .setBorder(borderResaltar);		
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
		this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		
		this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovalorvariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoValorVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoValorVariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Valor Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoValorVariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoValorVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoValorVariableNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"nuevo","nuevo","Nuevo"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"duplicar","duplicar","Duplicar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"copiar","copiar","Copiar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"ver_form","ver_form","Ver"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"recargar","recargar","Recargar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoValorVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,
							"cerrar","cerrar","Salir"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoValorVariableNomi;
			
				this.jButtonProcesarInformacionToolBarTipoValorVariableNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoValorVariableNomi;
				
		//protected JButton jButtonModificarToolBarTipoValorVariableNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoValorVariableNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoValorVariableNomi=new JMenuMe("General");
		this.jmenuArchivoTipoValorVariableNomi=new JMenuMe("Archivo");
		this.jmenuAccionesTipoValorVariableNomi=new JMenuMe("Acciones");
		this.jmenuDatosTipoValorVariableNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoValorVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoValorVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoValorVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoValorVariableNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoValorVariableNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoValorVariableNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoValorVariableNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoValorVariableNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoValorVariableNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoValorVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoValorVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoValorVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoValorVariableNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoValorVariableNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoValorVariableNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoValorVariableNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoValorVariableNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoValorVariableNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoValorVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoValorVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoValorVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoValorVariableNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoValorVariableNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoValorVariableNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoValorVariableNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoValorVariableNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoValorVariableNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoValorVariableNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoValorVariableNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoValorVariableNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoValorVariableNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoValorVariableNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoValorVariableNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoValorVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoValorVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoValorVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoValorVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoValorVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoValorVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoValorVariableNomi.add(this.jMenuItemCerrarTipoValorVariableNomi);
			
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemNuevoTipoValorVariableNomi);
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi);
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemNuevoRelacionesTipoValorVariableNomi);
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi);		
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemDuplicarTipoValorVariableNomi);		
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemCopiarTipoValorVariableNomi);		
			this.jmenuAccionesTipoValorVariableNomi.add(this.jMenuItemVerFormTipoValorVariableNomi);		
			
			this.jmenuDatosTipoValorVariableNomi.add(this.jMenuItemRecargarInformacionTipoValorVariableNomi);				
			this.jmenuDatosTipoValorVariableNomi.add(this.jMenuItemAnterioresTipoValorVariableNomi);				
			this.jmenuDatosTipoValorVariableNomi.add(this.jMenuItemSiguientesTipoValorVariableNomi);				
			this.jmenuDatosTipoValorVariableNomi.add(this.jMenuItemAbrirOrderByTipoValorVariableNomi);				
			this.jmenuDatosTipoValorVariableNomi.add(this.jMenuItemMostrarOcultarTipoValorVariableNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoValorVariableNomi.add(this.jMenuItemGuardarCambiosTipoValorVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoValorVariableNomi.add(this.jmenuArchivoTipoValorVariableNomi);		
			this.jmenuBarTipoValorVariableNomi.add(this.jmenuAccionesTipoValorVariableNomi);		
			this.jmenuBarTipoValorVariableNomi.add(this.jmenuDatosTipoValorVariableNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoValorVariableNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoValorVariableNomi() {
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
			//this.jInternalFrameDetalleTipoValorVariableNomi = new TipoValorVariableNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Valor Variable DATOS");
			this.jInternalFrameDetalleFormTipoValorVariableNomi = new TipoValorVariableNomiDetalleFormJInternalFrame(jDesktopPane,this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones(),this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoValorVariableNomi = null;//new TipoValorVariableNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoValorVariableNomi= new GridBagLayout();
		
		
		this.jTableDatosTipoValorVariableNomi = new JTableMe();      
		
		String sToolTipTipoValorVariableNomi="";
		sToolTipTipoValorVariableNomi=TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoValorVariableNomi+="(Nomina.TipoValorVariableNomi)";
		}
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoValorVariableNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoValorVariableNomi.setToolTipText(sToolTipTipoValorVariableNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoValorVariableNomi);
		this.jTableDatosTipoValorVariableNomi.setAutoCreateRowSorter(true);
		this.jTableDatosTipoValorVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoValorVariableNomi.setRowSelectionAllowed(true);
		this.jTableDatosTipoValorVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoValorVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoValorVariableNomi = new JButtonMe();
		this.jButtonDuplicarTipoValorVariableNomi = new JButtonMe();
		this.jButtonCopiarTipoValorVariableNomi = new JButtonMe();
		this.jButtonVerFormTipoValorVariableNomi = new JButtonMe();
		this.jButtonNuevoRelacionesTipoValorVariableNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi = new JButtonMe();
		this.jButtonCerrarTipoValorVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoValorVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoValorVariableNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Valor Variable";
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoValorVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoValorVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoValorVariableNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoValorVariableNomi=new ReporteDinamicoJInternalFrame(TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoValorVariableNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoValorVariableNomi=new ImportacionJInternalFrame(TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoValorVariableNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoValorVariableNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoValorVariableNomi.setText("Orden");
		this.jButtonAbrirOrderByTipoValorVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoValorVariableNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoValorVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValorVariableNomi,false,this);
			
			//this.cargarOrderByTipoValorVariableNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoValorVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValorVariableNomi,true,this);
			
			//this.cargarOrderByTipoValorVariableNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoValorVariableNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoValorVariableNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoValorVariableNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoValorVariableNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoValorVariableNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoValorVariableNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoValorVariableNomi.setText("Nuevo");
		this.jButtonDuplicarTipoValorVariableNomi.setText("Duplicar");
		this.jButtonCopiarTipoValorVariableNomi.setText("Copiar");
		this.jButtonVerFormTipoValorVariableNomi.setText("Ver");
		this.jButtonNuevoRelacionesTipoValorVariableNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setText("Guardar");
		this.jButtonCerrarTipoValorVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoValorVariableNomi,"nuevo_button","Nuevo",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoValorVariableNomi,"duplicar_button","Duplicar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoValorVariableNomi,"copiar_button","Copiar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoValorVariableNomi,"ver_form","Ver",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoValorVariableNomi,"nuevorelaciones_button","Nuevo Rel",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoValorVariableNomi,"guardarcambiostabla_button","Guardar",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoValorVariableNomi,"cerrar_button","Salir",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoValorVariableNomi.setToolTipText("Nuevo"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoValorVariableNomi.setToolTipText("Duplicar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoValorVariableNomi.setToolTipText("Copiar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoValorVariableNomi.setToolTipText("Ver"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoValorVariableNomi.setToolTipText("Nuevo Rel"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setToolTipText("Guardar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoValorVariableNomi.setToolTipText("Salir"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoValorVariableNomi";
		inputMap = this.jButtonNuevoTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoValorVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoValorVariableNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoValorVariableNomi";
		inputMap = this.jButtonDuplicarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoValorVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoValorVariableNomi"));
		
		//COPIAR
		sMapKey = "CopiarTipoValorVariableNomi";
		inputMap = this.jButtonCopiarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoValorVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoValorVariableNomi"));
		
		//VEr FORM
		sMapKey = "VerFormTipoValorVariableNomi";
		inputMap = this.jButtonVerFormTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoValorVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoValorVariableNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoValorVariableNomi";
		inputMap = this.jButtonNuevoRelacionesTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoValorVariableNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoValorVariableNomi";
		inputMap = this.jButtonModificarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoValorVariableNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoValorVariableNomi";
		inputMap = this.jButtonCerrarTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoValorVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoValorVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoValorVariableNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoValorVariableNomi.setName("jPanelParametrosReportesTipoValorVariableNomi"); 
		
		this.jPanelParametrosReportesAccionesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoValorVariableNomi.setName("jPanelParametrosReportesAccionesTipoValorVariableNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoValorVariableNomi = new JButtonMe();
		this.jButtonRecargarInformacionTipoValorVariableNomi.setText("Recargar");
		this.jButtonRecargarInformacionTipoValorVariableNomi.setToolTipText("Recargar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoValorVariableNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoValorVariableNomi = new JButtonMe();
		this.jButtonProcesarInformacionTipoValorVariableNomi.setText("Procesar");
		this.jButtonProcesarInformacionTipoValorVariableNomi.setToolTipText("Procesar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoValorVariableNomi.setVisible(false);
			
		this.jButtonProcesarInformacionTipoValorVariableNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoValorVariableNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoValorVariableNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setText("TIPO");       
		this.jComboBoxTiposReportesTipoValorVariableNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoValorVariableNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoValorVariableNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoValorVariableNomi.setText("Accion");
		this.jComboBoxTiposRelacionesTipoValorVariableNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoValorVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoValorVariableNomi = new JLabelMe();
		
		this.jLabelAccionesTipoValorVariableNomi.setText("Acciones");		
		this.jLabelAccionesTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoValorVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoValorVariableNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoValorVariableNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoValorVariableNomi = new JButtonMe();
		//this.jButtonAnterioresTipoValorVariableNomi.setText("<<");
        this.jButtonAnterioresTipoValorVariableNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoValorVariableNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoValorVariableNomi = new JButtonMe();
		//this.jButtonSiguientesTipoValorVariableNomi.setText(">>");
        this.jButtonSiguientesTipoValorVariableNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoValorVariableNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoValorVariableNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoValorVariableNomi,"nuevoguardarcambios_button","Nue",this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoValorVariableNomi";
		inputMap = this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoValorVariableNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoValorVariableNomi";
		inputMap = this.jButtonRecargarInformacionTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoValorVariableNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoValorVariableNomi";
		inputMap = this.jButtonSiguientesTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoValorVariableNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoValorVariableNomi";
		inputMap = this.jButtonAnterioresTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoValorVariableNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoValorVariableNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoValorVariableNomi.setMinimumSize(new Dimension(this.getWidth(),TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoValorVariableNomi.setMaximumSize(new Dimension(this.getWidth(),TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoValorVariableNomi.setPreferredSize(new Dimension(this.getWidth(),TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoValorVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoValorVariableNomi = new GridBagLayout();

			this.jPanelPaginacionTipoValorVariableNomi.setLayout(gridaBagLayoutPaginacionTipoValorVariableNomi);						
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonAnterioresTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					
						
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
			
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonNuevoGuardarCambiosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
						
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonSiguientesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonNuevoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
				this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonNuevoRelacionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			}
			
			
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
				this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonGuardarCambiosTablaTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			}
			
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonDuplicarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonCopiarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonVerFormTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoValorVariableNomi.add(this.jButtonCerrarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
		
		
		this.jButtonRecargarInformacionTipoValorVariableNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoValorVariableNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoValorVariableNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoValorVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoValorVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoValorVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoValorVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoValorVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoValorVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoValorVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoValorVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoValorVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValorVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoValorVariableNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoValorVariableNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoValorVariableNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoValorVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoValorVariableNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoValorVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoValorVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoValorVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoValorVariableNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoValorVariableNomi.setLayout(gridaBagParametrosReportesTipoValorVariableNomi);
			this.jPanelParametrosReportesAccionesTipoValorVariableNomi.setLayout(gridaBagParametrosReportesAccionesTipoValorVariableNomi);
			
			
			this.jPanelParametrosAuxiliar1TipoValorVariableNomi.setLayout(gridaBagParametrosAuxiliar1TipoValorVariableNomi);
			this.jPanelParametrosAuxiliar2TipoValorVariableNomi.setLayout(gridaBagParametrosAuxiliar2TipoValorVariableNomi);
			this.jPanelParametrosAuxiliar3TipoValorVariableNomi.setLayout(gridaBagParametrosAuxiliar3TipoValorVariableNomi);
			this.jPanelParametrosAuxiliar4TipoValorVariableNomi.setLayout(gridaBagParametrosAuxiliar4TipoValorVariableNomi);
			//this.jPanelParametrosAuxiliar5TipoValorVariableNomi.setLayout(gridaBagParametrosAuxiliar2TipoValorVariableNomi);			
			
			
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jButtonRecargarInformacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValorVariableNomi.add(this.jComboBoxTiposPaginacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValorVariableNomi.add(this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoValorVariableNomi.add(this.jComboBoxTiposArchivosReportesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jPanelParametrosAuxiliar1TipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoValorVariableNomi.add(this.jComboBoxTiposReportesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jPanelParametrosAuxiliar4TipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jComboBoxTiposReportesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jCheckBoxGenerarReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jPanelParametrosAuxiliar2TipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jLabelAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jButtonAbrirOrderByTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jComboBoxTiposSeleccionarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			
			
			/*
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jCheckBoxSeleccionarTodosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoValorVariableNomi.add(this.jCheckBoxSeleccionarTodosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);															
				
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoValorVariableNomi.add(this.jCheckBoxSeleccionadosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jPanelParametrosAuxiliar3TipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jComboBoxTiposRelacionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
				
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jComboBoxTiposAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
	
				
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoValorVariableNomi.add(this.jTextFieldValorCampoGeneralTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoValorVariableNomi = new GridBagLayout();

			this.jScrollPanelDatosTipoValorVariableNomi.setLayout(gridaBagLayoutDatosTipoValorVariableNomi);
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
			
			this.jScrollPanelDatosTipoValorVariableNomi.add(this.jTableDatosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoValorVariableNomi.setViewportView(this.jTableDatosTipoValorVariableNomi);
		this.jTableDatosTipoValorVariableNomi.setFillsViewportHeight(true);
		this.jTableDatosTipoValorVariableNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoValorVariableNomi= new GridBagLayout();
		this.jPanelAccionesTipoValorVariableNomi.setLayout(gridaBagLayoutAccionesTipoValorVariableNomi);
		
		
		/*	
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
			
		this.jPanelAccionesTipoValorVariableNomi.add(this.jButtonNuevoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoValorVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoValorVariableNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;		
			//this.gridBagConstraintsTipoValorVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoValorVariableNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;		
		//this.gridBagConstraintsTipoValorVariableNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoValorVariableNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoValorVariableNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);								
		
		
		/*
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		*/		
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoValorVariableNomi.gridx =0;
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoValorVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
				
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoValorVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoValorVariableNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoValorVariableNomi.setLayout(gridaBagLayoutBusquedasParametrosTipoValorVariableNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoValorVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
			
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoValorVariableNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoValorVariableNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoValorVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoValorVariableNomi.setName("jPanelReporteDinamicoTipoValorVariableNomi"); 
		
		this.jPanelReporteDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoValorVariableNomi.setLayout(gridaBagLayoutReporteDinamicoTipoValorVariableNomi);
		
		
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoValorVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoValorVariableNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoValorVariableNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jLabelColumnasSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoValorVariableNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoValorVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoValorVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoValorVariableNomi=new JScrollPane(this.jListColumnasSelectReporteTipoValorVariableNomi);
			
			this.jScrollColumnasSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jListColumnasSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jScrollColumnasSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoValorVariableNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoValorVariableNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jLabelRelacionesSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoValorVariableNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoValorVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoValorVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoValorVariableNomi=new JScrollPane(this.jListRelacionesSelectReporteTipoValorVariableNomi);
			
			this.jScrollRelacionesSelectReporteTipoValorVariableNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoValorVariableNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoValorVariableNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jListRelacionesSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jScrollRelacionesSelectReporteTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoValorVariableNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoValorVariableNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoValorVariableNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jLabelGenerarExcelReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi.setToolTipText("Generar EXCEL"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jComboBoxTiposReportesDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jLabelTiposArchivoReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jComboBoxTiposArchivosReportesDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoValorVariableNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoValorVariableNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoValorVariableNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoValorVariableNomi.setToolTipText("Generar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jButtonGenerarReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoValorVariableNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoValorVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoValorVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoValorVariableNomi.setToolTipText("Cancelar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoValorVariableNomi.add(this.jButtonCerrarReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoValorVariableNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi= new JScrollPane(jPanelReporteDinamicoTipoValorVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoValorVariableNomi);
		this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getContentPane().add(this.jScrollPanelReporteDinamicoTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoValorVariableNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoValorVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoValorVariableNomi.setName("jPanelImportacionTipoValorVariableNomi"); 
		
		this.jPanelImportacionTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoValorVariableNomi.setLayout(gridaBagLayoutImportacionTipoValorVariableNomi);
		
		
		this.jInternalFrameImportacionTipoValorVariableNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoValorVariableNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoValorVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoValorVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoValorVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoValorVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoValorVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoValorVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoValorVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoValorVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoValorVariableNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoValorVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoValorVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoValorVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoValorVariableNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoValorVariableNomi = new JLabelMe();

		this.jLabelArchivoImportacionTipoValorVariableNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoValorVariableNomi.add(this.jLabelArchivoImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoValorVariableNomi = new JFileChooser();		
		this.jFileChooserImportacionTipoValorVariableNomi.setToolTipText("ESCOGER ARCHIVO"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoValorVariableNomi = new JButtonMe();
		this.jButtonAbrirImportacionTipoValorVariableNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoValorVariableNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoValorVariableNomi.setToolTipText("Generar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValorVariableNomi.add(this.jButtonAbrirImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoValorVariableNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoValorVariableNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoValorVariableNomi.add(this.jLabelPathArchivoImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoValorVariableNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoValorVariableNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoValorVariableNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoValorVariableNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValorVariableNomi.add(this.jTextFieldPathArchivoImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoValorVariableNomi = new JButtonMe();
		this.jButtonGenerarImportacionTipoValorVariableNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoValorVariableNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoValorVariableNomi.setToolTipText("Generar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValorVariableNomi.add(this.jButtonGenerarImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoValorVariableNomi = new JButtonMe();
		this.jButtonCerrarImportacionTipoValorVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoValorVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoValorVariableNomi.setToolTipText("Cancelar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoValorVariableNomi.add(this.jButtonCerrarImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoValorVariableNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoValorVariableNomi= new JScrollPane(jPanelImportacionTipoValorVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoValorVariableNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoValorVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoValorVariableNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoValorVariableNomi);
		this.jInternalFrameImportacionTipoValorVariableNomi.getContentPane().add(this.jScrollPanelImportacionTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoValorVariableNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoValorVariableNomi = new JButtonMe();
			this.jButtonAbrirOrderByTipoValorVariableNomi.setText("Orden");
			this.jButtonAbrirOrderByTipoValorVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoValorVariableNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoValorVariableNomi";
			inputMap = this.jButtonAbrirOrderByTipoValorVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoValorVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoValorVariableNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoValorVariableNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoValorVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoValorVariableNomi.setName("jPanelOrderByTipoValorVariableNomi"); 
			
			this.jPanelOrderByTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoValorVariableNomi.setLayout(gridaBagLayoutOrderByTipoValorVariableNomi);
			
			
			this.jTableDatosTipoValorVariableNomiOrderBy = new JTableMe();        
			this.jTableDatosTipoValorVariableNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoValorVariableNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoValorVariableNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoValorVariableNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoValorVariableNomiOrderBy.setViewportView(this.jTableDatosTipoValorVariableNomiOrderBy);
			this.jTableDatosTipoValorVariableNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoValorVariableNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoValorVariableNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoValorVariableNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoValorVariableNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoValorVariableNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoValorVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoValorVariableNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoValorVariableNomi.setTitle("Orden");
			this.jInternalFrameOrderByTipoValorVariableNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoValorVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoValorVariableNomi.setResizable(true);
			this.jInternalFrameOrderByTipoValorVariableNomi.setClosable(true);
			this.jInternalFrameOrderByTipoValorVariableNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoValorVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valor Variables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoValorVariableNomi.ipady =150;
				
			this.jPanelOrderByTipoValorVariableNomi.add(jScrollPanelDatosTipoValorVariableNomiOrderBy, this.gridBagConstraintsTipoValorVariableNomi);//this.jTableDatosTipoValorVariableNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoValorVariableNomi = new JButtonMe();
			this.jButtonCerrarOrderByTipoValorVariableNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoValorVariableNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoValorVariableNomi.setToolTipText("Cancelar"+" "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoValorVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValorVariableNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoValorVariableNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoValorVariableNomi.add(this.jButtonCerrarOrderByTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoValorVariableNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoValorVariableNomi= new JScrollPane(jPanelOrderByTipoValorVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoValorVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoValorVariableNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoValorVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoValorVariableNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoValorVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoValorVariableNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoValorVariableNomi);
			
			this.jInternalFrameOrderByTipoValorVariableNomi.getContentPane().add(this.jScrollPanelOrderByTipoValorVariableNomi, this.gridBagConstraintsTipoValorVariableNomi);			
		
		} else {
			this.jButtonAbrirOrderByTipoValorVariableNomi = new JButtonMe();
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
			&& this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoValorVariableNomi.getRowHeight();//TipoValorVariableNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.isSelected()) {
					iHeightTable=TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoValorVariableNomi.isSelected()) {
					iHeightTable=TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoValorVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoValorVariableNomi!=null && this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoValorVariableNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoValorVariableNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoValorVariableNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoValorVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoValorVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoValorVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipovalorvariablenomiLogic.getTipoValorVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovalorvariablenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoValorVariableNomi> TraerTipoValorVariableNomiBeans(List<TipoValorVariableNomi> tipovalorvariablenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomis) {
					
				if(!(TipoValorVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoValorVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovalorvariablenomi.setsDetalleGeneralEntityReporte(TipoValorVariableNomiConstantesFunciones.getTipoValorVariableNomiDescripcion(tipovalorvariablenomi));
										
						
					
					

					if(tipovalorvariablenomi.getVariableNomis()!=null && Funciones.existeClass(classes,VariableNomi.class)) {
						try{tipovalorvariablenomi.setvariablenomisDescripcionReporte(new JRBeanCollectionDataSource(VariableNomiJInternalFrame.TraerVariableNomiBeans(tipovalorvariablenomi.getVariableNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipovalorvariablenomi.setsDetalleGeneralEntityReporte(tipovalorvariablenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipovalorvariablenomibeans.add(tipovalorvariablenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipovalorvariablenomis;
    }
	//PARA REPORTES FIN
}
