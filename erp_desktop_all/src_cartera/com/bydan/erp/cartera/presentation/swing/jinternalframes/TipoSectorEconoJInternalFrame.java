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
import com.bydan.erp.cartera.util.TipoSectorEconoConstantesFunciones;

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
public class TipoSectorEconoJInternalFrame extends TipoSectorEconoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoSectorEcono;
	
	protected JMenuBar jmenuBarTipoSectorEcono;
	
	protected JMenu jmenuTipoSectorEcono;
	protected JMenu jmenuDatosTipoSectorEcono;
	protected JMenu jmenuArchivoTipoSectorEcono;
	protected JMenu jmenuAccionesTipoSectorEcono;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSectorEcono;	
	protected GridBagConstraints gridBagConstraintsTipoSectorEcono;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoSectorEconoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoSectorEcono;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoSectorEcono;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoSectorEcono;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSectorEconoSessionBean tiposectoreconoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoSectorEcono> tiposectoreconos;		
	public List<TipoSectorEcono> tiposectoreconosEliminados;	
	public List<TipoSectorEcono> tiposectoreconosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoSectorEcono;		
	protected JButton jButtonAbrirOrderByTipoSectorEcono;
	
	
	//protected JPanel jPanelOrderByTipoSectorEcono;
	//public JScrollPane jScrollPanelOrderByTipoSectorEcono;	
	//protected JButton jButtonCerrarOrderByTipoSectorEcono;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoSectorEconoLogic tiposectoreconoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoSectorEcono;
	public JScrollPane jScrollPanelDatosEdicionTipoSectorEcono;
	public JScrollPane jScrollPanelDatosGeneralTipoSectorEcono;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoSectorEconoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoSectorEcono;
	//public JScrollPane jScrollPanelImportacionTipoSectorEcono;
	
	
	
	protected JPanel jPanelAccionesTipoSectorEcono;
	
    protected JPanel jPanelPaginacionTipoSectorEcono;
    protected JPanel jPanelParametrosReportesTipoSectorEcono;
	protected JPanel jPanelParametrosReportesAccionesTipoSectorEcono;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoSectorEcono;
	protected JPanel jPanelParametrosAuxiliar2TipoSectorEcono;
	protected JPanel jPanelParametrosAuxiliar3TipoSectorEcono;
	protected JPanel jPanelParametrosAuxiliar4TipoSectorEcono;
	//protected JPanel jPanelParametrosAuxiliar5TipoSectorEcono;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoSectorEcono;
	//protected JPanel jPanelImportacionTipoSectorEcono;
	
	
	public JTable jTableDatosTipoSectorEcono;
	
	
	
	//public JTable jTableDatosTipoSectorEconoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoSectorEcono;
	protected JButton jButtonDuplicarTipoSectorEcono;
	protected JButton jButtonCopiarTipoSectorEcono;
	protected JButton jButtonVerFormTipoSectorEcono;
	protected JButton jButtonNuevoRelacionesTipoSectorEcono;
	protected JButton jButtonModificarTipoSectorEcono;
	
    protected JButton jButtonGuardarCambiosTablaTipoSectorEcono;
	protected JButton jButtonCerrarTipoSectorEcono;
	
	
	protected JButton jButtonRecargarInformacionTipoSectorEcono;
	protected JButton jButtonProcesarInformacionTipoSectorEcono;
	
	
	protected JButton jButtonAnterioresTipoSectorEcono;
	protected JButton jButtonSiguientesTipoSectorEcono;
	protected JButton jButtonNuevoGuardarCambiosTipoSectorEcono;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoSectorEcono;
	//protected JButton jButtonCerrarReporteDinamicoTipoSectorEcono;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoSectorEcono;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoSectorEcono;
	//protected JButton jButtonGenerarImportacionTipoSectorEcono;
	//protected JButton jButtonCerrarImportacionTipoSectorEcono;
	//protected JFileChooser jFileChooserImportacionTipoSectorEcono;
	//protected File fileImportacionTipoSectorEcono;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSectorEcono;
	protected JButton jButtonDuplicarToolBarTipoSectorEcono;
	protected JButton jButtonNuevoRelacionesToolBarTipoSectorEcono;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoSectorEcono;
	protected JButton jButtonCopiarToolBarTipoSectorEcono;
	protected JButton jButtonVerFormToolBarTipoSectorEcono;
	public JButton jButtonGuardarCambiosTablaToolBarTipoSectorEcono;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSectorEcono;
	protected JButton jButtonCerrarToolBarTipoSectorEcono;
	
	protected JButton jButtonRecargarInformacionToolBarTipoSectorEcono;
	protected JButton jButtonProcesarInformacionToolBarTipoSectorEcono;
	protected JButton jButtonAnterioresToolBarTipoSectorEcono;
	protected JButton jButtonSiguientesToolBarTipoSectorEcono;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoSectorEcono;
	protected JButton jButtonAbrirOrderByToolBarTipoSectorEcono;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSectorEcono;
	protected JMenuItem jMenuItemDuplicarTipoSectorEcono;
	protected JMenuItem jMenuItemNuevoRelacionesTipoSectorEcono;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoSectorEcono;
	protected JMenuItem jMenuItemCopiarTipoSectorEcono;
	protected JMenuItem jMenuItemVerFormTipoSectorEcono;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSectorEcono;
	protected JMenuItem jMenuItemCerrarTipoSectorEcono;
	protected JMenuItem jMenuItemDetalleCerrarTipoSectorEcono;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoSectorEcono;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSectorEcono;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoSectorEcono;
	protected JMenuItem jMenuItemProcesarInformacionTipoSectorEcono;
	protected JMenuItem jMenuItemAnterioresTipoSectorEcono;
	protected JMenuItem jMenuItemSiguientesTipoSectorEcono;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSectorEcono;
	protected JMenuItem jMenuItemAbrirOrderByTipoSectorEcono;
	protected JMenuItem jMenuItemMostrarOcultarTipoSectorEcono;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSectorEcono;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoSectorEcono;
	protected JCheckBox jCheckBoxSeleccionadosTipoSectorEcono;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoSectorEcono;
	protected JCheckBox jCheckBoxConGraficoReporteTipoSectorEcono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoSectorEcono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoSectorEcono;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoSectorEcono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoSectorEcono;
	protected JTextField jTextFieldValorCampoGeneralTipoSectorEcono;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoSectorEcono;
	//public JList<Reporte> jListColumnasSelectReporteTipoSectorEcono;
	//public JScrollPane jScrollColumnasSelectReporteTipoSectorEcono;
	
	//public JLabel jLabelRelacionesSelectReporteTipoSectorEcono;
	//public JList<Reporte> jListRelacionesSelectReporteTipoSectorEcono;
	//public JScrollPane jScrollRelacionesSelectReporteTipoSectorEcono;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoSectorEcono;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoSectorEcono;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoSectorEcono;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoSectorEcono;
	
		
	//public JLabel jLabelArchivoImportacionTipoSectorEcono;	
	//public JLabel jLabelPathArchivoImportacionTipoSectorEcono;
	//protected JTextField jTextFieldPathArchivoImportacionTipoSectorEcono;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoSectorEcono;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoSectorEcono;
	
	//public JLabel jLabelColumnaCategoriaValorTipoSectorEcono;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoSectorEcono;
	
	//public JLabel jLabelColumnasValoresGraficoTipoSectorEcono;
	//public JList<Reporte> jListColumnasValoresGraficoTipoSectorEcono;
	//public JScrollPane jScrollColumnasValoresGraficoTipoSectorEcono;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoSectorEcono;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoSectorEcono;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoSectorEcono;
	public JPanel jPanelBusquedaPorCodigoTipoSectorEcono;
	public JButton jButtonBusquedaPorCodigoTipoSectorEcono;
	public JPanel jPanelBusquedaPorNombreTipoSectorEcono;
	public JButton jButtonBusquedaPorNombreTipoSectorEcono;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoSectorEcono;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoSectorEcono;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono;
	public JButton jButtoncodigoBusquedaPorCodigoTipoSectorEconoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoSectorEcono;
	public JLabel jLabelnombreBusquedaPorNombreTipoSectorEcono;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoSectorEcono;
	public JButton jButtonnombreBusquedaPorNombreTipoSectorEconoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoSectorEconoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoSectorEcono)	{
		this.jButtonRecargarInformacionTipoSectorEcono = jButtonRecargarInformacionTipoSectorEcono;
	}
	
	public JButton getjButtonProcesarInformacionTipoSectorEcono() {
		return this.jButtonProcesarInformacionTipoSectorEcono;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSectorEcono)	{
		this.jButtonProcesarInformacionTipoSectorEcono = jButtonProcesarInformacionTipoSectorEcono;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoSectorEcono() {
		return this.jButtonRecargarInformacionTipoSectorEcono;
	}
	
	
	public List<TipoSectorEcono> gettiposectoreconos() {
		return this.tiposectoreconos;
	}

	public void settiposectoreconos(List<TipoSectorEcono> tiposectoreconos) {
		this.tiposectoreconos = tiposectoreconos;
	}
	
	public List<TipoSectorEcono> gettiposectoreconosAux() {
		return this.tiposectoreconosAux;
	}

	public void settiposectoreconosAux(List<TipoSectorEcono> tiposectoreconosAux) {
		this.tiposectoreconosAux = tiposectoreconosAux;
	}
	
	public List<TipoSectorEcono> gettiposectoreconosEliminados() {
		return this.tiposectoreconosEliminados;
	}

	public void setTipoSectorEconosEliminados(List<TipoSectorEcono> tiposectoreconosEliminados) {
		this.tiposectoreconosEliminados = tiposectoreconosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoSectorEcono() {
		return jComboBoxTiposSeleccionarTipoSectorEcono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoSectorEcono(
			JComboBox jComboBoxTiposSeleccionarTipoSectorEcono) {
		this.jComboBoxTiposSeleccionarTipoSectorEcono = jComboBoxTiposSeleccionarTipoSectorEcono;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoSectorEcono() {
		return jTextFieldValorCampoGeneralTipoSectorEcono;
	}

	public void setjTextFieldValorCampoGeneralTipoSectorEcono(
			JTextField jTextFieldValorCampoGeneralTipoSectorEcono) {
		this.jTextFieldValorCampoGeneralTipoSectorEcono = jTextFieldValorCampoGeneralTipoSectorEcono;
	}

	public void setBorderResaltarValorCampoGeneralTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoSectorEcono .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoSectorEcono() {
		return this.jCheckBoxSeleccionarTodosTipoSectorEcono;
	}

	public void setjCheckBoxSeleccionarTodosTipoSectorEcono(
			JCheckBox jCheckBoxSeleccionarTodosTipoSectorEcono) {
		this.jCheckBoxSeleccionarTodosTipoSectorEcono = jCheckBoxSeleccionarTodosTipoSectorEcono;
	}

	public void setBorderResaltarSeleccionarTodosTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoSectorEcono() {
		return this.jCheckBoxSeleccionadosTipoSectorEcono;
	}

	public void setjCheckBoxSeleccionadosTipoSectorEcono(
			JCheckBox jCheckBoxSeleccionadosTipoSectorEcono) {
		this.jCheckBoxSeleccionadosTipoSectorEcono = jCheckBoxSeleccionadosTipoSectorEcono;
	}
	
	public void setBorderResaltarSeleccionadosTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoSectorEcono() {
		return this.jComboBoxTiposArchivosReportesTipoSectorEcono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoSectorEcono(
			JComboBox jComboBoxTiposArchivosReportesTipoSectorEcono) {
		this.jComboBoxTiposArchivosReportesTipoSectorEcono = jComboBoxTiposArchivosReportesTipoSectorEcono;
	}

	public void setBorderResaltarTiposArchivosReportesTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoSectorEcono() {
		return this.jComboBoxTiposReportesTipoSectorEcono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoSectorEcono(
			JComboBox jComboBoxTiposReportesTipoSectorEcono) {
		this.jComboBoxTiposReportesTipoSectorEcono = jComboBoxTiposReportesTipoSectorEcono;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoSectorEcono() {
	//	return jComboBoxTiposReportesDinamicoTipoSectorEcono;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoSectorEcono(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoSectorEcono) {
	//	this.jComboBoxTiposReportesDinamicoTipoSectorEcono = jComboBoxTiposReportesDinamicoTipoSectorEcono;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoSectorEcono() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoSectorEcono(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono = jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono;
	//}
	
	public void setBorderResaltarTiposReportesTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoSectorEcono() {
		return this.jComboBoxTiposGraficosReportesTipoSectorEcono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoSectorEcono(
			JComboBox jComboBoxTiposGraficosReportesTipoSectorEcono) {
		this.jComboBoxTiposGraficosReportesTipoSectorEcono = jComboBoxTiposGraficosReportesTipoSectorEcono;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoSectorEcono() {
		return this.jComboBoxTiposPaginacionTipoSectorEcono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoSectorEcono(
			JComboBox jComboBoxTiposPaginacionTipoSectorEcono) {
		this.jComboBoxTiposPaginacionTipoSectorEcono = jComboBoxTiposPaginacionTipoSectorEcono;
	}
	
	public void setBorderResaltarTiposPaginacionTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoSectorEcono() {
		return this.jComboBoxTiposRelacionesTipoSectorEcono;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSectorEcono() {
		return this.jComboBoxTiposAccionesTipoSectorEcono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSectorEcono(
			JComboBox jComboBoxTiposRelacionesTipoSectorEcono) {
		this.jComboBoxTiposRelacionesTipoSectorEcono = jComboBoxTiposRelacionesTipoSectorEcono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSectorEcono(
			JComboBox jComboBoxTiposAccionesTipoSectorEcono) {
		this.jComboBoxTiposAccionesTipoSectorEcono = jComboBoxTiposAccionesTipoSectorEcono;
	}
	
	public void setBorderResaltarTiposRelacionesTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoSectorEcono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoSectorEcono .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoSectorEcono() {
	//	return jCheckBoxConGraficoDinamicoTipoSectorEcono;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoSectorEcono(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoSectorEcono) {
	//	this.jCheckBoxConGraficoDinamicoTipoSectorEcono = jCheckBoxConGraficoDinamicoTipoSectorEcono;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoSectorEcono() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoSectorEcono.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoSectorEcono .setBorder(borderResaltar);		
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
		this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		
		this.tiposectoreconoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposectoreconoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposectoreconoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSectorEconoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sector Econo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoSectorEconoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoSectorEcono= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"nuevo","nuevo","Nuevo"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"duplicar","duplicar","Duplicar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"copiar","copiar","Copiar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"ver_form","ver_form","Ver"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"recargar","recargar","Recargar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoSectorEcono,this.jTtoolBarTipoSectorEcono,
							"cerrar","cerrar","Salir"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoSectorEcono=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoSectorEcono;
			
				this.jButtonProcesarInformacionToolBarTipoSectorEcono=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoSectorEcono;
				
		//protected JButton jButtonModificarToolBarTipoSectorEcono;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoSectorEcono=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoSectorEcono=new JMenuMe("General");
		this.jmenuArchivoTipoSectorEcono=new JMenuMe("Archivo");
		this.jmenuAccionesTipoSectorEcono=new JMenuMe("Acciones");
		this.jmenuDatosTipoSectorEcono=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSectorEcono= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSectorEcono.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSectorEcono,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoSectorEcono= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoSectorEcono.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoSectorEcono,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoSectorEcono= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoSectorEcono.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoSectorEcono,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoSectorEcono= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSectorEcono.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSectorEcono,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoSectorEcono= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoSectorEcono.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoSectorEcono,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoSectorEcono= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoSectorEcono.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoSectorEcono,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoSectorEcono= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoSectorEcono.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoSectorEcono,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSectorEcono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSectorEcono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSectorEcono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoSectorEcono= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoSectorEcono.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoSectorEcono,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoSectorEcono= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoSectorEcono.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoSectorEcono,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoSectorEcono= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoSectorEcono.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoSectorEcono,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoSectorEcono= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoSectorEcono.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoSectorEcono,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoSectorEcono= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoSectorEcono.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoSectorEcono,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSectorEcono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSectorEcono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSectorEcono,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoSectorEcono= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoSectorEcono.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoSectorEcono,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSectorEcono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSectorEcono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSectorEcono,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoSectorEcono= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoSectorEcono.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoSectorEcono,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoSectorEcono.add(this.jMenuItemCerrarTipoSectorEcono);
			
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemNuevoTipoSectorEcono);
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemNuevoGuardarCambiosTipoSectorEcono);
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemNuevoRelacionesTipoSectorEcono);
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemGuardarCambiosTablaTipoSectorEcono);		
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemDuplicarTipoSectorEcono);		
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemCopiarTipoSectorEcono);		
			this.jmenuAccionesTipoSectorEcono.add(this.jMenuItemVerFormTipoSectorEcono);		
			
			this.jmenuDatosTipoSectorEcono.add(this.jMenuItemRecargarInformacionTipoSectorEcono);				
			this.jmenuDatosTipoSectorEcono.add(this.jMenuItemAnterioresTipoSectorEcono);				
			this.jmenuDatosTipoSectorEcono.add(this.jMenuItemSiguientesTipoSectorEcono);				
			this.jmenuDatosTipoSectorEcono.add(this.jMenuItemAbrirOrderByTipoSectorEcono);				
			this.jmenuDatosTipoSectorEcono.add(this.jMenuItemMostrarOcultarTipoSectorEcono);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoSectorEcono.add(this.jMenuItemGuardarCambiosTipoSectorEcono);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoSectorEcono.add(this.jmenuArchivoTipoSectorEcono);		
			this.jmenuBarTipoSectorEcono.add(this.jmenuAccionesTipoSectorEcono);		
			this.jmenuBarTipoSectorEcono.add(this.jmenuDatosTipoSectorEcono);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoSectorEcono);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoSectorEcono() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoSectorEcono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoSectorEcono.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoSectorEcono= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoSectorEcono.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoSectorEcono.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoSectorEcono,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoSectorEcono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoSectorEcono.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoSectorEcono= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoSectorEcono.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoSectorEcono.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoSectorEcono,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoSectorEcono = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoSectorEcono.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoSectorEcono.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoSectorEcono= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoSectorEcono=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoSectorEcono.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSectorEcono.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSectorEcono.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoSectorEcono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoSectorEcono = new TipoSectorEconoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Sector Econo DATOS");
			this.jInternalFrameDetalleFormTipoSectorEcono = new TipoSectorEconoDetalleFormJInternalFrame(jDesktopPane,this.tiposectoreconoSessionBean.getConGuardarRelaciones(),this.tiposectoreconoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoSectorEcono = null;//new TipoSectorEconoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSectorEcono= new GridBagLayout();
		
		
		this.jTableDatosTipoSectorEcono = new JTableMe();      
		
		String sToolTipTipoSectorEcono="";
		sToolTipTipoSectorEcono=TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSectorEcono+="(Cartera.TipoSectorEcono)";
		}
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSectorEcono+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoSectorEcono.setToolTipText(sToolTipTipoSectorEcono);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoSectorEcono);
		this.jTableDatosTipoSectorEcono.setAutoCreateRowSorter(true);
		this.jTableDatosTipoSectorEcono.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoSectorEcono.setRowSelectionAllowed(true);
		this.jTableDatosTipoSectorEcono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoSectorEcono = new JButtonMe();
		this.jButtonDuplicarTipoSectorEcono = new JButtonMe();
		this.jButtonCopiarTipoSectorEcono = new JButtonMe();
		this.jButtonVerFormTipoSectorEcono = new JButtonMe();
		this.jButtonNuevoRelacionesTipoSectorEcono = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono = new JButtonMe();
		this.jButtonCerrarTipoSectorEcono = new JButtonMe();
		
		this.jScrollPanelDatosTipoSectorEcono = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoSectorEcono = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sector Econo";
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSectorEcono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSectorEcono.setToolTipText("Acciones");
        this.jPanelAccionesTipoSectorEcono.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoSectorEcono=new ReporteDinamicoJInternalFrame(TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoSectorEcono();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoSectorEcono=new ImportacionJInternalFrame(TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoSectorEcono();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoSectorEcono = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoSectorEcono.setText("Orden");
		this.jButtonAbrirOrderByTipoSectorEcono.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSectorEcono,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSectorEcono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSectorEcono,false,this);
			
			//this.cargarOrderByTipoSectorEcono(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSectorEcono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSectorEcono,true,this);
			
			//this.cargarOrderByTipoSectorEcono(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoSectorEcono.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSectorEcono.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSectorEcono.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoSectorEcono.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSectorEcono.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSectorEcono.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoSectorEcono.setText("Nuevo");
		this.jButtonDuplicarTipoSectorEcono.setText("Duplicar");
		this.jButtonCopiarTipoSectorEcono.setText("Copiar");
		this.jButtonVerFormTipoSectorEcono.setText("Ver");
		this.jButtonNuevoRelacionesTipoSectorEcono.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.setText("Guardar");
		this.jButtonCerrarTipoSectorEcono.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSectorEcono,"nuevo_button","Nuevo",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoSectorEcono,"duplicar_button","Duplicar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoSectorEcono,"copiar_button","Copiar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoSectorEcono,"ver_form","Ver",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoSectorEcono,"nuevorelaciones_button","Nuevo Rel",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSectorEcono,"guardarcambiostabla_button","Guardar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSectorEcono,"cerrar_button","Salir",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoSectorEcono.setToolTipText("Nuevo"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoSectorEcono.setToolTipText("Duplicar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoSectorEcono.setToolTipText("Copiar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoSectorEcono.setToolTipText("Ver"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoSectorEcono.setToolTipText("Nuevo Rel"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.setToolTipText("Guardar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSectorEcono.setToolTipText("Salir"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSectorEcono";
		inputMap = this.jButtonNuevoTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSectorEcono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSectorEcono"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoSectorEcono";
		inputMap = this.jButtonDuplicarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoSectorEcono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoSectorEcono"));
		
		//COPIAR
		sMapKey = "CopiarTipoSectorEcono";
		inputMap = this.jButtonCopiarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoSectorEcono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoSectorEcono"));
		
		//VEr FORM
		sMapKey = "VerFormTipoSectorEcono";
		inputMap = this.jButtonVerFormTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoSectorEcono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoSectorEcono"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoSectorEcono";
		inputMap = this.jButtonNuevoRelacionesTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoSectorEcono"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoSectorEcono";
		inputMap = this.jButtonModificarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoSectorEcono"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoSectorEcono";
		inputMap = this.jButtonCerrarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSectorEcono"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSectorEcono";
		inputMap = this.jButtonGuardarCambiosTablaTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSectorEcono"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoSectorEcono.setName("jPanelParametrosReportesTipoSectorEcono"); 
		
		this.jPanelParametrosReportesAccionesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoSectorEcono.setName("jPanelParametrosReportesAccionesTipoSectorEcono"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoSectorEcono = new JButtonMe();
		this.jButtonRecargarInformacionTipoSectorEcono.setText("Recargar");
		this.jButtonRecargarInformacionTipoSectorEcono.setToolTipText("Recargar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoSectorEcono,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoSectorEcono = new JButtonMe();
		this.jButtonProcesarInformacionTipoSectorEcono.setText("Procesar");
		this.jButtonProcesarInformacionTipoSectorEcono.setToolTipText("Procesar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoSectorEcono.setVisible(false);
			
		this.jButtonProcesarInformacionTipoSectorEcono.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSectorEcono.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSectorEcono.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSectorEcono.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoSectorEcono.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSectorEcono.setText("TIPO");       
		this.jComboBoxTiposReportesTipoSectorEcono.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSectorEcono.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoSectorEcono.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoSectorEcono.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoSectorEcono.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoSectorEcono.setText("Accion");
		this.jComboBoxTiposRelacionesTipoSectorEcono.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSectorEcono.setText("Accion");
		this.jComboBoxTiposAccionesTipoSectorEcono.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoSectorEcono.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoSectorEcono.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoSectorEcono=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoSectorEcono.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSectorEcono.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSectorEcono.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoSectorEcono = new JLabelMe();
		
		this.jLabelAccionesTipoSectorEcono.setText("Acciones");		
		this.jLabelAccionesTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoSectorEcono = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoSectorEcono.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoSectorEcono.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoSectorEcono = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoSectorEcono.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoSectorEcono.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoSectorEcono = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoSectorEcono = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoSectorEcono.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoSectorEcono.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoSectorEcono = new JButtonMe();
		//this.jButtonAnterioresTipoSectorEcono.setText("<<");
        this.jButtonAnterioresTipoSectorEcono.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoSectorEcono,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoSectorEcono = new JButtonMe();
		//this.jButtonSiguientesTipoSectorEcono.setText(">>");
        this.jButtonSiguientesTipoSectorEcono.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoSectorEcono,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoSectorEcono = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoSectorEcono.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoSectorEcono.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoSectorEcono,"nuevoguardarcambios_button","Nue",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoSectorEcono";
		inputMap = this.jButtonNuevoGuardarCambiosTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoSectorEcono"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoSectorEcono";
		inputMap = this.jButtonRecargarInformacionTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoSectorEcono"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoSectorEcono";
		inputMap = this.jButtonSiguientesTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoSectorEcono"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoSectorEcono";
		inputMap = this.jButtonAnterioresTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoSectorEcono"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoSectorEcono();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoSectorEcono.setMinimumSize(new Dimension(this.getWidth(),TipoSectorEconoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSectorEconoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSectorEcono.setMaximumSize(new Dimension(this.getWidth(),TipoSectorEconoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSectorEconoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSectorEcono.setPreferredSize(new Dimension(this.getWidth(),TipoSectorEconoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSectorEconoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoSectorEcono = new GridBagLayout();

			this.jPanelPaginacionTipoSectorEcono.setLayout(gridaBagLayoutPaginacionTipoSectorEcono);						
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 0;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonAnterioresTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					
						
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSectorEcono.gridy = 0;
			
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonNuevoGuardarCambiosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
						
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSectorEcono.gridy = 0;
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonSiguientesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 1;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonNuevoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
				this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSectorEcono.gridy = 1;
				this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoSectorEcono.add(this.jButtonNuevoRelacionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			}
			
			
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
				this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSectorEcono.gridy = 1;
				this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoSectorEcono.add(this.jButtonGuardarCambiosTablaTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			}
			
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 1;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonDuplicarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 1;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonCopiarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 1;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonVerFormTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 1;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoSectorEcono.add(this.jButtonCerrarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
		
		
		this.jButtonRecargarInformacionTipoSectorEcono.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSectorEcono.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSectorEcono.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoSectorEcono.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSectorEcono.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSectorEcono.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoSectorEcono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSectorEcono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSectorEcono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoSectorEcono.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSectorEcono.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSectorEcono.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoSectorEcono.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSectorEcono.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSectorEcono.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoSectorEcono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSectorEcono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSectorEcono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoSectorEcono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSectorEcono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSectorEcono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoSectorEcono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSectorEcono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSectorEcono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoSectorEcono.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSectorEcono.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSectorEcono.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoSectorEcono.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSectorEcono.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSectorEcono.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoSectorEcono.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSectorEcono.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSectorEcono.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoSectorEcono = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoSectorEcono = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoSectorEcono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoSectorEcono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoSectorEcono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoSectorEcono = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoSectorEcono.setLayout(gridaBagParametrosReportesTipoSectorEcono);
			this.jPanelParametrosReportesAccionesTipoSectorEcono.setLayout(gridaBagParametrosReportesAccionesTipoSectorEcono);
			
			
			this.jPanelParametrosAuxiliar1TipoSectorEcono.setLayout(gridaBagParametrosAuxiliar1TipoSectorEcono);
			this.jPanelParametrosAuxiliar2TipoSectorEcono.setLayout(gridaBagParametrosAuxiliar2TipoSectorEcono);
			this.jPanelParametrosAuxiliar3TipoSectorEcono.setLayout(gridaBagParametrosAuxiliar3TipoSectorEcono);
			this.jPanelParametrosAuxiliar4TipoSectorEcono.setLayout(gridaBagParametrosAuxiliar4TipoSectorEcono);
			//this.jPanelParametrosAuxiliar5TipoSectorEcono.setLayout(gridaBagParametrosAuxiliar2TipoSectorEcono);			
			
			
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jButtonRecargarInformacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSectorEcono.add(this.jComboBoxTiposPaginacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSectorEcono.add(this.jCheckBoxConAltoMaximoTablaTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSectorEcono.add(this.jComboBoxTiposArchivosReportesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jPanelParametrosAuxiliar1TipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoSectorEcono.add(this.jComboBoxTiposReportesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jPanelParametrosAuxiliar4TipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jComboBoxTiposReportesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jCheckBoxGenerarReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jPanelParametrosAuxiliar2TipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jLabelAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
				this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoSectorEcono.add(this.jButtonAbrirOrderByTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jComboBoxTiposSeleccionarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			
			
			/*
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jCheckBoxSeleccionarTodosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSectorEcono.add(this.jCheckBoxSeleccionarTodosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);															
				
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSectorEcono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSectorEcono.add(this.jCheckBoxSeleccionadosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jPanelParametrosAuxiliar3TipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jComboBoxTiposRelacionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
				
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jComboBoxTiposAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
	
				
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSectorEcono.add(this.jTextFieldValorCampoGeneralTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoSectorEcono = new GridBagLayout();

			this.jScrollPanelDatosTipoSectorEcono.setLayout(gridaBagLayoutDatosTipoSectorEcono);
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = 0;
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;
			
			this.jScrollPanelDatosTipoSectorEcono.add(this.jTableDatosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoSectorEcono.setViewportView(this.jTableDatosTipoSectorEcono);
		this.jTableDatosTipoSectorEcono.setFillsViewportHeight(true);
		this.jTableDatosTipoSectorEcono.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoSectorEcono= new GridBagLayout();
		this.jPanelAccionesTipoSectorEcono.setLayout(gridaBagLayoutAccionesTipoSectorEcono);
		
		
		/*	
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
			
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonNuevoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoSectorEcono= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoSectorEcono.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoSectorEcono.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoSectorEcono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoSectorEcono.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoSectorEcono.setLayout(gridaBagLayoutBusquedaPorCodigoTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 0;
		gridBagConstraintsTipoSectorEcono.gridx = 0;
		jPanelBusquedaPorCodigoTipoSectorEcono.add(jLabelcodigoBusquedaPorCodigoTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 0;
		gridBagConstraintsTipoSectorEcono.gridx = 1;
		jPanelBusquedaPorCodigoTipoSectorEcono.add(jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 1;
		gridBagConstraintsTipoSectorEcono.gridx =1;
		jPanelBusquedaPorCodigoTipoSectorEcono.add(jButtonBusquedaPorCodigoTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		jTabbedPaneBusquedasTipoSectorEcono.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoSectorEcono);
		jTabbedPaneBusquedasTipoSectorEcono.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoSectorEcono= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoSectorEcono.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoSectorEcono.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoSectorEcono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoSectorEcono.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoSectorEcono.setLayout(gridaBagLayoutBusquedaPorNombreTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 0;
		gridBagConstraintsTipoSectorEcono.gridx = 0;
		jPanelBusquedaPorNombreTipoSectorEcono.add(jLabelnombreBusquedaPorNombreTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 0;
		gridBagConstraintsTipoSectorEcono.gridx = 1;
		jPanelBusquedaPorNombreTipoSectorEcono.add(jTextAreanombreBusquedaPorNombreTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoSectorEcono.gridy = 1;
		gridBagConstraintsTipoSectorEcono.gridx =1;
		jPanelBusquedaPorNombreTipoSectorEcono.add(jButtonBusquedaPorNombreTipoSectorEcono, gridBagConstraintsTipoSectorEcono);

		jTabbedPaneBusquedasTipoSectorEcono.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoSectorEcono);
		jTabbedPaneBusquedasTipoSectorEcono.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSectorEcono = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSectorEcono);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();						
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;		
			//this.gridBagConstraintsTipoSectorEcono.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSectorEcono.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;		
		//this.gridBagConstraintsTipoSectorEcono.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoSectorEcono.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoSectorEcono);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;		
			this.gridBagConstraintsTipoSectorEcono.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoSectorEcono.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);								
		
		
		/*
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		*/		
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSectorEcono.gridx =0;
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSectorEcono.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
				
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoSectorEcono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSectorEcono = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoSectorEcono.setLayout(gridaBagLayoutBusquedasParametrosTipoSectorEcono);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoSectorEcono=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSectorEcono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSectorEcono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSectorEcono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoSectorEcono;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoSectorEcono() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoSectorEcono = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoSectorEcono.setName("jPanelReporteDinamicoTipoSectorEcono"); 
		
		this.jPanelReporteDinamicoTipoSectorEcono.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSectorEcono.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSectorEcono.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoSectorEcono.setLayout(gridaBagLayoutReporteDinamicoTipoSectorEcono);
		
		
		this.jInternalFrameReporteDinamicoTipoSectorEcono= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoSectorEcono = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSectorEcono= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoSectorEcono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoSectorEcono.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoSectorEcono.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoSectorEcono.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoSectorEcono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoSectorEcono.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoSectorEcono.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoSectorEcono.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoSectorEcono.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSectorEcono.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSectorEcono.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoSectorEcono = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoSectorEcono.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jLabelColumnasSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoSectorEcono = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoSectorEcono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoSectorEcono.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoSectorEcono=new JScrollPane(this.jListColumnasSelectReporteTipoSectorEcono);
			
			this.jScrollColumnasSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSectorEcono.add(this.jListColumnasSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jScrollColumnasSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoSectorEcono = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoSectorEcono.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jLabelRelacionesSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoSectorEcono = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoSectorEcono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoSectorEcono.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoSectorEcono=new JScrollPane(this.jListRelacionesSelectReporteTipoSectorEcono);
			
			this.jScrollRelacionesSelectReporteTipoSectorEcono.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSectorEcono.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSectorEcono.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSectorEcono.add(this.jListRelacionesSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jScrollRelacionesSelectReporteTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoSectorEcono = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoSectorEcono = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoSectorEcono = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoSectorEcono = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoSectorEcono.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoSectorEcono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSectorEcono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSectorEcono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jLabelGenerarExcelReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono.setToolTipText("Generar EXCEL"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		//this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoSectorEcono.add(this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jComboBoxTiposReportesDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jLabelTiposArchivoReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jComboBoxTiposArchivosReportesDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoSectorEcono = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoSectorEcono.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoSectorEcono,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoSectorEcono.setToolTipText("Generar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jButtonGenerarReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoSectorEcono = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoSectorEcono.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoSectorEcono,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoSectorEcono.setToolTipText("Cancelar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSectorEcono.add(this.jButtonCerrarReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoSectorEcono = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoSectorEcono= new JScrollPane(jPanelReporteDinamicoTipoSectorEcono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoSectorEcono.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSectorEcono.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSectorEcono.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoSectorEcono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoSectorEcono.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoSectorEcono);
		this.jInternalFrameReporteDinamicoTipoSectorEcono.getContentPane().add(this.jScrollPanelReporteDinamicoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoSectorEcono() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoSectorEcono = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoSectorEcono.setName("jPanelImportacionTipoSectorEcono"); 
		
		this.jPanelImportacionTipoSectorEcono.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSectorEcono.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSectorEcono.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoSectorEcono.setLayout(gridaBagLayoutImportacionTipoSectorEcono);
		
		
		this.jInternalFrameImportacionTipoSectorEcono= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoSectorEcono= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoSectorEcono = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSectorEcono= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoSectorEcono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSectorEcono.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSectorEcono.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoSectorEcono.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSectorEcono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSectorEcono.setResizable(true);
	    this.jInternalFrameImportacionTipoSectorEcono.setClosable(true);
	    this.jInternalFrameImportacionTipoSectorEcono.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoSectorEcono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSectorEcono.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSectorEcono.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoSectorEcono.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSectorEcono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSectorEcono.setResizable(true);
	    this.jInternalFrameImportacionTipoSectorEcono.setClosable(true);
	    this.jInternalFrameImportacionTipoSectorEcono.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoSectorEcono.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSectorEcono.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSectorEcono.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoSectorEcono = new JLabelMe();

		this.jLabelArchivoImportacionTipoSectorEcono.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSectorEcono.add(this.jLabelArchivoImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoSectorEcono = new JFileChooser();		
		this.jFileChooserImportacionTipoSectorEcono.setToolTipText("ESCOGER ARCHIVO"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoSectorEcono = new JButtonMe();
		this.jButtonAbrirImportacionTipoSectorEcono.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoSectorEcono,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoSectorEcono.setToolTipText("Generar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSectorEcono.add(this.jButtonAbrirImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoSectorEcono = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoSectorEcono.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSectorEcono.add(this.jLabelPathArchivoImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoSectorEcono=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoSectorEcono.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSectorEcono.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSectorEcono.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSectorEcono.add(this.jTextFieldPathArchivoImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoSectorEcono = new JButtonMe();
		this.jButtonGenerarImportacionTipoSectorEcono.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoSectorEcono,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoSectorEcono.setToolTipText("Generar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSectorEcono.add(this.jButtonGenerarImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoSectorEcono = new JButtonMe();
		this.jButtonCerrarImportacionTipoSectorEcono.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoSectorEcono,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoSectorEcono.setToolTipText("Cancelar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSectorEcono.add(this.jButtonCerrarImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoSectorEcono = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoSectorEcono= new JScrollPane(jPanelImportacionTipoSectorEcono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoSectorEcono.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoSectorEcono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoSectorEcono.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoSectorEcono);
		this.jInternalFrameImportacionTipoSectorEcono.getContentPane().add(this.jScrollPanelImportacionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoSectorEcono(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoSectorEcono = new JButtonMe();
			this.jButtonAbrirOrderByTipoSectorEcono.setText("Orden");
			this.jButtonAbrirOrderByTipoSectorEcono.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSectorEcono,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoSectorEcono";
			inputMap = this.jButtonAbrirOrderByTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoSectorEcono"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoSectorEcono = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoSectorEcono.setName("jPanelOrderByTipoSectorEcono"); 
			
			this.jPanelOrderByTipoSectorEcono.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSectorEcono.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSectorEcono.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoSectorEcono.setLayout(gridaBagLayoutOrderByTipoSectorEcono);
			
			
			this.jTableDatosTipoSectorEconoOrderBy = new JTableMe();        
			this.jTableDatosTipoSectorEconoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoSectorEconoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoSectorEconoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoSectorEconoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoSectorEconoOrderBy.setViewportView(this.jTableDatosTipoSectorEconoOrderBy);
			this.jTableDatosTipoSectorEconoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoSectorEconoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoSectorEcono= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoSectorEcono= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoSectorEcono = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoSectorEcono= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoSectorEcono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoSectorEcono.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoSectorEcono.setTitle("Orden");
			this.jInternalFrameOrderByTipoSectorEcono.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoSectorEcono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoSectorEcono.setResizable(true);
			this.jInternalFrameOrderByTipoSectorEcono.setClosable(true);
			this.jInternalFrameOrderByTipoSectorEcono.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoSectorEcono.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSectorEcono.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSectorEcono.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoSectorEcono.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoSectorEcono.ipady =150;
				
			this.jPanelOrderByTipoSectorEcono.add(jScrollPanelDatosTipoSectorEconoOrderBy, this.gridBagConstraintsTipoSectorEcono);//this.jTableDatosTipoSectorEconoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoSectorEcono = new JButtonMe();
			this.jButtonCerrarOrderByTipoSectorEcono.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoSectorEcono,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoSectorEcono.setToolTipText("Cancelar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoSectorEcono.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoSectorEcono.add(this.jButtonCerrarOrderByTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoSectorEcono = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoSectorEcono= new JScrollPane(jPanelOrderByTipoSectorEcono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoSectorEcono.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoSectorEcono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoSectorEcono.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoSectorEcono);
			
			this.jInternalFrameOrderByTipoSectorEcono.getContentPane().add(this.jScrollPanelOrderByTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
		
		} else {
			this.jButtonAbrirOrderByTipoSectorEcono = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiposectoreconoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoSectorEcono.getRowHeight();//TipoSectorEconoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.isSelected()) {
					iHeightTable=TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSectorEcono.isSelected()) {
					iHeightTable=TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSectorEconoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoSectorEcono.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSectorEcono.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSectorEcono.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoSectorEcono.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSectorEcono.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSectorEcono.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoSectorEcono!=null && this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoSectorEcono.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoSectorEcono.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoSectorEcono.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoSectorEcono.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSectorEcono.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSectorEcono.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposectoreconoLogic.getTipoSectorEconos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposectoreconos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoSectorEcono> TraerTipoSectorEconoBeans(List<TipoSectorEcono> tiposectoreconos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoSectorEcono tiposectorecono:tiposectoreconos) {
					
				if(!(TipoSectorEconoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoSectorEconoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposectorecono.setsDetalleGeneralEntityReporte(TipoSectorEconoConstantesFunciones.getTipoSectorEconoDescripcion(tiposectorecono));
										
						
					
					

					if(tiposectorecono.getReferenciaComercials()!=null && Funciones.existeClass(classes,ReferenciaComercial.class)) {
						try{tiposectorecono.setreferenciacomercialsDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaComercialJInternalFrame.TraerReferenciaComercialBeans(tiposectorecono.getReferenciaComercials(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiposectorecono.setsDetalleGeneralEntityReporte(tiposectorecono.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposectoreconobeans.add(tiposectoreconobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposectoreconos;
    }
	//PARA REPORTES FIN
}
