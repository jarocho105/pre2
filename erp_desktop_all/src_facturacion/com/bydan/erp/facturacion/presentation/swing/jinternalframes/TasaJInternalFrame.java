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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TasaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TasaJInternalFrame extends TasaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTasa;
	
	protected JMenuBar jmenuBarTasa;
	
	protected JMenu jmenuTasa;
	protected JMenu jmenuDatosTasa;
	protected JMenu jmenuArchivoTasa;
	protected JMenu jmenuAccionesTasa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTasa;	
	protected GridBagConstraints gridBagConstraintsTasa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TasaDetalleFormJInternalFrame jInternalFrameDetalleFormTasa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTasa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTasa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TasaSessionBean tasaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Tasa> tasas;		
	public List<Tasa> tasasEliminados;	
	public List<Tasa> tasasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTasa;		
	protected JButton jButtonAbrirOrderByTasa;
	
	
	//protected JPanel jPanelOrderByTasa;
	//public JScrollPane jScrollPanelOrderByTasa;	
	//protected JButton jButtonCerrarOrderByTasa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TasaLogic tasaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTasa;
	public JScrollPane jScrollPanelDatosEdicionTasa;
	public JScrollPane jScrollPanelDatosGeneralTasa;
    
	
	
	//public JScrollPane jScrollPanelDatosTasaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTasa;
	//public JScrollPane jScrollPanelImportacionTasa;
	
	
	
	protected JPanel jPanelAccionesTasa;
	
    protected JPanel jPanelPaginacionTasa;
    protected JPanel jPanelParametrosReportesTasa;
	protected JPanel jPanelParametrosReportesAccionesTasa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Tasa;
	protected JPanel jPanelParametrosAuxiliar2Tasa;
	protected JPanel jPanelParametrosAuxiliar3Tasa;
	protected JPanel jPanelParametrosAuxiliar4Tasa;
	//protected JPanel jPanelParametrosAuxiliar5Tasa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTasa;
	//protected JPanel jPanelImportacionTasa;
	
	
	public JTable jTableDatosTasa;
	
	
	
	//public JTable jTableDatosTasaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTasa;
	protected JButton jButtonDuplicarTasa;
	protected JButton jButtonCopiarTasa;
	protected JButton jButtonVerFormTasa;
	protected JButton jButtonNuevoRelacionesTasa;
	protected JButton jButtonModificarTasa;
	
    protected JButton jButtonGuardarCambiosTablaTasa;
	protected JButton jButtonCerrarTasa;
	
	
	protected JButton jButtonRecargarInformacionTasa;
	protected JButton jButtonProcesarInformacionTasa;
	
	
	protected JButton jButtonAnterioresTasa;
	protected JButton jButtonSiguientesTasa;
	protected JButton jButtonNuevoGuardarCambiosTasa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTasa;
	//protected JButton jButtonCerrarReporteDinamicoTasa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTasa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTasa;
	//protected JButton jButtonGenerarImportacionTasa;
	//protected JButton jButtonCerrarImportacionTasa;
	//protected JFileChooser jFileChooserImportacionTasa;
	//protected File fileImportacionTasa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTasa;
	protected JButton jButtonDuplicarToolBarTasa;
	protected JButton jButtonNuevoRelacionesToolBarTasa;
	
	
	public JButton jButtonGuardarCambiosToolBarTasa;
	protected JButton jButtonCopiarToolBarTasa;
	protected JButton jButtonVerFormToolBarTasa;
	public JButton jButtonGuardarCambiosTablaToolBarTasa;
	protected JButton jButtonMostrarOcultarTablaToolBarTasa;
	protected JButton jButtonCerrarToolBarTasa;
	
	protected JButton jButtonRecargarInformacionToolBarTasa;
	protected JButton jButtonProcesarInformacionToolBarTasa;
	protected JButton jButtonAnterioresToolBarTasa;
	protected JButton jButtonSiguientesToolBarTasa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTasa;
	protected JButton jButtonAbrirOrderByToolBarTasa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTasa;
	protected JMenuItem jMenuItemDuplicarTasa;
	protected JMenuItem jMenuItemNuevoRelacionesTasa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTasa;
	protected JMenuItem jMenuItemCopiarTasa;
	protected JMenuItem jMenuItemVerFormTasa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTasa;
	protected JMenuItem jMenuItemCerrarTasa;
	protected JMenuItem jMenuItemDetalleCerrarTasa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTasa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTasa;
	
	protected JMenuItem jMenuItemRecargarInformacionTasa;
	protected JMenuItem jMenuItemProcesarInformacionTasa;
	protected JMenuItem jMenuItemAnterioresTasa;
	protected JMenuItem jMenuItemSiguientesTasa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTasa;
	protected JMenuItem jMenuItemAbrirOrderByTasa;
	protected JMenuItem jMenuItemMostrarOcultarTasa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTasa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTasa;
	protected JCheckBox jCheckBoxSeleccionadosTasa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTasa;
	protected JCheckBox jCheckBoxConGraficoReporteTasa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTasa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTasa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTasa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTasa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTasa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTasa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTasa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTasa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTasa;
	protected JTextField jTextFieldValorCampoGeneralTasa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTasa;
	//public JList<Reporte> jListColumnasSelectReporteTasa;
	//public JScrollPane jScrollColumnasSelectReporteTasa;
	
	//public JLabel jLabelRelacionesSelectReporteTasa;
	//public JList<Reporte> jListRelacionesSelectReporteTasa;
	//public JScrollPane jScrollRelacionesSelectReporteTasa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTasa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTasa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTasa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTasa;
	
		
	//public JLabel jLabelArchivoImportacionTasa;	
	//public JLabel jLabelPathArchivoImportacionTasa;
	//protected JTextField jTextFieldPathArchivoImportacionTasa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTasa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTasa;
	
	//public JLabel jLabelColumnaCategoriaValorTasa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTasa;
	
	//public JLabel jLabelColumnasValoresGraficoTasa;
	//public JList<Reporte> jListColumnasValoresGraficoTasa;
	//public JScrollPane jScrollColumnasValoresGraficoTasa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTasa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTasa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTasa;
	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TasaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTasa)	{
		this.jButtonRecargarInformacionTasa = jButtonRecargarInformacionTasa;
	}
	
	public JButton getjButtonProcesarInformacionTasa() {
		return this.jButtonProcesarInformacionTasa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTasa)	{
		this.jButtonProcesarInformacionTasa = jButtonProcesarInformacionTasa;
	}
	
	
	public JButton getjButtonRecargarInformacionTasa() {
		return this.jButtonRecargarInformacionTasa;
	}
	
	
	public List<Tasa> gettasas() {
		return this.tasas;
	}

	public void settasas(List<Tasa> tasas) {
		this.tasas = tasas;
	}
	
	public List<Tasa> gettasasAux() {
		return this.tasasAux;
	}

	public void settasasAux(List<Tasa> tasasAux) {
		this.tasasAux = tasasAux;
	}
	
	public List<Tasa> gettasasEliminados() {
		return this.tasasEliminados;
	}

	public void setTasasEliminados(List<Tasa> tasasEliminados) {
		this.tasasEliminados = tasasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTasa() {
		return jComboBoxTiposSeleccionarTasa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTasa(
			JComboBox jComboBoxTiposSeleccionarTasa) {
		this.jComboBoxTiposSeleccionarTasa = jComboBoxTiposSeleccionarTasa;
	}
	
	public void setBorderResaltarTiposSeleccionarTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTasa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTasa() {
		return jTextFieldValorCampoGeneralTasa;
	}

	public void setjTextFieldValorCampoGeneralTasa(
			JTextField jTextFieldValorCampoGeneralTasa) {
		this.jTextFieldValorCampoGeneralTasa = jTextFieldValorCampoGeneralTasa;
	}

	public void setBorderResaltarValorCampoGeneralTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTasa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTasa() {
		return this.jCheckBoxSeleccionarTodosTasa;
	}

	public void setjCheckBoxSeleccionarTodosTasa(
			JCheckBox jCheckBoxSeleccionarTodosTasa) {
		this.jCheckBoxSeleccionarTodosTasa = jCheckBoxSeleccionarTodosTasa;
	}

	public void setBorderResaltarSeleccionarTodosTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTasa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTasa() {
		return this.jCheckBoxSeleccionadosTasa;
	}

	public void setjCheckBoxSeleccionadosTasa(
			JCheckBox jCheckBoxSeleccionadosTasa) {
		this.jCheckBoxSeleccionadosTasa = jCheckBoxSeleccionadosTasa;
	}
	
	public void setBorderResaltarSeleccionadosTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTasa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTasa() {
		return this.jComboBoxTiposArchivosReportesTasa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTasa(
			JComboBox jComboBoxTiposArchivosReportesTasa) {
		this.jComboBoxTiposArchivosReportesTasa = jComboBoxTiposArchivosReportesTasa;
	}

	public void setBorderResaltarTiposArchivosReportesTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTasa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTasa() {
		return this.jComboBoxTiposReportesTasa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTasa(
			JComboBox jComboBoxTiposReportesTasa) {
		this.jComboBoxTiposReportesTasa = jComboBoxTiposReportesTasa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTasa() {
	//	return jComboBoxTiposReportesDinamicoTasa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTasa(
	//		JComboBox jComboBoxTiposReportesDinamicoTasa) {
	//	this.jComboBoxTiposReportesDinamicoTasa = jComboBoxTiposReportesDinamicoTasa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTasa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTasa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTasa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTasa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTasa = jComboBoxTiposArchivosReportesDinamicoTasa;
	//}
	
	public void setBorderResaltarTiposReportesTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTasa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTasa() {
		return this.jComboBoxTiposGraficosReportesTasa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTasa(
			JComboBox jComboBoxTiposGraficosReportesTasa) {
		this.jComboBoxTiposGraficosReportesTasa = jComboBoxTiposGraficosReportesTasa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTasa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTasa() {
		return this.jComboBoxTiposPaginacionTasa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTasa(
			JComboBox jComboBoxTiposPaginacionTasa) {
		this.jComboBoxTiposPaginacionTasa = jComboBoxTiposPaginacionTasa;
	}
	
	public void setBorderResaltarTiposPaginacionTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTasa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTasa() {
		return this.jComboBoxTiposRelacionesTasa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTasa() {
		return this.jComboBoxTiposAccionesTasa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTasa(
			JComboBox jComboBoxTiposRelacionesTasa) {
		this.jComboBoxTiposRelacionesTasa = jComboBoxTiposRelacionesTasa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTasa(
			JComboBox jComboBoxTiposAccionesTasa) {
		this.jComboBoxTiposAccionesTasa = jComboBoxTiposAccionesTasa;
	}
	
	public void setBorderResaltarTiposRelacionesTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTasa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTasa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTasa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTasa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTasa() {
	//	return jCheckBoxConGraficoDinamicoTasa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTasa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTasa) {
	//	this.jCheckBoxConGraficoDinamicoTasa = jCheckBoxConGraficoDinamicoTasa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTasa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTasa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTasa .setBorder(borderResaltar);		
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
		this.tasaSessionBean=new TasaSessionBean();
		
		this.tasaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tasaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tasaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TasaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TasaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TasaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TasaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TasaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tasa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
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
		
		TasaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTasa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTasa,this.jTtoolBarTasa,
							"nuevo","nuevo","Nuevo"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTasa,this.jTtoolBarTasa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTasa,this.jTtoolBarTasa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTasa,this.jTtoolBarTasa,
							"duplicar","duplicar","Duplicar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTasa,this.jTtoolBarTasa,
							"copiar","copiar","Copiar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTasa,this.jTtoolBarTasa,
							"ver_form","ver_form","Ver"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTasa,this.jTtoolBarTasa,
							"recargar","recargar","Recargar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTasa,this.jTtoolBarTasa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTasa,this.jTtoolBarTasa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTasa,this.jTtoolBarTasa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTasa,this.jTtoolBarTasa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTasa,this.jTtoolBarTasa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTasa,this.jTtoolBarTasa,
							"cerrar","cerrar","Salir"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTasa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTasa;
			
				this.jButtonProcesarInformacionToolBarTasa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTasa;
				
		//protected JButton jButtonModificarToolBarTasa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTasa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTasa=new JMenuMe("General");
		this.jmenuArchivoTasa=new JMenuMe("Archivo");
		this.jmenuAccionesTasa=new JMenuMe("Acciones");
		this.jmenuDatosTasa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTasa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTasa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTasa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTasa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTasa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTasa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTasa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTasa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTasa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTasa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTasa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTasa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTasa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTasa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTasa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTasa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTasa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTasa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTasa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTasa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTasa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTasa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTasa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTasa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTasa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTasa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTasa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTasa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTasa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTasa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTasa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTasa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTasa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTasa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTasa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTasa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTasa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTasa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTasa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTasa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTasa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTasa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTasa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTasa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTasa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTasa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTasa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTasa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTasa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTasa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTasa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTasa.add(this.jMenuItemCerrarTasa);
			
			this.jmenuAccionesTasa.add(this.jMenuItemNuevoTasa);
			this.jmenuAccionesTasa.add(this.jMenuItemNuevoGuardarCambiosTasa);
			this.jmenuAccionesTasa.add(this.jMenuItemNuevoRelacionesTasa);
			this.jmenuAccionesTasa.add(this.jMenuItemGuardarCambiosTablaTasa);		
			this.jmenuAccionesTasa.add(this.jMenuItemDuplicarTasa);		
			this.jmenuAccionesTasa.add(this.jMenuItemCopiarTasa);		
			this.jmenuAccionesTasa.add(this.jMenuItemVerFormTasa);		
			
			this.jmenuDatosTasa.add(this.jMenuItemRecargarInformacionTasa);				
			this.jmenuDatosTasa.add(this.jMenuItemAnterioresTasa);				
			this.jmenuDatosTasa.add(this.jMenuItemSiguientesTasa);				
			this.jmenuDatosTasa.add(this.jMenuItemAbrirOrderByTasa);				
			this.jmenuDatosTasa.add(this.jMenuItemMostrarOcultarTasa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTasa.add(this.jMenuItemGuardarCambiosTasa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTasa.add(this.jmenuArchivoTasa);		
			this.jmenuBarTasa.add(this.jmenuAccionesTasa);		
			this.jmenuBarTasa.add(this.jmenuDatosTasa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTasa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTasa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTasa=new JTabbedPane();


		this.jTabbedPaneBusquedasTasa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTasa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTasa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTasa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTasa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTasa = new TasaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tasa DATOS");
			this.jInternalFrameDetalleFormTasa = new TasaDetalleFormJInternalFrame(jDesktopPane,this.tasaSessionBean.getConGuardarRelaciones(),this.tasaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTasa = null;//new TasaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTasa= new GridBagLayout();
		
		
		this.jTableDatosTasa = new JTableMe();      
		
		String sToolTipTasa="";
		sToolTipTasa=TasaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTasa+="(Facturacion.Tasa)";
		}
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTasa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTasa.setToolTipText(sToolTipTasa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTasa);
		this.jTableDatosTasa.setAutoCreateRowSorter(true);
		this.jTableDatosTasa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTasa.setRowSelectionAllowed(true);
		this.jTableDatosTasa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTasa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTasa = new JButtonMe();
		this.jButtonDuplicarTasa = new JButtonMe();
		this.jButtonCopiarTasa = new JButtonMe();
		this.jButtonVerFormTasa = new JButtonMe();
		this.jButtonNuevoRelacionesTasa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTasa = new JButtonMe();
		this.jButtonCerrarTasa = new JButtonMe();
		
		this.jScrollPanelDatosTasa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTasa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tasa";
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas" + this.sPath));
		} else {
			this.jScrollPanelDatosTasa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTasa.setToolTipText("Acciones");
        this.jPanelAccionesTasa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTasa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTasa=new ReporteDinamicoJInternalFrame(TasaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTasa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTasa=new ImportacionJInternalFrame(TasaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTasa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTasa = new JButtonMe();
		
		this.jButtonAbrirOrderByTasa.setText("Orden");
		this.jButtonAbrirOrderByTasa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTasa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTasa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTasa,false,this);
			
			//this.cargarOrderByTasa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTasa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTasa,true,this);
			
			//this.cargarOrderByTasa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTasa.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTasa.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTasa.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTasa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTasa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTasa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTasa.setText("Nuevo");
		this.jButtonDuplicarTasa.setText("Duplicar");
		this.jButtonCopiarTasa.setText("Copiar");
		this.jButtonVerFormTasa.setText("Ver");
		this.jButtonNuevoRelacionesTasa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTasa.setText("Guardar");
		this.jButtonCerrarTasa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTasa,"nuevo_button","Nuevo",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTasa,"duplicar_button","Duplicar",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTasa,"copiar_button","Copiar",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTasa,"ver_form","Ver",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTasa,"nuevorelaciones_button","Nuevo Rel",this.tasaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTasa,"guardarcambiostabla_button","Guardar",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTasa,"cerrar_button","Salir",this.tasaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTasa.setToolTipText("Nuevo"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTasa.setToolTipText("Duplicar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTasa.setToolTipText("Copiar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTasa.setToolTipText("Ver"+" "+TasaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTasa.setToolTipText("Nuevo Rel"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTasa.setToolTipText("Guardar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTasa.setToolTipText("Salir"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTasa";
		inputMap = this.jButtonNuevoTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTasa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTasa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTasa";
		inputMap = this.jButtonDuplicarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTasa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTasa"));
		
		//COPIAR
		sMapKey = "CopiarTasa";
		inputMap = this.jButtonCopiarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTasa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTasa"));
		
		//VEr FORM
		sMapKey = "VerFormTasa";
		inputMap = this.jButtonVerFormTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTasa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTasa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTasa";
		inputMap = this.jButtonNuevoRelacionesTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTasa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTasa";
		inputMap = this.jButtonModificarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTasa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTasa";
		inputMap = this.jButtonCerrarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTasa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTasa";
		inputMap = this.jButtonGuardarCambiosTablaTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTasa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Tasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Tasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Tasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Tasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Tasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTasa.setName("jPanelParametrosReportesTasa"); 
		
		this.jPanelParametrosReportesAccionesTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTasa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTasa.setName("jPanelParametrosReportesAccionesTasa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTasa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTasa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTasa = new JButtonMe();
		this.jButtonRecargarInformacionTasa.setText("Recargar");
		this.jButtonRecargarInformacionTasa.setToolTipText("Recargar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTasa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTasa = new JButtonMe();
		this.jButtonProcesarInformacionTasa.setText("Procesar");
		this.jButtonProcesarInformacionTasa.setToolTipText("Procesar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTasa.setVisible(false);
			
		this.jButtonProcesarInformacionTasa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTasa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTasa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTasa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTasa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTasa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTasa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTasa.setText("TIPO");       
		this.jComboBoxTiposReportesTasa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTasa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTasa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTasa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTasa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTasa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTasa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTasa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTasa.setText("Accion");
		this.jComboBoxTiposRelacionesTasa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTasa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTasa.setText("Accion");
		this.jComboBoxTiposAccionesTasa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTasa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTasa.setText("Accion");
		this.jComboBoxTiposSeleccionarTasa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTasa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTasa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTasa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTasa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTasa = new JLabelMe();
		
		this.jLabelAccionesTasa.setText("Acciones");		
		this.jLabelAccionesTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTasa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTasa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTasa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTasa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTasa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTasa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTasa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTasa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTasa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTasa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTasa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTasa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTasa = new JButtonMe();
		//this.jButtonAnterioresTasa.setText("<<");
        this.jButtonAnterioresTasa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTasa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTasa = new JButtonMe();
		//this.jButtonSiguientesTasa.setText(">>");
        this.jButtonSiguientesTasa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTasa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTasa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTasa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTasa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTasa,"nuevoguardarcambios_button","Nue",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTasa";
		inputMap = this.jButtonNuevoGuardarCambiosTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTasa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTasa";
		inputMap = this.jButtonRecargarInformacionTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTasa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTasa";
		inputMap = this.jButtonSiguientesTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTasa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTasa";
		inputMap = this.jButtonAnterioresTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTasa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTasa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTasa.setMinimumSize(new Dimension(this.getWidth(),TasaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TasaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTasa.setMaximumSize(new Dimension(this.getWidth(),TasaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TasaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTasa.setPreferredSize(new Dimension(this.getWidth(),TasaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TasaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTasa = new GridBagLayout();

			this.jPanelPaginacionTasa.setLayout(gridaBagLayoutPaginacionTasa);						
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 0;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTasa.add(this.jButtonAnterioresTasa, this.gridBagConstraintsTasa);
					
						
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTasa.gridy = 0;
			
			this.jPanelPaginacionTasa.add(this.jButtonNuevoGuardarCambiosTasa, this.gridBagConstraintsTasa);
						
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTasa.gridy = 0;
			this.jPanelPaginacionTasa.add(this.jButtonSiguientesTasa, this.gridBagConstraintsTasa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 1;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTasa.add(this.jButtonNuevoTasa, this.gridBagConstraintsTasa);
						
			
			
			if(!this.tasaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTasa = new GridBagConstraints();
				this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTasa.gridy = 1;
				this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTasa.add(this.jButtonGuardarCambiosTablaTasa, this.gridBagConstraintsTasa);
			}
			
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 1;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTasa.add(this.jButtonDuplicarTasa, this.gridBagConstraintsTasa);
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 1;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTasa.add(this.jButtonCopiarTasa, this.gridBagConstraintsTasa);
		
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 1;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTasa.add(this.jButtonVerFormTasa, this.gridBagConstraintsTasa);
		
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 1;
			this.gridBagConstraintsTasa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTasa.add(this.jButtonCerrarTasa, this.gridBagConstraintsTasa);
		
		
		
		this.jButtonRecargarInformacionTasa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTasa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTasa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTasa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTasa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTasa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTasa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTasa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTasa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTasa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTasa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTasa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTasa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTasa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTasa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTasa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTasa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTasa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTasa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTasa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTasa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTasa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTasa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTasa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTasa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTasa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTasa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTasa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTasa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTasa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTasa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTasa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTasa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTasa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTasa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTasa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTasa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTasa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTasa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTasa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Tasa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Tasa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Tasa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Tasa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTasa.setLayout(gridaBagParametrosReportesTasa);
			this.jPanelParametrosReportesAccionesTasa.setLayout(gridaBagParametrosReportesAccionesTasa);
			
			
			this.jPanelParametrosAuxiliar1Tasa.setLayout(gridaBagParametrosAuxiliar1Tasa);
			this.jPanelParametrosAuxiliar2Tasa.setLayout(gridaBagParametrosAuxiliar2Tasa);
			this.jPanelParametrosAuxiliar3Tasa.setLayout(gridaBagParametrosAuxiliar3Tasa);
			this.jPanelParametrosAuxiliar4Tasa.setLayout(gridaBagParametrosAuxiliar4Tasa);
			//this.jPanelParametrosAuxiliar5Tasa.setLayout(gridaBagParametrosAuxiliar2Tasa);			
			
			
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTasa.add(this.jButtonRecargarInformacionTasa, this.gridBagConstraintsTasa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tasa.add(this.jComboBoxTiposPaginacionTasa, this.gridBagConstraintsTasa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tasa.add(this.jCheckBoxConAltoMaximoTablaTasa, this.gridBagConstraintsTasa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tasa.add(this.jComboBoxTiposArchivosReportesTasa, this.gridBagConstraintsTasa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTasa.add(this.jPanelParametrosAuxiliar1Tasa, this.gridBagConstraintsTasa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Tasa.add(this.jComboBoxTiposReportesTasa, this.gridBagConstraintsTasa);																		
			
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Tasa.add(this.jComboBoxTiposGraficosReportesTasa, this.gridBagConstraintsTasa);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTasa.add(this.jPanelParametrosAuxiliar4Tasa, this.gridBagConstraintsTasa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTasa.add(this.jComboBoxTiposReportesTasa, this.gridBagConstraintsTasa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTasa.add(this.jCheckBoxGenerarReporteTasa, this.gridBagConstraintsTasa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTasa.add(this.jPanelParametrosAuxiliar2Tasa, this.gridBagConstraintsTasa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTasa.add(this.jLabelAccionesTasa, this.gridBagConstraintsTasa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTasa = new GridBagConstraints();
				this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTasa.add(this.jButtonAbrirOrderByTasa, this.gridBagConstraintsTasa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTasa.add(this.jComboBoxTiposSeleccionarTasa, this.gridBagConstraintsTasa);			
			
			
			/*
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTasa.add(this.jCheckBoxSeleccionarTodosTasa, this.gridBagConstraintsTasa);
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTasa.add(this.jCheckBoxConGraficoReporteTasa, this.gridBagConstraintsTasa);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Tasa.add(this.jCheckBoxSeleccionarTodosTasa, this.gridBagConstraintsTasa);															
				
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Tasa.add(this.jCheckBoxSeleccionadosTasa, this.gridBagConstraintsTasa);															
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTasa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Tasa.add(this.jCheckBoxConGraficoReporteTasa, this.gridBagConstraintsTasa);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTasa.add(this.jPanelParametrosAuxiliar3Tasa, this.gridBagConstraintsTasa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTasa.add(this.jComboBoxTiposRelacionesTasa, this.gridBagConstraintsTasa);
				
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTasa.add(this.jComboBoxTiposAccionesTasa, this.gridBagConstraintsTasa);
	
				
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTasa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTasa.add(this.jTextFieldValorCampoGeneralTasa, this.gridBagConstraintsTasa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTasa = new GridBagLayout();

			this.jScrollPanelDatosTasa.setLayout(gridaBagLayoutDatosTasa);
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = 0;
			this.gridBagConstraintsTasa.gridx = 0;
			
			this.jScrollPanelDatosTasa.add(this.jTableDatosTasa, this.gridBagConstraintsTasa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTasa.setViewportView(this.jTableDatosTasa);
		this.jTableDatosTasa.setFillsViewportHeight(true);
		this.jTableDatosTasa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTasa= new GridBagLayout();
		this.jPanelAccionesTasa.setLayout(gridaBagLayoutAccionesTasa);
		
		
		/*	
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx = 0;
			
		this.jPanelAccionesTasa.add(this.jButtonNuevoTasa, this.gridBagConstraintsTasa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTasa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTasa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tasaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTasa = new GridBagConstraints();						
			this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTasa.gridx = 0;		
			//this.gridBagConstraintsTasa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTasa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTasa, this.gridBagConstraintsTasa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTasa.gridx = 0;		
		//this.gridBagConstraintsTasa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTasa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTasa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTasa, this.gridBagConstraintsTasa);								
		
		
		/*
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTasa, this.gridBagConstraintsTasa);
		*/		
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTasa.gridx =0;
		this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTasa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTasa, this.gridBagConstraintsTasa);
				
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTasa, this.gridBagConstraintsTasa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TasaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTasa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTasa = new GridBagLayout();
			this.jPanelBusquedasParametrosTasa.setLayout(gridaBagLayoutBusquedasParametrosTasa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTasa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTasa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTasa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTasa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTasa, this.gridBagConstraintsTasa);
			
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTasa, this.gridBagConstraintsTasa);
		
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTasa, this.gridBagConstraintsTasa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTasa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTasa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTasa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTasa.setName("jPanelReporteDinamicoTasa"); 
		
		this.jPanelReporteDinamicoTasa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTasa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTasa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTasa.setLayout(gridaBagLayoutReporteDinamicoTasa);
		
		
		this.jInternalFrameReporteDinamicoTasa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTasa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTasa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTasa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTasa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTasa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTasa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTasa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTasa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTasa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTasa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTasa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTasa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTasa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTasa = new JLabelMe();

		this.jLabelColumnasSelectReporteTasa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTasa.add(this.jLabelColumnasSelectReporteTasa, this.gridBagConstraintsTasa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTasa = new JList<Reporte>();
		this.jListColumnasSelectReporteTasa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTasa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTasa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTasa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTasa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTasa=new JScrollPane(this.jListColumnasSelectReporteTasa);
			
			this.jScrollColumnasSelectReporteTasa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTasa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTasa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTasa.add(this.jListColumnasSelectReporteTasa, this.gridBagConstraintsTasa);
		this.jPanelReporteDinamicoTasa.add(this.jScrollColumnasSelectReporteTasa, this.gridBagConstraintsTasa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTasa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTasa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTasa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTasa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTasa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTasa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTasa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTasa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTasa=new JScrollPane(this.jListRelacionesSelectReporteTasa);
			
			this.jScrollRelacionesSelectReporteTasa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTasa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTasa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTasa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTasa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTasa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTasa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTasa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTasa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTasa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTasa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTasa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTasa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTasa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTasa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTasa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTasa = new JLabelMe();

		this.jLabelConGraficoDinamicoTasa.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTasa.add(this.jLabelConGraficoDinamicoTasa, this.gridBagConstraintsTasa);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTasa = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTasa.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTasa.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTasa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTasa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTasa.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jCheckBoxConGraficoDinamicoTasa, this.gridBagConstraintsTasa);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTasa = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTasa.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTasa.add(this.jLabelColumnaCategoriaGraficoTasa, this.gridBagConstraintsTasa);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTasa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTasa.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTasa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTasa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTasa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTasa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTasa.add(this.jComboBoxColumnaCategoriaGraficoTasa, this.gridBagConstraintsTasa);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTasa = new JLabelMe();

		this.jLabelColumnaCategoriaValorTasa.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jLabelColumnaCategoriaValorTasa, this.gridBagConstraintsTasa);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTasa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTasa.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTasa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTasa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTasa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTasa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTasa.add(this.jComboBoxColumnaCategoriaValorTasa, this.gridBagConstraintsTasa);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTasa = new JLabelMe();

		this.jLabelColumnasValoresGraficoTasa.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jLabelColumnasValoresGraficoTasa, this.gridBagConstraintsTasa);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTasa = new JList<Reporte>();
		this.jListColumnasValoresGraficoTasa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTasa.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTasa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTasa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTasa.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTasa=new JScrollPane(this.jListColumnasValoresGraficoTasa);
			
			this.jScrollColumnasValoresGraficoTasa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTasa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTasa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTasa.add(this.jListColumnasSelectReporteTasa, this.gridBagConstraintsTasa);
		this.jPanelReporteDinamicoTasa.add(this.jScrollColumnasValoresGraficoTasa, this.gridBagConstraintsTasa);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTasa = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTasa.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jLabelTiposGraficosReportesDinamicoTasa, this.gridBagConstraintsTasa);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTasa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTasa.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTasa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTasa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTasa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTasa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jComboBoxTiposGraficosReportesDinamicoTasa, this.gridBagConstraintsTasa);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTasa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTasa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jLabelGenerarExcelReporteDinamicoTasa, this.gridBagConstraintsTasa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTasa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTasa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTasa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTasa.setToolTipText("Generar EXCEL"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTasa = new GridBagConstraints();
		//this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTasa.add(this.jButtonGenerarExcelReporteDinamicoTasa, this.gridBagConstraintsTasa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTasa.add(this.jComboBoxTiposReportesDinamicoTasa, this.gridBagConstraintsTasa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTasa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTasa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTasa.add(this.jLabelTiposArchivoReporteDinamicoTasa, this.gridBagConstraintsTasa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTasa.add(this.jComboBoxTiposArchivosReportesDinamicoTasa, this.gridBagConstraintsTasa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTasa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTasa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTasa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTasa.setToolTipText("Generar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTasa.add(this.jButtonGenerarReporteDinamicoTasa, this.gridBagConstraintsTasa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTasa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTasa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTasa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTasa.setToolTipText("Cancelar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTasa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTasa.add(this.jButtonCerrarReporteDinamicoTasa, this.gridBagConstraintsTasa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTasa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTasa= new JScrollPane(jPanelReporteDinamicoTasa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTasa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTasa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTasa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTasa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTasa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTasa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTasa);
		this.jInternalFrameReporteDinamicoTasa.getContentPane().add(this.jScrollPanelReporteDinamicoTasa, this.gridBagConstraintsTasa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTasa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTasa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTasa.setName("jPanelImportacionTasa"); 
		
		this.jPanelImportacionTasa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTasa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTasa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTasa.setLayout(gridaBagLayoutImportacionTasa);
		
		
		this.jInternalFrameImportacionTasa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTasa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTasa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTasa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTasa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTasa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTasa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTasa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTasa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTasa.setResizable(true);
	    this.jInternalFrameImportacionTasa.setClosable(true);
	    this.jInternalFrameImportacionTasa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTasa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTasa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTasa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTasa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTasa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTasa.setResizable(true);
	    this.jInternalFrameImportacionTasa.setClosable(true);
	    this.jInternalFrameImportacionTasa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTasa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTasa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTasa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTasa = new JLabelMe();

		this.jLabelArchivoImportacionTasa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTasa.add(this.jLabelArchivoImportacionTasa, this.gridBagConstraintsTasa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTasa = new JFileChooser();		
		this.jFileChooserImportacionTasa.setToolTipText("ESCOGER ARCHIVO"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTasa = new JButtonMe();
		this.jButtonAbrirImportacionTasa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTasa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTasa.setToolTipText("Generar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTasa.add(this.jButtonAbrirImportacionTasa, this.gridBagConstraintsTasa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTasa = new JLabelMe();

		this.jLabelPathArchivoImportacionTasa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTasa.add(this.jLabelPathArchivoImportacionTasa, this.gridBagConstraintsTasa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTasa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTasa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTasa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTasa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTasa.add(this.jTextFieldPathArchivoImportacionTasa, this.gridBagConstraintsTasa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTasa = new JButtonMe();
		this.jButtonGenerarImportacionTasa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTasa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTasa.setToolTipText("Generar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTasa.add(this.jButtonGenerarImportacionTasa, this.gridBagConstraintsTasa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTasa = new JButtonMe();
		this.jButtonCerrarImportacionTasa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTasa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTasa.setToolTipText("Cancelar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = iPosYImportacion;
		this.gridBagConstraintsTasa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTasa.add(this.jButtonCerrarImportacionTasa, this.gridBagConstraintsTasa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTasa = new GridBagLayout();
		
		this.jScrollPanelImportacionTasa= new JScrollPane(jPanelImportacionTasa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iPosYImportacion;
		this.gridBagConstraintsTasa.gridx =iPosXImportacion;
		this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTasa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTasa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTasa);
		this.jInternalFrameImportacionTasa.getContentPane().add(this.jScrollPanelImportacionTasa, this.gridBagConstraintsTasa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTasa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTasa = new JButtonMe();
			this.jButtonAbrirOrderByTasa.setText("Orden");
			this.jButtonAbrirOrderByTasa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTasa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTasa";
			inputMap = this.jButtonAbrirOrderByTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTasa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTasa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTasa.setName("jPanelOrderByTasa"); 
			
			this.jPanelOrderByTasa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTasa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTasa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTasa.setLayout(gridaBagLayoutOrderByTasa);
			
			
			this.jTableDatosTasaOrderBy = new JTableMe();        
			this.jTableDatosTasaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTasaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTasaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTasaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTasaOrderBy.setViewportView(this.jTableDatosTasaOrderBy);
			this.jTableDatosTasaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTasaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTasa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTasa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTasa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTasa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTasa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTasa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTasa.setTitle("Orden");
			this.jInternalFrameOrderByTasa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTasa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTasa.setResizable(true);
			this.jInternalFrameOrderByTasa.setClosable(true);
			this.jInternalFrameOrderByTasa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTasa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTasa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTasa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTasa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTasa.ipady =150;
				
			this.jPanelOrderByTasa.add(jScrollPanelDatosTasaOrderBy, this.gridBagConstraintsTasa);//this.jTableDatosTasaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTasa = new JButtonMe();
			this.jButtonCerrarOrderByTasa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTasa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTasa.setToolTipText("Cancelar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTasa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTasa.add(this.jButtonCerrarOrderByTasa, this.gridBagConstraintsTasa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTasa = new GridBagLayout();
			
			this.jScrollPanelOrderByTasa= new JScrollPane(jPanelOrderByTasa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTasa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTasa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTasa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTasa);
			
			this.jInternalFrameOrderByTasa.getContentPane().add(this.jScrollPanelOrderByTasa, this.gridBagConstraintsTasa);			
		
		} else {
			this.jButtonAbrirOrderByTasa = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tasaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTasa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTasa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTasa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTasa.getRowHeight();//TasaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TasaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTasa.isSelected()) {
					iHeightTable=TasaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TasaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TasaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TasaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTasa.isSelected()) {
					iHeightTable=TasaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TasaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TasaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTasa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTasa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTasa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTasa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTasa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTasa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTasa!=null && this.jInternalFrameOrderByTasa.getjTableDatosOrderBy()!=null) {
			//if(!this.tasaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTasa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTasa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTasa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTasa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTasa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTasa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTasa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tasaLogic.getTasas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tasas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Tasa> TraerTasaBeans(List<Tasa> tasas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Tasa tasa:tasas) {
					
				if(!(TasaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TasaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tasa.setsDetalleGeneralEntityReporte(TasaConstantesFunciones.getTasaDescripcion(tasa));
										
						
					
						
					
				} else  {
							
					//tasa.setsDetalleGeneralEntityReporte(tasa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tasabeans.add(tasabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tasas;
    }
	//PARA REPORTES FIN
}
