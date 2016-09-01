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



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.facturacion.util.EstadoFactuImpreConstantesFunciones;

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
public class EstadoFactuImpreJInternalFrame extends EstadoFactuImpreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoFactuImpre;
	
	protected JMenuBar jmenuBarEstadoFactuImpre;
	
	protected JMenu jmenuEstadoFactuImpre;
	protected JMenu jmenuDatosEstadoFactuImpre;
	protected JMenu jmenuArchivoEstadoFactuImpre;
	protected JMenu jmenuAccionesEstadoFactuImpre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFactuImpre;	
	protected GridBagConstraints gridBagConstraintsEstadoFactuImpre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoFactuImpreDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoFactuImpre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoFactuImpre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoFactuImpre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoFactuImpreSessionBean estadofactuimpreSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoFactuImpre> estadofactuimpres;		
	public List<EstadoFactuImpre> estadofactuimpresEliminados;	
	public List<EstadoFactuImpre> estadofactuimpresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoFactuImpre;		
	protected JButton jButtonAbrirOrderByEstadoFactuImpre;
	
	
	//protected JPanel jPanelOrderByEstadoFactuImpre;
	//public JScrollPane jScrollPanelOrderByEstadoFactuImpre;	
	//protected JButton jButtonCerrarOrderByEstadoFactuImpre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoFactuImpreLogic estadofactuimpreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoFactuImpre;
	public JScrollPane jScrollPanelDatosEdicionEstadoFactuImpre;
	public JScrollPane jScrollPanelDatosGeneralEstadoFactuImpre;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoFactuImpreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoFactuImpre;
	//public JScrollPane jScrollPanelImportacionEstadoFactuImpre;
	
	
	
	protected JPanel jPanelAccionesEstadoFactuImpre;
	
    protected JPanel jPanelPaginacionEstadoFactuImpre;
    protected JPanel jPanelParametrosReportesEstadoFactuImpre;
	protected JPanel jPanelParametrosReportesAccionesEstadoFactuImpre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoFactuImpre;
	protected JPanel jPanelParametrosAuxiliar2EstadoFactuImpre;
	protected JPanel jPanelParametrosAuxiliar3EstadoFactuImpre;
	protected JPanel jPanelParametrosAuxiliar4EstadoFactuImpre;
	//protected JPanel jPanelParametrosAuxiliar5EstadoFactuImpre;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoFactuImpre;
	//protected JPanel jPanelImportacionEstadoFactuImpre;
	
	
	public JTable jTableDatosEstadoFactuImpre;
	
	
	
	//public JTable jTableDatosEstadoFactuImpreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoFactuImpre;
	protected JButton jButtonDuplicarEstadoFactuImpre;
	protected JButton jButtonCopiarEstadoFactuImpre;
	protected JButton jButtonVerFormEstadoFactuImpre;
	protected JButton jButtonNuevoRelacionesEstadoFactuImpre;
	protected JButton jButtonModificarEstadoFactuImpre;
	
    protected JButton jButtonGuardarCambiosTablaEstadoFactuImpre;
	protected JButton jButtonCerrarEstadoFactuImpre;
	
	
	protected JButton jButtonRecargarInformacionEstadoFactuImpre;
	protected JButton jButtonProcesarInformacionEstadoFactuImpre;
	
	
	protected JButton jButtonAnterioresEstadoFactuImpre;
	protected JButton jButtonSiguientesEstadoFactuImpre;
	protected JButton jButtonNuevoGuardarCambiosEstadoFactuImpre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoFactuImpre;
	//protected JButton jButtonCerrarReporteDinamicoEstadoFactuImpre;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoFactuImpre;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoFactuImpre;
	//protected JButton jButtonGenerarImportacionEstadoFactuImpre;
	//protected JButton jButtonCerrarImportacionEstadoFactuImpre;
	//protected JFileChooser jFileChooserImportacionEstadoFactuImpre;
	//protected File fileImportacionEstadoFactuImpre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFactuImpre;
	protected JButton jButtonDuplicarToolBarEstadoFactuImpre;
	protected JButton jButtonNuevoRelacionesToolBarEstadoFactuImpre;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoFactuImpre;
	protected JButton jButtonCopiarToolBarEstadoFactuImpre;
	protected JButton jButtonVerFormToolBarEstadoFactuImpre;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoFactuImpre;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFactuImpre;
	protected JButton jButtonCerrarToolBarEstadoFactuImpre;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoFactuImpre;
	protected JButton jButtonProcesarInformacionToolBarEstadoFactuImpre;
	protected JButton jButtonAnterioresToolBarEstadoFactuImpre;
	protected JButton jButtonSiguientesToolBarEstadoFactuImpre;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre;
	protected JButton jButtonAbrirOrderByToolBarEstadoFactuImpre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFactuImpre;
	protected JMenuItem jMenuItemDuplicarEstadoFactuImpre;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoFactuImpre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoFactuImpre;
	protected JMenuItem jMenuItemCopiarEstadoFactuImpre;
	protected JMenuItem jMenuItemVerFormEstadoFactuImpre;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFactuImpre;
	protected JMenuItem jMenuItemCerrarEstadoFactuImpre;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFactuImpre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoFactuImpre;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFactuImpre;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoFactuImpre;
	protected JMenuItem jMenuItemProcesarInformacionEstadoFactuImpre;
	protected JMenuItem jMenuItemAnterioresEstadoFactuImpre;
	protected JMenuItem jMenuItemSiguientesEstadoFactuImpre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFactuImpre;
	protected JMenuItem jMenuItemAbrirOrderByEstadoFactuImpre;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFactuImpre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFactuImpre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoFactuImpre;
	protected JCheckBox jCheckBoxSeleccionadosEstadoFactuImpre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoFactuImpre;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoFactuImpre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoFactuImpre;
	protected JTextField jTextFieldValorCampoGeneralEstadoFactuImpre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoFactuImpre;
	//public JList<Reporte> jListColumnasSelectReporteEstadoFactuImpre;
	//public JScrollPane jScrollColumnasSelectReporteEstadoFactuImpre;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoFactuImpre;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoFactuImpre;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoFactuImpre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoFactuImpre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoFactuImpre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoFactuImpre;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoFactuImpre;
	
		
	//public JLabel jLabelArchivoImportacionEstadoFactuImpre;	
	//public JLabel jLabelPathArchivoImportacionEstadoFactuImpre;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoFactuImpre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoFactuImpre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoFactuImpre;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoFactuImpre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoFactuImpre;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoFactuImpre;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoFactuImpre;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoFactuImpre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoFactuImpre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoFactuImpre;	
	
	
	
	
	
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
	public EstadoFactuImpreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoFactuImpre)	{
		this.jButtonRecargarInformacionEstadoFactuImpre = jButtonRecargarInformacionEstadoFactuImpre;
	}
	
	public JButton getjButtonProcesarInformacionEstadoFactuImpre() {
		return this.jButtonProcesarInformacionEstadoFactuImpre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFactuImpre)	{
		this.jButtonProcesarInformacionEstadoFactuImpre = jButtonProcesarInformacionEstadoFactuImpre;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoFactuImpre() {
		return this.jButtonRecargarInformacionEstadoFactuImpre;
	}
	
	
	public List<EstadoFactuImpre> getestadofactuimpres() {
		return this.estadofactuimpres;
	}

	public void setestadofactuimpres(List<EstadoFactuImpre> estadofactuimpres) {
		this.estadofactuimpres = estadofactuimpres;
	}
	
	public List<EstadoFactuImpre> getestadofactuimpresAux() {
		return this.estadofactuimpresAux;
	}

	public void setestadofactuimpresAux(List<EstadoFactuImpre> estadofactuimpresAux) {
		this.estadofactuimpresAux = estadofactuimpresAux;
	}
	
	public List<EstadoFactuImpre> getestadofactuimpresEliminados() {
		return this.estadofactuimpresEliminados;
	}

	public void setEstadoFactuImpresEliminados(List<EstadoFactuImpre> estadofactuimpresEliminados) {
		this.estadofactuimpresEliminados = estadofactuimpresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoFactuImpre() {
		return jComboBoxTiposSeleccionarEstadoFactuImpre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoFactuImpre(
			JComboBox jComboBoxTiposSeleccionarEstadoFactuImpre) {
		this.jComboBoxTiposSeleccionarEstadoFactuImpre = jComboBoxTiposSeleccionarEstadoFactuImpre;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoFactuImpre() {
		return jTextFieldValorCampoGeneralEstadoFactuImpre;
	}

	public void setjTextFieldValorCampoGeneralEstadoFactuImpre(
			JTextField jTextFieldValorCampoGeneralEstadoFactuImpre) {
		this.jTextFieldValorCampoGeneralEstadoFactuImpre = jTextFieldValorCampoGeneralEstadoFactuImpre;
	}

	public void setBorderResaltarValorCampoGeneralEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoFactuImpre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoFactuImpre() {
		return this.jCheckBoxSeleccionarTodosEstadoFactuImpre;
	}

	public void setjCheckBoxSeleccionarTodosEstadoFactuImpre(
			JCheckBox jCheckBoxSeleccionarTodosEstadoFactuImpre) {
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre = jCheckBoxSeleccionarTodosEstadoFactuImpre;
	}

	public void setBorderResaltarSeleccionarTodosEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoFactuImpre() {
		return this.jCheckBoxSeleccionadosEstadoFactuImpre;
	}

	public void setjCheckBoxSeleccionadosEstadoFactuImpre(
			JCheckBox jCheckBoxSeleccionadosEstadoFactuImpre) {
		this.jCheckBoxSeleccionadosEstadoFactuImpre = jCheckBoxSeleccionadosEstadoFactuImpre;
	}
	
	public void setBorderResaltarSeleccionadosEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoFactuImpre() {
		return this.jComboBoxTiposArchivosReportesEstadoFactuImpre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoFactuImpre(
			JComboBox jComboBoxTiposArchivosReportesEstadoFactuImpre) {
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre = jComboBoxTiposArchivosReportesEstadoFactuImpre;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoFactuImpre() {
		return this.jComboBoxTiposReportesEstadoFactuImpre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoFactuImpre(
			JComboBox jComboBoxTiposReportesEstadoFactuImpre) {
		this.jComboBoxTiposReportesEstadoFactuImpre = jComboBoxTiposReportesEstadoFactuImpre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoFactuImpre() {
	//	return jComboBoxTiposReportesDinamicoEstadoFactuImpre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoFactuImpre(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoFactuImpre) {
	//	this.jComboBoxTiposReportesDinamicoEstadoFactuImpre = jComboBoxTiposReportesDinamicoEstadoFactuImpre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre = jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre;
	//}
	
	public void setBorderResaltarTiposReportesEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoFactuImpre() {
		return this.jComboBoxTiposGraficosReportesEstadoFactuImpre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoFactuImpre(
			JComboBox jComboBoxTiposGraficosReportesEstadoFactuImpre) {
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre = jComboBoxTiposGraficosReportesEstadoFactuImpre;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoFactuImpre() {
		return this.jComboBoxTiposPaginacionEstadoFactuImpre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoFactuImpre(
			JComboBox jComboBoxTiposPaginacionEstadoFactuImpre) {
		this.jComboBoxTiposPaginacionEstadoFactuImpre = jComboBoxTiposPaginacionEstadoFactuImpre;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoFactuImpre() {
		return this.jComboBoxTiposRelacionesEstadoFactuImpre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFactuImpre() {
		return this.jComboBoxTiposAccionesEstadoFactuImpre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFactuImpre(
			JComboBox jComboBoxTiposRelacionesEstadoFactuImpre) {
		this.jComboBoxTiposRelacionesEstadoFactuImpre = jComboBoxTiposRelacionesEstadoFactuImpre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFactuImpre(
			JComboBox jComboBoxTiposAccionesEstadoFactuImpre) {
		this.jComboBoxTiposAccionesEstadoFactuImpre = jComboBoxTiposAccionesEstadoFactuImpre;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoFactuImpre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoFactuImpre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoFactuImpre() {
	//	return jCheckBoxConGraficoDinamicoEstadoFactuImpre;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoFactuImpre(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoFactuImpre) {
	//	this.jCheckBoxConGraficoDinamicoEstadoFactuImpre = jCheckBoxConGraficoDinamicoEstadoFactuImpre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoFactuImpre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoFactuImpre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoFactuImpre .setBorder(borderResaltar);		
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
		this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		
		this.estadofactuimpreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofactuimpreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofactuimpreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFactuImpreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Factu Impre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoFactuImpreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoFactuImpre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"nuevo","nuevo","Nuevo"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"duplicar","duplicar","Duplicar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"copiar","copiar","Copiar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"ver_form","ver_form","Ver"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"recargar","recargar","Recargar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,
							"cerrar","cerrar","Salir"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoFactuImpre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoFactuImpre;
			
				this.jButtonProcesarInformacionToolBarEstadoFactuImpre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoFactuImpre;
				
		//protected JButton jButtonModificarToolBarEstadoFactuImpre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoFactuImpre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoFactuImpre=new JMenuMe("General");
		this.jmenuArchivoEstadoFactuImpre=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoFactuImpre=new JMenuMe("Acciones");
		this.jmenuDatosEstadoFactuImpre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFactuImpre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFactuImpre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFactuImpre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoFactuImpre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoFactuImpre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoFactuImpre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoFactuImpre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoFactuImpre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoFactuImpre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoFactuImpre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFactuImpre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFactuImpre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoFactuImpre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoFactuImpre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoFactuImpre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoFactuImpre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoFactuImpre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoFactuImpre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoFactuImpre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoFactuImpre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoFactuImpre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFactuImpre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFactuImpre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFactuImpre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoFactuImpre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoFactuImpre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoFactuImpre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoFactuImpre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoFactuImpre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoFactuImpre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoFactuImpre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoFactuImpre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoFactuImpre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoFactuImpre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoFactuImpre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoFactuImpre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoFactuImpre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoFactuImpre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoFactuImpre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFactuImpre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFactuImpre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFactuImpre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFactuImpre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFactuImpre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFactuImpre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoFactuImpre.add(this.jMenuItemCerrarEstadoFactuImpre);
			
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemNuevoEstadoFactuImpre);
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre);
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemNuevoRelacionesEstadoFactuImpre);
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemGuardarCambiosTablaEstadoFactuImpre);		
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemDuplicarEstadoFactuImpre);		
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemCopiarEstadoFactuImpre);		
			this.jmenuAccionesEstadoFactuImpre.add(this.jMenuItemVerFormEstadoFactuImpre);		
			
			this.jmenuDatosEstadoFactuImpre.add(this.jMenuItemRecargarInformacionEstadoFactuImpre);				
			this.jmenuDatosEstadoFactuImpre.add(this.jMenuItemAnterioresEstadoFactuImpre);				
			this.jmenuDatosEstadoFactuImpre.add(this.jMenuItemSiguientesEstadoFactuImpre);				
			this.jmenuDatosEstadoFactuImpre.add(this.jMenuItemAbrirOrderByEstadoFactuImpre);				
			this.jmenuDatosEstadoFactuImpre.add(this.jMenuItemMostrarOcultarEstadoFactuImpre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoFactuImpre.add(this.jMenuItemGuardarCambiosEstadoFactuImpre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoFactuImpre.add(this.jmenuArchivoEstadoFactuImpre);		
			this.jmenuBarEstadoFactuImpre.add(this.jmenuAccionesEstadoFactuImpre);		
			this.jmenuBarEstadoFactuImpre.add(this.jmenuDatosEstadoFactuImpre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoFactuImpre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoFactuImpre() {
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
			//this.jInternalFrameDetalleEstadoFactuImpre = new EstadoFactuImpreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Factu Impre DATOS");
			this.jInternalFrameDetalleFormEstadoFactuImpre = new EstadoFactuImpreDetalleFormJInternalFrame(jDesktopPane,this.estadofactuimpreSessionBean.getConGuardarRelaciones(),this.estadofactuimpreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoFactuImpre = null;//new EstadoFactuImpreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFactuImpre= new GridBagLayout();
		
		
		this.jTableDatosEstadoFactuImpre = new JTableMe();      
		
		String sToolTipEstadoFactuImpre="";
		sToolTipEstadoFactuImpre=EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFactuImpre+="(Facturacion.EstadoFactuImpre)";
		}
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFactuImpre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoFactuImpre.setToolTipText(sToolTipEstadoFactuImpre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoFactuImpre);
		this.jTableDatosEstadoFactuImpre.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoFactuImpre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoFactuImpre.setRowSelectionAllowed(true);
		this.jTableDatosEstadoFactuImpre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoFactuImpre = new JButtonMe();
		this.jButtonDuplicarEstadoFactuImpre = new JButtonMe();
		this.jButtonCopiarEstadoFactuImpre = new JButtonMe();
		this.jButtonVerFormEstadoFactuImpre = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoFactuImpre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre = new JButtonMe();
		this.jButtonCerrarEstadoFactuImpre = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFactuImpre = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoFactuImpre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Factu Impre";
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFactuImpre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFactuImpre.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFactuImpre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoFactuImpre=new ReporteDinamicoJInternalFrame(EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoFactuImpre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoFactuImpre=new ImportacionJInternalFrame(EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoFactuImpre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoFactuImpre = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoFactuImpre.setText("Orden");
		this.jButtonAbrirOrderByEstadoFactuImpre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFactuImpre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFactuImpre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFactuImpre,false,this);
			
			//this.cargarOrderByEstadoFactuImpre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFactuImpre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFactuImpre,true,this);
			
			//this.cargarOrderByEstadoFactuImpre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoFactuImpre.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoFactuImpre.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoFactuImpre.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoFactuImpre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFactuImpre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFactuImpre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoFactuImpre.setText("Nuevo");
		this.jButtonDuplicarEstadoFactuImpre.setText("Duplicar");
		this.jButtonCopiarEstadoFactuImpre.setText("Copiar");
		this.jButtonVerFormEstadoFactuImpre.setText("Ver");
		this.jButtonNuevoRelacionesEstadoFactuImpre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.setText("Guardar");
		this.jButtonCerrarEstadoFactuImpre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFactuImpre,"nuevo_button","Nuevo",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoFactuImpre,"duplicar_button","Duplicar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoFactuImpre,"copiar_button","Copiar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoFactuImpre,"ver_form","Ver",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoFactuImpre,"nuevorelaciones_button","Nuevo Rel",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFactuImpre,"guardarcambiostabla_button","Guardar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFactuImpre,"cerrar_button","Salir",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoFactuImpre.setToolTipText("Nuevo"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoFactuImpre.setToolTipText("Duplicar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoFactuImpre.setToolTipText("Copiar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoFactuImpre.setToolTipText("Ver"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoFactuImpre.setToolTipText("Nuevo Rel"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.setToolTipText("Guardar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFactuImpre.setToolTipText("Salir"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFactuImpre";
		inputMap = this.jButtonNuevoEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFactuImpre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFactuImpre"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoFactuImpre";
		inputMap = this.jButtonDuplicarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoFactuImpre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoFactuImpre"));
		
		//COPIAR
		sMapKey = "CopiarEstadoFactuImpre";
		inputMap = this.jButtonCopiarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoFactuImpre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoFactuImpre"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoFactuImpre";
		inputMap = this.jButtonVerFormEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoFactuImpre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoFactuImpre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoFactuImpre";
		inputMap = this.jButtonNuevoRelacionesEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoFactuImpre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoFactuImpre";
		inputMap = this.jButtonModificarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoFactuImpre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoFactuImpre";
		inputMap = this.jButtonCerrarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFactuImpre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFactuImpre";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFactuImpre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoFactuImpre.setName("jPanelParametrosReportesEstadoFactuImpre"); 
		
		this.jPanelParametrosReportesAccionesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoFactuImpre.setName("jPanelParametrosReportesAccionesEstadoFactuImpre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoFactuImpre = new JButtonMe();
		this.jButtonRecargarInformacionEstadoFactuImpre.setText("Recargar");
		this.jButtonRecargarInformacionEstadoFactuImpre.setToolTipText("Recargar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoFactuImpre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoFactuImpre = new JButtonMe();
		this.jButtonProcesarInformacionEstadoFactuImpre.setText("Procesar");
		this.jButtonProcesarInformacionEstadoFactuImpre.setToolTipText("Procesar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoFactuImpre.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoFactuImpre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFactuImpre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFactuImpre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoFactuImpre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoFactuImpre.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoFactuImpre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoFactuImpre.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoFactuImpre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFactuImpre.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFactuImpre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoFactuImpre.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoFactuImpre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoFactuImpre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFactuImpre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFactuImpre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoFactuImpre = new JLabelMe();
		
		this.jLabelAccionesEstadoFactuImpre.setText("Acciones");		
		this.jLabelAccionesEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoFactuImpre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoFactuImpre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoFactuImpre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoFactuImpre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoFactuImpre.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoFactuImpre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoFactuImpre = new JButtonMe();
		//this.jButtonAnterioresEstadoFactuImpre.setText("<<");
        this.jButtonAnterioresEstadoFactuImpre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoFactuImpre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoFactuImpre = new JButtonMe();
		//this.jButtonSiguientesEstadoFactuImpre.setText(">>");
        this.jButtonSiguientesEstadoFactuImpre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoFactuImpre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoFactuImpre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoFactuImpre.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoFactuImpre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoFactuImpre,"nuevoguardarcambios_button","Nue",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoFactuImpre";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoFactuImpre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoFactuImpre";
		inputMap = this.jButtonRecargarInformacionEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoFactuImpre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoFactuImpre";
		inputMap = this.jButtonSiguientesEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoFactuImpre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoFactuImpre";
		inputMap = this.jButtonAnterioresEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoFactuImpre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoFactuImpre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoFactuImpre.setMinimumSize(new Dimension(this.getWidth(),EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFactuImpre.setMaximumSize(new Dimension(this.getWidth(),EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFactuImpre.setPreferredSize(new Dimension(this.getWidth(),EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFactuImpreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoFactuImpre = new GridBagLayout();

			this.jPanelPaginacionEstadoFactuImpre.setLayout(gridaBagLayoutPaginacionEstadoFactuImpre);						
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonAnterioresEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					
						
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
			
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonNuevoGuardarCambiosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
						
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonSiguientesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonNuevoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
				this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
				this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonNuevoRelacionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			}
			
			
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
				this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
				this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonGuardarCambiosTablaEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			}
			
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonDuplicarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonCopiarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonVerFormEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 1;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoFactuImpre.add(this.jButtonCerrarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
		
		
		this.jButtonRecargarInformacionEstadoFactuImpre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFactuImpre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFactuImpre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFactuImpre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoFactuImpre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFactuImpre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFactuImpre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFactuImpre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoFactuImpre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFactuImpre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFactuImpre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoFactuImpre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFactuImpre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFactuImpre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoFactuImpre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFactuImpre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFactuImpre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoFactuImpre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFactuImpre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFactuImpre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoFactuImpre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFactuImpre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFactuImpre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoFactuImpre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoFactuImpre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoFactuImpre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoFactuImpre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoFactuImpre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoFactuImpre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoFactuImpre.setLayout(gridaBagParametrosReportesEstadoFactuImpre);
			this.jPanelParametrosReportesAccionesEstadoFactuImpre.setLayout(gridaBagParametrosReportesAccionesEstadoFactuImpre);
			
			
			this.jPanelParametrosAuxiliar1EstadoFactuImpre.setLayout(gridaBagParametrosAuxiliar1EstadoFactuImpre);
			this.jPanelParametrosAuxiliar2EstadoFactuImpre.setLayout(gridaBagParametrosAuxiliar2EstadoFactuImpre);
			this.jPanelParametrosAuxiliar3EstadoFactuImpre.setLayout(gridaBagParametrosAuxiliar3EstadoFactuImpre);
			this.jPanelParametrosAuxiliar4EstadoFactuImpre.setLayout(gridaBagParametrosAuxiliar4EstadoFactuImpre);
			//this.jPanelParametrosAuxiliar5EstadoFactuImpre.setLayout(gridaBagParametrosAuxiliar2EstadoFactuImpre);			
			
			
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jButtonRecargarInformacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFactuImpre.add(this.jComboBoxTiposPaginacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFactuImpre.add(this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFactuImpre.add(this.jComboBoxTiposArchivosReportesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jPanelParametrosAuxiliar1EstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoFactuImpre.add(this.jComboBoxTiposReportesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jPanelParametrosAuxiliar4EstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jComboBoxTiposReportesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jCheckBoxGenerarReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jPanelParametrosAuxiliar2EstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jLabelAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
				this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoFactuImpre.add(this.jButtonAbrirOrderByEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jComboBoxTiposSeleccionarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			
			
			/*
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jCheckBoxSeleccionarTodosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFactuImpre.add(this.jCheckBoxSeleccionarTodosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);															
				
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFactuImpre.add(this.jCheckBoxSeleccionadosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jPanelParametrosAuxiliar3EstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jComboBoxTiposRelacionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
				
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jComboBoxTiposAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
	
				
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFactuImpre.add(this.jTextFieldValorCampoGeneralEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoFactuImpre = new GridBagLayout();

			this.jScrollPanelDatosEstadoFactuImpre.setLayout(gridaBagLayoutDatosEstadoFactuImpre);
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
			
			this.jScrollPanelDatosEstadoFactuImpre.add(this.jTableDatosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoFactuImpre.setViewportView(this.jTableDatosEstadoFactuImpre);
		this.jTableDatosEstadoFactuImpre.setFillsViewportHeight(true);
		this.jTableDatosEstadoFactuImpre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoFactuImpre= new GridBagLayout();
		this.jPanelAccionesEstadoFactuImpre.setLayout(gridaBagLayoutAccionesEstadoFactuImpre);
		
		
		/*	
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
			
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonNuevoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFactuImpre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFactuImpre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;		
			//this.gridBagConstraintsEstadoFactuImpre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFactuImpre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;		
		//this.gridBagConstraintsEstadoFactuImpre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoFactuImpre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoFactuImpre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);								
		
		
		/*
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		*/		
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFactuImpre.gridx =0;
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFactuImpre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
				
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoFactuImpre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFactuImpre = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoFactuImpre.setLayout(gridaBagLayoutBusquedasParametrosEstadoFactuImpre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoFactuImpre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoFactuImpre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoFactuImpre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoFactuImpre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoFactuImpre.setName("jPanelReporteDinamicoEstadoFactuImpre"); 
		
		this.jPanelReporteDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoFactuImpre.setLayout(gridaBagLayoutReporteDinamicoEstadoFactuImpre);
		
		
		this.jInternalFrameReporteDinamicoEstadoFactuImpre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoFactuImpre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFactuImpre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoFactuImpre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoFactuImpre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoFactuImpre.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoFactuImpre.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoFactuImpre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoFactuImpre = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoFactuImpre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jLabelColumnasSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoFactuImpre = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoFactuImpre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoFactuImpre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoFactuImpre=new JScrollPane(this.jListColumnasSelectReporteEstadoFactuImpre);
			
			this.jScrollColumnasSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jListColumnasSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jScrollColumnasSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoFactuImpre = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoFactuImpre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jLabelRelacionesSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoFactuImpre = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoFactuImpre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoFactuImpre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoFactuImpre=new JScrollPane(this.jListRelacionesSelectReporteEstadoFactuImpre);
			
			this.jScrollRelacionesSelectReporteEstadoFactuImpre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFactuImpre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFactuImpre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jListRelacionesSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jScrollRelacionesSelectReporteEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoFactuImpre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoFactuImpre = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoFactuImpre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoFactuImpre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoFactuImpre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jLabelGenerarExcelReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre.setToolTipText("Generar EXCEL"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jComboBoxTiposReportesDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jLabelTiposArchivoReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoFactuImpre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoFactuImpre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoFactuImpre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoFactuImpre.setToolTipText("Generar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jButtonGenerarReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoFactuImpre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoFactuImpre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoFactuImpre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoFactuImpre.setToolTipText("Cancelar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFactuImpre.add(this.jButtonCerrarReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoFactuImpre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoFactuImpre= new JScrollPane(jPanelReporteDinamicoEstadoFactuImpre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoFactuImpre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFactuImpre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFactuImpre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoFactuImpre);
		this.jInternalFrameReporteDinamicoEstadoFactuImpre.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoFactuImpre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoFactuImpre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoFactuImpre.setName("jPanelImportacionEstadoFactuImpre"); 
		
		this.jPanelImportacionEstadoFactuImpre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFactuImpre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFactuImpre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoFactuImpre.setLayout(gridaBagLayoutImportacionEstadoFactuImpre);
		
		
		this.jInternalFrameImportacionEstadoFactuImpre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoFactuImpre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoFactuImpre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFactuImpre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoFactuImpre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFactuImpre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFactuImpre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoFactuImpre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFactuImpre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFactuImpre.setResizable(true);
	    this.jInternalFrameImportacionEstadoFactuImpre.setClosable(true);
	    this.jInternalFrameImportacionEstadoFactuImpre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoFactuImpre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFactuImpre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFactuImpre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoFactuImpre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFactuImpre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFactuImpre.setResizable(true);
	    this.jInternalFrameImportacionEstadoFactuImpre.setClosable(true);
	    this.jInternalFrameImportacionEstadoFactuImpre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoFactuImpre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFactuImpre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFactuImpre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoFactuImpre = new JLabelMe();

		this.jLabelArchivoImportacionEstadoFactuImpre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFactuImpre.add(this.jLabelArchivoImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoFactuImpre = new JFileChooser();		
		this.jFileChooserImportacionEstadoFactuImpre.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoFactuImpre = new JButtonMe();
		this.jButtonAbrirImportacionEstadoFactuImpre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoFactuImpre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoFactuImpre.setToolTipText("Generar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFactuImpre.add(this.jButtonAbrirImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoFactuImpre = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoFactuImpre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFactuImpre.add(this.jLabelPathArchivoImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoFactuImpre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoFactuImpre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFactuImpre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFactuImpre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFactuImpre.add(this.jTextFieldPathArchivoImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoFactuImpre = new JButtonMe();
		this.jButtonGenerarImportacionEstadoFactuImpre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoFactuImpre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoFactuImpre.setToolTipText("Generar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFactuImpre.add(this.jButtonGenerarImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoFactuImpre = new JButtonMe();
		this.jButtonCerrarImportacionEstadoFactuImpre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoFactuImpre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoFactuImpre.setToolTipText("Cancelar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFactuImpre.add(this.jButtonCerrarImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoFactuImpre = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoFactuImpre= new JScrollPane(jPanelImportacionEstadoFactuImpre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoFactuImpre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoFactuImpre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoFactuImpre);
		this.jInternalFrameImportacionEstadoFactuImpre.getContentPane().add(this.jScrollPanelImportacionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoFactuImpre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoFactuImpre = new JButtonMe();
			this.jButtonAbrirOrderByEstadoFactuImpre.setText("Orden");
			this.jButtonAbrirOrderByEstadoFactuImpre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFactuImpre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoFactuImpre";
			inputMap = this.jButtonAbrirOrderByEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoFactuImpre"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoFactuImpre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoFactuImpre.setName("jPanelOrderByEstadoFactuImpre"); 
			
			this.jPanelOrderByEstadoFactuImpre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFactuImpre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFactuImpre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoFactuImpre.setLayout(gridaBagLayoutOrderByEstadoFactuImpre);
			
			
			this.jTableDatosEstadoFactuImpreOrderBy = new JTableMe();        
			this.jTableDatosEstadoFactuImpreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoFactuImpreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoFactuImpreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoFactuImpreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoFactuImpreOrderBy.setViewportView(this.jTableDatosEstadoFactuImpreOrderBy);
			this.jTableDatosEstadoFactuImpreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoFactuImpreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoFactuImpre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoFactuImpre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoFactuImpre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoFactuImpre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoFactuImpre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoFactuImpre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoFactuImpre.setTitle("Orden");
			this.jInternalFrameOrderByEstadoFactuImpre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoFactuImpre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoFactuImpre.setResizable(true);
			this.jInternalFrameOrderByEstadoFactuImpre.setClosable(true);
			this.jInternalFrameOrderByEstadoFactuImpre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoFactuImpre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFactuImpre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFactuImpre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoFactuImpre.ipady =150;
				
			this.jPanelOrderByEstadoFactuImpre.add(jScrollPanelDatosEstadoFactuImpreOrderBy, this.gridBagConstraintsEstadoFactuImpre);//this.jTableDatosEstadoFactuImpreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoFactuImpre = new JButtonMe();
			this.jButtonCerrarOrderByEstadoFactuImpre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoFactuImpre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoFactuImpre.setToolTipText("Cancelar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoFactuImpre.add(this.jButtonCerrarOrderByEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoFactuImpre = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoFactuImpre= new JScrollPane(jPanelOrderByEstadoFactuImpre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoFactuImpre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoFactuImpre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoFactuImpre);
			
			this.jInternalFrameOrderByEstadoFactuImpre.getContentPane().add(this.jScrollPanelOrderByEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
		
		} else {
			this.jButtonAbrirOrderByEstadoFactuImpre = new JButtonMe();
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
			&& this.estadofactuimpreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoFactuImpre.getRowHeight();//EstadoFactuImpreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.isSelected()) {
					iHeightTable=EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFactuImpre.isSelected()) {
					iHeightTable=EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFactuImpreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoFactuImpre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFactuImpre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFactuImpre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoFactuImpre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFactuImpre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFactuImpre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoFactuImpre!=null && this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy()!=null) {
			//if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoFactuImpre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoFactuImpre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoFactuImpre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoFactuImpre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFactuImpre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFactuImpre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadofactuimpreLogic.getEstadoFactuImpres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofactuimpres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoFactuImpre> TraerEstadoFactuImpreBeans(List<EstadoFactuImpre> estadofactuimpres,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoFactuImpre estadofactuimpre:estadofactuimpres) {
					
				if(!(EstadoFactuImpreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoFactuImpreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadofactuimpre.setsDetalleGeneralEntityReporte(EstadoFactuImpreConstantesFunciones.getEstadoFactuImpreDescripcion(estadofactuimpre));
										
						
					
					

					if(estadofactuimpre.getFacturaImpresions()!=null && Funciones.existeClass(classes,FacturaImpresion.class)) {
						try{estadofactuimpre.setfacturaimpresionsDescripcionReporte(new JRBeanCollectionDataSource(FacturaImpresionJInternalFrame.TraerFacturaImpresionBeans(estadofactuimpre.getFacturaImpresions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadofactuimpre.setsDetalleGeneralEntityReporte(estadofactuimpre.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadofactuimprebeans.add(estadofactuimprebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadofactuimpres;
    }
	//PARA REPORTES FIN
}
