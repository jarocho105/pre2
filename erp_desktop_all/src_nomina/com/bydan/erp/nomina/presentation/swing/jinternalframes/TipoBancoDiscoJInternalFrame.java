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
import com.bydan.erp.nomina.util.TipoBancoDiscoConstantesFunciones;

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
public class TipoBancoDiscoJInternalFrame extends TipoBancoDiscoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoBancoDisco;
	
	protected JMenuBar jmenuBarTipoBancoDisco;
	
	protected JMenu jmenuTipoBancoDisco;
	protected JMenu jmenuDatosTipoBancoDisco;
	protected JMenu jmenuArchivoTipoBancoDisco;
	protected JMenu jmenuAccionesTipoBancoDisco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoDisco;	
	protected GridBagConstraints gridBagConstraintsTipoBancoDisco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoBancoDiscoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoBancoDisco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoBancoDisco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoBancoDisco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoBancoDiscoSessionBean tipobancodiscoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoBancoDisco> tipobancodiscos;		
	public List<TipoBancoDisco> tipobancodiscosEliminados;	
	public List<TipoBancoDisco> tipobancodiscosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoBancoDisco;		
	protected JButton jButtonAbrirOrderByTipoBancoDisco;
	
	
	//protected JPanel jPanelOrderByTipoBancoDisco;
	//public JScrollPane jScrollPanelOrderByTipoBancoDisco;	
	//protected JButton jButtonCerrarOrderByTipoBancoDisco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoBancoDiscoLogic tipobancodiscoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoBancoDisco;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoDisco;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoDisco;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoBancoDiscoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoBancoDisco;
	//public JScrollPane jScrollPanelImportacionTipoBancoDisco;
	
	
	
	protected JPanel jPanelAccionesTipoBancoDisco;
	
    protected JPanel jPanelPaginacionTipoBancoDisco;
    protected JPanel jPanelParametrosReportesTipoBancoDisco;
	protected JPanel jPanelParametrosReportesAccionesTipoBancoDisco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoBancoDisco;
	protected JPanel jPanelParametrosAuxiliar2TipoBancoDisco;
	protected JPanel jPanelParametrosAuxiliar3TipoBancoDisco;
	protected JPanel jPanelParametrosAuxiliar4TipoBancoDisco;
	//protected JPanel jPanelParametrosAuxiliar5TipoBancoDisco;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoBancoDisco;
	//protected JPanel jPanelImportacionTipoBancoDisco;
	
	
	public JTable jTableDatosTipoBancoDisco;
	
	
	
	//public JTable jTableDatosTipoBancoDiscoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoBancoDisco;
	protected JButton jButtonDuplicarTipoBancoDisco;
	protected JButton jButtonCopiarTipoBancoDisco;
	protected JButton jButtonVerFormTipoBancoDisco;
	protected JButton jButtonNuevoRelacionesTipoBancoDisco;
	protected JButton jButtonModificarTipoBancoDisco;
	
    protected JButton jButtonGuardarCambiosTablaTipoBancoDisco;
	protected JButton jButtonCerrarTipoBancoDisco;
	
	
	protected JButton jButtonRecargarInformacionTipoBancoDisco;
	protected JButton jButtonProcesarInformacionTipoBancoDisco;
	
	
	protected JButton jButtonAnterioresTipoBancoDisco;
	protected JButton jButtonSiguientesTipoBancoDisco;
	protected JButton jButtonNuevoGuardarCambiosTipoBancoDisco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoBancoDisco;
	//protected JButton jButtonCerrarReporteDinamicoTipoBancoDisco;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoBancoDisco;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoBancoDisco;
	//protected JButton jButtonGenerarImportacionTipoBancoDisco;
	//protected JButton jButtonCerrarImportacionTipoBancoDisco;
	//protected JFileChooser jFileChooserImportacionTipoBancoDisco;
	//protected File fileImportacionTipoBancoDisco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoDisco;
	protected JButton jButtonDuplicarToolBarTipoBancoDisco;
	protected JButton jButtonNuevoRelacionesToolBarTipoBancoDisco;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoBancoDisco;
	protected JButton jButtonCopiarToolBarTipoBancoDisco;
	protected JButton jButtonVerFormToolBarTipoBancoDisco;
	public JButton jButtonGuardarCambiosTablaToolBarTipoBancoDisco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoDisco;
	protected JButton jButtonCerrarToolBarTipoBancoDisco;
	
	protected JButton jButtonRecargarInformacionToolBarTipoBancoDisco;
	protected JButton jButtonProcesarInformacionToolBarTipoBancoDisco;
	protected JButton jButtonAnterioresToolBarTipoBancoDisco;
	protected JButton jButtonSiguientesToolBarTipoBancoDisco;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoBancoDisco;
	protected JButton jButtonAbrirOrderByToolBarTipoBancoDisco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoDisco;
	protected JMenuItem jMenuItemDuplicarTipoBancoDisco;
	protected JMenuItem jMenuItemNuevoRelacionesTipoBancoDisco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoBancoDisco;
	protected JMenuItem jMenuItemCopiarTipoBancoDisco;
	protected JMenuItem jMenuItemVerFormTipoBancoDisco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoDisco;
	protected JMenuItem jMenuItemCerrarTipoBancoDisco;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoDisco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoBancoDisco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoDisco;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoBancoDisco;
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoDisco;
	protected JMenuItem jMenuItemAnterioresTipoBancoDisco;
	protected JMenuItem jMenuItemSiguientesTipoBancoDisco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoDisco;
	protected JMenuItem jMenuItemAbrirOrderByTipoBancoDisco;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoDisco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoDisco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoBancoDisco;
	protected JCheckBox jCheckBoxSeleccionadosTipoBancoDisco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoBancoDisco;
	protected JCheckBox jCheckBoxConGraficoReporteTipoBancoDisco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoBancoDisco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoBancoDisco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoBancoDisco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoBancoDisco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoBancoDisco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoDisco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoDisco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoBancoDisco;
	protected JTextField jTextFieldValorCampoGeneralTipoBancoDisco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoBancoDisco;
	//public JList<Reporte> jListColumnasSelectReporteTipoBancoDisco;
	//public JScrollPane jScrollColumnasSelectReporteTipoBancoDisco;
	
	//public JLabel jLabelRelacionesSelectReporteTipoBancoDisco;
	//public JList<Reporte> jListRelacionesSelectReporteTipoBancoDisco;
	//public JScrollPane jScrollRelacionesSelectReporteTipoBancoDisco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoBancoDisco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoBancoDisco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoBancoDisco;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoBancoDisco;
	
		
	//public JLabel jLabelArchivoImportacionTipoBancoDisco;	
	//public JLabel jLabelPathArchivoImportacionTipoBancoDisco;
	//protected JTextField jTextFieldPathArchivoImportacionTipoBancoDisco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoBancoDisco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoBancoDisco;
	
	//public JLabel jLabelColumnaCategoriaValorTipoBancoDisco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoBancoDisco;
	
	//public JLabel jLabelColumnasValoresGraficoTipoBancoDisco;
	//public JList<Reporte> jListColumnasValoresGraficoTipoBancoDisco;
	//public JScrollPane jScrollColumnasValoresGraficoTipoBancoDisco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoBancoDisco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoBancoDisco;	
	
	
	
	
	
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
	public TipoBancoDiscoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoBancoDisco)	{
		this.jButtonRecargarInformacionTipoBancoDisco = jButtonRecargarInformacionTipoBancoDisco;
	}
	
	public JButton getjButtonProcesarInformacionTipoBancoDisco() {
		return this.jButtonProcesarInformacionTipoBancoDisco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoDisco)	{
		this.jButtonProcesarInformacionTipoBancoDisco = jButtonProcesarInformacionTipoBancoDisco;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoBancoDisco() {
		return this.jButtonRecargarInformacionTipoBancoDisco;
	}
	
	
	public List<TipoBancoDisco> gettipobancodiscos() {
		return this.tipobancodiscos;
	}

	public void settipobancodiscos(List<TipoBancoDisco> tipobancodiscos) {
		this.tipobancodiscos = tipobancodiscos;
	}
	
	public List<TipoBancoDisco> gettipobancodiscosAux() {
		return this.tipobancodiscosAux;
	}

	public void settipobancodiscosAux(List<TipoBancoDisco> tipobancodiscosAux) {
		this.tipobancodiscosAux = tipobancodiscosAux;
	}
	
	public List<TipoBancoDisco> gettipobancodiscosEliminados() {
		return this.tipobancodiscosEliminados;
	}

	public void setTipoBancoDiscosEliminados(List<TipoBancoDisco> tipobancodiscosEliminados) {
		this.tipobancodiscosEliminados = tipobancodiscosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoBancoDisco() {
		return jComboBoxTiposSeleccionarTipoBancoDisco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoBancoDisco(
			JComboBox jComboBoxTiposSeleccionarTipoBancoDisco) {
		this.jComboBoxTiposSeleccionarTipoBancoDisco = jComboBoxTiposSeleccionarTipoBancoDisco;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoBancoDisco() {
		return jTextFieldValorCampoGeneralTipoBancoDisco;
	}

	public void setjTextFieldValorCampoGeneralTipoBancoDisco(
			JTextField jTextFieldValorCampoGeneralTipoBancoDisco) {
		this.jTextFieldValorCampoGeneralTipoBancoDisco = jTextFieldValorCampoGeneralTipoBancoDisco;
	}

	public void setBorderResaltarValorCampoGeneralTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoBancoDisco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoBancoDisco() {
		return this.jCheckBoxSeleccionarTodosTipoBancoDisco;
	}

	public void setjCheckBoxSeleccionarTodosTipoBancoDisco(
			JCheckBox jCheckBoxSeleccionarTodosTipoBancoDisco) {
		this.jCheckBoxSeleccionarTodosTipoBancoDisco = jCheckBoxSeleccionarTodosTipoBancoDisco;
	}

	public void setBorderResaltarSeleccionarTodosTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoBancoDisco() {
		return this.jCheckBoxSeleccionadosTipoBancoDisco;
	}

	public void setjCheckBoxSeleccionadosTipoBancoDisco(
			JCheckBox jCheckBoxSeleccionadosTipoBancoDisco) {
		this.jCheckBoxSeleccionadosTipoBancoDisco = jCheckBoxSeleccionadosTipoBancoDisco;
	}
	
	public void setBorderResaltarSeleccionadosTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoBancoDisco() {
		return this.jComboBoxTiposArchivosReportesTipoBancoDisco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoBancoDisco(
			JComboBox jComboBoxTiposArchivosReportesTipoBancoDisco) {
		this.jComboBoxTiposArchivosReportesTipoBancoDisco = jComboBoxTiposArchivosReportesTipoBancoDisco;
	}

	public void setBorderResaltarTiposArchivosReportesTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoBancoDisco() {
		return this.jComboBoxTiposReportesTipoBancoDisco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoBancoDisco(
			JComboBox jComboBoxTiposReportesTipoBancoDisco) {
		this.jComboBoxTiposReportesTipoBancoDisco = jComboBoxTiposReportesTipoBancoDisco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoBancoDisco() {
	//	return jComboBoxTiposReportesDinamicoTipoBancoDisco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoBancoDisco(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoBancoDisco) {
	//	this.jComboBoxTiposReportesDinamicoTipoBancoDisco = jComboBoxTiposReportesDinamicoTipoBancoDisco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoBancoDisco() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoBancoDisco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco = jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco;
	//}
	
	public void setBorderResaltarTiposReportesTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoBancoDisco() {
		return this.jComboBoxTiposGraficosReportesTipoBancoDisco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoBancoDisco(
			JComboBox jComboBoxTiposGraficosReportesTipoBancoDisco) {
		this.jComboBoxTiposGraficosReportesTipoBancoDisco = jComboBoxTiposGraficosReportesTipoBancoDisco;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoBancoDisco() {
		return this.jComboBoxTiposPaginacionTipoBancoDisco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoBancoDisco(
			JComboBox jComboBoxTiposPaginacionTipoBancoDisco) {
		this.jComboBoxTiposPaginacionTipoBancoDisco = jComboBoxTiposPaginacionTipoBancoDisco;
	}
	
	public void setBorderResaltarTiposPaginacionTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoBancoDisco() {
		return this.jComboBoxTiposRelacionesTipoBancoDisco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoDisco() {
		return this.jComboBoxTiposAccionesTipoBancoDisco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoDisco(
			JComboBox jComboBoxTiposRelacionesTipoBancoDisco) {
		this.jComboBoxTiposRelacionesTipoBancoDisco = jComboBoxTiposRelacionesTipoBancoDisco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoDisco(
			JComboBox jComboBoxTiposAccionesTipoBancoDisco) {
		this.jComboBoxTiposAccionesTipoBancoDisco = jComboBoxTiposAccionesTipoBancoDisco;
	}
	
	public void setBorderResaltarTiposRelacionesTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoBancoDisco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoBancoDisco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoBancoDisco() {
	//	return jCheckBoxConGraficoDinamicoTipoBancoDisco;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoBancoDisco(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoBancoDisco) {
	//	this.jCheckBoxConGraficoDinamicoTipoBancoDisco = jCheckBoxConGraficoDinamicoTipoBancoDisco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoBancoDisco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoBancoDisco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoBancoDisco .setBorder(borderResaltar);		
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
		this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		
		this.tipobancodiscoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancodiscoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancodiscoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoDiscoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Disco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoBancoDiscoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoBancoDisco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"nuevo","nuevo","Nuevo"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"duplicar","duplicar","Duplicar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"copiar","copiar","Copiar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"ver_form","ver_form","Ver"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"recargar","recargar","Recargar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoBancoDisco,this.jTtoolBarTipoBancoDisco,
							"cerrar","cerrar","Salir"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoBancoDisco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoBancoDisco;
			
				this.jButtonProcesarInformacionToolBarTipoBancoDisco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoBancoDisco;
				
		//protected JButton jButtonModificarToolBarTipoBancoDisco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoBancoDisco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoBancoDisco=new JMenuMe("General");
		this.jmenuArchivoTipoBancoDisco=new JMenuMe("Archivo");
		this.jmenuAccionesTipoBancoDisco=new JMenuMe("Acciones");
		this.jmenuDatosTipoBancoDisco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoDisco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoDisco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoDisco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoBancoDisco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoBancoDisco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoBancoDisco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoBancoDisco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoBancoDisco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoBancoDisco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoBancoDisco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoDisco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoDisco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoBancoDisco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoBancoDisco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoBancoDisco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoBancoDisco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoBancoDisco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoBancoDisco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoBancoDisco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoBancoDisco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoBancoDisco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoDisco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoDisco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoDisco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoBancoDisco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoBancoDisco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoBancoDisco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoBancoDisco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoBancoDisco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoBancoDisco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoBancoDisco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoBancoDisco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoBancoDisco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoBancoDisco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoBancoDisco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoBancoDisco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoBancoDisco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoBancoDisco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoBancoDisco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoDisco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoDisco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoDisco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoBancoDisco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoBancoDisco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoBancoDisco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoDisco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoDisco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoDisco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoBancoDisco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoBancoDisco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoBancoDisco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoBancoDisco.add(this.jMenuItemCerrarTipoBancoDisco);
			
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemNuevoTipoBancoDisco);
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemNuevoGuardarCambiosTipoBancoDisco);
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemNuevoRelacionesTipoBancoDisco);
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemGuardarCambiosTablaTipoBancoDisco);		
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemDuplicarTipoBancoDisco);		
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemCopiarTipoBancoDisco);		
			this.jmenuAccionesTipoBancoDisco.add(this.jMenuItemVerFormTipoBancoDisco);		
			
			this.jmenuDatosTipoBancoDisco.add(this.jMenuItemRecargarInformacionTipoBancoDisco);				
			this.jmenuDatosTipoBancoDisco.add(this.jMenuItemAnterioresTipoBancoDisco);				
			this.jmenuDatosTipoBancoDisco.add(this.jMenuItemSiguientesTipoBancoDisco);				
			this.jmenuDatosTipoBancoDisco.add(this.jMenuItemAbrirOrderByTipoBancoDisco);				
			this.jmenuDatosTipoBancoDisco.add(this.jMenuItemMostrarOcultarTipoBancoDisco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoBancoDisco.add(this.jMenuItemGuardarCambiosTipoBancoDisco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoBancoDisco.add(this.jmenuArchivoTipoBancoDisco);		
			this.jmenuBarTipoBancoDisco.add(this.jmenuAccionesTipoBancoDisco);		
			this.jmenuBarTipoBancoDisco.add(this.jmenuDatosTipoBancoDisco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoBancoDisco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoBancoDisco() {
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
			//this.jInternalFrameDetalleTipoBancoDisco = new TipoBancoDiscoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Banco Disco DATOS");
			this.jInternalFrameDetalleFormTipoBancoDisco = new TipoBancoDiscoDetalleFormJInternalFrame(jDesktopPane,this.tipobancodiscoSessionBean.getConGuardarRelaciones(),this.tipobancodiscoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoBancoDisco = null;//new TipoBancoDiscoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoDisco= new GridBagLayout();
		
		
		this.jTableDatosTipoBancoDisco = new JTableMe();      
		
		String sToolTipTipoBancoDisco="";
		sToolTipTipoBancoDisco=TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoDisco+="(Nomina.TipoBancoDisco)";
		}
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoDisco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoBancoDisco.setToolTipText(sToolTipTipoBancoDisco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoBancoDisco);
		this.jTableDatosTipoBancoDisco.setAutoCreateRowSorter(true);
		this.jTableDatosTipoBancoDisco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoBancoDisco.setRowSelectionAllowed(true);
		this.jTableDatosTipoBancoDisco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoBancoDisco = new JButtonMe();
		this.jButtonDuplicarTipoBancoDisco = new JButtonMe();
		this.jButtonCopiarTipoBancoDisco = new JButtonMe();
		this.jButtonVerFormTipoBancoDisco = new JButtonMe();
		this.jButtonNuevoRelacionesTipoBancoDisco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco = new JButtonMe();
		this.jButtonCerrarTipoBancoDisco = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoDisco = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoBancoDisco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Disco";
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoDisco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoDisco.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoDisco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoBancoDisco=new ReporteDinamicoJInternalFrame(TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoBancoDisco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoBancoDisco=new ImportacionJInternalFrame(TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoBancoDisco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoBancoDisco = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoBancoDisco.setText("Orden");
		this.jButtonAbrirOrderByTipoBancoDisco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoDisco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoDisco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoDisco,false,this);
			
			//this.cargarOrderByTipoBancoDisco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoDisco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoDisco,true,this);
			
			//this.cargarOrderByTipoBancoDisco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoBancoDisco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoDisco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoDisco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoBancoDisco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoDisco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoDisco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoBancoDisco.setText("Nuevo");
		this.jButtonDuplicarTipoBancoDisco.setText("Duplicar");
		this.jButtonCopiarTipoBancoDisco.setText("Copiar");
		this.jButtonVerFormTipoBancoDisco.setText("Ver");
		this.jButtonNuevoRelacionesTipoBancoDisco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.setText("Guardar");
		this.jButtonCerrarTipoBancoDisco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoDisco,"nuevo_button","Nuevo",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoBancoDisco,"duplicar_button","Duplicar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoBancoDisco,"copiar_button","Copiar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoBancoDisco,"ver_form","Ver",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoBancoDisco,"nuevorelaciones_button","Nuevo Rel",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoDisco,"guardarcambiostabla_button","Guardar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoDisco,"cerrar_button","Salir",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoBancoDisco.setToolTipText("Nuevo"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoBancoDisco.setToolTipText("Duplicar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoBancoDisco.setToolTipText("Copiar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoBancoDisco.setToolTipText("Ver"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoBancoDisco.setToolTipText("Nuevo Rel"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.setToolTipText("Guardar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoDisco.setToolTipText("Salir"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoDisco";
		inputMap = this.jButtonNuevoTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoDisco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoDisco"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoBancoDisco";
		inputMap = this.jButtonDuplicarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoBancoDisco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoBancoDisco"));
		
		//COPIAR
		sMapKey = "CopiarTipoBancoDisco";
		inputMap = this.jButtonCopiarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoBancoDisco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoBancoDisco"));
		
		//VEr FORM
		sMapKey = "VerFormTipoBancoDisco";
		inputMap = this.jButtonVerFormTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoBancoDisco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoBancoDisco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoBancoDisco";
		inputMap = this.jButtonNuevoRelacionesTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoBancoDisco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoBancoDisco";
		inputMap = this.jButtonModificarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoBancoDisco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoDisco";
		inputMap = this.jButtonCerrarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoDisco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoDisco";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoDisco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoBancoDisco.setName("jPanelParametrosReportesTipoBancoDisco"); 
		
		this.jPanelParametrosReportesAccionesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoBancoDisco.setName("jPanelParametrosReportesAccionesTipoBancoDisco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoBancoDisco = new JButtonMe();
		this.jButtonRecargarInformacionTipoBancoDisco.setText("Recargar");
		this.jButtonRecargarInformacionTipoBancoDisco.setToolTipText("Recargar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoBancoDisco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoBancoDisco = new JButtonMe();
		this.jButtonProcesarInformacionTipoBancoDisco.setText("Procesar");
		this.jButtonProcesarInformacionTipoBancoDisco.setToolTipText("Procesar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoBancoDisco.setVisible(false);
			
		this.jButtonProcesarInformacionTipoBancoDisco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoDisco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoDisco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoDisco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoBancoDisco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoDisco.setText("TIPO");       
		this.jComboBoxTiposReportesTipoBancoDisco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoDisco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoBancoDisco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoBancoDisco.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoBancoDisco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoBancoDisco.setText("Accion");
		this.jComboBoxTiposRelacionesTipoBancoDisco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoDisco.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoDisco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoBancoDisco.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoBancoDisco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoBancoDisco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoBancoDisco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoDisco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoDisco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoBancoDisco = new JLabelMe();
		
		this.jLabelAccionesTipoBancoDisco.setText("Acciones");		
		this.jLabelAccionesTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoBancoDisco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoBancoDisco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoBancoDisco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoBancoDisco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoBancoDisco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoBancoDisco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoBancoDisco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoBancoDisco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoBancoDisco.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoBancoDisco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoBancoDisco = new JButtonMe();
		//this.jButtonAnterioresTipoBancoDisco.setText("<<");
        this.jButtonAnterioresTipoBancoDisco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoBancoDisco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoBancoDisco = new JButtonMe();
		//this.jButtonSiguientesTipoBancoDisco.setText(">>");
        this.jButtonSiguientesTipoBancoDisco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoBancoDisco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoBancoDisco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoBancoDisco.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoBancoDisco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoBancoDisco,"nuevoguardarcambios_button","Nue",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoBancoDisco";
		inputMap = this.jButtonNuevoGuardarCambiosTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoBancoDisco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoBancoDisco";
		inputMap = this.jButtonRecargarInformacionTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoBancoDisco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoBancoDisco";
		inputMap = this.jButtonSiguientesTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoBancoDisco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoBancoDisco";
		inputMap = this.jButtonAnterioresTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoBancoDisco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoBancoDisco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoBancoDisco.setMinimumSize(new Dimension(this.getWidth(),TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoDisco.setMaximumSize(new Dimension(this.getWidth(),TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoDisco.setPreferredSize(new Dimension(this.getWidth(),TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoDiscoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoBancoDisco = new GridBagLayout();

			this.jPanelPaginacionTipoBancoDisco.setLayout(gridaBagLayoutPaginacionTipoBancoDisco);						
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 0;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonAnterioresTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					
						
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoDisco.gridy = 0;
			
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonNuevoGuardarCambiosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
						
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoDisco.gridy = 0;
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonSiguientesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 1;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonNuevoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
						
			
			
			if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBancoDisco.gridy = 1;
				this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoBancoDisco.add(this.jButtonGuardarCambiosTablaTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			}
			
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 1;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonDuplicarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 1;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonCopiarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 1;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonVerFormTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 1;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoBancoDisco.add(this.jButtonCerrarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
		
		
		this.jButtonRecargarInformacionTipoBancoDisco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoDisco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoDisco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoBancoDisco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoDisco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoDisco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoBancoDisco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoDisco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoDisco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoBancoDisco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoDisco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoDisco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoBancoDisco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoDisco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoDisco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoBancoDisco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoDisco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoDisco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoBancoDisco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoDisco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoDisco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoBancoDisco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoDisco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoDisco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoBancoDisco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoDisco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoDisco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoBancoDisco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoDisco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoDisco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoBancoDisco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoDisco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoDisco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoBancoDisco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoBancoDisco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoBancoDisco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoBancoDisco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoBancoDisco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoBancoDisco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoBancoDisco.setLayout(gridaBagParametrosReportesTipoBancoDisco);
			this.jPanelParametrosReportesAccionesTipoBancoDisco.setLayout(gridaBagParametrosReportesAccionesTipoBancoDisco);
			
			
			this.jPanelParametrosAuxiliar1TipoBancoDisco.setLayout(gridaBagParametrosAuxiliar1TipoBancoDisco);
			this.jPanelParametrosAuxiliar2TipoBancoDisco.setLayout(gridaBagParametrosAuxiliar2TipoBancoDisco);
			this.jPanelParametrosAuxiliar3TipoBancoDisco.setLayout(gridaBagParametrosAuxiliar3TipoBancoDisco);
			this.jPanelParametrosAuxiliar4TipoBancoDisco.setLayout(gridaBagParametrosAuxiliar4TipoBancoDisco);
			//this.jPanelParametrosAuxiliar5TipoBancoDisco.setLayout(gridaBagParametrosAuxiliar2TipoBancoDisco);			
			
			
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jButtonRecargarInformacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoDisco.add(this.jComboBoxTiposPaginacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoDisco.add(this.jCheckBoxConAltoMaximoTablaTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoDisco.add(this.jComboBoxTiposArchivosReportesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jPanelParametrosAuxiliar1TipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoBancoDisco.add(this.jComboBoxTiposReportesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jPanelParametrosAuxiliar4TipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jComboBoxTiposReportesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jCheckBoxGenerarReporteTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jPanelParametrosAuxiliar2TipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jLabelAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoBancoDisco.add(this.jButtonAbrirOrderByTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jComboBoxTiposSeleccionarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
			
			
			/*
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jCheckBoxSeleccionarTodosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoDisco.add(this.jCheckBoxSeleccionarTodosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);															
				
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoDisco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoDisco.add(this.jCheckBoxSeleccionadosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jPanelParametrosAuxiliar3TipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoDisco.add(this.jComboBoxTiposAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoBancoDisco = new GridBagLayout();

			this.jScrollPanelDatosTipoBancoDisco.setLayout(gridaBagLayoutDatosTipoBancoDisco);
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = 0;
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;
			
			this.jScrollPanelDatosTipoBancoDisco.add(this.jTableDatosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoBancoDisco.setViewportView(this.jTableDatosTipoBancoDisco);
		this.jTableDatosTipoBancoDisco.setFillsViewportHeight(true);
		this.jTableDatosTipoBancoDisco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoDisco= new GridBagLayout();
		this.jPanelAccionesTipoBancoDisco.setLayout(gridaBagLayoutAccionesTipoBancoDisco);
		
		
		/*	
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
			
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonNuevoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoDisco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoDisco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;		
			//this.gridBagConstraintsTipoBancoDisco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoDisco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;		
		//this.gridBagConstraintsTipoBancoDisco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoBancoDisco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoBancoDisco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);								
		
		
		/*
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		*/		
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoDisco.gridx =0;
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoDisco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
				
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoBancoDisco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoDisco = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoBancoDisco.setLayout(gridaBagLayoutBusquedasParametrosTipoBancoDisco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoBancoDisco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoDisco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoDisco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoDisco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoBancoDisco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoBancoDisco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoBancoDisco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoBancoDisco.setName("jPanelReporteDinamicoTipoBancoDisco"); 
		
		this.jPanelReporteDinamicoTipoBancoDisco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoDisco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoDisco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoBancoDisco.setLayout(gridaBagLayoutReporteDinamicoTipoBancoDisco);
		
		
		this.jInternalFrameReporteDinamicoTipoBancoDisco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoBancoDisco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoDisco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoBancoDisco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoBancoDisco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoBancoDisco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoBancoDisco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoBancoDisco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoBancoDisco.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoDisco.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoDisco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoBancoDisco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoDisco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoDisco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoBancoDisco = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoBancoDisco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jLabelColumnasSelectReporteTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoBancoDisco = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoBancoDisco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoBancoDisco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoBancoDisco=new JScrollPane(this.jListColumnasSelectReporteTipoBancoDisco);
			
			this.jScrollColumnasSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBancoDisco.add(this.jListColumnasSelectReporteTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jScrollColumnasSelectReporteTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoBancoDisco = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoBancoDisco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoBancoDisco = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoBancoDisco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoBancoDisco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoBancoDisco=new JScrollPane(this.jListRelacionesSelectReporteTipoBancoDisco);
			
			this.jScrollRelacionesSelectReporteTipoBancoDisco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoDisco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoDisco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoBancoDisco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoBancoDisco = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoBancoDisco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoBancoDisco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoBancoDisco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoBancoDisco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoDisco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoDisco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jLabelGenerarExcelReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco.setToolTipText("Generar EXCEL"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoBancoDisco.add(this.jButtonGenerarExcelReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jComboBoxTiposReportesDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jLabelTiposArchivoReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoBancoDisco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoBancoDisco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoBancoDisco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoBancoDisco.setToolTipText("Generar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jButtonGenerarReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoBancoDisco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoBancoDisco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoBancoDisco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoBancoDisco.setToolTipText("Cancelar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoDisco.add(this.jButtonCerrarReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoBancoDisco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoBancoDisco= new JScrollPane(jPanelReporteDinamicoTipoBancoDisco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoBancoDisco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoDisco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoDisco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoBancoDisco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoBancoDisco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoBancoDisco);
		this.jInternalFrameReporteDinamicoTipoBancoDisco.getContentPane().add(this.jScrollPanelReporteDinamicoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoBancoDisco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoBancoDisco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoBancoDisco.setName("jPanelImportacionTipoBancoDisco"); 
		
		this.jPanelImportacionTipoBancoDisco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoDisco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoDisco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoBancoDisco.setLayout(gridaBagLayoutImportacionTipoBancoDisco);
		
		
		this.jInternalFrameImportacionTipoBancoDisco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoBancoDisco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoBancoDisco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoDisco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoBancoDisco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoDisco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoDisco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoBancoDisco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoDisco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoDisco.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoDisco.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoDisco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoBancoDisco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoDisco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoDisco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoBancoDisco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoDisco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoDisco.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoDisco.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoDisco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoBancoDisco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoDisco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoDisco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoBancoDisco = new JLabelMe();

		this.jLabelArchivoImportacionTipoBancoDisco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoDisco.add(this.jLabelArchivoImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoBancoDisco = new JFileChooser();		
		this.jFileChooserImportacionTipoBancoDisco.setToolTipText("ESCOGER ARCHIVO"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoBancoDisco = new JButtonMe();
		this.jButtonAbrirImportacionTipoBancoDisco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoBancoDisco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoBancoDisco.setToolTipText("Generar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoDisco.add(this.jButtonAbrirImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoBancoDisco = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoBancoDisco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoDisco.add(this.jLabelPathArchivoImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoBancoDisco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoBancoDisco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoDisco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoDisco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoDisco.add(this.jTextFieldPathArchivoImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoBancoDisco = new JButtonMe();
		this.jButtonGenerarImportacionTipoBancoDisco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoBancoDisco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoBancoDisco.setToolTipText("Generar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoDisco.add(this.jButtonGenerarImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoBancoDisco = new JButtonMe();
		this.jButtonCerrarImportacionTipoBancoDisco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoBancoDisco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoBancoDisco.setToolTipText("Cancelar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoDisco.add(this.jButtonCerrarImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoBancoDisco = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoBancoDisco= new JScrollPane(jPanelImportacionTipoBancoDisco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoBancoDisco.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoBancoDisco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoBancoDisco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoBancoDisco);
		this.jInternalFrameImportacionTipoBancoDisco.getContentPane().add(this.jScrollPanelImportacionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoBancoDisco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoBancoDisco = new JButtonMe();
			this.jButtonAbrirOrderByTipoBancoDisco.setText("Orden");
			this.jButtonAbrirOrderByTipoBancoDisco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoDisco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoBancoDisco";
			inputMap = this.jButtonAbrirOrderByTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoBancoDisco"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoBancoDisco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoBancoDisco.setName("jPanelOrderByTipoBancoDisco"); 
			
			this.jPanelOrderByTipoBancoDisco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoDisco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoDisco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoBancoDisco.setLayout(gridaBagLayoutOrderByTipoBancoDisco);
			
			
			this.jTableDatosTipoBancoDiscoOrderBy = new JTableMe();        
			this.jTableDatosTipoBancoDiscoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoBancoDiscoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoBancoDiscoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoBancoDiscoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoBancoDiscoOrderBy.setViewportView(this.jTableDatosTipoBancoDiscoOrderBy);
			this.jTableDatosTipoBancoDiscoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoBancoDiscoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoBancoDisco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoBancoDisco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoBancoDisco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoBancoDisco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoBancoDisco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoBancoDisco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoBancoDisco.setTitle("Orden");
			this.jInternalFrameOrderByTipoBancoDisco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoBancoDisco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoBancoDisco.setResizable(true);
			this.jInternalFrameOrderByTipoBancoDisco.setClosable(true);
			this.jInternalFrameOrderByTipoBancoDisco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoBancoDisco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoDisco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoDisco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoDisco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoBancoDisco.ipady =150;
				
			this.jPanelOrderByTipoBancoDisco.add(jScrollPanelDatosTipoBancoDiscoOrderBy, this.gridBagConstraintsTipoBancoDisco);//this.jTableDatosTipoBancoDiscoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoBancoDisco = new JButtonMe();
			this.jButtonCerrarOrderByTipoBancoDisco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoBancoDisco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoBancoDisco.setToolTipText("Cancelar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoDisco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoBancoDisco.add(this.jButtonCerrarOrderByTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoBancoDisco = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoBancoDisco= new JScrollPane(jPanelOrderByTipoBancoDisco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoBancoDisco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoBancoDisco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoBancoDisco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoBancoDisco);
			
			this.jInternalFrameOrderByTipoBancoDisco.getContentPane().add(this.jScrollPanelOrderByTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
		
		} else {
			this.jButtonAbrirOrderByTipoBancoDisco = new JButtonMe();
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
			&& this.tipobancodiscoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoBancoDisco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoBancoDisco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoBancoDisco.getRowHeight();//TipoBancoDiscoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.isSelected()) {
					iHeightTable=TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoDisco.isSelected()) {
					iHeightTable=TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoDiscoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoBancoDisco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoDisco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoDisco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoBancoDisco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoDisco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoDisco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoBancoDisco!=null && this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy()!=null) {
			//if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoBancoDisco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoBancoDisco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoBancoDisco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoBancoDisco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoBancoDisco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoDisco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoDisco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipobancodiscoLogic.getTipoBancoDiscos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancodiscos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoBancoDisco> TraerTipoBancoDiscoBeans(List<TipoBancoDisco> tipobancodiscos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoBancoDisco tipobancodisco:tipobancodiscos) {
					
				if(!(TipoBancoDiscoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoBancoDiscoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipobancodisco.setsDetalleGeneralEntityReporte(TipoBancoDiscoConstantesFunciones.getTipoBancoDiscoDescripcion(tipobancodisco));
										
						
					
						
					
				} else  {
							
					//tipobancodisco.setsDetalleGeneralEntityReporte(tipobancodisco.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipobancodiscobeans.add(tipobancodiscobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipobancodiscos;
    }
	//PARA REPORTES FIN
}
