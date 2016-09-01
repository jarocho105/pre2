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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.inventario.util.InventarioConstantesFunciones;

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
public class InventarioJInternalFrame extends InventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarInventario;
	
	protected JMenuBar jmenuBarInventario;
	
	protected JMenu jmenuInventario;
	protected JMenu jmenuDatosInventario;
	protected JMenu jmenuArchivoInventario;
	protected JMenu jmenuAccionesInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInventario;	
	protected GridBagConstraints gridBagConstraintsInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public InventarioDetalleFormJInternalFrame jInternalFrameDetalleFormInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public InventarioSessionBean inventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Inventario> inventarios;		
	public List<Inventario> inventariosEliminados;	
	public List<Inventario> inventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByInventario;		
	protected JButton jButtonAbrirOrderByInventario;
	
	
	//protected JPanel jPanelOrderByInventario;
	//public JScrollPane jScrollPanelOrderByInventario;	
	//protected JButton jButtonCerrarOrderByInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public InventarioLogic inventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosInventario;
	public JScrollPane jScrollPanelDatosEdicionInventario;
	public JScrollPane jScrollPanelDatosGeneralInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoInventario;
	//public JScrollPane jScrollPanelImportacionInventario;
	
	
	
	protected JPanel jPanelAccionesInventario;
	
    protected JPanel jPanelPaginacionInventario;
    protected JPanel jPanelParametrosReportesInventario;
	protected JPanel jPanelParametrosReportesAccionesInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Inventario;
	protected JPanel jPanelParametrosAuxiliar2Inventario;
	protected JPanel jPanelParametrosAuxiliar3Inventario;
	protected JPanel jPanelParametrosAuxiliar4Inventario;
	//protected JPanel jPanelParametrosAuxiliar5Inventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoInventario;
	//protected JPanel jPanelImportacionInventario;
	
	
	public JTable jTableDatosInventario;
	
	
	
	//public JTable jTableDatosInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoInventario;
	protected JButton jButtonDuplicarInventario;
	protected JButton jButtonCopiarInventario;
	protected JButton jButtonVerFormInventario;
	protected JButton jButtonNuevoRelacionesInventario;
	protected JButton jButtonModificarInventario;
	
    protected JButton jButtonGuardarCambiosTablaInventario;
	protected JButton jButtonCerrarInventario;
	
	
	protected JButton jButtonRecargarInformacionInventario;
	protected JButton jButtonProcesarInformacionInventario;
	
	
	protected JButton jButtonAnterioresInventario;
	protected JButton jButtonSiguientesInventario;
	protected JButton jButtonNuevoGuardarCambiosInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoInventario;
	//protected JButton jButtonCerrarReporteDinamicoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionInventario;
	//protected JButton jButtonGenerarImportacionInventario;
	//protected JButton jButtonCerrarImportacionInventario;
	//protected JFileChooser jFileChooserImportacionInventario;
	//protected File fileImportacionInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInventario;
	protected JButton jButtonDuplicarToolBarInventario;
	protected JButton jButtonNuevoRelacionesToolBarInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarInventario;
	protected JButton jButtonCopiarToolBarInventario;
	protected JButton jButtonVerFormToolBarInventario;
	public JButton jButtonGuardarCambiosTablaToolBarInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarInventario;
	protected JButton jButtonCerrarToolBarInventario;
	
	protected JButton jButtonRecargarInformacionToolBarInventario;
	protected JButton jButtonProcesarInformacionToolBarInventario;
	protected JButton jButtonAnterioresToolBarInventario;
	protected JButton jButtonSiguientesToolBarInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarInventario;
	protected JButton jButtonAbrirOrderByToolBarInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInventario;
	protected JMenuItem jMenuItemDuplicarInventario;
	protected JMenuItem jMenuItemNuevoRelacionesInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosInventario;
	protected JMenuItem jMenuItemCopiarInventario;
	protected JMenuItem jMenuItemVerFormInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaInventario;
	protected JMenuItem jMenuItemCerrarInventario;
	protected JMenuItem jMenuItemDetalleCerrarInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionInventario;
	protected JMenuItem jMenuItemProcesarInformacionInventario;
	protected JMenuItem jMenuItemAnterioresInventario;
	protected JMenuItem jMenuItemSiguientesInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInventario;
	protected JMenuItem jMenuItemAbrirOrderByInventario;
	protected JMenuItem jMenuItemMostrarOcultarInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosInventario;
	protected JCheckBox jCheckBoxSeleccionadosInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaInventario;
	protected JCheckBox jCheckBoxConGraficoReporteInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarInventario;
	protected JTextField jTextFieldValorCampoGeneralInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteInventario;
	//public JList<Reporte> jListColumnasSelectReporteInventario;
	//public JScrollPane jScrollColumnasSelectReporteInventario;
	
	//public JLabel jLabelRelacionesSelectReporteInventario;
	//public JList<Reporte> jListRelacionesSelectReporteInventario;
	//public JScrollPane jScrollRelacionesSelectReporteInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoInventario;
	
		
	//public JLabel jLabelArchivoImportacionInventario;	
	//public JLabel jLabelPathArchivoImportacionInventario;
	//protected JTextField jTextFieldPathArchivoImportacionInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorInventario;
	
	//public JLabel jLabelColumnasValoresGraficoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoInventario;	
	
	
	
	
	
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
	public InventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionInventario)	{
		this.jButtonRecargarInformacionInventario = jButtonRecargarInformacionInventario;
	}
	
	public JButton getjButtonProcesarInformacionInventario() {
		return this.jButtonProcesarInformacionInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInventario)	{
		this.jButtonProcesarInformacionInventario = jButtonProcesarInformacionInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionInventario() {
		return this.jButtonRecargarInformacionInventario;
	}
	
	
	public List<Inventario> getinventarios() {
		return this.inventarios;
	}

	public void setinventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
	
	public List<Inventario> getinventariosAux() {
		return this.inventariosAux;
	}

	public void setinventariosAux(List<Inventario> inventariosAux) {
		this.inventariosAux = inventariosAux;
	}
	
	public List<Inventario> getinventariosEliminados() {
		return this.inventariosEliminados;
	}

	public void setInventariosEliminados(List<Inventario> inventariosEliminados) {
		this.inventariosEliminados = inventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarInventario() {
		return jComboBoxTiposSeleccionarInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarInventario(
			JComboBox jComboBoxTiposSeleccionarInventario) {
		this.jComboBoxTiposSeleccionarInventario = jComboBoxTiposSeleccionarInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralInventario() {
		return jTextFieldValorCampoGeneralInventario;
	}

	public void setjTextFieldValorCampoGeneralInventario(
			JTextField jTextFieldValorCampoGeneralInventario) {
		this.jTextFieldValorCampoGeneralInventario = jTextFieldValorCampoGeneralInventario;
	}

	public void setBorderResaltarValorCampoGeneralInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosInventario() {
		return this.jCheckBoxSeleccionarTodosInventario;
	}

	public void setjCheckBoxSeleccionarTodosInventario(
			JCheckBox jCheckBoxSeleccionarTodosInventario) {
		this.jCheckBoxSeleccionarTodosInventario = jCheckBoxSeleccionarTodosInventario;
	}

	public void setBorderResaltarSeleccionarTodosInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosInventario() {
		return this.jCheckBoxSeleccionadosInventario;
	}

	public void setjCheckBoxSeleccionadosInventario(
			JCheckBox jCheckBoxSeleccionadosInventario) {
		this.jCheckBoxSeleccionadosInventario = jCheckBoxSeleccionadosInventario;
	}
	
	public void setBorderResaltarSeleccionadosInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesInventario() {
		return this.jComboBoxTiposArchivosReportesInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesInventario(
			JComboBox jComboBoxTiposArchivosReportesInventario) {
		this.jComboBoxTiposArchivosReportesInventario = jComboBoxTiposArchivosReportesInventario;
	}

	public void setBorderResaltarTiposArchivosReportesInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesInventario() {
		return this.jComboBoxTiposReportesInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesInventario(
			JComboBox jComboBoxTiposReportesInventario) {
		this.jComboBoxTiposReportesInventario = jComboBoxTiposReportesInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoInventario() {
	//	return jComboBoxTiposReportesDinamicoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoInventario) {
	//	this.jComboBoxTiposReportesDinamicoInventario = jComboBoxTiposReportesDinamicoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoInventario = jComboBoxTiposArchivosReportesDinamicoInventario;
	//}
	
	public void setBorderResaltarTiposReportesInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesInventario() {
		return this.jComboBoxTiposGraficosReportesInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesInventario(
			JComboBox jComboBoxTiposGraficosReportesInventario) {
		this.jComboBoxTiposGraficosReportesInventario = jComboBoxTiposGraficosReportesInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionInventario() {
		return this.jComboBoxTiposPaginacionInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionInventario(
			JComboBox jComboBoxTiposPaginacionInventario) {
		this.jComboBoxTiposPaginacionInventario = jComboBoxTiposPaginacionInventario;
	}
	
	public void setBorderResaltarTiposPaginacionInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesInventario() {
		return this.jComboBoxTiposRelacionesInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInventario() {
		return this.jComboBoxTiposAccionesInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInventario(
			JComboBox jComboBoxTiposRelacionesInventario) {
		this.jComboBoxTiposRelacionesInventario = jComboBoxTiposRelacionesInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInventario(
			JComboBox jComboBoxTiposAccionesInventario) {
		this.jComboBoxTiposAccionesInventario = jComboBoxTiposAccionesInventario;
	}
	
	public void setBorderResaltarTiposRelacionesInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoInventario() {
	//	return jCheckBoxConGraficoDinamicoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoInventario) {
	//	this.jCheckBoxConGraficoDinamicoInventario = jCheckBoxConGraficoDinamicoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoInventario .setBorder(borderResaltar);		
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
		this.inventarioSessionBean=new InventarioSessionBean();
		
		this.inventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.inventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.inventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=InventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=InventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		InventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Inventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarInventario,this.jTtoolBarInventario,
							"nuevo","nuevo","Nuevo"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarInventario,this.jTtoolBarInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarInventario,this.jTtoolBarInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarInventario,this.jTtoolBarInventario,
							"duplicar","duplicar","Duplicar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarInventario,this.jTtoolBarInventario,
							"copiar","copiar","Copiar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarInventario,this.jTtoolBarInventario,
							"ver_form","ver_form","Ver"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInventario,this.jTtoolBarInventario,
							"recargar","recargar","Recargar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInventario,this.jTtoolBarInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInventario,this.jTtoolBarInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarInventario,this.jTtoolBarInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarInventario,this.jTtoolBarInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarInventario,this.jTtoolBarInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarInventario,this.jTtoolBarInventario,
							"cerrar","cerrar","Salir"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarInventario;
			
				this.jButtonProcesarInformacionToolBarInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarInventario;
				
		//protected JButton jButtonModificarToolBarInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuInventario=new JMenuMe("General");
		this.jmenuArchivoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesInventario=new JMenuMe("Acciones");
		this.jmenuDatosInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoInventario.add(this.jMenuItemCerrarInventario);
			
			this.jmenuAccionesInventario.add(this.jMenuItemNuevoInventario);
			this.jmenuAccionesInventario.add(this.jMenuItemNuevoGuardarCambiosInventario);
			this.jmenuAccionesInventario.add(this.jMenuItemNuevoRelacionesInventario);
			this.jmenuAccionesInventario.add(this.jMenuItemGuardarCambiosTablaInventario);		
			this.jmenuAccionesInventario.add(this.jMenuItemDuplicarInventario);		
			this.jmenuAccionesInventario.add(this.jMenuItemCopiarInventario);		
			this.jmenuAccionesInventario.add(this.jMenuItemVerFormInventario);		
			
			this.jmenuDatosInventario.add(this.jMenuItemRecargarInformacionInventario);				
			this.jmenuDatosInventario.add(this.jMenuItemAnterioresInventario);				
			this.jmenuDatosInventario.add(this.jMenuItemSiguientesInventario);				
			this.jmenuDatosInventario.add(this.jMenuItemAbrirOrderByInventario);				
			this.jmenuDatosInventario.add(this.jMenuItemMostrarOcultarInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesInventario.add(this.jMenuItemGuardarCambiosInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarInventario.add(this.jmenuArchivoInventario);		
			this.jmenuBarInventario.add(this.jmenuAccionesInventario);		
			this.jmenuBarInventario.add(this.jmenuDatosInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasInventario() {
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
			//this.jInternalFrameDetalleInventario = new InventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Inventario DATOS");
			this.jInternalFrameDetalleFormInventario = new InventarioDetalleFormJInternalFrame(jDesktopPane,this.inventarioSessionBean.getConGuardarRelaciones(),this.inventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormInventario = null;//new InventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInventario= new GridBagLayout();
		
		
		this.jTableDatosInventario = new JTableMe();      
		
		String sToolTipInventario="";
		sToolTipInventario=InventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInventario+="(Inventario.Inventario)";
		}
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosInventario.setToolTipText(sToolTipInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosInventario);
		this.jTableDatosInventario.setAutoCreateRowSorter(true);
		this.jTableDatosInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosInventario.setRowSelectionAllowed(true);
		this.jTableDatosInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoInventario = new JButtonMe();
		this.jButtonDuplicarInventario = new JButtonMe();
		this.jButtonCopiarInventario = new JButtonMe();
		this.jButtonVerFormInventario = new JButtonMe();
		this.jButtonNuevoRelacionesInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaInventario = new JButtonMe();
		this.jButtonCerrarInventario = new JButtonMe();
		
		this.jScrollPanelDatosInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Inventario";
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInventario.setToolTipText("Acciones");
        this.jPanelAccionesInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoInventario=new ReporteDinamicoJInternalFrame(InventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionInventario=new ImportacionJInternalFrame(InventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByInventario.setText("Orden");
		this.jButtonAbrirOrderByInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInventario,false,this);
			
			//this.cargarOrderByInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInventario,true,this);
			
			//this.cargarOrderByInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosInventario.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosInventario.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosInventario.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoInventario.setText("Nuevo");
		this.jButtonDuplicarInventario.setText("Duplicar");
		this.jButtonCopiarInventario.setText("Copiar");
		this.jButtonVerFormInventario.setText("Ver");
		this.jButtonNuevoRelacionesInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaInventario.setText("Guardar");
		this.jButtonCerrarInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInventario,"nuevo_button","Nuevo",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarInventario,"duplicar_button","Duplicar",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarInventario,"copiar_button","Copiar",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormInventario,"ver_form","Ver",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesInventario,"nuevorelaciones_button","Nuevo Rel",this.inventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInventario,"guardarcambiostabla_button","Guardar",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInventario,"cerrar_button","Salir",this.inventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoInventario.setToolTipText("Nuevo"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarInventario.setToolTipText("Duplicar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarInventario.setToolTipText("Copiar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormInventario.setToolTipText("Ver"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesInventario.setToolTipText("Nuevo Rel"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaInventario.setToolTipText("Guardar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInventario.setToolTipText("Salir"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInventario";
		inputMap = this.jButtonNuevoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarInventario";
		inputMap = this.jButtonDuplicarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarInventario"));
		
		//COPIAR
		sMapKey = "CopiarInventario";
		inputMap = this.jButtonCopiarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarInventario"));
		
		//VEr FORM
		sMapKey = "VerFormInventario";
		inputMap = this.jButtonVerFormInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesInventario";
		inputMap = this.jButtonNuevoRelacionesInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarInventario";
		inputMap = this.jButtonModificarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarInventario";
		inputMap = this.jButtonCerrarInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInventario";
		inputMap = this.jButtonGuardarCambiosTablaInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Inventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Inventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Inventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Inventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Inventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesInventario.setName("jPanelParametrosReportesInventario"); 
		
		this.jPanelParametrosReportesAccionesInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesInventario.setName("jPanelParametrosReportesAccionesInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionInventario = new JButtonMe();
		this.jButtonRecargarInformacionInventario.setText("Recargar");
		this.jButtonRecargarInformacionInventario.setToolTipText("Recargar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionInventario = new JButtonMe();
		this.jButtonProcesarInformacionInventario.setText("Procesar");
		this.jButtonProcesarInformacionInventario.setToolTipText("Procesar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionInventario.setVisible(false);
			
		this.jButtonProcesarInformacionInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInventario.setText("TIPO");       
		this.jComboBoxTiposReportesInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesInventario.setText("Accion");
		this.jComboBoxTiposRelacionesInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInventario.setText("Accion");
		this.jComboBoxTiposAccionesInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesInventario = new JLabelMe();
		
		this.jLabelAccionesInventario.setText("Acciones");		
		this.jLabelAccionesInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresInventario = new JButtonMe();
		//this.jButtonAnterioresInventario.setText("<<");
        this.jButtonAnterioresInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesInventario = new JButtonMe();
		//this.jButtonSiguientesInventario.setText(">>");
        this.jButtonSiguientesInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosInventario,"nuevoguardarcambios_button","Nue",this.inventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosInventario";
		inputMap = this.jButtonNuevoGuardarCambiosInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionInventario";
		inputMap = this.jButtonRecargarInformacionInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesInventario";
		inputMap = this.jButtonSiguientesInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresInventario";
		inputMap = this.jButtonAnterioresInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesInventario.setMinimumSize(new Dimension(this.getWidth(),InventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInventario.setMaximumSize(new Dimension(this.getWidth(),InventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInventario.setPreferredSize(new Dimension(this.getWidth(),InventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionInventario = new GridBagLayout();

			this.jPanelPaginacionInventario.setLayout(gridaBagLayoutPaginacionInventario);						
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 0;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionInventario.add(this.jButtonAnterioresInventario, this.gridBagConstraintsInventario);
					
						
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInventario.gridy = 0;
			
			this.jPanelPaginacionInventario.add(this.jButtonNuevoGuardarCambiosInventario, this.gridBagConstraintsInventario);
						
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInventario.gridy = 0;
			this.jPanelPaginacionInventario.add(this.jButtonSiguientesInventario, this.gridBagConstraintsInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 1;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInventario.add(this.jButtonNuevoInventario, this.gridBagConstraintsInventario);
						
			
			
			if(!this.inventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsInventario = new GridBagConstraints();
				this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsInventario.gridy = 1;
				this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionInventario.add(this.jButtonGuardarCambiosTablaInventario, this.gridBagConstraintsInventario);
			}
			
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 1;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInventario.add(this.jButtonDuplicarInventario, this.gridBagConstraintsInventario);
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 1;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInventario.add(this.jButtonCopiarInventario, this.gridBagConstraintsInventario);
		
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 1;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInventario.add(this.jButtonVerFormInventario, this.gridBagConstraintsInventario);
		
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 1;
			this.gridBagConstraintsInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionInventario.add(this.jButtonCerrarInventario, this.gridBagConstraintsInventario);
		
		
		
		this.jButtonRecargarInformacionInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Inventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Inventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Inventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Inventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesInventario.setLayout(gridaBagParametrosReportesInventario);
			this.jPanelParametrosReportesAccionesInventario.setLayout(gridaBagParametrosReportesAccionesInventario);
			
			
			this.jPanelParametrosAuxiliar1Inventario.setLayout(gridaBagParametrosAuxiliar1Inventario);
			this.jPanelParametrosAuxiliar2Inventario.setLayout(gridaBagParametrosAuxiliar2Inventario);
			this.jPanelParametrosAuxiliar3Inventario.setLayout(gridaBagParametrosAuxiliar3Inventario);
			this.jPanelParametrosAuxiliar4Inventario.setLayout(gridaBagParametrosAuxiliar4Inventario);
			//this.jPanelParametrosAuxiliar5Inventario.setLayout(gridaBagParametrosAuxiliar2Inventario);			
			
			
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInventario.add(this.jButtonRecargarInformacionInventario, this.gridBagConstraintsInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Inventario.add(this.jComboBoxTiposPaginacionInventario, this.gridBagConstraintsInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Inventario.add(this.jCheckBoxConAltoMaximoTablaInventario, this.gridBagConstraintsInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Inventario.add(this.jComboBoxTiposArchivosReportesInventario, this.gridBagConstraintsInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInventario.add(this.jPanelParametrosAuxiliar1Inventario, this.gridBagConstraintsInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Inventario.add(this.jComboBoxTiposReportesInventario, this.gridBagConstraintsInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInventario.add(this.jPanelParametrosAuxiliar4Inventario, this.gridBagConstraintsInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInventario.add(this.jComboBoxTiposReportesInventario, this.gridBagConstraintsInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInventario.add(this.jCheckBoxGenerarReporteInventario, this.gridBagConstraintsInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInventario.add(this.jPanelParametrosAuxiliar2Inventario, this.gridBagConstraintsInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInventario.add(this.jLabelAccionesInventario, this.gridBagConstraintsInventario);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInventario.add(this.jComboBoxTiposSeleccionarInventario, this.gridBagConstraintsInventario);			
			
			
			/*
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInventario.add(this.jCheckBoxSeleccionarTodosInventario, this.gridBagConstraintsInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Inventario.add(this.jCheckBoxSeleccionarTodosInventario, this.gridBagConstraintsInventario);															
				
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Inventario.add(this.jCheckBoxSeleccionadosInventario, this.gridBagConstraintsInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInventario.add(this.jPanelParametrosAuxiliar3Inventario, this.gridBagConstraintsInventario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInventario.add(this.jComboBoxTiposAccionesInventario, this.gridBagConstraintsInventario);
	
				
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInventario.add(this.jTextFieldValorCampoGeneralInventario, this.gridBagConstraintsInventario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosInventario = new GridBagLayout();

			this.jScrollPanelDatosInventario.setLayout(gridaBagLayoutDatosInventario);
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = 0;
			this.gridBagConstraintsInventario.gridx = 0;
			
			this.jScrollPanelDatosInventario.add(this.jTableDatosInventario, this.gridBagConstraintsInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosInventario.setViewportView(this.jTableDatosInventario);
		this.jTableDatosInventario.setFillsViewportHeight(true);
		this.jTableDatosInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesInventario= new GridBagLayout();
		this.jPanelAccionesInventario.setLayout(gridaBagLayoutAccionesInventario);
		
		
		/*	
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = 0;
		this.gridBagConstraintsInventario.gridx = 0;
			
		this.jPanelAccionesInventario.add(this.jButtonNuevoInventario, this.gridBagConstraintsInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.inventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInventario = new GridBagConstraints();						
			this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInventario.gridx = 0;		
			//this.gridBagConstraintsInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarInventario, this.gridBagConstraintsInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsInventario.gridx = 0;		
		//this.gridBagConstraintsInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesInventario, this.gridBagConstraintsInventario);								
		
		
		/*
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesInventario, this.gridBagConstraintsInventario);
		*/		
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInventario.gridx =0;
		this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInventario, this.gridBagConstraintsInventario);
				
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionInventario, this.gridBagConstraintsInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(InventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosInventario.setLayout(gridaBagLayoutBusquedasParametrosInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInventario, this.gridBagConstraintsInventario);
			
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInventario, this.gridBagConstraintsInventario);
		
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInventario, this.gridBagConstraintsInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoInventario.setName("jPanelReporteDinamicoInventario"); 
		
		this.jPanelReporteDinamicoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoInventario.setLayout(gridaBagLayoutReporteDinamicoInventario);
		
		
		this.jInternalFrameReporteDinamicoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInventario.add(this.jLabelColumnasSelectReporteInventario, this.gridBagConstraintsInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteInventario=new JScrollPane(this.jListColumnasSelectReporteInventario);
			
			this.jScrollColumnasSelectReporteInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoInventario.add(this.jListColumnasSelectReporteInventario, this.gridBagConstraintsInventario);
		this.jPanelReporteDinamicoInventario.add(this.jScrollColumnasSelectReporteInventario, this.gridBagConstraintsInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteInventario=new JScrollPane(this.jListRelacionesSelectReporteInventario);
			
			this.jScrollRelacionesSelectReporteInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInventario.add(this.jLabelGenerarExcelReporteDinamicoInventario, this.gridBagConstraintsInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoInventario.setToolTipText("Generar EXCEL"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsInventario = new GridBagConstraints();
		//this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoInventario.add(this.jButtonGenerarExcelReporteDinamicoInventario, this.gridBagConstraintsInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInventario.add(this.jComboBoxTiposReportesDinamicoInventario, this.gridBagConstraintsInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInventario.add(this.jLabelTiposArchivoReporteDinamicoInventario, this.gridBagConstraintsInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoInventario, this.gridBagConstraintsInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoInventario.setToolTipText("Generar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInventario.add(this.jButtonGenerarReporteDinamicoInventario, this.gridBagConstraintsInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoInventario.setToolTipText("Cancelar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInventario.add(this.jButtonCerrarReporteDinamicoInventario, this.gridBagConstraintsInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoInventario= new JScrollPane(jPanelReporteDinamicoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalInventario);
		this.jInternalFrameReporteDinamicoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoInventario, this.gridBagConstraintsInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionInventario.setName("jPanelImportacionInventario"); 
		
		this.jPanelImportacionInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionInventario.setLayout(gridaBagLayoutImportacionInventario);
		
		
		this.jInternalFrameImportacionInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInventario.setResizable(true);
	    this.jInternalFrameImportacionInventario.setClosable(true);
	    this.jInternalFrameImportacionInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInventario.setResizable(true);
	    this.jInternalFrameImportacionInventario.setClosable(true);
	    this.jInternalFrameImportacionInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionInventario = new JLabelMe();

		this.jLabelArchivoImportacionInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInventario.add(this.jLabelArchivoImportacionInventario, this.gridBagConstraintsInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionInventario = new JFileChooser();		
		this.jFileChooserImportacionInventario.setToolTipText("ESCOGER ARCHIVO"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionInventario = new JButtonMe();
		this.jButtonAbrirImportacionInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionInventario.setToolTipText("Generar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInventario.add(this.jButtonAbrirImportacionInventario, this.gridBagConstraintsInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInventario.add(this.jLabelPathArchivoImportacionInventario, this.gridBagConstraintsInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInventario.add(this.jTextFieldPathArchivoImportacionInventario, this.gridBagConstraintsInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionInventario = new JButtonMe();
		this.jButtonGenerarImportacionInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionInventario.setToolTipText("Generar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInventario.add(this.jButtonGenerarImportacionInventario, this.gridBagConstraintsInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionInventario = new JButtonMe();
		this.jButtonCerrarImportacionInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionInventario.setToolTipText("Cancelar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInventario.add(this.jButtonCerrarImportacionInventario, this.gridBagConstraintsInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionInventario= new JScrollPane(jPanelImportacionInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsInventario = new GridBagConstraints();
		this.gridBagConstraintsInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalInventario);
		this.jInternalFrameImportacionInventario.getContentPane().add(this.jScrollPanelImportacionInventario, this.gridBagConstraintsInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByInventario = new JButtonMe();
			this.jButtonAbrirOrderByInventario.setText("Orden");
			this.jButtonAbrirOrderByInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByInventario";
			inputMap = this.jButtonAbrirOrderByInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByInventario.setName("jPanelOrderByInventario"); 
			
			this.jPanelOrderByInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByInventario.setLayout(gridaBagLayoutOrderByInventario);
			
			
			this.jTableDatosInventarioOrderBy = new JTableMe();        
			this.jTableDatosInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosInventarioOrderBy.setViewportView(this.jTableDatosInventarioOrderBy);
			this.jTableDatosInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByInventario.setTitle("Orden");
			this.jInternalFrameOrderByInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByInventario.setResizable(true);
			this.jInternalFrameOrderByInventario.setClosable(true);
			this.jInternalFrameOrderByInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsInventario.ipady =150;
				
			this.jPanelOrderByInventario.add(jScrollPanelDatosInventarioOrderBy, this.gridBagConstraintsInventario);//this.jTableDatosInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByInventario = new JButtonMe();
			this.jButtonCerrarOrderByInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByInventario.setToolTipText("Cancelar"+" "+InventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByInventario.add(this.jButtonCerrarOrderByInventario, this.gridBagConstraintsInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByInventario= new JScrollPane(jPanelOrderByInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsInventario = new GridBagConstraints();
			this.gridBagConstraintsInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalInventario);
			
			this.jInternalFrameOrderByInventario.getContentPane().add(this.jScrollPanelOrderByInventario, this.gridBagConstraintsInventario);			
		
		} else {
			this.jButtonAbrirOrderByInventario = new JButtonMe();
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
			&& this.inventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosInventario.getRowHeight();//InventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > InventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInventario.isSelected()) {
					iHeightTable=InventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > InventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInventario.isSelected()) {
					iHeightTable=InventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByInventario!=null && this.jInternalFrameOrderByInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.inventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=inventarioLogic.getInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=inventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Inventario> TraerInventarioBeans(List<Inventario> inventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Inventario inventario:inventarios) {
					
				if(!(InventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || InventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					inventario.setsDetalleGeneralEntityReporte(InventarioConstantesFunciones.getInventarioDescripcion(inventario));
										
						
					
						
					
				} else  {
							
					//inventario.setsDetalleGeneralEntityReporte(inventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//inventariobeans.add(inventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return inventarios;
    }
	//PARA REPORTES FIN
}
