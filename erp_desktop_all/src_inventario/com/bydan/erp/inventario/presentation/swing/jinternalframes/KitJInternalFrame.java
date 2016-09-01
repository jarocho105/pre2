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
import com.bydan.erp.inventario.util.KitConstantesFunciones;

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
public class KitJInternalFrame extends KitBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarKit;
	
	protected JMenuBar jmenuBarKit;
	
	protected JMenu jmenuKit;
	protected JMenu jmenuDatosKit;
	protected JMenu jmenuArchivoKit;
	protected JMenu jmenuAccionesKit;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutKit;	
	protected GridBagConstraints gridBagConstraintsKit;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public KitDetalleFormJInternalFrame jInternalFrameDetalleFormKit;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoKit;	
	protected ImportacionJInternalFrame jInternalFrameImportacionKit;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public KitSessionBean kitSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Kit> kits;		
	public List<Kit> kitsEliminados;	
	public List<Kit> kitsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByKit;		
	protected JButton jButtonAbrirOrderByKit;
	
	
	//protected JPanel jPanelOrderByKit;
	//public JScrollPane jScrollPanelOrderByKit;	
	//protected JButton jButtonCerrarOrderByKit;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public KitLogic kitLogic;
	
	
	
	public JScrollPane jScrollPanelDatosKit;
	public JScrollPane jScrollPanelDatosEdicionKit;
	public JScrollPane jScrollPanelDatosGeneralKit;
    
	
	
	//public JScrollPane jScrollPanelDatosKitOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoKit;
	//public JScrollPane jScrollPanelImportacionKit;
	
	
	
	protected JPanel jPanelAccionesKit;
	
    protected JPanel jPanelPaginacionKit;
    protected JPanel jPanelParametrosReportesKit;
	protected JPanel jPanelParametrosReportesAccionesKit;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Kit;
	protected JPanel jPanelParametrosAuxiliar2Kit;
	protected JPanel jPanelParametrosAuxiliar3Kit;
	protected JPanel jPanelParametrosAuxiliar4Kit;
	//protected JPanel jPanelParametrosAuxiliar5Kit;
	
	
	
	//protected JPanel jPanelReporteDinamicoKit;
	//protected JPanel jPanelImportacionKit;
	
	
	public JTable jTableDatosKit;
	
	
	
	//public JTable jTableDatosKitOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoKit;
	protected JButton jButtonDuplicarKit;
	protected JButton jButtonCopiarKit;
	protected JButton jButtonVerFormKit;
	protected JButton jButtonNuevoRelacionesKit;
	protected JButton jButtonModificarKit;
	
    protected JButton jButtonGuardarCambiosTablaKit;
	protected JButton jButtonCerrarKit;
	
	
	protected JButton jButtonRecargarInformacionKit;
	protected JButton jButtonProcesarInformacionKit;
	
	
	protected JButton jButtonAnterioresKit;
	protected JButton jButtonSiguientesKit;
	protected JButton jButtonNuevoGuardarCambiosKit;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoKit;
	//protected JButton jButtonCerrarReporteDinamicoKit;
	//protected JButton jButtonGenerarExcelReporteDinamicoKit;	
	
	
	
	//protected JButton jButtonAbrirImportacionKit;
	//protected JButton jButtonGenerarImportacionKit;
	//protected JButton jButtonCerrarImportacionKit;
	//protected JFileChooser jFileChooserImportacionKit;
	//protected File fileImportacionKit;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarKit;
	protected JButton jButtonDuplicarToolBarKit;
	protected JButton jButtonNuevoRelacionesToolBarKit;
	
	
	public JButton jButtonGuardarCambiosToolBarKit;
	protected JButton jButtonCopiarToolBarKit;
	protected JButton jButtonVerFormToolBarKit;
	public JButton jButtonGuardarCambiosTablaToolBarKit;
	protected JButton jButtonMostrarOcultarTablaToolBarKit;
	protected JButton jButtonCerrarToolBarKit;
	
	protected JButton jButtonRecargarInformacionToolBarKit;
	protected JButton jButtonProcesarInformacionToolBarKit;
	protected JButton jButtonAnterioresToolBarKit;
	protected JButton jButtonSiguientesToolBarKit;
	protected JButton jButtonNuevoGuardarCambiosToolBarKit;
	protected JButton jButtonAbrirOrderByToolBarKit;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoKit;
	protected JMenuItem jMenuItemDuplicarKit;
	protected JMenuItem jMenuItemNuevoRelacionesKit;
	
	
	protected JMenuItem jMenuItemGuardarCambiosKit;
	protected JMenuItem jMenuItemCopiarKit;
	protected JMenuItem jMenuItemVerFormKit;
	protected JMenuItem jMenuItemGuardarCambiosTablaKit;
	protected JMenuItem jMenuItemCerrarKit;
	protected JMenuItem jMenuItemDetalleCerrarKit;
	protected JMenuItem jMenuItemDetalleAbrirOrderByKit;
	protected JMenuItem jMenuItemDetalleMostarOcultarKit;
	
	protected JMenuItem jMenuItemRecargarInformacionKit;
	protected JMenuItem jMenuItemProcesarInformacionKit;
	protected JMenuItem jMenuItemAnterioresKit;
	protected JMenuItem jMenuItemSiguientesKit;
	protected JMenuItem jMenuItemNuevoGuardarCambiosKit;
	protected JMenuItem jMenuItemAbrirOrderByKit;
	protected JMenuItem jMenuItemMostrarOcultarKit;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesKit;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosKit;
	protected JCheckBox jCheckBoxSeleccionadosKit;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaKit;
	protected JCheckBox jCheckBoxConGraficoReporteKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesKit;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoKit;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoKit;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarKit;
	protected JTextField jTextFieldValorCampoGeneralKit;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteKit;
	//public JList<Reporte> jListColumnasSelectReporteKit;
	//public JScrollPane jScrollColumnasSelectReporteKit;
	
	//public JLabel jLabelRelacionesSelectReporteKit;
	//public JList<Reporte> jListRelacionesSelectReporteKit;
	//public JScrollPane jScrollRelacionesSelectReporteKit;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoKit;
	//protected JCheckBox jCheckBoxConGraficoDinamicoKit;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoKit;
	//public JLabel jLabelTiposArchivoReporteDinamicoKit;
	
		
	//public JLabel jLabelArchivoImportacionKit;	
	//public JLabel jLabelPathArchivoImportacionKit;
	//protected JTextField jTextFieldPathArchivoImportacionKit;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoKit;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoKit;
	
	//public JLabel jLabelColumnaCategoriaValorKit;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorKit;
	
	//public JLabel jLabelColumnasValoresGraficoKit;
	//public JList<Reporte> jListColumnasValoresGraficoKit;
	//public JScrollPane jScrollColumnasValoresGraficoKit;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoKit;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoKit;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasKit;
	
	
	
	
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
	public KitJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public KitJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionKit)	{
		this.jButtonRecargarInformacionKit = jButtonRecargarInformacionKit;
	}
	
	public JButton getjButtonProcesarInformacionKit() {
		return this.jButtonProcesarInformacionKit;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionKit)	{
		this.jButtonProcesarInformacionKit = jButtonProcesarInformacionKit;
	}
	
	
	public JButton getjButtonRecargarInformacionKit() {
		return this.jButtonRecargarInformacionKit;
	}
	
	
	public List<Kit> getkits() {
		return this.kits;
	}

	public void setkits(List<Kit> kits) {
		this.kits = kits;
	}
	
	public List<Kit> getkitsAux() {
		return this.kitsAux;
	}

	public void setkitsAux(List<Kit> kitsAux) {
		this.kitsAux = kitsAux;
	}
	
	public List<Kit> getkitsEliminados() {
		return this.kitsEliminados;
	}

	public void setKitsEliminados(List<Kit> kitsEliminados) {
		this.kitsEliminados = kitsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarKit() {
		return jComboBoxTiposSeleccionarKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarKit(
			JComboBox jComboBoxTiposSeleccionarKit) {
		this.jComboBoxTiposSeleccionarKit = jComboBoxTiposSeleccionarKit;
	}
	
	public void setBorderResaltarTiposSeleccionarKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarKit .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralKit() {
		return jTextFieldValorCampoGeneralKit;
	}

	public void setjTextFieldValorCampoGeneralKit(
			JTextField jTextFieldValorCampoGeneralKit) {
		this.jTextFieldValorCampoGeneralKit = jTextFieldValorCampoGeneralKit;
	}

	public void setBorderResaltarValorCampoGeneralKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralKit .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosKit() {
		return this.jCheckBoxSeleccionarTodosKit;
	}

	public void setjCheckBoxSeleccionarTodosKit(
			JCheckBox jCheckBoxSeleccionarTodosKit) {
		this.jCheckBoxSeleccionarTodosKit = jCheckBoxSeleccionarTodosKit;
	}

	public void setBorderResaltarSeleccionarTodosKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosKit .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosKit() {
		return this.jCheckBoxSeleccionadosKit;
	}

	public void setjCheckBoxSeleccionadosKit(
			JCheckBox jCheckBoxSeleccionadosKit) {
		this.jCheckBoxSeleccionadosKit = jCheckBoxSeleccionadosKit;
	}
	
	public void setBorderResaltarSeleccionadosKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosKit .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesKit() {
		return this.jComboBoxTiposArchivosReportesKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesKit(
			JComboBox jComboBoxTiposArchivosReportesKit) {
		this.jComboBoxTiposArchivosReportesKit = jComboBoxTiposArchivosReportesKit;
	}

	public void setBorderResaltarTiposArchivosReportesKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesKit() {
		return this.jComboBoxTiposReportesKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesKit(
			JComboBox jComboBoxTiposReportesKit) {
		this.jComboBoxTiposReportesKit = jComboBoxTiposReportesKit;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoKit() {
	//	return jComboBoxTiposReportesDinamicoKit;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoKit(
	//		JComboBox jComboBoxTiposReportesDinamicoKit) {
	//	this.jComboBoxTiposReportesDinamicoKit = jComboBoxTiposReportesDinamicoKit;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoKit() {
	//	return jComboBoxTiposArchivosReportesDinamicoKit;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoKit(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoKit) {
	//	this.jComboBoxTiposArchivosReportesDinamicoKit = jComboBoxTiposArchivosReportesDinamicoKit;
	//}
	
	public void setBorderResaltarTiposReportesKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesKit() {
		return this.jComboBoxTiposGraficosReportesKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesKit(
			JComboBox jComboBoxTiposGraficosReportesKit) {
		this.jComboBoxTiposGraficosReportesKit = jComboBoxTiposGraficosReportesKit;
	}
	
	public void setBorderResaltarTiposGraficosReportesKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionKit() {
		return this.jComboBoxTiposPaginacionKit;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionKit(
			JComboBox jComboBoxTiposPaginacionKit) {
		this.jComboBoxTiposPaginacionKit = jComboBoxTiposPaginacionKit;
	}
	
	public void setBorderResaltarTiposPaginacionKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionKit .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesKit() {
		return this.jComboBoxTiposRelacionesKit;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesKit() {
		return this.jComboBoxTiposAccionesKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesKit(
			JComboBox jComboBoxTiposRelacionesKit) {
		this.jComboBoxTiposRelacionesKit = jComboBoxTiposRelacionesKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesKit(
			JComboBox jComboBoxTiposAccionesKit) {
		this.jComboBoxTiposAccionesKit = jComboBoxTiposAccionesKit;
	}
	
	public void setBorderResaltarTiposRelacionesKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesKit .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesKit() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarKit.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesKit .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoKit() {
	//	return jCheckBoxConGraficoDinamicoKit;
	//}

	//public void setjCheckBoxConGraficoDinamicoKit(
	//		JCheckBox jCheckBoxConGraficoDinamicoKit) {
	//	this.jCheckBoxConGraficoDinamicoKit = jCheckBoxConGraficoDinamicoKit;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoKit() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarKit.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoKit .setBorder(borderResaltar);		
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
		this.kitSessionBean=new KitSessionBean();
		
		this.kitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.kitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.kitSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=KitJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=KitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		KitJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		KitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		KitJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Kit MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
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
		
		KitJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Kit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarKit= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarKit,this.jTtoolBarKit,
							"nuevo","nuevo","Nuevo"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarKit,this.jTtoolBarKit,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarKit,this.jTtoolBarKit,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarKit,this.jTtoolBarKit,
							"duplicar","duplicar","Duplicar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarKit,this.jTtoolBarKit,
							"copiar","copiar","Copiar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarKit,this.jTtoolBarKit,
							"ver_form","ver_form","Ver"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarKit,this.jTtoolBarKit,
							"recargar","recargar","Recargar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarKit,this.jTtoolBarKit,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarKit,this.jTtoolBarKit,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarKit,this.jTtoolBarKit,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarKit,this.jTtoolBarKit,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarKit,this.jTtoolBarKit,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarKit,this.jTtoolBarKit,
							"cerrar","cerrar","Salir"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarKit=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarKit;
			
				this.jButtonProcesarInformacionToolBarKit=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarKit;
				
		//protected JButton jButtonModificarToolBarKit;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarKit=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuKit=new JMenuMe("General");
		this.jmenuArchivoKit=new JMenuMe("Archivo");
		this.jmenuAccionesKit=new JMenuMe("Acciones");
		this.jmenuDatosKit=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoKit= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoKit.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoKit,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarKit= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarKit.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarKit,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesKit= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesKit.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesKit,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosKit= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosKit.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosKit,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarKit= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarKit.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarKit,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormKit= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormKit.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormKit,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaKit= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaKit.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaKit,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionKit= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionKit.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionKit,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionKit= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionKit.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionKit,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresKit= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresKit.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresKit,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesKit= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesKit.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesKit,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByKit= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByKit.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByKit,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarKit,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByKit= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByKit.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByKit,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarKit,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarKit, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosKit= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosKit.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosKit,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoKit.add(this.jMenuItemCerrarKit);
			
			this.jmenuAccionesKit.add(this.jMenuItemNuevoKit);
			this.jmenuAccionesKit.add(this.jMenuItemNuevoGuardarCambiosKit);
			this.jmenuAccionesKit.add(this.jMenuItemNuevoRelacionesKit);
			this.jmenuAccionesKit.add(this.jMenuItemGuardarCambiosTablaKit);		
			this.jmenuAccionesKit.add(this.jMenuItemDuplicarKit);		
			this.jmenuAccionesKit.add(this.jMenuItemCopiarKit);		
			this.jmenuAccionesKit.add(this.jMenuItemVerFormKit);		
			
			this.jmenuDatosKit.add(this.jMenuItemRecargarInformacionKit);				
			this.jmenuDatosKit.add(this.jMenuItemAnterioresKit);				
			this.jmenuDatosKit.add(this.jMenuItemSiguientesKit);				
			this.jmenuDatosKit.add(this.jMenuItemAbrirOrderByKit);				
			this.jmenuDatosKit.add(this.jMenuItemMostrarOcultarKit);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesKit.add(this.jMenuItemGuardarCambiosKit);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoKit, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesKit, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosKit, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarKit.add(this.jmenuArchivoKit);		
			this.jmenuBarKit.add(this.jmenuAccionesKit);		
			this.jmenuBarKit.add(this.jmenuDatosKit);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarKit);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasKit() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasKit=new JTabbedPane();


		this.jTabbedPaneBusquedasKit.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasKit.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasKit.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasKit,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleKit = new KitDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Kit DATOS");
			this.jInternalFrameDetalleFormKit = new KitDetalleFormJInternalFrame(jDesktopPane,this.kitSessionBean.getConGuardarRelaciones(),this.kitSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormKit = null;//new KitDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutKit= new GridBagLayout();
		
		
		this.jTableDatosKit = new JTableMe();      
		
		String sToolTipKit="";
		sToolTipKit=KitConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipKit+="(Inventario.Kit)";
		}
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			sToolTipKit+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosKit.setToolTipText(sToolTipKit);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosKit);
		this.jTableDatosKit.setAutoCreateRowSorter(true);
		this.jTableDatosKit.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosKit.setRowSelectionAllowed(true);
		this.jTableDatosKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosKit,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoKit = new JButtonMe();
		this.jButtonDuplicarKit = new JButtonMe();
		this.jButtonCopiarKit = new JButtonMe();
		this.jButtonVerFormKit = new JButtonMe();
		this.jButtonNuevoRelacionesKit = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaKit = new JButtonMe();
		this.jButtonCerrarKit = new JButtonMe();
		
		this.jScrollPanelDatosKit = new JScrollPane();   
        this.jScrollPanelDatosGeneralKit = new JScrollPane();
		
				
		
		
		this.jPanelAccionesKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Kit";
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites" + this.sPath));
		} else {
			this.jScrollPanelDatosKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesKit.setToolTipText("Acciones");
        this.jPanelAccionesKit.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosKit, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoKit=new ReporteDinamicoJInternalFrame(KitConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoKit();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionKit=new ImportacionJInternalFrame(KitConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionKit();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByKit = new JButtonMe();
		
		this.jButtonAbrirOrderByKit.setText("Orden");
		this.jButtonAbrirOrderByKit.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByKit,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByKit,false,this);
			
			//this.cargarOrderByKit(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByKit,true,this);
			
			//this.cargarOrderByKit(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosKit.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosKit.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosKit.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosKit.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosKit.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosKit.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoKit.setText("Nuevo");
		this.jButtonDuplicarKit.setText("Duplicar");
		this.jButtonCopiarKit.setText("Copiar");
		this.jButtonVerFormKit.setText("Ver");
		this.jButtonNuevoRelacionesKit.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaKit.setText("Guardar");
		this.jButtonCerrarKit.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoKit,"nuevo_button","Nuevo",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarKit,"duplicar_button","Duplicar",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarKit,"copiar_button","Copiar",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormKit,"ver_form","Ver",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesKit,"nuevorelaciones_button","Nuevo Rel",this.kitSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaKit,"guardarcambiostabla_button","Guardar",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarKit,"cerrar_button","Salir",this.kitSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoKit.setToolTipText("Nuevo"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarKit.setToolTipText("Duplicar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarKit.setToolTipText("Copiar"+" "+KitConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormKit.setToolTipText("Ver"+" "+KitConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesKit.setToolTipText("Nuevo Rel"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaKit.setToolTipText("Guardar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarKit.setToolTipText("Salir"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoKit";
		inputMap = this.jButtonNuevoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoKit"));
		
		//DUPLICAR
		sMapKey = "DuplicarKit";
		inputMap = this.jButtonDuplicarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarKit"));
		
		//COPIAR
		sMapKey = "CopiarKit";
		inputMap = this.jButtonCopiarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarKit"));
		
		//VEr FORM
		sMapKey = "VerFormKit";
		inputMap = this.jButtonVerFormKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormKit"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesKit";
		inputMap = this.jButtonNuevoRelacionesKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesKit"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarKit";
		inputMap = this.jButtonModificarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarKit"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarKit";
		inputMap = this.jButtonCerrarKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarKit"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaKit";
		inputMap = this.jButtonGuardarCambiosTablaKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaKit"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Kit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Kit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Kit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Kit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Kit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesKit.setName("jPanelParametrosReportesKit"); 
		
		this.jPanelParametrosReportesAccionesKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesKit.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesKit.setName("jPanelParametrosReportesAccionesKit"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesKit, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesKit, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionKit = new JButtonMe();
		this.jButtonRecargarInformacionKit.setText("Recargar");
		this.jButtonRecargarInformacionKit.setToolTipText("Recargar"+" "+KitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionKit,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionKit = new JButtonMe();
		this.jButtonProcesarInformacionKit.setText("Procesar");
		this.jButtonProcesarInformacionKit.setToolTipText("Procesar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionKit.setVisible(false);
			
		this.jButtonProcesarInformacionKit.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionKit.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionKit.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesKit.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesKit.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesKit.setText("TIPO");       
		this.jComboBoxTiposReportesKit.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesKit = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesKit.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesKit.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionKit = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionKit.setText("Paginacion");
		this.jComboBoxTiposPaginacionKit.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesKit = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesKit.setText("Accion");
		this.jComboBoxTiposRelacionesKit.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesKit.setText("Accion");
		this.jComboBoxTiposAccionesKit.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarKit = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarKit.setText("Accion");
		this.jComboBoxTiposSeleccionarKit.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralKit=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralKit.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralKit.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralKit.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesKit = new JLabelMe();
		
		this.jLabelAccionesKit.setText("Acciones");		
		this.jLabelAccionesKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosKit = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosKit.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosKit.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosKit = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosKit.setText("Seleccionados");
		this.jCheckBoxSeleccionadosKit.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaKit = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaKit.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaKit.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteKit = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteKit.setText("Graf.");
		this.jCheckBoxConGraficoReporteKit.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresKit = new JButtonMe();
		//this.jButtonAnterioresKit.setText("<<");
        this.jButtonAnterioresKit.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresKit,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesKit = new JButtonMe();
		//this.jButtonSiguientesKit.setText(">>");
        this.jButtonSiguientesKit.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesKit,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosKit = new JButtonMe();
		this.jButtonNuevoGuardarCambiosKit.setText("Nue");
        this.jButtonNuevoGuardarCambiosKit.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosKit,"nuevoguardarcambios_button","Nue",this.kitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosKit";
		inputMap = this.jButtonNuevoGuardarCambiosKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosKit"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionKit";
		inputMap = this.jButtonRecargarInformacionKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionKit"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesKit";
		inputMap = this.jButtonSiguientesKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesKit"));
		
		//ANTERIORES		
		sMapKey = "AnterioresKit";
		inputMap = this.jButtonAnterioresKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresKit"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasKit();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesKit.setMinimumSize(new Dimension(this.getWidth(),KitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(KitBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesKit.setMaximumSize(new Dimension(this.getWidth(),KitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(KitBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesKit.setPreferredSize(new Dimension(this.getWidth(),KitBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(KitBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionKit = new GridBagLayout();

			this.jPanelPaginacionKit.setLayout(gridaBagLayoutPaginacionKit);						
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 0;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionKit.add(this.jButtonAnterioresKit, this.gridBagConstraintsKit);
					
						
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsKit.gridy = 0;
			
			this.jPanelPaginacionKit.add(this.jButtonNuevoGuardarCambiosKit, this.gridBagConstraintsKit);
						
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsKit.gridy = 0;
			this.jPanelPaginacionKit.add(this.jButtonSiguientesKit, this.gridBagConstraintsKit);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 1;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionKit.add(this.jButtonNuevoKit, this.gridBagConstraintsKit);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsKit = new GridBagConstraints();
				this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsKit.gridy = 1;
				this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionKit.add(this.jButtonNuevoRelacionesKit, this.gridBagConstraintsKit);
			}
			
			
			if(!this.kitSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsKit = new GridBagConstraints();
				this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsKit.gridy = 1;
				this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionKit.add(this.jButtonGuardarCambiosTablaKit, this.gridBagConstraintsKit);
			}
			
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 1;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionKit.add(this.jButtonDuplicarKit, this.gridBagConstraintsKit);
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 1;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionKit.add(this.jButtonCopiarKit, this.gridBagConstraintsKit);
		
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 1;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionKit.add(this.jButtonVerFormKit, this.gridBagConstraintsKit);
		
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 1;
			this.gridBagConstraintsKit.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionKit.add(this.jButtonCerrarKit, this.gridBagConstraintsKit);
		
		
		
		this.jButtonRecargarInformacionKit.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionKit.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionKit.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesKit.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesKit.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesKit.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesKit.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesKit.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesKit.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionKit.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionKit.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionKit.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaKit.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaKit.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaKit.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteKit.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteKit.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteKit.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteKit, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosKit.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosKit.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosKit.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosKit.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosKit.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosKit.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesKit = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesKit = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Kit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Kit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Kit = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Kit = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesKit.setLayout(gridaBagParametrosReportesKit);
			this.jPanelParametrosReportesAccionesKit.setLayout(gridaBagParametrosReportesAccionesKit);
			
			
			this.jPanelParametrosAuxiliar1Kit.setLayout(gridaBagParametrosAuxiliar1Kit);
			this.jPanelParametrosAuxiliar2Kit.setLayout(gridaBagParametrosAuxiliar2Kit);
			this.jPanelParametrosAuxiliar3Kit.setLayout(gridaBagParametrosAuxiliar3Kit);
			this.jPanelParametrosAuxiliar4Kit.setLayout(gridaBagParametrosAuxiliar4Kit);
			//this.jPanelParametrosAuxiliar5Kit.setLayout(gridaBagParametrosAuxiliar2Kit);			
			
			
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesKit.add(this.jButtonRecargarInformacionKit, this.gridBagConstraintsKit);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Kit.add(this.jComboBoxTiposPaginacionKit, this.gridBagConstraintsKit);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Kit.add(this.jCheckBoxConAltoMaximoTablaKit, this.gridBagConstraintsKit);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Kit.add(this.jComboBoxTiposArchivosReportesKit, this.gridBagConstraintsKit);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesKit.add(this.jPanelParametrosAuxiliar1Kit, this.gridBagConstraintsKit);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Kit.add(this.jComboBoxTiposReportesKit, this.gridBagConstraintsKit);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesKit.add(this.jPanelParametrosAuxiliar4Kit, this.gridBagConstraintsKit);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesKit.add(this.jComboBoxTiposReportesKit, this.gridBagConstraintsKit);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesKit.add(this.jCheckBoxGenerarReporteKit, this.gridBagConstraintsKit);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesKit.add(this.jPanelParametrosAuxiliar2Kit, this.gridBagConstraintsKit);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesKit.add(this.jLabelAccionesKit, this.gridBagConstraintsKit);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsKit = new GridBagConstraints();
				this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesKit.add(this.jButtonAbrirOrderByKit, this.gridBagConstraintsKit);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesKit.add(this.jComboBoxTiposSeleccionarKit, this.gridBagConstraintsKit);			
			
			
			/*
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesKit.add(this.jCheckBoxSeleccionarTodosKit, this.gridBagConstraintsKit);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Kit.add(this.jCheckBoxSeleccionarTodosKit, this.gridBagConstraintsKit);															
				
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsKit.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Kit.add(this.jCheckBoxSeleccionadosKit, this.gridBagConstraintsKit);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesKit.add(this.jPanelParametrosAuxiliar3Kit, this.gridBagConstraintsKit);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesKit.add(this.jComboBoxTiposRelacionesKit, this.gridBagConstraintsKit);
				
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesKit.add(this.jComboBoxTiposAccionesKit, this.gridBagConstraintsKit);
	
				
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsKit.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesKit.add(this.jTextFieldValorCampoGeneralKit, this.gridBagConstraintsKit);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosKit = new GridBagLayout();

			this.jScrollPanelDatosKit.setLayout(gridaBagLayoutDatosKit);
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = 0;
			this.gridBagConstraintsKit.gridx = 0;
			
			this.jScrollPanelDatosKit.add(this.jTableDatosKit, this.gridBagConstraintsKit);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosKit.setViewportView(this.jTableDatosKit);
		this.jTableDatosKit.setFillsViewportHeight(true);
		this.jTableDatosKit.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesKit= new GridBagLayout();
		this.jPanelAccionesKit.setLayout(gridaBagLayoutAccionesKit);
		
		
		/*	
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = 0;
		this.gridBagConstraintsKit.gridx = 0;
			
		this.jPanelAccionesKit.add(this.jButtonNuevoKit, this.gridBagConstraintsKit);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutKit = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutKit);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.kitSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsKit = new GridBagConstraints();						
			this.gridBagConstraintsKit.gridy = iGridyPrincipal++;
			this.gridBagConstraintsKit.gridx = 0;		
			//this.gridBagConstraintsKit.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsKit.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarKit, this.gridBagConstraintsKit);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;
		this.gridBagConstraintsKit.gridx = 0;		
		//this.gridBagConstraintsKit.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsKit.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsKit);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesKit, this.gridBagConstraintsKit);								
		
		
		/*
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesKit, this.gridBagConstraintsKit);
		*/		
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iGridyPrincipal++;
		this.gridBagConstraintsKit.gridx =0;
		this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsKit.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosKit, this.gridBagConstraintsKit);
				
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionKit, this.gridBagConstraintsKit);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(KitJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosKit= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosKit = new GridBagLayout();
			this.jPanelBusquedasParametrosKit.setLayout(gridaBagLayoutBusquedasParametrosKit);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralKit=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposKit, this.gridBagConstraintsKit);
			
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosKit, this.gridBagConstraintsKit);
		
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsKit.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesKit, this.gridBagConstraintsKit);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralKit;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoKit() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoKit = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoKit.setName("jPanelReporteDinamicoKit"); 
		
		this.jPanelReporteDinamicoKit.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoKit.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoKit.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoKit.setLayout(gridaBagLayoutReporteDinamicoKit);
		
		
		this.jInternalFrameReporteDinamicoKit= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoKit = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteKit= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoKit.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoKit.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoKit.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoKit.setResizable(true);
	    this.jInternalFrameReporteDinamicoKit.setClosable(true);
	    this.jInternalFrameReporteDinamicoKit.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoKit.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoKit.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoKit.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteKit = new JLabelMe();

		this.jLabelColumnasSelectReporteKit.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoKit.add(this.jLabelColumnasSelectReporteKit, this.gridBagConstraintsKit);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteKit = new JList<Reporte>();
		this.jListColumnasSelectReporteKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteKit.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteKit.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteKit.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteKit.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteKit=new JScrollPane(this.jListColumnasSelectReporteKit);
			
			this.jScrollColumnasSelectReporteKit.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteKit.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteKit.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteKit.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoKit.add(this.jListColumnasSelectReporteKit, this.gridBagConstraintsKit);
		this.jPanelReporteDinamicoKit.add(this.jScrollColumnasSelectReporteKit, this.gridBagConstraintsKit);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteKit = new JLabelMe();

		this.jLabelRelacionesSelectReporteKit.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoKit.add(this.jLabelRelacionesSelectReporteKit, this.gridBagConstraintsKit);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteKit = new JList<Reporte>();
		this.jListRelacionesSelectReporteKit.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteKit.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteKit.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteKit.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteKit.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteKit=new JScrollPane(this.jListRelacionesSelectReporteKit);
			
			this.jScrollRelacionesSelectReporteKit.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteKit.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteKit.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteKit.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoKit.add(this.jListRelacionesSelectReporteKit, this.gridBagConstraintsKit);
		this.jPanelReporteDinamicoKit.add(this.jScrollRelacionesSelectReporteKit, this.gridBagConstraintsKit);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoKit = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoKit = new JComboBoxMe();
		this.jListColumnasValoresGraficoKit = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoKit = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoKit.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoKit = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoKit.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoKit.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoKit.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoKit.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoKit = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoKit.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoKit.add(this.jLabelGenerarExcelReporteDinamicoKit, this.gridBagConstraintsKit);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoKit = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoKit.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoKit,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoKit.setToolTipText("Generar EXCEL"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsKit = new GridBagConstraints();
		//this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoKit.add(this.jButtonGenerarExcelReporteDinamicoKit, this.gridBagConstraintsKit);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoKit.add(this.jComboBoxTiposReportesDinamicoKit, this.gridBagConstraintsKit);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoKit = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoKit.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoKit.add(this.jLabelTiposArchivoReporteDinamicoKit, this.gridBagConstraintsKit);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoKit.add(this.jComboBoxTiposArchivosReportesDinamicoKit, this.gridBagConstraintsKit);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoKit = new JButtonMe();
		this.jButtonGenerarReporteDinamicoKit.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoKit,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoKit.setToolTipText("Generar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoKit.add(this.jButtonGenerarReporteDinamicoKit, this.gridBagConstraintsKit);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoKit = new JButtonMe();
		this.jButtonCerrarReporteDinamicoKit.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoKit,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoKit.setToolTipText("Cancelar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsKit.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoKit.add(this.jButtonCerrarReporteDinamicoKit, this.gridBagConstraintsKit);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalKit = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoKit= new JScrollPane(jPanelReporteDinamicoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoKit.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoKit.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoKit.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsKit.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoKit.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalKit);
		this.jInternalFrameReporteDinamicoKit.getContentPane().add(this.jScrollPanelReporteDinamicoKit, this.gridBagConstraintsKit);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionKit() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionKit = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionKit.setName("jPanelImportacionKit"); 
		
		this.jPanelImportacionKit.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionKit.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionKit.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionKit.setLayout(gridaBagLayoutImportacionKit);
		
		
		this.jInternalFrameImportacionKit= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionKit= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionKit = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteKit= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionKit.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionKit.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionKit.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionKit.setResizable(true);
	    this.jInternalFrameImportacionKit.setClosable(true);
	    this.jInternalFrameImportacionKit.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionKit.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionKit.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionKit.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionKit.setResizable(true);
	    this.jInternalFrameImportacionKit.setClosable(true);
	    this.jInternalFrameImportacionKit.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionKit.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionKit.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionKit.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionKit = new JLabelMe();

		this.jLabelArchivoImportacionKit.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;		
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
			
		this.jPanelImportacionKit.add(this.jLabelArchivoImportacionKit, this.gridBagConstraintsKit);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionKit = new JFileChooser();		
		this.jFileChooserImportacionKit.setToolTipText("ESCOGER ARCHIVO"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionKit = new JButtonMe();
		this.jButtonAbrirImportacionKit.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionKit,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionKit.setToolTipText("Generar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionKit.add(this.jButtonAbrirImportacionKit, this.gridBagConstraintsKit);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionKit = new JLabelMe();

		this.jLabelPathArchivoImportacionKit.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;		
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
			
		this.jPanelImportacionKit.add(this.jLabelPathArchivoImportacionKit, this.gridBagConstraintsKit);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionKit=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionKit.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionKit.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionKit.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionKit.add(this.jTextFieldPathArchivoImportacionKit, this.gridBagConstraintsKit);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionKit = new JButtonMe();
		this.jButtonGenerarImportacionKit.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionKit,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionKit.setToolTipText("Generar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionKit.add(this.jButtonGenerarImportacionKit, this.gridBagConstraintsKit);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionKit = new JButtonMe();
		this.jButtonCerrarImportacionKit.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionKit,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionKit.setToolTipText("Cancelar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsKit.gridy = iPosYImportacion;
		this.gridBagConstraintsKit.gridx = iPosXImportacion++;
							
		this.jPanelImportacionKit.add(this.jButtonCerrarImportacionKit, this.gridBagConstraintsKit);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalKit = new GridBagLayout();
		
		this.jScrollPanelImportacionKit= new JScrollPane(jPanelImportacionKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsKit = new GridBagConstraints();
		this.gridBagConstraintsKit.gridy =iPosYImportacion;
		this.gridBagConstraintsKit.gridx =iPosXImportacion;
		this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionKit.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalKit);
		this.jInternalFrameImportacionKit.getContentPane().add(this.jScrollPanelImportacionKit, this.gridBagConstraintsKit);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByKit(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByKit = new JButtonMe();
			this.jButtonAbrirOrderByKit.setText("Orden");
			this.jButtonAbrirOrderByKit.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByKit,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByKit";
			inputMap = this.jButtonAbrirOrderByKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByKit"));
		
		
			GridBagLayout gridaBagLayoutOrderByKit = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByKit.setName("jPanelOrderByKit"); 
			
			this.jPanelOrderByKit.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByKit.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByKit.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByKit.setLayout(gridaBagLayoutOrderByKit);
			
			
			this.jTableDatosKitOrderBy = new JTableMe();        
			this.jTableDatosKitOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosKitOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosKitOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosKitOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosKitOrderBy.setViewportView(this.jTableDatosKitOrderBy);
			this.jTableDatosKitOrderBy.setFillsViewportHeight(true);
			this.jTableDatosKitOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByKit= new OrderByJInternalFrame();
			this.jInternalFrameOrderByKit= new OrderByJInternalFrame();
			this.jScrollPanelOrderByKit = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteKit= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByKit.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByKit.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByKit.setTitle("Orden");
			this.jInternalFrameOrderByKit.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByKit.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByKit.setResizable(true);
			this.jInternalFrameOrderByKit.setClosable(true);
			this.jInternalFrameOrderByKit.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByKit.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByKit.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByKit.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Kites"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy =iPosYOrderBy++;
			this.gridBagConstraintsKit.gridx =iPosXOrderBy;
			this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsKit.ipady =150;
				
			this.jPanelOrderByKit.add(jScrollPanelDatosKitOrderBy, this.gridBagConstraintsKit);//this.jTableDatosKitTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByKit = new JButtonMe();
			this.jButtonCerrarOrderByKit.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByKit,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByKit.setToolTipText("Cancelar"+" "+KitConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsKit.gridy = iPosYOrderBy++;
			this.gridBagConstraintsKit.gridx = iPosXOrderBy;
									
			this.jPanelOrderByKit.add(this.jButtonCerrarOrderByKit, this.gridBagConstraintsKit);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalKit = new GridBagLayout();
			
			this.jScrollPanelOrderByKit= new JScrollPane(jPanelOrderByKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsKit = new GridBagConstraints();
			this.gridBagConstraintsKit.gridy =iPosYOrderBy;
			this.gridBagConstraintsKit.gridx =iPosXOrderBy;
			this.gridBagConstraintsKit.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByKit.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByKit.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalKit);
			
			this.jInternalFrameOrderByKit.getContentPane().add(this.jScrollPanelOrderByKit, this.gridBagConstraintsKit);			
		
		} else {
			this.jButtonAbrirOrderByKit = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.kitSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosKit.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosKit.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosKit.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosKit.getRowHeight();//KitConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > KitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaKit.isSelected()) {
					iHeightTable=KitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < KitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=KitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > KitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaKit.isSelected()) {
					iHeightTable=KitConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < KitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=KitConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosKit.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosKit.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosKit.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosKit.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosKit.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosKit.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByKit!=null && this.jInternalFrameOrderByKit.getjTableDatosOrderBy()!=null) {
			//if(!this.kitSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByKit.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByKit.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByKit.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByKit.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByKit.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByKit.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByKit.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosKit.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosKit.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosKit.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=kitLogic.getKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=kits.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Kit> TraerKitBeans(List<Kit> kits,ArrayList<Classe> classes)throws Exception {
		try {
			for(Kit kit:kits) {
					
				if(!(KitConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || KitConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					kit.setsDetalleGeneralEntityReporte(KitConstantesFunciones.getKitDescripcion(kit));
										
						
					
					

					if(kit.getCompoKits()!=null && Funciones.existeClass(classes,CompoKit.class)) {
						try{kit.setcompokitsDescripcionReporte(new JRBeanCollectionDataSource(CompoKitJInternalFrame.TraerCompoKitBeans(kit.getCompoKits(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//kit.setsDetalleGeneralEntityReporte(kit.getsDetalleGeneralEntityReporte());
										
				}
				
				//kitbeans.add(kitbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return kits;
    }
	//PARA REPORTES FIN
}
