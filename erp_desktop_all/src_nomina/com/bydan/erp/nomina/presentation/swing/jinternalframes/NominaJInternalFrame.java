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
import com.bydan.erp.nomina.util.NominaConstantesFunciones;

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
public class NominaJInternalFrame extends NominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNomina;
	
	protected JMenuBar jmenuBarNomina;
	
	protected JMenu jmenuNomina;
	protected JMenu jmenuDatosNomina;
	protected JMenu jmenuArchivoNomina;
	protected JMenu jmenuAccionesNomina;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNomina;	
	protected GridBagConstraints gridBagConstraintsNomina;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NominaDetalleFormJInternalFrame jInternalFrameDetalleFormNomina;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNomina;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNomina;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NominaSessionBean nominaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Nomina> nominas;		
	public List<Nomina> nominasEliminados;	
	public List<Nomina> nominasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNomina;		
	protected JButton jButtonAbrirOrderByNomina;
	
	
	//protected JPanel jPanelOrderByNomina;
	//public JScrollPane jScrollPanelOrderByNomina;	
	//protected JButton jButtonCerrarOrderByNomina;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NominaLogic nominaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNomina;
	public JScrollPane jScrollPanelDatosEdicionNomina;
	public JScrollPane jScrollPanelDatosGeneralNomina;
    
	
	
	//public JScrollPane jScrollPanelDatosNominaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNomina;
	//public JScrollPane jScrollPanelImportacionNomina;
	
	
	
	protected JPanel jPanelAccionesNomina;
	
    protected JPanel jPanelPaginacionNomina;
    protected JPanel jPanelParametrosReportesNomina;
	protected JPanel jPanelParametrosReportesAccionesNomina;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Nomina;
	protected JPanel jPanelParametrosAuxiliar2Nomina;
	protected JPanel jPanelParametrosAuxiliar3Nomina;
	protected JPanel jPanelParametrosAuxiliar4Nomina;
	//protected JPanel jPanelParametrosAuxiliar5Nomina;
	
	
	
	//protected JPanel jPanelReporteDinamicoNomina;
	//protected JPanel jPanelImportacionNomina;
	
	
	public JTable jTableDatosNomina;
	
	
	
	//public JTable jTableDatosNominaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNomina;
	protected JButton jButtonDuplicarNomina;
	protected JButton jButtonCopiarNomina;
	protected JButton jButtonVerFormNomina;
	protected JButton jButtonNuevoRelacionesNomina;
	protected JButton jButtonModificarNomina;
	
    protected JButton jButtonGuardarCambiosTablaNomina;
	protected JButton jButtonCerrarNomina;
	
	
	protected JButton jButtonRecargarInformacionNomina;
	protected JButton jButtonProcesarInformacionNomina;
	
	
	protected JButton jButtonAnterioresNomina;
	protected JButton jButtonSiguientesNomina;
	protected JButton jButtonNuevoGuardarCambiosNomina;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNomina;
	//protected JButton jButtonCerrarReporteDinamicoNomina;
	//protected JButton jButtonGenerarExcelReporteDinamicoNomina;	
	
	
	
	//protected JButton jButtonAbrirImportacionNomina;
	//protected JButton jButtonGenerarImportacionNomina;
	//protected JButton jButtonCerrarImportacionNomina;
	//protected JFileChooser jFileChooserImportacionNomina;
	//protected File fileImportacionNomina;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNomina;
	protected JButton jButtonDuplicarToolBarNomina;
	protected JButton jButtonNuevoRelacionesToolBarNomina;
	
	
	public JButton jButtonGuardarCambiosToolBarNomina;
	protected JButton jButtonCopiarToolBarNomina;
	protected JButton jButtonVerFormToolBarNomina;
	public JButton jButtonGuardarCambiosTablaToolBarNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarNomina;
	protected JButton jButtonCerrarToolBarNomina;
	
	protected JButton jButtonRecargarInformacionToolBarNomina;
	protected JButton jButtonProcesarInformacionToolBarNomina;
	protected JButton jButtonAnterioresToolBarNomina;
	protected JButton jButtonSiguientesToolBarNomina;
	protected JButton jButtonNuevoGuardarCambiosToolBarNomina;
	protected JButton jButtonAbrirOrderByToolBarNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNomina;
	protected JMenuItem jMenuItemDuplicarNomina;
	protected JMenuItem jMenuItemNuevoRelacionesNomina;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNomina;
	protected JMenuItem jMenuItemCopiarNomina;
	protected JMenuItem jMenuItemVerFormNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaNomina;
	protected JMenuItem jMenuItemCerrarNomina;
	protected JMenuItem jMenuItemDetalleCerrarNomina;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarNomina;
	
	protected JMenuItem jMenuItemRecargarInformacionNomina;
	protected JMenuItem jMenuItemProcesarInformacionNomina;
	protected JMenuItem jMenuItemAnterioresNomina;
	protected JMenuItem jMenuItemSiguientesNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNomina;
	protected JMenuItem jMenuItemAbrirOrderByNomina;
	protected JMenuItem jMenuItemMostrarOcultarNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNomina;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNomina;
	protected JCheckBox jCheckBoxSeleccionadosNomina;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNomina;
	protected JCheckBox jCheckBoxConGraficoReporteNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNomina;
	protected JTextField jTextFieldValorCampoGeneralNomina;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNomina;
	//public JList<Reporte> jListColumnasSelectReporteNomina;
	//public JScrollPane jScrollColumnasSelectReporteNomina;
	
	//public JLabel jLabelRelacionesSelectReporteNomina;
	//public JList<Reporte> jListRelacionesSelectReporteNomina;
	//public JScrollPane jScrollRelacionesSelectReporteNomina;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNomina;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNomina;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNomina;
	//public JLabel jLabelTiposArchivoReporteDinamicoNomina;
	
		
	//public JLabel jLabelArchivoImportacionNomina;	
	//public JLabel jLabelPathArchivoImportacionNomina;
	//protected JTextField jTextFieldPathArchivoImportacionNomina;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNomina;
	
	//public JLabel jLabelColumnaCategoriaValorNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNomina;
	
	//public JLabel jLabelColumnasValoresGraficoNomina;
	//public JList<Reporte> jListColumnasValoresGraficoNomina;
	//public JScrollPane jScrollColumnasValoresGraficoNomina;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNomina;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNomina;	
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NominaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNomina)	{
		this.jButtonRecargarInformacionNomina = jButtonRecargarInformacionNomina;
	}
	
	public JButton getjButtonProcesarInformacionNomina() {
		return this.jButtonProcesarInformacionNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNomina)	{
		this.jButtonProcesarInformacionNomina = jButtonProcesarInformacionNomina;
	}
	
	
	public JButton getjButtonRecargarInformacionNomina() {
		return this.jButtonRecargarInformacionNomina;
	}
	
	
	public List<Nomina> getnominas() {
		return this.nominas;
	}

	public void setnominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}
	
	public List<Nomina> getnominasAux() {
		return this.nominasAux;
	}

	public void setnominasAux(List<Nomina> nominasAux) {
		this.nominasAux = nominasAux;
	}
	
	public List<Nomina> getnominasEliminados() {
		return this.nominasEliminados;
	}

	public void setNominasEliminados(List<Nomina> nominasEliminados) {
		this.nominasEliminados = nominasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNomina() {
		return jComboBoxTiposSeleccionarNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNomina(
			JComboBox jComboBoxTiposSeleccionarNomina) {
		this.jComboBoxTiposSeleccionarNomina = jComboBoxTiposSeleccionarNomina;
	}
	
	public void setBorderResaltarTiposSeleccionarNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNomina .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNomina() {
		return jTextFieldValorCampoGeneralNomina;
	}

	public void setjTextFieldValorCampoGeneralNomina(
			JTextField jTextFieldValorCampoGeneralNomina) {
		this.jTextFieldValorCampoGeneralNomina = jTextFieldValorCampoGeneralNomina;
	}

	public void setBorderResaltarValorCampoGeneralNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNomina .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNomina() {
		return this.jCheckBoxSeleccionarTodosNomina;
	}

	public void setjCheckBoxSeleccionarTodosNomina(
			JCheckBox jCheckBoxSeleccionarTodosNomina) {
		this.jCheckBoxSeleccionarTodosNomina = jCheckBoxSeleccionarTodosNomina;
	}

	public void setBorderResaltarSeleccionarTodosNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNomina .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNomina() {
		return this.jCheckBoxSeleccionadosNomina;
	}

	public void setjCheckBoxSeleccionadosNomina(
			JCheckBox jCheckBoxSeleccionadosNomina) {
		this.jCheckBoxSeleccionadosNomina = jCheckBoxSeleccionadosNomina;
	}
	
	public void setBorderResaltarSeleccionadosNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNomina .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNomina() {
		return this.jComboBoxTiposArchivosReportesNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNomina(
			JComboBox jComboBoxTiposArchivosReportesNomina) {
		this.jComboBoxTiposArchivosReportesNomina = jComboBoxTiposArchivosReportesNomina;
	}

	public void setBorderResaltarTiposArchivosReportesNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNomina() {
		return this.jComboBoxTiposReportesNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNomina(
			JComboBox jComboBoxTiposReportesNomina) {
		this.jComboBoxTiposReportesNomina = jComboBoxTiposReportesNomina;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNomina() {
	//	return jComboBoxTiposReportesDinamicoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNomina(
	//		JComboBox jComboBoxTiposReportesDinamicoNomina) {
	//	this.jComboBoxTiposReportesDinamicoNomina = jComboBoxTiposReportesDinamicoNomina;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNomina() {
	//	return jComboBoxTiposArchivosReportesDinamicoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNomina(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNomina) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNomina = jComboBoxTiposArchivosReportesDinamicoNomina;
	//}
	
	public void setBorderResaltarTiposReportesNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNomina() {
		return this.jComboBoxTiposGraficosReportesNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNomina(
			JComboBox jComboBoxTiposGraficosReportesNomina) {
		this.jComboBoxTiposGraficosReportesNomina = jComboBoxTiposGraficosReportesNomina;
	}
	
	public void setBorderResaltarTiposGraficosReportesNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNomina() {
		return this.jComboBoxTiposPaginacionNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNomina(
			JComboBox jComboBoxTiposPaginacionNomina) {
		this.jComboBoxTiposPaginacionNomina = jComboBoxTiposPaginacionNomina;
	}
	
	public void setBorderResaltarTiposPaginacionNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNomina() {
		return this.jComboBoxTiposRelacionesNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNomina() {
		return this.jComboBoxTiposAccionesNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNomina(
			JComboBox jComboBoxTiposRelacionesNomina) {
		this.jComboBoxTiposRelacionesNomina = jComboBoxTiposRelacionesNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNomina(
			JComboBox jComboBoxTiposAccionesNomina) {
		this.jComboBoxTiposAccionesNomina = jComboBoxTiposAccionesNomina;
	}
	
	public void setBorderResaltarTiposRelacionesNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNomina .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNomina .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNomina() {
	//	return jCheckBoxConGraficoDinamicoNomina;
	//}

	//public void setjCheckBoxConGraficoDinamicoNomina(
	//		JCheckBox jCheckBoxConGraficoDinamicoNomina) {
	//	this.jCheckBoxConGraficoDinamicoNomina = jCheckBoxConGraficoDinamicoNomina;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNomina() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNomina.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNomina .setBorder(borderResaltar);		
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
		this.nominaSessionBean=new NominaSessionBean();
		
		this.nominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nominaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NominaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
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
		
		NominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNomina= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNomina,this.jTtoolBarNomina,
							"nuevo","nuevo","Nuevo"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNomina,this.jTtoolBarNomina,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNomina,this.jTtoolBarNomina,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNomina,this.jTtoolBarNomina,
							"duplicar","duplicar","Duplicar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNomina,this.jTtoolBarNomina,
							"copiar","copiar","Copiar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNomina,this.jTtoolBarNomina,
							"ver_form","ver_form","Ver"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNomina,this.jTtoolBarNomina,
							"recargar","recargar","Recargar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNomina,this.jTtoolBarNomina,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNomina,this.jTtoolBarNomina,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNomina,this.jTtoolBarNomina,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNomina,this.jTtoolBarNomina,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNomina,this.jTtoolBarNomina,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNomina,this.jTtoolBarNomina,
							"cerrar","cerrar","Salir"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNomina=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNomina;
			
				this.jButtonProcesarInformacionToolBarNomina=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNomina;
				
		//protected JButton jButtonModificarToolBarNomina;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNomina=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNomina=new JMenuMe("General");
		this.jmenuArchivoNomina=new JMenuMe("Archivo");
		this.jmenuAccionesNomina=new JMenuMe("Acciones");
		this.jmenuDatosNomina=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNomina= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNomina.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNomina,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNomina= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNomina.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNomina,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNomina= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNomina.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNomina,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNomina= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNomina.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNomina,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNomina= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNomina.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNomina,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNomina= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNomina.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNomina,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNomina= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNomina.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNomina,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNomina= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNomina.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNomina,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNomina= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNomina.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNomina,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNomina= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNomina.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNomina,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNomina.add(this.jMenuItemCerrarNomina);
			
			this.jmenuAccionesNomina.add(this.jMenuItemNuevoNomina);
			this.jmenuAccionesNomina.add(this.jMenuItemNuevoGuardarCambiosNomina);
			this.jmenuAccionesNomina.add(this.jMenuItemNuevoRelacionesNomina);
			this.jmenuAccionesNomina.add(this.jMenuItemGuardarCambiosTablaNomina);		
			this.jmenuAccionesNomina.add(this.jMenuItemDuplicarNomina);		
			this.jmenuAccionesNomina.add(this.jMenuItemCopiarNomina);		
			this.jmenuAccionesNomina.add(this.jMenuItemVerFormNomina);		
			
			this.jmenuDatosNomina.add(this.jMenuItemRecargarInformacionNomina);				
			this.jmenuDatosNomina.add(this.jMenuItemAnterioresNomina);				
			this.jmenuDatosNomina.add(this.jMenuItemSiguientesNomina);				
			this.jmenuDatosNomina.add(this.jMenuItemAbrirOrderByNomina);				
			this.jmenuDatosNomina.add(this.jMenuItemMostrarOcultarNomina);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNomina.add(this.jMenuItemGuardarCambiosNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNomina.add(this.jmenuArchivoNomina);		
			this.jmenuBarNomina.add(this.jmenuAccionesNomina);		
			this.jmenuBarNomina.add(this.jmenuDatosNomina);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNomina);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNomina() {
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
			//this.jInternalFrameDetalleNomina = new NominaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nomina DATOS");
			this.jInternalFrameDetalleFormNomina = new NominaDetalleFormJInternalFrame(jDesktopPane,this.nominaSessionBean.getConGuardarRelaciones(),this.nominaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNomina = null;//new NominaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNomina= new GridBagLayout();
		
		
		this.jTableDatosNomina = new JTableMe();      
		
		String sToolTipNomina="";
		sToolTipNomina=NominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNomina+="(Nomina.Nomina)";
		}
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNomina+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNomina.setToolTipText(sToolTipNomina);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNomina);
		this.jTableDatosNomina.setAutoCreateRowSorter(true);
		this.jTableDatosNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNomina.setRowSelectionAllowed(true);
		this.jTableDatosNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNomina,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNomina = new JButtonMe();
		this.jButtonDuplicarNomina = new JButtonMe();
		this.jButtonCopiarNomina = new JButtonMe();
		this.jButtonVerFormNomina = new JButtonMe();
		this.jButtonNuevoRelacionesNomina = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNomina = new JButtonMe();
		this.jButtonCerrarNomina = new JButtonMe();
		
		this.jScrollPanelDatosNomina = new JScrollPane();   
        this.jScrollPanelDatosGeneralNomina = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Nomina";
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNomina.setToolTipText("Acciones");
        this.jPanelAccionesNomina.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNomina=new ReporteDinamicoJInternalFrame(NominaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNomina();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNomina=new ImportacionJInternalFrame(NominaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNomina();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNomina = new JButtonMe();
		
		this.jButtonAbrirOrderByNomina.setText("Orden");
		this.jButtonAbrirOrderByNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNomina,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNomina,false,this);
			
			//this.cargarOrderByNomina(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNomina,true,this);
			
			//this.cargarOrderByNomina(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNomina.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosNomina.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosNomina.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosNomina.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNomina.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNomina.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNomina.setText("Nuevo");
		this.jButtonDuplicarNomina.setText("Duplicar");
		this.jButtonCopiarNomina.setText("Copiar");
		this.jButtonVerFormNomina.setText("Ver");
		this.jButtonNuevoRelacionesNomina.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNomina.setText("Guardar");
		this.jButtonCerrarNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNomina,"nuevo_button","Nuevo",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNomina,"duplicar_button","Duplicar",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNomina,"copiar_button","Copiar",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNomina,"ver_form","Ver",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNomina,"nuevorelaciones_button","Nuevo Rel",this.nominaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNomina,"guardarcambiostabla_button","Guardar",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNomina,"cerrar_button","Salir",this.nominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNomina.setToolTipText("Nuevo"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNomina.setToolTipText("Duplicar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNomina.setToolTipText("Copiar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNomina.setToolTipText("Ver"+" "+NominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNomina.setToolTipText("Nuevo Rel"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNomina.setToolTipText("Guardar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNomina.setToolTipText("Salir"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNomina";
		inputMap = this.jButtonNuevoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNomina"));
		
		//DUPLICAR
		sMapKey = "DuplicarNomina";
		inputMap = this.jButtonDuplicarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNomina"));
		
		//COPIAR
		sMapKey = "CopiarNomina";
		inputMap = this.jButtonCopiarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNomina"));
		
		//VEr FORM
		sMapKey = "VerFormNomina";
		inputMap = this.jButtonVerFormNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNomina"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNomina";
		inputMap = this.jButtonNuevoRelacionesNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNomina"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNomina";
		inputMap = this.jButtonModificarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNomina"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNomina";
		inputMap = this.jButtonCerrarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNomina";
		inputMap = this.jButtonGuardarCambiosTablaNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNomina"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Nomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Nomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Nomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Nomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Nomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNomina.setName("jPanelParametrosReportesNomina"); 
		
		this.jPanelParametrosReportesAccionesNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNomina.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNomina.setName("jPanelParametrosReportesAccionesNomina"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNomina, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNomina, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNomina = new JButtonMe();
		this.jButtonRecargarInformacionNomina.setText("Recargar");
		this.jButtonRecargarInformacionNomina.setToolTipText("Recargar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNomina,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNomina = new JButtonMe();
		this.jButtonProcesarInformacionNomina.setText("Procesar");
		this.jButtonProcesarInformacionNomina.setToolTipText("Procesar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNomina.setVisible(false);
			
		this.jButtonProcesarInformacionNomina.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNomina.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNomina.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNomina.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNomina.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNomina.setText("TIPO");       
		this.jComboBoxTiposReportesNomina.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNomina.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNomina = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNomina.setText("Paginacion");
		this.jComboBoxTiposPaginacionNomina.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNomina = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNomina.setText("Accion");
		this.jComboBoxTiposRelacionesNomina.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNomina.setText("Accion");
		this.jComboBoxTiposAccionesNomina.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNomina = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNomina.setText("Accion");
		this.jComboBoxTiposSeleccionarNomina.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNomina=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNomina.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNomina.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNomina.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNomina = new JLabelMe();
		
		this.jLabelAccionesNomina.setText("Acciones");		
		this.jLabelAccionesNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNomina = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNomina.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNomina.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNomina = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNomina.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNomina.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNomina = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNomina.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNomina.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNomina = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNomina.setText("Graf.");
		this.jCheckBoxConGraficoReporteNomina.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNomina = new JButtonMe();
		//this.jButtonAnterioresNomina.setText("<<");
        this.jButtonAnterioresNomina.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNomina,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNomina = new JButtonMe();
		//this.jButtonSiguientesNomina.setText(">>");
        this.jButtonSiguientesNomina.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNomina,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNomina = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNomina.setText("Nue");
        this.jButtonNuevoGuardarCambiosNomina.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNomina,"nuevoguardarcambios_button","Nue",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNomina";
		inputMap = this.jButtonNuevoGuardarCambiosNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNomina"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNomina";
		inputMap = this.jButtonRecargarInformacionNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNomina"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNomina";
		inputMap = this.jButtonSiguientesNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNomina"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNomina";
		inputMap = this.jButtonAnterioresNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNomina"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNomina();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNomina.setMinimumSize(new Dimension(this.getWidth(),NominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNomina.setMaximumSize(new Dimension(this.getWidth(),NominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNomina.setPreferredSize(new Dimension(this.getWidth(),NominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NominaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNomina = new GridBagLayout();

			this.jPanelPaginacionNomina.setLayout(gridaBagLayoutPaginacionNomina);						
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 0;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNomina.add(this.jButtonAnterioresNomina, this.gridBagConstraintsNomina);
					
						
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNomina.gridy = 0;
			
			this.jPanelPaginacionNomina.add(this.jButtonNuevoGuardarCambiosNomina, this.gridBagConstraintsNomina);
						
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNomina.gridy = 0;
			this.jPanelPaginacionNomina.add(this.jButtonSiguientesNomina, this.gridBagConstraintsNomina);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 1;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNomina.add(this.jButtonNuevoNomina, this.gridBagConstraintsNomina);
						
			
			
			if(!this.nominaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNomina = new GridBagConstraints();
				this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNomina.gridy = 1;
				this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNomina.add(this.jButtonGuardarCambiosTablaNomina, this.gridBagConstraintsNomina);
			}
			
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 1;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNomina.add(this.jButtonDuplicarNomina, this.gridBagConstraintsNomina);
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 1;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNomina.add(this.jButtonCopiarNomina, this.gridBagConstraintsNomina);
		
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 1;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNomina.add(this.jButtonVerFormNomina, this.gridBagConstraintsNomina);
		
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 1;
			this.gridBagConstraintsNomina.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNomina.add(this.jButtonCerrarNomina, this.gridBagConstraintsNomina);
		
		
		
		this.jButtonRecargarInformacionNomina.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNomina.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNomina.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNomina.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNomina.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNomina.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNomina.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNomina.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNomina.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNomina.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNomina.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNomina.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNomina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNomina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNomina.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNomina.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNomina.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNomina.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNomina = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Nomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Nomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Nomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Nomina = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNomina.setLayout(gridaBagParametrosReportesNomina);
			this.jPanelParametrosReportesAccionesNomina.setLayout(gridaBagParametrosReportesAccionesNomina);
			
			
			this.jPanelParametrosAuxiliar1Nomina.setLayout(gridaBagParametrosAuxiliar1Nomina);
			this.jPanelParametrosAuxiliar2Nomina.setLayout(gridaBagParametrosAuxiliar2Nomina);
			this.jPanelParametrosAuxiliar3Nomina.setLayout(gridaBagParametrosAuxiliar3Nomina);
			this.jPanelParametrosAuxiliar4Nomina.setLayout(gridaBagParametrosAuxiliar4Nomina);
			//this.jPanelParametrosAuxiliar5Nomina.setLayout(gridaBagParametrosAuxiliar2Nomina);			
			
			
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNomina.add(this.jButtonRecargarInformacionNomina, this.gridBagConstraintsNomina);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Nomina.add(this.jComboBoxTiposPaginacionNomina, this.gridBagConstraintsNomina);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Nomina.add(this.jCheckBoxConAltoMaximoTablaNomina, this.gridBagConstraintsNomina);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Nomina.add(this.jComboBoxTiposArchivosReportesNomina, this.gridBagConstraintsNomina);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNomina.add(this.jPanelParametrosAuxiliar1Nomina, this.gridBagConstraintsNomina);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Nomina.add(this.jComboBoxTiposReportesNomina, this.gridBagConstraintsNomina);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNomina.add(this.jPanelParametrosAuxiliar4Nomina, this.gridBagConstraintsNomina);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNomina.add(this.jComboBoxTiposReportesNomina, this.gridBagConstraintsNomina);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNomina.add(this.jCheckBoxGenerarReporteNomina, this.gridBagConstraintsNomina);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNomina.add(this.jPanelParametrosAuxiliar2Nomina, this.gridBagConstraintsNomina);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNomina.add(this.jLabelAccionesNomina, this.gridBagConstraintsNomina);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNomina.add(this.jComboBoxTiposSeleccionarNomina, this.gridBagConstraintsNomina);			
			
			
			/*
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNomina.add(this.jCheckBoxSeleccionarTodosNomina, this.gridBagConstraintsNomina);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Nomina.add(this.jCheckBoxSeleccionarTodosNomina, this.gridBagConstraintsNomina);															
				
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Nomina.add(this.jCheckBoxSeleccionadosNomina, this.gridBagConstraintsNomina);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNomina.add(this.jPanelParametrosAuxiliar3Nomina, this.gridBagConstraintsNomina);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNomina.add(this.jComboBoxTiposAccionesNomina, this.gridBagConstraintsNomina);
	
				
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNomina.add(this.jTextFieldValorCampoGeneralNomina, this.gridBagConstraintsNomina);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNomina = new GridBagLayout();

			this.jScrollPanelDatosNomina.setLayout(gridaBagLayoutDatosNomina);
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = 0;
			this.gridBagConstraintsNomina.gridx = 0;
			
			this.jScrollPanelDatosNomina.add(this.jTableDatosNomina, this.gridBagConstraintsNomina);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNomina.setViewportView(this.jTableDatosNomina);
		this.jTableDatosNomina.setFillsViewportHeight(true);
		this.jTableDatosNomina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNomina= new GridBagLayout();
		this.jPanelAccionesNomina.setLayout(gridaBagLayoutAccionesNomina);
		
		
		/*	
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = 0;
		this.gridBagConstraintsNomina.gridx = 0;
			
		this.jPanelAccionesNomina.add(this.jButtonNuevoNomina, this.gridBagConstraintsNomina);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNomina);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNomina = new GridBagConstraints();						
			this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNomina.gridx = 0;		
			//this.gridBagConstraintsNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNomina.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNomina, this.gridBagConstraintsNomina);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNomina.gridx = 0;		
		//this.gridBagConstraintsNomina.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNomina.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNomina);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNomina, this.gridBagConstraintsNomina);								
		
		
		/*
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNomina, this.gridBagConstraintsNomina);
		*/		
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNomina.gridx =0;
		this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNomina, this.gridBagConstraintsNomina);
				
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNomina, this.gridBagConstraintsNomina);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NominaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNomina = new GridBagLayout();
			this.jPanelBusquedasParametrosNomina.setLayout(gridaBagLayoutBusquedasParametrosNomina);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNomina, this.gridBagConstraintsNomina);
			
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNomina, this.gridBagConstraintsNomina);
		
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNomina, this.gridBagConstraintsNomina);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNomina;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNomina() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNomina.setName("jPanelReporteDinamicoNomina"); 
		
		this.jPanelReporteDinamicoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNomina.setLayout(gridaBagLayoutReporteDinamicoNomina);
		
		
		this.jInternalFrameReporteDinamicoNomina= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNomina.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNomina.setResizable(true);
	    this.jInternalFrameReporteDinamicoNomina.setClosable(true);
	    this.jInternalFrameReporteDinamicoNomina.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNomina = new JLabelMe();

		this.jLabelColumnasSelectReporteNomina.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNomina.add(this.jLabelColumnasSelectReporteNomina, this.gridBagConstraintsNomina);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNomina = new JList<Reporte>();
		this.jListColumnasSelectReporteNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNomina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNomina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNomina=new JScrollPane(this.jListColumnasSelectReporteNomina);
			
			this.jScrollColumnasSelectReporteNomina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNomina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNomina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNomina.add(this.jListColumnasSelectReporteNomina, this.gridBagConstraintsNomina);
		this.jPanelReporteDinamicoNomina.add(this.jScrollColumnasSelectReporteNomina, this.gridBagConstraintsNomina);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNomina = new JLabelMe();

		this.jLabelRelacionesSelectReporteNomina.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNomina = new JList<Reporte>();
		this.jListRelacionesSelectReporteNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNomina.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNomina.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNomina=new JScrollPane(this.jListRelacionesSelectReporteNomina);
			
			this.jScrollRelacionesSelectReporteNomina.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNomina.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNomina.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNomina = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNomina = new JComboBoxMe();
		this.jListColumnasValoresGraficoNomina = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNomina = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNomina = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNomina.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNomina = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNomina.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNomina.add(this.jLabelGenerarExcelReporteDinamicoNomina, this.gridBagConstraintsNomina);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNomina = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNomina.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNomina,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNomina.setToolTipText("Generar EXCEL"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNomina = new GridBagConstraints();
		//this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNomina.add(this.jButtonGenerarExcelReporteDinamicoNomina, this.gridBagConstraintsNomina);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNomina.add(this.jComboBoxTiposReportesDinamicoNomina, this.gridBagConstraintsNomina);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNomina = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNomina.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNomina.add(this.jLabelTiposArchivoReporteDinamicoNomina, this.gridBagConstraintsNomina);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNomina.add(this.jComboBoxTiposArchivosReportesDinamicoNomina, this.gridBagConstraintsNomina);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNomina = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNomina.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNomina,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNomina.setToolTipText("Generar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNomina.add(this.jButtonGenerarReporteDinamicoNomina, this.gridBagConstraintsNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNomina = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNomina.setToolTipText("Cancelar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNomina.add(this.jButtonCerrarReporteDinamicoNomina, this.gridBagConstraintsNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNomina = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNomina= new JScrollPane(jPanelReporteDinamicoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNomina.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNomina.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNomina);
		this.jInternalFrameReporteDinamicoNomina.getContentPane().add(this.jScrollPanelReporteDinamicoNomina, this.gridBagConstraintsNomina);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNomina() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNomina.setName("jPanelImportacionNomina"); 
		
		this.jPanelImportacionNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNomina.setLayout(gridaBagLayoutImportacionNomina);
		
		
		this.jInternalFrameImportacionNomina= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNomina= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNomina.setResizable(true);
	    this.jInternalFrameImportacionNomina.setClosable(true);
	    this.jInternalFrameImportacionNomina.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNomina.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNomina.setResizable(true);
	    this.jInternalFrameImportacionNomina.setClosable(true);
	    this.jInternalFrameImportacionNomina.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNomina = new JLabelMe();

		this.jLabelArchivoImportacionNomina.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNomina.add(this.jLabelArchivoImportacionNomina, this.gridBagConstraintsNomina);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNomina = new JFileChooser();		
		this.jFileChooserImportacionNomina.setToolTipText("ESCOGER ARCHIVO"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNomina = new JButtonMe();
		this.jButtonAbrirImportacionNomina.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNomina,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNomina.setToolTipText("Generar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNomina.add(this.jButtonAbrirImportacionNomina, this.gridBagConstraintsNomina);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNomina = new JLabelMe();

		this.jLabelPathArchivoImportacionNomina.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNomina.add(this.jLabelPathArchivoImportacionNomina, this.gridBagConstraintsNomina);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNomina=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNomina.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNomina.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNomina.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNomina.add(this.jTextFieldPathArchivoImportacionNomina, this.gridBagConstraintsNomina);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNomina = new JButtonMe();
		this.jButtonGenerarImportacionNomina.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNomina,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNomina.setToolTipText("Generar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNomina.add(this.jButtonGenerarImportacionNomina, this.gridBagConstraintsNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNomina = new JButtonMe();
		this.jButtonCerrarImportacionNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNomina.setToolTipText("Cancelar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNomina.add(this.jButtonCerrarImportacionNomina, this.gridBagConstraintsNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNomina = new GridBagLayout();
		
		this.jScrollPanelImportacionNomina= new JScrollPane(jPanelImportacionNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iPosYImportacion;
		this.gridBagConstraintsNomina.gridx =iPosXImportacion;
		this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNomina.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNomina);
		this.jInternalFrameImportacionNomina.getContentPane().add(this.jScrollPanelImportacionNomina, this.gridBagConstraintsNomina);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNomina(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNomina = new JButtonMe();
			this.jButtonAbrirOrderByNomina.setText("Orden");
			this.jButtonAbrirOrderByNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNomina,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNomina";
			inputMap = this.jButtonAbrirOrderByNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNomina"));
		
		
			GridBagLayout gridaBagLayoutOrderByNomina = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNomina.setName("jPanelOrderByNomina"); 
			
			this.jPanelOrderByNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNomina.setLayout(gridaBagLayoutOrderByNomina);
			
			
			this.jTableDatosNominaOrderBy = new JTableMe();        
			this.jTableDatosNominaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNominaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNominaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNominaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNominaOrderBy.setViewportView(this.jTableDatosNominaOrderBy);
			this.jTableDatosNominaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNominaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNomina= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNomina= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNomina = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNomina= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNomina.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNomina.setTitle("Orden");
			this.jInternalFrameOrderByNomina.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNomina.setResizable(true);
			this.jInternalFrameOrderByNomina.setClosable(true);
			this.jInternalFrameOrderByNomina.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNomina.ipady =150;
				
			this.jPanelOrderByNomina.add(jScrollPanelDatosNominaOrderBy, this.gridBagConstraintsNomina);//this.jTableDatosNominaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNomina = new JButtonMe();
			this.jButtonCerrarOrderByNomina.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNomina,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNomina.setToolTipText("Cancelar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNomina.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNomina.add(this.jButtonCerrarOrderByNomina, this.gridBagConstraintsNomina);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNomina = new GridBagLayout();
			
			this.jScrollPanelOrderByNomina= new JScrollPane(jPanelOrderByNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy =iPosYOrderBy;
			this.gridBagConstraintsNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNomina.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNomina);
			
			this.jInternalFrameOrderByNomina.getContentPane().add(this.jScrollPanelOrderByNomina, this.gridBagConstraintsNomina);			
		
		} else {
			this.jButtonAbrirOrderByNomina = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.nominaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNomina.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNomina.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNomina.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNomina.getRowHeight();//NominaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNomina.isSelected()) {
					iHeightTable=NominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNomina.isSelected()) {
					iHeightTable=NominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNomina.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNomina.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNomina.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNomina!=null && this.jInternalFrameOrderByNomina.getjTableDatosOrderBy()!=null) {
			//if(!this.nominaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNomina.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNomina.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNomina.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNomina.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=nominaLogic.getNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nominas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Nomina> TraerNominaBeans(List<Nomina> nominas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Nomina nomina:nominas) {
					
				if(!(NominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					nomina.setsDetalleGeneralEntityReporte(NominaConstantesFunciones.getNominaDescripcion(nomina));
										
						
					
						
					
				} else  {
							
					//nomina.setsDetalleGeneralEntityReporte(nomina.getsDetalleGeneralEntityReporte());
										
				}
				
				//nominabeans.add(nominabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return nominas;
    }
	//PARA REPORTES FIN
}
