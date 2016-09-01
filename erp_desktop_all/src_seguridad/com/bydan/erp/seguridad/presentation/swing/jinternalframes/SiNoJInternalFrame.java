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
import com.bydan.erp.seguridad.util.SiNoConstantesFunciones;

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
public class SiNoJInternalFrame extends SiNoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSiNo;
	
	protected JMenuBar jmenuBarSiNo;
	
	protected JMenu jmenuSiNo;
	protected JMenu jmenuDatosSiNo;
	protected JMenu jmenuArchivoSiNo;
	protected JMenu jmenuAccionesSiNo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSiNo;	
	protected GridBagConstraints gridBagConstraintsSiNo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SiNoDetalleFormJInternalFrame jInternalFrameDetalleFormSiNo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSiNo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSiNo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SiNoSessionBean sinoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<SiNo> sinos;		
	public List<SiNo> sinosEliminados;	
	public List<SiNo> sinosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySiNo;		
	protected JButton jButtonAbrirOrderBySiNo;
	
	
	//protected JPanel jPanelOrderBySiNo;
	//public JScrollPane jScrollPanelOrderBySiNo;	
	//protected JButton jButtonCerrarOrderBySiNo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SiNoLogic sinoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSiNo;
	public JScrollPane jScrollPanelDatosEdicionSiNo;
	public JScrollPane jScrollPanelDatosGeneralSiNo;
    
	
	
	//public JScrollPane jScrollPanelDatosSiNoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSiNo;
	//public JScrollPane jScrollPanelImportacionSiNo;
	
	
	
	protected JPanel jPanelAccionesSiNo;
	
    protected JPanel jPanelPaginacionSiNo;
    protected JPanel jPanelParametrosReportesSiNo;
	protected JPanel jPanelParametrosReportesAccionesSiNo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SiNo;
	protected JPanel jPanelParametrosAuxiliar2SiNo;
	protected JPanel jPanelParametrosAuxiliar3SiNo;
	protected JPanel jPanelParametrosAuxiliar4SiNo;
	//protected JPanel jPanelParametrosAuxiliar5SiNo;
	
	
	
	//protected JPanel jPanelReporteDinamicoSiNo;
	//protected JPanel jPanelImportacionSiNo;
	
	
	public JTable jTableDatosSiNo;
	
	
	
	//public JTable jTableDatosSiNoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSiNo;
	protected JButton jButtonDuplicarSiNo;
	protected JButton jButtonCopiarSiNo;
	protected JButton jButtonVerFormSiNo;
	protected JButton jButtonNuevoRelacionesSiNo;
	protected JButton jButtonModificarSiNo;
	
    protected JButton jButtonGuardarCambiosTablaSiNo;
	protected JButton jButtonCerrarSiNo;
	
	
	protected JButton jButtonRecargarInformacionSiNo;
	protected JButton jButtonProcesarInformacionSiNo;
	
	
	protected JButton jButtonAnterioresSiNo;
	protected JButton jButtonSiguientesSiNo;
	protected JButton jButtonNuevoGuardarCambiosSiNo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSiNo;
	//protected JButton jButtonCerrarReporteDinamicoSiNo;
	//protected JButton jButtonGenerarExcelReporteDinamicoSiNo;	
	
	
	
	//protected JButton jButtonAbrirImportacionSiNo;
	//protected JButton jButtonGenerarImportacionSiNo;
	//protected JButton jButtonCerrarImportacionSiNo;
	//protected JFileChooser jFileChooserImportacionSiNo;
	//protected File fileImportacionSiNo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSiNo;
	protected JButton jButtonDuplicarToolBarSiNo;
	protected JButton jButtonNuevoRelacionesToolBarSiNo;
	
	
	public JButton jButtonGuardarCambiosToolBarSiNo;
	protected JButton jButtonCopiarToolBarSiNo;
	protected JButton jButtonVerFormToolBarSiNo;
	public JButton jButtonGuardarCambiosTablaToolBarSiNo;
	protected JButton jButtonMostrarOcultarTablaToolBarSiNo;
	protected JButton jButtonCerrarToolBarSiNo;
	
	protected JButton jButtonRecargarInformacionToolBarSiNo;
	protected JButton jButtonProcesarInformacionToolBarSiNo;
	protected JButton jButtonAnterioresToolBarSiNo;
	protected JButton jButtonSiguientesToolBarSiNo;
	protected JButton jButtonNuevoGuardarCambiosToolBarSiNo;
	protected JButton jButtonAbrirOrderByToolBarSiNo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSiNo;
	protected JMenuItem jMenuItemDuplicarSiNo;
	protected JMenuItem jMenuItemNuevoRelacionesSiNo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSiNo;
	protected JMenuItem jMenuItemCopiarSiNo;
	protected JMenuItem jMenuItemVerFormSiNo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSiNo;
	protected JMenuItem jMenuItemCerrarSiNo;
	protected JMenuItem jMenuItemDetalleCerrarSiNo;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySiNo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSiNo;
	
	protected JMenuItem jMenuItemRecargarInformacionSiNo;
	protected JMenuItem jMenuItemProcesarInformacionSiNo;
	protected JMenuItem jMenuItemAnterioresSiNo;
	protected JMenuItem jMenuItemSiguientesSiNo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSiNo;
	protected JMenuItem jMenuItemAbrirOrderBySiNo;
	protected JMenuItem jMenuItemMostrarOcultarSiNo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSiNo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSiNo;
	protected JCheckBox jCheckBoxSeleccionadosSiNo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSiNo;
	protected JCheckBox jCheckBoxConGraficoReporteSiNo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSiNo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSiNo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSiNo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSiNo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSiNo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSiNo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSiNo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSiNo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSiNo;
	protected JTextField jTextFieldValorCampoGeneralSiNo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSiNo;
	//public JList<Reporte> jListColumnasSelectReporteSiNo;
	//public JScrollPane jScrollColumnasSelectReporteSiNo;
	
	//public JLabel jLabelRelacionesSelectReporteSiNo;
	//public JList<Reporte> jListRelacionesSelectReporteSiNo;
	//public JScrollPane jScrollRelacionesSelectReporteSiNo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSiNo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSiNo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSiNo;
	//public JLabel jLabelTiposArchivoReporteDinamicoSiNo;
	
		
	//public JLabel jLabelArchivoImportacionSiNo;	
	//public JLabel jLabelPathArchivoImportacionSiNo;
	//protected JTextField jTextFieldPathArchivoImportacionSiNo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSiNo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSiNo;
	
	//public JLabel jLabelColumnaCategoriaValorSiNo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSiNo;
	
	//public JLabel jLabelColumnasValoresGraficoSiNo;
	//public JList<Reporte> jListColumnasValoresGraficoSiNo;
	//public JScrollPane jScrollColumnasValoresGraficoSiNo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSiNo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSiNo;	
	
	
	
	
	
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
	public SiNoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSiNo)	{
		this.jButtonRecargarInformacionSiNo = jButtonRecargarInformacionSiNo;
	}
	
	public JButton getjButtonProcesarInformacionSiNo() {
		return this.jButtonProcesarInformacionSiNo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSiNo)	{
		this.jButtonProcesarInformacionSiNo = jButtonProcesarInformacionSiNo;
	}
	
	
	public JButton getjButtonRecargarInformacionSiNo() {
		return this.jButtonRecargarInformacionSiNo;
	}
	
	
	public List<SiNo> getsinos() {
		return this.sinos;
	}

	public void setsinos(List<SiNo> sinos) {
		this.sinos = sinos;
	}
	
	public List<SiNo> getsinosAux() {
		return this.sinosAux;
	}

	public void setsinosAux(List<SiNo> sinosAux) {
		this.sinosAux = sinosAux;
	}
	
	public List<SiNo> getsinosEliminados() {
		return this.sinosEliminados;
	}

	public void setSiNosEliminados(List<SiNo> sinosEliminados) {
		this.sinosEliminados = sinosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSiNo() {
		return jComboBoxTiposSeleccionarSiNo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSiNo(
			JComboBox jComboBoxTiposSeleccionarSiNo) {
		this.jComboBoxTiposSeleccionarSiNo = jComboBoxTiposSeleccionarSiNo;
	}
	
	public void setBorderResaltarTiposSeleccionarSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSiNo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSiNo() {
		return jTextFieldValorCampoGeneralSiNo;
	}

	public void setjTextFieldValorCampoGeneralSiNo(
			JTextField jTextFieldValorCampoGeneralSiNo) {
		this.jTextFieldValorCampoGeneralSiNo = jTextFieldValorCampoGeneralSiNo;
	}

	public void setBorderResaltarValorCampoGeneralSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSiNo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSiNo() {
		return this.jCheckBoxSeleccionarTodosSiNo;
	}

	public void setjCheckBoxSeleccionarTodosSiNo(
			JCheckBox jCheckBoxSeleccionarTodosSiNo) {
		this.jCheckBoxSeleccionarTodosSiNo = jCheckBoxSeleccionarTodosSiNo;
	}

	public void setBorderResaltarSeleccionarTodosSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSiNo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSiNo() {
		return this.jCheckBoxSeleccionadosSiNo;
	}

	public void setjCheckBoxSeleccionadosSiNo(
			JCheckBox jCheckBoxSeleccionadosSiNo) {
		this.jCheckBoxSeleccionadosSiNo = jCheckBoxSeleccionadosSiNo;
	}
	
	public void setBorderResaltarSeleccionadosSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSiNo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSiNo() {
		return this.jComboBoxTiposArchivosReportesSiNo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSiNo(
			JComboBox jComboBoxTiposArchivosReportesSiNo) {
		this.jComboBoxTiposArchivosReportesSiNo = jComboBoxTiposArchivosReportesSiNo;
	}

	public void setBorderResaltarTiposArchivosReportesSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSiNo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSiNo() {
		return this.jComboBoxTiposReportesSiNo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSiNo(
			JComboBox jComboBoxTiposReportesSiNo) {
		this.jComboBoxTiposReportesSiNo = jComboBoxTiposReportesSiNo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSiNo() {
	//	return jComboBoxTiposReportesDinamicoSiNo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSiNo(
	//		JComboBox jComboBoxTiposReportesDinamicoSiNo) {
	//	this.jComboBoxTiposReportesDinamicoSiNo = jComboBoxTiposReportesDinamicoSiNo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSiNo() {
	//	return jComboBoxTiposArchivosReportesDinamicoSiNo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSiNo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSiNo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSiNo = jComboBoxTiposArchivosReportesDinamicoSiNo;
	//}
	
	public void setBorderResaltarTiposReportesSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSiNo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSiNo() {
		return this.jComboBoxTiposGraficosReportesSiNo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSiNo(
			JComboBox jComboBoxTiposGraficosReportesSiNo) {
		this.jComboBoxTiposGraficosReportesSiNo = jComboBoxTiposGraficosReportesSiNo;
	}
	
	public void setBorderResaltarTiposGraficosReportesSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSiNo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSiNo() {
		return this.jComboBoxTiposPaginacionSiNo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSiNo(
			JComboBox jComboBoxTiposPaginacionSiNo) {
		this.jComboBoxTiposPaginacionSiNo = jComboBoxTiposPaginacionSiNo;
	}
	
	public void setBorderResaltarTiposPaginacionSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSiNo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSiNo() {
		return this.jComboBoxTiposRelacionesSiNo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSiNo() {
		return this.jComboBoxTiposAccionesSiNo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSiNo(
			JComboBox jComboBoxTiposRelacionesSiNo) {
		this.jComboBoxTiposRelacionesSiNo = jComboBoxTiposRelacionesSiNo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSiNo(
			JComboBox jComboBoxTiposAccionesSiNo) {
		this.jComboBoxTiposAccionesSiNo = jComboBoxTiposAccionesSiNo;
	}
	
	public void setBorderResaltarTiposRelacionesSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSiNo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSiNo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSiNo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSiNo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSiNo() {
	//	return jCheckBoxConGraficoDinamicoSiNo;
	//}

	//public void setjCheckBoxConGraficoDinamicoSiNo(
	//		JCheckBox jCheckBoxConGraficoDinamicoSiNo) {
	//	this.jCheckBoxConGraficoDinamicoSiNo = jCheckBoxConGraficoDinamicoSiNo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSiNo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSiNo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSiNo .setBorder(borderResaltar);		
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
		this.sinoSessionBean=new SiNoSessionBean();
		
		this.sinoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sinoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sinoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SiNoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SiNoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SiNoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SiNoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SiNoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Si/no MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
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
		
		SiNoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSiNo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSiNo,this.jTtoolBarSiNo,
							"nuevo","nuevo","Nuevo"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSiNo,this.jTtoolBarSiNo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSiNo,this.jTtoolBarSiNo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSiNo,this.jTtoolBarSiNo,
							"duplicar","duplicar","Duplicar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSiNo,this.jTtoolBarSiNo,
							"copiar","copiar","Copiar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSiNo,this.jTtoolBarSiNo,
							"ver_form","ver_form","Ver"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSiNo,this.jTtoolBarSiNo,
							"recargar","recargar","Recargar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSiNo,this.jTtoolBarSiNo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSiNo,this.jTtoolBarSiNo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSiNo,this.jTtoolBarSiNo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSiNo,this.jTtoolBarSiNo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSiNo,this.jTtoolBarSiNo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSiNo,this.jTtoolBarSiNo,
							"cerrar","cerrar","Salir"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSiNo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSiNo;
			
				this.jButtonProcesarInformacionToolBarSiNo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSiNo;
				
		//protected JButton jButtonModificarToolBarSiNo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSiNo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSiNo=new JMenuMe("General");
		this.jmenuArchivoSiNo=new JMenuMe("Archivo");
		this.jmenuAccionesSiNo=new JMenuMe("Acciones");
		this.jmenuDatosSiNo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSiNo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSiNo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSiNo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSiNo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSiNo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSiNo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSiNo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSiNo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSiNo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSiNo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSiNo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSiNo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSiNo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSiNo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSiNo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSiNo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSiNo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSiNo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSiNo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSiNo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSiNo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSiNo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSiNo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSiNo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSiNo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSiNo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSiNo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSiNo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSiNo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSiNo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSiNo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSiNo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSiNo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSiNo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSiNo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSiNo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySiNo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySiNo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySiNo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSiNo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSiNo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSiNo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySiNo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySiNo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySiNo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSiNo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSiNo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSiNo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSiNo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSiNo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSiNo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSiNo.add(this.jMenuItemCerrarSiNo);
			
			this.jmenuAccionesSiNo.add(this.jMenuItemNuevoSiNo);
			this.jmenuAccionesSiNo.add(this.jMenuItemNuevoGuardarCambiosSiNo);
			this.jmenuAccionesSiNo.add(this.jMenuItemNuevoRelacionesSiNo);
			this.jmenuAccionesSiNo.add(this.jMenuItemGuardarCambiosTablaSiNo);		
			this.jmenuAccionesSiNo.add(this.jMenuItemDuplicarSiNo);		
			this.jmenuAccionesSiNo.add(this.jMenuItemCopiarSiNo);		
			this.jmenuAccionesSiNo.add(this.jMenuItemVerFormSiNo);		
			
			this.jmenuDatosSiNo.add(this.jMenuItemRecargarInformacionSiNo);				
			this.jmenuDatosSiNo.add(this.jMenuItemAnterioresSiNo);				
			this.jmenuDatosSiNo.add(this.jMenuItemSiguientesSiNo);				
			this.jmenuDatosSiNo.add(this.jMenuItemAbrirOrderBySiNo);				
			this.jmenuDatosSiNo.add(this.jMenuItemMostrarOcultarSiNo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSiNo.add(this.jMenuItemGuardarCambiosSiNo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSiNo.add(this.jmenuArchivoSiNo);		
			this.jmenuBarSiNo.add(this.jmenuAccionesSiNo);		
			this.jmenuBarSiNo.add(this.jmenuDatosSiNo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSiNo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSiNo() {
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
			//this.jInternalFrameDetalleSiNo = new SiNoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Si/no DATOS");
			this.jInternalFrameDetalleFormSiNo = new SiNoDetalleFormJInternalFrame(jDesktopPane,this.sinoSessionBean.getConGuardarRelaciones(),this.sinoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSiNo = null;//new SiNoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSiNo= new GridBagLayout();
		
		
		this.jTableDatosSiNo = new JTableMe();      
		
		String sToolTipSiNo="";
		sToolTipSiNo=SiNoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSiNo+="(Seguridad.SiNo)";
		}
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSiNo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSiNo.setToolTipText(sToolTipSiNo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSiNo);
		this.jTableDatosSiNo.setAutoCreateRowSorter(true);
		this.jTableDatosSiNo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSiNo.setRowSelectionAllowed(true);
		this.jTableDatosSiNo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSiNo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSiNo = new JButtonMe();
		this.jButtonDuplicarSiNo = new JButtonMe();
		this.jButtonCopiarSiNo = new JButtonMe();
		this.jButtonVerFormSiNo = new JButtonMe();
		this.jButtonNuevoRelacionesSiNo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSiNo = new JButtonMe();
		this.jButtonCerrarSiNo = new JButtonMe();
		
		this.jScrollPanelDatosSiNo = new JScrollPane();   
        this.jScrollPanelDatosGeneralSiNo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Si/no";
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no" + this.sPath));
		} else {
			this.jScrollPanelDatosSiNo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSiNo.setToolTipText("Acciones");
        this.jPanelAccionesSiNo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSiNo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSiNo=new ReporteDinamicoJInternalFrame(SiNoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSiNo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSiNo=new ImportacionJInternalFrame(SiNoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSiNo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySiNo = new JButtonMe();
		
		this.jButtonAbrirOrderBySiNo.setText("Orden");
		this.jButtonAbrirOrderBySiNo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySiNo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySiNo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySiNo,false,this);
			
			//this.cargarOrderBySiNo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySiNo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySiNo,true,this);
			
			//this.cargarOrderBySiNo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSiNo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosSiNo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosSiNo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosSiNo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSiNo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSiNo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSiNo.setText("Nuevo");
		this.jButtonDuplicarSiNo.setText("Duplicar");
		this.jButtonCopiarSiNo.setText("Copiar");
		this.jButtonVerFormSiNo.setText("Ver");
		this.jButtonNuevoRelacionesSiNo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSiNo.setText("Guardar");
		this.jButtonCerrarSiNo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSiNo,"nuevo_button","Nuevo",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSiNo,"duplicar_button","Duplicar",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSiNo,"copiar_button","Copiar",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSiNo,"ver_form","Ver",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSiNo,"nuevorelaciones_button","Nuevo Rel",this.sinoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSiNo,"guardarcambiostabla_button","Guardar",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSiNo,"cerrar_button","Salir",this.sinoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSiNo.setToolTipText("Nuevo"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSiNo.setToolTipText("Duplicar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSiNo.setToolTipText("Copiar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSiNo.setToolTipText("Ver"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSiNo.setToolTipText("Nuevo Rel"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSiNo.setToolTipText("Guardar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSiNo.setToolTipText("Salir"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSiNo";
		inputMap = this.jButtonNuevoSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSiNo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSiNo"));
		
		//DUPLICAR
		sMapKey = "DuplicarSiNo";
		inputMap = this.jButtonDuplicarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSiNo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSiNo"));
		
		//COPIAR
		sMapKey = "CopiarSiNo";
		inputMap = this.jButtonCopiarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSiNo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSiNo"));
		
		//VEr FORM
		sMapKey = "VerFormSiNo";
		inputMap = this.jButtonVerFormSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSiNo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSiNo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSiNo";
		inputMap = this.jButtonNuevoRelacionesSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSiNo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSiNo";
		inputMap = this.jButtonModificarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSiNo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSiNo";
		inputMap = this.jButtonCerrarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSiNo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSiNo";
		inputMap = this.jButtonGuardarCambiosTablaSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSiNo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSiNo.setName("jPanelParametrosReportesSiNo"); 
		
		this.jPanelParametrosReportesAccionesSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSiNo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSiNo.setName("jPanelParametrosReportesAccionesSiNo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSiNo = new JButtonMe();
		this.jButtonRecargarInformacionSiNo.setText("Recargar");
		this.jButtonRecargarInformacionSiNo.setToolTipText("Recargar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSiNo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSiNo = new JButtonMe();
		this.jButtonProcesarInformacionSiNo.setText("Procesar");
		this.jButtonProcesarInformacionSiNo.setToolTipText("Procesar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSiNo.setVisible(false);
			
		this.jButtonProcesarInformacionSiNo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSiNo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSiNo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSiNo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSiNo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSiNo.setText("TIPO");       
		this.jComboBoxTiposReportesSiNo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSiNo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSiNo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSiNo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSiNo.setText("Paginacion");
		this.jComboBoxTiposPaginacionSiNo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSiNo.setText("Accion");
		this.jComboBoxTiposRelacionesSiNo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSiNo.setText("Accion");
		this.jComboBoxTiposAccionesSiNo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSiNo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSiNo.setText("Accion");
		this.jComboBoxTiposSeleccionarSiNo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSiNo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSiNo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSiNo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSiNo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSiNo = new JLabelMe();
		
		this.jLabelAccionesSiNo.setText("Acciones");		
		this.jLabelAccionesSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSiNo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSiNo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSiNo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSiNo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSiNo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSiNo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSiNo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSiNo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSiNo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSiNo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSiNo.setText("Graf.");
		this.jCheckBoxConGraficoReporteSiNo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSiNo = new JButtonMe();
		//this.jButtonAnterioresSiNo.setText("<<");
        this.jButtonAnterioresSiNo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSiNo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSiNo = new JButtonMe();
		//this.jButtonSiguientesSiNo.setText(">>");
        this.jButtonSiguientesSiNo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSiNo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSiNo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSiNo.setText("Nue");
        this.jButtonNuevoGuardarCambiosSiNo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSiNo,"nuevoguardarcambios_button","Nue",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSiNo";
		inputMap = this.jButtonNuevoGuardarCambiosSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSiNo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSiNo";
		inputMap = this.jButtonRecargarInformacionSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSiNo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSiNo";
		inputMap = this.jButtonSiguientesSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSiNo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSiNo";
		inputMap = this.jButtonAnterioresSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSiNo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSiNo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSiNo.setMinimumSize(new Dimension(this.getWidth(),SiNoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SiNoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSiNo.setMaximumSize(new Dimension(this.getWidth(),SiNoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SiNoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSiNo.setPreferredSize(new Dimension(this.getWidth(),SiNoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SiNoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSiNo = new GridBagLayout();

			this.jPanelPaginacionSiNo.setLayout(gridaBagLayoutPaginacionSiNo);						
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 0;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSiNo.add(this.jButtonAnterioresSiNo, this.gridBagConstraintsSiNo);
					
						
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSiNo.gridy = 0;
			
			this.jPanelPaginacionSiNo.add(this.jButtonNuevoGuardarCambiosSiNo, this.gridBagConstraintsSiNo);
						
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSiNo.gridy = 0;
			this.jPanelPaginacionSiNo.add(this.jButtonSiguientesSiNo, this.gridBagConstraintsSiNo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 1;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSiNo.add(this.jButtonNuevoSiNo, this.gridBagConstraintsSiNo);
						
			
			
			if(!this.sinoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSiNo = new GridBagConstraints();
				this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSiNo.gridy = 1;
				this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSiNo.add(this.jButtonGuardarCambiosTablaSiNo, this.gridBagConstraintsSiNo);
			}
			
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 1;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSiNo.add(this.jButtonDuplicarSiNo, this.gridBagConstraintsSiNo);
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 1;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSiNo.add(this.jButtonCopiarSiNo, this.gridBagConstraintsSiNo);
		
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 1;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSiNo.add(this.jButtonVerFormSiNo, this.gridBagConstraintsSiNo);
		
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 1;
			this.gridBagConstraintsSiNo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSiNo.add(this.jButtonCerrarSiNo, this.gridBagConstraintsSiNo);
		
		
		
		this.jButtonRecargarInformacionSiNo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSiNo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSiNo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSiNo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSiNo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSiNo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSiNo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSiNo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSiNo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSiNo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSiNo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSiNo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSiNo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSiNo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSiNo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSiNo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSiNo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSiNo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSiNo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSiNo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSiNo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSiNo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSiNo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSiNo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSiNo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSiNo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSiNo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSiNo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSiNo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSiNo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSiNo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSiNo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSiNo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSiNo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSiNo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSiNo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSiNo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSiNo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSiNo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSiNo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SiNo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SiNo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SiNo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SiNo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSiNo.setLayout(gridaBagParametrosReportesSiNo);
			this.jPanelParametrosReportesAccionesSiNo.setLayout(gridaBagParametrosReportesAccionesSiNo);
			
			
			this.jPanelParametrosAuxiliar1SiNo.setLayout(gridaBagParametrosAuxiliar1SiNo);
			this.jPanelParametrosAuxiliar2SiNo.setLayout(gridaBagParametrosAuxiliar2SiNo);
			this.jPanelParametrosAuxiliar3SiNo.setLayout(gridaBagParametrosAuxiliar3SiNo);
			this.jPanelParametrosAuxiliar4SiNo.setLayout(gridaBagParametrosAuxiliar4SiNo);
			//this.jPanelParametrosAuxiliar5SiNo.setLayout(gridaBagParametrosAuxiliar2SiNo);			
			
			
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSiNo.add(this.jButtonRecargarInformacionSiNo, this.gridBagConstraintsSiNo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SiNo.add(this.jComboBoxTiposPaginacionSiNo, this.gridBagConstraintsSiNo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SiNo.add(this.jCheckBoxConAltoMaximoTablaSiNo, this.gridBagConstraintsSiNo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SiNo.add(this.jComboBoxTiposArchivosReportesSiNo, this.gridBagConstraintsSiNo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSiNo.add(this.jPanelParametrosAuxiliar1SiNo, this.gridBagConstraintsSiNo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SiNo.add(this.jComboBoxTiposReportesSiNo, this.gridBagConstraintsSiNo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSiNo.add(this.jPanelParametrosAuxiliar4SiNo, this.gridBagConstraintsSiNo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSiNo.add(this.jComboBoxTiposReportesSiNo, this.gridBagConstraintsSiNo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSiNo.add(this.jCheckBoxGenerarReporteSiNo, this.gridBagConstraintsSiNo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSiNo.add(this.jPanelParametrosAuxiliar2SiNo, this.gridBagConstraintsSiNo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSiNo.add(this.jLabelAccionesSiNo, this.gridBagConstraintsSiNo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSiNo = new GridBagConstraints();
				this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSiNo.add(this.jButtonAbrirOrderBySiNo, this.gridBagConstraintsSiNo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSiNo.add(this.jComboBoxTiposSeleccionarSiNo, this.gridBagConstraintsSiNo);			
			
			
			/*
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSiNo.add(this.jCheckBoxSeleccionarTodosSiNo, this.gridBagConstraintsSiNo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SiNo.add(this.jCheckBoxSeleccionarTodosSiNo, this.gridBagConstraintsSiNo);															
				
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSiNo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SiNo.add(this.jCheckBoxSeleccionadosSiNo, this.gridBagConstraintsSiNo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSiNo.add(this.jPanelParametrosAuxiliar3SiNo, this.gridBagConstraintsSiNo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSiNo.add(this.jComboBoxTiposRelacionesSiNo, this.gridBagConstraintsSiNo);
				
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSiNo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSiNo.add(this.jComboBoxTiposAccionesSiNo, this.gridBagConstraintsSiNo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSiNo = new GridBagLayout();

			this.jScrollPanelDatosSiNo.setLayout(gridaBagLayoutDatosSiNo);
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = 0;
			this.gridBagConstraintsSiNo.gridx = 0;
			
			this.jScrollPanelDatosSiNo.add(this.jTableDatosSiNo, this.gridBagConstraintsSiNo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSiNo.setViewportView(this.jTableDatosSiNo);
		this.jTableDatosSiNo.setFillsViewportHeight(true);
		this.jTableDatosSiNo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSiNo= new GridBagLayout();
		this.jPanelAccionesSiNo.setLayout(gridaBagLayoutAccionesSiNo);
		
		
		/*	
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = 0;
		this.gridBagConstraintsSiNo.gridx = 0;
			
		this.jPanelAccionesSiNo.add(this.jButtonNuevoSiNo, this.gridBagConstraintsSiNo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSiNo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSiNo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sinoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSiNo = new GridBagConstraints();						
			this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSiNo.gridx = 0;		
			//this.gridBagConstraintsSiNo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSiNo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSiNo, this.gridBagConstraintsSiNo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSiNo.gridx = 0;		
		//this.gridBagConstraintsSiNo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSiNo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSiNo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSiNo, this.gridBagConstraintsSiNo);								
		
		
		/*
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSiNo, this.gridBagConstraintsSiNo);
		*/		
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSiNo.gridx =0;
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSiNo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSiNo, this.gridBagConstraintsSiNo);
				
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSiNo, this.gridBagConstraintsSiNo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SiNoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSiNo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSiNo = new GridBagLayout();
			this.jPanelBusquedasParametrosSiNo.setLayout(gridaBagLayoutBusquedasParametrosSiNo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSiNo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSiNo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSiNo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSiNo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSiNo, this.gridBagConstraintsSiNo);
			
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSiNo, this.gridBagConstraintsSiNo);
		
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSiNo, this.gridBagConstraintsSiNo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSiNo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSiNo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSiNo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSiNo.setName("jPanelReporteDinamicoSiNo"); 
		
		this.jPanelReporteDinamicoSiNo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSiNo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSiNo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSiNo.setLayout(gridaBagLayoutReporteDinamicoSiNo);
		
		
		this.jInternalFrameReporteDinamicoSiNo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSiNo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSiNo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSiNo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSiNo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSiNo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSiNo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSiNo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSiNo.setResizable(true);
	    this.jInternalFrameReporteDinamicoSiNo.setClosable(true);
	    this.jInternalFrameReporteDinamicoSiNo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSiNo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSiNo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSiNo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSiNo = new JLabelMe();

		this.jLabelColumnasSelectReporteSiNo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSiNo.add(this.jLabelColumnasSelectReporteSiNo, this.gridBagConstraintsSiNo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSiNo = new JList<Reporte>();
		this.jListColumnasSelectReporteSiNo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSiNo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSiNo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSiNo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSiNo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSiNo=new JScrollPane(this.jListColumnasSelectReporteSiNo);
			
			this.jScrollColumnasSelectReporteSiNo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSiNo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSiNo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSiNo.add(this.jListColumnasSelectReporteSiNo, this.gridBagConstraintsSiNo);
		this.jPanelReporteDinamicoSiNo.add(this.jScrollColumnasSelectReporteSiNo, this.gridBagConstraintsSiNo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSiNo = new JLabelMe();

		this.jLabelRelacionesSelectReporteSiNo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSiNo = new JList<Reporte>();
		this.jListRelacionesSelectReporteSiNo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSiNo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSiNo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSiNo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSiNo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSiNo=new JScrollPane(this.jListRelacionesSelectReporteSiNo);
			
			this.jScrollRelacionesSelectReporteSiNo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSiNo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSiNo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSiNo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSiNo = new JComboBoxMe();
		this.jListColumnasValoresGraficoSiNo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSiNo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSiNo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSiNo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSiNo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSiNo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSiNo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSiNo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSiNo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSiNo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSiNo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSiNo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSiNo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSiNo.add(this.jLabelGenerarExcelReporteDinamicoSiNo, this.gridBagConstraintsSiNo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSiNo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSiNo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSiNo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSiNo.setToolTipText("Generar EXCEL"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSiNo = new GridBagConstraints();
		//this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSiNo.add(this.jButtonGenerarExcelReporteDinamicoSiNo, this.gridBagConstraintsSiNo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSiNo.add(this.jComboBoxTiposReportesDinamicoSiNo, this.gridBagConstraintsSiNo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSiNo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSiNo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSiNo.add(this.jLabelTiposArchivoReporteDinamicoSiNo, this.gridBagConstraintsSiNo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSiNo.add(this.jComboBoxTiposArchivosReportesDinamicoSiNo, this.gridBagConstraintsSiNo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSiNo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSiNo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSiNo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSiNo.setToolTipText("Generar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSiNo.add(this.jButtonGenerarReporteDinamicoSiNo, this.gridBagConstraintsSiNo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSiNo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSiNo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSiNo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSiNo.setToolTipText("Cancelar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSiNo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSiNo.add(this.jButtonCerrarReporteDinamicoSiNo, this.gridBagConstraintsSiNo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSiNo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSiNo= new JScrollPane(jPanelReporteDinamicoSiNo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSiNo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSiNo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSiNo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSiNo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSiNo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSiNo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSiNo);
		this.jInternalFrameReporteDinamicoSiNo.getContentPane().add(this.jScrollPanelReporteDinamicoSiNo, this.gridBagConstraintsSiNo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSiNo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSiNo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSiNo.setName("jPanelImportacionSiNo"); 
		
		this.jPanelImportacionSiNo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSiNo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSiNo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSiNo.setLayout(gridaBagLayoutImportacionSiNo);
		
		
		this.jInternalFrameImportacionSiNo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSiNo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSiNo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSiNo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSiNo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSiNo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSiNo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSiNo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSiNo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSiNo.setResizable(true);
	    this.jInternalFrameImportacionSiNo.setClosable(true);
	    this.jInternalFrameImportacionSiNo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSiNo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSiNo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSiNo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSiNo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSiNo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSiNo.setResizable(true);
	    this.jInternalFrameImportacionSiNo.setClosable(true);
	    this.jInternalFrameImportacionSiNo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSiNo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSiNo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSiNo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSiNo = new JLabelMe();

		this.jLabelArchivoImportacionSiNo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSiNo.add(this.jLabelArchivoImportacionSiNo, this.gridBagConstraintsSiNo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSiNo = new JFileChooser();		
		this.jFileChooserImportacionSiNo.setToolTipText("ESCOGER ARCHIVO"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSiNo = new JButtonMe();
		this.jButtonAbrirImportacionSiNo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSiNo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSiNo.setToolTipText("Generar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSiNo.add(this.jButtonAbrirImportacionSiNo, this.gridBagConstraintsSiNo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSiNo = new JLabelMe();

		this.jLabelPathArchivoImportacionSiNo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSiNo.add(this.jLabelPathArchivoImportacionSiNo, this.gridBagConstraintsSiNo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSiNo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSiNo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSiNo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSiNo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSiNo.add(this.jTextFieldPathArchivoImportacionSiNo, this.gridBagConstraintsSiNo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSiNo = new JButtonMe();
		this.jButtonGenerarImportacionSiNo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSiNo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSiNo.setToolTipText("Generar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSiNo.add(this.jButtonGenerarImportacionSiNo, this.gridBagConstraintsSiNo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSiNo = new JButtonMe();
		this.jButtonCerrarImportacionSiNo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSiNo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSiNo.setToolTipText("Cancelar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = iPosYImportacion;
		this.gridBagConstraintsSiNo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSiNo.add(this.jButtonCerrarImportacionSiNo, this.gridBagConstraintsSiNo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSiNo = new GridBagLayout();
		
		this.jScrollPanelImportacionSiNo= new JScrollPane(jPanelImportacionSiNo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iPosYImportacion;
		this.gridBagConstraintsSiNo.gridx =iPosXImportacion;
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSiNo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSiNo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSiNo);
		this.jInternalFrameImportacionSiNo.getContentPane().add(this.jScrollPanelImportacionSiNo, this.gridBagConstraintsSiNo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySiNo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySiNo = new JButtonMe();
			this.jButtonAbrirOrderBySiNo.setText("Orden");
			this.jButtonAbrirOrderBySiNo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySiNo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySiNo";
			inputMap = this.jButtonAbrirOrderBySiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySiNo"));
		
		
			GridBagLayout gridaBagLayoutOrderBySiNo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySiNo.setName("jPanelOrderBySiNo"); 
			
			this.jPanelOrderBySiNo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySiNo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySiNo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySiNo.setLayout(gridaBagLayoutOrderBySiNo);
			
			
			this.jTableDatosSiNoOrderBy = new JTableMe();        
			this.jTableDatosSiNoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSiNoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSiNoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSiNoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSiNoOrderBy.setViewportView(this.jTableDatosSiNoOrderBy);
			this.jTableDatosSiNoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSiNoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySiNo= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySiNo= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySiNo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSiNo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySiNo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySiNo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySiNo.setTitle("Orden");
			this.jInternalFrameOrderBySiNo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySiNo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySiNo.setResizable(true);
			this.jInternalFrameOrderBySiNo.setClosable(true);
			this.jInternalFrameOrderBySiNo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySiNo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySiNo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySiNo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSiNo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSiNo.ipady =150;
				
			this.jPanelOrderBySiNo.add(jScrollPanelDatosSiNoOrderBy, this.gridBagConstraintsSiNo);//this.jTableDatosSiNoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySiNo = new JButtonMe();
			this.jButtonCerrarOrderBySiNo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySiNo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySiNo.setToolTipText("Cancelar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSiNo.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySiNo.add(this.jButtonCerrarOrderBySiNo, this.gridBagConstraintsSiNo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSiNo = new GridBagLayout();
			
			this.jScrollPanelOrderBySiNo= new JScrollPane(jPanelOrderBySiNo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy =iPosYOrderBy;
			this.gridBagConstraintsSiNo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySiNo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySiNo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSiNo);
			
			this.jInternalFrameOrderBySiNo.getContentPane().add(this.jScrollPanelOrderBySiNo, this.gridBagConstraintsSiNo);			
		
		} else {
			this.jButtonAbrirOrderBySiNo = new JButtonMe();
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
			&& this.sinoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSiNo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSiNo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSiNo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSiNo.getRowHeight();//SiNoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SiNoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSiNo.isSelected()) {
					iHeightTable=SiNoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SiNoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SiNoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SiNoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSiNo.isSelected()) {
					iHeightTable=SiNoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SiNoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SiNoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSiNo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSiNo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSiNo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSiNo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSiNo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSiNo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySiNo!=null && this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy()!=null) {
			//if(!this.sinoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySiNo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySiNo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySiNo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSiNo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSiNo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSiNo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=sinoLogic.getSiNos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sinos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SiNo> TraerSiNoBeans(List<SiNo> sinos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SiNo sino:sinos) {
					
				if(!(SiNoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SiNoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sino.setsDetalleGeneralEntityReporte(SiNoConstantesFunciones.getSiNoDescripcion(sino));
										
						
					
						
					
				} else  {
							
					//sino.setsDetalleGeneralEntityReporte(sino.getsDetalleGeneralEntityReporte());
										
				}
				
				//sinobeans.add(sinobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sinos;
    }
	//PARA REPORTES FIN
}
