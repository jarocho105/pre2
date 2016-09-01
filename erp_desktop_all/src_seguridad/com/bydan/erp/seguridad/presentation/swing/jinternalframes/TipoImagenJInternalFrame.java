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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoImagenConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoImagenJInternalFrame extends TipoImagenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoImagen;
	
	protected JMenuBar jmenuBarTipoImagen;
	
	protected JMenu jmenuTipoImagen;
	protected JMenu jmenuDatosTipoImagen;
	protected JMenu jmenuArchivoTipoImagen;
	protected JMenu jmenuAccionesTipoImagen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImagen;	
	protected GridBagConstraints gridBagConstraintsTipoImagen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoImagenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoImagen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoImagen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoImagen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImagenSessionBean tipoimagenSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoImagen> tipoimagens;		
	public List<TipoImagen> tipoimagensEliminados;	
	public List<TipoImagen> tipoimagensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoImagen;		
	protected JButton jButtonAbrirOrderByTipoImagen;
	
	
	//protected JPanel jPanelOrderByTipoImagen;
	//public JScrollPane jScrollPanelOrderByTipoImagen;	
	//protected JButton jButtonCerrarOrderByTipoImagen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoImagenLogic tipoimagenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoImagen;
	public JScrollPane jScrollPanelDatosEdicionTipoImagen;
	public JScrollPane jScrollPanelDatosGeneralTipoImagen;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoImagenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoImagen;
	//public JScrollPane jScrollPanelImportacionTipoImagen;
	
	
	
	protected JPanel jPanelAccionesTipoImagen;
	
    protected JPanel jPanelPaginacionTipoImagen;
    protected JPanel jPanelParametrosReportesTipoImagen;
	protected JPanel jPanelParametrosReportesAccionesTipoImagen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoImagen;
	protected JPanel jPanelParametrosAuxiliar2TipoImagen;
	protected JPanel jPanelParametrosAuxiliar3TipoImagen;
	protected JPanel jPanelParametrosAuxiliar4TipoImagen;
	//protected JPanel jPanelParametrosAuxiliar5TipoImagen;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoImagen;
	//protected JPanel jPanelImportacionTipoImagen;
	
	
	public JTable jTableDatosTipoImagen;
	
	
	
	//public JTable jTableDatosTipoImagenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoImagen;
	protected JButton jButtonDuplicarTipoImagen;
	protected JButton jButtonCopiarTipoImagen;
	protected JButton jButtonVerFormTipoImagen;
	protected JButton jButtonNuevoRelacionesTipoImagen;
	protected JButton jButtonModificarTipoImagen;
	
    protected JButton jButtonGuardarCambiosTablaTipoImagen;
	protected JButton jButtonCerrarTipoImagen;
	
	
	protected JButton jButtonRecargarInformacionTipoImagen;
	protected JButton jButtonProcesarInformacionTipoImagen;
	
	
	protected JButton jButtonAnterioresTipoImagen;
	protected JButton jButtonSiguientesTipoImagen;
	protected JButton jButtonNuevoGuardarCambiosTipoImagen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoImagen;
	//protected JButton jButtonCerrarReporteDinamicoTipoImagen;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoImagen;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoImagen;
	//protected JButton jButtonGenerarImportacionTipoImagen;
	//protected JButton jButtonCerrarImportacionTipoImagen;
	//protected JFileChooser jFileChooserImportacionTipoImagen;
	//protected File fileImportacionTipoImagen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImagen;
	protected JButton jButtonDuplicarToolBarTipoImagen;
	protected JButton jButtonNuevoRelacionesToolBarTipoImagen;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoImagen;
	protected JButton jButtonCopiarToolBarTipoImagen;
	protected JButton jButtonVerFormToolBarTipoImagen;
	public JButton jButtonGuardarCambiosTablaToolBarTipoImagen;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImagen;
	protected JButton jButtonCerrarToolBarTipoImagen;
	
	protected JButton jButtonRecargarInformacionToolBarTipoImagen;
	protected JButton jButtonProcesarInformacionToolBarTipoImagen;
	protected JButton jButtonAnterioresToolBarTipoImagen;
	protected JButton jButtonSiguientesToolBarTipoImagen;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoImagen;
	protected JButton jButtonAbrirOrderByToolBarTipoImagen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImagen;
	protected JMenuItem jMenuItemDuplicarTipoImagen;
	protected JMenuItem jMenuItemNuevoRelacionesTipoImagen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoImagen;
	protected JMenuItem jMenuItemCopiarTipoImagen;
	protected JMenuItem jMenuItemVerFormTipoImagen;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImagen;
	protected JMenuItem jMenuItemCerrarTipoImagen;
	protected JMenuItem jMenuItemDetalleCerrarTipoImagen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoImagen;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImagen;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoImagen;
	protected JMenuItem jMenuItemProcesarInformacionTipoImagen;
	protected JMenuItem jMenuItemAnterioresTipoImagen;
	protected JMenuItem jMenuItemSiguientesTipoImagen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImagen;
	protected JMenuItem jMenuItemAbrirOrderByTipoImagen;
	protected JMenuItem jMenuItemMostrarOcultarTipoImagen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImagen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoImagen;
	protected JCheckBox jCheckBoxSeleccionadosTipoImagen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoImagen;
	protected JCheckBox jCheckBoxConGraficoReporteTipoImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoImagen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImagen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoImagen;
	protected JTextField jTextFieldValorCampoGeneralTipoImagen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoImagen;
	//public JList<Reporte> jListColumnasSelectReporteTipoImagen;
	//public JScrollPane jScrollColumnasSelectReporteTipoImagen;
	
	//public JLabel jLabelRelacionesSelectReporteTipoImagen;
	//public JList<Reporte> jListRelacionesSelectReporteTipoImagen;
	//public JScrollPane jScrollRelacionesSelectReporteTipoImagen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoImagen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoImagen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoImagen;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoImagen;
	
		
	//public JLabel jLabelArchivoImportacionTipoImagen;	
	//public JLabel jLabelPathArchivoImportacionTipoImagen;
	//protected JTextField jTextFieldPathArchivoImportacionTipoImagen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoImagen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoImagen;
	
	//public JLabel jLabelColumnaCategoriaValorTipoImagen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoImagen;
	
	//public JLabel jLabelColumnasValoresGraficoTipoImagen;
	//public JList<Reporte> jListColumnasValoresGraficoTipoImagen;
	//public JScrollPane jScrollColumnasValoresGraficoTipoImagen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoImagen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoImagen;	
	
	
	
	
	
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
	public TipoImagenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoImagen)	{
		this.jButtonRecargarInformacionTipoImagen = jButtonRecargarInformacionTipoImagen;
	}
	
	public JButton getjButtonProcesarInformacionTipoImagen() {
		return this.jButtonProcesarInformacionTipoImagen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImagen)	{
		this.jButtonProcesarInformacionTipoImagen = jButtonProcesarInformacionTipoImagen;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoImagen() {
		return this.jButtonRecargarInformacionTipoImagen;
	}
	
	
	public List<TipoImagen> gettipoimagens() {
		return this.tipoimagens;
	}

	public void settipoimagens(List<TipoImagen> tipoimagens) {
		this.tipoimagens = tipoimagens;
	}
	
	public List<TipoImagen> gettipoimagensAux() {
		return this.tipoimagensAux;
	}

	public void settipoimagensAux(List<TipoImagen> tipoimagensAux) {
		this.tipoimagensAux = tipoimagensAux;
	}
	
	public List<TipoImagen> gettipoimagensEliminados() {
		return this.tipoimagensEliminados;
	}

	public void setTipoImagensEliminados(List<TipoImagen> tipoimagensEliminados) {
		this.tipoimagensEliminados = tipoimagensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoImagen() {
		return jComboBoxTiposSeleccionarTipoImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoImagen(
			JComboBox jComboBoxTiposSeleccionarTipoImagen) {
		this.jComboBoxTiposSeleccionarTipoImagen = jComboBoxTiposSeleccionarTipoImagen;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoImagen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoImagen() {
		return jTextFieldValorCampoGeneralTipoImagen;
	}

	public void setjTextFieldValorCampoGeneralTipoImagen(
			JTextField jTextFieldValorCampoGeneralTipoImagen) {
		this.jTextFieldValorCampoGeneralTipoImagen = jTextFieldValorCampoGeneralTipoImagen;
	}

	public void setBorderResaltarValorCampoGeneralTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoImagen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoImagen() {
		return this.jCheckBoxSeleccionarTodosTipoImagen;
	}

	public void setjCheckBoxSeleccionarTodosTipoImagen(
			JCheckBox jCheckBoxSeleccionarTodosTipoImagen) {
		this.jCheckBoxSeleccionarTodosTipoImagen = jCheckBoxSeleccionarTodosTipoImagen;
	}

	public void setBorderResaltarSeleccionarTodosTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoImagen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoImagen() {
		return this.jCheckBoxSeleccionadosTipoImagen;
	}

	public void setjCheckBoxSeleccionadosTipoImagen(
			JCheckBox jCheckBoxSeleccionadosTipoImagen) {
		this.jCheckBoxSeleccionadosTipoImagen = jCheckBoxSeleccionadosTipoImagen;
	}
	
	public void setBorderResaltarSeleccionadosTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoImagen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoImagen() {
		return this.jComboBoxTiposArchivosReportesTipoImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoImagen(
			JComboBox jComboBoxTiposArchivosReportesTipoImagen) {
		this.jComboBoxTiposArchivosReportesTipoImagen = jComboBoxTiposArchivosReportesTipoImagen;
	}

	public void setBorderResaltarTiposArchivosReportesTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoImagen() {
		return this.jComboBoxTiposReportesTipoImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoImagen(
			JComboBox jComboBoxTiposReportesTipoImagen) {
		this.jComboBoxTiposReportesTipoImagen = jComboBoxTiposReportesTipoImagen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoImagen() {
	//	return jComboBoxTiposReportesDinamicoTipoImagen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoImagen(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoImagen) {
	//	this.jComboBoxTiposReportesDinamicoTipoImagen = jComboBoxTiposReportesDinamicoTipoImagen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoImagen() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoImagen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoImagen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImagen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoImagen = jComboBoxTiposArchivosReportesDinamicoTipoImagen;
	//}
	
	public void setBorderResaltarTiposReportesTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoImagen() {
		return this.jComboBoxTiposGraficosReportesTipoImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoImagen(
			JComboBox jComboBoxTiposGraficosReportesTipoImagen) {
		this.jComboBoxTiposGraficosReportesTipoImagen = jComboBoxTiposGraficosReportesTipoImagen;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoImagen() {
		return this.jComboBoxTiposPaginacionTipoImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoImagen(
			JComboBox jComboBoxTiposPaginacionTipoImagen) {
		this.jComboBoxTiposPaginacionTipoImagen = jComboBoxTiposPaginacionTipoImagen;
	}
	
	public void setBorderResaltarTiposPaginacionTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoImagen() {
		return this.jComboBoxTiposRelacionesTipoImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImagen() {
		return this.jComboBoxTiposAccionesTipoImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImagen(
			JComboBox jComboBoxTiposRelacionesTipoImagen) {
		this.jComboBoxTiposRelacionesTipoImagen = jComboBoxTiposRelacionesTipoImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImagen(
			JComboBox jComboBoxTiposAccionesTipoImagen) {
		this.jComboBoxTiposAccionesTipoImagen = jComboBoxTiposAccionesTipoImagen;
	}
	
	public void setBorderResaltarTiposRelacionesTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoImagen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoImagen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoImagen() {
	//	return jCheckBoxConGraficoDinamicoTipoImagen;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoImagen(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoImagen) {
	//	this.jCheckBoxConGraficoDinamicoTipoImagen = jCheckBoxConGraficoDinamicoTipoImagen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoImagen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoImagen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoImagen .setBorder(borderResaltar);		
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
		this.tipoimagenSessionBean=new TipoImagenSessionBean();
		
		this.tipoimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimagenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImagenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Imagen MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoImagenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoImagen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"nuevo","nuevo","Nuevo"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"duplicar","duplicar","Duplicar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"copiar","copiar","Copiar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"ver_form","ver_form","Ver"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"recargar","recargar","Recargar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoImagen,this.jTtoolBarTipoImagen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoImagen,this.jTtoolBarTipoImagen,
							"cerrar","cerrar","Salir"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoImagen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoImagen;
			
				this.jButtonProcesarInformacionToolBarTipoImagen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoImagen;
				
		//protected JButton jButtonModificarToolBarTipoImagen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoImagen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoImagen=new JMenuMe("General");
		this.jmenuArchivoTipoImagen=new JMenuMe("Archivo");
		this.jmenuAccionesTipoImagen=new JMenuMe("Acciones");
		this.jmenuDatosTipoImagen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImagen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImagen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImagen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoImagen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoImagen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoImagen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoImagen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoImagen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoImagen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoImagen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImagen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImagen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoImagen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoImagen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoImagen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoImagen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoImagen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoImagen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoImagen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoImagen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoImagen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoImagen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoImagen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoImagen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoImagen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoImagen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoImagen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoImagen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoImagen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoImagen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoImagen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoImagen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoImagen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoImagen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoImagen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoImagen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImagen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoImagen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoImagen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoImagen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImagen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoImagen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoImagen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoImagen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoImagen.add(this.jMenuItemCerrarTipoImagen);
			
			this.jmenuAccionesTipoImagen.add(this.jMenuItemNuevoTipoImagen);
			this.jmenuAccionesTipoImagen.add(this.jMenuItemNuevoGuardarCambiosTipoImagen);
			this.jmenuAccionesTipoImagen.add(this.jMenuItemNuevoRelacionesTipoImagen);
			this.jmenuAccionesTipoImagen.add(this.jMenuItemGuardarCambiosTablaTipoImagen);		
			this.jmenuAccionesTipoImagen.add(this.jMenuItemDuplicarTipoImagen);		
			this.jmenuAccionesTipoImagen.add(this.jMenuItemCopiarTipoImagen);		
			this.jmenuAccionesTipoImagen.add(this.jMenuItemVerFormTipoImagen);		
			
			this.jmenuDatosTipoImagen.add(this.jMenuItemRecargarInformacionTipoImagen);				
			this.jmenuDatosTipoImagen.add(this.jMenuItemAnterioresTipoImagen);				
			this.jmenuDatosTipoImagen.add(this.jMenuItemSiguientesTipoImagen);				
			this.jmenuDatosTipoImagen.add(this.jMenuItemAbrirOrderByTipoImagen);				
			this.jmenuDatosTipoImagen.add(this.jMenuItemMostrarOcultarTipoImagen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoImagen.add(this.jMenuItemGuardarCambiosTipoImagen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoImagen.add(this.jmenuArchivoTipoImagen);		
			this.jmenuBarTipoImagen.add(this.jmenuAccionesTipoImagen);		
			this.jmenuBarTipoImagen.add(this.jmenuDatosTipoImagen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoImagen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoImagen() {
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
			//this.jInternalFrameDetalleTipoImagen = new TipoImagenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Imagen DATOS");
			this.jInternalFrameDetalleFormTipoImagen = new TipoImagenDetalleFormJInternalFrame(jDesktopPane,this.tipoimagenSessionBean.getConGuardarRelaciones(),this.tipoimagenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoImagen = null;//new TipoImagenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImagen= new GridBagLayout();
		
		
		this.jTableDatosTipoImagen = new JTableMe();      
		
		String sToolTipTipoImagen="";
		sToolTipTipoImagen=TipoImagenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImagen+="(Seguridad.TipoImagen)";
		}
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImagen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoImagen.setToolTipText(sToolTipTipoImagen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoImagen);
		this.jTableDatosTipoImagen.setAutoCreateRowSorter(true);
		this.jTableDatosTipoImagen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoImagen.setRowSelectionAllowed(true);
		this.jTableDatosTipoImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoImagen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoImagen = new JButtonMe();
		this.jButtonDuplicarTipoImagen = new JButtonMe();
		this.jButtonCopiarTipoImagen = new JButtonMe();
		this.jButtonVerFormTipoImagen = new JButtonMe();
		this.jButtonNuevoRelacionesTipoImagen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoImagen = new JButtonMe();
		this.jButtonCerrarTipoImagen = new JButtonMe();
		
		this.jScrollPanelDatosTipoImagen = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoImagen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Imagen";
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImagen.setToolTipText("Acciones");
        this.jPanelAccionesTipoImagen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoImagen=new ReporteDinamicoJInternalFrame(TipoImagenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoImagen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoImagen=new ImportacionJInternalFrame(TipoImagenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoImagen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoImagen = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoImagen.setText("Orden");
		this.jButtonAbrirOrderByTipoImagen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImagen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagen,false,this);
			
			//this.cargarOrderByTipoImagen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagen,true,this);
			
			//this.cargarOrderByTipoImagen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoImagen.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImagen.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImagen.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoImagen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImagen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImagen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoImagen.setText("Nuevo");
		this.jButtonDuplicarTipoImagen.setText("Duplicar");
		this.jButtonCopiarTipoImagen.setText("Copiar");
		this.jButtonVerFormTipoImagen.setText("Ver");
		this.jButtonNuevoRelacionesTipoImagen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoImagen.setText("Guardar");
		this.jButtonCerrarTipoImagen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImagen,"nuevo_button","Nuevo",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoImagen,"duplicar_button","Duplicar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoImagen,"copiar_button","Copiar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoImagen,"ver_form","Ver",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoImagen,"nuevorelaciones_button","Nuevo Rel",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImagen,"guardarcambiostabla_button","Guardar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImagen,"cerrar_button","Salir",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoImagen.setToolTipText("Nuevo"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoImagen.setToolTipText("Duplicar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoImagen.setToolTipText("Copiar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoImagen.setToolTipText("Ver"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoImagen.setToolTipText("Nuevo Rel"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoImagen.setToolTipText("Guardar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImagen.setToolTipText("Salir"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImagen";
		inputMap = this.jButtonNuevoTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImagen"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoImagen";
		inputMap = this.jButtonDuplicarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoImagen"));
		
		//COPIAR
		sMapKey = "CopiarTipoImagen";
		inputMap = this.jButtonCopiarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoImagen"));
		
		//VEr FORM
		sMapKey = "VerFormTipoImagen";
		inputMap = this.jButtonVerFormTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoImagen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoImagen";
		inputMap = this.jButtonNuevoRelacionesTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoImagen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoImagen";
		inputMap = this.jButtonModificarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoImagen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoImagen";
		inputMap = this.jButtonCerrarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImagen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImagen";
		inputMap = this.jButtonGuardarCambiosTablaTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImagen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoImagen.setName("jPanelParametrosReportesTipoImagen"); 
		
		this.jPanelParametrosReportesAccionesTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoImagen.setName("jPanelParametrosReportesAccionesTipoImagen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoImagen = new JButtonMe();
		this.jButtonRecargarInformacionTipoImagen.setText("Recargar");
		this.jButtonRecargarInformacionTipoImagen.setToolTipText("Recargar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoImagen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoImagen = new JButtonMe();
		this.jButtonProcesarInformacionTipoImagen.setText("Procesar");
		this.jButtonProcesarInformacionTipoImagen.setToolTipText("Procesar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoImagen.setVisible(false);
			
		this.jButtonProcesarInformacionTipoImagen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImagen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImagen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoImagen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagen.setText("TIPO");       
		this.jComboBoxTiposReportesTipoImagen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoImagen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoImagen.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoImagen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoImagen.setText("Accion");
		this.jComboBoxTiposRelacionesTipoImagen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImagen.setText("Accion");
		this.jComboBoxTiposAccionesTipoImagen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoImagen.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoImagen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoImagen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoImagen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImagen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImagen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoImagen = new JLabelMe();
		
		this.jLabelAccionesTipoImagen.setText("Acciones");		
		this.jLabelAccionesTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoImagen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoImagen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoImagen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoImagen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoImagen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoImagen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoImagen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoImagen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoImagen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoImagen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoImagen.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoImagen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoImagen = new JButtonMe();
		//this.jButtonAnterioresTipoImagen.setText("<<");
        this.jButtonAnterioresTipoImagen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoImagen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoImagen = new JButtonMe();
		//this.jButtonSiguientesTipoImagen.setText(">>");
        this.jButtonSiguientesTipoImagen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoImagen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoImagen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoImagen.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoImagen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoImagen,"nuevoguardarcambios_button","Nue",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoImagen";
		inputMap = this.jButtonNuevoGuardarCambiosTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoImagen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoImagen";
		inputMap = this.jButtonRecargarInformacionTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoImagen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoImagen";
		inputMap = this.jButtonSiguientesTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoImagen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoImagen";
		inputMap = this.jButtonAnterioresTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoImagen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoImagen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoImagen.setMinimumSize(new Dimension(this.getWidth(),TipoImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImagen.setMaximumSize(new Dimension(this.getWidth(),TipoImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImagen.setPreferredSize(new Dimension(this.getWidth(),TipoImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoImagen = new GridBagLayout();

			this.jPanelPaginacionTipoImagen.setLayout(gridaBagLayoutPaginacionTipoImagen);						
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 0;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoImagen.add(this.jButtonAnterioresTipoImagen, this.gridBagConstraintsTipoImagen);
					
						
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImagen.gridy = 0;
			
			this.jPanelPaginacionTipoImagen.add(this.jButtonNuevoGuardarCambiosTipoImagen, this.gridBagConstraintsTipoImagen);
						
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImagen.gridy = 0;
			this.jPanelPaginacionTipoImagen.add(this.jButtonSiguientesTipoImagen, this.gridBagConstraintsTipoImagen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 1;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagen.add(this.jButtonNuevoTipoImagen, this.gridBagConstraintsTipoImagen);
						
			
			
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoImagen = new GridBagConstraints();
				this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoImagen.gridy = 1;
				this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoImagen.add(this.jButtonGuardarCambiosTablaTipoImagen, this.gridBagConstraintsTipoImagen);
			}
			
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 1;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagen.add(this.jButtonDuplicarTipoImagen, this.gridBagConstraintsTipoImagen);
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 1;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagen.add(this.jButtonCopiarTipoImagen, this.gridBagConstraintsTipoImagen);
		
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 1;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagen.add(this.jButtonVerFormTipoImagen, this.gridBagConstraintsTipoImagen);
		
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 1;
			this.gridBagConstraintsTipoImagen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoImagen.add(this.jButtonCerrarTipoImagen, this.gridBagConstraintsTipoImagen);
		
		
		
		this.jButtonRecargarInformacionTipoImagen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImagen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImagen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoImagen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImagen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImagen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoImagen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImagen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImagen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoImagen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImagen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImagen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoImagen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImagen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImagen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoImagen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImagen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImagen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoImagen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImagen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImagen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoImagen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImagen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImagen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoImagen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoImagen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoImagen.setLayout(gridaBagParametrosReportesTipoImagen);
			this.jPanelParametrosReportesAccionesTipoImagen.setLayout(gridaBagParametrosReportesAccionesTipoImagen);
			
			
			this.jPanelParametrosAuxiliar1TipoImagen.setLayout(gridaBagParametrosAuxiliar1TipoImagen);
			this.jPanelParametrosAuxiliar2TipoImagen.setLayout(gridaBagParametrosAuxiliar2TipoImagen);
			this.jPanelParametrosAuxiliar3TipoImagen.setLayout(gridaBagParametrosAuxiliar3TipoImagen);
			this.jPanelParametrosAuxiliar4TipoImagen.setLayout(gridaBagParametrosAuxiliar4TipoImagen);
			//this.jPanelParametrosAuxiliar5TipoImagen.setLayout(gridaBagParametrosAuxiliar2TipoImagen);			
			
			
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagen.add(this.jButtonRecargarInformacionTipoImagen, this.gridBagConstraintsTipoImagen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagen.add(this.jComboBoxTiposPaginacionTipoImagen, this.gridBagConstraintsTipoImagen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagen.add(this.jCheckBoxConAltoMaximoTablaTipoImagen, this.gridBagConstraintsTipoImagen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagen.add(this.jComboBoxTiposArchivosReportesTipoImagen, this.gridBagConstraintsTipoImagen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagen.add(this.jPanelParametrosAuxiliar1TipoImagen, this.gridBagConstraintsTipoImagen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoImagen.add(this.jComboBoxTiposReportesTipoImagen, this.gridBagConstraintsTipoImagen);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagen.add(this.jPanelParametrosAuxiliar4TipoImagen, this.gridBagConstraintsTipoImagen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagen.add(this.jComboBoxTiposReportesTipoImagen, this.gridBagConstraintsTipoImagen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagen.add(this.jCheckBoxGenerarReporteTipoImagen, this.gridBagConstraintsTipoImagen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagen.add(this.jPanelParametrosAuxiliar2TipoImagen, this.gridBagConstraintsTipoImagen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagen.add(this.jLabelAccionesTipoImagen, this.gridBagConstraintsTipoImagen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoImagen = new GridBagConstraints();
				this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoImagen.add(this.jButtonAbrirOrderByTipoImagen, this.gridBagConstraintsTipoImagen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagen.add(this.jComboBoxTiposSeleccionarTipoImagen, this.gridBagConstraintsTipoImagen);			
			
			
			/*
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagen.add(this.jCheckBoxSeleccionarTodosTipoImagen, this.gridBagConstraintsTipoImagen);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImagen.add(this.jCheckBoxSeleccionarTodosTipoImagen, this.gridBagConstraintsTipoImagen);															
				
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImagen.add(this.jCheckBoxSeleccionadosTipoImagen, this.gridBagConstraintsTipoImagen);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagen.add(this.jPanelParametrosAuxiliar3TipoImagen, this.gridBagConstraintsTipoImagen);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagen.add(this.jComboBoxTiposRelacionesTipoImagen, this.gridBagConstraintsTipoImagen);
				
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagen.add(this.jComboBoxTiposAccionesTipoImagen, this.gridBagConstraintsTipoImagen);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoImagen = new GridBagLayout();

			this.jScrollPanelDatosTipoImagen.setLayout(gridaBagLayoutDatosTipoImagen);
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = 0;
			this.gridBagConstraintsTipoImagen.gridx = 0;
			
			this.jScrollPanelDatosTipoImagen.add(this.jTableDatosTipoImagen, this.gridBagConstraintsTipoImagen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoImagen.setViewportView(this.jTableDatosTipoImagen);
		this.jTableDatosTipoImagen.setFillsViewportHeight(true);
		this.jTableDatosTipoImagen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoImagen= new GridBagLayout();
		this.jPanelAccionesTipoImagen.setLayout(gridaBagLayoutAccionesTipoImagen);
		
		
		/*	
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = 0;
		this.gridBagConstraintsTipoImagen.gridx = 0;
			
		this.jPanelAccionesTipoImagen.add(this.jButtonNuevoTipoImagen, this.gridBagConstraintsTipoImagen);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImagen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImagen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();						
			this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImagen.gridx = 0;		
			//this.gridBagConstraintsTipoImagen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImagen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoImagen, this.gridBagConstraintsTipoImagen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoImagen.gridx = 0;		
		//this.gridBagConstraintsTipoImagen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoImagen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoImagen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoImagen, this.gridBagConstraintsTipoImagen);								
		
		
		/*
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoImagen, this.gridBagConstraintsTipoImagen);
		*/		
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImagen.gridx =0;
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImagen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImagen, this.gridBagConstraintsTipoImagen);
				
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoImagen, this.gridBagConstraintsTipoImagen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImagen = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoImagen.setLayout(gridaBagLayoutBusquedasParametrosTipoImagen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoImagen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImagen, this.gridBagConstraintsTipoImagen);
			
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImagen, this.gridBagConstraintsTipoImagen);
		
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImagen, this.gridBagConstraintsTipoImagen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoImagen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoImagen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoImagen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoImagen.setName("jPanelReporteDinamicoTipoImagen"); 
		
		this.jPanelReporteDinamicoTipoImagen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImagen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImagen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoImagen.setLayout(gridaBagLayoutReporteDinamicoTipoImagen);
		
		
		this.jInternalFrameReporteDinamicoTipoImagen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoImagen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImagen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoImagen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoImagen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoImagen.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoImagen.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoImagen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoImagen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImagen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImagen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoImagen = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoImagen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoImagen.add(this.jLabelColumnasSelectReporteTipoImagen, this.gridBagConstraintsTipoImagen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoImagen = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoImagen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoImagen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImagen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImagen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoImagen=new JScrollPane(this.jListColumnasSelectReporteTipoImagen);
			
			this.jScrollColumnasSelectReporteTipoImagen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImagen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImagen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoImagen.add(this.jListColumnasSelectReporteTipoImagen, this.gridBagConstraintsTipoImagen);
		this.jPanelReporteDinamicoTipoImagen.add(this.jScrollColumnasSelectReporteTipoImagen, this.gridBagConstraintsTipoImagen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoImagen = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoImagen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoImagen = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoImagen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoImagen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImagen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImagen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoImagen=new JScrollPane(this.jListRelacionesSelectReporteTipoImagen);
			
			this.jScrollRelacionesSelectReporteTipoImagen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImagen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImagen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoImagen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoImagen = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoImagen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoImagen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoImagen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoImagen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoImagen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImagen.add(this.jLabelGenerarExcelReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoImagen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoImagen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoImagen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoImagen.setToolTipText("Generar EXCEL"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoImagen.add(this.jButtonGenerarExcelReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagen.add(this.jComboBoxTiposReportesDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoImagen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoImagen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImagen.add(this.jLabelTiposArchivoReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagen.add(this.jComboBoxTiposArchivosReportesDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoImagen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoImagen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoImagen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoImagen.setToolTipText("Generar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagen.add(this.jButtonGenerarReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoImagen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoImagen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoImagen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoImagen.setToolTipText("Cancelar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagen.add(this.jButtonCerrarReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoImagen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoImagen= new JScrollPane(jPanelReporteDinamicoTipoImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoImagen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImagen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImagen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoImagen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoImagen);
		this.jInternalFrameReporteDinamicoTipoImagen.getContentPane().add(this.jScrollPanelReporteDinamicoTipoImagen, this.gridBagConstraintsTipoImagen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoImagen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoImagen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoImagen.setName("jPanelImportacionTipoImagen"); 
		
		this.jPanelImportacionTipoImagen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImagen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImagen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoImagen.setLayout(gridaBagLayoutImportacionTipoImagen);
		
		
		this.jInternalFrameImportacionTipoImagen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoImagen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoImagen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImagen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImagen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoImagen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImagen.setResizable(true);
	    this.jInternalFrameImportacionTipoImagen.setClosable(true);
	    this.jInternalFrameImportacionTipoImagen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImagen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoImagen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImagen.setResizable(true);
	    this.jInternalFrameImportacionTipoImagen.setClosable(true);
	    this.jInternalFrameImportacionTipoImagen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoImagen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImagen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImagen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoImagen = new JLabelMe();

		this.jLabelArchivoImportacionTipoImagen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImagen.add(this.jLabelArchivoImportacionTipoImagen, this.gridBagConstraintsTipoImagen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoImagen = new JFileChooser();		
		this.jFileChooserImportacionTipoImagen.setToolTipText("ESCOGER ARCHIVO"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoImagen = new JButtonMe();
		this.jButtonAbrirImportacionTipoImagen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoImagen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoImagen.setToolTipText("Generar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagen.add(this.jButtonAbrirImportacionTipoImagen, this.gridBagConstraintsTipoImagen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoImagen = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoImagen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImagen.add(this.jLabelPathArchivoImportacionTipoImagen, this.gridBagConstraintsTipoImagen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoImagen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoImagen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImagen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImagen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagen.add(this.jTextFieldPathArchivoImportacionTipoImagen, this.gridBagConstraintsTipoImagen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoImagen = new JButtonMe();
		this.jButtonGenerarImportacionTipoImagen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoImagen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoImagen.setToolTipText("Generar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagen.add(this.jButtonGenerarImportacionTipoImagen, this.gridBagConstraintsTipoImagen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoImagen = new JButtonMe();
		this.jButtonCerrarImportacionTipoImagen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoImagen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoImagen.setToolTipText("Cancelar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagen.add(this.jButtonCerrarImportacionTipoImagen, this.gridBagConstraintsTipoImagen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoImagen = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoImagen= new JScrollPane(jPanelImportacionTipoImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoImagen.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoImagen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoImagen);
		this.jInternalFrameImportacionTipoImagen.getContentPane().add(this.jScrollPanelImportacionTipoImagen, this.gridBagConstraintsTipoImagen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoImagen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoImagen = new JButtonMe();
			this.jButtonAbrirOrderByTipoImagen.setText("Orden");
			this.jButtonAbrirOrderByTipoImagen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImagen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoImagen";
			inputMap = this.jButtonAbrirOrderByTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoImagen"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoImagen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoImagen.setName("jPanelOrderByTipoImagen"); 
			
			this.jPanelOrderByTipoImagen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImagen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImagen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoImagen.setLayout(gridaBagLayoutOrderByTipoImagen);
			
			
			this.jTableDatosTipoImagenOrderBy = new JTableMe();        
			this.jTableDatosTipoImagenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoImagenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoImagenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoImagenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoImagenOrderBy.setViewportView(this.jTableDatosTipoImagenOrderBy);
			this.jTableDatosTipoImagenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoImagenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoImagen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoImagen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoImagen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoImagen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoImagen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoImagen.setTitle("Orden");
			this.jInternalFrameOrderByTipoImagen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoImagen.setResizable(true);
			this.jInternalFrameOrderByTipoImagen.setClosable(true);
			this.jInternalFrameOrderByTipoImagen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoImagen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImagen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImagen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoImagen.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoImagen.ipady =150;
				
			this.jPanelOrderByTipoImagen.add(jScrollPanelDatosTipoImagenOrderBy, this.gridBagConstraintsTipoImagen);//this.jTableDatosTipoImagenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoImagen = new JButtonMe();
			this.jButtonCerrarOrderByTipoImagen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoImagen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoImagen.setToolTipText("Cancelar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoImagen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoImagen.add(this.jButtonCerrarOrderByTipoImagen, this.gridBagConstraintsTipoImagen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoImagen = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoImagen= new JScrollPane(jPanelOrderByTipoImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoImagen.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoImagen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoImagen);
			
			this.jInternalFrameOrderByTipoImagen.getContentPane().add(this.jScrollPanelOrderByTipoImagen, this.gridBagConstraintsTipoImagen);			
		
		} else {
			this.jButtonAbrirOrderByTipoImagen = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoimagenSessionBean.getConGuardarRelaciones()
			) {
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
		int iCountColumns=this.jTableDatosTipoImagen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoImagen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoImagen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoImagen.getRowHeight();//TipoImagenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImagen.isSelected()) {
					iHeightTable=TipoImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImagen.isSelected()) {
					iHeightTable=TipoImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoImagen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImagen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImagen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoImagen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImagen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImagen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoImagen!=null && this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoImagen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoImagen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoImagen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoImagen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImagen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImagen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoimagenLogic.getTipoImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoImagen> TraerTipoImagenBeans(List<TipoImagen> tipoimagens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoImagen tipoimagen:tipoimagens) {
					
				if(!(TipoImagenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoImagenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoimagen.setsDetalleGeneralEntityReporte(TipoImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagen));
										
						
					
						
					
				} else  {
							
					//tipoimagen.setsDetalleGeneralEntityReporte(tipoimagen.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoimagenbeans.add(tipoimagenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoimagens;
    }
	//PARA REPORTES FIN
}
