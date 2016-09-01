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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoDetalleProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoDetalleProformaJInternalFrame extends EstadoDetalleProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleProforma;
	
	protected JMenuBar jmenuBarEstadoDetalleProforma;
	
	protected JMenu jmenuEstadoDetalleProforma;
	protected JMenu jmenuDatosEstadoDetalleProforma;
	protected JMenu jmenuArchivoEstadoDetalleProforma;
	protected JMenu jmenuAccionesEstadoDetalleProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleProforma;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleProformaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleProforma> estadodetalleproformas;		
	public List<EstadoDetalleProforma> estadodetalleproformasEliminados;	
	public List<EstadoDetalleProforma> estadodetalleproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleProforma;		
	protected JButton jButtonAbrirOrderByEstadoDetalleProforma;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleProforma;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleProforma;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleProformaLogic estadodetalleproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleProforma;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleProforma;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleProforma;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleProforma;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleProforma;
	
    protected JPanel jPanelPaginacionEstadoDetalleProforma;
    protected JPanel jPanelParametrosReportesEstadoDetalleProforma;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleProforma;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleProforma;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleProforma;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleProforma;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleProforma;
	//protected JPanel jPanelImportacionEstadoDetalleProforma;
	
	
	public JTable jTableDatosEstadoDetalleProforma;
	
	
	
	//public JTable jTableDatosEstadoDetalleProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleProforma;
	protected JButton jButtonDuplicarEstadoDetalleProforma;
	protected JButton jButtonCopiarEstadoDetalleProforma;
	protected JButton jButtonVerFormEstadoDetalleProforma;
	protected JButton jButtonNuevoRelacionesEstadoDetalleProforma;
	protected JButton jButtonModificarEstadoDetalleProforma;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleProforma;
	protected JButton jButtonCerrarEstadoDetalleProforma;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleProforma;
	protected JButton jButtonProcesarInformacionEstadoDetalleProforma;
	
	
	protected JButton jButtonAnterioresEstadoDetalleProforma;
	protected JButton jButtonSiguientesEstadoDetalleProforma;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleProforma;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleProforma;
	//protected JButton jButtonGenerarImportacionEstadoDetalleProforma;
	//protected JButton jButtonCerrarImportacionEstadoDetalleProforma;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleProforma;
	//protected File fileImportacionEstadoDetalleProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleProforma;
	protected JButton jButtonDuplicarToolBarEstadoDetalleProforma;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleProforma;
	protected JButton jButtonCopiarToolBarEstadoDetalleProforma;
	protected JButton jButtonVerFormToolBarEstadoDetalleProforma;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleProforma;
	protected JButton jButtonCerrarToolBarEstadoDetalleProforma;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleProforma;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleProforma;
	protected JButton jButtonAnterioresToolBarEstadoDetalleProforma;
	protected JButton jButtonSiguientesToolBarEstadoDetalleProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleProforma;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleProforma;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleProforma;
	protected JMenuItem jMenuItemCopiarEstadoDetalleProforma;
	protected JMenuItem jMenuItemVerFormEstadoDetalleProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleProforma;
	protected JMenuItem jMenuItemCerrarEstadoDetalleProforma;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleProforma;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleProforma;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleProforma;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleProforma;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleProforma;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleProforma;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleProforma;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleProforma;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleProforma;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleProforma;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleProforma;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleProforma;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleProforma;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleProforma;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleProforma;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleProforma;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleProforma;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleProforma;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleProforma;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleProforma;	
	
	
	
	
	
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
	public EstadoDetalleProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleProforma)	{
		this.jButtonRecargarInformacionEstadoDetalleProforma = jButtonRecargarInformacionEstadoDetalleProforma;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleProforma() {
		return this.jButtonProcesarInformacionEstadoDetalleProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleProforma)	{
		this.jButtonProcesarInformacionEstadoDetalleProforma = jButtonProcesarInformacionEstadoDetalleProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleProforma() {
		return this.jButtonRecargarInformacionEstadoDetalleProforma;
	}
	
	
	public List<EstadoDetalleProforma> getestadodetalleproformas() {
		return this.estadodetalleproformas;
	}

	public void setestadodetalleproformas(List<EstadoDetalleProforma> estadodetalleproformas) {
		this.estadodetalleproformas = estadodetalleproformas;
	}
	
	public List<EstadoDetalleProforma> getestadodetalleproformasAux() {
		return this.estadodetalleproformasAux;
	}

	public void setestadodetalleproformasAux(List<EstadoDetalleProforma> estadodetalleproformasAux) {
		this.estadodetalleproformasAux = estadodetalleproformasAux;
	}
	
	public List<EstadoDetalleProforma> getestadodetalleproformasEliminados() {
		return this.estadodetalleproformasEliminados;
	}

	public void setEstadoDetalleProformasEliminados(List<EstadoDetalleProforma> estadodetalleproformasEliminados) {
		this.estadodetalleproformasEliminados = estadodetalleproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleProforma() {
		return jComboBoxTiposSeleccionarEstadoDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleProforma(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleProforma) {
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma = jComboBoxTiposSeleccionarEstadoDetalleProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleProforma() {
		return jTextFieldValorCampoGeneralEstadoDetalleProforma;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleProforma(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleProforma) {
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma = jTextFieldValorCampoGeneralEstadoDetalleProforma;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleProforma() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleProforma;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleProforma(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleProforma) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma = jCheckBoxSeleccionarTodosEstadoDetalleProforma;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleProforma() {
		return this.jCheckBoxSeleccionadosEstadoDetalleProforma;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleProforma(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleProforma) {
		this.jCheckBoxSeleccionadosEstadoDetalleProforma = jCheckBoxSeleccionadosEstadoDetalleProforma;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleProforma() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleProforma(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleProforma) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma = jComboBoxTiposArchivosReportesEstadoDetalleProforma;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleProforma() {
		return this.jComboBoxTiposReportesEstadoDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleProforma(
			JComboBox jComboBoxTiposReportesEstadoDetalleProforma) {
		this.jComboBoxTiposReportesEstadoDetalleProforma = jComboBoxTiposReportesEstadoDetalleProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleProforma() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleProforma) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma = jComboBoxTiposReportesDinamicoEstadoDetalleProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleProforma() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleProforma(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleProforma) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma = jComboBoxTiposGraficosReportesEstadoDetalleProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleProforma() {
		return this.jComboBoxTiposPaginacionEstadoDetalleProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleProforma(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleProforma) {
		this.jComboBoxTiposPaginacionEstadoDetalleProforma = jComboBoxTiposPaginacionEstadoDetalleProforma;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleProforma() {
		return this.jComboBoxTiposRelacionesEstadoDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleProforma() {
		return this.jComboBoxTiposAccionesEstadoDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleProforma(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleProforma) {
		this.jComboBoxTiposRelacionesEstadoDetalleProforma = jComboBoxTiposRelacionesEstadoDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleProforma(
			JComboBox jComboBoxTiposAccionesEstadoDetalleProforma) {
		this.jComboBoxTiposAccionesEstadoDetalleProforma = jComboBoxTiposAccionesEstadoDetalleProforma;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleProforma() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleProforma) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleProforma = jCheckBoxConGraficoDinamicoEstadoDetalleProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleProforma .setBorder(borderResaltar);		
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
		this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		
		this.estadodetalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"copiar","copiar","Copiar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"recargar","recargar","Recargar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleProforma;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleProforma;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleProforma=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleProforma=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleProforma=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleProforma.add(this.jMenuItemCerrarEstadoDetalleProforma);
			
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemNuevoEstadoDetalleProforma);
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma);
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemNuevoRelacionesEstadoDetalleProforma);
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma);		
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemDuplicarEstadoDetalleProforma);		
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemCopiarEstadoDetalleProforma);		
			this.jmenuAccionesEstadoDetalleProforma.add(this.jMenuItemVerFormEstadoDetalleProforma);		
			
			this.jmenuDatosEstadoDetalleProforma.add(this.jMenuItemRecargarInformacionEstadoDetalleProforma);				
			this.jmenuDatosEstadoDetalleProforma.add(this.jMenuItemAnterioresEstadoDetalleProforma);				
			this.jmenuDatosEstadoDetalleProforma.add(this.jMenuItemSiguientesEstadoDetalleProforma);				
			this.jmenuDatosEstadoDetalleProforma.add(this.jMenuItemAbrirOrderByEstadoDetalleProforma);				
			this.jmenuDatosEstadoDetalleProforma.add(this.jMenuItemMostrarOcultarEstadoDetalleProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleProforma.add(this.jMenuItemGuardarCambiosEstadoDetalleProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleProforma.add(this.jmenuArchivoEstadoDetalleProforma);		
			this.jmenuBarEstadoDetalleProforma.add(this.jmenuAccionesEstadoDetalleProforma);		
			this.jmenuBarEstadoDetalleProforma.add(this.jmenuDatosEstadoDetalleProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleProforma() {
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
			//this.jInternalFrameDetalleEstadoDetalleProforma = new EstadoDetalleProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Proforma DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleProforma = new EstadoDetalleProformaDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleproformaSessionBean.getConGuardarRelaciones(),this.estadodetalleproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleProforma = null;//new EstadoDetalleProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleProforma= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleProforma = new JTableMe();      
		
		String sToolTipEstadoDetalleProforma="";
		sToolTipEstadoDetalleProforma=EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleProforma+="(Facturacion.EstadoDetalleProforma)";
		}
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleProforma.setToolTipText(sToolTipEstadoDetalleProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleProforma);
		this.jTableDatosEstadoDetalleProforma.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleProforma.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleProforma = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleProforma = new JButtonMe();
		this.jButtonCopiarEstadoDetalleProforma = new JButtonMe();
		this.jButtonVerFormEstadoDetalleProforma = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma = new JButtonMe();
		this.jButtonCerrarEstadoDetalleProforma = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Proforma";
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleProforma=new ReporteDinamicoJInternalFrame(EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleProforma=new ImportacionJInternalFrame(EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleProforma.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleProforma,false,this);
			
			//this.cargarOrderByEstadoDetalleProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleProforma,true,this);
			
			//this.cargarOrderByEstadoDetalleProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleProforma.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleProforma.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleProforma.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleProforma.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleProforma.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleProforma.setText("Copiar");
		this.jButtonVerFormEstadoDetalleProforma.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setText("Guardar");
		this.jButtonCerrarEstadoDetalleProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleProforma,"nuevo_button","Nuevo",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleProforma,"duplicar_button","Duplicar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleProforma,"copiar_button","Copiar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleProforma,"ver_form","Ver",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleProforma,"nuevorelaciones_button","Nuevo Rel",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleProforma,"guardarcambiostabla_button","Guardar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleProforma,"cerrar_button","Salir",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleProforma.setToolTipText("Nuevo"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleProforma.setToolTipText("Duplicar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleProforma.setToolTipText("Copiar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleProforma.setToolTipText("Ver"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleProforma.setToolTipText("Nuevo Rel"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setToolTipText("Guardar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleProforma.setToolTipText("Salir"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleProforma";
		inputMap = this.jButtonNuevoEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleProforma";
		inputMap = this.jButtonDuplicarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleProforma"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleProforma";
		inputMap = this.jButtonCopiarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleProforma"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleProforma";
		inputMap = this.jButtonVerFormEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleProforma";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleProforma";
		inputMap = this.jButtonModificarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleProforma";
		inputMap = this.jButtonCerrarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleProforma";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleProforma.setName("jPanelParametrosReportesEstadoDetalleProforma"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleProforma.setName("jPanelParametrosReportesAccionesEstadoDetalleProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleProforma = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleProforma.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleProforma.setToolTipText("Recargar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleProforma = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleProforma.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleProforma.setToolTipText("Procesar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleProforma.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleProforma.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleProforma.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleProforma = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleProforma.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleProforma = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleProforma.setText("<<");
        this.jButtonAnterioresEstadoDetalleProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleProforma = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleProforma.setText(">>");
        this.jButtonSiguientesEstadoDetalleProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleProforma,"nuevoguardarcambios_button","Nue",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleProforma";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleProforma";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleProforma";
		inputMap = this.jButtonSiguientesEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleProforma";
		inputMap = this.jButtonAnterioresEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleProforma.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleProforma.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleProforma.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleProforma = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleProforma.setLayout(gridaBagLayoutPaginacionEstadoDetalleProforma);						
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonAnterioresEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					
						
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonNuevoGuardarCambiosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
						
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonSiguientesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonNuevoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
				this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonNuevoRelacionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			}
			
			
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
				this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonGuardarCambiosTablaEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonDuplicarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonCopiarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonVerFormEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 1;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleProforma.add(this.jButtonCerrarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleProforma.setLayout(gridaBagParametrosReportesEstadoDetalleProforma);
			this.jPanelParametrosReportesAccionesEstadoDetalleProforma.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleProforma);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleProforma.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleProforma);
			this.jPanelParametrosAuxiliar2EstadoDetalleProforma.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleProforma);
			this.jPanelParametrosAuxiliar3EstadoDetalleProforma.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleProforma);
			this.jPanelParametrosAuxiliar4EstadoDetalleProforma.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleProforma);
			//this.jPanelParametrosAuxiliar5EstadoDetalleProforma.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleProforma);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jButtonRecargarInformacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleProforma.add(this.jComboBoxTiposPaginacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleProforma.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleProforma.add(this.jComboBoxTiposArchivosReportesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jPanelParametrosAuxiliar1EstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleProforma.add(this.jComboBoxTiposReportesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jPanelParametrosAuxiliar4EstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jComboBoxTiposReportesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jCheckBoxGenerarReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jPanelParametrosAuxiliar2EstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jLabelAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jButtonAbrirOrderByEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jComboBoxTiposSeleccionarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jCheckBoxSeleccionarTodosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleProforma.add(this.jCheckBoxSeleccionarTodosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);															
				
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleProforma.add(this.jCheckBoxSeleccionadosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jPanelParametrosAuxiliar3EstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jComboBoxTiposRelacionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
				
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jComboBoxTiposAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
	
				
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleProforma.add(this.jTextFieldValorCampoGeneralEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleProforma = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleProforma.setLayout(gridaBagLayoutDatosEstadoDetalleProforma);
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleProforma.add(this.jTableDatosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleProforma.setViewportView(this.jTableDatosEstadoDetalleProforma);
		this.jTableDatosEstadoDetalleProforma.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleProforma= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleProforma.setLayout(gridaBagLayoutAccionesEstadoDetalleProforma);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonNuevoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		*/		
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleProforma.gridx =0;
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
				
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleProforma.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleProforma.setName("jPanelReporteDinamicoEstadoDetalleProforma"); 
		
		this.jPanelReporteDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleProforma.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleProforma);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jLabelColumnasSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleProforma=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleProforma);
			
			this.jScrollColumnasSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jListColumnasSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jScrollColumnasSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jLabelRelacionesSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleProforma=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleProforma);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jListRelacionesSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jScrollRelacionesSelectReporteEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma.setToolTipText("Generar EXCEL"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleProforma.setToolTipText("Generar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jButtonGenerarReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleProforma.setToolTipText("Cancelar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleProforma.add(this.jButtonCerrarReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma= new JScrollPane(jPanelReporteDinamicoEstadoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleProforma);
		this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleProforma.setName("jPanelImportacionEstadoDetalleProforma"); 
		
		this.jPanelImportacionEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleProforma.setLayout(gridaBagLayoutImportacionEstadoDetalleProforma);
		
		
		this.jInternalFrameImportacionEstadoDetalleProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleProforma.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleProforma.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleProforma = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleProforma.add(this.jLabelArchivoImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleProforma = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleProforma.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleProforma = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleProforma.setToolTipText("Generar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleProforma.add(this.jButtonAbrirImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleProforma.add(this.jLabelPathArchivoImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleProforma.add(this.jTextFieldPathArchivoImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleProforma = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleProforma.setToolTipText("Generar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleProforma.add(this.jButtonGenerarImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleProforma = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleProforma.setToolTipText("Cancelar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleProforma.add(this.jButtonCerrarImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleProforma= new JScrollPane(jPanelImportacionEstadoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleProforma);
		this.jInternalFrameImportacionEstadoDetalleProforma.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleProforma = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleProforma.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleProforma";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleProforma.setName("jPanelOrderByEstadoDetalleProforma"); 
			
			this.jPanelOrderByEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleProforma.setLayout(gridaBagLayoutOrderByEstadoDetalleProforma);
			
			
			this.jTableDatosEstadoDetalleProformaOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleProformaOrderBy.setViewportView(this.jTableDatosEstadoDetalleProformaOrderBy);
			this.jTableDatosEstadoDetalleProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleProforma.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleProforma.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleProforma.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleProforma.ipady =150;
				
			this.jPanelOrderByEstadoDetalleProforma.add(jScrollPanelDatosEstadoDetalleProformaOrderBy, this.gridBagConstraintsEstadoDetalleProforma);//this.jTableDatosEstadoDetalleProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleProforma = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleProforma.setToolTipText("Cancelar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleProforma.add(this.jButtonCerrarOrderByEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleProforma= new JScrollPane(jPanelOrderByEstadoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleProforma);
			
			this.jInternalFrameOrderByEstadoDetalleProforma.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleProforma = new JButtonMe();
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
			&& this.estadodetalleproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleProforma.getRowHeight();//EstadoDetalleProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.isSelected()) {
					iHeightTable=EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleProforma.isSelected()) {
					iHeightTable=EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleProforma!=null && this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetalleproformaLogic.getEstadoDetalleProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleProforma> TraerEstadoDetalleProformaBeans(List<EstadoDetalleProforma> estadodetalleproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleProforma estadodetalleproforma:estadodetalleproformas) {
					
				if(!(EstadoDetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetalleproforma.setsDetalleGeneralEntityReporte(EstadoDetalleProformaConstantesFunciones.getEstadoDetalleProformaDescripcion(estadodetalleproforma));
										
						
					
					

					if(estadodetalleproforma.getDetalleProformas()!=null && Funciones.existeClass(classes,DetalleProforma.class)) {
						try{estadodetalleproforma.setdetalleproformasDescripcionReporte(new JRBeanCollectionDataSource(DetalleProformaJInternalFrame.TraerDetalleProformaBeans(estadodetalleproforma.getDetalleProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetalleproforma.setsDetalleGeneralEntityReporte(estadodetalleproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetalleproformabeans.add(estadodetalleproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetalleproformas;
    }
	//PARA REPORTES FIN
}
