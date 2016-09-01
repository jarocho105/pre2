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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class TipoEstadoActivoFijoJInternalFrame extends TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEstadoActivoFijo;
	
	protected JMenuBar jmenuBarTipoEstadoActivoFijo;
	
	protected JMenu jmenuTipoEstadoActivoFijo;
	protected JMenu jmenuDatosTipoEstadoActivoFijo;
	protected JMenu jmenuArchivoTipoEstadoActivoFijo;
	protected JMenu jmenuAccionesTipoEstadoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstadoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoEstadoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEstadoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEstadoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEstadoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoEstadoActivoFijoSessionBean tipoestadoactivofijoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEstadoActivoFijo> tipoestadoactivofijos;		
	public List<TipoEstadoActivoFijo> tipoestadoactivofijosEliminados;	
	public List<TipoEstadoActivoFijo> tipoestadoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEstadoActivoFijo;		
	protected JButton jButtonAbrirOrderByTipoEstadoActivoFijo;
	
	
	//protected JPanel jPanelOrderByTipoEstadoActivoFijo;
	//public JScrollPane jScrollPanelOrderByTipoEstadoActivoFijo;	
	//protected JButton jButtonCerrarOrderByTipoEstadoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoEstadoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEstadoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEstadoActivoFijo;
	//public JScrollPane jScrollPanelImportacionTipoEstadoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesTipoEstadoActivoFijo;
	
    protected JPanel jPanelPaginacionTipoEstadoActivoFijo;
    protected JPanel jPanelParametrosReportesTipoEstadoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesTipoEstadoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2TipoEstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3TipoEstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4TipoEstadoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5TipoEstadoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEstadoActivoFijo;
	//protected JPanel jPanelImportacionTipoEstadoActivoFijo;
	
	
	public JTable jTableDatosTipoEstadoActivoFijo;
	
	
	
	//public JTable jTableDatosTipoEstadoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEstadoActivoFijo;
	protected JButton jButtonDuplicarTipoEstadoActivoFijo;
	protected JButton jButtonCopiarTipoEstadoActivoFijo;
	protected JButton jButtonVerFormTipoEstadoActivoFijo;
	protected JButton jButtonNuevoRelacionesTipoEstadoActivoFijo;
	protected JButton jButtonModificarTipoEstadoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaTipoEstadoActivoFijo;
	protected JButton jButtonCerrarTipoEstadoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionTipoEstadoActivoFijo;
	protected JButton jButtonProcesarInformacionTipoEstadoActivoFijo;
	
	
	protected JButton jButtonAnterioresTipoEstadoActivoFijo;
	protected JButton jButtonSiguientesTipoEstadoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosTipoEstadoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEstadoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoTipoEstadoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEstadoActivoFijo;
	//protected JButton jButtonGenerarImportacionTipoEstadoActivoFijo;
	//protected JButton jButtonCerrarImportacionTipoEstadoActivoFijo;
	//protected JFileChooser jFileChooserImportacionTipoEstadoActivoFijo;
	//protected File fileImportacionTipoEstadoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstadoActivoFijo;
	protected JButton jButtonDuplicarToolBarTipoEstadoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEstadoActivoFijo;
	protected JButton jButtonCopiarToolBarTipoEstadoActivoFijo;
	protected JButton jButtonVerFormToolBarTipoEstadoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstadoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoEstadoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEstadoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarTipoEstadoActivoFijo;
	protected JButton jButtonAnterioresToolBarTipoEstadoActivoFijo;
	protected JButton jButtonSiguientesToolBarTipoEstadoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarTipoEstadoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDuplicarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEstadoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemCopiarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemVerFormTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemAnterioresTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemSiguientesTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstadoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstadoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEstadoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosTipoEstadoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEstadoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralTipoEstadoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEstadoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteTipoEstadoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteTipoEstadoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEstadoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEstadoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEstadoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEstadoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionTipoEstadoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionTipoEstadoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEstadoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEstadoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEstadoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEstadoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEstadoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEstadoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEstadoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEstadoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEstadoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoEstadoActivoFijo;
	public JPanel jPanelFK_IdPaisTipoEstadoActivoFijo;
	public JButton jButtonFK_IdPaisTipoEstadoActivoFijo;
	
	public JPanel jPanelid_paisFK_IdPaisTipoEstadoActivoFijo;
	public JLabel jLabelid_paisFK_IdPaisTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo;
	public JButton jButtonid_paisFK_IdPaisTipoEstadoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoEstadoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoEstadoActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoEstadoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEstadoActivoFijo)	{
		this.jButtonRecargarInformacionTipoEstadoActivoFijo = jButtonRecargarInformacionTipoEstadoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionTipoEstadoActivoFijo() {
		return this.jButtonProcesarInformacionTipoEstadoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstadoActivoFijo)	{
		this.jButtonProcesarInformacionTipoEstadoActivoFijo = jButtonProcesarInformacionTipoEstadoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEstadoActivoFijo() {
		return this.jButtonRecargarInformacionTipoEstadoActivoFijo;
	}
	
	
	public List<TipoEstadoActivoFijo> gettipoestadoactivofijos() {
		return this.tipoestadoactivofijos;
	}

	public void settipoestadoactivofijos(List<TipoEstadoActivoFijo> tipoestadoactivofijos) {
		this.tipoestadoactivofijos = tipoestadoactivofijos;
	}
	
	public List<TipoEstadoActivoFijo> gettipoestadoactivofijosAux() {
		return this.tipoestadoactivofijosAux;
	}

	public void settipoestadoactivofijosAux(List<TipoEstadoActivoFijo> tipoestadoactivofijosAux) {
		this.tipoestadoactivofijosAux = tipoestadoactivofijosAux;
	}
	
	public List<TipoEstadoActivoFijo> gettipoestadoactivofijosEliminados() {
		return this.tipoestadoactivofijosEliminados;
	}

	public void setTipoEstadoActivoFijosEliminados(List<TipoEstadoActivoFijo> tipoestadoactivofijosEliminados) {
		this.tipoestadoactivofijosEliminados = tipoestadoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEstadoActivoFijo() {
		return jComboBoxTiposSeleccionarTipoEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarTipoEstadoActivoFijo) {
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo = jComboBoxTiposSeleccionarTipoEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEstadoActivoFijo() {
		return jTextFieldValorCampoGeneralTipoEstadoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralTipoEstadoActivoFijo(
			JTextField jTextFieldValorCampoGeneralTipoEstadoActivoFijo) {
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo = jTextFieldValorCampoGeneralTipoEstadoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEstadoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosTipoEstadoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosTipoEstadoActivoFijo) {
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo = jCheckBoxSeleccionarTodosTipoEstadoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEstadoActivoFijo() {
		return this.jCheckBoxSeleccionadosTipoEstadoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosTipoEstadoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosTipoEstadoActivoFijo) {
		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo = jCheckBoxSeleccionadosTipoEstadoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesTipoEstadoActivoFijo) {
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo = jComboBoxTiposArchivosReportesTipoEstadoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposReportesTipoEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposReportesTipoEstadoActivoFijo) {
		this.jComboBoxTiposReportesTipoEstadoActivoFijo = jComboBoxTiposReportesTipoEstadoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEstadoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEstadoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo = jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo = jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesTipoEstadoActivoFijo) {
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo = jComboBoxTiposGraficosReportesTipoEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEstadoActivoFijo() {
		return this.jComboBoxTiposPaginacionTipoEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposPaginacionTipoEstadoActivoFijo) {
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo = jComboBoxTiposPaginacionTipoEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposRelacionesTipoEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoEstadoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo = jComboBoxTiposRelacionesTipoEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoEstadoActivoFijo) {
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo = jComboBoxTiposAccionesTipoEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEstadoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEstadoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo = jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEstadoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEstadoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo .setBorder(borderResaltar);		
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
		this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		
		this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstadoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estado Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEstadoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEstadoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"copiar","copiar","Copiar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"ver_form","ver_form","Ver"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"recargar","recargar","Recargar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,
							"cerrar","cerrar","Salir"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarTipoEstadoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEstadoActivoFijo;
				
		//protected JButton jButtonModificarToolBarTipoEstadoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEstadoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEstadoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoTipoEstadoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEstadoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosTipoEstadoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstadoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstadoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstadoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEstadoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEstadoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEstadoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEstadoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEstadoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEstadoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEstadoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEstadoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEstadoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEstadoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEstadoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEstadoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEstadoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEstadoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEstadoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEstadoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEstadoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEstadoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEstadoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEstadoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEstadoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEstadoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEstadoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEstadoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEstadoActivoFijo.add(this.jMenuItemCerrarTipoEstadoActivoFijo);
			
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemNuevoTipoEstadoActivoFijo);
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo);
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo);
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo);		
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemDuplicarTipoEstadoActivoFijo);		
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemCopiarTipoEstadoActivoFijo);		
			this.jmenuAccionesTipoEstadoActivoFijo.add(this.jMenuItemVerFormTipoEstadoActivoFijo);		
			
			this.jmenuDatosTipoEstadoActivoFijo.add(this.jMenuItemRecargarInformacionTipoEstadoActivoFijo);				
			this.jmenuDatosTipoEstadoActivoFijo.add(this.jMenuItemAnterioresTipoEstadoActivoFijo);				
			this.jmenuDatosTipoEstadoActivoFijo.add(this.jMenuItemSiguientesTipoEstadoActivoFijo);				
			this.jmenuDatosTipoEstadoActivoFijo.add(this.jMenuItemAbrirOrderByTipoEstadoActivoFijo);				
			this.jmenuDatosTipoEstadoActivoFijo.add(this.jMenuItemMostrarOcultarTipoEstadoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEstadoActivoFijo.add(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEstadoActivoFijo.add(this.jmenuArchivoTipoEstadoActivoFijo);		
			this.jmenuBarTipoEstadoActivoFijo.add(this.jmenuAccionesTipoEstadoActivoFijo);		
			this.jmenuBarTipoEstadoActivoFijo.add(this.jmenuDatosTipoEstadoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEstadoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEstadoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoEstadoActivoFijo.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoEstadoActivoFijo= new JButtonMe();
		this.jButtonFK_IdPaisTipoEstadoActivoFijo.setText("Buscar");
		this.jButtonFK_IdPaisTipoEstadoActivoFijo.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoEstadoActivoFijo,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoEstadoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoEstadoActivoFijo = new TipoEstadoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Estado Activo Fijo DATOS");
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo = new TipoEstadoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones(),this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo = null;//new TipoEstadoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstadoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosTipoEstadoActivoFijo = new JTableMe();      
		
		String sToolTipTipoEstadoActivoFijo="";
		sToolTipTipoEstadoActivoFijo=TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstadoActivoFijo+="(ActivosFijos.TipoEstadoActivoFijo)";
		}
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstadoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEstadoActivoFijo.setToolTipText(sToolTipTipoEstadoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEstadoActivoFijo);
		this.jTableDatosTipoEstadoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEstadoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEstadoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosTipoEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonDuplicarTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonCopiarTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonVerFormTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoEstadoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstadoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEstadoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estado Activo Fijo";
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstadoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo=new ReporteDinamicoJInternalFrame(TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEstadoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEstadoActivoFijo=new ImportacionJInternalFrame(TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEstadoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEstadoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEstadoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByTipoEstadoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstadoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoActivoFijo,false,this);
			
			//this.cargarOrderByTipoEstadoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoActivoFijo,true,this);
			
			//this.cargarOrderByTipoEstadoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEstadoActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstadoActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstadoActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEstadoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstadoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstadoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEstadoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarTipoEstadoActivoFijo.setText("Duplicar");
		this.jButtonCopiarTipoEstadoActivoFijo.setText("Copiar");
		this.jButtonVerFormTipoEstadoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoEstadoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstadoActivoFijo,"nuevo_button","Nuevo",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEstadoActivoFijo,"duplicar_button","Duplicar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEstadoActivoFijo,"copiar_button","Copiar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEstadoActivoFijo,"ver_form","Ver",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEstadoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstadoActivoFijo,"cerrar_button","Salir",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEstadoActivoFijo.setToolTipText("Nuevo"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEstadoActivoFijo.setToolTipText("Duplicar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEstadoActivoFijo.setToolTipText("Copiar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEstadoActivoFijo.setToolTipText("Ver"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.setToolTipText("Nuevo Rel"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setToolTipText("Guardar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstadoActivoFijo.setToolTipText("Salir"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstadoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEstadoActivoFijo";
		inputMap = this.jButtonDuplicarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEstadoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarTipoEstadoActivoFijo";
		inputMap = this.jButtonCopiarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEstadoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEstadoActivoFijo";
		inputMap = this.jButtonVerFormTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEstadoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEstadoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEstadoActivoFijo";
		inputMap = this.jButtonModificarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEstadoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEstadoActivoFijo";
		inputMap = this.jButtonCerrarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstadoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstadoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstadoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEstadoActivoFijo.setName("jPanelParametrosReportesTipoEstadoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo.setName("jPanelParametrosReportesAccionesTipoEstadoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.setToolTipText("Recargar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEstadoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setToolTipText("Procesar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEstadoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEstadoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoEstadoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEstadoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresTipoEstadoActivoFijo.setText("<<");
        this.jButtonAnterioresTipoEstadoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEstadoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEstadoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesTipoEstadoActivoFijo.setText(">>");
        this.jButtonSiguientesTipoEstadoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEstadoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo,"nuevoguardarcambios_button","Nue",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEstadoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEstadoActivoFijo";
		inputMap = this.jButtonRecargarInformacionTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEstadoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEstadoActivoFijo";
		inputMap = this.jButtonSiguientesTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEstadoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEstadoActivoFijo";
		inputMap = this.jButtonAnterioresTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEstadoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEstadoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEstadoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionTipoEstadoActivoFijo.setLayout(gridaBagLayoutPaginacionTipoEstadoActivoFijo);						
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonAnterioresTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					
						
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
						
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonSiguientesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonNuevoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
						
			
			
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
				this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonDuplicarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonCopiarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonVerFormTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEstadoActivoFijo.add(this.jButtonCerrarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEstadoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEstadoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEstadoActivoFijo.setLayout(gridaBagParametrosReportesTipoEstadoActivoFijo);
			this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo.setLayout(gridaBagParametrosReportesAccionesTipoEstadoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar1TipoEstadoActivoFijo);
			this.jPanelParametrosAuxiliar2TipoEstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoEstadoActivoFijo);
			this.jPanelParametrosAuxiliar3TipoEstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar3TipoEstadoActivoFijo);
			this.jPanelParametrosAuxiliar4TipoEstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar4TipoEstadoActivoFijo);
			//this.jPanelParametrosAuxiliar5TipoEstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoEstadoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jButtonRecargarInformacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo.add(this.jComboBoxTiposPaginacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo.add(this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jPanelParametrosAuxiliar1TipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEstadoActivoFijo.add(this.jComboBoxTiposReportesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jPanelParametrosAuxiliar4TipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jComboBoxTiposReportesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jCheckBoxGenerarReporteTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jPanelParametrosAuxiliar2TipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jLabelAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jButtonAbrirOrderByTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstadoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);															
				
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstadoActivoFijo.add(this.jCheckBoxSeleccionadosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jPanelParametrosAuxiliar3TipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoActivoFijo.add(this.jComboBoxTiposAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEstadoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosTipoEstadoActivoFijo.setLayout(gridaBagLayoutDatosTipoEstadoActivoFijo);
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosTipoEstadoActivoFijo.add(this.jTableDatosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEstadoActivoFijo.setViewportView(this.jTableDatosTipoEstadoActivoFijo);
		this.jTableDatosTipoEstadoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosTipoEstadoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoEstadoActivoFijo.setLayout(gridaBagLayoutAccionesTipoEstadoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
			
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonNuevoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoEstadoActivoFijo.setLayout(gridaBagLayoutFK_IdPaisTipoEstadoActivoFijo);

		gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
		jPanelFK_IdPaisTipoEstadoActivoFijo.add(jLabelid_paisFK_IdPaisTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);

		gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		gridBagConstraintsTipoEstadoActivoFijo.gridx = 1;
		jPanelFK_IdPaisTipoEstadoActivoFijo.add(jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);

		gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoActivoFijo.gridy = 1;
		gridBagConstraintsTipoEstadoActivoFijo.gridx =1;
		jPanelFK_IdPaisTipoEstadoActivoFijo.add(jButtonFK_IdPaisTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);

		jTabbedPaneBusquedasTipoEstadoActivoFijo.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoEstadoActivoFijo);
		jTabbedPaneBusquedasTipoEstadoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstadoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstadoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsTipoEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;		
			this.gridBagConstraintsTipoEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/		
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstadoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
				
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstadoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEstadoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosTipoEstadoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEstadoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEstadoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEstadoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setName("jPanelReporteDinamicoTipoEstadoActivoFijo"); 
		
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoTipoEstadoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstadoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEstadoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jLabelColumnasSelectReporteTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEstadoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEstadoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteTipoEstadoActivoFijo);
			
			this.jScrollColumnasSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jListColumnasSelectReporteTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jScrollColumnasSelectReporteTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEstadoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEstadoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEstadoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteTipoEstadoActivoFijo);
			
			this.jScrollRelacionesSelectReporteTipoEstadoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstadoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstadoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEstadoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEstadoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo.setToolTipText("Generar EXCEL"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jComboBoxTiposReportesDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo.setToolTipText("Generar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo.setToolTipText("Cancelar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoActivoFijo.add(this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEstadoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo= new JScrollPane(jPanelReporteDinamicoTipoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEstadoActivoFijo);
		this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEstadoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEstadoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEstadoActivoFijo.setName("jPanelImportacionTipoEstadoActivoFijo"); 
		
		this.jPanelImportacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEstadoActivoFijo.setLayout(gridaBagLayoutImportacionTipoEstadoActivoFijo);
		
		
		this.jInternalFrameImportacionTipoEstadoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEstadoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEstadoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstadoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoEstadoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionTipoEstadoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jLabelArchivoImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEstadoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionTipoEstadoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionTipoEstadoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEstadoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEstadoActivoFijo.setToolTipText("Generar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jButtonAbrirImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEstadoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEstadoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jLabelPathArchivoImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEstadoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEstadoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstadoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstadoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jTextFieldPathArchivoImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionTipoEstadoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEstadoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEstadoActivoFijo.setToolTipText("Generar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jButtonGenerarImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionTipoEstadoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEstadoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEstadoActivoFijo.setToolTipText("Cancelar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoActivoFijo.add(this.jButtonCerrarImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEstadoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEstadoActivoFijo= new JScrollPane(jPanelImportacionTipoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEstadoActivoFijo);
		this.jInternalFrameImportacionTipoEstadoActivoFijo.getContentPane().add(this.jScrollPanelImportacionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEstadoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEstadoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByTipoEstadoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByTipoEstadoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstadoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEstadoActivoFijo";
			inputMap = this.jButtonAbrirOrderByTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEstadoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEstadoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEstadoActivoFijo.setName("jPanelOrderByTipoEstadoActivoFijo"); 
			
			this.jPanelOrderByTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEstadoActivoFijo.setLayout(gridaBagLayoutOrderByTipoEstadoActivoFijo);
			
			
			this.jTableDatosTipoEstadoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosTipoEstadoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEstadoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEstadoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEstadoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEstadoActivoFijoOrderBy.setViewportView(this.jTableDatosTipoEstadoActivoFijoOrderBy);
			this.jTableDatosTipoEstadoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEstadoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEstadoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEstadoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEstadoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEstadoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEstadoActivoFijo.ipady =150;
				
			this.jPanelOrderByTipoEstadoActivoFijo.add(jScrollPanelDatosTipoEstadoActivoFijoOrderBy, this.gridBagConstraintsTipoEstadoActivoFijo);//this.jTableDatosTipoEstadoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEstadoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByTipoEstadoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEstadoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEstadoActivoFijo.setToolTipText("Cancelar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEstadoActivoFijo.add(this.jButtonCerrarOrderByTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEstadoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEstadoActivoFijo= new JScrollPane(jPanelOrderByTipoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEstadoActivoFijo);
			
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getContentPane().add(this.jScrollPanelOrderByTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByTipoEstadoActivoFijo = new JButtonMe();
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
			&& this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEstadoActivoFijo.getRowHeight();//TipoEstadoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.isSelected()) {
					iHeightTable=TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstadoActivoFijo.isSelected()) {
					iHeightTable=TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEstadoActivoFijo!=null && this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEstadoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEstadoActivoFijo> TraerTipoEstadoActivoFijoBeans(List<TipoEstadoActivoFijo> tipoestadoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEstadoActivoFijo tipoestadoactivofijo:tipoestadoactivofijos) {
					
				if(!(TipoEstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoestadoactivofijo.setsDetalleGeneralEntityReporte(TipoEstadoActivoFijoConstantesFunciones.getTipoEstadoActivoFijoDescripcion(tipoestadoactivofijo));
										
						
					
						
					
				} else  {
							
					//tipoestadoactivofijo.setsDetalleGeneralEntityReporte(tipoestadoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoestadoactivofijobeans.add(tipoestadoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoestadoactivofijos;
    }
	//PARA REPORTES FIN
}
