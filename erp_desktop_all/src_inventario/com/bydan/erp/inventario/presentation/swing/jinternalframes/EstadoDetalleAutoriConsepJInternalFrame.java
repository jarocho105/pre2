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
import com.bydan.erp.inventario.util.EstadoDetalleAutoriConsepConstantesFunciones;

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
public class EstadoDetalleAutoriConsepJInternalFrame extends EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleAutoriConsep;
	
	protected JMenuBar jmenuBarEstadoDetalleAutoriConsep;
	
	protected JMenu jmenuEstadoDetalleAutoriConsep;
	protected JMenu jmenuDatosEstadoDetalleAutoriConsep;
	protected JMenu jmenuArchivoEstadoDetalleAutoriConsep;
	protected JMenu jmenuAccionesEstadoDetalleAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleAutoriConsep;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleAutoriConsep;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleAutoriConsep;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps;		
	public List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsEliminados;	
	public List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleAutoriConsep;		
	protected JButton jButtonAbrirOrderByEstadoDetalleAutoriConsep;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleAutoriConsep;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleAutoriConsep;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleAutoriConsep;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleAutoriConsep;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleAutoriConsepOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleAutoriConsep;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleAutoriConsep;
	
    protected JPanel jPanelPaginacionEstadoDetalleAutoriConsep;
    protected JPanel jPanelParametrosReportesEstadoDetalleAutoriConsep;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleAutoriConsep;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleAutoriConsep;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleAutoriConsep;
	//protected JPanel jPanelImportacionEstadoDetalleAutoriConsep;
	
	
	public JTable jTableDatosEstadoDetalleAutoriConsep;
	
	
	
	//public JTable jTableDatosEstadoDetalleAutoriConsepOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleAutoriConsep;
	protected JButton jButtonDuplicarEstadoDetalleAutoriConsep;
	protected JButton jButtonCopiarEstadoDetalleAutoriConsep;
	protected JButton jButtonVerFormEstadoDetalleAutoriConsep;
	protected JButton jButtonNuevoRelacionesEstadoDetalleAutoriConsep;
	protected JButton jButtonModificarEstadoDetalleAutoriConsep;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep;
	protected JButton jButtonCerrarEstadoDetalleAutoriConsep;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleAutoriConsep;
	protected JButton jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	
	
	protected JButton jButtonAnterioresEstadoDetalleAutoriConsep;
	protected JButton jButtonSiguientesEstadoDetalleAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleAutoriConsep;
	//protected JButton jButtonGenerarImportacionEstadoDetalleAutoriConsep;
	//protected JButton jButtonCerrarImportacionEstadoDetalleAutoriConsep;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleAutoriConsep;
	//protected File fileImportacionEstadoDetalleAutoriConsep;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonDuplicarToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonCopiarToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonVerFormToolBarEstadoDetalleAutoriConsep;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonCerrarToolBarEstadoDetalleAutoriConsep;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonAnterioresToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonSiguientesToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemCopiarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemVerFormEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemCerrarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleAutoriConsep;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleAutoriConsep;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleAutoriConsep;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleAutoriConsep;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleAutoriConsep;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleAutoriConsep;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleAutoriConsep;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleAutoriConsep;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleAutoriConsep;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleAutoriConsep;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleAutoriConsep;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleAutoriConsep;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleAutoriConsep;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleAutoriConsep;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleAutoriConsep;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleAutoriConsep;	
	
	
	
	
	
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
	public EstadoDetalleAutoriConsepJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleAutoriConsep)	{
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep = jButtonRecargarInformacionEstadoDetalleAutoriConsep;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleAutoriConsep() {
		return this.jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleAutoriConsep)	{
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep = jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleAutoriConsep() {
		return this.jButtonRecargarInformacionEstadoDetalleAutoriConsep;
	}
	
	
	public List<EstadoDetalleAutoriConsep> getestadodetalleautoriconseps() {
		return this.estadodetalleautoriconseps;
	}

	public void setestadodetalleautoriconseps(List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps) {
		this.estadodetalleautoriconseps = estadodetalleautoriconseps;
	}
	
	public List<EstadoDetalleAutoriConsep> getestadodetalleautoriconsepsAux() {
		return this.estadodetalleautoriconsepsAux;
	}

	public void setestadodetalleautoriconsepsAux(List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsAux) {
		this.estadodetalleautoriconsepsAux = estadodetalleautoriconsepsAux;
	}
	
	public List<EstadoDetalleAutoriConsep> getestadodetalleautoriconsepsEliminados() {
		return this.estadodetalleautoriconsepsEliminados;
	}

	public void setEstadoDetalleAutoriConsepsEliminados(List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsEliminados) {
		this.estadodetalleautoriconsepsEliminados = estadodetalleautoriconsepsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleAutoriConsep() {
		return jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep = jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleAutoriConsep() {
		return jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleAutoriConsep(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep) {
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep = jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep = jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleAutoriConsep() {
		return this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleAutoriConsep(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleAutoriConsep) {
		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep = jCheckBoxSeleccionadosEstadoDetalleAutoriConsep;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep = jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposReportesEstadoDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposReportesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep = jComboBoxTiposReportesEstadoDetalleAutoriConsep;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep = jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep = jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep = jComboBoxTiposPaginacionEstadoDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep = jComboBoxTiposRelacionesEstadoDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep = jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep = jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleAutoriConsep() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleAutoriConsep.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep .setBorder(borderResaltar);		
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
		this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		
		this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleAutoriConsep= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"copiar","copiar","Copiar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"recargar","recargar","Recargar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleAutoriConsep=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleAutoriConsep;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleAutoriConsep;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleAutoriConsep=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleAutoriConsep=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleAutoriConsep=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleAutoriConsep=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleAutoriConsep= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleAutoriConsep.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleAutoriConsep,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleAutoriConsep= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleAutoriConsep.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleAutoriConsep,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleAutoriConsep= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleAutoriConsep.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleAutoriConsep,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleAutoriConsep= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleAutoriConsep.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleAutoriConsep,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleAutoriConsep= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleAutoriConsep.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleAutoriConsep,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleAutoriConsep= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleAutoriConsep.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleAutoriConsep,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleAutoriConsep.add(this.jMenuItemCerrarEstadoDetalleAutoriConsep);
			
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemNuevoEstadoDetalleAutoriConsep);
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep);
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep);
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep);		
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemDuplicarEstadoDetalleAutoriConsep);		
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemCopiarEstadoDetalleAutoriConsep);		
			this.jmenuAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemVerFormEstadoDetalleAutoriConsep);		
			
			this.jmenuDatosEstadoDetalleAutoriConsep.add(this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep);				
			this.jmenuDatosEstadoDetalleAutoriConsep.add(this.jMenuItemAnterioresEstadoDetalleAutoriConsep);				
			this.jmenuDatosEstadoDetalleAutoriConsep.add(this.jMenuItemSiguientesEstadoDetalleAutoriConsep);				
			this.jmenuDatosEstadoDetalleAutoriConsep.add(this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep);				
			this.jmenuDatosEstadoDetalleAutoriConsep.add(this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleAutoriConsep.add(this.jmenuArchivoEstadoDetalleAutoriConsep);		
			this.jmenuBarEstadoDetalleAutoriConsep.add(this.jmenuAccionesEstadoDetalleAutoriConsep);		
			this.jmenuBarEstadoDetalleAutoriConsep.add(this.jmenuDatosEstadoDetalleAutoriConsep);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleAutoriConsep);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleAutoriConsep() {
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
			//this.jInternalFrameDetalleEstadoDetalleAutoriConsep = new EstadoDetalleAutoriConsepDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Autorizacion Consep DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep = new EstadoDetalleAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones(),this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep = null;//new EstadoDetalleAutoriConsepDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleAutoriConsep= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleAutoriConsep = new JTableMe();      
		
		String sToolTipEstadoDetalleAutoriConsep="";
		sToolTipEstadoDetalleAutoriConsep=EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleAutoriConsep+="(Inventario.EstadoDetalleAutoriConsep)";
		}
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleAutoriConsep+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleAutoriConsep.setToolTipText(sToolTipEstadoDetalleAutoriConsep);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleAutoriConsep);
		this.jTableDatosEstadoDetalleAutoriConsep.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCopiarEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonVerFormEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarEstadoDetalleAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Autorizacion Consep";
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleAutoriConsep.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep=new ReporteDinamicoJInternalFrame(EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleAutoriConsep();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleAutoriConsep=new ImportacionJInternalFrame(EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleAutoriConsep();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleAutoriConsep = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,false,this);
			
			//this.cargarOrderByEstadoDetalleAutoriConsep(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,true,this);
			
			//this.cargarOrderByEstadoDetalleAutoriConsep(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleAutoriConsep.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleAutoriConsep.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleAutoriConsep.setText("Copiar");
		this.jButtonVerFormEstadoDetalleAutoriConsep.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setText("Guardar");
		this.jButtonCerrarEstadoDetalleAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleAutoriConsep,"nuevo_button","Nuevo",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleAutoriConsep,"duplicar_button","Duplicar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleAutoriConsep,"copiar_button","Copiar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleAutoriConsep,"ver_form","Ver",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep,"nuevorelaciones_button","Nuevo Rel",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep,"guardarcambiostabla_button","Guardar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleAutoriConsep,"cerrar_button","Salir",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleAutoriConsep.setToolTipText("Nuevo"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleAutoriConsep.setToolTipText("Duplicar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleAutoriConsep.setToolTipText("Copiar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleAutoriConsep.setToolTipText("Ver"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.setToolTipText("Nuevo Rel"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setToolTipText("Guardar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleAutoriConsep.setToolTipText("Salir"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleAutoriConsep"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonDuplicarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleAutoriConsep"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCopiarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleAutoriConsep"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleAutoriConsep";
		inputMap = this.jButtonVerFormEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleAutoriConsep"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleAutoriConsep"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonModificarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleAutoriConsep"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCerrarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleAutoriConsep"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setName("jPanelParametrosReportesEstadoDetalleAutoriConsep"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep.setName("jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.setToolTipText("Recargar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleAutoriConsep,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setToolTipText("Procesar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleAutoriConsep.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleAutoriConsep = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleAutoriConsep.setText("<<");
        this.jButtonAnterioresEstadoDetalleAutoriConsep.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleAutoriConsep,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleAutoriConsep = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleAutoriConsep.setText(">>");
        this.jButtonSiguientesEstadoDetalleAutoriConsep.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleAutoriConsep,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep,"nuevoguardarcambios_button","Nue",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleAutoriConsep"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleAutoriConsep";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleAutoriConsep"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleAutoriConsep";
		inputMap = this.jButtonSiguientesEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleAutoriConsep"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleAutoriConsep";
		inputMap = this.jButtonAnterioresEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleAutoriConsep"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleAutoriConsep();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleAutoriConsep = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutPaginacionEstadoDetalleAutoriConsep);						
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonAnterioresEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					
						
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
						
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonSiguientesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonNuevoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
						
			
			
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonDuplicarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonCopiarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonVerFormEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 1;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleAutoriConsep.add(this.jButtonCerrarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleAutoriConsep = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleAutoriConsep = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setLayout(gridaBagParametrosReportesEstadoDetalleAutoriConsep);
			this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleAutoriConsep);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleAutoriConsep);
			this.jPanelParametrosAuxiliar2EstadoDetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleAutoriConsep);
			this.jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleAutoriConsep);
			this.jPanelParametrosAuxiliar4EstadoDetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleAutoriConsep);
			//this.jPanelParametrosAuxiliar5EstadoDetalleAutoriConsep.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleAutoriConsep);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jButtonRecargarInformacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep.add(this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep.add(this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar1EstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleAutoriConsep.add(this.jComboBoxTiposReportesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar4EstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jComboBoxTiposReportesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jCheckBoxGenerarReporteEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar2EstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jLabelAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jButtonAbrirOrderByEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep.add(this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);															
				
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep.add(this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jPanelParametrosAuxiliar3EstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
				
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.add(this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleAutoriConsep = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutDatosEstadoDetalleAutoriConsep);
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleAutoriConsep.add(this.jTableDatosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setViewportView(this.jTableDatosEstadoDetalleAutoriConsep);
		this.jTableDatosEstadoDetalleAutoriConsep.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleAutoriConsep.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesEstadoDetalleAutoriConsep);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonNuevoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleAutoriConsep);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/		
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
				
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleAutoriConsep = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleAutoriConsep);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleAutoriConsep() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setName("jPanelReporteDinamicoEstadoDetalleAutoriConsep"); 
		
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleAutoriConsep);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jLabelColumnasSelectReporteEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleAutoriConsep = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleAutoriConsep);
			
			this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jListColumnasSelectReporteEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleAutoriConsep);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleAutoriConsep = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleAutoriConsep = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.setToolTipText("Generar EXCEL"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep.setToolTipText("Generar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep.setToolTipText("Cancelar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleAutoriConsep.add(this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep= new JScrollPane(jPanelReporteDinamicoEstadoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleAutoriConsep);
		this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleAutoriConsep() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleAutoriConsep.setName("jPanelImportacionEstadoDetalleAutoriConsep"); 
		
		this.jPanelImportacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutImportacionEstadoDetalleAutoriConsep);
		
		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleAutoriConsep= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleAutoriConsep.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jLabelArchivoImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleAutoriConsep = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleAutoriConsep.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleAutoriConsep.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleAutoriConsep,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleAutoriConsep.setToolTipText("Generar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jButtonAbrirImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jLabelPathArchivoImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jTextFieldPathArchivoImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleAutoriConsep.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleAutoriConsep,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleAutoriConsep.setToolTipText("Generar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jButtonGenerarImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleAutoriConsep.setToolTipText("Cancelar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleAutoriConsep.add(this.jButtonCerrarImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleAutoriConsep= new JScrollPane(jPanelImportacionEstadoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleAutoriConsep);
		this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleAutoriConsep(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleAutoriConsep";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleAutoriConsep"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleAutoriConsep = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleAutoriConsep.setName("jPanelOrderByEstadoDetalleAutoriConsep"); 
			
			this.jPanelOrderByEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutOrderByEstadoDetalleAutoriConsep);
			
			
			this.jTableDatosEstadoDetalleAutoriConsepOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleAutoriConsepOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleAutoriConsepOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleAutoriConsepOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleAutoriConsepOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleAutoriConsepOrderBy.setViewportView(this.jTableDatosEstadoDetalleAutoriConsepOrderBy);
			this.jTableDatosEstadoDetalleAutoriConsepOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleAutoriConsepOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleAutoriConsep= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleAutoriConsep.ipady =150;
				
			this.jPanelOrderByEstadoDetalleAutoriConsep.add(jScrollPanelDatosEstadoDetalleAutoriConsepOrderBy, this.gridBagConstraintsEstadoDetalleAutoriConsep);//this.jTableDatosEstadoDetalleAutoriConsepTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleAutoriConsep = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleAutoriConsep.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleAutoriConsep,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleAutoriConsep.setToolTipText("Cancelar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleAutoriConsep.add(this.jButtonCerrarOrderByEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleAutoriConsep = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleAutoriConsep= new JScrollPane(jPanelOrderByEstadoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleAutoriConsep);
			
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleAutoriConsep.getRowHeight();//EstadoDetalleAutoriConsepConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.isSelected()) {
					iHeightTable=EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleAutoriConsep.isSelected()) {
					iHeightTable=EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep!=null && this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleautoriconseps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleAutoriConsep> TraerEstadoDetalleAutoriConsepBeans(List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:estadodetalleautoriconseps) {
					
				if(!(EstadoDetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetalleautoriconsep.setsDetalleGeneralEntityReporte(EstadoDetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsep));
										
						
					
						
					
				} else  {
							
					//estadodetalleautoriconsep.setsDetalleGeneralEntityReporte(estadodetalleautoriconsep.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetalleautoriconsepbeans.add(estadodetalleautoriconsepbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetalleautoriconseps;
    }
	//PARA REPORTES FIN
}
