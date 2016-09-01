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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.seguridad.util.BimestreConstantesFunciones;

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
public class BimestreJInternalFrame extends BimestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBimestre;
	
	protected JMenuBar jmenuBarBimestre;
	
	protected JMenu jmenuBimestre;
	protected JMenu jmenuDatosBimestre;
	protected JMenu jmenuArchivoBimestre;
	protected JMenu jmenuAccionesBimestre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBimestre;	
	protected GridBagConstraints gridBagConstraintsBimestre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BimestreDetalleFormJInternalFrame jInternalFrameDetalleFormBimestre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBimestre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBimestre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public BimestreSessionBean bimestreSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Bimestre> bimestres;		
	public List<Bimestre> bimestresEliminados;	
	public List<Bimestre> bimestresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBimestre;		
	protected JButton jButtonAbrirOrderByBimestre;
	
	
	//protected JPanel jPanelOrderByBimestre;
	//public JScrollPane jScrollPanelOrderByBimestre;	
	//protected JButton jButtonCerrarOrderByBimestre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BimestreLogic bimestreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBimestre;
	public JScrollPane jScrollPanelDatosEdicionBimestre;
	public JScrollPane jScrollPanelDatosGeneralBimestre;
    
	
	
	//public JScrollPane jScrollPanelDatosBimestreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBimestre;
	//public JScrollPane jScrollPanelImportacionBimestre;
	
	
	
	protected JPanel jPanelAccionesBimestre;
	
    protected JPanel jPanelPaginacionBimestre;
    protected JPanel jPanelParametrosReportesBimestre;
	protected JPanel jPanelParametrosReportesAccionesBimestre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Bimestre;
	protected JPanel jPanelParametrosAuxiliar2Bimestre;
	protected JPanel jPanelParametrosAuxiliar3Bimestre;
	protected JPanel jPanelParametrosAuxiliar4Bimestre;
	//protected JPanel jPanelParametrosAuxiliar5Bimestre;
	
	
	
	//protected JPanel jPanelReporteDinamicoBimestre;
	//protected JPanel jPanelImportacionBimestre;
	
	
	public JTable jTableDatosBimestre;
	
	
	
	//public JTable jTableDatosBimestreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBimestre;
	protected JButton jButtonDuplicarBimestre;
	protected JButton jButtonCopiarBimestre;
	protected JButton jButtonVerFormBimestre;
	protected JButton jButtonNuevoRelacionesBimestre;
	protected JButton jButtonModificarBimestre;
	
    protected JButton jButtonGuardarCambiosTablaBimestre;
	protected JButton jButtonCerrarBimestre;
	
	
	protected JButton jButtonRecargarInformacionBimestre;
	protected JButton jButtonProcesarInformacionBimestre;
	
	
	protected JButton jButtonAnterioresBimestre;
	protected JButton jButtonSiguientesBimestre;
	protected JButton jButtonNuevoGuardarCambiosBimestre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBimestre;
	//protected JButton jButtonCerrarReporteDinamicoBimestre;
	//protected JButton jButtonGenerarExcelReporteDinamicoBimestre;	
	
	
	
	//protected JButton jButtonAbrirImportacionBimestre;
	//protected JButton jButtonGenerarImportacionBimestre;
	//protected JButton jButtonCerrarImportacionBimestre;
	//protected JFileChooser jFileChooserImportacionBimestre;
	//protected File fileImportacionBimestre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBimestre;
	protected JButton jButtonDuplicarToolBarBimestre;
	protected JButton jButtonNuevoRelacionesToolBarBimestre;
	
	
	public JButton jButtonGuardarCambiosToolBarBimestre;
	protected JButton jButtonCopiarToolBarBimestre;
	protected JButton jButtonVerFormToolBarBimestre;
	public JButton jButtonGuardarCambiosTablaToolBarBimestre;
	protected JButton jButtonMostrarOcultarTablaToolBarBimestre;
	protected JButton jButtonCerrarToolBarBimestre;
	
	protected JButton jButtonRecargarInformacionToolBarBimestre;
	protected JButton jButtonProcesarInformacionToolBarBimestre;
	protected JButton jButtonAnterioresToolBarBimestre;
	protected JButton jButtonSiguientesToolBarBimestre;
	protected JButton jButtonNuevoGuardarCambiosToolBarBimestre;
	protected JButton jButtonAbrirOrderByToolBarBimestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBimestre;
	protected JMenuItem jMenuItemDuplicarBimestre;
	protected JMenuItem jMenuItemNuevoRelacionesBimestre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBimestre;
	protected JMenuItem jMenuItemCopiarBimestre;
	protected JMenuItem jMenuItemVerFormBimestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaBimestre;
	protected JMenuItem jMenuItemCerrarBimestre;
	protected JMenuItem jMenuItemDetalleCerrarBimestre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBimestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarBimestre;
	
	protected JMenuItem jMenuItemRecargarInformacionBimestre;
	protected JMenuItem jMenuItemProcesarInformacionBimestre;
	protected JMenuItem jMenuItemAnterioresBimestre;
	protected JMenuItem jMenuItemSiguientesBimestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBimestre;
	protected JMenuItem jMenuItemAbrirOrderByBimestre;
	protected JMenuItem jMenuItemMostrarOcultarBimestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBimestre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBimestre;
	protected JCheckBox jCheckBoxSeleccionadosBimestre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBimestre;
	protected JCheckBox jCheckBoxConGraficoReporteBimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBimestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBimestre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBimestre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBimestre;
	protected JTextField jTextFieldValorCampoGeneralBimestre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBimestre;
	//public JList<Reporte> jListColumnasSelectReporteBimestre;
	//public JScrollPane jScrollColumnasSelectReporteBimestre;
	
	//public JLabel jLabelRelacionesSelectReporteBimestre;
	//public JList<Reporte> jListRelacionesSelectReporteBimestre;
	//public JScrollPane jScrollRelacionesSelectReporteBimestre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBimestre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBimestre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBimestre;
	//public JLabel jLabelTiposArchivoReporteDinamicoBimestre;
	
		
	//public JLabel jLabelArchivoImportacionBimestre;	
	//public JLabel jLabelPathArchivoImportacionBimestre;
	//protected JTextField jTextFieldPathArchivoImportacionBimestre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBimestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBimestre;
	
	//public JLabel jLabelColumnaCategoriaValorBimestre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBimestre;
	
	//public JLabel jLabelColumnasValoresGraficoBimestre;
	//public JList<Reporte> jListColumnasValoresGraficoBimestre;
	//public JScrollPane jScrollColumnasValoresGraficoBimestre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBimestre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBimestre;	
	
	
	
	
	
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
	public BimestreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBimestre)	{
		this.jButtonRecargarInformacionBimestre = jButtonRecargarInformacionBimestre;
	}
	
	public JButton getjButtonProcesarInformacionBimestre() {
		return this.jButtonProcesarInformacionBimestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBimestre)	{
		this.jButtonProcesarInformacionBimestre = jButtonProcesarInformacionBimestre;
	}
	
	
	public JButton getjButtonRecargarInformacionBimestre() {
		return this.jButtonRecargarInformacionBimestre;
	}
	
	
	public List<Bimestre> getbimestres() {
		return this.bimestres;
	}

	public void setbimestres(List<Bimestre> bimestres) {
		this.bimestres = bimestres;
	}
	
	public List<Bimestre> getbimestresAux() {
		return this.bimestresAux;
	}

	public void setbimestresAux(List<Bimestre> bimestresAux) {
		this.bimestresAux = bimestresAux;
	}
	
	public List<Bimestre> getbimestresEliminados() {
		return this.bimestresEliminados;
	}

	public void setBimestresEliminados(List<Bimestre> bimestresEliminados) {
		this.bimestresEliminados = bimestresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBimestre() {
		return jComboBoxTiposSeleccionarBimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBimestre(
			JComboBox jComboBoxTiposSeleccionarBimestre) {
		this.jComboBoxTiposSeleccionarBimestre = jComboBoxTiposSeleccionarBimestre;
	}
	
	public void setBorderResaltarTiposSeleccionarBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBimestre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBimestre() {
		return jTextFieldValorCampoGeneralBimestre;
	}

	public void setjTextFieldValorCampoGeneralBimestre(
			JTextField jTextFieldValorCampoGeneralBimestre) {
		this.jTextFieldValorCampoGeneralBimestre = jTextFieldValorCampoGeneralBimestre;
	}

	public void setBorderResaltarValorCampoGeneralBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBimestre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBimestre() {
		return this.jCheckBoxSeleccionarTodosBimestre;
	}

	public void setjCheckBoxSeleccionarTodosBimestre(
			JCheckBox jCheckBoxSeleccionarTodosBimestre) {
		this.jCheckBoxSeleccionarTodosBimestre = jCheckBoxSeleccionarTodosBimestre;
	}

	public void setBorderResaltarSeleccionarTodosBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBimestre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBimestre() {
		return this.jCheckBoxSeleccionadosBimestre;
	}

	public void setjCheckBoxSeleccionadosBimestre(
			JCheckBox jCheckBoxSeleccionadosBimestre) {
		this.jCheckBoxSeleccionadosBimestre = jCheckBoxSeleccionadosBimestre;
	}
	
	public void setBorderResaltarSeleccionadosBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBimestre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBimestre() {
		return this.jComboBoxTiposArchivosReportesBimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBimestre(
			JComboBox jComboBoxTiposArchivosReportesBimestre) {
		this.jComboBoxTiposArchivosReportesBimestre = jComboBoxTiposArchivosReportesBimestre;
	}

	public void setBorderResaltarTiposArchivosReportesBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBimestre() {
		return this.jComboBoxTiposReportesBimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBimestre(
			JComboBox jComboBoxTiposReportesBimestre) {
		this.jComboBoxTiposReportesBimestre = jComboBoxTiposReportesBimestre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBimestre() {
	//	return jComboBoxTiposReportesDinamicoBimestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBimestre(
	//		JComboBox jComboBoxTiposReportesDinamicoBimestre) {
	//	this.jComboBoxTiposReportesDinamicoBimestre = jComboBoxTiposReportesDinamicoBimestre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBimestre() {
	//	return jComboBoxTiposArchivosReportesDinamicoBimestre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBimestre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBimestre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBimestre = jComboBoxTiposArchivosReportesDinamicoBimestre;
	//}
	
	public void setBorderResaltarTiposReportesBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBimestre() {
		return this.jComboBoxTiposGraficosReportesBimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBimestre(
			JComboBox jComboBoxTiposGraficosReportesBimestre) {
		this.jComboBoxTiposGraficosReportesBimestre = jComboBoxTiposGraficosReportesBimestre;
	}
	
	public void setBorderResaltarTiposGraficosReportesBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBimestre() {
		return this.jComboBoxTiposPaginacionBimestre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBimestre(
			JComboBox jComboBoxTiposPaginacionBimestre) {
		this.jComboBoxTiposPaginacionBimestre = jComboBoxTiposPaginacionBimestre;
	}
	
	public void setBorderResaltarTiposPaginacionBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBimestre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBimestre() {
		return this.jComboBoxTiposRelacionesBimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBimestre() {
		return this.jComboBoxTiposAccionesBimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBimestre(
			JComboBox jComboBoxTiposRelacionesBimestre) {
		this.jComboBoxTiposRelacionesBimestre = jComboBoxTiposRelacionesBimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBimestre(
			JComboBox jComboBoxTiposAccionesBimestre) {
		this.jComboBoxTiposAccionesBimestre = jComboBoxTiposAccionesBimestre;
	}
	
	public void setBorderResaltarTiposRelacionesBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBimestre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBimestre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBimestre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBimestre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBimestre() {
	//	return jCheckBoxConGraficoDinamicoBimestre;
	//}

	//public void setjCheckBoxConGraficoDinamicoBimestre(
	//		JCheckBox jCheckBoxConGraficoDinamicoBimestre) {
	//	this.jCheckBoxConGraficoDinamicoBimestre = jCheckBoxConGraficoDinamicoBimestre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBimestre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBimestre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBimestre .setBorder(borderResaltar);		
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
		this.bimestreSessionBean=new BimestreSessionBean();
		
		this.bimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bimestreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BimestreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BimestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BimestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bimestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
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
		
		BimestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBimestre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBimestre,this.jTtoolBarBimestre,
							"nuevo","nuevo","Nuevo"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBimestre,this.jTtoolBarBimestre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBimestre,this.jTtoolBarBimestre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBimestre,this.jTtoolBarBimestre,
							"duplicar","duplicar","Duplicar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBimestre,this.jTtoolBarBimestre,
							"copiar","copiar","Copiar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBimestre,this.jTtoolBarBimestre,
							"ver_form","ver_form","Ver"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBimestre,this.jTtoolBarBimestre,
							"recargar","recargar","Recargar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBimestre,this.jTtoolBarBimestre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBimestre,this.jTtoolBarBimestre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBimestre,this.jTtoolBarBimestre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBimestre,this.jTtoolBarBimestre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBimestre,this.jTtoolBarBimestre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBimestre,this.jTtoolBarBimestre,
							"cerrar","cerrar","Salir"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBimestre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBimestre;
			
				this.jButtonProcesarInformacionToolBarBimestre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBimestre;
				
		//protected JButton jButtonModificarToolBarBimestre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBimestre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBimestre=new JMenuMe("General");
		this.jmenuArchivoBimestre=new JMenuMe("Archivo");
		this.jmenuAccionesBimestre=new JMenuMe("Acciones");
		this.jmenuDatosBimestre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBimestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBimestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBimestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBimestre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBimestre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBimestre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBimestre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBimestre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBimestre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBimestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBimestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBimestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBimestre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBimestre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBimestre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBimestre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBimestre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBimestre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBimestre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBimestre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBimestre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBimestre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBimestre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBimestre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBimestre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBimestre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBimestre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBimestre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBimestre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBimestre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBimestre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBimestre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBimestre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBimestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBimestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBimestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBimestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBimestre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBimestre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBimestre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBimestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBimestre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBimestre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBimestre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBimestre.add(this.jMenuItemCerrarBimestre);
			
			this.jmenuAccionesBimestre.add(this.jMenuItemNuevoBimestre);
			this.jmenuAccionesBimestre.add(this.jMenuItemNuevoGuardarCambiosBimestre);
			this.jmenuAccionesBimestre.add(this.jMenuItemNuevoRelacionesBimestre);
			this.jmenuAccionesBimestre.add(this.jMenuItemGuardarCambiosTablaBimestre);		
			this.jmenuAccionesBimestre.add(this.jMenuItemDuplicarBimestre);		
			this.jmenuAccionesBimestre.add(this.jMenuItemCopiarBimestre);		
			this.jmenuAccionesBimestre.add(this.jMenuItemVerFormBimestre);		
			
			this.jmenuDatosBimestre.add(this.jMenuItemRecargarInformacionBimestre);				
			this.jmenuDatosBimestre.add(this.jMenuItemAnterioresBimestre);				
			this.jmenuDatosBimestre.add(this.jMenuItemSiguientesBimestre);				
			this.jmenuDatosBimestre.add(this.jMenuItemAbrirOrderByBimestre);				
			this.jmenuDatosBimestre.add(this.jMenuItemMostrarOcultarBimestre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBimestre.add(this.jMenuItemGuardarCambiosBimestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBimestre.add(this.jmenuArchivoBimestre);		
			this.jmenuBarBimestre.add(this.jmenuAccionesBimestre);		
			this.jmenuBarBimestre.add(this.jmenuDatosBimestre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBimestre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBimestre() {
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
			//this.jInternalFrameDetalleBimestre = new BimestreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bimestre DATOS");
			this.jInternalFrameDetalleFormBimestre = new BimestreDetalleFormJInternalFrame(jDesktopPane,this.bimestreSessionBean.getConGuardarRelaciones(),this.bimestreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBimestre = null;//new BimestreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBimestre= new GridBagLayout();
		
		
		this.jTableDatosBimestre = new JTableMe();      
		
		String sToolTipBimestre="";
		sToolTipBimestre=BimestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBimestre+="(Seguridad.Bimestre)";
		}
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipBimestre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBimestre.setToolTipText(sToolTipBimestre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBimestre);
		this.jTableDatosBimestre.setAutoCreateRowSorter(true);
		this.jTableDatosBimestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBimestre.setRowSelectionAllowed(true);
		this.jTableDatosBimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBimestre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBimestre = new JButtonMe();
		this.jButtonDuplicarBimestre = new JButtonMe();
		this.jButtonCopiarBimestre = new JButtonMe();
		this.jButtonVerFormBimestre = new JButtonMe();
		this.jButtonNuevoRelacionesBimestre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBimestre = new JButtonMe();
		this.jButtonCerrarBimestre = new JButtonMe();
		
		this.jScrollPanelDatosBimestre = new JScrollPane();   
        this.jScrollPanelDatosGeneralBimestre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Bimestre";
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres" + this.sPath));
		} else {
			this.jScrollPanelDatosBimestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBimestre.setToolTipText("Acciones");
        this.jPanelAccionesBimestre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBimestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBimestre=new ReporteDinamicoJInternalFrame(BimestreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBimestre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBimestre=new ImportacionJInternalFrame(BimestreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBimestre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBimestre = new JButtonMe();
		
		this.jButtonAbrirOrderByBimestre.setText("Orden");
		this.jButtonAbrirOrderByBimestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBimestre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBimestre,false,this);
			
			//this.cargarOrderByBimestre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBimestre,true,this);
			
			//this.cargarOrderByBimestre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBimestre.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosBimestre.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosBimestre.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosBimestre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBimestre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBimestre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBimestre.setText("Nuevo");
		this.jButtonDuplicarBimestre.setText("Duplicar");
		this.jButtonCopiarBimestre.setText("Copiar");
		this.jButtonVerFormBimestre.setText("Ver");
		this.jButtonNuevoRelacionesBimestre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBimestre.setText("Guardar");
		this.jButtonCerrarBimestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBimestre,"nuevo_button","Nuevo",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBimestre,"duplicar_button","Duplicar",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBimestre,"copiar_button","Copiar",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBimestre,"ver_form","Ver",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBimestre,"nuevorelaciones_button","Nuevo Rel",this.bimestreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBimestre,"guardarcambiostabla_button","Guardar",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBimestre,"cerrar_button","Salir",this.bimestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBimestre.setToolTipText("Nuevo"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBimestre.setToolTipText("Duplicar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBimestre.setToolTipText("Copiar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBimestre.setToolTipText("Ver"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBimestre.setToolTipText("Nuevo Rel"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBimestre.setToolTipText("Guardar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBimestre.setToolTipText("Salir"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBimestre";
		inputMap = this.jButtonNuevoBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBimestre"));
		
		//DUPLICAR
		sMapKey = "DuplicarBimestre";
		inputMap = this.jButtonDuplicarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBimestre"));
		
		//COPIAR
		sMapKey = "CopiarBimestre";
		inputMap = this.jButtonCopiarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBimestre"));
		
		//VEr FORM
		sMapKey = "VerFormBimestre";
		inputMap = this.jButtonVerFormBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBimestre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBimestre";
		inputMap = this.jButtonNuevoRelacionesBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBimestre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBimestre";
		inputMap = this.jButtonModificarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBimestre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBimestre";
		inputMap = this.jButtonCerrarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBimestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBimestre";
		inputMap = this.jButtonGuardarCambiosTablaBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBimestre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Bimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Bimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Bimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Bimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Bimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBimestre.setName("jPanelParametrosReportesBimestre"); 
		
		this.jPanelParametrosReportesAccionesBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBimestre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBimestre.setName("jPanelParametrosReportesAccionesBimestre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBimestre = new JButtonMe();
		this.jButtonRecargarInformacionBimestre.setText("Recargar");
		this.jButtonRecargarInformacionBimestre.setToolTipText("Recargar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBimestre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBimestre = new JButtonMe();
		this.jButtonProcesarInformacionBimestre.setText("Procesar");
		this.jButtonProcesarInformacionBimestre.setToolTipText("Procesar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBimestre.setVisible(false);
			
		this.jButtonProcesarInformacionBimestre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBimestre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBimestre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBimestre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBimestre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBimestre.setText("TIPO");       
		this.jComboBoxTiposReportesBimestre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBimestre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBimestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBimestre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBimestre.setText("Paginacion");
		this.jComboBoxTiposPaginacionBimestre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBimestre.setText("Accion");
		this.jComboBoxTiposRelacionesBimestre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBimestre.setText("Accion");
		this.jComboBoxTiposAccionesBimestre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBimestre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBimestre.setText("Accion");
		this.jComboBoxTiposSeleccionarBimestre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBimestre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBimestre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBimestre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBimestre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBimestre = new JLabelMe();
		
		this.jLabelAccionesBimestre.setText("Acciones");		
		this.jLabelAccionesBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBimestre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBimestre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBimestre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBimestre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBimestre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBimestre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBimestre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBimestre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBimestre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBimestre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBimestre.setText("Graf.");
		this.jCheckBoxConGraficoReporteBimestre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBimestre = new JButtonMe();
		//this.jButtonAnterioresBimestre.setText("<<");
        this.jButtonAnterioresBimestre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBimestre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBimestre = new JButtonMe();
		//this.jButtonSiguientesBimestre.setText(">>");
        this.jButtonSiguientesBimestre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBimestre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBimestre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBimestre.setText("Nue");
        this.jButtonNuevoGuardarCambiosBimestre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBimestre,"nuevoguardarcambios_button","Nue",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBimestre";
		inputMap = this.jButtonNuevoGuardarCambiosBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBimestre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBimestre";
		inputMap = this.jButtonRecargarInformacionBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBimestre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBimestre";
		inputMap = this.jButtonSiguientesBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBimestre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBimestre";
		inputMap = this.jButtonAnterioresBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBimestre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBimestre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBimestre.setMinimumSize(new Dimension(this.getWidth(),BimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BimestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBimestre.setMaximumSize(new Dimension(this.getWidth(),BimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BimestreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBimestre.setPreferredSize(new Dimension(this.getWidth(),BimestreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BimestreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBimestre = new GridBagLayout();

			this.jPanelPaginacionBimestre.setLayout(gridaBagLayoutPaginacionBimestre);						
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 0;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBimestre.add(this.jButtonAnterioresBimestre, this.gridBagConstraintsBimestre);
					
						
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBimestre.gridy = 0;
			
			this.jPanelPaginacionBimestre.add(this.jButtonNuevoGuardarCambiosBimestre, this.gridBagConstraintsBimestre);
						
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBimestre.gridy = 0;
			this.jPanelPaginacionBimestre.add(this.jButtonSiguientesBimestre, this.gridBagConstraintsBimestre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 1;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBimestre.add(this.jButtonNuevoBimestre, this.gridBagConstraintsBimestre);
						
			
			
			if(!this.bimestreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBimestre = new GridBagConstraints();
				this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBimestre.gridy = 1;
				this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBimestre.add(this.jButtonGuardarCambiosTablaBimestre, this.gridBagConstraintsBimestre);
			}
			
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 1;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBimestre.add(this.jButtonDuplicarBimestre, this.gridBagConstraintsBimestre);
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 1;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBimestre.add(this.jButtonCopiarBimestre, this.gridBagConstraintsBimestre);
		
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 1;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBimestre.add(this.jButtonVerFormBimestre, this.gridBagConstraintsBimestre);
		
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 1;
			this.gridBagConstraintsBimestre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBimestre.add(this.jButtonCerrarBimestre, this.gridBagConstraintsBimestre);
		
		
		
		this.jButtonRecargarInformacionBimestre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBimestre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBimestre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBimestre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBimestre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBimestre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBimestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBimestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBimestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBimestre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBimestre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBimestre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBimestre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBimestre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBimestre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBimestre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBimestre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBimestre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBimestre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBimestre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBimestre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBimestre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBimestre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBimestre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBimestre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBimestre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Bimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Bimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Bimestre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Bimestre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBimestre.setLayout(gridaBagParametrosReportesBimestre);
			this.jPanelParametrosReportesAccionesBimestre.setLayout(gridaBagParametrosReportesAccionesBimestre);
			
			
			this.jPanelParametrosAuxiliar1Bimestre.setLayout(gridaBagParametrosAuxiliar1Bimestre);
			this.jPanelParametrosAuxiliar2Bimestre.setLayout(gridaBagParametrosAuxiliar2Bimestre);
			this.jPanelParametrosAuxiliar3Bimestre.setLayout(gridaBagParametrosAuxiliar3Bimestre);
			this.jPanelParametrosAuxiliar4Bimestre.setLayout(gridaBagParametrosAuxiliar4Bimestre);
			//this.jPanelParametrosAuxiliar5Bimestre.setLayout(gridaBagParametrosAuxiliar2Bimestre);			
			
			
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBimestre.add(this.jButtonRecargarInformacionBimestre, this.gridBagConstraintsBimestre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bimestre.add(this.jComboBoxTiposPaginacionBimestre, this.gridBagConstraintsBimestre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bimestre.add(this.jCheckBoxConAltoMaximoTablaBimestre, this.gridBagConstraintsBimestre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bimestre.add(this.jComboBoxTiposArchivosReportesBimestre, this.gridBagConstraintsBimestre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBimestre.add(this.jPanelParametrosAuxiliar1Bimestre, this.gridBagConstraintsBimestre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Bimestre.add(this.jComboBoxTiposReportesBimestre, this.gridBagConstraintsBimestre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBimestre.add(this.jPanelParametrosAuxiliar4Bimestre, this.gridBagConstraintsBimestre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBimestre.add(this.jComboBoxTiposReportesBimestre, this.gridBagConstraintsBimestre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBimestre.add(this.jCheckBoxGenerarReporteBimestre, this.gridBagConstraintsBimestre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBimestre.add(this.jPanelParametrosAuxiliar2Bimestre, this.gridBagConstraintsBimestre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBimestre.add(this.jLabelAccionesBimestre, this.gridBagConstraintsBimestre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBimestre = new GridBagConstraints();
				this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBimestre.add(this.jButtonAbrirOrderByBimestre, this.gridBagConstraintsBimestre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBimestre.add(this.jComboBoxTiposSeleccionarBimestre, this.gridBagConstraintsBimestre);			
			
			
			/*
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBimestre.add(this.jCheckBoxSeleccionarTodosBimestre, this.gridBagConstraintsBimestre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bimestre.add(this.jCheckBoxSeleccionarTodosBimestre, this.gridBagConstraintsBimestre);															
				
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBimestre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bimestre.add(this.jCheckBoxSeleccionadosBimestre, this.gridBagConstraintsBimestre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBimestre.add(this.jPanelParametrosAuxiliar3Bimestre, this.gridBagConstraintsBimestre);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBimestre.add(this.jComboBoxTiposRelacionesBimestre, this.gridBagConstraintsBimestre);
				
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBimestre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBimestre.add(this.jComboBoxTiposAccionesBimestre, this.gridBagConstraintsBimestre);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBimestre = new GridBagLayout();

			this.jScrollPanelDatosBimestre.setLayout(gridaBagLayoutDatosBimestre);
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = 0;
			this.gridBagConstraintsBimestre.gridx = 0;
			
			this.jScrollPanelDatosBimestre.add(this.jTableDatosBimestre, this.gridBagConstraintsBimestre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBimestre.setViewportView(this.jTableDatosBimestre);
		this.jTableDatosBimestre.setFillsViewportHeight(true);
		this.jTableDatosBimestre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBimestre= new GridBagLayout();
		this.jPanelAccionesBimestre.setLayout(gridaBagLayoutAccionesBimestre);
		
		
		/*	
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = 0;
		this.gridBagConstraintsBimestre.gridx = 0;
			
		this.jPanelAccionesBimestre.add(this.jButtonNuevoBimestre, this.gridBagConstraintsBimestre);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBimestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBimestre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBimestre = new GridBagConstraints();						
			this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBimestre.gridx = 0;		
			//this.gridBagConstraintsBimestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBimestre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBimestre, this.gridBagConstraintsBimestre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBimestre.gridx = 0;		
		//this.gridBagConstraintsBimestre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBimestre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBimestre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBimestre, this.gridBagConstraintsBimestre);								
		
		
		/*
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBimestre, this.gridBagConstraintsBimestre);
		*/		
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBimestre.gridx =0;
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBimestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBimestre, this.gridBagConstraintsBimestre);
				
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBimestre, this.gridBagConstraintsBimestre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BimestreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBimestre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBimestre = new GridBagLayout();
			this.jPanelBusquedasParametrosBimestre.setLayout(gridaBagLayoutBusquedasParametrosBimestre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBimestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBimestre, this.gridBagConstraintsBimestre);
			
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBimestre, this.gridBagConstraintsBimestre);
		
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBimestre, this.gridBagConstraintsBimestre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBimestre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBimestre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBimestre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBimestre.setName("jPanelReporteDinamicoBimestre"); 
		
		this.jPanelReporteDinamicoBimestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBimestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBimestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBimestre.setLayout(gridaBagLayoutReporteDinamicoBimestre);
		
		
		this.jInternalFrameReporteDinamicoBimestre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBimestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBimestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBimestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBimestre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBimestre.setResizable(true);
	    this.jInternalFrameReporteDinamicoBimestre.setClosable(true);
	    this.jInternalFrameReporteDinamicoBimestre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBimestre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBimestre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBimestre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBimestre = new JLabelMe();

		this.jLabelColumnasSelectReporteBimestre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBimestre.add(this.jLabelColumnasSelectReporteBimestre, this.gridBagConstraintsBimestre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBimestre = new JList<Reporte>();
		this.jListColumnasSelectReporteBimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBimestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBimestre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBimestre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBimestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBimestre=new JScrollPane(this.jListColumnasSelectReporteBimestre);
			
			this.jScrollColumnasSelectReporteBimestre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBimestre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBimestre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBimestre.add(this.jListColumnasSelectReporteBimestre, this.gridBagConstraintsBimestre);
		this.jPanelReporteDinamicoBimestre.add(this.jScrollColumnasSelectReporteBimestre, this.gridBagConstraintsBimestre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBimestre = new JLabelMe();

		this.jLabelRelacionesSelectReporteBimestre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBimestre = new JList<Reporte>();
		this.jListRelacionesSelectReporteBimestre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBimestre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBimestre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBimestre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBimestre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBimestre=new JScrollPane(this.jListRelacionesSelectReporteBimestre);
			
			this.jScrollRelacionesSelectReporteBimestre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBimestre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBimestre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBimestre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBimestre = new JComboBoxMe();
		this.jListColumnasValoresGraficoBimestre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBimestre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBimestre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBimestre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBimestre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBimestre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBimestre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBimestre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBimestre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBimestre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBimestre.add(this.jLabelGenerarExcelReporteDinamicoBimestre, this.gridBagConstraintsBimestre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBimestre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBimestre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBimestre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBimestre.setToolTipText("Generar EXCEL"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBimestre = new GridBagConstraints();
		//this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBimestre.add(this.jButtonGenerarExcelReporteDinamicoBimestre, this.gridBagConstraintsBimestre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBimestre.add(this.jComboBoxTiposReportesDinamicoBimestre, this.gridBagConstraintsBimestre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBimestre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBimestre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBimestre.add(this.jLabelTiposArchivoReporteDinamicoBimestre, this.gridBagConstraintsBimestre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBimestre.add(this.jComboBoxTiposArchivosReportesDinamicoBimestre, this.gridBagConstraintsBimestre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBimestre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBimestre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBimestre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBimestre.setToolTipText("Generar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBimestre.add(this.jButtonGenerarReporteDinamicoBimestre, this.gridBagConstraintsBimestre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBimestre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBimestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBimestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBimestre.setToolTipText("Cancelar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBimestre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBimestre.add(this.jButtonCerrarReporteDinamicoBimestre, this.gridBagConstraintsBimestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBimestre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBimestre= new JScrollPane(jPanelReporteDinamicoBimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBimestre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBimestre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBimestre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBimestre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBimestre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBimestre);
		this.jInternalFrameReporteDinamicoBimestre.getContentPane().add(this.jScrollPanelReporteDinamicoBimestre, this.gridBagConstraintsBimestre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBimestre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBimestre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBimestre.setName("jPanelImportacionBimestre"); 
		
		this.jPanelImportacionBimestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBimestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBimestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBimestre.setLayout(gridaBagLayoutImportacionBimestre);
		
		
		this.jInternalFrameImportacionBimestre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBimestre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBimestre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBimestre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBimestre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBimestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBimestre.setResizable(true);
	    this.jInternalFrameImportacionBimestre.setClosable(true);
	    this.jInternalFrameImportacionBimestre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBimestre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBimestre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBimestre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBimestre.setResizable(true);
	    this.jInternalFrameImportacionBimestre.setClosable(true);
	    this.jInternalFrameImportacionBimestre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBimestre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBimestre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBimestre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBimestre = new JLabelMe();

		this.jLabelArchivoImportacionBimestre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBimestre.add(this.jLabelArchivoImportacionBimestre, this.gridBagConstraintsBimestre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBimestre = new JFileChooser();		
		this.jFileChooserImportacionBimestre.setToolTipText("ESCOGER ARCHIVO"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBimestre = new JButtonMe();
		this.jButtonAbrirImportacionBimestre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBimestre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBimestre.setToolTipText("Generar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBimestre.add(this.jButtonAbrirImportacionBimestre, this.gridBagConstraintsBimestre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBimestre = new JLabelMe();

		this.jLabelPathArchivoImportacionBimestre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;		
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBimestre.add(this.jLabelPathArchivoImportacionBimestre, this.gridBagConstraintsBimestre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBimestre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBimestre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBimestre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBimestre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBimestre.add(this.jTextFieldPathArchivoImportacionBimestre, this.gridBagConstraintsBimestre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBimestre = new JButtonMe();
		this.jButtonGenerarImportacionBimestre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBimestre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBimestre.setToolTipText("Generar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBimestre.add(this.jButtonGenerarImportacionBimestre, this.gridBagConstraintsBimestre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBimestre = new JButtonMe();
		this.jButtonCerrarImportacionBimestre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBimestre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBimestre.setToolTipText("Cancelar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = iPosYImportacion;
		this.gridBagConstraintsBimestre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBimestre.add(this.jButtonCerrarImportacionBimestre, this.gridBagConstraintsBimestre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBimestre = new GridBagLayout();
		
		this.jScrollPanelImportacionBimestre= new JScrollPane(jPanelImportacionBimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iPosYImportacion;
		this.gridBagConstraintsBimestre.gridx =iPosXImportacion;
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBimestre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBimestre);
		this.jInternalFrameImportacionBimestre.getContentPane().add(this.jScrollPanelImportacionBimestre, this.gridBagConstraintsBimestre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBimestre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBimestre = new JButtonMe();
			this.jButtonAbrirOrderByBimestre.setText("Orden");
			this.jButtonAbrirOrderByBimestre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBimestre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBimestre";
			inputMap = this.jButtonAbrirOrderByBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBimestre"));
		
		
			GridBagLayout gridaBagLayoutOrderByBimestre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBimestre.setName("jPanelOrderByBimestre"); 
			
			this.jPanelOrderByBimestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBimestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBimestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBimestre.setLayout(gridaBagLayoutOrderByBimestre);
			
			
			this.jTableDatosBimestreOrderBy = new JTableMe();        
			this.jTableDatosBimestreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBimestreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBimestreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBimestreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBimestreOrderBy.setViewportView(this.jTableDatosBimestreOrderBy);
			this.jTableDatosBimestreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBimestreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBimestre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBimestre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBimestre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBimestre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBimestre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBimestre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBimestre.setTitle("Orden");
			this.jInternalFrameOrderByBimestre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBimestre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBimestre.setResizable(true);
			this.jInternalFrameOrderByBimestre.setClosable(true);
			this.jInternalFrameOrderByBimestre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBimestre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBimestre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBimestre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBimestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBimestre.ipady =150;
				
			this.jPanelOrderByBimestre.add(jScrollPanelDatosBimestreOrderBy, this.gridBagConstraintsBimestre);//this.jTableDatosBimestreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBimestre = new JButtonMe();
			this.jButtonCerrarOrderByBimestre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBimestre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBimestre.setToolTipText("Cancelar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBimestre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBimestre.add(this.jButtonCerrarOrderByBimestre, this.gridBagConstraintsBimestre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBimestre = new GridBagLayout();
			
			this.jScrollPanelOrderByBimestre= new JScrollPane(jPanelOrderByBimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy =iPosYOrderBy;
			this.gridBagConstraintsBimestre.gridx =iPosXOrderBy;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBimestre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBimestre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBimestre);
			
			this.jInternalFrameOrderByBimestre.getContentPane().add(this.jScrollPanelOrderByBimestre, this.gridBagConstraintsBimestre);			
		
		} else {
			this.jButtonAbrirOrderByBimestre = new JButtonMe();
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
			&& this.bimestreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBimestre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBimestre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBimestre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBimestre.getRowHeight();//BimestreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBimestre.isSelected()) {
					iHeightTable=BimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBimestre.isSelected()) {
					iHeightTable=BimestreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BimestreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBimestre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBimestre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBimestre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBimestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBimestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBimestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBimestre!=null && this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy()!=null) {
			//if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBimestre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBimestre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBimestre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBimestre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBimestre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBimestre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bimestreLogic.getBimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bimestres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Bimestre> TraerBimestreBeans(List<Bimestre> bimestres,ArrayList<Classe> classes)throws Exception {
		try {
			for(Bimestre bimestre:bimestres) {
					
				if(!(BimestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BimestreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bimestre.setsDetalleGeneralEntityReporte(BimestreConstantesFunciones.getBimestreDescripcion(bimestre));
										
						
					
						
					
				} else  {
							
					//bimestre.setsDetalleGeneralEntityReporte(bimestre.getsDetalleGeneralEntityReporte());
										
				}
				
				//bimestrebeans.add(bimestrebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bimestres;
    }
	//PARA REPORTES FIN
}
