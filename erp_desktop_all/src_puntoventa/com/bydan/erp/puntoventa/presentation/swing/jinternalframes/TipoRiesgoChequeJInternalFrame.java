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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoRiesgoChequeConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoRiesgoChequeJInternalFrame extends TipoRiesgoChequeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRiesgoCheque;
	
	protected JMenuBar jmenuBarTipoRiesgoCheque;
	
	protected JMenu jmenuTipoRiesgoCheque;
	protected JMenu jmenuDatosTipoRiesgoCheque;
	protected JMenu jmenuArchivoTipoRiesgoCheque;
	protected JMenu jmenuAccionesTipoRiesgoCheque;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRiesgoCheque;	
	protected GridBagConstraints gridBagConstraintsTipoRiesgoCheque;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRiesgoChequeDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRiesgoCheque;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRiesgoCheque;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRiesgoCheque;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRiesgoCheque> tiporiesgocheques;		
	public List<TipoRiesgoCheque> tiporiesgochequesEliminados;	
	public List<TipoRiesgoCheque> tiporiesgochequesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRiesgoCheque;		
	protected JButton jButtonAbrirOrderByTipoRiesgoCheque;
	
	
	//protected JPanel jPanelOrderByTipoRiesgoCheque;
	//public JScrollPane jScrollPanelOrderByTipoRiesgoCheque;	
	//protected JButton jButtonCerrarOrderByTipoRiesgoCheque;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRiesgoChequeLogic tiporiesgochequeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRiesgoCheque;
	public JScrollPane jScrollPanelDatosEdicionTipoRiesgoCheque;
	public JScrollPane jScrollPanelDatosGeneralTipoRiesgoCheque;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRiesgoChequeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRiesgoCheque;
	//public JScrollPane jScrollPanelImportacionTipoRiesgoCheque;
	
	
	
	protected JPanel jPanelAccionesTipoRiesgoCheque;
	
    protected JPanel jPanelPaginacionTipoRiesgoCheque;
    protected JPanel jPanelParametrosReportesTipoRiesgoCheque;
	protected JPanel jPanelParametrosReportesAccionesTipoRiesgoCheque;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRiesgoCheque;
	protected JPanel jPanelParametrosAuxiliar2TipoRiesgoCheque;
	protected JPanel jPanelParametrosAuxiliar3TipoRiesgoCheque;
	protected JPanel jPanelParametrosAuxiliar4TipoRiesgoCheque;
	//protected JPanel jPanelParametrosAuxiliar5TipoRiesgoCheque;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRiesgoCheque;
	//protected JPanel jPanelImportacionTipoRiesgoCheque;
	
	
	public JTable jTableDatosTipoRiesgoCheque;
	
	
	
	//public JTable jTableDatosTipoRiesgoChequeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRiesgoCheque;
	protected JButton jButtonDuplicarTipoRiesgoCheque;
	protected JButton jButtonCopiarTipoRiesgoCheque;
	protected JButton jButtonVerFormTipoRiesgoCheque;
	protected JButton jButtonNuevoRelacionesTipoRiesgoCheque;
	protected JButton jButtonModificarTipoRiesgoCheque;
	
    protected JButton jButtonGuardarCambiosTablaTipoRiesgoCheque;
	protected JButton jButtonCerrarTipoRiesgoCheque;
	
	
	protected JButton jButtonRecargarInformacionTipoRiesgoCheque;
	protected JButton jButtonProcesarInformacionTipoRiesgoCheque;
	
	
	protected JButton jButtonAnterioresTipoRiesgoCheque;
	protected JButton jButtonSiguientesTipoRiesgoCheque;
	protected JButton jButtonNuevoGuardarCambiosTipoRiesgoCheque;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRiesgoCheque;
	//protected JButton jButtonCerrarReporteDinamicoTipoRiesgoCheque;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRiesgoCheque;
	//protected JButton jButtonGenerarImportacionTipoRiesgoCheque;
	//protected JButton jButtonCerrarImportacionTipoRiesgoCheque;
	//protected JFileChooser jFileChooserImportacionTipoRiesgoCheque;
	//protected File fileImportacionTipoRiesgoCheque;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRiesgoCheque;
	protected JButton jButtonDuplicarToolBarTipoRiesgoCheque;
	protected JButton jButtonNuevoRelacionesToolBarTipoRiesgoCheque;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRiesgoCheque;
	protected JButton jButtonCopiarToolBarTipoRiesgoCheque;
	protected JButton jButtonVerFormToolBarTipoRiesgoCheque;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRiesgoCheque;
	protected JButton jButtonCerrarToolBarTipoRiesgoCheque;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRiesgoCheque;
	protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCheque;
	protected JButton jButtonAnterioresToolBarTipoRiesgoCheque;
	protected JButton jButtonSiguientesToolBarTipoRiesgoCheque;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque;
	protected JButton jButtonAbrirOrderByToolBarTipoRiesgoCheque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRiesgoCheque;
	protected JMenuItem jMenuItemDuplicarTipoRiesgoCheque;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRiesgoCheque;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRiesgoCheque;
	protected JMenuItem jMenuItemCopiarTipoRiesgoCheque;
	protected JMenuItem jMenuItemVerFormTipoRiesgoCheque;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRiesgoCheque;
	protected JMenuItem jMenuItemCerrarTipoRiesgoCheque;
	protected JMenuItem jMenuItemDetalleCerrarTipoRiesgoCheque;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRiesgoCheque;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRiesgoCheque;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRiesgoCheque;
	protected JMenuItem jMenuItemProcesarInformacionTipoRiesgoCheque;
	protected JMenuItem jMenuItemAnterioresTipoRiesgoCheque;
	protected JMenuItem jMenuItemSiguientesTipoRiesgoCheque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRiesgoCheque;
	protected JMenuItem jMenuItemAbrirOrderByTipoRiesgoCheque;
	protected JMenuItem jMenuItemMostrarOcultarTipoRiesgoCheque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRiesgoCheque;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRiesgoCheque;
	protected JCheckBox jCheckBoxSeleccionadosTipoRiesgoCheque;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRiesgoCheque;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRiesgoCheque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRiesgoCheque;
	protected JTextField jTextFieldValorCampoGeneralTipoRiesgoCheque;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRiesgoCheque;
	//public JList<Reporte> jListColumnasSelectReporteTipoRiesgoCheque;
	//public JScrollPane jScrollColumnasSelectReporteTipoRiesgoCheque;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRiesgoCheque;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRiesgoCheque;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRiesgoCheque;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRiesgoCheque;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRiesgoCheque;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque;
	
		
	//public JLabel jLabelArchivoImportacionTipoRiesgoCheque;	
	//public JLabel jLabelPathArchivoImportacionTipoRiesgoCheque;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRiesgoCheque;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRiesgoCheque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRiesgoCheque;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRiesgoCheque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRiesgoCheque;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRiesgoCheque;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRiesgoCheque;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRiesgoCheque;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRiesgoCheque;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRiesgoCheque;	
	
	
	
	
	
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
	public TipoRiesgoChequeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRiesgoCheque)	{
		this.jButtonRecargarInformacionTipoRiesgoCheque = jButtonRecargarInformacionTipoRiesgoCheque;
	}
	
	public JButton getjButtonProcesarInformacionTipoRiesgoCheque() {
		return this.jButtonProcesarInformacionTipoRiesgoCheque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRiesgoCheque)	{
		this.jButtonProcesarInformacionTipoRiesgoCheque = jButtonProcesarInformacionTipoRiesgoCheque;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRiesgoCheque() {
		return this.jButtonRecargarInformacionTipoRiesgoCheque;
	}
	
	
	public List<TipoRiesgoCheque> gettiporiesgocheques() {
		return this.tiporiesgocheques;
	}

	public void settiporiesgocheques(List<TipoRiesgoCheque> tiporiesgocheques) {
		this.tiporiesgocheques = tiporiesgocheques;
	}
	
	public List<TipoRiesgoCheque> gettiporiesgochequesAux() {
		return this.tiporiesgochequesAux;
	}

	public void settiporiesgochequesAux(List<TipoRiesgoCheque> tiporiesgochequesAux) {
		this.tiporiesgochequesAux = tiporiesgochequesAux;
	}
	
	public List<TipoRiesgoCheque> gettiporiesgochequesEliminados() {
		return this.tiporiesgochequesEliminados;
	}

	public void setTipoRiesgoChequesEliminados(List<TipoRiesgoCheque> tiporiesgochequesEliminados) {
		this.tiporiesgochequesEliminados = tiporiesgochequesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRiesgoCheque() {
		return jComboBoxTiposSeleccionarTipoRiesgoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRiesgoCheque(
			JComboBox jComboBoxTiposSeleccionarTipoRiesgoCheque) {
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque = jComboBoxTiposSeleccionarTipoRiesgoCheque;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRiesgoCheque() {
		return jTextFieldValorCampoGeneralTipoRiesgoCheque;
	}

	public void setjTextFieldValorCampoGeneralTipoRiesgoCheque(
			JTextField jTextFieldValorCampoGeneralTipoRiesgoCheque) {
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque = jTextFieldValorCampoGeneralTipoRiesgoCheque;
	}

	public void setBorderResaltarValorCampoGeneralTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRiesgoCheque() {
		return this.jCheckBoxSeleccionarTodosTipoRiesgoCheque;
	}

	public void setjCheckBoxSeleccionarTodosTipoRiesgoCheque(
			JCheckBox jCheckBoxSeleccionarTodosTipoRiesgoCheque) {
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque = jCheckBoxSeleccionarTodosTipoRiesgoCheque;
	}

	public void setBorderResaltarSeleccionarTodosTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRiesgoCheque() {
		return this.jCheckBoxSeleccionadosTipoRiesgoCheque;
	}

	public void setjCheckBoxSeleccionadosTipoRiesgoCheque(
			JCheckBox jCheckBoxSeleccionadosTipoRiesgoCheque) {
		this.jCheckBoxSeleccionadosTipoRiesgoCheque = jCheckBoxSeleccionadosTipoRiesgoCheque;
	}
	
	public void setBorderResaltarSeleccionadosTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRiesgoCheque() {
		return this.jComboBoxTiposArchivosReportesTipoRiesgoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRiesgoCheque(
			JComboBox jComboBoxTiposArchivosReportesTipoRiesgoCheque) {
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque = jComboBoxTiposArchivosReportesTipoRiesgoCheque;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRiesgoCheque() {
		return this.jComboBoxTiposReportesTipoRiesgoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRiesgoCheque(
			JComboBox jComboBoxTiposReportesTipoRiesgoCheque) {
		this.jComboBoxTiposReportesTipoRiesgoCheque = jComboBoxTiposReportesTipoRiesgoCheque;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRiesgoCheque() {
	//	return jComboBoxTiposReportesDinamicoTipoRiesgoCheque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRiesgoCheque(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRiesgoCheque) {
	//	this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque = jComboBoxTiposReportesDinamicoTipoRiesgoCheque;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque = jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque;
	//}
	
	public void setBorderResaltarTiposReportesTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRiesgoCheque() {
		return this.jComboBoxTiposGraficosReportesTipoRiesgoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRiesgoCheque(
			JComboBox jComboBoxTiposGraficosReportesTipoRiesgoCheque) {
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque = jComboBoxTiposGraficosReportesTipoRiesgoCheque;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRiesgoCheque() {
		return this.jComboBoxTiposPaginacionTipoRiesgoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRiesgoCheque(
			JComboBox jComboBoxTiposPaginacionTipoRiesgoCheque) {
		this.jComboBoxTiposPaginacionTipoRiesgoCheque = jComboBoxTiposPaginacionTipoRiesgoCheque;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRiesgoCheque() {
		return this.jComboBoxTiposRelacionesTipoRiesgoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRiesgoCheque() {
		return this.jComboBoxTiposAccionesTipoRiesgoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRiesgoCheque(
			JComboBox jComboBoxTiposRelacionesTipoRiesgoCheque) {
		this.jComboBoxTiposRelacionesTipoRiesgoCheque = jComboBoxTiposRelacionesTipoRiesgoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRiesgoCheque(
			JComboBox jComboBoxTiposAccionesTipoRiesgoCheque) {
		this.jComboBoxTiposAccionesTipoRiesgoCheque = jComboBoxTiposAccionesTipoRiesgoCheque;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRiesgoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRiesgoCheque .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRiesgoCheque() {
	//	return jCheckBoxConGraficoDinamicoTipoRiesgoCheque;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRiesgoCheque(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRiesgoCheque) {
	//	this.jCheckBoxConGraficoDinamicoTipoRiesgoCheque = jCheckBoxConGraficoDinamicoTipoRiesgoCheque;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRiesgoCheque() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRiesgoCheque.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRiesgoCheque .setBorder(borderResaltar);		
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
		this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		
		this.tiporiesgochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporiesgochequeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRiesgoChequeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Riesgo Cheque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRiesgoChequeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRiesgoCheque= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"nuevo","nuevo","Nuevo"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"duplicar","duplicar","Duplicar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"copiar","copiar","Copiar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"ver_form","ver_form","Ver"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"recargar","recargar","Recargar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,
							"cerrar","cerrar","Salir"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRiesgoCheque;
			
				this.jButtonProcesarInformacionToolBarTipoRiesgoCheque=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCheque;
				
		//protected JButton jButtonModificarToolBarTipoRiesgoCheque;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRiesgoCheque=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRiesgoCheque=new JMenuMe("General");
		this.jmenuArchivoTipoRiesgoCheque=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRiesgoCheque=new JMenuMe("Acciones");
		this.jmenuDatosTipoRiesgoCheque=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRiesgoCheque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRiesgoCheque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRiesgoCheque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRiesgoCheque= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRiesgoCheque.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRiesgoCheque,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRiesgoCheque= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRiesgoCheque.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRiesgoCheque,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRiesgoCheque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRiesgoCheque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRiesgoCheque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRiesgoCheque= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRiesgoCheque.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRiesgoCheque,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRiesgoCheque= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRiesgoCheque.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRiesgoCheque,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRiesgoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRiesgoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRiesgoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRiesgoCheque= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRiesgoCheque.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRiesgoCheque,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRiesgoCheque= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRiesgoCheque.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRiesgoCheque,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRiesgoCheque= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRiesgoCheque.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRiesgoCheque,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRiesgoCheque= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRiesgoCheque.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRiesgoCheque,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRiesgoCheque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRiesgoCheque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRiesgoCheque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRiesgoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRiesgoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRiesgoCheque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRiesgoCheque.add(this.jMenuItemCerrarTipoRiesgoCheque);
			
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemNuevoTipoRiesgoCheque);
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque);
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemNuevoRelacionesTipoRiesgoCheque);
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque);		
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemDuplicarTipoRiesgoCheque);		
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemCopiarTipoRiesgoCheque);		
			this.jmenuAccionesTipoRiesgoCheque.add(this.jMenuItemVerFormTipoRiesgoCheque);		
			
			this.jmenuDatosTipoRiesgoCheque.add(this.jMenuItemRecargarInformacionTipoRiesgoCheque);				
			this.jmenuDatosTipoRiesgoCheque.add(this.jMenuItemAnterioresTipoRiesgoCheque);				
			this.jmenuDatosTipoRiesgoCheque.add(this.jMenuItemSiguientesTipoRiesgoCheque);				
			this.jmenuDatosTipoRiesgoCheque.add(this.jMenuItemAbrirOrderByTipoRiesgoCheque);				
			this.jmenuDatosTipoRiesgoCheque.add(this.jMenuItemMostrarOcultarTipoRiesgoCheque);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRiesgoCheque.add(this.jMenuItemGuardarCambiosTipoRiesgoCheque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRiesgoCheque.add(this.jmenuArchivoTipoRiesgoCheque);		
			this.jmenuBarTipoRiesgoCheque.add(this.jmenuAccionesTipoRiesgoCheque);		
			this.jmenuBarTipoRiesgoCheque.add(this.jmenuDatosTipoRiesgoCheque);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRiesgoCheque);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRiesgoCheque() {
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
			//this.jInternalFrameDetalleTipoRiesgoCheque = new TipoRiesgoChequeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Riesgo Cheque DATOS");
			this.jInternalFrameDetalleFormTipoRiesgoCheque = new TipoRiesgoChequeDetalleFormJInternalFrame(jDesktopPane,this.tiporiesgochequeSessionBean.getConGuardarRelaciones(),this.tiporiesgochequeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRiesgoCheque = null;//new TipoRiesgoChequeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRiesgoCheque= new GridBagLayout();
		
		
		this.jTableDatosTipoRiesgoCheque = new JTableMe();      
		
		String sToolTipTipoRiesgoCheque="";
		sToolTipTipoRiesgoCheque=TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRiesgoCheque+="(PuntoVenta.TipoRiesgoCheque)";
		}
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRiesgoCheque+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRiesgoCheque.setToolTipText(sToolTipTipoRiesgoCheque);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRiesgoCheque);
		this.jTableDatosTipoRiesgoCheque.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRiesgoCheque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRiesgoCheque.setRowSelectionAllowed(true);
		this.jTableDatosTipoRiesgoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRiesgoCheque = new JButtonMe();
		this.jButtonDuplicarTipoRiesgoCheque = new JButtonMe();
		this.jButtonCopiarTipoRiesgoCheque = new JButtonMe();
		this.jButtonVerFormTipoRiesgoCheque = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRiesgoCheque = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque = new JButtonMe();
		this.jButtonCerrarTipoRiesgoCheque = new JButtonMe();
		
		this.jScrollPanelDatosTipoRiesgoCheque = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRiesgoCheque = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Riesgo Cheque";
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRiesgoCheque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRiesgoCheque.setToolTipText("Acciones");
        this.jPanelAccionesTipoRiesgoCheque.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRiesgoCheque=new ReporteDinamicoJInternalFrame(TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRiesgoCheque();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRiesgoCheque=new ImportacionJInternalFrame(TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRiesgoCheque();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRiesgoCheque = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRiesgoCheque.setText("Orden");
		this.jButtonAbrirOrderByTipoRiesgoCheque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRiesgoCheque,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRiesgoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCheque,false,this);
			
			//this.cargarOrderByTipoRiesgoCheque(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRiesgoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCheque,true,this);
			
			//this.cargarOrderByTipoRiesgoCheque(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRiesgoCheque.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRiesgoCheque.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRiesgoCheque.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRiesgoCheque.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRiesgoCheque.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRiesgoCheque.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRiesgoCheque.setText("Nuevo");
		this.jButtonDuplicarTipoRiesgoCheque.setText("Duplicar");
		this.jButtonCopiarTipoRiesgoCheque.setText("Copiar");
		this.jButtonVerFormTipoRiesgoCheque.setText("Ver");
		this.jButtonNuevoRelacionesTipoRiesgoCheque.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setText("Guardar");
		this.jButtonCerrarTipoRiesgoCheque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRiesgoCheque,"nuevo_button","Nuevo",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRiesgoCheque,"duplicar_button","Duplicar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRiesgoCheque,"copiar_button","Copiar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRiesgoCheque,"ver_form","Ver",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRiesgoCheque,"nuevorelaciones_button","Nuevo Rel",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRiesgoCheque,"guardarcambiostabla_button","Guardar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRiesgoCheque,"cerrar_button","Salir",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRiesgoCheque.setToolTipText("Nuevo"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRiesgoCheque.setToolTipText("Duplicar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRiesgoCheque.setToolTipText("Copiar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRiesgoCheque.setToolTipText("Ver"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRiesgoCheque.setToolTipText("Nuevo Rel"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setToolTipText("Guardar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRiesgoCheque.setToolTipText("Salir"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRiesgoCheque";
		inputMap = this.jButtonNuevoTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRiesgoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRiesgoCheque"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRiesgoCheque";
		inputMap = this.jButtonDuplicarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRiesgoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRiesgoCheque"));
		
		//COPIAR
		sMapKey = "CopiarTipoRiesgoCheque";
		inputMap = this.jButtonCopiarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRiesgoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRiesgoCheque"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRiesgoCheque";
		inputMap = this.jButtonVerFormTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRiesgoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRiesgoCheque"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRiesgoCheque";
		inputMap = this.jButtonNuevoRelacionesTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRiesgoCheque"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRiesgoCheque";
		inputMap = this.jButtonModificarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRiesgoCheque"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRiesgoCheque";
		inputMap = this.jButtonCerrarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRiesgoCheque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRiesgoCheque";
		inputMap = this.jButtonGuardarCambiosTablaTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRiesgoCheque"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRiesgoCheque.setName("jPanelParametrosReportesTipoRiesgoCheque"); 
		
		this.jPanelParametrosReportesAccionesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRiesgoCheque.setName("jPanelParametrosReportesAccionesTipoRiesgoCheque"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRiesgoCheque = new JButtonMe();
		this.jButtonRecargarInformacionTipoRiesgoCheque.setText("Recargar");
		this.jButtonRecargarInformacionTipoRiesgoCheque.setToolTipText("Recargar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRiesgoCheque,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRiesgoCheque = new JButtonMe();
		this.jButtonProcesarInformacionTipoRiesgoCheque.setText("Procesar");
		this.jButtonProcesarInformacionTipoRiesgoCheque.setToolTipText("Procesar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRiesgoCheque.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRiesgoCheque.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRiesgoCheque.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRiesgoCheque.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRiesgoCheque.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRiesgoCheque.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRiesgoCheque.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRiesgoCheque.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRiesgoCheque.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRiesgoCheque.setText("Accion");
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRiesgoCheque = new JLabelMe();
		
		this.jLabelAccionesTipoRiesgoCheque.setText("Acciones");		
		this.jLabelAccionesTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRiesgoCheque = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRiesgoCheque.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRiesgoCheque.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRiesgoCheque = new JButtonMe();
		//this.jButtonAnterioresTipoRiesgoCheque.setText("<<");
        this.jButtonAnterioresTipoRiesgoCheque.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRiesgoCheque,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRiesgoCheque = new JButtonMe();
		//this.jButtonSiguientesTipoRiesgoCheque.setText(">>");
        this.jButtonSiguientesTipoRiesgoCheque.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRiesgoCheque,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCheque = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRiesgoCheque,"nuevoguardarcambios_button","Nue",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRiesgoCheque";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRiesgoCheque"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRiesgoCheque";
		inputMap = this.jButtonRecargarInformacionTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRiesgoCheque"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRiesgoCheque";
		inputMap = this.jButtonSiguientesTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRiesgoCheque"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRiesgoCheque";
		inputMap = this.jButtonAnterioresTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRiesgoCheque"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRiesgoCheque();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRiesgoCheque.setMinimumSize(new Dimension(this.getWidth(),TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRiesgoCheque.setMaximumSize(new Dimension(this.getWidth(),TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRiesgoCheque.setPreferredSize(new Dimension(this.getWidth(),TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRiesgoCheque = new GridBagLayout();

			this.jPanelPaginacionTipoRiesgoCheque.setLayout(gridaBagLayoutPaginacionTipoRiesgoCheque);						
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonAnterioresTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					
						
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
			
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonNuevoGuardarCambiosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
						
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonSiguientesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonNuevoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
				this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonNuevoRelacionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			}
			
			
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
				this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonGuardarCambiosTablaTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			}
			
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonDuplicarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonCopiarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonVerFormTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRiesgoCheque.add(this.jButtonCerrarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
		
		
		this.jButtonRecargarInformacionTipoRiesgoCheque.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRiesgoCheque.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRiesgoCheque.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRiesgoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRiesgoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRiesgoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRiesgoCheque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRiesgoCheque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRiesgoCheque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRiesgoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRiesgoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRiesgoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRiesgoCheque.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRiesgoCheque.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRiesgoCheque.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRiesgoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRiesgoCheque = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRiesgoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRiesgoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRiesgoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRiesgoCheque = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRiesgoCheque.setLayout(gridaBagParametrosReportesTipoRiesgoCheque);
			this.jPanelParametrosReportesAccionesTipoRiesgoCheque.setLayout(gridaBagParametrosReportesAccionesTipoRiesgoCheque);
			
			
			this.jPanelParametrosAuxiliar1TipoRiesgoCheque.setLayout(gridaBagParametrosAuxiliar1TipoRiesgoCheque);
			this.jPanelParametrosAuxiliar2TipoRiesgoCheque.setLayout(gridaBagParametrosAuxiliar2TipoRiesgoCheque);
			this.jPanelParametrosAuxiliar3TipoRiesgoCheque.setLayout(gridaBagParametrosAuxiliar3TipoRiesgoCheque);
			this.jPanelParametrosAuxiliar4TipoRiesgoCheque.setLayout(gridaBagParametrosAuxiliar4TipoRiesgoCheque);
			//this.jPanelParametrosAuxiliar5TipoRiesgoCheque.setLayout(gridaBagParametrosAuxiliar2TipoRiesgoCheque);			
			
			
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jButtonRecargarInformacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCheque.add(this.jComboBoxTiposPaginacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCheque.add(this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCheque.add(this.jComboBoxTiposArchivosReportesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jPanelParametrosAuxiliar1TipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRiesgoCheque.add(this.jComboBoxTiposReportesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jPanelParametrosAuxiliar4TipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jComboBoxTiposReportesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jCheckBoxGenerarReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jPanelParametrosAuxiliar2TipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jLabelAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jButtonAbrirOrderByTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jComboBoxTiposSeleccionarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
			
			
			/*
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jCheckBoxSeleccionarTodosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRiesgoCheque.add(this.jCheckBoxSeleccionarTodosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);															
				
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRiesgoCheque.add(this.jCheckBoxSeleccionadosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jPanelParametrosAuxiliar3TipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jComboBoxTiposRelacionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
				
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCheque.add(this.jComboBoxTiposAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRiesgoCheque = new GridBagLayout();

			this.jScrollPanelDatosTipoRiesgoCheque.setLayout(gridaBagLayoutDatosTipoRiesgoCheque);
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
			
			this.jScrollPanelDatosTipoRiesgoCheque.add(this.jTableDatosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRiesgoCheque.setViewportView(this.jTableDatosTipoRiesgoCheque);
		this.jTableDatosTipoRiesgoCheque.setFillsViewportHeight(true);
		this.jTableDatosTipoRiesgoCheque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRiesgoCheque= new GridBagLayout();
		this.jPanelAccionesTipoRiesgoCheque.setLayout(gridaBagLayoutAccionesTipoRiesgoCheque);
		
		
		/*	
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
			
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonNuevoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRiesgoCheque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRiesgoCheque);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();						
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;		
			//this.gridBagConstraintsTipoRiesgoCheque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRiesgoCheque.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;		
		//this.gridBagConstraintsTipoRiesgoCheque.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRiesgoCheque.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRiesgoCheque);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);								
		
		
		/*
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		*/		
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCheque.gridx =0;
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRiesgoCheque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
				
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRiesgoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRiesgoCheque = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRiesgoCheque.setLayout(gridaBagLayoutBusquedasParametrosTipoRiesgoCheque);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRiesgoCheque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRiesgoCheque;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRiesgoCheque() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRiesgoCheque = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRiesgoCheque.setName("jPanelReporteDinamicoTipoRiesgoCheque"); 
		
		this.jPanelReporteDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRiesgoCheque.setLayout(gridaBagLayoutReporteDinamicoTipoRiesgoCheque);
		
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRiesgoCheque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRiesgoCheque = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRiesgoCheque.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jLabelColumnasSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRiesgoCheque = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRiesgoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRiesgoCheque.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRiesgoCheque=new JScrollPane(this.jListColumnasSelectReporteTipoRiesgoCheque);
			
			this.jScrollColumnasSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jListColumnasSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jScrollColumnasSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRiesgoCheque = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRiesgoCheque.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jLabelRelacionesSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRiesgoCheque = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRiesgoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRiesgoCheque.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRiesgoCheque=new JScrollPane(this.jListRelacionesSelectReporteTipoRiesgoCheque);
			
			this.jScrollRelacionesSelectReporteTipoRiesgoCheque.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRiesgoCheque.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRiesgoCheque.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jListRelacionesSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jScrollRelacionesSelectReporteTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRiesgoCheque = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRiesgoCheque = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRiesgoCheque = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque.setToolTipText("Generar EXCEL"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jComboBoxTiposReportesDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRiesgoCheque = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRiesgoCheque.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRiesgoCheque,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRiesgoCheque.setToolTipText("Generar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jButtonGenerarReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRiesgoCheque = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRiesgoCheque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRiesgoCheque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRiesgoCheque.setToolTipText("Cancelar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCheque.add(this.jButtonCerrarReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRiesgoCheque = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque= new JScrollPane(jPanelReporteDinamicoTipoRiesgoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRiesgoCheque);
		this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRiesgoCheque() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRiesgoCheque = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRiesgoCheque.setName("jPanelImportacionTipoRiesgoCheque"); 
		
		this.jPanelImportacionTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRiesgoCheque.setLayout(gridaBagLayoutImportacionTipoRiesgoCheque);
		
		
		this.jInternalFrameImportacionTipoRiesgoCheque= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRiesgoCheque= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRiesgoCheque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRiesgoCheque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRiesgoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRiesgoCheque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRiesgoCheque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRiesgoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRiesgoCheque.setResizable(true);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setClosable(true);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRiesgoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRiesgoCheque.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRiesgoCheque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRiesgoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRiesgoCheque.setResizable(true);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setClosable(true);
	    this.jInternalFrameImportacionTipoRiesgoCheque.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRiesgoCheque = new JLabelMe();

		this.jLabelArchivoImportacionTipoRiesgoCheque.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRiesgoCheque.add(this.jLabelArchivoImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRiesgoCheque = new JFileChooser();		
		this.jFileChooserImportacionTipoRiesgoCheque.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRiesgoCheque = new JButtonMe();
		this.jButtonAbrirImportacionTipoRiesgoCheque.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRiesgoCheque,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRiesgoCheque.setToolTipText("Generar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCheque.add(this.jButtonAbrirImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRiesgoCheque = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRiesgoCheque.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRiesgoCheque.add(this.jLabelPathArchivoImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRiesgoCheque=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRiesgoCheque.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRiesgoCheque.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRiesgoCheque.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCheque.add(this.jTextFieldPathArchivoImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRiesgoCheque = new JButtonMe();
		this.jButtonGenerarImportacionTipoRiesgoCheque.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRiesgoCheque,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRiesgoCheque.setToolTipText("Generar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCheque.add(this.jButtonGenerarImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRiesgoCheque = new JButtonMe();
		this.jButtonCerrarImportacionTipoRiesgoCheque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRiesgoCheque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRiesgoCheque.setToolTipText("Cancelar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCheque.add(this.jButtonCerrarImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRiesgoCheque = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRiesgoCheque= new JScrollPane(jPanelImportacionTipoRiesgoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRiesgoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRiesgoCheque.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRiesgoCheque);
		this.jInternalFrameImportacionTipoRiesgoCheque.getContentPane().add(this.jScrollPanelImportacionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRiesgoCheque(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRiesgoCheque = new JButtonMe();
			this.jButtonAbrirOrderByTipoRiesgoCheque.setText("Orden");
			this.jButtonAbrirOrderByTipoRiesgoCheque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRiesgoCheque,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRiesgoCheque";
			inputMap = this.jButtonAbrirOrderByTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRiesgoCheque"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRiesgoCheque = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRiesgoCheque.setName("jPanelOrderByTipoRiesgoCheque"); 
			
			this.jPanelOrderByTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRiesgoCheque.setLayout(gridaBagLayoutOrderByTipoRiesgoCheque);
			
			
			this.jTableDatosTipoRiesgoChequeOrderBy = new JTableMe();        
			this.jTableDatosTipoRiesgoChequeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRiesgoChequeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRiesgoChequeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRiesgoChequeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRiesgoChequeOrderBy.setViewportView(this.jTableDatosTipoRiesgoChequeOrderBy);
			this.jTableDatosTipoRiesgoChequeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRiesgoChequeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRiesgoCheque= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRiesgoCheque= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRiesgoCheque = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRiesgoCheque= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRiesgoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRiesgoCheque.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRiesgoCheque.setTitle("Orden");
			this.jInternalFrameOrderByTipoRiesgoCheque.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRiesgoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRiesgoCheque.setResizable(true);
			this.jInternalFrameOrderByTipoRiesgoCheque.setClosable(true);
			this.jInternalFrameOrderByTipoRiesgoCheque.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRiesgoCheque.ipady =150;
				
			this.jPanelOrderByTipoRiesgoCheque.add(jScrollPanelDatosTipoRiesgoChequeOrderBy, this.gridBagConstraintsTipoRiesgoCheque);//this.jTableDatosTipoRiesgoChequeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRiesgoCheque = new JButtonMe();
			this.jButtonCerrarOrderByTipoRiesgoCheque.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRiesgoCheque,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRiesgoCheque.setToolTipText("Cancelar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRiesgoCheque.add(this.jButtonCerrarOrderByTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRiesgoCheque = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRiesgoCheque= new JScrollPane(jPanelOrderByTipoRiesgoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRiesgoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRiesgoCheque.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRiesgoCheque);
			
			this.jInternalFrameOrderByTipoRiesgoCheque.getContentPane().add(this.jScrollPanelOrderByTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
		
		} else {
			this.jButtonAbrirOrderByTipoRiesgoCheque = new JButtonMe();
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
			&& this.tiporiesgochequeSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRiesgoCheque.getRowHeight();//TipoRiesgoChequeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.isSelected()) {
					iHeightTable=TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRiesgoCheque.isSelected()) {
					iHeightTable=TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRiesgoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRiesgoCheque!=null && this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRiesgoCheque.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRiesgoCheque.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRiesgoCheque.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporiesgochequeLogic.getTipoRiesgoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgocheques.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRiesgoCheque> TraerTipoRiesgoChequeBeans(List<TipoRiesgoCheque> tiporiesgocheques,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRiesgoCheque tiporiesgocheque:tiporiesgocheques) {
					
				if(!(TipoRiesgoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRiesgoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporiesgocheque.setsDetalleGeneralEntityReporte(TipoRiesgoChequeConstantesFunciones.getTipoRiesgoChequeDescripcion(tiporiesgocheque));
										
						
					
					

					if(tiporiesgocheque.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{tiporiesgocheque.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(tiporiesgocheque.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporiesgocheque.setsDetalleGeneralEntityReporte(tiporiesgocheque.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporiesgochequebeans.add(tiporiesgochequebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporiesgocheques;
    }
	//PARA REPORTES FIN
}
