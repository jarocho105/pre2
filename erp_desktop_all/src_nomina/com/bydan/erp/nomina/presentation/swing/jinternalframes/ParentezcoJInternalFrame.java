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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.ParentezcoConstantesFunciones;

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
public class ParentezcoJInternalFrame extends ParentezcoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParentezco;
	
	protected JMenuBar jmenuBarParentezco;
	
	protected JMenu jmenuParentezco;
	protected JMenu jmenuDatosParentezco;
	protected JMenu jmenuArchivoParentezco;
	protected JMenu jmenuAccionesParentezco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParentezco;	
	protected GridBagConstraints gridBagConstraintsParentezco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParentezcoDetalleFormJInternalFrame jInternalFrameDetalleFormParentezco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParentezco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParentezco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParentezcoSessionBean parentezcoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Parentezco> parentezcos;		
	public List<Parentezco> parentezcosEliminados;	
	public List<Parentezco> parentezcosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParentezco;		
	protected JButton jButtonAbrirOrderByParentezco;
	
	
	//protected JPanel jPanelOrderByParentezco;
	//public JScrollPane jScrollPanelOrderByParentezco;	
	//protected JButton jButtonCerrarOrderByParentezco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParentezcoLogic parentezcoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParentezco;
	public JScrollPane jScrollPanelDatosEdicionParentezco;
	public JScrollPane jScrollPanelDatosGeneralParentezco;
    
	
	
	//public JScrollPane jScrollPanelDatosParentezcoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParentezco;
	//public JScrollPane jScrollPanelImportacionParentezco;
	
	
	
	protected JPanel jPanelAccionesParentezco;
	
    protected JPanel jPanelPaginacionParentezco;
    protected JPanel jPanelParametrosReportesParentezco;
	protected JPanel jPanelParametrosReportesAccionesParentezco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Parentezco;
	protected JPanel jPanelParametrosAuxiliar2Parentezco;
	protected JPanel jPanelParametrosAuxiliar3Parentezco;
	protected JPanel jPanelParametrosAuxiliar4Parentezco;
	//protected JPanel jPanelParametrosAuxiliar5Parentezco;
	
	
	
	//protected JPanel jPanelReporteDinamicoParentezco;
	//protected JPanel jPanelImportacionParentezco;
	
	
	public JTable jTableDatosParentezco;
	
	
	
	//public JTable jTableDatosParentezcoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParentezco;
	protected JButton jButtonDuplicarParentezco;
	protected JButton jButtonCopiarParentezco;
	protected JButton jButtonVerFormParentezco;
	protected JButton jButtonNuevoRelacionesParentezco;
	protected JButton jButtonModificarParentezco;
	
    protected JButton jButtonGuardarCambiosTablaParentezco;
	protected JButton jButtonCerrarParentezco;
	
	
	protected JButton jButtonRecargarInformacionParentezco;
	protected JButton jButtonProcesarInformacionParentezco;
	
	
	protected JButton jButtonAnterioresParentezco;
	protected JButton jButtonSiguientesParentezco;
	protected JButton jButtonNuevoGuardarCambiosParentezco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParentezco;
	//protected JButton jButtonCerrarReporteDinamicoParentezco;
	//protected JButton jButtonGenerarExcelReporteDinamicoParentezco;	
	
	
	
	//protected JButton jButtonAbrirImportacionParentezco;
	//protected JButton jButtonGenerarImportacionParentezco;
	//protected JButton jButtonCerrarImportacionParentezco;
	//protected JFileChooser jFileChooserImportacionParentezco;
	//protected File fileImportacionParentezco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParentezco;
	protected JButton jButtonDuplicarToolBarParentezco;
	protected JButton jButtonNuevoRelacionesToolBarParentezco;
	
	
	public JButton jButtonGuardarCambiosToolBarParentezco;
	protected JButton jButtonCopiarToolBarParentezco;
	protected JButton jButtonVerFormToolBarParentezco;
	public JButton jButtonGuardarCambiosTablaToolBarParentezco;
	protected JButton jButtonMostrarOcultarTablaToolBarParentezco;
	protected JButton jButtonCerrarToolBarParentezco;
	
	protected JButton jButtonRecargarInformacionToolBarParentezco;
	protected JButton jButtonProcesarInformacionToolBarParentezco;
	protected JButton jButtonAnterioresToolBarParentezco;
	protected JButton jButtonSiguientesToolBarParentezco;
	protected JButton jButtonNuevoGuardarCambiosToolBarParentezco;
	protected JButton jButtonAbrirOrderByToolBarParentezco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParentezco;
	protected JMenuItem jMenuItemDuplicarParentezco;
	protected JMenuItem jMenuItemNuevoRelacionesParentezco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParentezco;
	protected JMenuItem jMenuItemCopiarParentezco;
	protected JMenuItem jMenuItemVerFormParentezco;
	protected JMenuItem jMenuItemGuardarCambiosTablaParentezco;
	protected JMenuItem jMenuItemCerrarParentezco;
	protected JMenuItem jMenuItemDetalleCerrarParentezco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParentezco;
	protected JMenuItem jMenuItemDetalleMostarOcultarParentezco;
	
	protected JMenuItem jMenuItemRecargarInformacionParentezco;
	protected JMenuItem jMenuItemProcesarInformacionParentezco;
	protected JMenuItem jMenuItemAnterioresParentezco;
	protected JMenuItem jMenuItemSiguientesParentezco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParentezco;
	protected JMenuItem jMenuItemAbrirOrderByParentezco;
	protected JMenuItem jMenuItemMostrarOcultarParentezco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParentezco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParentezco;
	protected JCheckBox jCheckBoxSeleccionadosParentezco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParentezco;
	protected JCheckBox jCheckBoxConGraficoReporteParentezco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParentezco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParentezco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParentezco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParentezco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParentezco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParentezco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParentezco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParentezco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParentezco;
	protected JTextField jTextFieldValorCampoGeneralParentezco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParentezco;
	//public JList<Reporte> jListColumnasSelectReporteParentezco;
	//public JScrollPane jScrollColumnasSelectReporteParentezco;
	
	//public JLabel jLabelRelacionesSelectReporteParentezco;
	//public JList<Reporte> jListRelacionesSelectReporteParentezco;
	//public JScrollPane jScrollRelacionesSelectReporteParentezco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParentezco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParentezco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParentezco;
	//public JLabel jLabelTiposArchivoReporteDinamicoParentezco;
	
		
	//public JLabel jLabelArchivoImportacionParentezco;	
	//public JLabel jLabelPathArchivoImportacionParentezco;
	//protected JTextField jTextFieldPathArchivoImportacionParentezco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParentezco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParentezco;
	
	//public JLabel jLabelColumnaCategoriaValorParentezco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParentezco;
	
	//public JLabel jLabelColumnasValoresGraficoParentezco;
	//public JList<Reporte> jListColumnasValoresGraficoParentezco;
	//public JScrollPane jScrollColumnasValoresGraficoParentezco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParentezco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParentezco;	
	
	
	
	
	
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
	public ParentezcoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParentezco)	{
		this.jButtonRecargarInformacionParentezco = jButtonRecargarInformacionParentezco;
	}
	
	public JButton getjButtonProcesarInformacionParentezco() {
		return this.jButtonProcesarInformacionParentezco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParentezco)	{
		this.jButtonProcesarInformacionParentezco = jButtonProcesarInformacionParentezco;
	}
	
	
	public JButton getjButtonRecargarInformacionParentezco() {
		return this.jButtonRecargarInformacionParentezco;
	}
	
	
	public List<Parentezco> getparentezcos() {
		return this.parentezcos;
	}

	public void setparentezcos(List<Parentezco> parentezcos) {
		this.parentezcos = parentezcos;
	}
	
	public List<Parentezco> getparentezcosAux() {
		return this.parentezcosAux;
	}

	public void setparentezcosAux(List<Parentezco> parentezcosAux) {
		this.parentezcosAux = parentezcosAux;
	}
	
	public List<Parentezco> getparentezcosEliminados() {
		return this.parentezcosEliminados;
	}

	public void setParentezcosEliminados(List<Parentezco> parentezcosEliminados) {
		this.parentezcosEliminados = parentezcosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParentezco() {
		return jComboBoxTiposSeleccionarParentezco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParentezco(
			JComboBox jComboBoxTiposSeleccionarParentezco) {
		this.jComboBoxTiposSeleccionarParentezco = jComboBoxTiposSeleccionarParentezco;
	}
	
	public void setBorderResaltarTiposSeleccionarParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParentezco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParentezco() {
		return jTextFieldValorCampoGeneralParentezco;
	}

	public void setjTextFieldValorCampoGeneralParentezco(
			JTextField jTextFieldValorCampoGeneralParentezco) {
		this.jTextFieldValorCampoGeneralParentezco = jTextFieldValorCampoGeneralParentezco;
	}

	public void setBorderResaltarValorCampoGeneralParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParentezco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParentezco() {
		return this.jCheckBoxSeleccionarTodosParentezco;
	}

	public void setjCheckBoxSeleccionarTodosParentezco(
			JCheckBox jCheckBoxSeleccionarTodosParentezco) {
		this.jCheckBoxSeleccionarTodosParentezco = jCheckBoxSeleccionarTodosParentezco;
	}

	public void setBorderResaltarSeleccionarTodosParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParentezco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParentezco() {
		return this.jCheckBoxSeleccionadosParentezco;
	}

	public void setjCheckBoxSeleccionadosParentezco(
			JCheckBox jCheckBoxSeleccionadosParentezco) {
		this.jCheckBoxSeleccionadosParentezco = jCheckBoxSeleccionadosParentezco;
	}
	
	public void setBorderResaltarSeleccionadosParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParentezco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParentezco() {
		return this.jComboBoxTiposArchivosReportesParentezco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParentezco(
			JComboBox jComboBoxTiposArchivosReportesParentezco) {
		this.jComboBoxTiposArchivosReportesParentezco = jComboBoxTiposArchivosReportesParentezco;
	}

	public void setBorderResaltarTiposArchivosReportesParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParentezco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParentezco() {
		return this.jComboBoxTiposReportesParentezco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParentezco(
			JComboBox jComboBoxTiposReportesParentezco) {
		this.jComboBoxTiposReportesParentezco = jComboBoxTiposReportesParentezco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParentezco() {
	//	return jComboBoxTiposReportesDinamicoParentezco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParentezco(
	//		JComboBox jComboBoxTiposReportesDinamicoParentezco) {
	//	this.jComboBoxTiposReportesDinamicoParentezco = jComboBoxTiposReportesDinamicoParentezco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParentezco() {
	//	return jComboBoxTiposArchivosReportesDinamicoParentezco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParentezco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParentezco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParentezco = jComboBoxTiposArchivosReportesDinamicoParentezco;
	//}
	
	public void setBorderResaltarTiposReportesParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParentezco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParentezco() {
		return this.jComboBoxTiposGraficosReportesParentezco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParentezco(
			JComboBox jComboBoxTiposGraficosReportesParentezco) {
		this.jComboBoxTiposGraficosReportesParentezco = jComboBoxTiposGraficosReportesParentezco;
	}
	
	public void setBorderResaltarTiposGraficosReportesParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParentezco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParentezco() {
		return this.jComboBoxTiposPaginacionParentezco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParentezco(
			JComboBox jComboBoxTiposPaginacionParentezco) {
		this.jComboBoxTiposPaginacionParentezco = jComboBoxTiposPaginacionParentezco;
	}
	
	public void setBorderResaltarTiposPaginacionParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParentezco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParentezco() {
		return this.jComboBoxTiposRelacionesParentezco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParentezco() {
		return this.jComboBoxTiposAccionesParentezco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParentezco(
			JComboBox jComboBoxTiposRelacionesParentezco) {
		this.jComboBoxTiposRelacionesParentezco = jComboBoxTiposRelacionesParentezco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParentezco(
			JComboBox jComboBoxTiposAccionesParentezco) {
		this.jComboBoxTiposAccionesParentezco = jComboBoxTiposAccionesParentezco;
	}
	
	public void setBorderResaltarTiposRelacionesParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParentezco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParentezco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParentezco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParentezco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParentezco() {
	//	return jCheckBoxConGraficoDinamicoParentezco;
	//}

	//public void setjCheckBoxConGraficoDinamicoParentezco(
	//		JCheckBox jCheckBoxConGraficoDinamicoParentezco) {
	//	this.jCheckBoxConGraficoDinamicoParentezco = jCheckBoxConGraficoDinamicoParentezco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParentezco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParentezco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParentezco .setBorder(borderResaltar);		
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
		this.parentezcoSessionBean=new ParentezcoSessionBean();
		
		this.parentezcoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parentezcoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parentezcoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParentezcoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parentezco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParentezcoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParentezco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParentezco,this.jTtoolBarParentezco,
							"nuevo","nuevo","Nuevo"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParentezco,this.jTtoolBarParentezco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParentezco,this.jTtoolBarParentezco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParentezco,this.jTtoolBarParentezco,
							"duplicar","duplicar","Duplicar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParentezco,this.jTtoolBarParentezco,
							"copiar","copiar","Copiar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParentezco,this.jTtoolBarParentezco,
							"ver_form","ver_form","Ver"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParentezco,this.jTtoolBarParentezco,
							"recargar","recargar","Recargar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParentezco,this.jTtoolBarParentezco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParentezco,this.jTtoolBarParentezco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParentezco,this.jTtoolBarParentezco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParentezco,this.jTtoolBarParentezco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParentezco,this.jTtoolBarParentezco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParentezco,this.jTtoolBarParentezco,
							"cerrar","cerrar","Salir"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParentezco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParentezco;
			
				this.jButtonProcesarInformacionToolBarParentezco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParentezco;
				
		//protected JButton jButtonModificarToolBarParentezco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParentezco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParentezco=new JMenuMe("General");
		this.jmenuArchivoParentezco=new JMenuMe("Archivo");
		this.jmenuAccionesParentezco=new JMenuMe("Acciones");
		this.jmenuDatosParentezco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParentezco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParentezco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParentezco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParentezco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParentezco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParentezco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParentezco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParentezco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParentezco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParentezco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParentezco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParentezco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParentezco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParentezco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParentezco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParentezco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParentezco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParentezco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParentezco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParentezco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParentezco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParentezco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParentezco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParentezco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParentezco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParentezco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParentezco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParentezco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParentezco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParentezco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParentezco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParentezco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParentezco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParentezco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParentezco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParentezco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParentezco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParentezco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParentezco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParentezco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParentezco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParentezco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParentezco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParentezco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParentezco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParentezco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParentezco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParentezco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParentezco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParentezco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParentezco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParentezco.add(this.jMenuItemCerrarParentezco);
			
			this.jmenuAccionesParentezco.add(this.jMenuItemNuevoParentezco);
			this.jmenuAccionesParentezco.add(this.jMenuItemNuevoGuardarCambiosParentezco);
			this.jmenuAccionesParentezco.add(this.jMenuItemNuevoRelacionesParentezco);
			this.jmenuAccionesParentezco.add(this.jMenuItemGuardarCambiosTablaParentezco);		
			this.jmenuAccionesParentezco.add(this.jMenuItemDuplicarParentezco);		
			this.jmenuAccionesParentezco.add(this.jMenuItemCopiarParentezco);		
			this.jmenuAccionesParentezco.add(this.jMenuItemVerFormParentezco);		
			
			this.jmenuDatosParentezco.add(this.jMenuItemRecargarInformacionParentezco);				
			this.jmenuDatosParentezco.add(this.jMenuItemAnterioresParentezco);				
			this.jmenuDatosParentezco.add(this.jMenuItemSiguientesParentezco);				
			this.jmenuDatosParentezco.add(this.jMenuItemAbrirOrderByParentezco);				
			this.jmenuDatosParentezco.add(this.jMenuItemMostrarOcultarParentezco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParentezco.add(this.jMenuItemGuardarCambiosParentezco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParentezco.add(this.jmenuArchivoParentezco);		
			this.jmenuBarParentezco.add(this.jmenuAccionesParentezco);		
			this.jmenuBarParentezco.add(this.jmenuDatosParentezco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParentezco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParentezco() {
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
			//this.jInternalFrameDetalleParentezco = new ParentezcoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parentezco DATOS");
			this.jInternalFrameDetalleFormParentezco = new ParentezcoDetalleFormJInternalFrame(jDesktopPane,this.parentezcoSessionBean.getConGuardarRelaciones(),this.parentezcoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParentezco = null;//new ParentezcoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParentezco= new GridBagLayout();
		
		
		this.jTableDatosParentezco = new JTableMe();      
		
		String sToolTipParentezco="";
		sToolTipParentezco=ParentezcoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParentezco+="(Nomina.Parentezco)";
		}
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParentezco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParentezco.setToolTipText(sToolTipParentezco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParentezco);
		this.jTableDatosParentezco.setAutoCreateRowSorter(true);
		this.jTableDatosParentezco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParentezco.setRowSelectionAllowed(true);
		this.jTableDatosParentezco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParentezco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParentezco = new JButtonMe();
		this.jButtonDuplicarParentezco = new JButtonMe();
		this.jButtonCopiarParentezco = new JButtonMe();
		this.jButtonVerFormParentezco = new JButtonMe();
		this.jButtonNuevoRelacionesParentezco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParentezco = new JButtonMe();
		this.jButtonCerrarParentezco = new JButtonMe();
		
		this.jScrollPanelDatosParentezco = new JScrollPane();   
        this.jScrollPanelDatosGeneralParentezco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parentezco";
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos" + this.sPath));
		} else {
			this.jScrollPanelDatosParentezco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParentezco.setToolTipText("Acciones");
        this.jPanelAccionesParentezco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParentezco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParentezco=new ReporteDinamicoJInternalFrame(ParentezcoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParentezco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParentezco=new ImportacionJInternalFrame(ParentezcoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParentezco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParentezco = new JButtonMe();
		
		this.jButtonAbrirOrderByParentezco.setText("Orden");
		this.jButtonAbrirOrderByParentezco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParentezco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParentezco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParentezco,false,this);
			
			//this.cargarOrderByParentezco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParentezco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParentezco,true,this);
			
			//this.cargarOrderByParentezco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParentezco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosParentezco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosParentezco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosParentezco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParentezco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParentezco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParentezco.setText("Nuevo");
		this.jButtonDuplicarParentezco.setText("Duplicar");
		this.jButtonCopiarParentezco.setText("Copiar");
		this.jButtonVerFormParentezco.setText("Ver");
		this.jButtonNuevoRelacionesParentezco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParentezco.setText("Guardar");
		this.jButtonCerrarParentezco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParentezco,"nuevo_button","Nuevo",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParentezco,"duplicar_button","Duplicar",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParentezco,"copiar_button","Copiar",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParentezco,"ver_form","Ver",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParentezco,"nuevorelaciones_button","Nuevo Rel",this.parentezcoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParentezco,"guardarcambiostabla_button","Guardar",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParentezco,"cerrar_button","Salir",this.parentezcoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParentezco.setToolTipText("Nuevo"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParentezco.setToolTipText("Duplicar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParentezco.setToolTipText("Copiar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParentezco.setToolTipText("Ver"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParentezco.setToolTipText("Nuevo Rel"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParentezco.setToolTipText("Guardar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParentezco.setToolTipText("Salir"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParentezco";
		inputMap = this.jButtonNuevoParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParentezco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParentezco"));
		
		//DUPLICAR
		sMapKey = "DuplicarParentezco";
		inputMap = this.jButtonDuplicarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParentezco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParentezco"));
		
		//COPIAR
		sMapKey = "CopiarParentezco";
		inputMap = this.jButtonCopiarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParentezco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParentezco"));
		
		//VEr FORM
		sMapKey = "VerFormParentezco";
		inputMap = this.jButtonVerFormParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParentezco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParentezco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParentezco";
		inputMap = this.jButtonNuevoRelacionesParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParentezco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParentezco";
		inputMap = this.jButtonModificarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParentezco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParentezco";
		inputMap = this.jButtonCerrarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParentezco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParentezco";
		inputMap = this.jButtonGuardarCambiosTablaParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParentezco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Parentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Parentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Parentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Parentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Parentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParentezco.setName("jPanelParametrosReportesParentezco"); 
		
		this.jPanelParametrosReportesAccionesParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParentezco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParentezco.setName("jPanelParametrosReportesAccionesParentezco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParentezco = new JButtonMe();
		this.jButtonRecargarInformacionParentezco.setText("Recargar");
		this.jButtonRecargarInformacionParentezco.setToolTipText("Recargar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParentezco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParentezco = new JButtonMe();
		this.jButtonProcesarInformacionParentezco.setText("Procesar");
		this.jButtonProcesarInformacionParentezco.setToolTipText("Procesar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParentezco.setVisible(false);
			
		this.jButtonProcesarInformacionParentezco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParentezco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParentezco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParentezco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParentezco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParentezco.setText("TIPO");       
		this.jComboBoxTiposReportesParentezco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParentezco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParentezco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParentezco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParentezco.setText("Paginacion");
		this.jComboBoxTiposPaginacionParentezco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParentezco.setText("Accion");
		this.jComboBoxTiposRelacionesParentezco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParentezco.setText("Accion");
		this.jComboBoxTiposAccionesParentezco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParentezco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParentezco.setText("Accion");
		this.jComboBoxTiposSeleccionarParentezco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParentezco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParentezco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParentezco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParentezco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParentezco = new JLabelMe();
		
		this.jLabelAccionesParentezco.setText("Acciones");		
		this.jLabelAccionesParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParentezco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParentezco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParentezco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParentezco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParentezco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParentezco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParentezco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParentezco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParentezco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParentezco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParentezco.setText("Graf.");
		this.jCheckBoxConGraficoReporteParentezco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParentezco = new JButtonMe();
		//this.jButtonAnterioresParentezco.setText("<<");
        this.jButtonAnterioresParentezco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParentezco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParentezco = new JButtonMe();
		//this.jButtonSiguientesParentezco.setText(">>");
        this.jButtonSiguientesParentezco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParentezco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParentezco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParentezco.setText("Nue");
        this.jButtonNuevoGuardarCambiosParentezco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParentezco,"nuevoguardarcambios_button","Nue",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParentezco";
		inputMap = this.jButtonNuevoGuardarCambiosParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParentezco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParentezco";
		inputMap = this.jButtonRecargarInformacionParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParentezco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParentezco";
		inputMap = this.jButtonSiguientesParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParentezco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParentezco";
		inputMap = this.jButtonAnterioresParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParentezco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParentezco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParentezco.setMinimumSize(new Dimension(this.getWidth(),ParentezcoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParentezcoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParentezco.setMaximumSize(new Dimension(this.getWidth(),ParentezcoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParentezcoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParentezco.setPreferredSize(new Dimension(this.getWidth(),ParentezcoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParentezcoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParentezco = new GridBagLayout();

			this.jPanelPaginacionParentezco.setLayout(gridaBagLayoutPaginacionParentezco);						
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 0;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParentezco.add(this.jButtonAnterioresParentezco, this.gridBagConstraintsParentezco);
					
						
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParentezco.gridy = 0;
			
			this.jPanelPaginacionParentezco.add(this.jButtonNuevoGuardarCambiosParentezco, this.gridBagConstraintsParentezco);
						
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParentezco.gridy = 0;
			this.jPanelPaginacionParentezco.add(this.jButtonSiguientesParentezco, this.gridBagConstraintsParentezco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 1;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParentezco.add(this.jButtonNuevoParentezco, this.gridBagConstraintsParentezco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsParentezco = new GridBagConstraints();
				this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParentezco.gridy = 1;
				this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionParentezco.add(this.jButtonNuevoRelacionesParentezco, this.gridBagConstraintsParentezco);
			}
			
			
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParentezco = new GridBagConstraints();
				this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParentezco.gridy = 1;
				this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParentezco.add(this.jButtonGuardarCambiosTablaParentezco, this.gridBagConstraintsParentezco);
			}
			
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 1;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParentezco.add(this.jButtonDuplicarParentezco, this.gridBagConstraintsParentezco);
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 1;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParentezco.add(this.jButtonCopiarParentezco, this.gridBagConstraintsParentezco);
		
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 1;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParentezco.add(this.jButtonVerFormParentezco, this.gridBagConstraintsParentezco);
		
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 1;
			this.gridBagConstraintsParentezco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParentezco.add(this.jButtonCerrarParentezco, this.gridBagConstraintsParentezco);
		
		
		
		this.jButtonRecargarInformacionParentezco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParentezco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParentezco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParentezco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParentezco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParentezco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParentezco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParentezco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParentezco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParentezco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParentezco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParentezco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParentezco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParentezco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParentezco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParentezco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParentezco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParentezco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParentezco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParentezco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParentezco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParentezco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParentezco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParentezco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParentezco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParentezco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParentezco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParentezco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParentezco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParentezco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParentezco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParentezco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParentezco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParentezco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParentezco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParentezco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParentezco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParentezco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParentezco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParentezco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Parentezco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Parentezco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Parentezco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Parentezco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParentezco.setLayout(gridaBagParametrosReportesParentezco);
			this.jPanelParametrosReportesAccionesParentezco.setLayout(gridaBagParametrosReportesAccionesParentezco);
			
			
			this.jPanelParametrosAuxiliar1Parentezco.setLayout(gridaBagParametrosAuxiliar1Parentezco);
			this.jPanelParametrosAuxiliar2Parentezco.setLayout(gridaBagParametrosAuxiliar2Parentezco);
			this.jPanelParametrosAuxiliar3Parentezco.setLayout(gridaBagParametrosAuxiliar3Parentezco);
			this.jPanelParametrosAuxiliar4Parentezco.setLayout(gridaBagParametrosAuxiliar4Parentezco);
			//this.jPanelParametrosAuxiliar5Parentezco.setLayout(gridaBagParametrosAuxiliar2Parentezco);			
			
			
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParentezco.add(this.jButtonRecargarInformacionParentezco, this.gridBagConstraintsParentezco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parentezco.add(this.jComboBoxTiposPaginacionParentezco, this.gridBagConstraintsParentezco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parentezco.add(this.jCheckBoxConAltoMaximoTablaParentezco, this.gridBagConstraintsParentezco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parentezco.add(this.jComboBoxTiposArchivosReportesParentezco, this.gridBagConstraintsParentezco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParentezco.add(this.jPanelParametrosAuxiliar1Parentezco, this.gridBagConstraintsParentezco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Parentezco.add(this.jComboBoxTiposReportesParentezco, this.gridBagConstraintsParentezco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParentezco.add(this.jPanelParametrosAuxiliar4Parentezco, this.gridBagConstraintsParentezco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParentezco.add(this.jComboBoxTiposReportesParentezco, this.gridBagConstraintsParentezco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParentezco.add(this.jCheckBoxGenerarReporteParentezco, this.gridBagConstraintsParentezco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParentezco.add(this.jPanelParametrosAuxiliar2Parentezco, this.gridBagConstraintsParentezco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParentezco.add(this.jLabelAccionesParentezco, this.gridBagConstraintsParentezco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParentezco = new GridBagConstraints();
				this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParentezco.add(this.jButtonAbrirOrderByParentezco, this.gridBagConstraintsParentezco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParentezco.add(this.jComboBoxTiposSeleccionarParentezco, this.gridBagConstraintsParentezco);			
			
			
			/*
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParentezco.add(this.jCheckBoxSeleccionarTodosParentezco, this.gridBagConstraintsParentezco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Parentezco.add(this.jCheckBoxSeleccionarTodosParentezco, this.gridBagConstraintsParentezco);															
				
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParentezco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Parentezco.add(this.jCheckBoxSeleccionadosParentezco, this.gridBagConstraintsParentezco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParentezco.add(this.jPanelParametrosAuxiliar3Parentezco, this.gridBagConstraintsParentezco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParentezco.add(this.jComboBoxTiposRelacionesParentezco, this.gridBagConstraintsParentezco);
				
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParentezco.add(this.jComboBoxTiposAccionesParentezco, this.gridBagConstraintsParentezco);
	
				
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParentezco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParentezco.add(this.jTextFieldValorCampoGeneralParentezco, this.gridBagConstraintsParentezco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParentezco = new GridBagLayout();

			this.jScrollPanelDatosParentezco.setLayout(gridaBagLayoutDatosParentezco);
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = 0;
			this.gridBagConstraintsParentezco.gridx = 0;
			
			this.jScrollPanelDatosParentezco.add(this.jTableDatosParentezco, this.gridBagConstraintsParentezco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParentezco.setViewportView(this.jTableDatosParentezco);
		this.jTableDatosParentezco.setFillsViewportHeight(true);
		this.jTableDatosParentezco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParentezco= new GridBagLayout();
		this.jPanelAccionesParentezco.setLayout(gridaBagLayoutAccionesParentezco);
		
		
		/*	
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = 0;
		this.gridBagConstraintsParentezco.gridx = 0;
			
		this.jPanelAccionesParentezco.add(this.jButtonNuevoParentezco, this.gridBagConstraintsParentezco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParentezco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParentezco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParentezco = new GridBagConstraints();						
			this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParentezco.gridx = 0;		
			//this.gridBagConstraintsParentezco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParentezco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParentezco, this.gridBagConstraintsParentezco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParentezco.gridx = 0;		
		//this.gridBagConstraintsParentezco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParentezco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParentezco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParentezco, this.gridBagConstraintsParentezco);								
		
		
		/*
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParentezco, this.gridBagConstraintsParentezco);
		*/		
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParentezco.gridx =0;
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParentezco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParentezco, this.gridBagConstraintsParentezco);
				
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParentezco, this.gridBagConstraintsParentezco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParentezco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParentezco = new GridBagLayout();
			this.jPanelBusquedasParametrosParentezco.setLayout(gridaBagLayoutBusquedasParametrosParentezco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParentezco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParentezco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParentezco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParentezco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParentezco, this.gridBagConstraintsParentezco);
			
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParentezco, this.gridBagConstraintsParentezco);
		
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParentezco, this.gridBagConstraintsParentezco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParentezco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParentezco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParentezco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParentezco.setName("jPanelReporteDinamicoParentezco"); 
		
		this.jPanelReporteDinamicoParentezco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParentezco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParentezco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParentezco.setLayout(gridaBagLayoutReporteDinamicoParentezco);
		
		
		this.jInternalFrameReporteDinamicoParentezco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParentezco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParentezco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParentezco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParentezco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParentezco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParentezco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParentezco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParentezco.setResizable(true);
	    this.jInternalFrameReporteDinamicoParentezco.setClosable(true);
	    this.jInternalFrameReporteDinamicoParentezco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParentezco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParentezco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParentezco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParentezco = new JLabelMe();

		this.jLabelColumnasSelectReporteParentezco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParentezco.add(this.jLabelColumnasSelectReporteParentezco, this.gridBagConstraintsParentezco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParentezco = new JList<Reporte>();
		this.jListColumnasSelectReporteParentezco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParentezco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParentezco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParentezco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParentezco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParentezco=new JScrollPane(this.jListColumnasSelectReporteParentezco);
			
			this.jScrollColumnasSelectReporteParentezco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParentezco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParentezco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParentezco.add(this.jListColumnasSelectReporteParentezco, this.gridBagConstraintsParentezco);
		this.jPanelReporteDinamicoParentezco.add(this.jScrollColumnasSelectReporteParentezco, this.gridBagConstraintsParentezco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParentezco = new JLabelMe();

		this.jLabelRelacionesSelectReporteParentezco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParentezco.add(this.jLabelRelacionesSelectReporteParentezco, this.gridBagConstraintsParentezco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParentezco = new JList<Reporte>();
		this.jListRelacionesSelectReporteParentezco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParentezco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParentezco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParentezco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParentezco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParentezco=new JScrollPane(this.jListRelacionesSelectReporteParentezco);
			
			this.jScrollRelacionesSelectReporteParentezco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParentezco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParentezco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParentezco.add(this.jListRelacionesSelectReporteParentezco, this.gridBagConstraintsParentezco);
		this.jPanelReporteDinamicoParentezco.add(this.jScrollRelacionesSelectReporteParentezco, this.gridBagConstraintsParentezco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoParentezco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParentezco = new JComboBoxMe();
		this.jListColumnasValoresGraficoParentezco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParentezco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParentezco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParentezco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParentezco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParentezco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParentezco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParentezco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParentezco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParentezco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParentezco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParentezco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParentezco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParentezco.add(this.jLabelGenerarExcelReporteDinamicoParentezco, this.gridBagConstraintsParentezco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParentezco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParentezco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParentezco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParentezco.setToolTipText("Generar EXCEL"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParentezco = new GridBagConstraints();
		//this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParentezco.add(this.jButtonGenerarExcelReporteDinamicoParentezco, this.gridBagConstraintsParentezco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParentezco.add(this.jComboBoxTiposReportesDinamicoParentezco, this.gridBagConstraintsParentezco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParentezco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParentezco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParentezco.add(this.jLabelTiposArchivoReporteDinamicoParentezco, this.gridBagConstraintsParentezco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParentezco.add(this.jComboBoxTiposArchivosReportesDinamicoParentezco, this.gridBagConstraintsParentezco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParentezco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParentezco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParentezco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParentezco.setToolTipText("Generar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParentezco.add(this.jButtonGenerarReporteDinamicoParentezco, this.gridBagConstraintsParentezco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParentezco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParentezco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParentezco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParentezco.setToolTipText("Cancelar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParentezco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParentezco.add(this.jButtonCerrarReporteDinamicoParentezco, this.gridBagConstraintsParentezco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParentezco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParentezco= new JScrollPane(jPanelReporteDinamicoParentezco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParentezco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParentezco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParentezco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParentezco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParentezco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParentezco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParentezco);
		this.jInternalFrameReporteDinamicoParentezco.getContentPane().add(this.jScrollPanelReporteDinamicoParentezco, this.gridBagConstraintsParentezco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParentezco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParentezco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParentezco.setName("jPanelImportacionParentezco"); 
		
		this.jPanelImportacionParentezco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParentezco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParentezco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParentezco.setLayout(gridaBagLayoutImportacionParentezco);
		
		
		this.jInternalFrameImportacionParentezco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParentezco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParentezco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParentezco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParentezco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParentezco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParentezco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParentezco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParentezco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParentezco.setResizable(true);
	    this.jInternalFrameImportacionParentezco.setClosable(true);
	    this.jInternalFrameImportacionParentezco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParentezco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParentezco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParentezco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParentezco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParentezco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParentezco.setResizable(true);
	    this.jInternalFrameImportacionParentezco.setClosable(true);
	    this.jInternalFrameImportacionParentezco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParentezco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParentezco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParentezco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParentezco = new JLabelMe();

		this.jLabelArchivoImportacionParentezco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;		
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParentezco.add(this.jLabelArchivoImportacionParentezco, this.gridBagConstraintsParentezco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParentezco = new JFileChooser();		
		this.jFileChooserImportacionParentezco.setToolTipText("ESCOGER ARCHIVO"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParentezco = new JButtonMe();
		this.jButtonAbrirImportacionParentezco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParentezco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParentezco.setToolTipText("Generar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParentezco.add(this.jButtonAbrirImportacionParentezco, this.gridBagConstraintsParentezco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParentezco = new JLabelMe();

		this.jLabelPathArchivoImportacionParentezco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;		
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParentezco.add(this.jLabelPathArchivoImportacionParentezco, this.gridBagConstraintsParentezco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParentezco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParentezco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParentezco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParentezco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParentezco.add(this.jTextFieldPathArchivoImportacionParentezco, this.gridBagConstraintsParentezco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParentezco = new JButtonMe();
		this.jButtonGenerarImportacionParentezco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParentezco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParentezco.setToolTipText("Generar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParentezco.add(this.jButtonGenerarImportacionParentezco, this.gridBagConstraintsParentezco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParentezco = new JButtonMe();
		this.jButtonCerrarImportacionParentezco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParentezco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParentezco.setToolTipText("Cancelar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = iPosYImportacion;
		this.gridBagConstraintsParentezco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParentezco.add(this.jButtonCerrarImportacionParentezco, this.gridBagConstraintsParentezco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParentezco = new GridBagLayout();
		
		this.jScrollPanelImportacionParentezco= new JScrollPane(jPanelImportacionParentezco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iPosYImportacion;
		this.gridBagConstraintsParentezco.gridx =iPosXImportacion;
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParentezco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParentezco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParentezco);
		this.jInternalFrameImportacionParentezco.getContentPane().add(this.jScrollPanelImportacionParentezco, this.gridBagConstraintsParentezco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParentezco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParentezco = new JButtonMe();
			this.jButtonAbrirOrderByParentezco.setText("Orden");
			this.jButtonAbrirOrderByParentezco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParentezco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParentezco";
			inputMap = this.jButtonAbrirOrderByParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParentezco"));
		
		
			GridBagLayout gridaBagLayoutOrderByParentezco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParentezco.setName("jPanelOrderByParentezco"); 
			
			this.jPanelOrderByParentezco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParentezco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParentezco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParentezco.setLayout(gridaBagLayoutOrderByParentezco);
			
			
			this.jTableDatosParentezcoOrderBy = new JTableMe();        
			this.jTableDatosParentezcoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParentezcoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParentezcoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParentezcoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParentezcoOrderBy.setViewportView(this.jTableDatosParentezcoOrderBy);
			this.jTableDatosParentezcoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParentezcoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParentezco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParentezco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParentezco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParentezco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParentezco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParentezco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParentezco.setTitle("Orden");
			this.jInternalFrameOrderByParentezco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParentezco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParentezco.setResizable(true);
			this.jInternalFrameOrderByParentezco.setClosable(true);
			this.jInternalFrameOrderByParentezco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParentezco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParentezco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParentezco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParentezco.gridx =iPosXOrderBy;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParentezco.ipady =150;
				
			this.jPanelOrderByParentezco.add(jScrollPanelDatosParentezcoOrderBy, this.gridBagConstraintsParentezco);//this.jTableDatosParentezcoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParentezco = new JButtonMe();
			this.jButtonCerrarOrderByParentezco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParentezco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParentezco.setToolTipText("Cancelar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParentezco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParentezco.add(this.jButtonCerrarOrderByParentezco, this.gridBagConstraintsParentezco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParentezco = new GridBagLayout();
			
			this.jScrollPanelOrderByParentezco= new JScrollPane(jPanelOrderByParentezco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy =iPosYOrderBy;
			this.gridBagConstraintsParentezco.gridx =iPosXOrderBy;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParentezco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParentezco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParentezco);
			
			this.jInternalFrameOrderByParentezco.getContentPane().add(this.jScrollPanelOrderByParentezco, this.gridBagConstraintsParentezco);			
		
		} else {
			this.jButtonAbrirOrderByParentezco = new JButtonMe();
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
			&& this.parentezcoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParentezco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParentezco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParentezco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParentezco.getRowHeight();//ParentezcoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParentezcoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParentezco.isSelected()) {
					iHeightTable=ParentezcoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParentezcoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParentezcoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParentezcoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParentezco.isSelected()) {
					iHeightTable=ParentezcoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParentezcoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParentezcoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParentezco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParentezco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParentezco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParentezco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParentezco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParentezco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParentezco!=null && this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy()!=null) {
			//if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParentezco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParentezco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParentezco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParentezco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParentezco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParentezco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parentezcoLogic.getParentezcos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parentezcos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Parentezco> TraerParentezcoBeans(List<Parentezco> parentezcos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Parentezco parentezco:parentezcos) {
					
				if(!(ParentezcoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParentezcoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parentezco.setsDetalleGeneralEntityReporte(ParentezcoConstantesFunciones.getParentezcoDescripcion(parentezco));
										
						
					
					

					if(parentezco.getReferencias()!=null && Funciones.existeClass(classes,Referencia.class)) {
						try{parentezco.setreferenciasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaJInternalFrame.TraerReferenciaBeans(parentezco.getReferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//parentezco.setsDetalleGeneralEntityReporte(parentezco.getsDetalleGeneralEntityReporte());
										
				}
				
				//parentezcobeans.add(parentezcobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parentezcos;
    }
	//PARA REPORTES FIN
}
