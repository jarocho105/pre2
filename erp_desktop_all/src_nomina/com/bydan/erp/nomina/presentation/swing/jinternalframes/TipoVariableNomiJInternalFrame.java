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
import com.bydan.erp.nomina.util.TipoVariableNomiConstantesFunciones;

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
public class TipoVariableNomiJInternalFrame extends TipoVariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoVariableNomi;
	
	protected JMenuBar jmenuBarTipoVariableNomi;
	
	protected JMenu jmenuTipoVariableNomi;
	protected JMenu jmenuDatosTipoVariableNomi;
	protected JMenu jmenuArchivoTipoVariableNomi;
	protected JMenu jmenuAccionesTipoVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVariableNomi;	
	protected GridBagConstraints gridBagConstraintsTipoVariableNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoVariableNomiDetalleFormJInternalFrame jInternalFrameDetalleFormTipoVariableNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoVariableNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoVariableNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoVariableNomiSessionBean tipovariablenomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoVariableNomi> tipovariablenomis;		
	public List<TipoVariableNomi> tipovariablenomisEliminados;	
	public List<TipoVariableNomi> tipovariablenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoVariableNomi;		
	protected JButton jButtonAbrirOrderByTipoVariableNomi;
	
	
	//protected JPanel jPanelOrderByTipoVariableNomi;
	//public JScrollPane jScrollPanelOrderByTipoVariableNomi;	
	//protected JButton jButtonCerrarOrderByTipoVariableNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoVariableNomiLogic tipovariablenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoVariableNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoVariableNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoVariableNomi;
	//public JScrollPane jScrollPanelImportacionTipoVariableNomi;
	
	
	
	protected JPanel jPanelAccionesTipoVariableNomi;
	
    protected JPanel jPanelPaginacionTipoVariableNomi;
    protected JPanel jPanelParametrosReportesTipoVariableNomi;
	protected JPanel jPanelParametrosReportesAccionesTipoVariableNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoVariableNomi;
	protected JPanel jPanelParametrosAuxiliar2TipoVariableNomi;
	protected JPanel jPanelParametrosAuxiliar3TipoVariableNomi;
	protected JPanel jPanelParametrosAuxiliar4TipoVariableNomi;
	//protected JPanel jPanelParametrosAuxiliar5TipoVariableNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoVariableNomi;
	//protected JPanel jPanelImportacionTipoVariableNomi;
	
	
	public JTable jTableDatosTipoVariableNomi;
	
	
	
	//public JTable jTableDatosTipoVariableNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoVariableNomi;
	protected JButton jButtonDuplicarTipoVariableNomi;
	protected JButton jButtonCopiarTipoVariableNomi;
	protected JButton jButtonVerFormTipoVariableNomi;
	protected JButton jButtonNuevoRelacionesTipoVariableNomi;
	protected JButton jButtonModificarTipoVariableNomi;
	
    protected JButton jButtonGuardarCambiosTablaTipoVariableNomi;
	protected JButton jButtonCerrarTipoVariableNomi;
	
	
	protected JButton jButtonRecargarInformacionTipoVariableNomi;
	protected JButton jButtonProcesarInformacionTipoVariableNomi;
	
	
	protected JButton jButtonAnterioresTipoVariableNomi;
	protected JButton jButtonSiguientesTipoVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosTipoVariableNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoVariableNomi;
	//protected JButton jButtonCerrarReporteDinamicoTipoVariableNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoVariableNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoVariableNomi;
	//protected JButton jButtonGenerarImportacionTipoVariableNomi;
	//protected JButton jButtonCerrarImportacionTipoVariableNomi;
	//protected JFileChooser jFileChooserImportacionTipoVariableNomi;
	//protected File fileImportacionTipoVariableNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVariableNomi;
	protected JButton jButtonDuplicarToolBarTipoVariableNomi;
	protected JButton jButtonNuevoRelacionesToolBarTipoVariableNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoVariableNomi;
	protected JButton jButtonCopiarToolBarTipoVariableNomi;
	protected JButton jButtonVerFormToolBarTipoVariableNomi;
	public JButton jButtonGuardarCambiosTablaToolBarTipoVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVariableNomi;
	protected JButton jButtonCerrarToolBarTipoVariableNomi;
	
	protected JButton jButtonRecargarInformacionToolBarTipoVariableNomi;
	protected JButton jButtonProcesarInformacionToolBarTipoVariableNomi;
	protected JButton jButtonAnterioresToolBarTipoVariableNomi;
	protected JButton jButtonSiguientesToolBarTipoVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoVariableNomi;
	protected JButton jButtonAbrirOrderByToolBarTipoVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVariableNomi;
	protected JMenuItem jMenuItemDuplicarTipoVariableNomi;
	protected JMenuItem jMenuItemNuevoRelacionesTipoVariableNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoVariableNomi;
	protected JMenuItem jMenuItemCopiarTipoVariableNomi;
	protected JMenuItem jMenuItemVerFormTipoVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVariableNomi;
	protected JMenuItem jMenuItemCerrarTipoVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoVariableNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVariableNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoVariableNomi;
	protected JMenuItem jMenuItemProcesarInformacionTipoVariableNomi;
	protected JMenuItem jMenuItemAnterioresTipoVariableNomi;
	protected JMenuItem jMenuItemSiguientesTipoVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVariableNomi;
	protected JMenuItem jMenuItemAbrirOrderByTipoVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVariableNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoVariableNomi;
	protected JCheckBox jCheckBoxSeleccionadosTipoVariableNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoVariableNomi;
	protected JCheckBox jCheckBoxConGraficoReporteTipoVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoVariableNomi;
	protected JTextField jTextFieldValorCampoGeneralTipoVariableNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoVariableNomi;
	//public JList<Reporte> jListColumnasSelectReporteTipoVariableNomi;
	//public JScrollPane jScrollColumnasSelectReporteTipoVariableNomi;
	
	//public JLabel jLabelRelacionesSelectReporteTipoVariableNomi;
	//public JList<Reporte> jListRelacionesSelectReporteTipoVariableNomi;
	//public JScrollPane jScrollRelacionesSelectReporteTipoVariableNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoVariableNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoVariableNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoVariableNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoVariableNomi;
	
		
	//public JLabel jLabelArchivoImportacionTipoVariableNomi;	
	//public JLabel jLabelPathArchivoImportacionTipoVariableNomi;
	//protected JTextField jTextFieldPathArchivoImportacionTipoVariableNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoVariableNomi;
	
	//public JLabel jLabelColumnaCategoriaValorTipoVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoVariableNomi;
	
	//public JLabel jLabelColumnasValoresGraficoTipoVariableNomi;
	//public JList<Reporte> jListColumnasValoresGraficoTipoVariableNomi;
	//public JScrollPane jScrollColumnasValoresGraficoTipoVariableNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoVariableNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoVariableNomi;	
	
	
	
	
	
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
	public TipoVariableNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVariableNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoVariableNomi)	{
		this.jButtonRecargarInformacionTipoVariableNomi = jButtonRecargarInformacionTipoVariableNomi;
	}
	
	public JButton getjButtonProcesarInformacionTipoVariableNomi() {
		return this.jButtonProcesarInformacionTipoVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVariableNomi)	{
		this.jButtonProcesarInformacionTipoVariableNomi = jButtonProcesarInformacionTipoVariableNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoVariableNomi() {
		return this.jButtonRecargarInformacionTipoVariableNomi;
	}
	
	
	public List<TipoVariableNomi> gettipovariablenomis() {
		return this.tipovariablenomis;
	}

	public void settipovariablenomis(List<TipoVariableNomi> tipovariablenomis) {
		this.tipovariablenomis = tipovariablenomis;
	}
	
	public List<TipoVariableNomi> gettipovariablenomisAux() {
		return this.tipovariablenomisAux;
	}

	public void settipovariablenomisAux(List<TipoVariableNomi> tipovariablenomisAux) {
		this.tipovariablenomisAux = tipovariablenomisAux;
	}
	
	public List<TipoVariableNomi> gettipovariablenomisEliminados() {
		return this.tipovariablenomisEliminados;
	}

	public void setTipoVariableNomisEliminados(List<TipoVariableNomi> tipovariablenomisEliminados) {
		this.tipovariablenomisEliminados = tipovariablenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoVariableNomi() {
		return jComboBoxTiposSeleccionarTipoVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoVariableNomi(
			JComboBox jComboBoxTiposSeleccionarTipoVariableNomi) {
		this.jComboBoxTiposSeleccionarTipoVariableNomi = jComboBoxTiposSeleccionarTipoVariableNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoVariableNomi() {
		return jTextFieldValorCampoGeneralTipoVariableNomi;
	}

	public void setjTextFieldValorCampoGeneralTipoVariableNomi(
			JTextField jTextFieldValorCampoGeneralTipoVariableNomi) {
		this.jTextFieldValorCampoGeneralTipoVariableNomi = jTextFieldValorCampoGeneralTipoVariableNomi;
	}

	public void setBorderResaltarValorCampoGeneralTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoVariableNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoVariableNomi() {
		return this.jCheckBoxSeleccionarTodosTipoVariableNomi;
	}

	public void setjCheckBoxSeleccionarTodosTipoVariableNomi(
			JCheckBox jCheckBoxSeleccionarTodosTipoVariableNomi) {
		this.jCheckBoxSeleccionarTodosTipoVariableNomi = jCheckBoxSeleccionarTodosTipoVariableNomi;
	}

	public void setBorderResaltarSeleccionarTodosTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoVariableNomi() {
		return this.jCheckBoxSeleccionadosTipoVariableNomi;
	}

	public void setjCheckBoxSeleccionadosTipoVariableNomi(
			JCheckBox jCheckBoxSeleccionadosTipoVariableNomi) {
		this.jCheckBoxSeleccionadosTipoVariableNomi = jCheckBoxSeleccionadosTipoVariableNomi;
	}
	
	public void setBorderResaltarSeleccionadosTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoVariableNomi() {
		return this.jComboBoxTiposArchivosReportesTipoVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoVariableNomi(
			JComboBox jComboBoxTiposArchivosReportesTipoVariableNomi) {
		this.jComboBoxTiposArchivosReportesTipoVariableNomi = jComboBoxTiposArchivosReportesTipoVariableNomi;
	}

	public void setBorderResaltarTiposArchivosReportesTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoVariableNomi() {
		return this.jComboBoxTiposReportesTipoVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoVariableNomi(
			JComboBox jComboBoxTiposReportesTipoVariableNomi) {
		this.jComboBoxTiposReportesTipoVariableNomi = jComboBoxTiposReportesTipoVariableNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoVariableNomi() {
	//	return jComboBoxTiposReportesDinamicoTipoVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoVariableNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoVariableNomi) {
	//	this.jComboBoxTiposReportesDinamicoTipoVariableNomi = jComboBoxTiposReportesDinamicoTipoVariableNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoVariableNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoVariableNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi = jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi;
	//}
	
	public void setBorderResaltarTiposReportesTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoVariableNomi() {
		return this.jComboBoxTiposGraficosReportesTipoVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoVariableNomi(
			JComboBox jComboBoxTiposGraficosReportesTipoVariableNomi) {
		this.jComboBoxTiposGraficosReportesTipoVariableNomi = jComboBoxTiposGraficosReportesTipoVariableNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoVariableNomi() {
		return this.jComboBoxTiposPaginacionTipoVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoVariableNomi(
			JComboBox jComboBoxTiposPaginacionTipoVariableNomi) {
		this.jComboBoxTiposPaginacionTipoVariableNomi = jComboBoxTiposPaginacionTipoVariableNomi;
	}
	
	public void setBorderResaltarTiposPaginacionTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoVariableNomi() {
		return this.jComboBoxTiposRelacionesTipoVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVariableNomi() {
		return this.jComboBoxTiposAccionesTipoVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVariableNomi(
			JComboBox jComboBoxTiposRelacionesTipoVariableNomi) {
		this.jComboBoxTiposRelacionesTipoVariableNomi = jComboBoxTiposRelacionesTipoVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVariableNomi(
			JComboBox jComboBoxTiposAccionesTipoVariableNomi) {
		this.jComboBoxTiposAccionesTipoVariableNomi = jComboBoxTiposAccionesTipoVariableNomi;
	}
	
	public void setBorderResaltarTiposRelacionesTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoVariableNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoVariableNomi() {
	//	return jCheckBoxConGraficoDinamicoTipoVariableNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoVariableNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoVariableNomi) {
	//	this.jCheckBoxConGraficoDinamicoTipoVariableNomi = jCheckBoxConGraficoDinamicoTipoVariableNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoVariableNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoVariableNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoVariableNomi .setBorder(borderResaltar);		
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
		this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		
		this.tipovariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovariablenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoVariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoVariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoVariableNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"nuevo","nuevo","Nuevo"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"duplicar","duplicar","Duplicar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"copiar","copiar","Copiar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"ver_form","ver_form","Ver"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"recargar","recargar","Recargar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoVariableNomi,this.jTtoolBarTipoVariableNomi,
							"cerrar","cerrar","Salir"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoVariableNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoVariableNomi;
			
				this.jButtonProcesarInformacionToolBarTipoVariableNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoVariableNomi;
				
		//protected JButton jButtonModificarToolBarTipoVariableNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoVariableNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoVariableNomi=new JMenuMe("General");
		this.jmenuArchivoTipoVariableNomi=new JMenuMe("Archivo");
		this.jmenuAccionesTipoVariableNomi=new JMenuMe("Acciones");
		this.jmenuDatosTipoVariableNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoVariableNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoVariableNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoVariableNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoVariableNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoVariableNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoVariableNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoVariableNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoVariableNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoVariableNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoVariableNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoVariableNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoVariableNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoVariableNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoVariableNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoVariableNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoVariableNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoVariableNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoVariableNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoVariableNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoVariableNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoVariableNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoVariableNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoVariableNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoVariableNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoVariableNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoVariableNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoVariableNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoVariableNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoVariableNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoVariableNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoVariableNomi.add(this.jMenuItemCerrarTipoVariableNomi);
			
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemNuevoTipoVariableNomi);
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemNuevoGuardarCambiosTipoVariableNomi);
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemNuevoRelacionesTipoVariableNomi);
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemGuardarCambiosTablaTipoVariableNomi);		
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemDuplicarTipoVariableNomi);		
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemCopiarTipoVariableNomi);		
			this.jmenuAccionesTipoVariableNomi.add(this.jMenuItemVerFormTipoVariableNomi);		
			
			this.jmenuDatosTipoVariableNomi.add(this.jMenuItemRecargarInformacionTipoVariableNomi);				
			this.jmenuDatosTipoVariableNomi.add(this.jMenuItemAnterioresTipoVariableNomi);				
			this.jmenuDatosTipoVariableNomi.add(this.jMenuItemSiguientesTipoVariableNomi);				
			this.jmenuDatosTipoVariableNomi.add(this.jMenuItemAbrirOrderByTipoVariableNomi);				
			this.jmenuDatosTipoVariableNomi.add(this.jMenuItemMostrarOcultarTipoVariableNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoVariableNomi.add(this.jMenuItemGuardarCambiosTipoVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoVariableNomi.add(this.jmenuArchivoTipoVariableNomi);		
			this.jmenuBarTipoVariableNomi.add(this.jmenuAccionesTipoVariableNomi);		
			this.jmenuBarTipoVariableNomi.add(this.jmenuDatosTipoVariableNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoVariableNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoVariableNomi() {
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
			//this.jInternalFrameDetalleTipoVariableNomi = new TipoVariableNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Variable DATOS");
			this.jInternalFrameDetalleFormTipoVariableNomi = new TipoVariableNomiDetalleFormJInternalFrame(jDesktopPane,this.tipovariablenomiSessionBean.getConGuardarRelaciones(),this.tipovariablenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoVariableNomi = null;//new TipoVariableNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVariableNomi= new GridBagLayout();
		
		
		this.jTableDatosTipoVariableNomi = new JTableMe();      
		
		String sToolTipTipoVariableNomi="";
		sToolTipTipoVariableNomi=TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVariableNomi+="(Nomina.TipoVariableNomi)";
		}
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVariableNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoVariableNomi.setToolTipText(sToolTipTipoVariableNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoVariableNomi);
		this.jTableDatosTipoVariableNomi.setAutoCreateRowSorter(true);
		this.jTableDatosTipoVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoVariableNomi.setRowSelectionAllowed(true);
		this.jTableDatosTipoVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoVariableNomi = new JButtonMe();
		this.jButtonDuplicarTipoVariableNomi = new JButtonMe();
		this.jButtonCopiarTipoVariableNomi = new JButtonMe();
		this.jButtonVerFormTipoVariableNomi = new JButtonMe();
		this.jButtonNuevoRelacionesTipoVariableNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi = new JButtonMe();
		this.jButtonCerrarTipoVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoVariableNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Variable";
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoVariableNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoVariableNomi=new ReporteDinamicoJInternalFrame(TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoVariableNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoVariableNomi=new ImportacionJInternalFrame(TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoVariableNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoVariableNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoVariableNomi.setText("Orden");
		this.jButtonAbrirOrderByTipoVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVariableNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVariableNomi,false,this);
			
			//this.cargarOrderByTipoVariableNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVariableNomi,true,this);
			
			//this.cargarOrderByTipoVariableNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoVariableNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVariableNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVariableNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoVariableNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVariableNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVariableNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoVariableNomi.setText("Nuevo");
		this.jButtonDuplicarTipoVariableNomi.setText("Duplicar");
		this.jButtonCopiarTipoVariableNomi.setText("Copiar");
		this.jButtonVerFormTipoVariableNomi.setText("Ver");
		this.jButtonNuevoRelacionesTipoVariableNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.setText("Guardar");
		this.jButtonCerrarTipoVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVariableNomi,"nuevo_button","Nuevo",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoVariableNomi,"duplicar_button","Duplicar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoVariableNomi,"copiar_button","Copiar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoVariableNomi,"ver_form","Ver",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoVariableNomi,"nuevorelaciones_button","Nuevo Rel",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVariableNomi,"guardarcambiostabla_button","Guardar",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVariableNomi,"cerrar_button","Salir",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoVariableNomi.setToolTipText("Nuevo"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoVariableNomi.setToolTipText("Duplicar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoVariableNomi.setToolTipText("Copiar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoVariableNomi.setToolTipText("Ver"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoVariableNomi.setToolTipText("Nuevo Rel"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.setToolTipText("Guardar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVariableNomi.setToolTipText("Salir"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVariableNomi";
		inputMap = this.jButtonNuevoTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVariableNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoVariableNomi";
		inputMap = this.jButtonDuplicarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoVariableNomi"));
		
		//COPIAR
		sMapKey = "CopiarTipoVariableNomi";
		inputMap = this.jButtonCopiarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoVariableNomi"));
		
		//VEr FORM
		sMapKey = "VerFormTipoVariableNomi";
		inputMap = this.jButtonVerFormTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoVariableNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoVariableNomi";
		inputMap = this.jButtonNuevoRelacionesTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoVariableNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoVariableNomi";
		inputMap = this.jButtonModificarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoVariableNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoVariableNomi";
		inputMap = this.jButtonCerrarTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVariableNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoVariableNomi.setName("jPanelParametrosReportesTipoVariableNomi"); 
		
		this.jPanelParametrosReportesAccionesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoVariableNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoVariableNomi.setName("jPanelParametrosReportesAccionesTipoVariableNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoVariableNomi = new JButtonMe();
		this.jButtonRecargarInformacionTipoVariableNomi.setText("Recargar");
		this.jButtonRecargarInformacionTipoVariableNomi.setToolTipText("Recargar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoVariableNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoVariableNomi = new JButtonMe();
		this.jButtonProcesarInformacionTipoVariableNomi.setText("Procesar");
		this.jButtonProcesarInformacionTipoVariableNomi.setToolTipText("Procesar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoVariableNomi.setVisible(false);
			
		this.jButtonProcesarInformacionTipoVariableNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVariableNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVariableNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVariableNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoVariableNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVariableNomi.setText("TIPO");       
		this.jComboBoxTiposReportesTipoVariableNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVariableNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoVariableNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoVariableNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoVariableNomi.setText("Accion");
		this.jComboBoxTiposRelacionesTipoVariableNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoVariableNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoVariableNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoVariableNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoVariableNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoVariableNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVariableNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVariableNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoVariableNomi = new JLabelMe();
		
		this.jLabelAccionesTipoVariableNomi.setText("Acciones");		
		this.jLabelAccionesTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoVariableNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoVariableNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoVariableNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoVariableNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoVariableNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoVariableNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoVariableNomi = new JButtonMe();
		//this.jButtonAnterioresTipoVariableNomi.setText("<<");
        this.jButtonAnterioresTipoVariableNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoVariableNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoVariableNomi = new JButtonMe();
		//this.jButtonSiguientesTipoVariableNomi.setText(">>");
        this.jButtonSiguientesTipoVariableNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoVariableNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoVariableNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoVariableNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoVariableNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoVariableNomi,"nuevoguardarcambios_button","Nue",this.tipovariablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoVariableNomi";
		inputMap = this.jButtonNuevoGuardarCambiosTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoVariableNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoVariableNomi";
		inputMap = this.jButtonRecargarInformacionTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoVariableNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoVariableNomi";
		inputMap = this.jButtonSiguientesTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoVariableNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoVariableNomi";
		inputMap = this.jButtonAnterioresTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoVariableNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoVariableNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoVariableNomi.setMinimumSize(new Dimension(this.getWidth(),TipoVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVariableNomi.setMaximumSize(new Dimension(this.getWidth(),TipoVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVariableNomi.setPreferredSize(new Dimension(this.getWidth(),TipoVariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoVariableNomi = new GridBagLayout();

			this.jPanelPaginacionTipoVariableNomi.setLayout(gridaBagLayoutPaginacionTipoVariableNomi);						
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 0;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonAnterioresTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					
						
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVariableNomi.gridy = 0;
			
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonNuevoGuardarCambiosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
						
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVariableNomi.gridy = 0;
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonSiguientesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonNuevoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVariableNomi.gridy = 1;
				this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoVariableNomi.add(this.jButtonNuevoRelacionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			}
			
			
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVariableNomi.gridy = 1;
				this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoVariableNomi.add(this.jButtonGuardarCambiosTablaTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			}
			
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonDuplicarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonCopiarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonVerFormTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 1;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoVariableNomi.add(this.jButtonCerrarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
		
		
		this.jButtonRecargarInformacionTipoVariableNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVariableNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVariableNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoVariableNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVariableNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVariableNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoVariableNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVariableNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVariableNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoVariableNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVariableNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVariableNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoVariableNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVariableNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVariableNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoVariableNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoVariableNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoVariableNomi.setLayout(gridaBagParametrosReportesTipoVariableNomi);
			this.jPanelParametrosReportesAccionesTipoVariableNomi.setLayout(gridaBagParametrosReportesAccionesTipoVariableNomi);
			
			
			this.jPanelParametrosAuxiliar1TipoVariableNomi.setLayout(gridaBagParametrosAuxiliar1TipoVariableNomi);
			this.jPanelParametrosAuxiliar2TipoVariableNomi.setLayout(gridaBagParametrosAuxiliar2TipoVariableNomi);
			this.jPanelParametrosAuxiliar3TipoVariableNomi.setLayout(gridaBagParametrosAuxiliar3TipoVariableNomi);
			this.jPanelParametrosAuxiliar4TipoVariableNomi.setLayout(gridaBagParametrosAuxiliar4TipoVariableNomi);
			//this.jPanelParametrosAuxiliar5TipoVariableNomi.setLayout(gridaBagParametrosAuxiliar2TipoVariableNomi);			
			
			
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jButtonRecargarInformacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVariableNomi.add(this.jComboBoxTiposPaginacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVariableNomi.add(this.jCheckBoxConAltoMaximoTablaTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVariableNomi.add(this.jComboBoxTiposArchivosReportesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jPanelParametrosAuxiliar1TipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoVariableNomi.add(this.jComboBoxTiposReportesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jPanelParametrosAuxiliar4TipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jComboBoxTiposReportesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jCheckBoxGenerarReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jPanelParametrosAuxiliar2TipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jLabelAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoVariableNomi.add(this.jButtonAbrirOrderByTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jComboBoxTiposSeleccionarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			
			
			/*
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jCheckBoxSeleccionarTodosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVariableNomi.add(this.jCheckBoxSeleccionarTodosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);															
				
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVariableNomi.add(this.jCheckBoxSeleccionadosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jPanelParametrosAuxiliar3TipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jComboBoxTiposRelacionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
				
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jComboBoxTiposAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
	
				
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVariableNomi.add(this.jTextFieldValorCampoGeneralTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoVariableNomi = new GridBagLayout();

			this.jScrollPanelDatosTipoVariableNomi.setLayout(gridaBagLayoutDatosTipoVariableNomi);
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = 0;
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;
			
			this.jScrollPanelDatosTipoVariableNomi.add(this.jTableDatosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoVariableNomi.setViewportView(this.jTableDatosTipoVariableNomi);
		this.jTableDatosTipoVariableNomi.setFillsViewportHeight(true);
		this.jTableDatosTipoVariableNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoVariableNomi= new GridBagLayout();
		this.jPanelAccionesTipoVariableNomi.setLayout(gridaBagLayoutAccionesTipoVariableNomi);
		
		
		/*	
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = 0;
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
			
		this.jPanelAccionesTipoVariableNomi.add(this.jButtonNuevoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVariableNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVariableNomi.gridx = 0;		
			//this.gridBagConstraintsTipoVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVariableNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;		
		//this.gridBagConstraintsTipoVariableNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoVariableNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoVariableNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);								
		
		
		/*
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		*/		
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVariableNomi.gridx =0;
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
				
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVariableNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoVariableNomi.setLayout(gridaBagLayoutBusquedasParametrosTipoVariableNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
			
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoVariableNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoVariableNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoVariableNomi.setName("jPanelReporteDinamicoTipoVariableNomi"); 
		
		this.jPanelReporteDinamicoTipoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoVariableNomi.setLayout(gridaBagLayoutReporteDinamicoTipoVariableNomi);
		
		
		this.jInternalFrameReporteDinamicoTipoVariableNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoVariableNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoVariableNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoVariableNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoVariableNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoVariableNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoVariableNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jLabelColumnasSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoVariableNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoVariableNomi=new JScrollPane(this.jListColumnasSelectReporteTipoVariableNomi);
			
			this.jScrollColumnasSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVariableNomi.add(this.jListColumnasSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jScrollColumnasSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoVariableNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoVariableNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jLabelRelacionesSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoVariableNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoVariableNomi=new JScrollPane(this.jListRelacionesSelectReporteTipoVariableNomi);
			
			this.jScrollRelacionesSelectReporteTipoVariableNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVariableNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVariableNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVariableNomi.add(this.jListRelacionesSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jScrollRelacionesSelectReporteTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoVariableNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoVariableNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoVariableNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jLabelGenerarExcelReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi.setToolTipText("Generar EXCEL"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoVariableNomi.add(this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jComboBoxTiposReportesDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jLabelTiposArchivoReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jComboBoxTiposArchivosReportesDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoVariableNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoVariableNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoVariableNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoVariableNomi.setToolTipText("Generar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jButtonGenerarReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoVariableNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoVariableNomi.setToolTipText("Cancelar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVariableNomi.add(this.jButtonCerrarReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVariableNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoVariableNomi= new JScrollPane(jPanelReporteDinamicoTipoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoVariableNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVariableNomi);
		this.jInternalFrameReporteDinamicoTipoVariableNomi.getContentPane().add(this.jScrollPanelReporteDinamicoTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoVariableNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoVariableNomi.setName("jPanelImportacionTipoVariableNomi"); 
		
		this.jPanelImportacionTipoVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoVariableNomi.setLayout(gridaBagLayoutImportacionTipoVariableNomi);
		
		
		this.jInternalFrameImportacionTipoVariableNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoVariableNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoVariableNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVariableNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoVariableNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoVariableNomi = new JLabelMe();

		this.jLabelArchivoImportacionTipoVariableNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVariableNomi.add(this.jLabelArchivoImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoVariableNomi = new JFileChooser();		
		this.jFileChooserImportacionTipoVariableNomi.setToolTipText("ESCOGER ARCHIVO"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoVariableNomi = new JButtonMe();
		this.jButtonAbrirImportacionTipoVariableNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoVariableNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoVariableNomi.setToolTipText("Generar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVariableNomi.add(this.jButtonAbrirImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoVariableNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoVariableNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVariableNomi.add(this.jLabelPathArchivoImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoVariableNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoVariableNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVariableNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVariableNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVariableNomi.add(this.jTextFieldPathArchivoImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoVariableNomi = new JButtonMe();
		this.jButtonGenerarImportacionTipoVariableNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoVariableNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoVariableNomi.setToolTipText("Generar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVariableNomi.add(this.jButtonGenerarImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoVariableNomi = new JButtonMe();
		this.jButtonCerrarImportacionTipoVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoVariableNomi.setToolTipText("Cancelar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVariableNomi.add(this.jButtonCerrarImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoVariableNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoVariableNomi= new JScrollPane(jPanelImportacionTipoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoVariableNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoVariableNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoVariableNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoVariableNomi);
		this.jInternalFrameImportacionTipoVariableNomi.getContentPane().add(this.jScrollPanelImportacionTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoVariableNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoVariableNomi = new JButtonMe();
			this.jButtonAbrirOrderByTipoVariableNomi.setText("Orden");
			this.jButtonAbrirOrderByTipoVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVariableNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoVariableNomi";
			inputMap = this.jButtonAbrirOrderByTipoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoVariableNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoVariableNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoVariableNomi.setName("jPanelOrderByTipoVariableNomi"); 
			
			this.jPanelOrderByTipoVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoVariableNomi.setLayout(gridaBagLayoutOrderByTipoVariableNomi);
			
			
			this.jTableDatosTipoVariableNomiOrderBy = new JTableMe();        
			this.jTableDatosTipoVariableNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoVariableNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoVariableNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoVariableNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoVariableNomiOrderBy.setViewportView(this.jTableDatosTipoVariableNomiOrderBy);
			this.jTableDatosTipoVariableNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoVariableNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoVariableNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoVariableNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoVariableNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoVariableNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoVariableNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoVariableNomi.setTitle("Orden");
			this.jInternalFrameOrderByTipoVariableNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoVariableNomi.setResizable(true);
			this.jInternalFrameOrderByTipoVariableNomi.setClosable(true);
			this.jInternalFrameOrderByTipoVariableNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Variables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoVariableNomi.ipady =150;
				
			this.jPanelOrderByTipoVariableNomi.add(jScrollPanelDatosTipoVariableNomiOrderBy, this.gridBagConstraintsTipoVariableNomi);//this.jTableDatosTipoVariableNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoVariableNomi = new JButtonMe();
			this.jButtonCerrarOrderByTipoVariableNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoVariableNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoVariableNomi.setToolTipText("Cancelar"+" "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVariableNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoVariableNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoVariableNomi.add(this.jButtonCerrarOrderByTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoVariableNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoVariableNomi= new JScrollPane(jPanelOrderByTipoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoVariableNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVariableNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoVariableNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoVariableNomi);
			
			this.jInternalFrameOrderByTipoVariableNomi.getContentPane().add(this.jScrollPanelOrderByTipoVariableNomi, this.gridBagConstraintsTipoVariableNomi);			
		
		} else {
			this.jButtonAbrirOrderByTipoVariableNomi = new JButtonMe();
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
			&& this.tipovariablenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoVariableNomi.getRowHeight();//TipoVariableNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.isSelected()) {
					iHeightTable=TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVariableNomi.isSelected()) {
					iHeightTable=TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoVariableNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVariableNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVariableNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoVariableNomi!=null && this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoVariableNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoVariableNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoVariableNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipovariablenomiLogic.getTipoVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovariablenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoVariableNomi> TraerTipoVariableNomiBeans(List<TipoVariableNomi> tipovariablenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoVariableNomi tipovariablenomi:tipovariablenomis) {
					
				if(!(TipoVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovariablenomi.setsDetalleGeneralEntityReporte(TipoVariableNomiConstantesFunciones.getTipoVariableNomiDescripcion(tipovariablenomi));
										
						
					
					

					if(tipovariablenomi.getVariableNomis()!=null && Funciones.existeClass(classes,VariableNomi.class)) {
						try{tipovariablenomi.setvariablenomisDescripcionReporte(new JRBeanCollectionDataSource(VariableNomiJInternalFrame.TraerVariableNomiBeans(tipovariablenomi.getVariableNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipovariablenomi.setsDetalleGeneralEntityReporte(tipovariablenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipovariablenomibeans.add(tipovariablenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipovariablenomis;
    }
	//PARA REPORTES FIN
}
