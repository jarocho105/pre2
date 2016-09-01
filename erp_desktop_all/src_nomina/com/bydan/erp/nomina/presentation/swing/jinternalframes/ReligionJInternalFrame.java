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
import com.bydan.erp.nomina.util.ReligionConstantesFunciones;

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
public class ReligionJInternalFrame extends ReligionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReligion;
	
	protected JMenuBar jmenuBarReligion;
	
	protected JMenu jmenuReligion;
	protected JMenu jmenuDatosReligion;
	protected JMenu jmenuArchivoReligion;
	protected JMenu jmenuAccionesReligion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReligion;	
	protected GridBagConstraints gridBagConstraintsReligion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReligionDetalleFormJInternalFrame jInternalFrameDetalleFormReligion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReligion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReligion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ReligionSessionBean religionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Religion> religions;		
	public List<Religion> religionsEliminados;	
	public List<Religion> religionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReligion;		
	protected JButton jButtonAbrirOrderByReligion;
	
	
	//protected JPanel jPanelOrderByReligion;
	//public JScrollPane jScrollPanelOrderByReligion;	
	//protected JButton jButtonCerrarOrderByReligion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReligionLogic religionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReligion;
	public JScrollPane jScrollPanelDatosEdicionReligion;
	public JScrollPane jScrollPanelDatosGeneralReligion;
    
	
	
	//public JScrollPane jScrollPanelDatosReligionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReligion;
	//public JScrollPane jScrollPanelImportacionReligion;
	
	
	
	protected JPanel jPanelAccionesReligion;
	
    protected JPanel jPanelPaginacionReligion;
    protected JPanel jPanelParametrosReportesReligion;
	protected JPanel jPanelParametrosReportesAccionesReligion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Religion;
	protected JPanel jPanelParametrosAuxiliar2Religion;
	protected JPanel jPanelParametrosAuxiliar3Religion;
	protected JPanel jPanelParametrosAuxiliar4Religion;
	//protected JPanel jPanelParametrosAuxiliar5Religion;
	
	
	
	//protected JPanel jPanelReporteDinamicoReligion;
	//protected JPanel jPanelImportacionReligion;
	
	
	public JTable jTableDatosReligion;
	
	
	
	//public JTable jTableDatosReligionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReligion;
	protected JButton jButtonDuplicarReligion;
	protected JButton jButtonCopiarReligion;
	protected JButton jButtonVerFormReligion;
	protected JButton jButtonNuevoRelacionesReligion;
	protected JButton jButtonModificarReligion;
	
    protected JButton jButtonGuardarCambiosTablaReligion;
	protected JButton jButtonCerrarReligion;
	
	
	protected JButton jButtonRecargarInformacionReligion;
	protected JButton jButtonProcesarInformacionReligion;
	
	
	protected JButton jButtonAnterioresReligion;
	protected JButton jButtonSiguientesReligion;
	protected JButton jButtonNuevoGuardarCambiosReligion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReligion;
	//protected JButton jButtonCerrarReporteDinamicoReligion;
	//protected JButton jButtonGenerarExcelReporteDinamicoReligion;	
	
	
	
	//protected JButton jButtonAbrirImportacionReligion;
	//protected JButton jButtonGenerarImportacionReligion;
	//protected JButton jButtonCerrarImportacionReligion;
	//protected JFileChooser jFileChooserImportacionReligion;
	//protected File fileImportacionReligion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReligion;
	protected JButton jButtonDuplicarToolBarReligion;
	protected JButton jButtonNuevoRelacionesToolBarReligion;
	
	
	public JButton jButtonGuardarCambiosToolBarReligion;
	protected JButton jButtonCopiarToolBarReligion;
	protected JButton jButtonVerFormToolBarReligion;
	public JButton jButtonGuardarCambiosTablaToolBarReligion;
	protected JButton jButtonMostrarOcultarTablaToolBarReligion;
	protected JButton jButtonCerrarToolBarReligion;
	
	protected JButton jButtonRecargarInformacionToolBarReligion;
	protected JButton jButtonProcesarInformacionToolBarReligion;
	protected JButton jButtonAnterioresToolBarReligion;
	protected JButton jButtonSiguientesToolBarReligion;
	protected JButton jButtonNuevoGuardarCambiosToolBarReligion;
	protected JButton jButtonAbrirOrderByToolBarReligion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReligion;
	protected JMenuItem jMenuItemDuplicarReligion;
	protected JMenuItem jMenuItemNuevoRelacionesReligion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReligion;
	protected JMenuItem jMenuItemCopiarReligion;
	protected JMenuItem jMenuItemVerFormReligion;
	protected JMenuItem jMenuItemGuardarCambiosTablaReligion;
	protected JMenuItem jMenuItemCerrarReligion;
	protected JMenuItem jMenuItemDetalleCerrarReligion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReligion;
	protected JMenuItem jMenuItemDetalleMostarOcultarReligion;
	
	protected JMenuItem jMenuItemRecargarInformacionReligion;
	protected JMenuItem jMenuItemProcesarInformacionReligion;
	protected JMenuItem jMenuItemAnterioresReligion;
	protected JMenuItem jMenuItemSiguientesReligion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReligion;
	protected JMenuItem jMenuItemAbrirOrderByReligion;
	protected JMenuItem jMenuItemMostrarOcultarReligion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReligion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReligion;
	protected JCheckBox jCheckBoxSeleccionadosReligion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReligion;
	protected JCheckBox jCheckBoxConGraficoReporteReligion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReligion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReligion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReligion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReligion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReligion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReligion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReligion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReligion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReligion;
	protected JTextField jTextFieldValorCampoGeneralReligion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReligion;
	//public JList<Reporte> jListColumnasSelectReporteReligion;
	//public JScrollPane jScrollColumnasSelectReporteReligion;
	
	//public JLabel jLabelRelacionesSelectReporteReligion;
	//public JList<Reporte> jListRelacionesSelectReporteReligion;
	//public JScrollPane jScrollRelacionesSelectReporteReligion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReligion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReligion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReligion;
	//public JLabel jLabelTiposArchivoReporteDinamicoReligion;
	
		
	//public JLabel jLabelArchivoImportacionReligion;	
	//public JLabel jLabelPathArchivoImportacionReligion;
	//protected JTextField jTextFieldPathArchivoImportacionReligion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReligion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReligion;
	
	//public JLabel jLabelColumnaCategoriaValorReligion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReligion;
	
	//public JLabel jLabelColumnasValoresGraficoReligion;
	//public JList<Reporte> jListColumnasValoresGraficoReligion;
	//public JScrollPane jScrollColumnasValoresGraficoReligion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReligion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReligion;	
	
	
	
	
	
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
	public ReligionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReligion)	{
		this.jButtonRecargarInformacionReligion = jButtonRecargarInformacionReligion;
	}
	
	public JButton getjButtonProcesarInformacionReligion() {
		return this.jButtonProcesarInformacionReligion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReligion)	{
		this.jButtonProcesarInformacionReligion = jButtonProcesarInformacionReligion;
	}
	
	
	public JButton getjButtonRecargarInformacionReligion() {
		return this.jButtonRecargarInformacionReligion;
	}
	
	
	public List<Religion> getreligions() {
		return this.religions;
	}

	public void setreligions(List<Religion> religions) {
		this.religions = religions;
	}
	
	public List<Religion> getreligionsAux() {
		return this.religionsAux;
	}

	public void setreligionsAux(List<Religion> religionsAux) {
		this.religionsAux = religionsAux;
	}
	
	public List<Religion> getreligionsEliminados() {
		return this.religionsEliminados;
	}

	public void setReligionsEliminados(List<Religion> religionsEliminados) {
		this.religionsEliminados = religionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReligion() {
		return jComboBoxTiposSeleccionarReligion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReligion(
			JComboBox jComboBoxTiposSeleccionarReligion) {
		this.jComboBoxTiposSeleccionarReligion = jComboBoxTiposSeleccionarReligion;
	}
	
	public void setBorderResaltarTiposSeleccionarReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReligion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReligion() {
		return jTextFieldValorCampoGeneralReligion;
	}

	public void setjTextFieldValorCampoGeneralReligion(
			JTextField jTextFieldValorCampoGeneralReligion) {
		this.jTextFieldValorCampoGeneralReligion = jTextFieldValorCampoGeneralReligion;
	}

	public void setBorderResaltarValorCampoGeneralReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReligion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReligion() {
		return this.jCheckBoxSeleccionarTodosReligion;
	}

	public void setjCheckBoxSeleccionarTodosReligion(
			JCheckBox jCheckBoxSeleccionarTodosReligion) {
		this.jCheckBoxSeleccionarTodosReligion = jCheckBoxSeleccionarTodosReligion;
	}

	public void setBorderResaltarSeleccionarTodosReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReligion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReligion() {
		return this.jCheckBoxSeleccionadosReligion;
	}

	public void setjCheckBoxSeleccionadosReligion(
			JCheckBox jCheckBoxSeleccionadosReligion) {
		this.jCheckBoxSeleccionadosReligion = jCheckBoxSeleccionadosReligion;
	}
	
	public void setBorderResaltarSeleccionadosReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReligion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReligion() {
		return this.jComboBoxTiposArchivosReportesReligion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReligion(
			JComboBox jComboBoxTiposArchivosReportesReligion) {
		this.jComboBoxTiposArchivosReportesReligion = jComboBoxTiposArchivosReportesReligion;
	}

	public void setBorderResaltarTiposArchivosReportesReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReligion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReligion() {
		return this.jComboBoxTiposReportesReligion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReligion(
			JComboBox jComboBoxTiposReportesReligion) {
		this.jComboBoxTiposReportesReligion = jComboBoxTiposReportesReligion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReligion() {
	//	return jComboBoxTiposReportesDinamicoReligion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReligion(
	//		JComboBox jComboBoxTiposReportesDinamicoReligion) {
	//	this.jComboBoxTiposReportesDinamicoReligion = jComboBoxTiposReportesDinamicoReligion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReligion() {
	//	return jComboBoxTiposArchivosReportesDinamicoReligion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReligion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReligion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReligion = jComboBoxTiposArchivosReportesDinamicoReligion;
	//}
	
	public void setBorderResaltarTiposReportesReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReligion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReligion() {
		return this.jComboBoxTiposGraficosReportesReligion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReligion(
			JComboBox jComboBoxTiposGraficosReportesReligion) {
		this.jComboBoxTiposGraficosReportesReligion = jComboBoxTiposGraficosReportesReligion;
	}
	
	public void setBorderResaltarTiposGraficosReportesReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReligion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReligion() {
		return this.jComboBoxTiposPaginacionReligion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReligion(
			JComboBox jComboBoxTiposPaginacionReligion) {
		this.jComboBoxTiposPaginacionReligion = jComboBoxTiposPaginacionReligion;
	}
	
	public void setBorderResaltarTiposPaginacionReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReligion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReligion() {
		return this.jComboBoxTiposRelacionesReligion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReligion() {
		return this.jComboBoxTiposAccionesReligion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReligion(
			JComboBox jComboBoxTiposRelacionesReligion) {
		this.jComboBoxTiposRelacionesReligion = jComboBoxTiposRelacionesReligion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReligion(
			JComboBox jComboBoxTiposAccionesReligion) {
		this.jComboBoxTiposAccionesReligion = jComboBoxTiposAccionesReligion;
	}
	
	public void setBorderResaltarTiposRelacionesReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReligion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReligion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReligion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReligion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReligion() {
	//	return jCheckBoxConGraficoDinamicoReligion;
	//}

	//public void setjCheckBoxConGraficoDinamicoReligion(
	//		JCheckBox jCheckBoxConGraficoDinamicoReligion) {
	//	this.jCheckBoxConGraficoDinamicoReligion = jCheckBoxConGraficoDinamicoReligion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReligion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReligion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReligion .setBorder(borderResaltar);		
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
		this.religionSessionBean=new ReligionSessionBean();
		
		this.religionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.religionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.religionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReligionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReligionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReligionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReligionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReligionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Religion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
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
		
		ReligionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReligion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReligion,this.jTtoolBarReligion,
							"nuevo","nuevo","Nuevo"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReligion,this.jTtoolBarReligion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReligion,this.jTtoolBarReligion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReligion,this.jTtoolBarReligion,
							"duplicar","duplicar","Duplicar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReligion,this.jTtoolBarReligion,
							"copiar","copiar","Copiar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReligion,this.jTtoolBarReligion,
							"ver_form","ver_form","Ver"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReligion,this.jTtoolBarReligion,
							"recargar","recargar","Recargar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReligion,this.jTtoolBarReligion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReligion,this.jTtoolBarReligion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReligion,this.jTtoolBarReligion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReligion,this.jTtoolBarReligion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReligion,this.jTtoolBarReligion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReligion,this.jTtoolBarReligion,
							"cerrar","cerrar","Salir"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReligion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReligion;
			
				this.jButtonProcesarInformacionToolBarReligion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReligion;
				
		//protected JButton jButtonModificarToolBarReligion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReligion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReligion=new JMenuMe("General");
		this.jmenuArchivoReligion=new JMenuMe("Archivo");
		this.jmenuAccionesReligion=new JMenuMe("Acciones");
		this.jmenuDatosReligion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReligion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReligion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReligion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReligion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReligion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReligion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReligion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReligion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReligion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReligion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReligion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReligion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReligion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReligion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReligion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReligion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReligion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReligion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReligion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReligion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReligion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReligion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReligion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReligion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReligion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReligion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReligion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReligion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReligion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReligion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReligion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReligion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReligion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReligion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReligion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReligion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReligion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReligion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReligion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReligion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReligion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReligion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReligion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReligion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReligion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReligion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReligion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReligion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReligion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReligion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReligion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReligion.add(this.jMenuItemCerrarReligion);
			
			this.jmenuAccionesReligion.add(this.jMenuItemNuevoReligion);
			this.jmenuAccionesReligion.add(this.jMenuItemNuevoGuardarCambiosReligion);
			this.jmenuAccionesReligion.add(this.jMenuItemNuevoRelacionesReligion);
			this.jmenuAccionesReligion.add(this.jMenuItemGuardarCambiosTablaReligion);		
			this.jmenuAccionesReligion.add(this.jMenuItemDuplicarReligion);		
			this.jmenuAccionesReligion.add(this.jMenuItemCopiarReligion);		
			this.jmenuAccionesReligion.add(this.jMenuItemVerFormReligion);		
			
			this.jmenuDatosReligion.add(this.jMenuItemRecargarInformacionReligion);				
			this.jmenuDatosReligion.add(this.jMenuItemAnterioresReligion);				
			this.jmenuDatosReligion.add(this.jMenuItemSiguientesReligion);				
			this.jmenuDatosReligion.add(this.jMenuItemAbrirOrderByReligion);				
			this.jmenuDatosReligion.add(this.jMenuItemMostrarOcultarReligion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReligion.add(this.jMenuItemGuardarCambiosReligion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReligion.add(this.jmenuArchivoReligion);		
			this.jmenuBarReligion.add(this.jmenuAccionesReligion);		
			this.jmenuBarReligion.add(this.jmenuDatosReligion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReligion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReligion() {
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
			//this.jInternalFrameDetalleReligion = new ReligionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Religion DATOS");
			this.jInternalFrameDetalleFormReligion = new ReligionDetalleFormJInternalFrame(jDesktopPane,this.religionSessionBean.getConGuardarRelaciones(),this.religionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReligion = null;//new ReligionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReligion= new GridBagLayout();
		
		
		this.jTableDatosReligion = new JTableMe();      
		
		String sToolTipReligion="";
		sToolTipReligion=ReligionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReligion+="(Nomina.Religion)";
		}
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			sToolTipReligion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReligion.setToolTipText(sToolTipReligion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReligion);
		this.jTableDatosReligion.setAutoCreateRowSorter(true);
		this.jTableDatosReligion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReligion.setRowSelectionAllowed(true);
		this.jTableDatosReligion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReligion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReligion = new JButtonMe();
		this.jButtonDuplicarReligion = new JButtonMe();
		this.jButtonCopiarReligion = new JButtonMe();
		this.jButtonVerFormReligion = new JButtonMe();
		this.jButtonNuevoRelacionesReligion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReligion = new JButtonMe();
		this.jButtonCerrarReligion = new JButtonMe();
		
		this.jScrollPanelDatosReligion = new JScrollPane();   
        this.jScrollPanelDatosGeneralReligion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Religion";
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones" + this.sPath));
		} else {
			this.jScrollPanelDatosReligion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReligion.setToolTipText("Acciones");
        this.jPanelAccionesReligion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReligion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReligion=new ReporteDinamicoJInternalFrame(ReligionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReligion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReligion=new ImportacionJInternalFrame(ReligionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReligion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReligion = new JButtonMe();
		
		this.jButtonAbrirOrderByReligion.setText("Orden");
		this.jButtonAbrirOrderByReligion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReligion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReligion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReligion,false,this);
			
			//this.cargarOrderByReligion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReligion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReligion,true,this);
			
			//this.cargarOrderByReligion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReligion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosReligion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosReligion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosReligion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReligion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReligion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReligion.setText("Nuevo");
		this.jButtonDuplicarReligion.setText("Duplicar");
		this.jButtonCopiarReligion.setText("Copiar");
		this.jButtonVerFormReligion.setText("Ver");
		this.jButtonNuevoRelacionesReligion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReligion.setText("Guardar");
		this.jButtonCerrarReligion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReligion,"nuevo_button","Nuevo",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReligion,"duplicar_button","Duplicar",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReligion,"copiar_button","Copiar",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReligion,"ver_form","Ver",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReligion,"nuevorelaciones_button","Nuevo Rel",this.religionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReligion,"guardarcambiostabla_button","Guardar",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReligion,"cerrar_button","Salir",this.religionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReligion.setToolTipText("Nuevo"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReligion.setToolTipText("Duplicar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReligion.setToolTipText("Copiar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReligion.setToolTipText("Ver"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReligion.setToolTipText("Nuevo Rel"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReligion.setToolTipText("Guardar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReligion.setToolTipText("Salir"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReligion";
		inputMap = this.jButtonNuevoReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReligion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReligion"));
		
		//DUPLICAR
		sMapKey = "DuplicarReligion";
		inputMap = this.jButtonDuplicarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReligion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReligion"));
		
		//COPIAR
		sMapKey = "CopiarReligion";
		inputMap = this.jButtonCopiarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReligion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReligion"));
		
		//VEr FORM
		sMapKey = "VerFormReligion";
		inputMap = this.jButtonVerFormReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReligion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReligion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReligion";
		inputMap = this.jButtonNuevoRelacionesReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReligion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReligion";
		inputMap = this.jButtonModificarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReligion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReligion";
		inputMap = this.jButtonCerrarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReligion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReligion";
		inputMap = this.jButtonGuardarCambiosTablaReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReligion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Religion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Religion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Religion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Religion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Religion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReligion.setName("jPanelParametrosReportesReligion"); 
		
		this.jPanelParametrosReportesAccionesReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReligion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReligion.setName("jPanelParametrosReportesAccionesReligion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReligion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReligion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReligion = new JButtonMe();
		this.jButtonRecargarInformacionReligion.setText("Recargar");
		this.jButtonRecargarInformacionReligion.setToolTipText("Recargar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReligion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReligion = new JButtonMe();
		this.jButtonProcesarInformacionReligion.setText("Procesar");
		this.jButtonProcesarInformacionReligion.setToolTipText("Procesar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReligion.setVisible(false);
			
		this.jButtonProcesarInformacionReligion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReligion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReligion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReligion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReligion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReligion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReligion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReligion.setText("TIPO");       
		this.jComboBoxTiposReportesReligion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReligion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReligion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReligion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReligion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReligion.setText("Paginacion");
		this.jComboBoxTiposPaginacionReligion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReligion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReligion.setText("Accion");
		this.jComboBoxTiposRelacionesReligion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReligion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReligion.setText("Accion");
		this.jComboBoxTiposAccionesReligion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReligion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReligion.setText("Accion");
		this.jComboBoxTiposSeleccionarReligion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReligion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReligion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReligion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReligion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReligion = new JLabelMe();
		
		this.jLabelAccionesReligion.setText("Acciones");		
		this.jLabelAccionesReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReligion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReligion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReligion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReligion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReligion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReligion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReligion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReligion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReligion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReligion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReligion.setText("Graf.");
		this.jCheckBoxConGraficoReporteReligion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReligion = new JButtonMe();
		//this.jButtonAnterioresReligion.setText("<<");
        this.jButtonAnterioresReligion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReligion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReligion = new JButtonMe();
		//this.jButtonSiguientesReligion.setText(">>");
        this.jButtonSiguientesReligion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReligion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReligion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReligion.setText("Nue");
        this.jButtonNuevoGuardarCambiosReligion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReligion,"nuevoguardarcambios_button","Nue",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReligion";
		inputMap = this.jButtonNuevoGuardarCambiosReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReligion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReligion";
		inputMap = this.jButtonRecargarInformacionReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReligion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReligion";
		inputMap = this.jButtonSiguientesReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReligion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReligion";
		inputMap = this.jButtonAnterioresReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReligion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReligion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReligion.setMinimumSize(new Dimension(this.getWidth(),ReligionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReligionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReligion.setMaximumSize(new Dimension(this.getWidth(),ReligionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReligionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReligion.setPreferredSize(new Dimension(this.getWidth(),ReligionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReligionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReligion = new GridBagLayout();

			this.jPanelPaginacionReligion.setLayout(gridaBagLayoutPaginacionReligion);						
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 0;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReligion.add(this.jButtonAnterioresReligion, this.gridBagConstraintsReligion);
					
						
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReligion.gridy = 0;
			
			this.jPanelPaginacionReligion.add(this.jButtonNuevoGuardarCambiosReligion, this.gridBagConstraintsReligion);
						
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReligion.gridy = 0;
			this.jPanelPaginacionReligion.add(this.jButtonSiguientesReligion, this.gridBagConstraintsReligion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 1;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReligion.add(this.jButtonNuevoReligion, this.gridBagConstraintsReligion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsReligion = new GridBagConstraints();
				this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReligion.gridy = 1;
				this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionReligion.add(this.jButtonNuevoRelacionesReligion, this.gridBagConstraintsReligion);
			}
			
			
			if(!this.religionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReligion = new GridBagConstraints();
				this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReligion.gridy = 1;
				this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReligion.add(this.jButtonGuardarCambiosTablaReligion, this.gridBagConstraintsReligion);
			}
			
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 1;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReligion.add(this.jButtonDuplicarReligion, this.gridBagConstraintsReligion);
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 1;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReligion.add(this.jButtonCopiarReligion, this.gridBagConstraintsReligion);
		
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 1;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReligion.add(this.jButtonVerFormReligion, this.gridBagConstraintsReligion);
		
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 1;
			this.gridBagConstraintsReligion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReligion.add(this.jButtonCerrarReligion, this.gridBagConstraintsReligion);
		
		
		
		this.jButtonRecargarInformacionReligion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReligion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReligion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReligion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReligion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReligion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReligion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReligion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReligion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReligion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReligion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReligion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReligion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReligion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReligion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReligion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReligion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReligion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReligion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReligion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReligion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReligion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReligion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReligion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReligion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReligion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReligion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReligion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReligion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReligion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReligion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReligion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReligion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReligion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReligion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReligion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReligion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReligion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReligion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReligion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Religion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Religion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Religion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Religion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReligion.setLayout(gridaBagParametrosReportesReligion);
			this.jPanelParametrosReportesAccionesReligion.setLayout(gridaBagParametrosReportesAccionesReligion);
			
			
			this.jPanelParametrosAuxiliar1Religion.setLayout(gridaBagParametrosAuxiliar1Religion);
			this.jPanelParametrosAuxiliar2Religion.setLayout(gridaBagParametrosAuxiliar2Religion);
			this.jPanelParametrosAuxiliar3Religion.setLayout(gridaBagParametrosAuxiliar3Religion);
			this.jPanelParametrosAuxiliar4Religion.setLayout(gridaBagParametrosAuxiliar4Religion);
			//this.jPanelParametrosAuxiliar5Religion.setLayout(gridaBagParametrosAuxiliar2Religion);			
			
			
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReligion.add(this.jButtonRecargarInformacionReligion, this.gridBagConstraintsReligion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Religion.add(this.jComboBoxTiposPaginacionReligion, this.gridBagConstraintsReligion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Religion.add(this.jCheckBoxConAltoMaximoTablaReligion, this.gridBagConstraintsReligion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Religion.add(this.jComboBoxTiposArchivosReportesReligion, this.gridBagConstraintsReligion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReligion.add(this.jPanelParametrosAuxiliar1Religion, this.gridBagConstraintsReligion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Religion.add(this.jComboBoxTiposReportesReligion, this.gridBagConstraintsReligion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReligion.add(this.jPanelParametrosAuxiliar4Religion, this.gridBagConstraintsReligion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReligion.add(this.jComboBoxTiposReportesReligion, this.gridBagConstraintsReligion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReligion.add(this.jCheckBoxGenerarReporteReligion, this.gridBagConstraintsReligion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReligion.add(this.jPanelParametrosAuxiliar2Religion, this.gridBagConstraintsReligion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReligion.add(this.jLabelAccionesReligion, this.gridBagConstraintsReligion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReligion = new GridBagConstraints();
				this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReligion.add(this.jButtonAbrirOrderByReligion, this.gridBagConstraintsReligion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReligion.add(this.jComboBoxTiposSeleccionarReligion, this.gridBagConstraintsReligion);			
			
			
			/*
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReligion.add(this.jCheckBoxSeleccionarTodosReligion, this.gridBagConstraintsReligion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Religion.add(this.jCheckBoxSeleccionarTodosReligion, this.gridBagConstraintsReligion);															
				
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReligion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Religion.add(this.jCheckBoxSeleccionadosReligion, this.gridBagConstraintsReligion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReligion.add(this.jPanelParametrosAuxiliar3Religion, this.gridBagConstraintsReligion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReligion.add(this.jComboBoxTiposRelacionesReligion, this.gridBagConstraintsReligion);
				
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReligion.add(this.jComboBoxTiposAccionesReligion, this.gridBagConstraintsReligion);
	
				
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReligion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReligion.add(this.jTextFieldValorCampoGeneralReligion, this.gridBagConstraintsReligion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReligion = new GridBagLayout();

			this.jScrollPanelDatosReligion.setLayout(gridaBagLayoutDatosReligion);
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = 0;
			this.gridBagConstraintsReligion.gridx = 0;
			
			this.jScrollPanelDatosReligion.add(this.jTableDatosReligion, this.gridBagConstraintsReligion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReligion.setViewportView(this.jTableDatosReligion);
		this.jTableDatosReligion.setFillsViewportHeight(true);
		this.jTableDatosReligion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReligion= new GridBagLayout();
		this.jPanelAccionesReligion.setLayout(gridaBagLayoutAccionesReligion);
		
		
		/*	
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = 0;
		this.gridBagConstraintsReligion.gridx = 0;
			
		this.jPanelAccionesReligion.add(this.jButtonNuevoReligion, this.gridBagConstraintsReligion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReligion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReligion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.religionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReligion = new GridBagConstraints();						
			this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReligion.gridx = 0;		
			//this.gridBagConstraintsReligion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReligion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReligion, this.gridBagConstraintsReligion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReligion.gridx = 0;		
		//this.gridBagConstraintsReligion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReligion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReligion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReligion, this.gridBagConstraintsReligion);								
		
		
		/*
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReligion, this.gridBagConstraintsReligion);
		*/		
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReligion.gridx =0;
		this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReligion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReligion, this.gridBagConstraintsReligion);
				
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReligion, this.gridBagConstraintsReligion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ReligionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReligion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReligion = new GridBagLayout();
			this.jPanelBusquedasParametrosReligion.setLayout(gridaBagLayoutBusquedasParametrosReligion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReligion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReligion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReligion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReligion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReligion, this.gridBagConstraintsReligion);
			
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReligion, this.gridBagConstraintsReligion);
		
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReligion, this.gridBagConstraintsReligion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReligion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReligion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReligion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReligion.setName("jPanelReporteDinamicoReligion"); 
		
		this.jPanelReporteDinamicoReligion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReligion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReligion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReligion.setLayout(gridaBagLayoutReporteDinamicoReligion);
		
		
		this.jInternalFrameReporteDinamicoReligion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReligion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReligion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReligion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReligion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReligion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReligion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReligion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReligion.setResizable(true);
	    this.jInternalFrameReporteDinamicoReligion.setClosable(true);
	    this.jInternalFrameReporteDinamicoReligion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReligion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReligion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReligion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReligion = new JLabelMe();

		this.jLabelColumnasSelectReporteReligion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReligion.add(this.jLabelColumnasSelectReporteReligion, this.gridBagConstraintsReligion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReligion = new JList<Reporte>();
		this.jListColumnasSelectReporteReligion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReligion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReligion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReligion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReligion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReligion=new JScrollPane(this.jListColumnasSelectReporteReligion);
			
			this.jScrollColumnasSelectReporteReligion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReligion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReligion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReligion.add(this.jListColumnasSelectReporteReligion, this.gridBagConstraintsReligion);
		this.jPanelReporteDinamicoReligion.add(this.jScrollColumnasSelectReporteReligion, this.gridBagConstraintsReligion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReligion = new JLabelMe();

		this.jLabelRelacionesSelectReporteReligion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReligion.add(this.jLabelRelacionesSelectReporteReligion, this.gridBagConstraintsReligion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReligion = new JList<Reporte>();
		this.jListRelacionesSelectReporteReligion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReligion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReligion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReligion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReligion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReligion=new JScrollPane(this.jListRelacionesSelectReporteReligion);
			
			this.jScrollRelacionesSelectReporteReligion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReligion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReligion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReligion.add(this.jListRelacionesSelectReporteReligion, this.gridBagConstraintsReligion);
		this.jPanelReporteDinamicoReligion.add(this.jScrollRelacionesSelectReporteReligion, this.gridBagConstraintsReligion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoReligion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReligion = new JComboBoxMe();
		this.jListColumnasValoresGraficoReligion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReligion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReligion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReligion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReligion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReligion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReligion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReligion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReligion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReligion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReligion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReligion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReligion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReligion.add(this.jLabelGenerarExcelReporteDinamicoReligion, this.gridBagConstraintsReligion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReligion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReligion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReligion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReligion.setToolTipText("Generar EXCEL"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReligion = new GridBagConstraints();
		//this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReligion.add(this.jButtonGenerarExcelReporteDinamicoReligion, this.gridBagConstraintsReligion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReligion.add(this.jComboBoxTiposReportesDinamicoReligion, this.gridBagConstraintsReligion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReligion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReligion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReligion.add(this.jLabelTiposArchivoReporteDinamicoReligion, this.gridBagConstraintsReligion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReligion.add(this.jComboBoxTiposArchivosReportesDinamicoReligion, this.gridBagConstraintsReligion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReligion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReligion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReligion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReligion.setToolTipText("Generar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReligion.add(this.jButtonGenerarReporteDinamicoReligion, this.gridBagConstraintsReligion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReligion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReligion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReligion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReligion.setToolTipText("Cancelar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReligion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReligion.add(this.jButtonCerrarReporteDinamicoReligion, this.gridBagConstraintsReligion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReligion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReligion= new JScrollPane(jPanelReporteDinamicoReligion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReligion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReligion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReligion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReligion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReligion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReligion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReligion);
		this.jInternalFrameReporteDinamicoReligion.getContentPane().add(this.jScrollPanelReporteDinamicoReligion, this.gridBagConstraintsReligion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReligion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReligion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReligion.setName("jPanelImportacionReligion"); 
		
		this.jPanelImportacionReligion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReligion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReligion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReligion.setLayout(gridaBagLayoutImportacionReligion);
		
		
		this.jInternalFrameImportacionReligion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReligion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReligion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReligion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReligion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReligion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReligion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReligion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReligion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReligion.setResizable(true);
	    this.jInternalFrameImportacionReligion.setClosable(true);
	    this.jInternalFrameImportacionReligion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReligion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReligion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReligion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReligion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReligion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReligion.setResizable(true);
	    this.jInternalFrameImportacionReligion.setClosable(true);
	    this.jInternalFrameImportacionReligion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReligion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReligion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReligion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReligion = new JLabelMe();

		this.jLabelArchivoImportacionReligion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;		
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReligion.add(this.jLabelArchivoImportacionReligion, this.gridBagConstraintsReligion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReligion = new JFileChooser();		
		this.jFileChooserImportacionReligion.setToolTipText("ESCOGER ARCHIVO"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReligion = new JButtonMe();
		this.jButtonAbrirImportacionReligion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReligion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReligion.setToolTipText("Generar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReligion.add(this.jButtonAbrirImportacionReligion, this.gridBagConstraintsReligion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReligion = new JLabelMe();

		this.jLabelPathArchivoImportacionReligion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;		
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReligion.add(this.jLabelPathArchivoImportacionReligion, this.gridBagConstraintsReligion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReligion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReligion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReligion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReligion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReligion.add(this.jTextFieldPathArchivoImportacionReligion, this.gridBagConstraintsReligion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReligion = new JButtonMe();
		this.jButtonGenerarImportacionReligion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReligion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReligion.setToolTipText("Generar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReligion.add(this.jButtonGenerarImportacionReligion, this.gridBagConstraintsReligion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReligion = new JButtonMe();
		this.jButtonCerrarImportacionReligion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReligion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReligion.setToolTipText("Cancelar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = iPosYImportacion;
		this.gridBagConstraintsReligion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReligion.add(this.jButtonCerrarImportacionReligion, this.gridBagConstraintsReligion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReligion = new GridBagLayout();
		
		this.jScrollPanelImportacionReligion= new JScrollPane(jPanelImportacionReligion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iPosYImportacion;
		this.gridBagConstraintsReligion.gridx =iPosXImportacion;
		this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReligion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReligion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReligion);
		this.jInternalFrameImportacionReligion.getContentPane().add(this.jScrollPanelImportacionReligion, this.gridBagConstraintsReligion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReligion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReligion = new JButtonMe();
			this.jButtonAbrirOrderByReligion.setText("Orden");
			this.jButtonAbrirOrderByReligion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReligion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReligion";
			inputMap = this.jButtonAbrirOrderByReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReligion"));
		
		
			GridBagLayout gridaBagLayoutOrderByReligion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReligion.setName("jPanelOrderByReligion"); 
			
			this.jPanelOrderByReligion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReligion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReligion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReligion.setLayout(gridaBagLayoutOrderByReligion);
			
			
			this.jTableDatosReligionOrderBy = new JTableMe();        
			this.jTableDatosReligionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReligionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReligionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReligionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReligionOrderBy.setViewportView(this.jTableDatosReligionOrderBy);
			this.jTableDatosReligionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReligionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReligion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReligion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReligion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReligion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReligion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReligion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReligion.setTitle("Orden");
			this.jInternalFrameOrderByReligion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReligion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReligion.setResizable(true);
			this.jInternalFrameOrderByReligion.setClosable(true);
			this.jInternalFrameOrderByReligion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReligion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReligion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReligion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReligion.gridx =iPosXOrderBy;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReligion.ipady =150;
				
			this.jPanelOrderByReligion.add(jScrollPanelDatosReligionOrderBy, this.gridBagConstraintsReligion);//this.jTableDatosReligionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReligion = new JButtonMe();
			this.jButtonCerrarOrderByReligion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReligion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReligion.setToolTipText("Cancelar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReligion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReligion.add(this.jButtonCerrarOrderByReligion, this.gridBagConstraintsReligion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReligion = new GridBagLayout();
			
			this.jScrollPanelOrderByReligion= new JScrollPane(jPanelOrderByReligion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy =iPosYOrderBy;
			this.gridBagConstraintsReligion.gridx =iPosXOrderBy;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReligion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReligion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReligion);
			
			this.jInternalFrameOrderByReligion.getContentPane().add(this.jScrollPanelOrderByReligion, this.gridBagConstraintsReligion);			
		
		} else {
			this.jButtonAbrirOrderByReligion = new JButtonMe();
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
			&& this.religionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReligion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReligion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReligion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReligion.getRowHeight();//ReligionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReligionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReligion.isSelected()) {
					iHeightTable=ReligionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReligionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReligionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReligionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReligion.isSelected()) {
					iHeightTable=ReligionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReligionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReligionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReligion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReligion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReligion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReligion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReligion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReligion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReligion!=null && this.jInternalFrameOrderByReligion.getjTableDatosOrderBy()!=null) {
			//if(!this.religionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReligion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReligion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReligion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReligion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReligion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReligion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=religionLogic.getReligions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=religions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Religion> TraerReligionBeans(List<Religion> religions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Religion religion:religions) {
					
				if(!(ReligionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReligionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					religion.setsDetalleGeneralEntityReporte(ReligionConstantesFunciones.getReligionDescripcion(religion));
										
						
					
					

					if(religion.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{religion.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(religion.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//religion.setsDetalleGeneralEntityReporte(religion.getsDetalleGeneralEntityReporte());
										
				}
				
				//religionbeans.add(religionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return religions;
    }
	//PARA REPORTES FIN
}
