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
import com.bydan.erp.nomina.util.EstadoNovedadNomiConstantesFunciones;

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
public class EstadoNovedadNomiJInternalFrame extends EstadoNovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoNovedadNomi;
	
	protected JMenuBar jmenuBarEstadoNovedadNomi;
	
	protected JMenu jmenuEstadoNovedadNomi;
	protected JMenu jmenuDatosEstadoNovedadNomi;
	protected JMenu jmenuArchivoEstadoNovedadNomi;
	protected JMenu jmenuAccionesEstadoNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsEstadoNovedadNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoNovedadNomiDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoNovedadNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoNovedadNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoNovedadNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoNovedadNomi> estadonovedadnomis;		
	public List<EstadoNovedadNomi> estadonovedadnomisEliminados;	
	public List<EstadoNovedadNomi> estadonovedadnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoNovedadNomi;		
	protected JButton jButtonAbrirOrderByEstadoNovedadNomi;
	
	
	//protected JPanel jPanelOrderByEstadoNovedadNomi;
	//public JScrollPane jScrollPanelOrderByEstadoNovedadNomi;	
	//protected JButton jButtonCerrarOrderByEstadoNovedadNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoNovedadNomiLogic estadonovedadnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionEstadoNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralEstadoNovedadNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoNovedadNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoNovedadNomi;
	//public JScrollPane jScrollPanelImportacionEstadoNovedadNomi;
	
	
	
	protected JPanel jPanelAccionesEstadoNovedadNomi;
	
    protected JPanel jPanelPaginacionEstadoNovedadNomi;
    protected JPanel jPanelParametrosReportesEstadoNovedadNomi;
	protected JPanel jPanelParametrosReportesAccionesEstadoNovedadNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar2EstadoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar3EstadoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar4EstadoNovedadNomi;
	//protected JPanel jPanelParametrosAuxiliar5EstadoNovedadNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoNovedadNomi;
	//protected JPanel jPanelImportacionEstadoNovedadNomi;
	
	
	public JTable jTableDatosEstadoNovedadNomi;
	
	
	
	//public JTable jTableDatosEstadoNovedadNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoNovedadNomi;
	protected JButton jButtonDuplicarEstadoNovedadNomi;
	protected JButton jButtonCopiarEstadoNovedadNomi;
	protected JButton jButtonVerFormEstadoNovedadNomi;
	protected JButton jButtonNuevoRelacionesEstadoNovedadNomi;
	protected JButton jButtonModificarEstadoNovedadNomi;
	
    protected JButton jButtonGuardarCambiosTablaEstadoNovedadNomi;
	protected JButton jButtonCerrarEstadoNovedadNomi;
	
	
	protected JButton jButtonRecargarInformacionEstadoNovedadNomi;
	protected JButton jButtonProcesarInformacionEstadoNovedadNomi;
	
	
	protected JButton jButtonAnterioresEstadoNovedadNomi;
	protected JButton jButtonSiguientesEstadoNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosEstadoNovedadNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoNovedadNomi;
	//protected JButton jButtonCerrarReporteDinamicoEstadoNovedadNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoNovedadNomi;
	//protected JButton jButtonGenerarImportacionEstadoNovedadNomi;
	//protected JButton jButtonCerrarImportacionEstadoNovedadNomi;
	//protected JFileChooser jFileChooserImportacionEstadoNovedadNomi;
	//protected File fileImportacionEstadoNovedadNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNovedadNomi;
	protected JButton jButtonDuplicarToolBarEstadoNovedadNomi;
	protected JButton jButtonNuevoRelacionesToolBarEstadoNovedadNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoNovedadNomi;
	protected JButton jButtonCopiarToolBarEstadoNovedadNomi;
	protected JButton jButtonVerFormToolBarEstadoNovedadNomi;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNovedadNomi;
	protected JButton jButtonCerrarToolBarEstadoNovedadNomi;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoNovedadNomi;
	protected JButton jButtonProcesarInformacionToolBarEstadoNovedadNomi;
	protected JButton jButtonAnterioresToolBarEstadoNovedadNomi;
	protected JButton jButtonSiguientesToolBarEstadoNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi;
	protected JButton jButtonAbrirOrderByToolBarEstadoNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNovedadNomi;
	protected JMenuItem jMenuItemDuplicarEstadoNovedadNomi;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoNovedadNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoNovedadNomi;
	protected JMenuItem jMenuItemCopiarEstadoNovedadNomi;
	protected JMenuItem jMenuItemVerFormEstadoNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNovedadNomi;
	protected JMenuItem jMenuItemCerrarEstadoNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNovedadNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNovedadNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoNovedadNomi;
	protected JMenuItem jMenuItemProcesarInformacionEstadoNovedadNomi;
	protected JMenuItem jMenuItemAnterioresEstadoNovedadNomi;
	protected JMenuItem jMenuItemSiguientesEstadoNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNovedadNomi;
	protected JMenuItem jMenuItemAbrirOrderByEstadoNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNovedadNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoNovedadNomi;
	protected JCheckBox jCheckBoxSeleccionadosEstadoNovedadNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoNovedadNomi;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoNovedadNomi;
	protected JTextField jTextFieldValorCampoGeneralEstadoNovedadNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoNovedadNomi;
	//public JList<Reporte> jListColumnasSelectReporteEstadoNovedadNomi;
	//public JScrollPane jScrollColumnasSelectReporteEstadoNovedadNomi;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoNovedadNomi;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoNovedadNomi;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoNovedadNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoNovedadNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoNovedadNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi;
	
		
	//public JLabel jLabelArchivoImportacionEstadoNovedadNomi;	
	//public JLabel jLabelPathArchivoImportacionEstadoNovedadNomi;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoNovedadNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoNovedadNomi;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoNovedadNomi;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoNovedadNomi;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoNovedadNomi;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoNovedadNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoNovedadNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoNovedadNomi;	
	
	
	
	
	
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
	public EstadoNovedadNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoNovedadNomi)	{
		this.jButtonRecargarInformacionEstadoNovedadNomi = jButtonRecargarInformacionEstadoNovedadNomi;
	}
	
	public JButton getjButtonProcesarInformacionEstadoNovedadNomi() {
		return this.jButtonProcesarInformacionEstadoNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNovedadNomi)	{
		this.jButtonProcesarInformacionEstadoNovedadNomi = jButtonProcesarInformacionEstadoNovedadNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoNovedadNomi() {
		return this.jButtonRecargarInformacionEstadoNovedadNomi;
	}
	
	
	public List<EstadoNovedadNomi> getestadonovedadnomis() {
		return this.estadonovedadnomis;
	}

	public void setestadonovedadnomis(List<EstadoNovedadNomi> estadonovedadnomis) {
		this.estadonovedadnomis = estadonovedadnomis;
	}
	
	public List<EstadoNovedadNomi> getestadonovedadnomisAux() {
		return this.estadonovedadnomisAux;
	}

	public void setestadonovedadnomisAux(List<EstadoNovedadNomi> estadonovedadnomisAux) {
		this.estadonovedadnomisAux = estadonovedadnomisAux;
	}
	
	public List<EstadoNovedadNomi> getestadonovedadnomisEliminados() {
		return this.estadonovedadnomisEliminados;
	}

	public void setEstadoNovedadNomisEliminados(List<EstadoNovedadNomi> estadonovedadnomisEliminados) {
		this.estadonovedadnomisEliminados = estadonovedadnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoNovedadNomi() {
		return jComboBoxTiposSeleccionarEstadoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoNovedadNomi(
			JComboBox jComboBoxTiposSeleccionarEstadoNovedadNomi) {
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi = jComboBoxTiposSeleccionarEstadoNovedadNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoNovedadNomi() {
		return jTextFieldValorCampoGeneralEstadoNovedadNomi;
	}

	public void setjTextFieldValorCampoGeneralEstadoNovedadNomi(
			JTextField jTextFieldValorCampoGeneralEstadoNovedadNomi) {
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi = jTextFieldValorCampoGeneralEstadoNovedadNomi;
	}

	public void setBorderResaltarValorCampoGeneralEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoNovedadNomi() {
		return this.jCheckBoxSeleccionarTodosEstadoNovedadNomi;
	}

	public void setjCheckBoxSeleccionarTodosEstadoNovedadNomi(
			JCheckBox jCheckBoxSeleccionarTodosEstadoNovedadNomi) {
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi = jCheckBoxSeleccionarTodosEstadoNovedadNomi;
	}

	public void setBorderResaltarSeleccionarTodosEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoNovedadNomi() {
		return this.jCheckBoxSeleccionadosEstadoNovedadNomi;
	}

	public void setjCheckBoxSeleccionadosEstadoNovedadNomi(
			JCheckBox jCheckBoxSeleccionadosEstadoNovedadNomi) {
		this.jCheckBoxSeleccionadosEstadoNovedadNomi = jCheckBoxSeleccionadosEstadoNovedadNomi;
	}
	
	public void setBorderResaltarSeleccionadosEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoNovedadNomi() {
		return this.jComboBoxTiposArchivosReportesEstadoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoNovedadNomi(
			JComboBox jComboBoxTiposArchivosReportesEstadoNovedadNomi) {
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi = jComboBoxTiposArchivosReportesEstadoNovedadNomi;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoNovedadNomi() {
		return this.jComboBoxTiposReportesEstadoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoNovedadNomi(
			JComboBox jComboBoxTiposReportesEstadoNovedadNomi) {
		this.jComboBoxTiposReportesEstadoNovedadNomi = jComboBoxTiposReportesEstadoNovedadNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoNovedadNomi() {
	//	return jComboBoxTiposReportesDinamicoEstadoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoNovedadNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoNovedadNomi) {
	//	this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi = jComboBoxTiposReportesDinamicoEstadoNovedadNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi = jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi;
	//}
	
	public void setBorderResaltarTiposReportesEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoNovedadNomi() {
		return this.jComboBoxTiposGraficosReportesEstadoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoNovedadNomi(
			JComboBox jComboBoxTiposGraficosReportesEstadoNovedadNomi) {
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi = jComboBoxTiposGraficosReportesEstadoNovedadNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoNovedadNomi() {
		return this.jComboBoxTiposPaginacionEstadoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoNovedadNomi(
			JComboBox jComboBoxTiposPaginacionEstadoNovedadNomi) {
		this.jComboBoxTiposPaginacionEstadoNovedadNomi = jComboBoxTiposPaginacionEstadoNovedadNomi;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoNovedadNomi() {
		return this.jComboBoxTiposRelacionesEstadoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNovedadNomi() {
		return this.jComboBoxTiposAccionesEstadoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNovedadNomi(
			JComboBox jComboBoxTiposRelacionesEstadoNovedadNomi) {
		this.jComboBoxTiposRelacionesEstadoNovedadNomi = jComboBoxTiposRelacionesEstadoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNovedadNomi(
			JComboBox jComboBoxTiposAccionesEstadoNovedadNomi) {
		this.jComboBoxTiposAccionesEstadoNovedadNomi = jComboBoxTiposAccionesEstadoNovedadNomi;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoNovedadNomi() {
	//	return jCheckBoxConGraficoDinamicoEstadoNovedadNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoNovedadNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoNovedadNomi) {
	//	this.jCheckBoxConGraficoDinamicoEstadoNovedadNomi = jCheckBoxConGraficoDinamicoEstadoNovedadNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoNovedadNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoNovedadNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoNovedadNomi .setBorder(borderResaltar);		
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
		this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		
		this.estadonovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonovedadnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoNovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoNovedadNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"nuevo","nuevo","Nuevo"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"duplicar","duplicar","Duplicar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"copiar","copiar","Copiar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"ver_form","ver_form","Ver"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"recargar","recargar","Recargar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,
							"cerrar","cerrar","Salir"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoNovedadNomi;
			
				this.jButtonProcesarInformacionToolBarEstadoNovedadNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoNovedadNomi;
				
		//protected JButton jButtonModificarToolBarEstadoNovedadNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoNovedadNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoNovedadNomi=new JMenuMe("General");
		this.jmenuArchivoEstadoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDatosEstadoNovedadNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoNovedadNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoNovedadNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoNovedadNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoNovedadNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoNovedadNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoNovedadNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoNovedadNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoNovedadNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoNovedadNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoNovedadNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoNovedadNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoNovedadNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoNovedadNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoNovedadNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoNovedadNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoNovedadNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoNovedadNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoNovedadNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoNovedadNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoNovedadNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoNovedadNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoNovedadNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoNovedadNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoNovedadNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoNovedadNomi.add(this.jMenuItemCerrarEstadoNovedadNomi);
			
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemNuevoEstadoNovedadNomi);
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi);
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemNuevoRelacionesEstadoNovedadNomi);
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi);		
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemDuplicarEstadoNovedadNomi);		
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemCopiarEstadoNovedadNomi);		
			this.jmenuAccionesEstadoNovedadNomi.add(this.jMenuItemVerFormEstadoNovedadNomi);		
			
			this.jmenuDatosEstadoNovedadNomi.add(this.jMenuItemRecargarInformacionEstadoNovedadNomi);				
			this.jmenuDatosEstadoNovedadNomi.add(this.jMenuItemAnterioresEstadoNovedadNomi);				
			this.jmenuDatosEstadoNovedadNomi.add(this.jMenuItemSiguientesEstadoNovedadNomi);				
			this.jmenuDatosEstadoNovedadNomi.add(this.jMenuItemAbrirOrderByEstadoNovedadNomi);				
			this.jmenuDatosEstadoNovedadNomi.add(this.jMenuItemMostrarOcultarEstadoNovedadNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoNovedadNomi.add(this.jMenuItemGuardarCambiosEstadoNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoNovedadNomi.add(this.jmenuArchivoEstadoNovedadNomi);		
			this.jmenuBarEstadoNovedadNomi.add(this.jmenuAccionesEstadoNovedadNomi);		
			this.jmenuBarEstadoNovedadNomi.add(this.jmenuDatosEstadoNovedadNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoNovedadNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoNovedadNomi() {
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
			//this.jInternalFrameDetalleEstadoNovedadNomi = new EstadoNovedadNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Novedad DATOS");
			this.jInternalFrameDetalleFormEstadoNovedadNomi = new EstadoNovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.estadonovedadnomiSessionBean.getConGuardarRelaciones(),this.estadonovedadnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoNovedadNomi = null;//new EstadoNovedadNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNovedadNomi= new GridBagLayout();
		
		
		this.jTableDatosEstadoNovedadNomi = new JTableMe();      
		
		String sToolTipEstadoNovedadNomi="";
		sToolTipEstadoNovedadNomi=EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNovedadNomi+="(Nomina.EstadoNovedadNomi)";
		}
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNovedadNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoNovedadNomi.setToolTipText(sToolTipEstadoNovedadNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoNovedadNomi);
		this.jTableDatosEstadoNovedadNomi.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoNovedadNomi.setRowSelectionAllowed(true);
		this.jTableDatosEstadoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoNovedadNomi = new JButtonMe();
		this.jButtonDuplicarEstadoNovedadNomi = new JButtonMe();
		this.jButtonCopiarEstadoNovedadNomi = new JButtonMe();
		this.jButtonVerFormEstadoNovedadNomi = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoNovedadNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi = new JButtonMe();
		this.jButtonCerrarEstadoNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoNovedadNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Novedad";
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNovedadNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoNovedadNomi=new ReporteDinamicoJInternalFrame(EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoNovedadNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoNovedadNomi=new ImportacionJInternalFrame(EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoNovedadNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoNovedadNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoNovedadNomi.setText("Orden");
		this.jButtonAbrirOrderByEstadoNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNovedadNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadNomi,false,this);
			
			//this.cargarOrderByEstadoNovedadNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadNomi,true,this);
			
			//this.cargarOrderByEstadoNovedadNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoNovedadNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNovedadNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNovedadNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoNovedadNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNovedadNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNovedadNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoNovedadNomi.setText("Nuevo");
		this.jButtonDuplicarEstadoNovedadNomi.setText("Duplicar");
		this.jButtonCopiarEstadoNovedadNomi.setText("Copiar");
		this.jButtonVerFormEstadoNovedadNomi.setText("Ver");
		this.jButtonNuevoRelacionesEstadoNovedadNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setText("Guardar");
		this.jButtonCerrarEstadoNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNovedadNomi,"nuevo_button","Nuevo",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoNovedadNomi,"duplicar_button","Duplicar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoNovedadNomi,"copiar_button","Copiar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoNovedadNomi,"ver_form","Ver",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoNovedadNomi,"nuevorelaciones_button","Nuevo Rel",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNovedadNomi,"guardarcambiostabla_button","Guardar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNovedadNomi,"cerrar_button","Salir",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoNovedadNomi.setToolTipText("Nuevo"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoNovedadNomi.setToolTipText("Duplicar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoNovedadNomi.setToolTipText("Copiar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoNovedadNomi.setToolTipText("Ver"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoNovedadNomi.setToolTipText("Nuevo Rel"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setToolTipText("Guardar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNovedadNomi.setToolTipText("Salir"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNovedadNomi";
		inputMap = this.jButtonNuevoEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNovedadNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoNovedadNomi";
		inputMap = this.jButtonDuplicarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoNovedadNomi"));
		
		//COPIAR
		sMapKey = "CopiarEstadoNovedadNomi";
		inputMap = this.jButtonCopiarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoNovedadNomi"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoNovedadNomi";
		inputMap = this.jButtonVerFormEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoNovedadNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoNovedadNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoNovedadNomi";
		inputMap = this.jButtonModificarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoNovedadNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoNovedadNomi";
		inputMap = this.jButtonCerrarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNovedadNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoNovedadNomi.setName("jPanelParametrosReportesEstadoNovedadNomi"); 
		
		this.jPanelParametrosReportesAccionesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoNovedadNomi.setName("jPanelParametrosReportesAccionesEstadoNovedadNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoNovedadNomi = new JButtonMe();
		this.jButtonRecargarInformacionEstadoNovedadNomi.setText("Recargar");
		this.jButtonRecargarInformacionEstadoNovedadNomi.setToolTipText("Recargar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoNovedadNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoNovedadNomi = new JButtonMe();
		this.jButtonProcesarInformacionEstadoNovedadNomi.setText("Procesar");
		this.jButtonProcesarInformacionEstadoNovedadNomi.setToolTipText("Procesar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoNovedadNomi.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoNovedadNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNovedadNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNovedadNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoNovedadNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoNovedadNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoNovedadNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoNovedadNomi.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoNovedadNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesEstadoNovedadNomi.setText("Acciones");		
		this.jLabelAccionesEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoNovedadNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoNovedadNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoNovedadNomi = new JButtonMe();
		//this.jButtonAnterioresEstadoNovedadNomi.setText("<<");
        this.jButtonAnterioresEstadoNovedadNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoNovedadNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoNovedadNomi = new JButtonMe();
		//this.jButtonSiguientesEstadoNovedadNomi.setText(">>");
        this.jButtonSiguientesEstadoNovedadNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoNovedadNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoNovedadNomi,"nuevoguardarcambios_button","Nue",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoNovedadNomi";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoNovedadNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoNovedadNomi";
		inputMap = this.jButtonRecargarInformacionEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoNovedadNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoNovedadNomi";
		inputMap = this.jButtonSiguientesEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoNovedadNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoNovedadNomi";
		inputMap = this.jButtonAnterioresEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoNovedadNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoNovedadNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoNovedadNomi.setMinimumSize(new Dimension(this.getWidth(),EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNovedadNomi.setMaximumSize(new Dimension(this.getWidth(),EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNovedadNomi.setPreferredSize(new Dimension(this.getWidth(),EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoNovedadNomi = new GridBagLayout();

			this.jPanelPaginacionEstadoNovedadNomi.setLayout(gridaBagLayoutPaginacionEstadoNovedadNomi);						
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonAnterioresEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					
						
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
			
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonNuevoGuardarCambiosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
						
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonSiguientesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonNuevoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
				this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonNuevoRelacionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			}
			
			
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
				this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonGuardarCambiosTablaEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			}
			
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonDuplicarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonCopiarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonVerFormEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 1;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoNovedadNomi.add(this.jButtonCerrarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
		
		
		this.jButtonRecargarInformacionEstadoNovedadNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNovedadNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNovedadNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoNovedadNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNovedadNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNovedadNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoNovedadNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoNovedadNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoNovedadNomi.setLayout(gridaBagParametrosReportesEstadoNovedadNomi);
			this.jPanelParametrosReportesAccionesEstadoNovedadNomi.setLayout(gridaBagParametrosReportesAccionesEstadoNovedadNomi);
			
			
			this.jPanelParametrosAuxiliar1EstadoNovedadNomi.setLayout(gridaBagParametrosAuxiliar1EstadoNovedadNomi);
			this.jPanelParametrosAuxiliar2EstadoNovedadNomi.setLayout(gridaBagParametrosAuxiliar2EstadoNovedadNomi);
			this.jPanelParametrosAuxiliar3EstadoNovedadNomi.setLayout(gridaBagParametrosAuxiliar3EstadoNovedadNomi);
			this.jPanelParametrosAuxiliar4EstadoNovedadNomi.setLayout(gridaBagParametrosAuxiliar4EstadoNovedadNomi);
			//this.jPanelParametrosAuxiliar5EstadoNovedadNomi.setLayout(gridaBagParametrosAuxiliar2EstadoNovedadNomi);			
			
			
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jButtonRecargarInformacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadNomi.add(this.jComboBoxTiposPaginacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadNomi.add(this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadNomi.add(this.jComboBoxTiposArchivosReportesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jPanelParametrosAuxiliar1EstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoNovedadNomi.add(this.jComboBoxTiposReportesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jPanelParametrosAuxiliar4EstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jComboBoxTiposReportesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jCheckBoxGenerarReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jPanelParametrosAuxiliar2EstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jLabelAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jButtonAbrirOrderByEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jComboBoxTiposSeleccionarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			
			
			/*
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jCheckBoxSeleccionarTodosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNovedadNomi.add(this.jCheckBoxSeleccionarTodosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);															
				
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNovedadNomi.add(this.jCheckBoxSeleccionadosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jPanelParametrosAuxiliar3EstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jComboBoxTiposRelacionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
				
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jComboBoxTiposAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
	
				
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadNomi.add(this.jTextFieldValorCampoGeneralEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoNovedadNomi = new GridBagLayout();

			this.jScrollPanelDatosEstadoNovedadNomi.setLayout(gridaBagLayoutDatosEstadoNovedadNomi);
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
			
			this.jScrollPanelDatosEstadoNovedadNomi.add(this.jTableDatosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoNovedadNomi.setViewportView(this.jTableDatosEstadoNovedadNomi);
		this.jTableDatosEstadoNovedadNomi.setFillsViewportHeight(true);
		this.jTableDatosEstadoNovedadNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesEstadoNovedadNomi.setLayout(gridaBagLayoutAccionesEstadoNovedadNomi);
		
		
		/*	
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
			
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonNuevoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNovedadNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsEstadoNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNovedadNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;		
		//this.gridBagConstraintsEstadoNovedadNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoNovedadNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoNovedadNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);								
		
		
		/*
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		*/		
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadNomi.gridx =0;
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
				
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNovedadNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoNovedadNomi.setLayout(gridaBagLayoutBusquedasParametrosEstadoNovedadNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoNovedadNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoNovedadNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoNovedadNomi.setName("jPanelReporteDinamicoEstadoNovedadNomi"); 
		
		this.jPanelReporteDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoNovedadNomi.setLayout(gridaBagLayoutReporteDinamicoEstadoNovedadNomi);
		
		
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoNovedadNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoNovedadNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jLabelColumnasSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoNovedadNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoNovedadNomi=new JScrollPane(this.jListColumnasSelectReporteEstadoNovedadNomi);
			
			this.jScrollColumnasSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jListColumnasSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jScrollColumnasSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoNovedadNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoNovedadNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jLabelRelacionesSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoNovedadNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoNovedadNomi=new JScrollPane(this.jListRelacionesSelectReporteEstadoNovedadNomi);
			
			this.jScrollRelacionesSelectReporteEstadoNovedadNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNovedadNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNovedadNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jListRelacionesSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jScrollRelacionesSelectReporteEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoNovedadNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoNovedadNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoNovedadNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jLabelGenerarExcelReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi.setToolTipText("Generar EXCEL"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jComboBoxTiposReportesDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jLabelTiposArchivoReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoNovedadNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoNovedadNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoNovedadNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoNovedadNomi.setToolTipText("Generar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jButtonGenerarReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoNovedadNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoNovedadNomi.setToolTipText("Cancelar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadNomi.add(this.jButtonCerrarReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi= new JScrollPane(jPanelReporteDinamicoEstadoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoNovedadNomi);
		this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoNovedadNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoNovedadNomi.setName("jPanelImportacionEstadoNovedadNomi"); 
		
		this.jPanelImportacionEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoNovedadNomi.setLayout(gridaBagLayoutImportacionEstadoNovedadNomi);
		
		
		this.jInternalFrameImportacionEstadoNovedadNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoNovedadNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNovedadNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionEstadoNovedadNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoNovedadNomi = new JLabelMe();

		this.jLabelArchivoImportacionEstadoNovedadNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNovedadNomi.add(this.jLabelArchivoImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoNovedadNomi = new JFileChooser();		
		this.jFileChooserImportacionEstadoNovedadNomi.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoNovedadNomi = new JButtonMe();
		this.jButtonAbrirImportacionEstadoNovedadNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoNovedadNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoNovedadNomi.setToolTipText("Generar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadNomi.add(this.jButtonAbrirImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoNovedadNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoNovedadNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNovedadNomi.add(this.jLabelPathArchivoImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoNovedadNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoNovedadNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNovedadNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNovedadNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadNomi.add(this.jTextFieldPathArchivoImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoNovedadNomi = new JButtonMe();
		this.jButtonGenerarImportacionEstadoNovedadNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoNovedadNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoNovedadNomi.setToolTipText("Generar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadNomi.add(this.jButtonGenerarImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoNovedadNomi = new JButtonMe();
		this.jButtonCerrarImportacionEstadoNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoNovedadNomi.setToolTipText("Cancelar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadNomi.add(this.jButtonCerrarImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoNovedadNomi= new JScrollPane(jPanelImportacionEstadoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoNovedadNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoNovedadNomi);
		this.jInternalFrameImportacionEstadoNovedadNomi.getContentPane().add(this.jScrollPanelImportacionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoNovedadNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoNovedadNomi = new JButtonMe();
			this.jButtonAbrirOrderByEstadoNovedadNomi.setText("Orden");
			this.jButtonAbrirOrderByEstadoNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNovedadNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoNovedadNomi";
			inputMap = this.jButtonAbrirOrderByEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoNovedadNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoNovedadNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoNovedadNomi.setName("jPanelOrderByEstadoNovedadNomi"); 
			
			this.jPanelOrderByEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoNovedadNomi.setLayout(gridaBagLayoutOrderByEstadoNovedadNomi);
			
			
			this.jTableDatosEstadoNovedadNomiOrderBy = new JTableMe();        
			this.jTableDatosEstadoNovedadNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoNovedadNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoNovedadNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoNovedadNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoNovedadNomiOrderBy.setViewportView(this.jTableDatosEstadoNovedadNomiOrderBy);
			this.jTableDatosEstadoNovedadNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoNovedadNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoNovedadNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoNovedadNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoNovedadNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoNovedadNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoNovedadNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoNovedadNomi.setTitle("Orden");
			this.jInternalFrameOrderByEstadoNovedadNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoNovedadNomi.setResizable(true);
			this.jInternalFrameOrderByEstadoNovedadNomi.setClosable(true);
			this.jInternalFrameOrderByEstadoNovedadNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoNovedadNomi.ipady =150;
				
			this.jPanelOrderByEstadoNovedadNomi.add(jScrollPanelDatosEstadoNovedadNomiOrderBy, this.gridBagConstraintsEstadoNovedadNomi);//this.jTableDatosEstadoNovedadNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoNovedadNomi = new JButtonMe();
			this.jButtonCerrarOrderByEstadoNovedadNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoNovedadNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoNovedadNomi.setToolTipText("Cancelar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoNovedadNomi.add(this.jButtonCerrarOrderByEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoNovedadNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoNovedadNomi= new JScrollPane(jPanelOrderByEstadoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoNovedadNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoNovedadNomi);
			
			this.jInternalFrameOrderByEstadoNovedadNomi.getContentPane().add(this.jScrollPanelOrderByEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
		
		} else {
			this.jButtonAbrirOrderByEstadoNovedadNomi = new JButtonMe();
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
			&& this.estadonovedadnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoNovedadNomi.getRowHeight();//EstadoNovedadNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.isSelected()) {
					iHeightTable=EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNovedadNomi.isSelected()) {
					iHeightTable=EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoNovedadNomi!=null && this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoNovedadNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoNovedadNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoNovedadNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadonovedadnomiLogic.getEstadoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoNovedadNomi> TraerEstadoNovedadNomiBeans(List<EstadoNovedadNomi> estadonovedadnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoNovedadNomi estadonovedadnomi:estadonovedadnomis) {
					
				if(!(EstadoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadonovedadnomi.setsDetalleGeneralEntityReporte(EstadoNovedadNomiConstantesFunciones.getEstadoNovedadNomiDescripcion(estadonovedadnomi));
										
						
					
					

					if(estadonovedadnomi.getNovedadNomis()!=null && Funciones.existeClass(classes,NovedadNomi.class)) {
						try{estadonovedadnomi.setnovedadnomisDescripcionReporte(new JRBeanCollectionDataSource(NovedadNomiJInternalFrame.TraerNovedadNomiBeans(estadonovedadnomi.getNovedadNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadonovedadnomi.setsDetalleGeneralEntityReporte(estadonovedadnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadonovedadnomibeans.add(estadonovedadnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadonovedadnomis;
    }
	//PARA REPORTES FIN
}
