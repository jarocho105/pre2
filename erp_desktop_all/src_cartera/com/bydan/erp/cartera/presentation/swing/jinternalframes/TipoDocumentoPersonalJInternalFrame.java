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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoDocumentoPersonalConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoDocumentoPersonalJInternalFrame extends TipoDocumentoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDocumentoPersonal;
	
	protected JMenuBar jmenuBarTipoDocumentoPersonal;
	
	protected JMenu jmenuTipoDocumentoPersonal;
	protected JMenu jmenuDatosTipoDocumentoPersonal;
	protected JMenu jmenuArchivoTipoDocumentoPersonal;
	protected JMenu jmenuAccionesTipoDocumentoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumentoPersonal;	
	protected GridBagConstraints gridBagConstraintsTipoDocumentoPersonal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDocumentoPersonal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDocumentoPersonal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDocumentoPersonal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoDocumentoPersonalSessionBean tipodocumentopersonalSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDocumentoPersonal> tipodocumentopersonals;		
	public List<TipoDocumentoPersonal> tipodocumentopersonalsEliminados;	
	public List<TipoDocumentoPersonal> tipodocumentopersonalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDocumentoPersonal;		
	protected JButton jButtonAbrirOrderByTipoDocumentoPersonal;
	
	
	//protected JPanel jPanelOrderByTipoDocumentoPersonal;
	//public JScrollPane jScrollPanelOrderByTipoDocumentoPersonal;	
	//protected JButton jButtonCerrarOrderByTipoDocumentoPersonal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDocumentoPersonalLogic tipodocumentopersonalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDocumentoPersonal;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumentoPersonal;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumentoPersonal;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDocumentoPersonalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDocumentoPersonal;
	//public JScrollPane jScrollPanelImportacionTipoDocumentoPersonal;
	
	
	
	protected JPanel jPanelAccionesTipoDocumentoPersonal;
	
    protected JPanel jPanelPaginacionTipoDocumentoPersonal;
    protected JPanel jPanelParametrosReportesTipoDocumentoPersonal;
	protected JPanel jPanelParametrosReportesAccionesTipoDocumentoPersonal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDocumentoPersonal;
	protected JPanel jPanelParametrosAuxiliar2TipoDocumentoPersonal;
	protected JPanel jPanelParametrosAuxiliar3TipoDocumentoPersonal;
	protected JPanel jPanelParametrosAuxiliar4TipoDocumentoPersonal;
	//protected JPanel jPanelParametrosAuxiliar5TipoDocumentoPersonal;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDocumentoPersonal;
	//protected JPanel jPanelImportacionTipoDocumentoPersonal;
	
	
	public JTable jTableDatosTipoDocumentoPersonal;
	
	
	
	//public JTable jTableDatosTipoDocumentoPersonalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDocumentoPersonal;
	protected JButton jButtonDuplicarTipoDocumentoPersonal;
	protected JButton jButtonCopiarTipoDocumentoPersonal;
	protected JButton jButtonVerFormTipoDocumentoPersonal;
	protected JButton jButtonNuevoRelacionesTipoDocumentoPersonal;
	protected JButton jButtonModificarTipoDocumentoPersonal;
	
    protected JButton jButtonGuardarCambiosTablaTipoDocumentoPersonal;
	protected JButton jButtonCerrarTipoDocumentoPersonal;
	
	
	protected JButton jButtonRecargarInformacionTipoDocumentoPersonal;
	protected JButton jButtonProcesarInformacionTipoDocumentoPersonal;
	
	
	protected JButton jButtonAnterioresTipoDocumentoPersonal;
	protected JButton jButtonSiguientesTipoDocumentoPersonal;
	protected JButton jButtonNuevoGuardarCambiosTipoDocumentoPersonal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDocumentoPersonal;
	//protected JButton jButtonCerrarReporteDinamicoTipoDocumentoPersonal;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDocumentoPersonal;
	//protected JButton jButtonGenerarImportacionTipoDocumentoPersonal;
	//protected JButton jButtonCerrarImportacionTipoDocumentoPersonal;
	//protected JFileChooser jFileChooserImportacionTipoDocumentoPersonal;
	//protected File fileImportacionTipoDocumentoPersonal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumentoPersonal;
	protected JButton jButtonDuplicarToolBarTipoDocumentoPersonal;
	protected JButton jButtonNuevoRelacionesToolBarTipoDocumentoPersonal;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDocumentoPersonal;
	protected JButton jButtonCopiarToolBarTipoDocumentoPersonal;
	protected JButton jButtonVerFormToolBarTipoDocumentoPersonal;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumentoPersonal;
	protected JButton jButtonCerrarToolBarTipoDocumentoPersonal;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDocumentoPersonal;
	protected JButton jButtonProcesarInformacionToolBarTipoDocumentoPersonal;
	protected JButton jButtonAnterioresToolBarTipoDocumentoPersonal;
	protected JButton jButtonSiguientesToolBarTipoDocumentoPersonal;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal;
	protected JButton jButtonAbrirOrderByToolBarTipoDocumentoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDuplicarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDocumentoPersonal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDocumentoPersonal;
	protected JMenuItem jMenuItemCopiarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemVerFormTipoDocumentoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumentoPersonal;
	protected JMenuItem jMenuItemCerrarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumentoPersonal;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDocumentoPersonal;
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumentoPersonal;
	protected JMenuItem jMenuItemAnterioresTipoDocumentoPersonal;
	protected JMenuItem jMenuItemSiguientesTipoDocumentoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal;
	protected JMenuItem jMenuItemAbrirOrderByTipoDocumentoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumentoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumentoPersonal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDocumentoPersonal;
	protected JCheckBox jCheckBoxSeleccionadosTipoDocumentoPersonal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDocumentoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDocumentoPersonal;
	protected JTextField jTextFieldValorCampoGeneralTipoDocumentoPersonal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDocumentoPersonal;
	//public JList<Reporte> jListColumnasSelectReporteTipoDocumentoPersonal;
	//public JScrollPane jScrollColumnasSelectReporteTipoDocumentoPersonal;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDocumentoPersonal;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDocumentoPersonal;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDocumentoPersonal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDocumentoPersonal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDocumentoPersonal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal;
	
		
	//public JLabel jLabelArchivoImportacionTipoDocumentoPersonal;	
	//public JLabel jLabelPathArchivoImportacionTipoDocumentoPersonal;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDocumentoPersonal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDocumentoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDocumentoPersonal;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDocumentoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDocumentoPersonal;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDocumentoPersonal;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDocumentoPersonal;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDocumentoPersonal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDocumentoPersonal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDocumentoPersonal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDocumentoPersonal;
	public JPanel jPanelFK_IdPaisTipoDocumentoPersonal;
	public JButton jButtonFK_IdPaisTipoDocumentoPersonal;
	
	public JPanel jPanelid_paisFK_IdPaisTipoDocumentoPersonal;
	public JLabel jLabelid_paisFK_IdPaisTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal;
	public JButton jButtonid_paisFK_IdPaisTipoDocumentoPersonal= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoDocumentoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoDocumentoPersonalBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDocumentoPersonalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDocumentoPersonal)	{
		this.jButtonRecargarInformacionTipoDocumentoPersonal = jButtonRecargarInformacionTipoDocumentoPersonal;
	}
	
	public JButton getjButtonProcesarInformacionTipoDocumentoPersonal() {
		return this.jButtonProcesarInformacionTipoDocumentoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumentoPersonal)	{
		this.jButtonProcesarInformacionTipoDocumentoPersonal = jButtonProcesarInformacionTipoDocumentoPersonal;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDocumentoPersonal() {
		return this.jButtonRecargarInformacionTipoDocumentoPersonal;
	}
	
	
	public List<TipoDocumentoPersonal> gettipodocumentopersonals() {
		return this.tipodocumentopersonals;
	}

	public void settipodocumentopersonals(List<TipoDocumentoPersonal> tipodocumentopersonals) {
		this.tipodocumentopersonals = tipodocumentopersonals;
	}
	
	public List<TipoDocumentoPersonal> gettipodocumentopersonalsAux() {
		return this.tipodocumentopersonalsAux;
	}

	public void settipodocumentopersonalsAux(List<TipoDocumentoPersonal> tipodocumentopersonalsAux) {
		this.tipodocumentopersonalsAux = tipodocumentopersonalsAux;
	}
	
	public List<TipoDocumentoPersonal> gettipodocumentopersonalsEliminados() {
		return this.tipodocumentopersonalsEliminados;
	}

	public void setTipoDocumentoPersonalsEliminados(List<TipoDocumentoPersonal> tipodocumentopersonalsEliminados) {
		this.tipodocumentopersonalsEliminados = tipodocumentopersonalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDocumentoPersonal() {
		return jComboBoxTiposSeleccionarTipoDocumentoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDocumentoPersonal(
			JComboBox jComboBoxTiposSeleccionarTipoDocumentoPersonal) {
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal = jComboBoxTiposSeleccionarTipoDocumentoPersonal;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDocumentoPersonal() {
		return jTextFieldValorCampoGeneralTipoDocumentoPersonal;
	}

	public void setjTextFieldValorCampoGeneralTipoDocumentoPersonal(
			JTextField jTextFieldValorCampoGeneralTipoDocumentoPersonal) {
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal = jTextFieldValorCampoGeneralTipoDocumentoPersonal;
	}

	public void setBorderResaltarValorCampoGeneralTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDocumentoPersonal() {
		return this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal;
	}

	public void setjCheckBoxSeleccionarTodosTipoDocumentoPersonal(
			JCheckBox jCheckBoxSeleccionarTodosTipoDocumentoPersonal) {
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal = jCheckBoxSeleccionarTodosTipoDocumentoPersonal;
	}

	public void setBorderResaltarSeleccionarTodosTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDocumentoPersonal() {
		return this.jCheckBoxSeleccionadosTipoDocumentoPersonal;
	}

	public void setjCheckBoxSeleccionadosTipoDocumentoPersonal(
			JCheckBox jCheckBoxSeleccionadosTipoDocumentoPersonal) {
		this.jCheckBoxSeleccionadosTipoDocumentoPersonal = jCheckBoxSeleccionadosTipoDocumentoPersonal;
	}
	
	public void setBorderResaltarSeleccionadosTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDocumentoPersonal() {
		return this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposArchivosReportesTipoDocumentoPersonal) {
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal = jComboBoxTiposArchivosReportesTipoDocumentoPersonal;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDocumentoPersonal() {
		return this.jComboBoxTiposReportesTipoDocumentoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposReportesTipoDocumentoPersonal) {
		this.jComboBoxTiposReportesTipoDocumentoPersonal = jComboBoxTiposReportesTipoDocumentoPersonal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDocumentoPersonal() {
	//	return jComboBoxTiposReportesDinamicoTipoDocumentoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDocumentoPersonal(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDocumentoPersonal) {
	//	this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal = jComboBoxTiposReportesDinamicoTipoDocumentoPersonal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal = jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal;
	//}
	
	public void setBorderResaltarTiposReportesTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDocumentoPersonal() {
		return this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposGraficosReportesTipoDocumentoPersonal) {
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal = jComboBoxTiposGraficosReportesTipoDocumentoPersonal;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDocumentoPersonal() {
		return this.jComboBoxTiposPaginacionTipoDocumentoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDocumentoPersonal(
			JComboBox jComboBoxTiposPaginacionTipoDocumentoPersonal) {
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal = jComboBoxTiposPaginacionTipoDocumentoPersonal;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDocumentoPersonal() {
		return this.jComboBoxTiposRelacionesTipoDocumentoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumentoPersonal() {
		return this.jComboBoxTiposAccionesTipoDocumentoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposRelacionesTipoDocumentoPersonal) {
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal = jComboBoxTiposRelacionesTipoDocumentoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposAccionesTipoDocumentoPersonal) {
		this.jComboBoxTiposAccionesTipoDocumentoPersonal = jComboBoxTiposAccionesTipoDocumentoPersonal;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDocumentoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDocumentoPersonal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDocumentoPersonal() {
	//	return jCheckBoxConGraficoDinamicoTipoDocumentoPersonal;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDocumentoPersonal(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDocumentoPersonal) {
	//	this.jCheckBoxConGraficoDinamicoTipoDocumentoPersonal = jCheckBoxConGraficoDinamicoTipoDocumentoPersonal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDocumentoPersonal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDocumentoPersonal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDocumentoPersonal .setBorder(borderResaltar);		
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
		this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		
		this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDocumentoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDocumentoPersonal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"nuevo","nuevo","Nuevo"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"duplicar","duplicar","Duplicar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"copiar","copiar","Copiar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"ver_form","ver_form","Ver"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"recargar","recargar","Recargar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,
							"cerrar","cerrar","Salir"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDocumentoPersonal;
			
				this.jButtonProcesarInformacionToolBarTipoDocumentoPersonal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDocumentoPersonal;
				
		//protected JButton jButtonModificarToolBarTipoDocumentoPersonal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDocumentoPersonal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDocumentoPersonal=new JMenuMe("General");
		this.jmenuArchivoTipoDocumentoPersonal=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDocumentoPersonal=new JMenuMe("Acciones");
		this.jmenuDatosTipoDocumentoPersonal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumentoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumentoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumentoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDocumentoPersonal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDocumentoPersonal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDocumentoPersonal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDocumentoPersonal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDocumentoPersonal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDocumentoPersonal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumentoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDocumentoPersonal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDocumentoPersonal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDocumentoPersonal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDocumentoPersonal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDocumentoPersonal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDocumentoPersonal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumentoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumentoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumentoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDocumentoPersonal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDocumentoPersonal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDocumentoPersonal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDocumentoPersonal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDocumentoPersonal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDocumentoPersonal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDocumentoPersonal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDocumentoPersonal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDocumentoPersonal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDocumentoPersonal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDocumentoPersonal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDocumentoPersonal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDocumentoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDocumentoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDocumentoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumentoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumentoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumentoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDocumentoPersonal.add(this.jMenuItemCerrarTipoDocumentoPersonal);
			
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemNuevoTipoDocumentoPersonal);
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal);
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemNuevoRelacionesTipoDocumentoPersonal);
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal);		
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemDuplicarTipoDocumentoPersonal);		
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemCopiarTipoDocumentoPersonal);		
			this.jmenuAccionesTipoDocumentoPersonal.add(this.jMenuItemVerFormTipoDocumentoPersonal);		
			
			this.jmenuDatosTipoDocumentoPersonal.add(this.jMenuItemRecargarInformacionTipoDocumentoPersonal);				
			this.jmenuDatosTipoDocumentoPersonal.add(this.jMenuItemAnterioresTipoDocumentoPersonal);				
			this.jmenuDatosTipoDocumentoPersonal.add(this.jMenuItemSiguientesTipoDocumentoPersonal);				
			this.jmenuDatosTipoDocumentoPersonal.add(this.jMenuItemAbrirOrderByTipoDocumentoPersonal);				
			this.jmenuDatosTipoDocumentoPersonal.add(this.jMenuItemMostrarOcultarTipoDocumentoPersonal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDocumentoPersonal.add(this.jMenuItemGuardarCambiosTipoDocumentoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDocumentoPersonal.add(this.jmenuArchivoTipoDocumentoPersonal);		
			this.jmenuBarTipoDocumentoPersonal.add(this.jmenuAccionesTipoDocumentoPersonal);		
			this.jmenuBarTipoDocumentoPersonal.add(this.jmenuDatosTipoDocumentoPersonal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDocumentoPersonal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDocumentoPersonal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoDocumentoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoDocumentoPersonal.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoDocumentoPersonal= new JButtonMe();
		this.jButtonFK_IdPaisTipoDocumentoPersonal.setText("Buscar");
		this.jButtonFK_IdPaisTipoDocumentoPersonal.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoDocumentoPersonal,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDocumentoPersonal=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDocumentoPersonal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumentoPersonal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumentoPersonal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDocumentoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDocumentoPersonal = new TipoDocumentoPersonalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Documento Personal DATOS");
			this.jInternalFrameDetalleFormTipoDocumentoPersonal = new TipoDocumentoPersonalDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentopersonalSessionBean.getConGuardarRelaciones(),this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal = null;//new TipoDocumentoPersonalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumentoPersonal= new GridBagLayout();
		
		
		this.jTableDatosTipoDocumentoPersonal = new JTableMe();      
		
		String sToolTipTipoDocumentoPersonal="";
		sToolTipTipoDocumentoPersonal=TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumentoPersonal+="(Cartera.TipoDocumentoPersonal)";
		}
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumentoPersonal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDocumentoPersonal.setToolTipText(sToolTipTipoDocumentoPersonal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDocumentoPersonal);
		this.jTableDatosTipoDocumentoPersonal.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDocumentoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDocumentoPersonal.setRowSelectionAllowed(true);
		this.jTableDatosTipoDocumentoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDocumentoPersonal = new JButtonMe();
		this.jButtonDuplicarTipoDocumentoPersonal = new JButtonMe();
		this.jButtonCopiarTipoDocumentoPersonal = new JButtonMe();
		this.jButtonVerFormTipoDocumentoPersonal = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDocumentoPersonal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal = new JButtonMe();
		this.jButtonCerrarTipoDocumentoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumentoPersonal = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDocumentoPersonal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento Personal";
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumentoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumentoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumentoPersonal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDocumentoPersonal=new ReporteDinamicoJInternalFrame(TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDocumentoPersonal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDocumentoPersonal=new ImportacionJInternalFrame(TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDocumentoPersonal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDocumentoPersonal = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDocumentoPersonal.setText("Orden");
		this.jButtonAbrirOrderByTipoDocumentoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumentoPersonal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumentoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoPersonal,false,this);
			
			//this.cargarOrderByTipoDocumentoPersonal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumentoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoPersonal,true,this);
			
			//this.cargarOrderByTipoDocumentoPersonal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDocumentoPersonal.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDocumentoPersonal.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDocumentoPersonal.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoDocumentoPersonal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumentoPersonal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumentoPersonal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDocumentoPersonal.setText("Nuevo");
		this.jButtonDuplicarTipoDocumentoPersonal.setText("Duplicar");
		this.jButtonCopiarTipoDocumentoPersonal.setText("Copiar");
		this.jButtonVerFormTipoDocumentoPersonal.setText("Ver");
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setText("Guardar");
		this.jButtonCerrarTipoDocumentoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumentoPersonal,"nuevo_button","Nuevo",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDocumentoPersonal,"duplicar_button","Duplicar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDocumentoPersonal,"copiar_button","Copiar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDocumentoPersonal,"ver_form","Ver",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDocumentoPersonal,"nuevorelaciones_button","Nuevo Rel",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumentoPersonal,"guardarcambiostabla_button","Guardar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumentoPersonal,"cerrar_button","Salir",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDocumentoPersonal.setToolTipText("Nuevo"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDocumentoPersonal.setToolTipText("Duplicar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDocumentoPersonal.setToolTipText("Copiar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDocumentoPersonal.setToolTipText("Ver"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.setToolTipText("Nuevo Rel"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setToolTipText("Guardar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumentoPersonal.setToolTipText("Salir"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumentoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumentoPersonal"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDocumentoPersonal";
		inputMap = this.jButtonDuplicarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDocumentoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDocumentoPersonal"));
		
		//COPIAR
		sMapKey = "CopiarTipoDocumentoPersonal";
		inputMap = this.jButtonCopiarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDocumentoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDocumentoPersonal"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDocumentoPersonal";
		inputMap = this.jButtonVerFormTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDocumentoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDocumentoPersonal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoRelacionesTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDocumentoPersonal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDocumentoPersonal";
		inputMap = this.jButtonModificarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDocumentoPersonal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumentoPersonal";
		inputMap = this.jButtonCerrarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumentoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumentoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumentoPersonal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDocumentoPersonal.setName("jPanelParametrosReportesTipoDocumentoPersonal"); 
		
		this.jPanelParametrosReportesAccionesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDocumentoPersonal.setName("jPanelParametrosReportesAccionesTipoDocumentoPersonal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDocumentoPersonal = new JButtonMe();
		this.jButtonRecargarInformacionTipoDocumentoPersonal.setText("Recargar");
		this.jButtonRecargarInformacionTipoDocumentoPersonal.setToolTipText("Recargar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDocumentoPersonal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDocumentoPersonal = new JButtonMe();
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setText("Procesar");
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setToolTipText("Procesar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumentoPersonal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDocumentoPersonal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDocumentoPersonal.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDocumentoPersonal = new JLabelMe();
		
		this.jLabelAccionesTipoDocumentoPersonal.setText("Acciones");		
		this.jLabelAccionesTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDocumentoPersonal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDocumentoPersonal = new JButtonMe();
		//this.jButtonAnterioresTipoDocumentoPersonal.setText("<<");
        this.jButtonAnterioresTipoDocumentoPersonal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDocumentoPersonal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDocumentoPersonal = new JButtonMe();
		//this.jButtonSiguientesTipoDocumentoPersonal.setText(">>");
        this.jButtonSiguientesTipoDocumentoPersonal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDocumentoPersonal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal,"nuevoguardarcambios_button","Nue",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDocumentoPersonal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDocumentoPersonal";
		inputMap = this.jButtonRecargarInformacionTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDocumentoPersonal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDocumentoPersonal";
		inputMap = this.jButtonSiguientesTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDocumentoPersonal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDocumentoPersonal";
		inputMap = this.jButtonAnterioresTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDocumentoPersonal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDocumentoPersonal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDocumentoPersonal.setMinimumSize(new Dimension(this.getWidth(),TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumentoPersonal.setMaximumSize(new Dimension(this.getWidth(),TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumentoPersonal.setPreferredSize(new Dimension(this.getWidth(),TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDocumentoPersonal = new GridBagLayout();

			this.jPanelPaginacionTipoDocumentoPersonal.setLayout(gridaBagLayoutPaginacionTipoDocumentoPersonal);						
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonAnterioresTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					
						
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
			
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
						
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonSiguientesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonNuevoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
						
			
			
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
				this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonGuardarCambiosTablaTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			}
			
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonDuplicarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonCopiarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonVerFormTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDocumentoPersonal.add(this.jButtonCerrarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
		
		
		this.jButtonRecargarInformacionTipoDocumentoPersonal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumentoPersonal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumentoPersonal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDocumentoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumentoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumentoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDocumentoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDocumentoPersonal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDocumentoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDocumentoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDocumentoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDocumentoPersonal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDocumentoPersonal.setLayout(gridaBagParametrosReportesTipoDocumentoPersonal);
			this.jPanelParametrosReportesAccionesTipoDocumentoPersonal.setLayout(gridaBagParametrosReportesAccionesTipoDocumentoPersonal);
			
			
			this.jPanelParametrosAuxiliar1TipoDocumentoPersonal.setLayout(gridaBagParametrosAuxiliar1TipoDocumentoPersonal);
			this.jPanelParametrosAuxiliar2TipoDocumentoPersonal.setLayout(gridaBagParametrosAuxiliar2TipoDocumentoPersonal);
			this.jPanelParametrosAuxiliar3TipoDocumentoPersonal.setLayout(gridaBagParametrosAuxiliar3TipoDocumentoPersonal);
			this.jPanelParametrosAuxiliar4TipoDocumentoPersonal.setLayout(gridaBagParametrosAuxiliar4TipoDocumentoPersonal);
			//this.jPanelParametrosAuxiliar5TipoDocumentoPersonal.setLayout(gridaBagParametrosAuxiliar2TipoDocumentoPersonal);			
			
			
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jButtonRecargarInformacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoPersonal.add(this.jComboBoxTiposPaginacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoPersonal.add(this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoPersonal.add(this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jPanelParametrosAuxiliar1TipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDocumentoPersonal.add(this.jComboBoxTiposReportesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jPanelParametrosAuxiliar4TipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jComboBoxTiposReportesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jCheckBoxGenerarReporteTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jPanelParametrosAuxiliar2TipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jLabelAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jButtonAbrirOrderByTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jComboBoxTiposSeleccionarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
			
			
			/*
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumentoPersonal.add(this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);															
				
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumentoPersonal.add(this.jCheckBoxSeleccionadosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jPanelParametrosAuxiliar3TipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoPersonal.add(this.jComboBoxTiposAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDocumentoPersonal = new GridBagLayout();

			this.jScrollPanelDatosTipoDocumentoPersonal.setLayout(gridaBagLayoutDatosTipoDocumentoPersonal);
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
			
			this.jScrollPanelDatosTipoDocumentoPersonal.add(this.jTableDatosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDocumentoPersonal.setViewportView(this.jTableDatosTipoDocumentoPersonal);
		this.jTableDatosTipoDocumentoPersonal.setFillsViewportHeight(true);
		this.jTableDatosTipoDocumentoPersonal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumentoPersonal= new GridBagLayout();
		this.jPanelAccionesTipoDocumentoPersonal.setLayout(gridaBagLayoutAccionesTipoDocumentoPersonal);
		
		
		/*	
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
			
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonNuevoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoDocumentoPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoDocumentoPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoDocumentoPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoDocumentoPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoDocumentoPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoDocumentoPersonal.setLayout(gridaBagLayoutFK_IdPaisTipoDocumentoPersonal);

		gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
		jPanelFK_IdPaisTipoDocumentoPersonal.add(jLabelid_paisFK_IdPaisTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);

		gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		gridBagConstraintsTipoDocumentoPersonal.gridx = 1;
		jPanelFK_IdPaisTipoDocumentoPersonal.add(jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);

		gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoPersonal.gridy = 1;
		gridBagConstraintsTipoDocumentoPersonal.gridx =1;
		jPanelFK_IdPaisTipoDocumentoPersonal.add(jButtonFK_IdPaisTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);

		jTabbedPaneBusquedasTipoDocumentoPersonal.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoDocumentoPersonal);
		jTabbedPaneBusquedasTipoDocumentoPersonal.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumentoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumentoPersonal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;		
			//this.gridBagConstraintsTipoDocumentoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;		
		//this.gridBagConstraintsTipoDocumentoPersonal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDocumentoPersonal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;		
			this.gridBagConstraintsTipoDocumentoPersonal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);								
		
		
		/*
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		*/		
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =0;
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumentoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
				
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDocumentoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumentoPersonal = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDocumentoPersonal.setLayout(gridaBagLayoutBusquedasParametrosTipoDocumentoPersonal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDocumentoPersonal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDocumentoPersonal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDocumentoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setName("jPanelReporteDinamicoTipoDocumentoPersonal"); 
		
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDocumentoPersonal.setLayout(gridaBagLayoutReporteDinamicoTipoDocumentoPersonal);
		
		
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumentoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDocumentoPersonal = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDocumentoPersonal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jLabelColumnasSelectReporteTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDocumentoPersonal = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDocumentoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDocumentoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDocumentoPersonal=new JScrollPane(this.jListColumnasSelectReporteTipoDocumentoPersonal);
			
			this.jScrollColumnasSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jListColumnasSelectReporteTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jScrollColumnasSelectReporteTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDocumentoPersonal = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDocumentoPersonal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDocumentoPersonal = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDocumentoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDocumentoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDocumentoPersonal=new JScrollPane(this.jListRelacionesSelectReporteTipoDocumentoPersonal);
			
			this.jScrollRelacionesSelectReporteTipoDocumentoPersonal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumentoPersonal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumentoPersonal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDocumentoPersonal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDocumentoPersonal = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDocumentoPersonal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jLabelGenerarExcelReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal.setToolTipText("Generar EXCEL"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jComboBoxTiposReportesDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jLabelTiposArchivoReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal.setToolTipText("Generar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal.setToolTipText("Cancelar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoPersonal.add(this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDocumentoPersonal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal= new JScrollPane(jPanelReporteDinamicoTipoDocumentoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDocumentoPersonal);
		this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDocumentoPersonal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDocumentoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDocumentoPersonal.setName("jPanelImportacionTipoDocumentoPersonal"); 
		
		this.jPanelImportacionTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDocumentoPersonal.setLayout(gridaBagLayoutImportacionTipoDocumentoPersonal);
		
		
		this.jInternalFrameImportacionTipoDocumentoPersonal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDocumentoPersonal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDocumentoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumentoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDocumentoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumentoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumentoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDocumentoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumentoPersonal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumentoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumentoPersonal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDocumentoPersonal = new JLabelMe();

		this.jLabelArchivoImportacionTipoDocumentoPersonal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jLabelArchivoImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDocumentoPersonal = new JFileChooser();		
		this.jFileChooserImportacionTipoDocumentoPersonal.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDocumentoPersonal = new JButtonMe();
		this.jButtonAbrirImportacionTipoDocumentoPersonal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDocumentoPersonal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDocumentoPersonal.setToolTipText("Generar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jButtonAbrirImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDocumentoPersonal = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDocumentoPersonal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jLabelPathArchivoImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDocumentoPersonal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDocumentoPersonal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumentoPersonal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumentoPersonal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jTextFieldPathArchivoImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDocumentoPersonal = new JButtonMe();
		this.jButtonGenerarImportacionTipoDocumentoPersonal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDocumentoPersonal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDocumentoPersonal.setToolTipText("Generar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jButtonGenerarImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDocumentoPersonal = new JButtonMe();
		this.jButtonCerrarImportacionTipoDocumentoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDocumentoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDocumentoPersonal.setToolTipText("Cancelar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoPersonal.add(this.jButtonCerrarImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDocumentoPersonal = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDocumentoPersonal= new JScrollPane(jPanelImportacionTipoDocumentoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDocumentoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDocumentoPersonal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDocumentoPersonal);
		this.jInternalFrameImportacionTipoDocumentoPersonal.getContentPane().add(this.jScrollPanelImportacionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDocumentoPersonal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDocumentoPersonal = new JButtonMe();
			this.jButtonAbrirOrderByTipoDocumentoPersonal.setText("Orden");
			this.jButtonAbrirOrderByTipoDocumentoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumentoPersonal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDocumentoPersonal";
			inputMap = this.jButtonAbrirOrderByTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDocumentoPersonal"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDocumentoPersonal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDocumentoPersonal.setName("jPanelOrderByTipoDocumentoPersonal"); 
			
			this.jPanelOrderByTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDocumentoPersonal.setLayout(gridaBagLayoutOrderByTipoDocumentoPersonal);
			
			
			this.jTableDatosTipoDocumentoPersonalOrderBy = new JTableMe();        
			this.jTableDatosTipoDocumentoPersonalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDocumentoPersonalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDocumentoPersonalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDocumentoPersonalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDocumentoPersonalOrderBy.setViewportView(this.jTableDatosTipoDocumentoPersonalOrderBy);
			this.jTableDatosTipoDocumentoPersonalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDocumentoPersonalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDocumentoPersonal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDocumentoPersonal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDocumentoPersonal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDocumentoPersonal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDocumentoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDocumentoPersonal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDocumentoPersonal.setTitle("Orden");
			this.jInternalFrameOrderByTipoDocumentoPersonal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDocumentoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDocumentoPersonal.setResizable(true);
			this.jInternalFrameOrderByTipoDocumentoPersonal.setClosable(true);
			this.jInternalFrameOrderByTipoDocumentoPersonal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDocumentoPersonal.ipady =150;
				
			this.jPanelOrderByTipoDocumentoPersonal.add(jScrollPanelDatosTipoDocumentoPersonalOrderBy, this.gridBagConstraintsTipoDocumentoPersonal);//this.jTableDatosTipoDocumentoPersonalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDocumentoPersonal = new JButtonMe();
			this.jButtonCerrarOrderByTipoDocumentoPersonal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDocumentoPersonal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDocumentoPersonal.setToolTipText("Cancelar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDocumentoPersonal.add(this.jButtonCerrarOrderByTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDocumentoPersonal = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDocumentoPersonal= new JScrollPane(jPanelOrderByTipoDocumentoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDocumentoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDocumentoPersonal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDocumentoPersonal);
			
			this.jInternalFrameOrderByTipoDocumentoPersonal.getContentPane().add(this.jScrollPanelOrderByTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
		
		} else {
			this.jButtonAbrirOrderByTipoDocumentoPersonal = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDocumentoPersonal.getRowHeight();//TipoDocumentoPersonalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.isSelected()) {
					iHeightTable=TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumentoPersonal.isSelected()) {
					iHeightTable=TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDocumentoPersonal!=null && this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDocumentoPersonal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodocumentopersonalLogic.getTipoDocumentoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentopersonals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDocumentoPersonal> TraerTipoDocumentoPersonalBeans(List<TipoDocumentoPersonal> tipodocumentopersonals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonals) {
					
				if(!(TipoDocumentoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDocumentoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodocumentopersonal.setsDetalleGeneralEntityReporte(TipoDocumentoPersonalConstantesFunciones.getTipoDocumentoPersonalDescripcion(tipodocumentopersonal));
										
						
					
						
					
				} else  {
							
					//tipodocumentopersonal.setsDetalleGeneralEntityReporte(tipodocumentopersonal.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodocumentopersonalbeans.add(tipodocumentopersonalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodocumentopersonals;
    }
	//PARA REPORTES FIN
}
