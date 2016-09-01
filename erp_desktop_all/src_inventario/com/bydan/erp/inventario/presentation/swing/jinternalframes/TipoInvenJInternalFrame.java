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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoInvenJInternalFrame extends TipoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoInven;
	
	protected JMenuBar jmenuBarTipoInven;
	
	protected JMenu jmenuTipoInven;
	protected JMenu jmenuDatosTipoInven;
	protected JMenu jmenuArchivoTipoInven;
	protected JMenu jmenuAccionesTipoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInven;	
	protected GridBagConstraints gridBagConstraintsTipoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInvenSessionBean tipoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoInven> tipoinvens;		
	public List<TipoInven> tipoinvensEliminados;	
	public List<TipoInven> tipoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoInven;		
	protected JButton jButtonAbrirOrderByTipoInven;
	
	
	//protected JPanel jPanelOrderByTipoInven;
	//public JScrollPane jScrollPanelOrderByTipoInven;	
	//protected JButton jButtonCerrarOrderByTipoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoInvenLogic tipoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoInven;
	//public JScrollPane jScrollPanelImportacionTipoInven;
	
	
	
	protected JPanel jPanelAccionesTipoInven;
	
    protected JPanel jPanelPaginacionTipoInven;
    protected JPanel jPanelParametrosReportesTipoInven;
	protected JPanel jPanelParametrosReportesAccionesTipoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoInven;
	protected JPanel jPanelParametrosAuxiliar2TipoInven;
	protected JPanel jPanelParametrosAuxiliar3TipoInven;
	protected JPanel jPanelParametrosAuxiliar4TipoInven;
	//protected JPanel jPanelParametrosAuxiliar5TipoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoInven;
	//protected JPanel jPanelImportacionTipoInven;
	
	
	public JTable jTableDatosTipoInven;
	
	
	
	//public JTable jTableDatosTipoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoInven;
	protected JButton jButtonDuplicarTipoInven;
	protected JButton jButtonCopiarTipoInven;
	protected JButton jButtonVerFormTipoInven;
	protected JButton jButtonNuevoRelacionesTipoInven;
	protected JButton jButtonModificarTipoInven;
	
    protected JButton jButtonGuardarCambiosTablaTipoInven;
	protected JButton jButtonCerrarTipoInven;
	
	
	protected JButton jButtonRecargarInformacionTipoInven;
	protected JButton jButtonProcesarInformacionTipoInven;
	
	
	protected JButton jButtonAnterioresTipoInven;
	protected JButton jButtonSiguientesTipoInven;
	protected JButton jButtonNuevoGuardarCambiosTipoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoInven;
	//protected JButton jButtonCerrarReporteDinamicoTipoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoInven;
	//protected JButton jButtonGenerarImportacionTipoInven;
	//protected JButton jButtonCerrarImportacionTipoInven;
	//protected JFileChooser jFileChooserImportacionTipoInven;
	//protected File fileImportacionTipoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInven;
	protected JButton jButtonDuplicarToolBarTipoInven;
	protected JButton jButtonNuevoRelacionesToolBarTipoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoInven;
	protected JButton jButtonCopiarToolBarTipoInven;
	protected JButton jButtonVerFormToolBarTipoInven;
	public JButton jButtonGuardarCambiosTablaToolBarTipoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInven;
	protected JButton jButtonCerrarToolBarTipoInven;
	
	protected JButton jButtonRecargarInformacionToolBarTipoInven;
	protected JButton jButtonProcesarInformacionToolBarTipoInven;
	protected JButton jButtonAnterioresToolBarTipoInven;
	protected JButton jButtonSiguientesToolBarTipoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoInven;
	protected JButton jButtonAbrirOrderByToolBarTipoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInven;
	protected JMenuItem jMenuItemDuplicarTipoInven;
	protected JMenuItem jMenuItemNuevoRelacionesTipoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoInven;
	protected JMenuItem jMenuItemCopiarTipoInven;
	protected JMenuItem jMenuItemVerFormTipoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInven;
	protected JMenuItem jMenuItemCerrarTipoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoInven;
	protected JMenuItem jMenuItemProcesarInformacionTipoInven;
	protected JMenuItem jMenuItemAnterioresTipoInven;
	protected JMenuItem jMenuItemSiguientesTipoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInven;
	protected JMenuItem jMenuItemAbrirOrderByTipoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoInven;
	protected JCheckBox jCheckBoxSeleccionadosTipoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoInven;
	protected JCheckBox jCheckBoxConGraficoReporteTipoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoInven;
	protected JTextField jTextFieldValorCampoGeneralTipoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoInven;
	//public JList<Reporte> jListColumnasSelectReporteTipoInven;
	//public JScrollPane jScrollColumnasSelectReporteTipoInven;
	
	//public JLabel jLabelRelacionesSelectReporteTipoInven;
	//public JList<Reporte> jListRelacionesSelectReporteTipoInven;
	//public JScrollPane jScrollRelacionesSelectReporteTipoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoInven;
	
		
	//public JLabel jLabelArchivoImportacionTipoInven;	
	//public JLabel jLabelPathArchivoImportacionTipoInven;
	//protected JTextField jTextFieldPathArchivoImportacionTipoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoInven;
	
	//public JLabel jLabelColumnaCategoriaValorTipoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoInven;
	
	//public JLabel jLabelColumnasValoresGraficoTipoInven;
	//public JList<Reporte> jListColumnasValoresGraficoTipoInven;
	//public JScrollPane jScrollColumnasValoresGraficoTipoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoInven;
	
	
	
	
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
	public TipoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoInven)	{
		this.jButtonRecargarInformacionTipoInven = jButtonRecargarInformacionTipoInven;
	}
	
	public JButton getjButtonProcesarInformacionTipoInven() {
		return this.jButtonProcesarInformacionTipoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInven)	{
		this.jButtonProcesarInformacionTipoInven = jButtonProcesarInformacionTipoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoInven() {
		return this.jButtonRecargarInformacionTipoInven;
	}
	
	
	public List<TipoInven> gettipoinvens() {
		return this.tipoinvens;
	}

	public void settipoinvens(List<TipoInven> tipoinvens) {
		this.tipoinvens = tipoinvens;
	}
	
	public List<TipoInven> gettipoinvensAux() {
		return this.tipoinvensAux;
	}

	public void settipoinvensAux(List<TipoInven> tipoinvensAux) {
		this.tipoinvensAux = tipoinvensAux;
	}
	
	public List<TipoInven> gettipoinvensEliminados() {
		return this.tipoinvensEliminados;
	}

	public void setTipoInvensEliminados(List<TipoInven> tipoinvensEliminados) {
		this.tipoinvensEliminados = tipoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoInven() {
		return jComboBoxTiposSeleccionarTipoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoInven(
			JComboBox jComboBoxTiposSeleccionarTipoInven) {
		this.jComboBoxTiposSeleccionarTipoInven = jComboBoxTiposSeleccionarTipoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoInven() {
		return jTextFieldValorCampoGeneralTipoInven;
	}

	public void setjTextFieldValorCampoGeneralTipoInven(
			JTextField jTextFieldValorCampoGeneralTipoInven) {
		this.jTextFieldValorCampoGeneralTipoInven = jTextFieldValorCampoGeneralTipoInven;
	}

	public void setBorderResaltarValorCampoGeneralTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoInven() {
		return this.jCheckBoxSeleccionarTodosTipoInven;
	}

	public void setjCheckBoxSeleccionarTodosTipoInven(
			JCheckBox jCheckBoxSeleccionarTodosTipoInven) {
		this.jCheckBoxSeleccionarTodosTipoInven = jCheckBoxSeleccionarTodosTipoInven;
	}

	public void setBorderResaltarSeleccionarTodosTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoInven() {
		return this.jCheckBoxSeleccionadosTipoInven;
	}

	public void setjCheckBoxSeleccionadosTipoInven(
			JCheckBox jCheckBoxSeleccionadosTipoInven) {
		this.jCheckBoxSeleccionadosTipoInven = jCheckBoxSeleccionadosTipoInven;
	}
	
	public void setBorderResaltarSeleccionadosTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoInven() {
		return this.jComboBoxTiposArchivosReportesTipoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoInven(
			JComboBox jComboBoxTiposArchivosReportesTipoInven) {
		this.jComboBoxTiposArchivosReportesTipoInven = jComboBoxTiposArchivosReportesTipoInven;
	}

	public void setBorderResaltarTiposArchivosReportesTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoInven() {
		return this.jComboBoxTiposReportesTipoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoInven(
			JComboBox jComboBoxTiposReportesTipoInven) {
		this.jComboBoxTiposReportesTipoInven = jComboBoxTiposReportesTipoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoInven() {
	//	return jComboBoxTiposReportesDinamicoTipoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoInven) {
	//	this.jComboBoxTiposReportesDinamicoTipoInven = jComboBoxTiposReportesDinamicoTipoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoInven = jComboBoxTiposArchivosReportesDinamicoTipoInven;
	//}
	
	public void setBorderResaltarTiposReportesTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoInven() {
		return this.jComboBoxTiposGraficosReportesTipoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoInven(
			JComboBox jComboBoxTiposGraficosReportesTipoInven) {
		this.jComboBoxTiposGraficosReportesTipoInven = jComboBoxTiposGraficosReportesTipoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoInven() {
		return this.jComboBoxTiposPaginacionTipoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoInven(
			JComboBox jComboBoxTiposPaginacionTipoInven) {
		this.jComboBoxTiposPaginacionTipoInven = jComboBoxTiposPaginacionTipoInven;
	}
	
	public void setBorderResaltarTiposPaginacionTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoInven() {
		return this.jComboBoxTiposRelacionesTipoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInven() {
		return this.jComboBoxTiposAccionesTipoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInven(
			JComboBox jComboBoxTiposRelacionesTipoInven) {
		this.jComboBoxTiposRelacionesTipoInven = jComboBoxTiposRelacionesTipoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInven(
			JComboBox jComboBoxTiposAccionesTipoInven) {
		this.jComboBoxTiposAccionesTipoInven = jComboBoxTiposAccionesTipoInven;
	}
	
	public void setBorderResaltarTiposRelacionesTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoInven() {
	//	return jCheckBoxConGraficoDinamicoTipoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoInven) {
	//	this.jCheckBoxConGraficoDinamicoTipoInven = jCheckBoxConGraficoDinamicoTipoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoInven .setBorder(borderResaltar);		
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
		this.tipoinvenSessionBean=new TipoInvenSessionBean();
		
		this.tipoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoInven,this.jTtoolBarTipoInven,
							"nuevo","nuevo","Nuevo"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoInven,this.jTtoolBarTipoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoInven,this.jTtoolBarTipoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoInven,this.jTtoolBarTipoInven,
							"duplicar","duplicar","Duplicar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoInven,this.jTtoolBarTipoInven,
							"copiar","copiar","Copiar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoInven,this.jTtoolBarTipoInven,
							"ver_form","ver_form","Ver"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInven,this.jTtoolBarTipoInven,
							"recargar","recargar","Recargar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInven,this.jTtoolBarTipoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInven,this.jTtoolBarTipoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoInven,this.jTtoolBarTipoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoInven,this.jTtoolBarTipoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoInven,this.jTtoolBarTipoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoInven,this.jTtoolBarTipoInven,
							"cerrar","cerrar","Salir"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoInven;
			
				this.jButtonProcesarInformacionToolBarTipoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoInven;
				
		//protected JButton jButtonModificarToolBarTipoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoInven=new JMenuMe("General");
		this.jmenuArchivoTipoInven=new JMenuMe("Archivo");
		this.jmenuAccionesTipoInven=new JMenuMe("Acciones");
		this.jmenuDatosTipoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoInven.add(this.jMenuItemCerrarTipoInven);
			
			this.jmenuAccionesTipoInven.add(this.jMenuItemNuevoTipoInven);
			this.jmenuAccionesTipoInven.add(this.jMenuItemNuevoGuardarCambiosTipoInven);
			this.jmenuAccionesTipoInven.add(this.jMenuItemNuevoRelacionesTipoInven);
			this.jmenuAccionesTipoInven.add(this.jMenuItemGuardarCambiosTablaTipoInven);		
			this.jmenuAccionesTipoInven.add(this.jMenuItemDuplicarTipoInven);		
			this.jmenuAccionesTipoInven.add(this.jMenuItemCopiarTipoInven);		
			this.jmenuAccionesTipoInven.add(this.jMenuItemVerFormTipoInven);		
			
			this.jmenuDatosTipoInven.add(this.jMenuItemRecargarInformacionTipoInven);				
			this.jmenuDatosTipoInven.add(this.jMenuItemAnterioresTipoInven);				
			this.jmenuDatosTipoInven.add(this.jMenuItemSiguientesTipoInven);				
			this.jmenuDatosTipoInven.add(this.jMenuItemAbrirOrderByTipoInven);				
			this.jmenuDatosTipoInven.add(this.jMenuItemMostrarOcultarTipoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoInven.add(this.jMenuItemGuardarCambiosTipoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoInven.add(this.jmenuArchivoTipoInven);		
			this.jmenuBarTipoInven.add(this.jmenuAccionesTipoInven);		
			this.jmenuBarTipoInven.add(this.jmenuDatosTipoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoInven = new TipoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Inven DATOS");
			this.jInternalFrameDetalleFormTipoInven = new TipoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoinvenSessionBean.getConGuardarRelaciones(),this.tipoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoInven = null;//new TipoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInven= new GridBagLayout();
		
		
		this.jTableDatosTipoInven = new JTableMe();      
		
		String sToolTipTipoInven="";
		sToolTipTipoInven=TipoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInven+="(Inventario.TipoInven)";
		}
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoInven.setToolTipText(sToolTipTipoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoInven);
		this.jTableDatosTipoInven.setAutoCreateRowSorter(true);
		this.jTableDatosTipoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoInven.setRowSelectionAllowed(true);
		this.jTableDatosTipoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoInven = new JButtonMe();
		this.jButtonDuplicarTipoInven = new JButtonMe();
		this.jButtonCopiarTipoInven = new JButtonMe();
		this.jButtonVerFormTipoInven = new JButtonMe();
		this.jButtonNuevoRelacionesTipoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoInven = new JButtonMe();
		this.jButtonCerrarTipoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Inven";
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoInven=new ReporteDinamicoJInternalFrame(TipoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoInven=new ImportacionJInternalFrame(TipoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoInven.setText("Orden");
		this.jButtonAbrirOrderByTipoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInven,false,this);
			
			//this.cargarOrderByTipoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInven,true,this);
			
			//this.cargarOrderByTipoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoInven.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInven.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInven.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoInven.setText("Nuevo");
		this.jButtonDuplicarTipoInven.setText("Duplicar");
		this.jButtonCopiarTipoInven.setText("Copiar");
		this.jButtonVerFormTipoInven.setText("Ver");
		this.jButtonNuevoRelacionesTipoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoInven.setText("Guardar");
		this.jButtonCerrarTipoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInven,"nuevo_button","Nuevo",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoInven,"duplicar_button","Duplicar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoInven,"copiar_button","Copiar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoInven,"ver_form","Ver",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoInven,"nuevorelaciones_button","Nuevo Rel",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInven,"guardarcambiostabla_button","Guardar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInven,"cerrar_button","Salir",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoInven.setToolTipText("Nuevo"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoInven.setToolTipText("Duplicar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoInven.setToolTipText("Copiar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoInven.setToolTipText("Ver"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoInven.setToolTipText("Nuevo Rel"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoInven.setToolTipText("Guardar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInven.setToolTipText("Salir"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInven";
		inputMap = this.jButtonNuevoTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoInven";
		inputMap = this.jButtonDuplicarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoInven"));
		
		//COPIAR
		sMapKey = "CopiarTipoInven";
		inputMap = this.jButtonCopiarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoInven"));
		
		//VEr FORM
		sMapKey = "VerFormTipoInven";
		inputMap = this.jButtonVerFormTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoInven";
		inputMap = this.jButtonNuevoRelacionesTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoInven";
		inputMap = this.jButtonModificarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoInven";
		inputMap = this.jButtonCerrarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoInven.setName("jPanelParametrosReportesTipoInven"); 
		
		this.jPanelParametrosReportesAccionesTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoInven.setName("jPanelParametrosReportesAccionesTipoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoInven = new JButtonMe();
		this.jButtonRecargarInformacionTipoInven.setText("Recargar");
		this.jButtonRecargarInformacionTipoInven.setToolTipText("Recargar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoInven = new JButtonMe();
		this.jButtonProcesarInformacionTipoInven.setText("Procesar");
		this.jButtonProcesarInformacionTipoInven.setToolTipText("Procesar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoInven.setVisible(false);
			
		this.jButtonProcesarInformacionTipoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInven.setText("TIPO");       
		this.jComboBoxTiposReportesTipoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoInven.setText("Accion");
		this.jComboBoxTiposRelacionesTipoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoInven = new JLabelMe();
		
		this.jLabelAccionesTipoInven.setText("Acciones");		
		this.jLabelAccionesTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoInven = new JButtonMe();
		//this.jButtonAnterioresTipoInven.setText("<<");
        this.jButtonAnterioresTipoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoInven = new JButtonMe();
		//this.jButtonSiguientesTipoInven.setText(">>");
        this.jButtonSiguientesTipoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoInven,"nuevoguardarcambios_button","Nue",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoInven";
		inputMap = this.jButtonNuevoGuardarCambiosTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoInven";
		inputMap = this.jButtonRecargarInformacionTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoInven";
		inputMap = this.jButtonSiguientesTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoInven";
		inputMap = this.jButtonAnterioresTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoInven.setMinimumSize(new Dimension(this.getWidth(),TipoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInven.setMaximumSize(new Dimension(this.getWidth(),TipoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInven.setPreferredSize(new Dimension(this.getWidth(),TipoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoInven = new GridBagLayout();

			this.jPanelPaginacionTipoInven.setLayout(gridaBagLayoutPaginacionTipoInven);						
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 0;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoInven.add(this.jButtonAnterioresTipoInven, this.gridBagConstraintsTipoInven);
					
						
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInven.gridy = 0;
			
			this.jPanelPaginacionTipoInven.add(this.jButtonNuevoGuardarCambiosTipoInven, this.gridBagConstraintsTipoInven);
						
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInven.gridy = 0;
			this.jPanelPaginacionTipoInven.add(this.jButtonSiguientesTipoInven, this.gridBagConstraintsTipoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 1;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInven.add(this.jButtonNuevoTipoInven, this.gridBagConstraintsTipoInven);
						
			
			
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInven.gridy = 1;
				this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoInven.add(this.jButtonGuardarCambiosTablaTipoInven, this.gridBagConstraintsTipoInven);
			}
			
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 1;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInven.add(this.jButtonDuplicarTipoInven, this.gridBagConstraintsTipoInven);
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 1;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInven.add(this.jButtonCopiarTipoInven, this.gridBagConstraintsTipoInven);
		
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 1;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInven.add(this.jButtonVerFormTipoInven, this.gridBagConstraintsTipoInven);
		
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 1;
			this.gridBagConstraintsTipoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoInven.add(this.jButtonCerrarTipoInven, this.gridBagConstraintsTipoInven);
		
		
		
		this.jButtonRecargarInformacionTipoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoInven.setLayout(gridaBagParametrosReportesTipoInven);
			this.jPanelParametrosReportesAccionesTipoInven.setLayout(gridaBagParametrosReportesAccionesTipoInven);
			
			
			this.jPanelParametrosAuxiliar1TipoInven.setLayout(gridaBagParametrosAuxiliar1TipoInven);
			this.jPanelParametrosAuxiliar2TipoInven.setLayout(gridaBagParametrosAuxiliar2TipoInven);
			this.jPanelParametrosAuxiliar3TipoInven.setLayout(gridaBagParametrosAuxiliar3TipoInven);
			this.jPanelParametrosAuxiliar4TipoInven.setLayout(gridaBagParametrosAuxiliar4TipoInven);
			//this.jPanelParametrosAuxiliar5TipoInven.setLayout(gridaBagParametrosAuxiliar2TipoInven);			
			
			
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInven.add(this.jButtonRecargarInformacionTipoInven, this.gridBagConstraintsTipoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInven.add(this.jComboBoxTiposPaginacionTipoInven, this.gridBagConstraintsTipoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInven.add(this.jCheckBoxConAltoMaximoTablaTipoInven, this.gridBagConstraintsTipoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInven.add(this.jComboBoxTiposArchivosReportesTipoInven, this.gridBagConstraintsTipoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInven.add(this.jPanelParametrosAuxiliar1TipoInven, this.gridBagConstraintsTipoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoInven.add(this.jComboBoxTiposReportesTipoInven, this.gridBagConstraintsTipoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInven.add(this.jPanelParametrosAuxiliar4TipoInven, this.gridBagConstraintsTipoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInven.add(this.jComboBoxTiposReportesTipoInven, this.gridBagConstraintsTipoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInven.add(this.jCheckBoxGenerarReporteTipoInven, this.gridBagConstraintsTipoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInven.add(this.jPanelParametrosAuxiliar2TipoInven, this.gridBagConstraintsTipoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInven.add(this.jLabelAccionesTipoInven, this.gridBagConstraintsTipoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoInven.add(this.jButtonAbrirOrderByTipoInven, this.gridBagConstraintsTipoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInven.add(this.jComboBoxTiposSeleccionarTipoInven, this.gridBagConstraintsTipoInven);			
			
			
			/*
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInven.add(this.jCheckBoxSeleccionarTodosTipoInven, this.gridBagConstraintsTipoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInven.add(this.jCheckBoxSeleccionarTodosTipoInven, this.gridBagConstraintsTipoInven);															
				
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInven.add(this.jCheckBoxSeleccionadosTipoInven, this.gridBagConstraintsTipoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInven.add(this.jPanelParametrosAuxiliar3TipoInven, this.gridBagConstraintsTipoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInven.add(this.jComboBoxTiposAccionesTipoInven, this.gridBagConstraintsTipoInven);
	
				
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInven.add(this.jTextFieldValorCampoGeneralTipoInven, this.gridBagConstraintsTipoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoInven = new GridBagLayout();

			this.jScrollPanelDatosTipoInven.setLayout(gridaBagLayoutDatosTipoInven);
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = 0;
			this.gridBagConstraintsTipoInven.gridx = 0;
			
			this.jScrollPanelDatosTipoInven.add(this.jTableDatosTipoInven, this.gridBagConstraintsTipoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoInven.setViewportView(this.jTableDatosTipoInven);
		this.jTableDatosTipoInven.setFillsViewportHeight(true);
		this.jTableDatosTipoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoInven= new GridBagLayout();
		this.jPanelAccionesTipoInven.setLayout(gridaBagLayoutAccionesTipoInven);
		
		
		/*	
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = 0;
			
		this.jPanelAccionesTipoInven.add(this.jButtonNuevoTipoInven, this.gridBagConstraintsTipoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInven.gridx = 0;		
			//this.gridBagConstraintsTipoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoInven, this.gridBagConstraintsTipoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoInven.gridx = 0;		
		//this.gridBagConstraintsTipoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoInven, this.gridBagConstraintsTipoInven);								
		
		
		/*
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoInven, this.gridBagConstraintsTipoInven);
		*/		
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInven.gridx =0;
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInven, this.gridBagConstraintsTipoInven);
				
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoInven, this.gridBagConstraintsTipoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoInven.setLayout(gridaBagLayoutBusquedasParametrosTipoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInven, this.gridBagConstraintsTipoInven);
			
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInven, this.gridBagConstraintsTipoInven);
		
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInven, this.gridBagConstraintsTipoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoInven.setName("jPanelReporteDinamicoTipoInven"); 
		
		this.jPanelReporteDinamicoTipoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoInven.setLayout(gridaBagLayoutReporteDinamicoTipoInven);
		
		
		this.jInternalFrameReporteDinamicoTipoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInven.add(this.jLabelColumnasSelectReporteTipoInven, this.gridBagConstraintsTipoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoInven=new JScrollPane(this.jListColumnasSelectReporteTipoInven);
			
			this.jScrollColumnasSelectReporteTipoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInven.add(this.jListColumnasSelectReporteTipoInven, this.gridBagConstraintsTipoInven);
		this.jPanelReporteDinamicoTipoInven.add(this.jScrollColumnasSelectReporteTipoInven, this.gridBagConstraintsTipoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoInven=new JScrollPane(this.jListRelacionesSelectReporteTipoInven);
			
			this.jScrollRelacionesSelectReporteTipoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInven.add(this.jLabelGenerarExcelReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoInven.setToolTipText("Generar EXCEL"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoInven.add(this.jButtonGenerarExcelReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInven.add(this.jComboBoxTiposReportesDinamicoTipoInven, this.gridBagConstraintsTipoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInven.add(this.jLabelTiposArchivoReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInven.add(this.jComboBoxTiposArchivosReportesDinamicoTipoInven, this.gridBagConstraintsTipoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoInven.setToolTipText("Generar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInven.add(this.jButtonGenerarReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoInven.setToolTipText("Cancelar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInven.add(this.jButtonCerrarReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoInven= new JScrollPane(jPanelReporteDinamicoTipoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoInven);
		this.jInternalFrameReporteDinamicoTipoInven.getContentPane().add(this.jScrollPanelReporteDinamicoTipoInven, this.gridBagConstraintsTipoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoInven.setName("jPanelImportacionTipoInven"); 
		
		this.jPanelImportacionTipoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoInven.setLayout(gridaBagLayoutImportacionTipoInven);
		
		
		this.jInternalFrameImportacionTipoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoInven = new JLabelMe();

		this.jLabelArchivoImportacionTipoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInven.add(this.jLabelArchivoImportacionTipoInven, this.gridBagConstraintsTipoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoInven = new JFileChooser();		
		this.jFileChooserImportacionTipoInven.setToolTipText("ESCOGER ARCHIVO"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoInven = new JButtonMe();
		this.jButtonAbrirImportacionTipoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoInven.setToolTipText("Generar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInven.add(this.jButtonAbrirImportacionTipoInven, this.gridBagConstraintsTipoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInven.add(this.jLabelPathArchivoImportacionTipoInven, this.gridBagConstraintsTipoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInven.add(this.jTextFieldPathArchivoImportacionTipoInven, this.gridBagConstraintsTipoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoInven = new JButtonMe();
		this.jButtonGenerarImportacionTipoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoInven.setToolTipText("Generar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInven.add(this.jButtonGenerarImportacionTipoInven, this.gridBagConstraintsTipoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoInven = new JButtonMe();
		this.jButtonCerrarImportacionTipoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoInven.setToolTipText("Cancelar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInven.add(this.jButtonCerrarImportacionTipoInven, this.gridBagConstraintsTipoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoInven= new JScrollPane(jPanelImportacionTipoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoInven);
		this.jInternalFrameImportacionTipoInven.getContentPane().add(this.jScrollPanelImportacionTipoInven, this.gridBagConstraintsTipoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoInven = new JButtonMe();
			this.jButtonAbrirOrderByTipoInven.setText("Orden");
			this.jButtonAbrirOrderByTipoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoInven";
			inputMap = this.jButtonAbrirOrderByTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoInven.setName("jPanelOrderByTipoInven"); 
			
			this.jPanelOrderByTipoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoInven.setLayout(gridaBagLayoutOrderByTipoInven);
			
			
			this.jTableDatosTipoInvenOrderBy = new JTableMe();        
			this.jTableDatosTipoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoInvenOrderBy.setViewportView(this.jTableDatosTipoInvenOrderBy);
			this.jTableDatosTipoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoInven.setTitle("Orden");
			this.jInternalFrameOrderByTipoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoInven.setResizable(true);
			this.jInternalFrameOrderByTipoInven.setClosable(true);
			this.jInternalFrameOrderByTipoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoInven.ipady =150;
				
			this.jPanelOrderByTipoInven.add(jScrollPanelDatosTipoInvenOrderBy, this.gridBagConstraintsTipoInven);//this.jTableDatosTipoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoInven = new JButtonMe();
			this.jButtonCerrarOrderByTipoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoInven.setToolTipText("Cancelar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoInven.add(this.jButtonCerrarOrderByTipoInven, this.gridBagConstraintsTipoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoInven= new JScrollPane(jPanelOrderByTipoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoInven);
			
			this.jInternalFrameOrderByTipoInven.getContentPane().add(this.jScrollPanelOrderByTipoInven, this.gridBagConstraintsTipoInven);			
		
		} else {
			this.jButtonAbrirOrderByTipoInven = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoInven.getRowHeight();//TipoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInven.isSelected()) {
					iHeightTable=TipoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInven.isSelected()) {
					iHeightTable=TipoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoInven!=null && this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoinvenLogic.getTipoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoInven> TraerTipoInvenBeans(List<TipoInven> tipoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoInven tipoinven:tipoinvens) {
					
				if(!(TipoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoinven.setsDetalleGeneralEntityReporte(TipoInvenConstantesFunciones.getTipoInvenDescripcion(tipoinven));
										
						
					
						
					
				} else  {
							
					//tipoinven.setsDetalleGeneralEntityReporte(tipoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoinvenbeans.add(tipoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoinvens;
    }
	//PARA REPORTES FIN
}
