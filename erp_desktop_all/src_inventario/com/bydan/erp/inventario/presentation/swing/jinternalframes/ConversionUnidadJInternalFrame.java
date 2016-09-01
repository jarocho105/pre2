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
import com.bydan.erp.inventario.util.ConversionUnidadConstantesFunciones;

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
public class ConversionUnidadJInternalFrame extends ConversionUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConversionUnidad;
	
	protected JMenuBar jmenuBarConversionUnidad;
	
	protected JMenu jmenuConversionUnidad;
	protected JMenu jmenuDatosConversionUnidad;
	protected JMenu jmenuArchivoConversionUnidad;
	protected JMenu jmenuAccionesConversionUnidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConversionUnidad;	
	protected GridBagConstraints gridBagConstraintsConversionUnidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConversionUnidadDetalleFormJInternalFrame jInternalFrameDetalleFormConversionUnidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConversionUnidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConversionUnidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidaddesdeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidaddesde="";

	protected UnidadBeanSwingJInternalFrame unidadhastaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidadhasta="";
	
	public ConversionUnidadSessionBean conversionunidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidaddesdeSessionBean;
	public UnidadSessionBean unidadhastaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConversionUnidad> conversionunidads;		
	public List<ConversionUnidad> conversionunidadsEliminados;	
	public List<ConversionUnidad> conversionunidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConversionUnidad;		
	protected JButton jButtonAbrirOrderByConversionUnidad;
	
	
	//protected JPanel jPanelOrderByConversionUnidad;
	//public JScrollPane jScrollPanelOrderByConversionUnidad;	
	//protected JButton jButtonCerrarOrderByConversionUnidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConversionUnidadLogic conversionunidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConversionUnidad;
	public JScrollPane jScrollPanelDatosEdicionConversionUnidad;
	public JScrollPane jScrollPanelDatosGeneralConversionUnidad;
    
	
	
	//public JScrollPane jScrollPanelDatosConversionUnidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConversionUnidad;
	//public JScrollPane jScrollPanelImportacionConversionUnidad;
	
	
	
	protected JPanel jPanelAccionesConversionUnidad;
	
    protected JPanel jPanelPaginacionConversionUnidad;
    protected JPanel jPanelParametrosReportesConversionUnidad;
	protected JPanel jPanelParametrosReportesAccionesConversionUnidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConversionUnidad;
	protected JPanel jPanelParametrosAuxiliar2ConversionUnidad;
	protected JPanel jPanelParametrosAuxiliar3ConversionUnidad;
	protected JPanel jPanelParametrosAuxiliar4ConversionUnidad;
	//protected JPanel jPanelParametrosAuxiliar5ConversionUnidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoConversionUnidad;
	//protected JPanel jPanelImportacionConversionUnidad;
	
	
	public JTable jTableDatosConversionUnidad;
	
	
	
	//public JTable jTableDatosConversionUnidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConversionUnidad;
	protected JButton jButtonDuplicarConversionUnidad;
	protected JButton jButtonCopiarConversionUnidad;
	protected JButton jButtonVerFormConversionUnidad;
	protected JButton jButtonNuevoRelacionesConversionUnidad;
	protected JButton jButtonModificarConversionUnidad;
	
    protected JButton jButtonGuardarCambiosTablaConversionUnidad;
	protected JButton jButtonCerrarConversionUnidad;
	
	
	protected JButton jButtonRecargarInformacionConversionUnidad;
	protected JButton jButtonProcesarInformacionConversionUnidad;
	
	
	protected JButton jButtonAnterioresConversionUnidad;
	protected JButton jButtonSiguientesConversionUnidad;
	protected JButton jButtonNuevoGuardarCambiosConversionUnidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConversionUnidad;
	//protected JButton jButtonCerrarReporteDinamicoConversionUnidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoConversionUnidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionConversionUnidad;
	//protected JButton jButtonGenerarImportacionConversionUnidad;
	//protected JButton jButtonCerrarImportacionConversionUnidad;
	//protected JFileChooser jFileChooserImportacionConversionUnidad;
	//protected File fileImportacionConversionUnidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConversionUnidad;
	protected JButton jButtonDuplicarToolBarConversionUnidad;
	protected JButton jButtonNuevoRelacionesToolBarConversionUnidad;
	
	
	public JButton jButtonGuardarCambiosToolBarConversionUnidad;
	protected JButton jButtonCopiarToolBarConversionUnidad;
	protected JButton jButtonVerFormToolBarConversionUnidad;
	public JButton jButtonGuardarCambiosTablaToolBarConversionUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarConversionUnidad;
	protected JButton jButtonCerrarToolBarConversionUnidad;
	
	protected JButton jButtonRecargarInformacionToolBarConversionUnidad;
	protected JButton jButtonProcesarInformacionToolBarConversionUnidad;
	protected JButton jButtonAnterioresToolBarConversionUnidad;
	protected JButton jButtonSiguientesToolBarConversionUnidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarConversionUnidad;
	protected JButton jButtonAbrirOrderByToolBarConversionUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConversionUnidad;
	protected JMenuItem jMenuItemDuplicarConversionUnidad;
	protected JMenuItem jMenuItemNuevoRelacionesConversionUnidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConversionUnidad;
	protected JMenuItem jMenuItemCopiarConversionUnidad;
	protected JMenuItem jMenuItemVerFormConversionUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaConversionUnidad;
	protected JMenuItem jMenuItemCerrarConversionUnidad;
	protected JMenuItem jMenuItemDetalleCerrarConversionUnidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConversionUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarConversionUnidad;
	
	protected JMenuItem jMenuItemRecargarInformacionConversionUnidad;
	protected JMenuItem jMenuItemProcesarInformacionConversionUnidad;
	protected JMenuItem jMenuItemAnterioresConversionUnidad;
	protected JMenuItem jMenuItemSiguientesConversionUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConversionUnidad;
	protected JMenuItem jMenuItemAbrirOrderByConversionUnidad;
	protected JMenuItem jMenuItemMostrarOcultarConversionUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConversionUnidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConversionUnidad;
	protected JCheckBox jCheckBoxSeleccionadosConversionUnidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConversionUnidad;
	protected JCheckBox jCheckBoxConGraficoReporteConversionUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConversionUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConversionUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConversionUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConversionUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConversionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConversionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConversionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConversionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConversionUnidad;
	protected JTextField jTextFieldValorCampoGeneralConversionUnidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConversionUnidad;
	//public JList<Reporte> jListColumnasSelectReporteConversionUnidad;
	//public JScrollPane jScrollColumnasSelectReporteConversionUnidad;
	
	//public JLabel jLabelRelacionesSelectReporteConversionUnidad;
	//public JList<Reporte> jListRelacionesSelectReporteConversionUnidad;
	//public JScrollPane jScrollRelacionesSelectReporteConversionUnidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConversionUnidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConversionUnidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConversionUnidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoConversionUnidad;
	
		
	//public JLabel jLabelArchivoImportacionConversionUnidad;	
	//public JLabel jLabelPathArchivoImportacionConversionUnidad;
	//protected JTextField jTextFieldPathArchivoImportacionConversionUnidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConversionUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConversionUnidad;
	
	//public JLabel jLabelColumnaCategoriaValorConversionUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConversionUnidad;
	
	//public JLabel jLabelColumnasValoresGraficoConversionUnidad;
	//public JList<Reporte> jListColumnasValoresGraficoConversionUnidad;
	//public JScrollPane jScrollColumnasValoresGraficoConversionUnidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConversionUnidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConversionUnidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConversionUnidad;
	public JPanel jPanelFK_IdUnidadDesdeConversionUnidad;
	public JButton jButtonFK_IdUnidadDesdeConversionUnidad;
	public JPanel jPanelFK_IdUnidadHastaConversionUnidad;
	public JButton jButtonFK_IdUnidadHastaConversionUnidad;
	
	public JPanel jPanelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad;
	public JLabel jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad;
	public JButton jButtonid_unidad_desdeFK_IdUnidadDesdeConversionUnidad= new JButtonMe();
	public JButton jButtonid_unidad_desdeFK_IdUnidadDesdeConversionUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidad_desdeFK_IdUnidadDesdeConversionUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidad_hastaFK_IdUnidadHastaConversionUnidad;
	public JLabel jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad;
	public JButton jButtonid_unidad_hastaFK_IdUnidadHastaConversionUnidad= new JButtonMe();
	public JButton jButtonid_unidad_hastaFK_IdUnidadHastaConversionUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidad_hastaFK_IdUnidadHastaConversionUnidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConversionUnidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConversionUnidad)	{
		this.jButtonRecargarInformacionConversionUnidad = jButtonRecargarInformacionConversionUnidad;
	}
	
	public JButton getjButtonProcesarInformacionConversionUnidad() {
		return this.jButtonProcesarInformacionConversionUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConversionUnidad)	{
		this.jButtonProcesarInformacionConversionUnidad = jButtonProcesarInformacionConversionUnidad;
	}
	
	
	public JButton getjButtonRecargarInformacionConversionUnidad() {
		return this.jButtonRecargarInformacionConversionUnidad;
	}
	
	
	public List<ConversionUnidad> getconversionunidads() {
		return this.conversionunidads;
	}

	public void setconversionunidads(List<ConversionUnidad> conversionunidads) {
		this.conversionunidads = conversionunidads;
	}
	
	public List<ConversionUnidad> getconversionunidadsAux() {
		return this.conversionunidadsAux;
	}

	public void setconversionunidadsAux(List<ConversionUnidad> conversionunidadsAux) {
		this.conversionunidadsAux = conversionunidadsAux;
	}
	
	public List<ConversionUnidad> getconversionunidadsEliminados() {
		return this.conversionunidadsEliminados;
	}

	public void setConversionUnidadsEliminados(List<ConversionUnidad> conversionunidadsEliminados) {
		this.conversionunidadsEliminados = conversionunidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConversionUnidad() {
		return jComboBoxTiposSeleccionarConversionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConversionUnidad(
			JComboBox jComboBoxTiposSeleccionarConversionUnidad) {
		this.jComboBoxTiposSeleccionarConversionUnidad = jComboBoxTiposSeleccionarConversionUnidad;
	}
	
	public void setBorderResaltarTiposSeleccionarConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConversionUnidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConversionUnidad() {
		return jTextFieldValorCampoGeneralConversionUnidad;
	}

	public void setjTextFieldValorCampoGeneralConversionUnidad(
			JTextField jTextFieldValorCampoGeneralConversionUnidad) {
		this.jTextFieldValorCampoGeneralConversionUnidad = jTextFieldValorCampoGeneralConversionUnidad;
	}

	public void setBorderResaltarValorCampoGeneralConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConversionUnidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConversionUnidad() {
		return this.jCheckBoxSeleccionarTodosConversionUnidad;
	}

	public void setjCheckBoxSeleccionarTodosConversionUnidad(
			JCheckBox jCheckBoxSeleccionarTodosConversionUnidad) {
		this.jCheckBoxSeleccionarTodosConversionUnidad = jCheckBoxSeleccionarTodosConversionUnidad;
	}

	public void setBorderResaltarSeleccionarTodosConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConversionUnidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConversionUnidad() {
		return this.jCheckBoxSeleccionadosConversionUnidad;
	}

	public void setjCheckBoxSeleccionadosConversionUnidad(
			JCheckBox jCheckBoxSeleccionadosConversionUnidad) {
		this.jCheckBoxSeleccionadosConversionUnidad = jCheckBoxSeleccionadosConversionUnidad;
	}
	
	public void setBorderResaltarSeleccionadosConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConversionUnidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConversionUnidad() {
		return this.jComboBoxTiposArchivosReportesConversionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConversionUnidad(
			JComboBox jComboBoxTiposArchivosReportesConversionUnidad) {
		this.jComboBoxTiposArchivosReportesConversionUnidad = jComboBoxTiposArchivosReportesConversionUnidad;
	}

	public void setBorderResaltarTiposArchivosReportesConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConversionUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConversionUnidad() {
		return this.jComboBoxTiposReportesConversionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConversionUnidad(
			JComboBox jComboBoxTiposReportesConversionUnidad) {
		this.jComboBoxTiposReportesConversionUnidad = jComboBoxTiposReportesConversionUnidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConversionUnidad() {
	//	return jComboBoxTiposReportesDinamicoConversionUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConversionUnidad(
	//		JComboBox jComboBoxTiposReportesDinamicoConversionUnidad) {
	//	this.jComboBoxTiposReportesDinamicoConversionUnidad = jComboBoxTiposReportesDinamicoConversionUnidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConversionUnidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoConversionUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConversionUnidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConversionUnidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad = jComboBoxTiposArchivosReportesDinamicoConversionUnidad;
	//}
	
	public void setBorderResaltarTiposReportesConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConversionUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConversionUnidad() {
		return this.jComboBoxTiposGraficosReportesConversionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConversionUnidad(
			JComboBox jComboBoxTiposGraficosReportesConversionUnidad) {
		this.jComboBoxTiposGraficosReportesConversionUnidad = jComboBoxTiposGraficosReportesConversionUnidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConversionUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConversionUnidad() {
		return this.jComboBoxTiposPaginacionConversionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConversionUnidad(
			JComboBox jComboBoxTiposPaginacionConversionUnidad) {
		this.jComboBoxTiposPaginacionConversionUnidad = jComboBoxTiposPaginacionConversionUnidad;
	}
	
	public void setBorderResaltarTiposPaginacionConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConversionUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConversionUnidad() {
		return this.jComboBoxTiposRelacionesConversionUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConversionUnidad() {
		return this.jComboBoxTiposAccionesConversionUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConversionUnidad(
			JComboBox jComboBoxTiposRelacionesConversionUnidad) {
		this.jComboBoxTiposRelacionesConversionUnidad = jComboBoxTiposRelacionesConversionUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConversionUnidad(
			JComboBox jComboBoxTiposAccionesConversionUnidad) {
		this.jComboBoxTiposAccionesConversionUnidad = jComboBoxTiposAccionesConversionUnidad;
	}
	
	public void setBorderResaltarTiposRelacionesConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConversionUnidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConversionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConversionUnidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConversionUnidad() {
	//	return jCheckBoxConGraficoDinamicoConversionUnidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoConversionUnidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoConversionUnidad) {
	//	this.jCheckBoxConGraficoDinamicoConversionUnidad = jCheckBoxConGraficoDinamicoConversionUnidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConversionUnidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConversionUnidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConversionUnidad .setBorder(borderResaltar);		
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
		this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
		
		this.conversionunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversionunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conversionunidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConversionUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conversion Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
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
		
		ConversionUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConversionUnidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"nuevo","nuevo","Nuevo"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"duplicar","duplicar","Duplicar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"copiar","copiar","Copiar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"ver_form","ver_form","Ver"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"recargar","recargar","Recargar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConversionUnidad,this.jTtoolBarConversionUnidad,
							"cerrar","cerrar","Salir"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConversionUnidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConversionUnidad;
			
				this.jButtonProcesarInformacionToolBarConversionUnidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConversionUnidad;
				
		//protected JButton jButtonModificarToolBarConversionUnidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConversionUnidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConversionUnidad=new JMenuMe("General");
		this.jmenuArchivoConversionUnidad=new JMenuMe("Archivo");
		this.jmenuAccionesConversionUnidad=new JMenuMe("Acciones");
		this.jmenuDatosConversionUnidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConversionUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConversionUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConversionUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConversionUnidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConversionUnidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConversionUnidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConversionUnidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConversionUnidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConversionUnidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConversionUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConversionUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConversionUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConversionUnidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConversionUnidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConversionUnidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConversionUnidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConversionUnidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConversionUnidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConversionUnidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConversionUnidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConversionUnidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConversionUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConversionUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConversionUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConversionUnidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConversionUnidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConversionUnidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConversionUnidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConversionUnidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConversionUnidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConversionUnidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConversionUnidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConversionUnidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConversionUnidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConversionUnidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConversionUnidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConversionUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConversionUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConversionUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConversionUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConversionUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConversionUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConversionUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConversionUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConversionUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConversionUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConversionUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConversionUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConversionUnidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConversionUnidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConversionUnidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConversionUnidad.add(this.jMenuItemCerrarConversionUnidad);
			
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemNuevoConversionUnidad);
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemNuevoGuardarCambiosConversionUnidad);
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemNuevoRelacionesConversionUnidad);
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemGuardarCambiosTablaConversionUnidad);		
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemDuplicarConversionUnidad);		
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemCopiarConversionUnidad);		
			this.jmenuAccionesConversionUnidad.add(this.jMenuItemVerFormConversionUnidad);		
			
			this.jmenuDatosConversionUnidad.add(this.jMenuItemRecargarInformacionConversionUnidad);				
			this.jmenuDatosConversionUnidad.add(this.jMenuItemAnterioresConversionUnidad);				
			this.jmenuDatosConversionUnidad.add(this.jMenuItemSiguientesConversionUnidad);				
			this.jmenuDatosConversionUnidad.add(this.jMenuItemAbrirOrderByConversionUnidad);				
			this.jmenuDatosConversionUnidad.add(this.jMenuItemMostrarOcultarConversionUnidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConversionUnidad.add(this.jMenuItemGuardarCambiosConversionUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConversionUnidad.add(this.jmenuArchivoConversionUnidad);		
			this.jmenuBarConversionUnidad.add(this.jmenuAccionesConversionUnidad);		
			this.jmenuBarConversionUnidad.add(this.jmenuDatosConversionUnidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConversionUnidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConversionUnidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdUnidadDesdeConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDesdeConversionUnidad.setToolTipText("Buscar Por Unidad Desde ");
		this.jButtonFK_IdUnidadDesdeConversionUnidad= new JButtonMe();
		this.jButtonFK_IdUnidadDesdeConversionUnidad.setText("Buscar");
		this.jButtonFK_IdUnidadDesdeConversionUnidad.setToolTipText("Buscar Por Unidad Desde ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDesdeConversionUnidad,"buscar_button","Buscar Por Unidad Desde ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDesdeConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad = new JLabelMe();
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setText("Unidad Desde :");
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setToolTipText("Unidad Desde");
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad= new JComboBoxMe();
		jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadHastaConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadHastaConversionUnidad.setToolTipText("Buscar Por Unidad Hasta ");
		this.jButtonFK_IdUnidadHastaConversionUnidad= new JButtonMe();
		this.jButtonFK_IdUnidadHastaConversionUnidad.setText("Buscar");
		this.jButtonFK_IdUnidadHastaConversionUnidad.setToolTipText("Buscar Por Unidad Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadHastaConversionUnidad,"buscar_button","Buscar Por Unidad Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadHastaConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad = new JLabelMe();
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setText("Unidad Hasta :");
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setToolTipText("Unidad Hasta");
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad= new JComboBoxMe();
		jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConversionUnidad=new JTabbedPane();


		this.jTabbedPaneBusquedasConversionUnidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConversionUnidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConversionUnidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConversionUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConversionUnidad = new ConversionUnidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conversion Unidad DATOS");
			this.jInternalFrameDetalleFormConversionUnidad = new ConversionUnidadDetalleFormJInternalFrame(jDesktopPane,this.conversionunidadSessionBean.getConGuardarRelaciones(),this.conversionunidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConversionUnidad = null;//new ConversionUnidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConversionUnidad= new GridBagLayout();
		
		
		this.jTableDatosConversionUnidad = new JTableMe();      
		
		String sToolTipConversionUnidad="";
		sToolTipConversionUnidad=ConversionUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConversionUnidad+="(Inventario.ConversionUnidad)";
		}
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipConversionUnidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConversionUnidad.setToolTipText(sToolTipConversionUnidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConversionUnidad);
		this.jTableDatosConversionUnidad.setAutoCreateRowSorter(true);
		this.jTableDatosConversionUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConversionUnidad.setRowSelectionAllowed(true);
		this.jTableDatosConversionUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConversionUnidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConversionUnidad = new JButtonMe();
		this.jButtonDuplicarConversionUnidad = new JButtonMe();
		this.jButtonCopiarConversionUnidad = new JButtonMe();
		this.jButtonVerFormConversionUnidad = new JButtonMe();
		this.jButtonNuevoRelacionesConversionUnidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConversionUnidad = new JButtonMe();
		this.jButtonCerrarConversionUnidad = new JButtonMe();
		
		this.jScrollPanelDatosConversionUnidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralConversionUnidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conversion Unidad";
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosConversionUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConversionUnidad.setToolTipText("Acciones");
        this.jPanelAccionesConversionUnidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConversionUnidad=new ReporteDinamicoJInternalFrame(ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConversionUnidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConversionUnidad=new ImportacionJInternalFrame(ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConversionUnidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConversionUnidad = new JButtonMe();
		
		this.jButtonAbrirOrderByConversionUnidad.setText("Orden");
		this.jButtonAbrirOrderByConversionUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConversionUnidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConversionUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionUnidad,false,this);
			
			//this.cargarOrderByConversionUnidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConversionUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionUnidad,true,this);
			
			//this.cargarOrderByConversionUnidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConversionUnidad.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosConversionUnidad.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosConversionUnidad.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosConversionUnidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConversionUnidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConversionUnidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConversionUnidad.setText("Nuevo");
		this.jButtonDuplicarConversionUnidad.setText("Duplicar");
		this.jButtonCopiarConversionUnidad.setText("Copiar");
		this.jButtonVerFormConversionUnidad.setText("Ver");
		this.jButtonNuevoRelacionesConversionUnidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConversionUnidad.setText("Guardar");
		this.jButtonCerrarConversionUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConversionUnidad,"nuevo_button","Nuevo",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConversionUnidad,"duplicar_button","Duplicar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConversionUnidad,"copiar_button","Copiar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConversionUnidad,"ver_form","Ver",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConversionUnidad,"nuevorelaciones_button","Nuevo Rel",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConversionUnidad,"guardarcambiostabla_button","Guardar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConversionUnidad,"cerrar_button","Salir",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConversionUnidad.setToolTipText("Nuevo"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConversionUnidad.setToolTipText("Duplicar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConversionUnidad.setToolTipText("Copiar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConversionUnidad.setToolTipText("Ver"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConversionUnidad.setToolTipText("Nuevo Rel"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConversionUnidad.setToolTipText("Guardar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConversionUnidad.setToolTipText("Salir"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConversionUnidad";
		inputMap = this.jButtonNuevoConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConversionUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConversionUnidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarConversionUnidad";
		inputMap = this.jButtonDuplicarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConversionUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConversionUnidad"));
		
		//COPIAR
		sMapKey = "CopiarConversionUnidad";
		inputMap = this.jButtonCopiarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConversionUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConversionUnidad"));
		
		//VEr FORM
		sMapKey = "VerFormConversionUnidad";
		inputMap = this.jButtonVerFormConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConversionUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConversionUnidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConversionUnidad";
		inputMap = this.jButtonNuevoRelacionesConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConversionUnidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConversionUnidad";
		inputMap = this.jButtonModificarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConversionUnidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConversionUnidad";
		inputMap = this.jButtonCerrarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConversionUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConversionUnidad";
		inputMap = this.jButtonGuardarCambiosTablaConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConversionUnidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConversionUnidad.setName("jPanelParametrosReportesConversionUnidad"); 
		
		this.jPanelParametrosReportesAccionesConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConversionUnidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConversionUnidad.setName("jPanelParametrosReportesAccionesConversionUnidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConversionUnidad = new JButtonMe();
		this.jButtonRecargarInformacionConversionUnidad.setText("Recargar");
		this.jButtonRecargarInformacionConversionUnidad.setToolTipText("Recargar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConversionUnidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConversionUnidad = new JButtonMe();
		this.jButtonProcesarInformacionConversionUnidad.setText("Procesar");
		this.jButtonProcesarInformacionConversionUnidad.setToolTipText("Procesar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConversionUnidad.setVisible(false);
			
		this.jButtonProcesarInformacionConversionUnidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConversionUnidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConversionUnidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionUnidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConversionUnidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionUnidad.setText("TIPO");       
		this.jComboBoxTiposReportesConversionUnidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionUnidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConversionUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConversionUnidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionConversionUnidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConversionUnidad.setText("Accion");
		this.jComboBoxTiposRelacionesConversionUnidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConversionUnidad.setText("Accion");
		this.jComboBoxTiposAccionesConversionUnidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConversionUnidad.setText("Accion");
		this.jComboBoxTiposSeleccionarConversionUnidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConversionUnidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConversionUnidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConversionUnidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConversionUnidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConversionUnidad = new JLabelMe();
		
		this.jLabelAccionesConversionUnidad.setText("Acciones");		
		this.jLabelAccionesConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConversionUnidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConversionUnidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConversionUnidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConversionUnidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConversionUnidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConversionUnidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConversionUnidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConversionUnidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConversionUnidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteConversionUnidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConversionUnidad = new JButtonMe();
		//this.jButtonAnterioresConversionUnidad.setText("<<");
        this.jButtonAnterioresConversionUnidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConversionUnidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConversionUnidad = new JButtonMe();
		//this.jButtonSiguientesConversionUnidad.setText(">>");
        this.jButtonSiguientesConversionUnidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConversionUnidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConversionUnidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConversionUnidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosConversionUnidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConversionUnidad,"nuevoguardarcambios_button","Nue",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConversionUnidad";
		inputMap = this.jButtonNuevoGuardarCambiosConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConversionUnidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConversionUnidad";
		inputMap = this.jButtonRecargarInformacionConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConversionUnidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConversionUnidad";
		inputMap = this.jButtonSiguientesConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConversionUnidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConversionUnidad";
		inputMap = this.jButtonAnterioresConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConversionUnidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConversionUnidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConversionUnidad.setMinimumSize(new Dimension(this.getWidth(),ConversionUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConversionUnidad.setMaximumSize(new Dimension(this.getWidth(),ConversionUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConversionUnidad.setPreferredSize(new Dimension(this.getWidth(),ConversionUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConversionUnidad = new GridBagLayout();

			this.jPanelPaginacionConversionUnidad.setLayout(gridaBagLayoutPaginacionConversionUnidad);						
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 0;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConversionUnidad.add(this.jButtonAnterioresConversionUnidad, this.gridBagConstraintsConversionUnidad);
					
						
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConversionUnidad.gridy = 0;
			
			this.jPanelPaginacionConversionUnidad.add(this.jButtonNuevoGuardarCambiosConversionUnidad, this.gridBagConstraintsConversionUnidad);
						
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConversionUnidad.gridy = 0;
			this.jPanelPaginacionConversionUnidad.add(this.jButtonSiguientesConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 1;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionUnidad.add(this.jButtonNuevoConversionUnidad, this.gridBagConstraintsConversionUnidad);
						
			
			
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
				this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConversionUnidad.gridy = 1;
				this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConversionUnidad.add(this.jButtonGuardarCambiosTablaConversionUnidad, this.gridBagConstraintsConversionUnidad);
			}
			
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 1;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionUnidad.add(this.jButtonDuplicarConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 1;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionUnidad.add(this.jButtonCopiarConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 1;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionUnidad.add(this.jButtonVerFormConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 1;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConversionUnidad.add(this.jButtonCerrarConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		
		this.jButtonRecargarInformacionConversionUnidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConversionUnidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConversionUnidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConversionUnidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConversionUnidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConversionUnidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConversionUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConversionUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConversionUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConversionUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConversionUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConversionUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConversionUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConversionUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConversionUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConversionUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConversionUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConversionUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConversionUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConversionUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConversionUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConversionUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConversionUnidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConversionUnidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConversionUnidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConversionUnidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConversionUnidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConversionUnidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConversionUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConversionUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConversionUnidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConversionUnidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConversionUnidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConversionUnidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConversionUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConversionUnidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConversionUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConversionUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConversionUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConversionUnidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConversionUnidad.setLayout(gridaBagParametrosReportesConversionUnidad);
			this.jPanelParametrosReportesAccionesConversionUnidad.setLayout(gridaBagParametrosReportesAccionesConversionUnidad);
			
			
			this.jPanelParametrosAuxiliar1ConversionUnidad.setLayout(gridaBagParametrosAuxiliar1ConversionUnidad);
			this.jPanelParametrosAuxiliar2ConversionUnidad.setLayout(gridaBagParametrosAuxiliar2ConversionUnidad);
			this.jPanelParametrosAuxiliar3ConversionUnidad.setLayout(gridaBagParametrosAuxiliar3ConversionUnidad);
			this.jPanelParametrosAuxiliar4ConversionUnidad.setLayout(gridaBagParametrosAuxiliar4ConversionUnidad);
			//this.jPanelParametrosAuxiliar5ConversionUnidad.setLayout(gridaBagParametrosAuxiliar2ConversionUnidad);			
			
			
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionUnidad.add(this.jButtonRecargarInformacionConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionUnidad.add(this.jComboBoxTiposPaginacionConversionUnidad, this.gridBagConstraintsConversionUnidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionUnidad.add(this.jCheckBoxConAltoMaximoTablaConversionUnidad, this.gridBagConstraintsConversionUnidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionUnidad.add(this.jComboBoxTiposArchivosReportesConversionUnidad, this.gridBagConstraintsConversionUnidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionUnidad.add(this.jPanelParametrosAuxiliar1ConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConversionUnidad.add(this.jComboBoxTiposReportesConversionUnidad, this.gridBagConstraintsConversionUnidad);																		
			
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConversionUnidad.add(this.jComboBoxTiposGraficosReportesConversionUnidad, this.gridBagConstraintsConversionUnidad);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionUnidad.add(this.jPanelParametrosAuxiliar4ConversionUnidad, this.gridBagConstraintsConversionUnidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionUnidad.add(this.jComboBoxTiposReportesConversionUnidad, this.gridBagConstraintsConversionUnidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionUnidad.add(this.jCheckBoxGenerarReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionUnidad.add(this.jPanelParametrosAuxiliar2ConversionUnidad, this.gridBagConstraintsConversionUnidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionUnidad.add(this.jLabelAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
				this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConversionUnidad.add(this.jButtonAbrirOrderByConversionUnidad, this.gridBagConstraintsConversionUnidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionUnidad.add(this.jComboBoxTiposSeleccionarConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			
			
			/*
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionUnidad.add(this.jCheckBoxSeleccionarTodosConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionUnidad.add(this.jCheckBoxConGraficoReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionUnidad.add(this.jCheckBoxSeleccionarTodosConversionUnidad, this.gridBagConstraintsConversionUnidad);															
				
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionUnidad.add(this.jCheckBoxSeleccionadosConversionUnidad, this.gridBagConstraintsConversionUnidad);															
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionUnidad.add(this.jCheckBoxConGraficoReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionUnidad.add(this.jPanelParametrosAuxiliar3ConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionUnidad.add(this.jComboBoxTiposAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
	
				
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionUnidad.add(this.jTextFieldValorCampoGeneralConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConversionUnidad = new GridBagLayout();

			this.jScrollPanelDatosConversionUnidad.setLayout(gridaBagLayoutDatosConversionUnidad);
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = 0;
			this.gridBagConstraintsConversionUnidad.gridx = 0;
			
			this.jScrollPanelDatosConversionUnidad.add(this.jTableDatosConversionUnidad, this.gridBagConstraintsConversionUnidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConversionUnidad.setViewportView(this.jTableDatosConversionUnidad);
		this.jTableDatosConversionUnidad.setFillsViewportHeight(true);
		this.jTableDatosConversionUnidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConversionUnidad= new GridBagLayout();
		this.jPanelAccionesConversionUnidad.setLayout(gridaBagLayoutAccionesConversionUnidad);
		
		
		/*	
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 0;
			
		this.jPanelAccionesConversionUnidad.add(this.jButtonNuevoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdUnidadDesdeConversionUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDesdeConversionUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDesdeConversionUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDesdeConversionUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDesdeConversionUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDesdeConversionUnidad.setLayout(gridaBagLayoutFK_IdUnidadDesdeConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 0;
		gridBagConstraintsConversionUnidad.gridx = 0;
		jPanelFK_IdUnidadDesdeConversionUnidad.add(jLabelid_unidad_desdeFK_IdUnidadDesdeConversionUnidad, gridBagConstraintsConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 0;
		gridBagConstraintsConversionUnidad.gridx = 1;
		jPanelFK_IdUnidadDesdeConversionUnidad.add(jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad, gridBagConstraintsConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 1;
		gridBagConstraintsConversionUnidad.gridx =1;
		jPanelFK_IdUnidadDesdeConversionUnidad.add(jButtonFK_IdUnidadDesdeConversionUnidad, gridBagConstraintsConversionUnidad);

		jTabbedPaneBusquedasConversionUnidad.addTab("1.-Por Unidad Desde ", jPanelFK_IdUnidadDesdeConversionUnidad);
		jTabbedPaneBusquedasConversionUnidad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdUnidadHastaConversionUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadHastaConversionUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadHastaConversionUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadHastaConversionUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadHastaConversionUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadHastaConversionUnidad.setLayout(gridaBagLayoutFK_IdUnidadHastaConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 0;
		gridBagConstraintsConversionUnidad.gridx = 0;
		jPanelFK_IdUnidadHastaConversionUnidad.add(jLabelid_unidad_hastaFK_IdUnidadHastaConversionUnidad, gridBagConstraintsConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 0;
		gridBagConstraintsConversionUnidad.gridx = 1;
		jPanelFK_IdUnidadHastaConversionUnidad.add(jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad, gridBagConstraintsConversionUnidad);

		gridBagConstraintsConversionUnidad = new GridBagConstraints();
		gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionUnidad.gridy = 1;
		gridBagConstraintsConversionUnidad.gridx =1;
		jPanelFK_IdUnidadHastaConversionUnidad.add(jButtonFK_IdUnidadHastaConversionUnidad, gridBagConstraintsConversionUnidad);

		jTabbedPaneBusquedasConversionUnidad.addTab("2.-Por Unidad Hasta ", jPanelFK_IdUnidadHastaConversionUnidad);
		jTabbedPaneBusquedasConversionUnidad.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConversionUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConversionUnidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();						
			this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionUnidad.gridx = 0;		
			//this.gridBagConstraintsConversionUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConversionUnidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConversionUnidad, this.gridBagConstraintsConversionUnidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConversionUnidad.gridx = 0;		
		//this.gridBagConstraintsConversionUnidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConversionUnidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConversionUnidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionUnidad.gridx = 0;		
			this.gridBagConstraintsConversionUnidad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConversionUnidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConversionUnidad, this.gridBagConstraintsConversionUnidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConversionUnidad, this.gridBagConstraintsConversionUnidad);								
		
		
		/*
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
		*/		
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConversionUnidad.gridx =0;
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConversionUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConversionUnidad, this.gridBagConstraintsConversionUnidad);
				
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConversionUnidad, this.gridBagConstraintsConversionUnidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConversionUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConversionUnidad = new GridBagLayout();
			this.jPanelBusquedasParametrosConversionUnidad.setLayout(gridaBagLayoutBusquedasParametrosConversionUnidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConversionUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConversionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConversionUnidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConversionUnidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConversionUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConversionUnidad.setName("jPanelReporteDinamicoConversionUnidad"); 
		
		this.jPanelReporteDinamicoConversionUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConversionUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConversionUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConversionUnidad.setLayout(gridaBagLayoutReporteDinamicoConversionUnidad);
		
		
		this.jInternalFrameReporteDinamicoConversionUnidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConversionUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConversionUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConversionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConversionUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConversionUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConversionUnidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConversionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConversionUnidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoConversionUnidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoConversionUnidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConversionUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConversionUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConversionUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConversionUnidad = new JLabelMe();

		this.jLabelColumnasSelectReporteConversionUnidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelColumnasSelectReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConversionUnidad = new JList<Reporte>();
		this.jListColumnasSelectReporteConversionUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConversionUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConversionUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConversionUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConversionUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConversionUnidad=new JScrollPane(this.jListColumnasSelectReporteConversionUnidad);
			
			this.jScrollColumnasSelectReporteConversionUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConversionUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConversionUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConversionUnidad.add(this.jListColumnasSelectReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
		this.jPanelReporteDinamicoConversionUnidad.add(this.jScrollColumnasSelectReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConversionUnidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteConversionUnidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConversionUnidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteConversionUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConversionUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConversionUnidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConversionUnidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConversionUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConversionUnidad=new JScrollPane(this.jListRelacionesSelectReporteConversionUnidad);
			
			this.jScrollRelacionesSelectReporteConversionUnidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConversionUnidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConversionUnidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConversionUnidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConversionUnidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoConversionUnidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConversionUnidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConversionUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConversionUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConversionUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConversionUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConversionUnidad = new JLabelMe();

		this.jLabelConGraficoDinamicoConversionUnidad.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelConGraficoDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConversionUnidad.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConversionUnidad.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConversionUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConversionUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConversionUnidad.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jCheckBoxConGraficoDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConversionUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConversionUnidad.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelColumnaCategoriaGraficoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConversionUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConversionUnidad.add(this.jComboBoxColumnaCategoriaGraficoConversionUnidad, this.gridBagConstraintsConversionUnidad);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConversionUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaValorConversionUnidad.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelColumnaCategoriaValorConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConversionUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConversionUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConversionUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConversionUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConversionUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConversionUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConversionUnidad.add(this.jComboBoxColumnaCategoriaValorConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConversionUnidad = new JLabelMe();

		this.jLabelColumnasValoresGraficoConversionUnidad.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelColumnasValoresGraficoConversionUnidad, this.gridBagConstraintsConversionUnidad);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConversionUnidad = new JList<Reporte>();
		this.jListColumnasValoresGraficoConversionUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConversionUnidad.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConversionUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConversionUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConversionUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConversionUnidad=new JScrollPane(this.jListColumnasValoresGraficoConversionUnidad);
			
			this.jScrollColumnasValoresGraficoConversionUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConversionUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConversionUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConversionUnidad.add(this.jListColumnasSelectReporteConversionUnidad, this.gridBagConstraintsConversionUnidad);
		this.jPanelReporteDinamicoConversionUnidad.add(this.jScrollColumnasValoresGraficoConversionUnidad, this.gridBagConstraintsConversionUnidad);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConversionUnidad = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConversionUnidad.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelTiposGraficosReportesDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConversionUnidad.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jComboBoxTiposGraficosReportesDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConversionUnidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConversionUnidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelGenerarExcelReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConversionUnidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConversionUnidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConversionUnidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConversionUnidad.setToolTipText("Generar EXCEL"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConversionUnidad.add(this.jButtonGenerarExcelReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionUnidad.add(this.jComboBoxTiposReportesDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConversionUnidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConversionUnidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionUnidad.add(this.jLabelTiposArchivoReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionUnidad.add(this.jComboBoxTiposArchivosReportesDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConversionUnidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConversionUnidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConversionUnidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConversionUnidad.setToolTipText("Generar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionUnidad.add(this.jButtonGenerarReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConversionUnidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConversionUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConversionUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConversionUnidad.setToolTipText("Cancelar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionUnidad.add(this.jButtonCerrarReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConversionUnidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConversionUnidad= new JScrollPane(jPanelReporteDinamicoConversionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConversionUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConversionUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConversionUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConversionUnidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConversionUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConversionUnidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConversionUnidad);
		this.jInternalFrameReporteDinamicoConversionUnidad.getContentPane().add(this.jScrollPanelReporteDinamicoConversionUnidad, this.gridBagConstraintsConversionUnidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConversionUnidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConversionUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConversionUnidad.setName("jPanelImportacionConversionUnidad"); 
		
		this.jPanelImportacionConversionUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConversionUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConversionUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConversionUnidad.setLayout(gridaBagLayoutImportacionConversionUnidad);
		
		
		this.jInternalFrameImportacionConversionUnidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConversionUnidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConversionUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConversionUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConversionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConversionUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConversionUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConversionUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConversionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConversionUnidad.setResizable(true);
	    this.jInternalFrameImportacionConversionUnidad.setClosable(true);
	    this.jInternalFrameImportacionConversionUnidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConversionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConversionUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConversionUnidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConversionUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConversionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConversionUnidad.setResizable(true);
	    this.jInternalFrameImportacionConversionUnidad.setClosable(true);
	    this.jInternalFrameImportacionConversionUnidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConversionUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConversionUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConversionUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConversionUnidad = new JLabelMe();

		this.jLabelArchivoImportacionConversionUnidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConversionUnidad.add(this.jLabelArchivoImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConversionUnidad = new JFileChooser();		
		this.jFileChooserImportacionConversionUnidad.setToolTipText("ESCOGER ARCHIVO"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConversionUnidad = new JButtonMe();
		this.jButtonAbrirImportacionConversionUnidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConversionUnidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConversionUnidad.setToolTipText("Generar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionUnidad.add(this.jButtonAbrirImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConversionUnidad = new JLabelMe();

		this.jLabelPathArchivoImportacionConversionUnidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConversionUnidad.add(this.jLabelPathArchivoImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConversionUnidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConversionUnidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConversionUnidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConversionUnidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionUnidad.add(this.jTextFieldPathArchivoImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConversionUnidad = new JButtonMe();
		this.jButtonGenerarImportacionConversionUnidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConversionUnidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConversionUnidad.setToolTipText("Generar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionUnidad.add(this.jButtonGenerarImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConversionUnidad = new JButtonMe();
		this.jButtonCerrarImportacionConversionUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConversionUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConversionUnidad.setToolTipText("Cancelar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionUnidad.add(this.jButtonCerrarImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConversionUnidad = new GridBagLayout();
		
		this.jScrollPanelImportacionConversionUnidad= new JScrollPane(jPanelImportacionConversionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iPosYImportacion;
		this.gridBagConstraintsConversionUnidad.gridx =iPosXImportacion;
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConversionUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConversionUnidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConversionUnidad);
		this.jInternalFrameImportacionConversionUnidad.getContentPane().add(this.jScrollPanelImportacionConversionUnidad, this.gridBagConstraintsConversionUnidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConversionUnidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConversionUnidad = new JButtonMe();
			this.jButtonAbrirOrderByConversionUnidad.setText("Orden");
			this.jButtonAbrirOrderByConversionUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConversionUnidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConversionUnidad";
			inputMap = this.jButtonAbrirOrderByConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConversionUnidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByConversionUnidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConversionUnidad.setName("jPanelOrderByConversionUnidad"); 
			
			this.jPanelOrderByConversionUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConversionUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConversionUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConversionUnidad.setLayout(gridaBagLayoutOrderByConversionUnidad);
			
			
			this.jTableDatosConversionUnidadOrderBy = new JTableMe();        
			this.jTableDatosConversionUnidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConversionUnidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConversionUnidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConversionUnidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConversionUnidadOrderBy.setViewportView(this.jTableDatosConversionUnidadOrderBy);
			this.jTableDatosConversionUnidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConversionUnidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConversionUnidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConversionUnidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConversionUnidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConversionUnidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConversionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConversionUnidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConversionUnidad.setTitle("Orden");
			this.jInternalFrameOrderByConversionUnidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConversionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConversionUnidad.setResizable(true);
			this.jInternalFrameOrderByConversionUnidad.setClosable(true);
			this.jInternalFrameOrderByConversionUnidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConversionUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConversionUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConversionUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConversionUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConversionUnidad.ipady =150;
				
			this.jPanelOrderByConversionUnidad.add(jScrollPanelDatosConversionUnidadOrderBy, this.gridBagConstraintsConversionUnidad);//this.jTableDatosConversionUnidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConversionUnidad = new JButtonMe();
			this.jButtonCerrarOrderByConversionUnidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConversionUnidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConversionUnidad.setToolTipText("Cancelar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConversionUnidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConversionUnidad.add(this.jButtonCerrarOrderByConversionUnidad, this.gridBagConstraintsConversionUnidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConversionUnidad = new GridBagLayout();
			
			this.jScrollPanelOrderByConversionUnidad= new JScrollPane(jPanelOrderByConversionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsConversionUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConversionUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConversionUnidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConversionUnidad);
			
			this.jInternalFrameOrderByConversionUnidad.getContentPane().add(this.jScrollPanelOrderByConversionUnidad, this.gridBagConstraintsConversionUnidad);			
		
		} else {
			this.jButtonAbrirOrderByConversionUnidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.conversionunidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConversionUnidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConversionUnidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConversionUnidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConversionUnidad.getRowHeight();//ConversionUnidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConversionUnidad.isSelected()) {
					iHeightTable=ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConversionUnidad.isSelected()) {
					iHeightTable=ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConversionUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConversionUnidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConversionUnidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConversionUnidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConversionUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConversionUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConversionUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConversionUnidad!=null && this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy()!=null) {
			//if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConversionUnidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConversionUnidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConversionUnidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConversionUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConversionUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConversionUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=conversionunidadLogic.getConversionUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversionunidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConversionUnidad> TraerConversionUnidadBeans(List<ConversionUnidad> conversionunidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConversionUnidad conversionunidad:conversionunidads) {
					
				if(!(ConversionUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConversionUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conversionunidad.setsDetalleGeneralEntityReporte(ConversionUnidadConstantesFunciones.getConversionUnidadDescripcion(conversionunidad));
										
						
					
						
					
				} else  {
							
					//conversionunidad.setsDetalleGeneralEntityReporte(conversionunidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//conversionunidadbeans.add(conversionunidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conversionunidads;
    }
	//PARA REPORTES FIN
}
