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
import com.bydan.erp.nomina.util.FactorNomiConstantesFunciones;

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
public class FactorNomiJInternalFrame extends FactorNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFactorNomi;
	
	protected JMenuBar jmenuBarFactorNomi;
	
	protected JMenu jmenuFactorNomi;
	protected JMenu jmenuDatosFactorNomi;
	protected JMenu jmenuArchivoFactorNomi;
	protected JMenu jmenuAccionesFactorNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFactorNomi;	
	protected GridBagConstraints gridBagConstraintsFactorNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FactorNomiDetalleFormJInternalFrame jInternalFrameDetalleFormFactorNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFactorNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFactorNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FactorNomiSessionBean factornomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FactorNomi> factornomis;		
	public List<FactorNomi> factornomisEliminados;	
	public List<FactorNomi> factornomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFactorNomi;		
	protected JButton jButtonAbrirOrderByFactorNomi;
	
	
	//protected JPanel jPanelOrderByFactorNomi;
	//public JScrollPane jScrollPanelOrderByFactorNomi;	
	//protected JButton jButtonCerrarOrderByFactorNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FactorNomiLogic factornomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFactorNomi;
	public JScrollPane jScrollPanelDatosEdicionFactorNomi;
	public JScrollPane jScrollPanelDatosGeneralFactorNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosFactorNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFactorNomi;
	//public JScrollPane jScrollPanelImportacionFactorNomi;
	
	
	
	protected JPanel jPanelAccionesFactorNomi;
	
    protected JPanel jPanelPaginacionFactorNomi;
    protected JPanel jPanelParametrosReportesFactorNomi;
	protected JPanel jPanelParametrosReportesAccionesFactorNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FactorNomi;
	protected JPanel jPanelParametrosAuxiliar2FactorNomi;
	protected JPanel jPanelParametrosAuxiliar3FactorNomi;
	protected JPanel jPanelParametrosAuxiliar4FactorNomi;
	//protected JPanel jPanelParametrosAuxiliar5FactorNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoFactorNomi;
	//protected JPanel jPanelImportacionFactorNomi;
	
	
	public JTable jTableDatosFactorNomi;
	
	
	
	//public JTable jTableDatosFactorNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFactorNomi;
	protected JButton jButtonDuplicarFactorNomi;
	protected JButton jButtonCopiarFactorNomi;
	protected JButton jButtonVerFormFactorNomi;
	protected JButton jButtonNuevoRelacionesFactorNomi;
	protected JButton jButtonModificarFactorNomi;
	
    protected JButton jButtonGuardarCambiosTablaFactorNomi;
	protected JButton jButtonCerrarFactorNomi;
	
	
	protected JButton jButtonRecargarInformacionFactorNomi;
	protected JButton jButtonProcesarInformacionFactorNomi;
	
	
	protected JButton jButtonAnterioresFactorNomi;
	protected JButton jButtonSiguientesFactorNomi;
	protected JButton jButtonNuevoGuardarCambiosFactorNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFactorNomi;
	//protected JButton jButtonCerrarReporteDinamicoFactorNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoFactorNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionFactorNomi;
	//protected JButton jButtonGenerarImportacionFactorNomi;
	//protected JButton jButtonCerrarImportacionFactorNomi;
	//protected JFileChooser jFileChooserImportacionFactorNomi;
	//protected File fileImportacionFactorNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFactorNomi;
	protected JButton jButtonDuplicarToolBarFactorNomi;
	protected JButton jButtonNuevoRelacionesToolBarFactorNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarFactorNomi;
	protected JButton jButtonCopiarToolBarFactorNomi;
	protected JButton jButtonVerFormToolBarFactorNomi;
	public JButton jButtonGuardarCambiosTablaToolBarFactorNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFactorNomi;
	protected JButton jButtonCerrarToolBarFactorNomi;
	
	protected JButton jButtonRecargarInformacionToolBarFactorNomi;
	protected JButton jButtonProcesarInformacionToolBarFactorNomi;
	protected JButton jButtonAnterioresToolBarFactorNomi;
	protected JButton jButtonSiguientesToolBarFactorNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarFactorNomi;
	protected JButton jButtonAbrirOrderByToolBarFactorNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFactorNomi;
	protected JMenuItem jMenuItemDuplicarFactorNomi;
	protected JMenuItem jMenuItemNuevoRelacionesFactorNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFactorNomi;
	protected JMenuItem jMenuItemCopiarFactorNomi;
	protected JMenuItem jMenuItemVerFormFactorNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFactorNomi;
	protected JMenuItem jMenuItemCerrarFactorNomi;
	protected JMenuItem jMenuItemDetalleCerrarFactorNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFactorNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFactorNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionFactorNomi;
	protected JMenuItem jMenuItemProcesarInformacionFactorNomi;
	protected JMenuItem jMenuItemAnterioresFactorNomi;
	protected JMenuItem jMenuItemSiguientesFactorNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFactorNomi;
	protected JMenuItem jMenuItemAbrirOrderByFactorNomi;
	protected JMenuItem jMenuItemMostrarOcultarFactorNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFactorNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFactorNomi;
	protected JCheckBox jCheckBoxSeleccionadosFactorNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFactorNomi;
	protected JCheckBox jCheckBoxConGraficoReporteFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFactorNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFactorNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFactorNomi;
	protected JTextField jTextFieldValorCampoGeneralFactorNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFactorNomi;
	//public JList<Reporte> jListColumnasSelectReporteFactorNomi;
	//public JScrollPane jScrollColumnasSelectReporteFactorNomi;
	
	//public JLabel jLabelRelacionesSelectReporteFactorNomi;
	//public JList<Reporte> jListRelacionesSelectReporteFactorNomi;
	//public JScrollPane jScrollRelacionesSelectReporteFactorNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFactorNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFactorNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFactorNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoFactorNomi;
	
		
	//public JLabel jLabelArchivoImportacionFactorNomi;	
	//public JLabel jLabelPathArchivoImportacionFactorNomi;
	//protected JTextField jTextFieldPathArchivoImportacionFactorNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFactorNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFactorNomi;
	
	//public JLabel jLabelColumnaCategoriaValorFactorNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFactorNomi;
	
	//public JLabel jLabelColumnasValoresGraficoFactorNomi;
	//public JList<Reporte> jListColumnasValoresGraficoFactorNomi;
	//public JScrollPane jScrollColumnasValoresGraficoFactorNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFactorNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFactorNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFactorNomi;
	
	
	
	
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
	public FactorNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFactorNomi)	{
		this.jButtonRecargarInformacionFactorNomi = jButtonRecargarInformacionFactorNomi;
	}
	
	public JButton getjButtonProcesarInformacionFactorNomi() {
		return this.jButtonProcesarInformacionFactorNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFactorNomi)	{
		this.jButtonProcesarInformacionFactorNomi = jButtonProcesarInformacionFactorNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionFactorNomi() {
		return this.jButtonRecargarInformacionFactorNomi;
	}
	
	
	public List<FactorNomi> getfactornomis() {
		return this.factornomis;
	}

	public void setfactornomis(List<FactorNomi> factornomis) {
		this.factornomis = factornomis;
	}
	
	public List<FactorNomi> getfactornomisAux() {
		return this.factornomisAux;
	}

	public void setfactornomisAux(List<FactorNomi> factornomisAux) {
		this.factornomisAux = factornomisAux;
	}
	
	public List<FactorNomi> getfactornomisEliminados() {
		return this.factornomisEliminados;
	}

	public void setFactorNomisEliminados(List<FactorNomi> factornomisEliminados) {
		this.factornomisEliminados = factornomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFactorNomi() {
		return jComboBoxTiposSeleccionarFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFactorNomi(
			JComboBox jComboBoxTiposSeleccionarFactorNomi) {
		this.jComboBoxTiposSeleccionarFactorNomi = jComboBoxTiposSeleccionarFactorNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFactorNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFactorNomi() {
		return jTextFieldValorCampoGeneralFactorNomi;
	}

	public void setjTextFieldValorCampoGeneralFactorNomi(
			JTextField jTextFieldValorCampoGeneralFactorNomi) {
		this.jTextFieldValorCampoGeneralFactorNomi = jTextFieldValorCampoGeneralFactorNomi;
	}

	public void setBorderResaltarValorCampoGeneralFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFactorNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFactorNomi() {
		return this.jCheckBoxSeleccionarTodosFactorNomi;
	}

	public void setjCheckBoxSeleccionarTodosFactorNomi(
			JCheckBox jCheckBoxSeleccionarTodosFactorNomi) {
		this.jCheckBoxSeleccionarTodosFactorNomi = jCheckBoxSeleccionarTodosFactorNomi;
	}

	public void setBorderResaltarSeleccionarTodosFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFactorNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFactorNomi() {
		return this.jCheckBoxSeleccionadosFactorNomi;
	}

	public void setjCheckBoxSeleccionadosFactorNomi(
			JCheckBox jCheckBoxSeleccionadosFactorNomi) {
		this.jCheckBoxSeleccionadosFactorNomi = jCheckBoxSeleccionadosFactorNomi;
	}
	
	public void setBorderResaltarSeleccionadosFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFactorNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFactorNomi() {
		return this.jComboBoxTiposArchivosReportesFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFactorNomi(
			JComboBox jComboBoxTiposArchivosReportesFactorNomi) {
		this.jComboBoxTiposArchivosReportesFactorNomi = jComboBoxTiposArchivosReportesFactorNomi;
	}

	public void setBorderResaltarTiposArchivosReportesFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFactorNomi() {
		return this.jComboBoxTiposReportesFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFactorNomi(
			JComboBox jComboBoxTiposReportesFactorNomi) {
		this.jComboBoxTiposReportesFactorNomi = jComboBoxTiposReportesFactorNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFactorNomi() {
	//	return jComboBoxTiposReportesDinamicoFactorNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFactorNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoFactorNomi) {
	//	this.jComboBoxTiposReportesDinamicoFactorNomi = jComboBoxTiposReportesDinamicoFactorNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFactorNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoFactorNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFactorNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFactorNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFactorNomi = jComboBoxTiposArchivosReportesDinamicoFactorNomi;
	//}
	
	public void setBorderResaltarTiposReportesFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFactorNomi() {
		return this.jComboBoxTiposGraficosReportesFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFactorNomi(
			JComboBox jComboBoxTiposGraficosReportesFactorNomi) {
		this.jComboBoxTiposGraficosReportesFactorNomi = jComboBoxTiposGraficosReportesFactorNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFactorNomi() {
		return this.jComboBoxTiposPaginacionFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFactorNomi(
			JComboBox jComboBoxTiposPaginacionFactorNomi) {
		this.jComboBoxTiposPaginacionFactorNomi = jComboBoxTiposPaginacionFactorNomi;
	}
	
	public void setBorderResaltarTiposPaginacionFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFactorNomi() {
		return this.jComboBoxTiposRelacionesFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFactorNomi() {
		return this.jComboBoxTiposAccionesFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFactorNomi(
			JComboBox jComboBoxTiposRelacionesFactorNomi) {
		this.jComboBoxTiposRelacionesFactorNomi = jComboBoxTiposRelacionesFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFactorNomi(
			JComboBox jComboBoxTiposAccionesFactorNomi) {
		this.jComboBoxTiposAccionesFactorNomi = jComboBoxTiposAccionesFactorNomi;
	}
	
	public void setBorderResaltarTiposRelacionesFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFactorNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFactorNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFactorNomi() {
	//	return jCheckBoxConGraficoDinamicoFactorNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoFactorNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoFactorNomi) {
	//	this.jCheckBoxConGraficoDinamicoFactorNomi = jCheckBoxConGraficoDinamicoFactorNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFactorNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFactorNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFactorNomi .setBorder(borderResaltar);		
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
		this.factornomiSessionBean=new FactorNomiSessionBean();
		
		this.factornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.factornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.factornomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FactorNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factor Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
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
		
		FactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFactorNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"nuevo","nuevo","Nuevo"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"duplicar","duplicar","Duplicar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"copiar","copiar","Copiar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"ver_form","ver_form","Ver"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"recargar","recargar","Recargar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFactorNomi,this.jTtoolBarFactorNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFactorNomi,this.jTtoolBarFactorNomi,
							"cerrar","cerrar","Salir"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFactorNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFactorNomi;
			
				this.jButtonProcesarInformacionToolBarFactorNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFactorNomi;
				
		//protected JButton jButtonModificarToolBarFactorNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFactorNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFactorNomi=new JMenuMe("General");
		this.jmenuArchivoFactorNomi=new JMenuMe("Archivo");
		this.jmenuAccionesFactorNomi=new JMenuMe("Acciones");
		this.jmenuDatosFactorNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFactorNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFactorNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFactorNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFactorNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFactorNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFactorNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFactorNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFactorNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFactorNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFactorNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFactorNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFactorNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFactorNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFactorNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFactorNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFactorNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFactorNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFactorNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFactorNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFactorNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFactorNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFactorNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFactorNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFactorNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFactorNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFactorNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFactorNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFactorNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFactorNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFactorNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFactorNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFactorNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFactorNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFactorNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFactorNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFactorNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFactorNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFactorNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFactorNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFactorNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFactorNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFactorNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFactorNomi.add(this.jMenuItemCerrarFactorNomi);
			
			this.jmenuAccionesFactorNomi.add(this.jMenuItemNuevoFactorNomi);
			this.jmenuAccionesFactorNomi.add(this.jMenuItemNuevoGuardarCambiosFactorNomi);
			this.jmenuAccionesFactorNomi.add(this.jMenuItemNuevoRelacionesFactorNomi);
			this.jmenuAccionesFactorNomi.add(this.jMenuItemGuardarCambiosTablaFactorNomi);		
			this.jmenuAccionesFactorNomi.add(this.jMenuItemDuplicarFactorNomi);		
			this.jmenuAccionesFactorNomi.add(this.jMenuItemCopiarFactorNomi);		
			this.jmenuAccionesFactorNomi.add(this.jMenuItemVerFormFactorNomi);		
			
			this.jmenuDatosFactorNomi.add(this.jMenuItemRecargarInformacionFactorNomi);				
			this.jmenuDatosFactorNomi.add(this.jMenuItemAnterioresFactorNomi);				
			this.jmenuDatosFactorNomi.add(this.jMenuItemSiguientesFactorNomi);				
			this.jmenuDatosFactorNomi.add(this.jMenuItemAbrirOrderByFactorNomi);				
			this.jmenuDatosFactorNomi.add(this.jMenuItemMostrarOcultarFactorNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFactorNomi.add(this.jMenuItemGuardarCambiosFactorNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFactorNomi.add(this.jmenuArchivoFactorNomi);		
			this.jmenuBarFactorNomi.add(this.jmenuAccionesFactorNomi);		
			this.jmenuBarFactorNomi.add(this.jmenuDatosFactorNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFactorNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFactorNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasFactorNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasFactorNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFactorNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFactorNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFactorNomi = new FactorNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factor Nomi DATOS");
			this.jInternalFrameDetalleFormFactorNomi = new FactorNomiDetalleFormJInternalFrame(jDesktopPane,this.factornomiSessionBean.getConGuardarRelaciones(),this.factornomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFactorNomi = null;//new FactorNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFactorNomi= new GridBagLayout();
		
		
		this.jTableDatosFactorNomi = new JTableMe();      
		
		String sToolTipFactorNomi="";
		sToolTipFactorNomi=FactorNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFactorNomi+="(Nomina.FactorNomi)";
		}
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFactorNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFactorNomi.setToolTipText(sToolTipFactorNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFactorNomi);
		this.jTableDatosFactorNomi.setAutoCreateRowSorter(true);
		this.jTableDatosFactorNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFactorNomi.setRowSelectionAllowed(true);
		this.jTableDatosFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFactorNomi = new JButtonMe();
		this.jButtonDuplicarFactorNomi = new JButtonMe();
		this.jButtonCopiarFactorNomi = new JButtonMe();
		this.jButtonVerFormFactorNomi = new JButtonMe();
		this.jButtonNuevoRelacionesFactorNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFactorNomi = new JButtonMe();
		this.jButtonCerrarFactorNomi = new JButtonMe();
		
		this.jScrollPanelDatosFactorNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralFactorNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Factor Nomi";
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFactorNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFactorNomi=new ReporteDinamicoJInternalFrame(FactorNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFactorNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFactorNomi=new ImportacionJInternalFrame(FactorNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFactorNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFactorNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByFactorNomi.setText("Orden");
		this.jButtonAbrirOrderByFactorNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFactorNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactorNomi,false,this);
			
			//this.cargarOrderByFactorNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactorNomi,true,this);
			
			//this.cargarOrderByFactorNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFactorNomi.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosFactorNomi.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosFactorNomi.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosFactorNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFactorNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFactorNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFactorNomi.setText("Nuevo");
		this.jButtonDuplicarFactorNomi.setText("Duplicar");
		this.jButtonCopiarFactorNomi.setText("Copiar");
		this.jButtonVerFormFactorNomi.setText("Ver");
		this.jButtonNuevoRelacionesFactorNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFactorNomi.setText("Guardar");
		this.jButtonCerrarFactorNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFactorNomi,"nuevo_button","Nuevo",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFactorNomi,"duplicar_button","Duplicar",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFactorNomi,"copiar_button","Copiar",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFactorNomi,"ver_form","Ver",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFactorNomi,"nuevorelaciones_button","Nuevo Rel",this.factornomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFactorNomi,"guardarcambiostabla_button","Guardar",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFactorNomi,"cerrar_button","Salir",this.factornomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFactorNomi.setToolTipText("Nuevo"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFactorNomi.setToolTipText("Duplicar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFactorNomi.setToolTipText("Copiar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFactorNomi.setToolTipText("Ver"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFactorNomi.setToolTipText("Nuevo Rel"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFactorNomi.setToolTipText("Guardar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFactorNomi.setToolTipText("Salir"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFactorNomi";
		inputMap = this.jButtonNuevoFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFactorNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarFactorNomi";
		inputMap = this.jButtonDuplicarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFactorNomi"));
		
		//COPIAR
		sMapKey = "CopiarFactorNomi";
		inputMap = this.jButtonCopiarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFactorNomi"));
		
		//VEr FORM
		sMapKey = "VerFormFactorNomi";
		inputMap = this.jButtonVerFormFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFactorNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFactorNomi";
		inputMap = this.jButtonNuevoRelacionesFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFactorNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFactorNomi";
		inputMap = this.jButtonModificarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFactorNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFactorNomi";
		inputMap = this.jButtonCerrarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFactorNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFactorNomi";
		inputMap = this.jButtonGuardarCambiosTablaFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFactorNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFactorNomi.setName("jPanelParametrosReportesFactorNomi"); 
		
		this.jPanelParametrosReportesAccionesFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFactorNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFactorNomi.setName("jPanelParametrosReportesAccionesFactorNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFactorNomi = new JButtonMe();
		this.jButtonRecargarInformacionFactorNomi.setText("Recargar");
		this.jButtonRecargarInformacionFactorNomi.setToolTipText("Recargar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFactorNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFactorNomi = new JButtonMe();
		this.jButtonProcesarInformacionFactorNomi.setText("Procesar");
		this.jButtonProcesarInformacionFactorNomi.setToolTipText("Procesar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFactorNomi.setVisible(false);
			
		this.jButtonProcesarInformacionFactorNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFactorNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFactorNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactorNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFactorNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactorNomi.setText("TIPO");       
		this.jComboBoxTiposReportesFactorNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactorNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFactorNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFactorNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionFactorNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFactorNomi.setText("Accion");
		this.jComboBoxTiposRelacionesFactorNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFactorNomi.setText("Accion");
		this.jComboBoxTiposAccionesFactorNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFactorNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarFactorNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFactorNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFactorNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFactorNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFactorNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFactorNomi = new JLabelMe();
		
		this.jLabelAccionesFactorNomi.setText("Acciones");		
		this.jLabelAccionesFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFactorNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFactorNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFactorNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFactorNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFactorNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFactorNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFactorNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFactorNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFactorNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFactorNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFactorNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteFactorNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFactorNomi = new JButtonMe();
		//this.jButtonAnterioresFactorNomi.setText("<<");
        this.jButtonAnterioresFactorNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFactorNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFactorNomi = new JButtonMe();
		//this.jButtonSiguientesFactorNomi.setText(">>");
        this.jButtonSiguientesFactorNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFactorNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFactorNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFactorNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosFactorNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFactorNomi,"nuevoguardarcambios_button","Nue",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFactorNomi";
		inputMap = this.jButtonNuevoGuardarCambiosFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFactorNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFactorNomi";
		inputMap = this.jButtonRecargarInformacionFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFactorNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFactorNomi";
		inputMap = this.jButtonSiguientesFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFactorNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFactorNomi";
		inputMap = this.jButtonAnterioresFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFactorNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFactorNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFactorNomi.setMinimumSize(new Dimension(this.getWidth(),FactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFactorNomi.setMaximumSize(new Dimension(this.getWidth(),FactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFactorNomi.setPreferredSize(new Dimension(this.getWidth(),FactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFactorNomi = new GridBagLayout();

			this.jPanelPaginacionFactorNomi.setLayout(gridaBagLayoutPaginacionFactorNomi);						
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 0;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFactorNomi.add(this.jButtonAnterioresFactorNomi, this.gridBagConstraintsFactorNomi);
					
						
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFactorNomi.gridy = 0;
			
			this.jPanelPaginacionFactorNomi.add(this.jButtonNuevoGuardarCambiosFactorNomi, this.gridBagConstraintsFactorNomi);
						
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFactorNomi.gridy = 0;
			this.jPanelPaginacionFactorNomi.add(this.jButtonSiguientesFactorNomi, this.gridBagConstraintsFactorNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 1;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFactorNomi.add(this.jButtonNuevoFactorNomi, this.gridBagConstraintsFactorNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFactorNomi.gridy = 1;
				this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFactorNomi.add(this.jButtonNuevoRelacionesFactorNomi, this.gridBagConstraintsFactorNomi);
			}
			
			
			if(!this.factornomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFactorNomi.gridy = 1;
				this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFactorNomi.add(this.jButtonGuardarCambiosTablaFactorNomi, this.gridBagConstraintsFactorNomi);
			}
			
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 1;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFactorNomi.add(this.jButtonDuplicarFactorNomi, this.gridBagConstraintsFactorNomi);
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 1;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFactorNomi.add(this.jButtonCopiarFactorNomi, this.gridBagConstraintsFactorNomi);
		
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 1;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFactorNomi.add(this.jButtonVerFormFactorNomi, this.gridBagConstraintsFactorNomi);
		
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 1;
			this.gridBagConstraintsFactorNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFactorNomi.add(this.jButtonCerrarFactorNomi, this.gridBagConstraintsFactorNomi);
		
		
		
		this.jButtonRecargarInformacionFactorNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFactorNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFactorNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFactorNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFactorNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFactorNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFactorNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFactorNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFactorNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFactorNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFactorNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFactorNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFactorNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFactorNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFactorNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFactorNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFactorNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFactorNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFactorNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFactorNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFactorNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFactorNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFactorNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFactorNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFactorNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FactorNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFactorNomi.setLayout(gridaBagParametrosReportesFactorNomi);
			this.jPanelParametrosReportesAccionesFactorNomi.setLayout(gridaBagParametrosReportesAccionesFactorNomi);
			
			
			this.jPanelParametrosAuxiliar1FactorNomi.setLayout(gridaBagParametrosAuxiliar1FactorNomi);
			this.jPanelParametrosAuxiliar2FactorNomi.setLayout(gridaBagParametrosAuxiliar2FactorNomi);
			this.jPanelParametrosAuxiliar3FactorNomi.setLayout(gridaBagParametrosAuxiliar3FactorNomi);
			this.jPanelParametrosAuxiliar4FactorNomi.setLayout(gridaBagParametrosAuxiliar4FactorNomi);
			//this.jPanelParametrosAuxiliar5FactorNomi.setLayout(gridaBagParametrosAuxiliar2FactorNomi);			
			
			
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactorNomi.add(this.jButtonRecargarInformacionFactorNomi, this.gridBagConstraintsFactorNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FactorNomi.add(this.jComboBoxTiposPaginacionFactorNomi, this.gridBagConstraintsFactorNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FactorNomi.add(this.jCheckBoxConAltoMaximoTablaFactorNomi, this.gridBagConstraintsFactorNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FactorNomi.add(this.jComboBoxTiposArchivosReportesFactorNomi, this.gridBagConstraintsFactorNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactorNomi.add(this.jPanelParametrosAuxiliar1FactorNomi, this.gridBagConstraintsFactorNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FactorNomi.add(this.jComboBoxTiposReportesFactorNomi, this.gridBagConstraintsFactorNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactorNomi.add(this.jPanelParametrosAuxiliar4FactorNomi, this.gridBagConstraintsFactorNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactorNomi.add(this.jComboBoxTiposReportesFactorNomi, this.gridBagConstraintsFactorNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactorNomi.add(this.jCheckBoxGenerarReporteFactorNomi, this.gridBagConstraintsFactorNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactorNomi.add(this.jPanelParametrosAuxiliar2FactorNomi, this.gridBagConstraintsFactorNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactorNomi.add(this.jLabelAccionesFactorNomi, this.gridBagConstraintsFactorNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFactorNomi.add(this.jButtonAbrirOrderByFactorNomi, this.gridBagConstraintsFactorNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactorNomi.add(this.jComboBoxTiposSeleccionarFactorNomi, this.gridBagConstraintsFactorNomi);			
			
			
			/*
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactorNomi.add(this.jCheckBoxSeleccionarTodosFactorNomi, this.gridBagConstraintsFactorNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FactorNomi.add(this.jCheckBoxSeleccionarTodosFactorNomi, this.gridBagConstraintsFactorNomi);															
				
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FactorNomi.add(this.jCheckBoxSeleccionadosFactorNomi, this.gridBagConstraintsFactorNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactorNomi.add(this.jPanelParametrosAuxiliar3FactorNomi, this.gridBagConstraintsFactorNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactorNomi.add(this.jComboBoxTiposRelacionesFactorNomi, this.gridBagConstraintsFactorNomi);
				
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactorNomi.add(this.jComboBoxTiposAccionesFactorNomi, this.gridBagConstraintsFactorNomi);
	
				
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactorNomi.add(this.jTextFieldValorCampoGeneralFactorNomi, this.gridBagConstraintsFactorNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFactorNomi = new GridBagLayout();

			this.jScrollPanelDatosFactorNomi.setLayout(gridaBagLayoutDatosFactorNomi);
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = 0;
			this.gridBagConstraintsFactorNomi.gridx = 0;
			
			this.jScrollPanelDatosFactorNomi.add(this.jTableDatosFactorNomi, this.gridBagConstraintsFactorNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFactorNomi.setViewportView(this.jTableDatosFactorNomi);
		this.jTableDatosFactorNomi.setFillsViewportHeight(true);
		this.jTableDatosFactorNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFactorNomi= new GridBagLayout();
		this.jPanelAccionesFactorNomi.setLayout(gridaBagLayoutAccionesFactorNomi);
		
		
		/*	
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx = 0;
			
		this.jPanelAccionesFactorNomi.add(this.jButtonNuevoFactorNomi, this.gridBagConstraintsFactorNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFactorNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFactorNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();						
			this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFactorNomi.gridx = 0;		
			//this.gridBagConstraintsFactorNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFactorNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFactorNomi, this.gridBagConstraintsFactorNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFactorNomi.gridx = 0;		
		//this.gridBagConstraintsFactorNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFactorNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFactorNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFactorNomi, this.gridBagConstraintsFactorNomi);								
		
		
		/*
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFactorNomi, this.gridBagConstraintsFactorNomi);
		*/		
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFactorNomi.gridx =0;
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFactorNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFactorNomi, this.gridBagConstraintsFactorNomi);
				
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFactorNomi, this.gridBagConstraintsFactorNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFactorNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosFactorNomi.setLayout(gridaBagLayoutBusquedasParametrosFactorNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFactorNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFactorNomi, this.gridBagConstraintsFactorNomi);
			
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFactorNomi, this.gridBagConstraintsFactorNomi);
		
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFactorNomi, this.gridBagConstraintsFactorNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFactorNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFactorNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFactorNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFactorNomi.setName("jPanelReporteDinamicoFactorNomi"); 
		
		this.jPanelReporteDinamicoFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFactorNomi.setLayout(gridaBagLayoutReporteDinamicoFactorNomi);
		
		
		this.jInternalFrameReporteDinamicoFactorNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFactorNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFactorNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFactorNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFactorNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFactorNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoFactorNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoFactorNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFactorNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteFactorNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactorNomi.add(this.jLabelColumnasSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFactorNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFactorNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFactorNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFactorNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFactorNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFactorNomi=new JScrollPane(this.jListColumnasSelectReporteFactorNomi);
			
			this.jScrollColumnasSelectReporteFactorNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFactorNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFactorNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFactorNomi.add(this.jListColumnasSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		this.jPanelReporteDinamicoFactorNomi.add(this.jScrollColumnasSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFactorNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteFactorNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactorNomi.add(this.jLabelRelacionesSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFactorNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFactorNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFactorNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFactorNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFactorNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFactorNomi=new JScrollPane(this.jListRelacionesSelectReporteFactorNomi);
			
			this.jScrollRelacionesSelectReporteFactorNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFactorNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFactorNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFactorNomi.add(this.jListRelacionesSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		this.jPanelReporteDinamicoFactorNomi.add(this.jScrollRelacionesSelectReporteFactorNomi, this.gridBagConstraintsFactorNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFactorNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFactorNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoFactorNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFactorNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFactorNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFactorNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFactorNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFactorNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFactorNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactorNomi.add(this.jLabelGenerarExcelReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFactorNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFactorNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFactorNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFactorNomi.setToolTipText("Generar EXCEL"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFactorNomi.add(this.jButtonGenerarExcelReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactorNomi.add(this.jComboBoxTiposReportesDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFactorNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFactorNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactorNomi.add(this.jLabelTiposArchivoReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactorNomi.add(this.jComboBoxTiposArchivosReportesDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFactorNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFactorNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFactorNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFactorNomi.setToolTipText("Generar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactorNomi.add(this.jButtonGenerarReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFactorNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFactorNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFactorNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFactorNomi.setToolTipText("Cancelar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactorNomi.add(this.jButtonCerrarReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFactorNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFactorNomi= new JScrollPane(jPanelReporteDinamicoFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFactorNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFactorNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFactorNomi);
		this.jInternalFrameReporteDinamicoFactorNomi.getContentPane().add(this.jScrollPanelReporteDinamicoFactorNomi, this.gridBagConstraintsFactorNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFactorNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFactorNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFactorNomi.setName("jPanelImportacionFactorNomi"); 
		
		this.jPanelImportacionFactorNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFactorNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFactorNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFactorNomi.setLayout(gridaBagLayoutImportacionFactorNomi);
		
		
		this.jInternalFrameImportacionFactorNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFactorNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFactorNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFactorNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFactorNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFactorNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFactorNomi.setResizable(true);
	    this.jInternalFrameImportacionFactorNomi.setClosable(true);
	    this.jInternalFrameImportacionFactorNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFactorNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFactorNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFactorNomi.setResizable(true);
	    this.jInternalFrameImportacionFactorNomi.setClosable(true);
	    this.jInternalFrameImportacionFactorNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFactorNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFactorNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFactorNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFactorNomi = new JLabelMe();

		this.jLabelArchivoImportacionFactorNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFactorNomi.add(this.jLabelArchivoImportacionFactorNomi, this.gridBagConstraintsFactorNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFactorNomi = new JFileChooser();		
		this.jFileChooserImportacionFactorNomi.setToolTipText("ESCOGER ARCHIVO"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFactorNomi = new JButtonMe();
		this.jButtonAbrirImportacionFactorNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFactorNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFactorNomi.setToolTipText("Generar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactorNomi.add(this.jButtonAbrirImportacionFactorNomi, this.gridBagConstraintsFactorNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFactorNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionFactorNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFactorNomi.add(this.jLabelPathArchivoImportacionFactorNomi, this.gridBagConstraintsFactorNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFactorNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFactorNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFactorNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFactorNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactorNomi.add(this.jTextFieldPathArchivoImportacionFactorNomi, this.gridBagConstraintsFactorNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFactorNomi = new JButtonMe();
		this.jButtonGenerarImportacionFactorNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFactorNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFactorNomi.setToolTipText("Generar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactorNomi.add(this.jButtonGenerarImportacionFactorNomi, this.gridBagConstraintsFactorNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFactorNomi = new JButtonMe();
		this.jButtonCerrarImportacionFactorNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFactorNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFactorNomi.setToolTipText("Cancelar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactorNomi.add(this.jButtonCerrarImportacionFactorNomi, this.gridBagConstraintsFactorNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFactorNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionFactorNomi= new JScrollPane(jPanelImportacionFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsFactorNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFactorNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFactorNomi);
		this.jInternalFrameImportacionFactorNomi.getContentPane().add(this.jScrollPanelImportacionFactorNomi, this.gridBagConstraintsFactorNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFactorNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFactorNomi = new JButtonMe();
			this.jButtonAbrirOrderByFactorNomi.setText("Orden");
			this.jButtonAbrirOrderByFactorNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFactorNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFactorNomi";
			inputMap = this.jButtonAbrirOrderByFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFactorNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByFactorNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFactorNomi.setName("jPanelOrderByFactorNomi"); 
			
			this.jPanelOrderByFactorNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFactorNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFactorNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFactorNomi.setLayout(gridaBagLayoutOrderByFactorNomi);
			
			
			this.jTableDatosFactorNomiOrderBy = new JTableMe();        
			this.jTableDatosFactorNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFactorNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFactorNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFactorNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFactorNomiOrderBy.setViewportView(this.jTableDatosFactorNomiOrderBy);
			this.jTableDatosFactorNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFactorNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFactorNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFactorNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFactorNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFactorNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFactorNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFactorNomi.setTitle("Orden");
			this.jInternalFrameOrderByFactorNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFactorNomi.setResizable(true);
			this.jInternalFrameOrderByFactorNomi.setClosable(true);
			this.jInternalFrameOrderByFactorNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFactorNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFactorNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFactorNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFactorNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFactorNomi.ipady =150;
				
			this.jPanelOrderByFactorNomi.add(jScrollPanelDatosFactorNomiOrderBy, this.gridBagConstraintsFactorNomi);//this.jTableDatosFactorNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFactorNomi = new JButtonMe();
			this.jButtonCerrarOrderByFactorNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFactorNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFactorNomi.setToolTipText("Cancelar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFactorNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFactorNomi.add(this.jButtonCerrarOrderByFactorNomi, this.gridBagConstraintsFactorNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFactorNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByFactorNomi= new JScrollPane(jPanelOrderByFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsFactorNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFactorNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFactorNomi);
			
			this.jInternalFrameOrderByFactorNomi.getContentPane().add(this.jScrollPanelOrderByFactorNomi, this.gridBagConstraintsFactorNomi);			
		
		} else {
			this.jButtonAbrirOrderByFactorNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.factornomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFactorNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFactorNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFactorNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFactorNomi.getRowHeight();//FactorNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFactorNomi.isSelected()) {
					iHeightTable=FactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFactorNomi.isSelected()) {
					iHeightTable=FactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFactorNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFactorNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFactorNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFactorNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFactorNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFactorNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFactorNomi!=null && this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFactorNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFactorNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFactorNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFactorNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFactorNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFactorNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=factornomiLogic.getFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=factornomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FactorNomi> TraerFactorNomiBeans(List<FactorNomi> factornomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(FactorNomi factornomi:factornomis) {
					
				if(!(FactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					factornomi.setsDetalleGeneralEntityReporte(FactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomi));
										
						
					
					

					if(factornomi.getFormatoNomiFactorNomis()!=null && Funciones.existeClass(classes,FormatoNomiFactorNomi.class)) {
						try{factornomi.setformatonomifactornomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiFactorNomiJInternalFrame.TraerFormatoNomiFactorNomiBeans(factornomi.getFormatoNomiFactorNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(factornomi.getPreguntaNomis()!=null && Funciones.existeClass(classes,PreguntaNomi.class)) {
						try{factornomi.setpreguntanomisDescripcionReporte(new JRBeanCollectionDataSource(PreguntaNomiJInternalFrame.TraerPreguntaNomiBeans(factornomi.getPreguntaNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(factornomi.getFormatoNomiPreguntaNomis()!=null && Funciones.existeClass(classes,FormatoNomiPreguntaNomi.class)) {
						try{factornomi.setformatonomipreguntanomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiPreguntaNomiJInternalFrame.TraerFormatoNomiPreguntaNomiBeans(factornomi.getFormatoNomiPreguntaNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//factornomi.setsDetalleGeneralEntityReporte(factornomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//factornomibeans.add(factornomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return factornomis;
    }
	//PARA REPORTES FIN
}
