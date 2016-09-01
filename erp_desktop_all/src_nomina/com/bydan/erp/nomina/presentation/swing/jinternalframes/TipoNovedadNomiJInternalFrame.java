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
import com.bydan.erp.nomina.util.TipoNovedadNomiConstantesFunciones;

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
public class TipoNovedadNomiJInternalFrame extends TipoNovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoNovedadNomi;
	
	protected JMenuBar jmenuBarTipoNovedadNomi;
	
	protected JMenu jmenuTipoNovedadNomi;
	protected JMenu jmenuDatosTipoNovedadNomi;
	protected JMenu jmenuArchivoTipoNovedadNomi;
	protected JMenu jmenuAccionesTipoNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsTipoNovedadNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoNovedadNomiDetalleFormJInternalFrame jInternalFrameDetalleFormTipoNovedadNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoNovedadNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoNovedadNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoNovedadNomiSessionBean tiponovedadnomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoNovedadNomi> tiponovedadnomis;		
	public List<TipoNovedadNomi> tiponovedadnomisEliminados;	
	public List<TipoNovedadNomi> tiponovedadnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoNovedadNomi;		
	protected JButton jButtonAbrirOrderByTipoNovedadNomi;
	
	
	//protected JPanel jPanelOrderByTipoNovedadNomi;
	//public JScrollPane jScrollPanelOrderByTipoNovedadNomi;	
	//protected JButton jButtonCerrarOrderByTipoNovedadNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoNovedadNomiLogic tiponovedadnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoNovedadNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoNovedadNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoNovedadNomi;
	//public JScrollPane jScrollPanelImportacionTipoNovedadNomi;
	
	
	
	protected JPanel jPanelAccionesTipoNovedadNomi;
	
    protected JPanel jPanelPaginacionTipoNovedadNomi;
    protected JPanel jPanelParametrosReportesTipoNovedadNomi;
	protected JPanel jPanelParametrosReportesAccionesTipoNovedadNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar2TipoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar3TipoNovedadNomi;
	protected JPanel jPanelParametrosAuxiliar4TipoNovedadNomi;
	//protected JPanel jPanelParametrosAuxiliar5TipoNovedadNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoNovedadNomi;
	//protected JPanel jPanelImportacionTipoNovedadNomi;
	
	
	public JTable jTableDatosTipoNovedadNomi;
	
	
	
	//public JTable jTableDatosTipoNovedadNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoNovedadNomi;
	protected JButton jButtonDuplicarTipoNovedadNomi;
	protected JButton jButtonCopiarTipoNovedadNomi;
	protected JButton jButtonVerFormTipoNovedadNomi;
	protected JButton jButtonNuevoRelacionesTipoNovedadNomi;
	protected JButton jButtonModificarTipoNovedadNomi;
	
    protected JButton jButtonGuardarCambiosTablaTipoNovedadNomi;
	protected JButton jButtonCerrarTipoNovedadNomi;
	
	
	protected JButton jButtonRecargarInformacionTipoNovedadNomi;
	protected JButton jButtonProcesarInformacionTipoNovedadNomi;
	
	
	protected JButton jButtonAnterioresTipoNovedadNomi;
	protected JButton jButtonSiguientesTipoNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosTipoNovedadNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoNovedadNomi;
	//protected JButton jButtonCerrarReporteDinamicoTipoNovedadNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoNovedadNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoNovedadNomi;
	//protected JButton jButtonGenerarImportacionTipoNovedadNomi;
	//protected JButton jButtonCerrarImportacionTipoNovedadNomi;
	//protected JFileChooser jFileChooserImportacionTipoNovedadNomi;
	//protected File fileImportacionTipoNovedadNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNovedadNomi;
	protected JButton jButtonDuplicarToolBarTipoNovedadNomi;
	protected JButton jButtonNuevoRelacionesToolBarTipoNovedadNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoNovedadNomi;
	protected JButton jButtonCopiarToolBarTipoNovedadNomi;
	protected JButton jButtonVerFormToolBarTipoNovedadNomi;
	public JButton jButtonGuardarCambiosTablaToolBarTipoNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNovedadNomi;
	protected JButton jButtonCerrarToolBarTipoNovedadNomi;
	
	protected JButton jButtonRecargarInformacionToolBarTipoNovedadNomi;
	protected JButton jButtonProcesarInformacionToolBarTipoNovedadNomi;
	protected JButton jButtonAnterioresToolBarTipoNovedadNomi;
	protected JButton jButtonSiguientesToolBarTipoNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi;
	protected JButton jButtonAbrirOrderByToolBarTipoNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNovedadNomi;
	protected JMenuItem jMenuItemDuplicarTipoNovedadNomi;
	protected JMenuItem jMenuItemNuevoRelacionesTipoNovedadNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoNovedadNomi;
	protected JMenuItem jMenuItemCopiarTipoNovedadNomi;
	protected JMenuItem jMenuItemVerFormTipoNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNovedadNomi;
	protected JMenuItem jMenuItemCerrarTipoNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoNovedadNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNovedadNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoNovedadNomi;
	protected JMenuItem jMenuItemProcesarInformacionTipoNovedadNomi;
	protected JMenuItem jMenuItemAnterioresTipoNovedadNomi;
	protected JMenuItem jMenuItemSiguientesTipoNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNovedadNomi;
	protected JMenuItem jMenuItemAbrirOrderByTipoNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNovedadNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoNovedadNomi;
	protected JCheckBox jCheckBoxSeleccionadosTipoNovedadNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoNovedadNomi;
	protected JCheckBox jCheckBoxConGraficoReporteTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoNovedadNomi;
	protected JTextField jTextFieldValorCampoGeneralTipoNovedadNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoNovedadNomi;
	//public JList<Reporte> jListColumnasSelectReporteTipoNovedadNomi;
	//public JScrollPane jScrollColumnasSelectReporteTipoNovedadNomi;
	
	//public JLabel jLabelRelacionesSelectReporteTipoNovedadNomi;
	//public JList<Reporte> jListRelacionesSelectReporteTipoNovedadNomi;
	//public JScrollPane jScrollRelacionesSelectReporteTipoNovedadNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoNovedadNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoNovedadNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoNovedadNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoNovedadNomi;
	
		
	//public JLabel jLabelArchivoImportacionTipoNovedadNomi;	
	//public JLabel jLabelPathArchivoImportacionTipoNovedadNomi;
	//protected JTextField jTextFieldPathArchivoImportacionTipoNovedadNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoNovedadNomi;
	
	//public JLabel jLabelColumnaCategoriaValorTipoNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoNovedadNomi;
	
	//public JLabel jLabelColumnasValoresGraficoTipoNovedadNomi;
	//public JList<Reporte> jListColumnasValoresGraficoTipoNovedadNomi;
	//public JScrollPane jScrollColumnasValoresGraficoTipoNovedadNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoNovedadNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoNovedadNomi;	
	
	
	
	
	
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
	public TipoNovedadNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoNovedadNomi)	{
		this.jButtonRecargarInformacionTipoNovedadNomi = jButtonRecargarInformacionTipoNovedadNomi;
	}
	
	public JButton getjButtonProcesarInformacionTipoNovedadNomi() {
		return this.jButtonProcesarInformacionTipoNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNovedadNomi)	{
		this.jButtonProcesarInformacionTipoNovedadNomi = jButtonProcesarInformacionTipoNovedadNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoNovedadNomi() {
		return this.jButtonRecargarInformacionTipoNovedadNomi;
	}
	
	
	public List<TipoNovedadNomi> gettiponovedadnomis() {
		return this.tiponovedadnomis;
	}

	public void settiponovedadnomis(List<TipoNovedadNomi> tiponovedadnomis) {
		this.tiponovedadnomis = tiponovedadnomis;
	}
	
	public List<TipoNovedadNomi> gettiponovedadnomisAux() {
		return this.tiponovedadnomisAux;
	}

	public void settiponovedadnomisAux(List<TipoNovedadNomi> tiponovedadnomisAux) {
		this.tiponovedadnomisAux = tiponovedadnomisAux;
	}
	
	public List<TipoNovedadNomi> gettiponovedadnomisEliminados() {
		return this.tiponovedadnomisEliminados;
	}

	public void setTipoNovedadNomisEliminados(List<TipoNovedadNomi> tiponovedadnomisEliminados) {
		this.tiponovedadnomisEliminados = tiponovedadnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoNovedadNomi() {
		return jComboBoxTiposSeleccionarTipoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoNovedadNomi(
			JComboBox jComboBoxTiposSeleccionarTipoNovedadNomi) {
		this.jComboBoxTiposSeleccionarTipoNovedadNomi = jComboBoxTiposSeleccionarTipoNovedadNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoNovedadNomi() {
		return jTextFieldValorCampoGeneralTipoNovedadNomi;
	}

	public void setjTextFieldValorCampoGeneralTipoNovedadNomi(
			JTextField jTextFieldValorCampoGeneralTipoNovedadNomi) {
		this.jTextFieldValorCampoGeneralTipoNovedadNomi = jTextFieldValorCampoGeneralTipoNovedadNomi;
	}

	public void setBorderResaltarValorCampoGeneralTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoNovedadNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoNovedadNomi() {
		return this.jCheckBoxSeleccionarTodosTipoNovedadNomi;
	}

	public void setjCheckBoxSeleccionarTodosTipoNovedadNomi(
			JCheckBox jCheckBoxSeleccionarTodosTipoNovedadNomi) {
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi = jCheckBoxSeleccionarTodosTipoNovedadNomi;
	}

	public void setBorderResaltarSeleccionarTodosTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoNovedadNomi() {
		return this.jCheckBoxSeleccionadosTipoNovedadNomi;
	}

	public void setjCheckBoxSeleccionadosTipoNovedadNomi(
			JCheckBox jCheckBoxSeleccionadosTipoNovedadNomi) {
		this.jCheckBoxSeleccionadosTipoNovedadNomi = jCheckBoxSeleccionadosTipoNovedadNomi;
	}
	
	public void setBorderResaltarSeleccionadosTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoNovedadNomi() {
		return this.jComboBoxTiposArchivosReportesTipoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoNovedadNomi(
			JComboBox jComboBoxTiposArchivosReportesTipoNovedadNomi) {
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi = jComboBoxTiposArchivosReportesTipoNovedadNomi;
	}

	public void setBorderResaltarTiposArchivosReportesTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoNovedadNomi() {
		return this.jComboBoxTiposReportesTipoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoNovedadNomi(
			JComboBox jComboBoxTiposReportesTipoNovedadNomi) {
		this.jComboBoxTiposReportesTipoNovedadNomi = jComboBoxTiposReportesTipoNovedadNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoNovedadNomi() {
	//	return jComboBoxTiposReportesDinamicoTipoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoNovedadNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoNovedadNomi) {
	//	this.jComboBoxTiposReportesDinamicoTipoNovedadNomi = jComboBoxTiposReportesDinamicoTipoNovedadNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi = jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi;
	//}
	
	public void setBorderResaltarTiposReportesTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoNovedadNomi() {
		return this.jComboBoxTiposGraficosReportesTipoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoNovedadNomi(
			JComboBox jComboBoxTiposGraficosReportesTipoNovedadNomi) {
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi = jComboBoxTiposGraficosReportesTipoNovedadNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoNovedadNomi() {
		return this.jComboBoxTiposPaginacionTipoNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoNovedadNomi(
			JComboBox jComboBoxTiposPaginacionTipoNovedadNomi) {
		this.jComboBoxTiposPaginacionTipoNovedadNomi = jComboBoxTiposPaginacionTipoNovedadNomi;
	}
	
	public void setBorderResaltarTiposPaginacionTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoNovedadNomi() {
		return this.jComboBoxTiposRelacionesTipoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNovedadNomi() {
		return this.jComboBoxTiposAccionesTipoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNovedadNomi(
			JComboBox jComboBoxTiposRelacionesTipoNovedadNomi) {
		this.jComboBoxTiposRelacionesTipoNovedadNomi = jComboBoxTiposRelacionesTipoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNovedadNomi(
			JComboBox jComboBoxTiposAccionesTipoNovedadNomi) {
		this.jComboBoxTiposAccionesTipoNovedadNomi = jComboBoxTiposAccionesTipoNovedadNomi;
	}
	
	public void setBorderResaltarTiposRelacionesTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoNovedadNomi() {
	//	return jCheckBoxConGraficoDinamicoTipoNovedadNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoNovedadNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoNovedadNomi) {
	//	this.jCheckBoxConGraficoDinamicoTipoNovedadNomi = jCheckBoxConGraficoDinamicoTipoNovedadNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoNovedadNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoNovedadNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoNovedadNomi .setBorder(borderResaltar);		
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
		this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		
		this.tiponovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponovedadnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoNovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoNovedadNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"nuevo","nuevo","Nuevo"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"duplicar","duplicar","Duplicar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"copiar","copiar","Copiar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"ver_form","ver_form","Ver"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"recargar","recargar","Recargar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,
							"cerrar","cerrar","Salir"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoNovedadNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoNovedadNomi;
			
				this.jButtonProcesarInformacionToolBarTipoNovedadNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoNovedadNomi;
				
		//protected JButton jButtonModificarToolBarTipoNovedadNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoNovedadNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoNovedadNomi=new JMenuMe("General");
		this.jmenuArchivoTipoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuAccionesTipoNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDatosTipoNovedadNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoNovedadNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoNovedadNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoNovedadNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoNovedadNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoNovedadNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoNovedadNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoNovedadNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoNovedadNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoNovedadNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoNovedadNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoNovedadNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoNovedadNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoNovedadNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoNovedadNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoNovedadNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoNovedadNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoNovedadNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoNovedadNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoNovedadNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoNovedadNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoNovedadNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoNovedadNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoNovedadNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoNovedadNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoNovedadNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoNovedadNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoNovedadNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoNovedadNomi.add(this.jMenuItemCerrarTipoNovedadNomi);
			
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemNuevoTipoNovedadNomi);
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi);
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemNuevoRelacionesTipoNovedadNomi);
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemGuardarCambiosTablaTipoNovedadNomi);		
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemDuplicarTipoNovedadNomi);		
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemCopiarTipoNovedadNomi);		
			this.jmenuAccionesTipoNovedadNomi.add(this.jMenuItemVerFormTipoNovedadNomi);		
			
			this.jmenuDatosTipoNovedadNomi.add(this.jMenuItemRecargarInformacionTipoNovedadNomi);				
			this.jmenuDatosTipoNovedadNomi.add(this.jMenuItemAnterioresTipoNovedadNomi);				
			this.jmenuDatosTipoNovedadNomi.add(this.jMenuItemSiguientesTipoNovedadNomi);				
			this.jmenuDatosTipoNovedadNomi.add(this.jMenuItemAbrirOrderByTipoNovedadNomi);				
			this.jmenuDatosTipoNovedadNomi.add(this.jMenuItemMostrarOcultarTipoNovedadNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoNovedadNomi.add(this.jMenuItemGuardarCambiosTipoNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoNovedadNomi.add(this.jmenuArchivoTipoNovedadNomi);		
			this.jmenuBarTipoNovedadNomi.add(this.jmenuAccionesTipoNovedadNomi);		
			this.jmenuBarTipoNovedadNomi.add(this.jmenuDatosTipoNovedadNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoNovedadNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoNovedadNomi() {
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
			//this.jInternalFrameDetalleTipoNovedadNomi = new TipoNovedadNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Novedad DATOS");
			this.jInternalFrameDetalleFormTipoNovedadNomi = new TipoNovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.tiponovedadnomiSessionBean.getConGuardarRelaciones(),this.tiponovedadnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoNovedadNomi = null;//new TipoNovedadNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNovedadNomi= new GridBagLayout();
		
		
		this.jTableDatosTipoNovedadNomi = new JTableMe();      
		
		String sToolTipTipoNovedadNomi="";
		sToolTipTipoNovedadNomi=TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNovedadNomi+="(Nomina.TipoNovedadNomi)";
		}
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNovedadNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoNovedadNomi.setToolTipText(sToolTipTipoNovedadNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoNovedadNomi);
		this.jTableDatosTipoNovedadNomi.setAutoCreateRowSorter(true);
		this.jTableDatosTipoNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoNovedadNomi.setRowSelectionAllowed(true);
		this.jTableDatosTipoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoNovedadNomi = new JButtonMe();
		this.jButtonDuplicarTipoNovedadNomi = new JButtonMe();
		this.jButtonCopiarTipoNovedadNomi = new JButtonMe();
		this.jButtonVerFormTipoNovedadNomi = new JButtonMe();
		this.jButtonNuevoRelacionesTipoNovedadNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi = new JButtonMe();
		this.jButtonCerrarTipoNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoNovedadNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Novedad";
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoNovedadNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoNovedadNomi=new ReporteDinamicoJInternalFrame(TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoNovedadNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoNovedadNomi=new ImportacionJInternalFrame(TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoNovedadNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoNovedadNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoNovedadNomi.setText("Orden");
		this.jButtonAbrirOrderByTipoNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNovedadNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNovedadNomi,false,this);
			
			//this.cargarOrderByTipoNovedadNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNovedadNomi,true,this);
			
			//this.cargarOrderByTipoNovedadNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoNovedadNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNovedadNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNovedadNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoNovedadNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNovedadNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNovedadNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoNovedadNomi.setText("Nuevo");
		this.jButtonDuplicarTipoNovedadNomi.setText("Duplicar");
		this.jButtonCopiarTipoNovedadNomi.setText("Copiar");
		this.jButtonVerFormTipoNovedadNomi.setText("Ver");
		this.jButtonNuevoRelacionesTipoNovedadNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.setText("Guardar");
		this.jButtonCerrarTipoNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNovedadNomi,"nuevo_button","Nuevo",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoNovedadNomi,"duplicar_button","Duplicar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoNovedadNomi,"copiar_button","Copiar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoNovedadNomi,"ver_form","Ver",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoNovedadNomi,"nuevorelaciones_button","Nuevo Rel",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNovedadNomi,"guardarcambiostabla_button","Guardar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNovedadNomi,"cerrar_button","Salir",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoNovedadNomi.setToolTipText("Nuevo"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoNovedadNomi.setToolTipText("Duplicar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoNovedadNomi.setToolTipText("Copiar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoNovedadNomi.setToolTipText("Ver"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoNovedadNomi.setToolTipText("Nuevo Rel"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.setToolTipText("Guardar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNovedadNomi.setToolTipText("Salir"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNovedadNomi";
		inputMap = this.jButtonNuevoTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNovedadNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoNovedadNomi";
		inputMap = this.jButtonDuplicarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoNovedadNomi"));
		
		//COPIAR
		sMapKey = "CopiarTipoNovedadNomi";
		inputMap = this.jButtonCopiarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoNovedadNomi"));
		
		//VEr FORM
		sMapKey = "VerFormTipoNovedadNomi";
		inputMap = this.jButtonVerFormTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoNovedadNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoNovedadNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoNovedadNomi";
		inputMap = this.jButtonModificarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoNovedadNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoNovedadNomi";
		inputMap = this.jButtonCerrarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNovedadNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoNovedadNomi.setName("jPanelParametrosReportesTipoNovedadNomi"); 
		
		this.jPanelParametrosReportesAccionesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoNovedadNomi.setName("jPanelParametrosReportesAccionesTipoNovedadNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoNovedadNomi = new JButtonMe();
		this.jButtonRecargarInformacionTipoNovedadNomi.setText("Recargar");
		this.jButtonRecargarInformacionTipoNovedadNomi.setToolTipText("Recargar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoNovedadNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoNovedadNomi = new JButtonMe();
		this.jButtonProcesarInformacionTipoNovedadNomi.setText("Procesar");
		this.jButtonProcesarInformacionTipoNovedadNomi.setToolTipText("Procesar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoNovedadNomi.setVisible(false);
			
		this.jButtonProcesarInformacionTipoNovedadNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNovedadNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNovedadNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposReportesTipoNovedadNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoNovedadNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoNovedadNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoNovedadNomi.setText("Accion");
		this.jComboBoxTiposRelacionesTipoNovedadNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoNovedadNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoNovedadNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoNovedadNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoNovedadNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNovedadNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNovedadNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesTipoNovedadNomi.setText("Acciones");		
		this.jLabelAccionesTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoNovedadNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoNovedadNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoNovedadNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoNovedadNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoNovedadNomi = new JButtonMe();
		//this.jButtonAnterioresTipoNovedadNomi.setText("<<");
        this.jButtonAnterioresTipoNovedadNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoNovedadNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoNovedadNomi = new JButtonMe();
		//this.jButtonSiguientesTipoNovedadNomi.setText(">>");
        this.jButtonSiguientesTipoNovedadNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoNovedadNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoNovedadNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoNovedadNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoNovedadNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoNovedadNomi,"nuevoguardarcambios_button","Nue",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoNovedadNomi";
		inputMap = this.jButtonNuevoGuardarCambiosTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoNovedadNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoNovedadNomi";
		inputMap = this.jButtonRecargarInformacionTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoNovedadNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoNovedadNomi";
		inputMap = this.jButtonSiguientesTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoNovedadNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoNovedadNomi";
		inputMap = this.jButtonAnterioresTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoNovedadNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoNovedadNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoNovedadNomi.setMinimumSize(new Dimension(this.getWidth(),TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNovedadNomi.setMaximumSize(new Dimension(this.getWidth(),TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNovedadNomi.setPreferredSize(new Dimension(this.getWidth(),TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoNovedadNomi = new GridBagLayout();

			this.jPanelPaginacionTipoNovedadNomi.setLayout(gridaBagLayoutPaginacionTipoNovedadNomi);						
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonAnterioresTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					
						
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
			
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonNuevoGuardarCambiosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
						
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonSiguientesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonNuevoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
				this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonNuevoRelacionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			}
			
			
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
				this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonGuardarCambiosTablaTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			}
			
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonDuplicarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonCopiarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonVerFormTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 1;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoNovedadNomi.add(this.jButtonCerrarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
		
		
		this.jButtonRecargarInformacionTipoNovedadNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNovedadNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNovedadNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNovedadNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoNovedadNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNovedadNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNovedadNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoNovedadNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNovedadNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNovedadNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoNovedadNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoNovedadNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoNovedadNomi.setLayout(gridaBagParametrosReportesTipoNovedadNomi);
			this.jPanelParametrosReportesAccionesTipoNovedadNomi.setLayout(gridaBagParametrosReportesAccionesTipoNovedadNomi);
			
			
			this.jPanelParametrosAuxiliar1TipoNovedadNomi.setLayout(gridaBagParametrosAuxiliar1TipoNovedadNomi);
			this.jPanelParametrosAuxiliar2TipoNovedadNomi.setLayout(gridaBagParametrosAuxiliar2TipoNovedadNomi);
			this.jPanelParametrosAuxiliar3TipoNovedadNomi.setLayout(gridaBagParametrosAuxiliar3TipoNovedadNomi);
			this.jPanelParametrosAuxiliar4TipoNovedadNomi.setLayout(gridaBagParametrosAuxiliar4TipoNovedadNomi);
			//this.jPanelParametrosAuxiliar5TipoNovedadNomi.setLayout(gridaBagParametrosAuxiliar2TipoNovedadNomi);			
			
			
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jButtonRecargarInformacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNovedadNomi.add(this.jComboBoxTiposPaginacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNovedadNomi.add(this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNovedadNomi.add(this.jComboBoxTiposArchivosReportesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jPanelParametrosAuxiliar1TipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoNovedadNomi.add(this.jComboBoxTiposReportesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jPanelParametrosAuxiliar4TipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jComboBoxTiposReportesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jCheckBoxGenerarReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jPanelParametrosAuxiliar2TipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jLabelAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoNovedadNomi.add(this.jButtonAbrirOrderByTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jComboBoxTiposSeleccionarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			
			
			/*
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jCheckBoxSeleccionarTodosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNovedadNomi.add(this.jCheckBoxSeleccionarTodosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);															
				
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNovedadNomi.add(this.jCheckBoxSeleccionadosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jPanelParametrosAuxiliar3TipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jComboBoxTiposRelacionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
				
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jComboBoxTiposAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
	
				
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNovedadNomi.add(this.jTextFieldValorCampoGeneralTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoNovedadNomi = new GridBagLayout();

			this.jScrollPanelDatosTipoNovedadNomi.setLayout(gridaBagLayoutDatosTipoNovedadNomi);
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
			
			this.jScrollPanelDatosTipoNovedadNomi.add(this.jTableDatosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoNovedadNomi.setViewportView(this.jTableDatosTipoNovedadNomi);
		this.jTableDatosTipoNovedadNomi.setFillsViewportHeight(true);
		this.jTableDatosTipoNovedadNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesTipoNovedadNomi.setLayout(gridaBagLayoutAccionesTipoNovedadNomi);
		
		
		/*	
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
			
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonNuevoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNovedadNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsTipoNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNovedadNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;		
		//this.gridBagConstraintsTipoNovedadNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoNovedadNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoNovedadNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);								
		
		
		/*
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		*/		
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNovedadNomi.gridx =0;
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
				
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNovedadNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoNovedadNomi.setLayout(gridaBagLayoutBusquedasParametrosTipoNovedadNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoNovedadNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoNovedadNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoNovedadNomi.setName("jPanelReporteDinamicoTipoNovedadNomi"); 
		
		this.jPanelReporteDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoNovedadNomi.setLayout(gridaBagLayoutReporteDinamicoTipoNovedadNomi);
		
		
		this.jInternalFrameReporteDinamicoTipoNovedadNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoNovedadNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoNovedadNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoNovedadNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoNovedadNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoNovedadNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoNovedadNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jLabelColumnasSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoNovedadNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoNovedadNomi=new JScrollPane(this.jListColumnasSelectReporteTipoNovedadNomi);
			
			this.jScrollColumnasSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jListColumnasSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jScrollColumnasSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoNovedadNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoNovedadNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jLabelRelacionesSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoNovedadNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoNovedadNomi=new JScrollPane(this.jListRelacionesSelectReporteTipoNovedadNomi);
			
			this.jScrollRelacionesSelectReporteTipoNovedadNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNovedadNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNovedadNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jListRelacionesSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jScrollRelacionesSelectReporteTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoNovedadNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoNovedadNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoNovedadNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jLabelGenerarExcelReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi.setToolTipText("Generar EXCEL"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jComboBoxTiposReportesDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jLabelTiposArchivoReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jComboBoxTiposArchivosReportesDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoNovedadNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoNovedadNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoNovedadNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoNovedadNomi.setToolTipText("Generar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jButtonGenerarReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoNovedadNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoNovedadNomi.setToolTipText("Cancelar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNovedadNomi.add(this.jButtonCerrarReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoNovedadNomi= new JScrollPane(jPanelReporteDinamicoTipoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoNovedadNomi);
		this.jInternalFrameReporteDinamicoTipoNovedadNomi.getContentPane().add(this.jScrollPanelReporteDinamicoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoNovedadNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoNovedadNomi.setName("jPanelImportacionTipoNovedadNomi"); 
		
		this.jPanelImportacionTipoNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoNovedadNomi.setLayout(gridaBagLayoutImportacionTipoNovedadNomi);
		
		
		this.jInternalFrameImportacionTipoNovedadNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoNovedadNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoNovedadNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNovedadNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoNovedadNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoNovedadNomi = new JLabelMe();

		this.jLabelArchivoImportacionTipoNovedadNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNovedadNomi.add(this.jLabelArchivoImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoNovedadNomi = new JFileChooser();		
		this.jFileChooserImportacionTipoNovedadNomi.setToolTipText("ESCOGER ARCHIVO"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoNovedadNomi = new JButtonMe();
		this.jButtonAbrirImportacionTipoNovedadNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoNovedadNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoNovedadNomi.setToolTipText("Generar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNovedadNomi.add(this.jButtonAbrirImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoNovedadNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoNovedadNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNovedadNomi.add(this.jLabelPathArchivoImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoNovedadNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoNovedadNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNovedadNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNovedadNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNovedadNomi.add(this.jTextFieldPathArchivoImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoNovedadNomi = new JButtonMe();
		this.jButtonGenerarImportacionTipoNovedadNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoNovedadNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoNovedadNomi.setToolTipText("Generar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNovedadNomi.add(this.jButtonGenerarImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoNovedadNomi = new JButtonMe();
		this.jButtonCerrarImportacionTipoNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoNovedadNomi.setToolTipText("Cancelar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNovedadNomi.add(this.jButtonCerrarImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoNovedadNomi= new JScrollPane(jPanelImportacionTipoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoNovedadNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoNovedadNomi);
		this.jInternalFrameImportacionTipoNovedadNomi.getContentPane().add(this.jScrollPanelImportacionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoNovedadNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoNovedadNomi = new JButtonMe();
			this.jButtonAbrirOrderByTipoNovedadNomi.setText("Orden");
			this.jButtonAbrirOrderByTipoNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNovedadNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoNovedadNomi";
			inputMap = this.jButtonAbrirOrderByTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoNovedadNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoNovedadNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoNovedadNomi.setName("jPanelOrderByTipoNovedadNomi"); 
			
			this.jPanelOrderByTipoNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoNovedadNomi.setLayout(gridaBagLayoutOrderByTipoNovedadNomi);
			
			
			this.jTableDatosTipoNovedadNomiOrderBy = new JTableMe();        
			this.jTableDatosTipoNovedadNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoNovedadNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoNovedadNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoNovedadNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoNovedadNomiOrderBy.setViewportView(this.jTableDatosTipoNovedadNomiOrderBy);
			this.jTableDatosTipoNovedadNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoNovedadNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoNovedadNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoNovedadNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoNovedadNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoNovedadNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoNovedadNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoNovedadNomi.setTitle("Orden");
			this.jInternalFrameOrderByTipoNovedadNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoNovedadNomi.setResizable(true);
			this.jInternalFrameOrderByTipoNovedadNomi.setClosable(true);
			this.jInternalFrameOrderByTipoNovedadNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoNovedadNomi.ipady =150;
				
			this.jPanelOrderByTipoNovedadNomi.add(jScrollPanelDatosTipoNovedadNomiOrderBy, this.gridBagConstraintsTipoNovedadNomi);//this.jTableDatosTipoNovedadNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoNovedadNomi = new JButtonMe();
			this.jButtonCerrarOrderByTipoNovedadNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoNovedadNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoNovedadNomi.setToolTipText("Cancelar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoNovedadNomi.add(this.jButtonCerrarOrderByTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoNovedadNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoNovedadNomi= new JScrollPane(jPanelOrderByTipoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoNovedadNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoNovedadNomi);
			
			this.jInternalFrameOrderByTipoNovedadNomi.getContentPane().add(this.jScrollPanelOrderByTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
		
		} else {
			this.jButtonAbrirOrderByTipoNovedadNomi = new JButtonMe();
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
			&& this.tiponovedadnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoNovedadNomi.getRowHeight();//TipoNovedadNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.isSelected()) {
					iHeightTable=TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNovedadNomi.isSelected()) {
					iHeightTable=TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoNovedadNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNovedadNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNovedadNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoNovedadNomi!=null && this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoNovedadNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoNovedadNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoNovedadNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiponovedadnomiLogic.getTipoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponovedadnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoNovedadNomi> TraerTipoNovedadNomiBeans(List<TipoNovedadNomi> tiponovedadnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoNovedadNomi tiponovedadnomi:tiponovedadnomis) {
					
				if(!(TipoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiponovedadnomi.setsDetalleGeneralEntityReporte(TipoNovedadNomiConstantesFunciones.getTipoNovedadNomiDescripcion(tiponovedadnomi));
										
						
					
					

					if(tiponovedadnomi.getNovedadNomis()!=null && Funciones.existeClass(classes,NovedadNomi.class)) {
						try{tiponovedadnomi.setnovedadnomisDescripcionReporte(new JRBeanCollectionDataSource(NovedadNomiJInternalFrame.TraerNovedadNomiBeans(tiponovedadnomi.getNovedadNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiponovedadnomi.setsDetalleGeneralEntityReporte(tiponovedadnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiponovedadnomibeans.add(tiponovedadnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiponovedadnomis;
    }
	//PARA REPORTES FIN
}
