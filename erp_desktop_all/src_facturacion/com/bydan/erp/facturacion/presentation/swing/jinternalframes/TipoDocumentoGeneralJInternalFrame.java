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
import com.bydan.erp.facturacion.util.TipoDocumentoGeneralConstantesFunciones;

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
public class TipoDocumentoGeneralJInternalFrame extends TipoDocumentoGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDocumentoGeneral;
	
	protected JMenuBar jmenuBarTipoDocumentoGeneral;
	
	protected JMenu jmenuTipoDocumentoGeneral;
	protected JMenu jmenuDatosTipoDocumentoGeneral;
	protected JMenu jmenuArchivoTipoDocumentoGeneral;
	protected JMenu jmenuAccionesTipoDocumentoGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumentoGeneral;	
	protected GridBagConstraints gridBagConstraintsTipoDocumentoGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDocumentoGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDocumentoGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDocumentoGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDocumentoGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDocumentoGeneral> tipodocumentogenerals;		
	public List<TipoDocumentoGeneral> tipodocumentogeneralsEliminados;	
	public List<TipoDocumentoGeneral> tipodocumentogeneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDocumentoGeneral;		
	protected JButton jButtonAbrirOrderByTipoDocumentoGeneral;
	
	
	//protected JPanel jPanelOrderByTipoDocumentoGeneral;
	//public JScrollPane jScrollPanelOrderByTipoDocumentoGeneral;	
	//protected JButton jButtonCerrarOrderByTipoDocumentoGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDocumentoGeneral;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumentoGeneral;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumentoGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDocumentoGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDocumentoGeneral;
	//public JScrollPane jScrollPanelImportacionTipoDocumentoGeneral;
	
	
	
	protected JPanel jPanelAccionesTipoDocumentoGeneral;
	
    protected JPanel jPanelPaginacionTipoDocumentoGeneral;
    protected JPanel jPanelParametrosReportesTipoDocumentoGeneral;
	protected JPanel jPanelParametrosReportesAccionesTipoDocumentoGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDocumentoGeneral;
	protected JPanel jPanelParametrosAuxiliar2TipoDocumentoGeneral;
	protected JPanel jPanelParametrosAuxiliar3TipoDocumentoGeneral;
	protected JPanel jPanelParametrosAuxiliar4TipoDocumentoGeneral;
	//protected JPanel jPanelParametrosAuxiliar5TipoDocumentoGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDocumentoGeneral;
	//protected JPanel jPanelImportacionTipoDocumentoGeneral;
	
	
	public JTable jTableDatosTipoDocumentoGeneral;
	
	
	
	//public JTable jTableDatosTipoDocumentoGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDocumentoGeneral;
	protected JButton jButtonDuplicarTipoDocumentoGeneral;
	protected JButton jButtonCopiarTipoDocumentoGeneral;
	protected JButton jButtonVerFormTipoDocumentoGeneral;
	protected JButton jButtonNuevoRelacionesTipoDocumentoGeneral;
	protected JButton jButtonModificarTipoDocumentoGeneral;
	
    protected JButton jButtonGuardarCambiosTablaTipoDocumentoGeneral;
	protected JButton jButtonCerrarTipoDocumentoGeneral;
	
	
	protected JButton jButtonRecargarInformacionTipoDocumentoGeneral;
	protected JButton jButtonProcesarInformacionTipoDocumentoGeneral;
	
	
	protected JButton jButtonAnterioresTipoDocumentoGeneral;
	protected JButton jButtonSiguientesTipoDocumentoGeneral;
	protected JButton jButtonNuevoGuardarCambiosTipoDocumentoGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDocumentoGeneral;
	//protected JButton jButtonCerrarReporteDinamicoTipoDocumentoGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDocumentoGeneral;
	//protected JButton jButtonGenerarImportacionTipoDocumentoGeneral;
	//protected JButton jButtonCerrarImportacionTipoDocumentoGeneral;
	//protected JFileChooser jFileChooserImportacionTipoDocumentoGeneral;
	//protected File fileImportacionTipoDocumentoGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumentoGeneral;
	protected JButton jButtonDuplicarToolBarTipoDocumentoGeneral;
	protected JButton jButtonNuevoRelacionesToolBarTipoDocumentoGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDocumentoGeneral;
	protected JButton jButtonCopiarToolBarTipoDocumentoGeneral;
	protected JButton jButtonVerFormToolBarTipoDocumentoGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumentoGeneral;
	protected JButton jButtonCerrarToolBarTipoDocumentoGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDocumentoGeneral;
	protected JButton jButtonProcesarInformacionToolBarTipoDocumentoGeneral;
	protected JButton jButtonAnterioresToolBarTipoDocumentoGeneral;
	protected JButton jButtonSiguientesToolBarTipoDocumentoGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral;
	protected JButton jButtonAbrirOrderByToolBarTipoDocumentoGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDuplicarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDocumentoGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDocumentoGeneral;
	protected JMenuItem jMenuItemCopiarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemVerFormTipoDocumentoGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumentoGeneral;
	protected JMenuItem jMenuItemCerrarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumentoGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDocumentoGeneral;
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumentoGeneral;
	protected JMenuItem jMenuItemAnterioresTipoDocumentoGeneral;
	protected JMenuItem jMenuItemSiguientesTipoDocumentoGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral;
	protected JMenuItem jMenuItemAbrirOrderByTipoDocumentoGeneral;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumentoGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumentoGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDocumentoGeneral;
	protected JCheckBox jCheckBoxSeleccionadosTipoDocumentoGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDocumentoGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumentoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDocumentoGeneral;
	protected JTextField jTextFieldValorCampoGeneralTipoDocumentoGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDocumentoGeneral;
	//public JList<Reporte> jListColumnasSelectReporteTipoDocumentoGeneral;
	//public JScrollPane jScrollColumnasSelectReporteTipoDocumentoGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDocumentoGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDocumentoGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDocumentoGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDocumentoGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDocumentoGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral;
	
		
	//public JLabel jLabelArchivoImportacionTipoDocumentoGeneral;	
	//public JLabel jLabelPathArchivoImportacionTipoDocumentoGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDocumentoGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDocumentoGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDocumentoGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDocumentoGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDocumentoGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDocumentoGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDocumentoGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDocumentoGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDocumentoGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDocumentoGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDocumentoGeneral;
	public JPanel jPanelBusquedaPorCodigoTipoDocumentoGeneral;
	public JButton jButtonBusquedaPorCodigoTipoDocumentoGeneral;
	public JPanel jPanelBusquedaPorIdTipoDocumentoGeneral;
	public JButton jButtonBusquedaPorIdTipoDocumentoGeneral;
	public JPanel jPanelBusquedaPorNombreTipoDocumentoGeneral;
	public JButton jButtonBusquedaPorNombreTipoDocumentoGeneral;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDocumentoGeneral;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDocumentoGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTipoDocumentoGeneral;
	public JLabel jLabelidBusquedaPorIdTipoDocumentoGeneral;
	public JTextFieldMe jTextFieldidTipoDocumentoGeneralBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoDocumentoGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDocumentoGeneral;
	public JLabel jLabelnombreBusquedaPorNombreTipoDocumentoGeneral;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral;
	public JButton jButtonnombreBusquedaPorNombreTipoDocumentoGeneralBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoDocumentoGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDocumentoGeneral)	{
		this.jButtonRecargarInformacionTipoDocumentoGeneral = jButtonRecargarInformacionTipoDocumentoGeneral;
	}
	
	public JButton getjButtonProcesarInformacionTipoDocumentoGeneral() {
		return this.jButtonProcesarInformacionTipoDocumentoGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumentoGeneral)	{
		this.jButtonProcesarInformacionTipoDocumentoGeneral = jButtonProcesarInformacionTipoDocumentoGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDocumentoGeneral() {
		return this.jButtonRecargarInformacionTipoDocumentoGeneral;
	}
	
	
	public List<TipoDocumentoGeneral> gettipodocumentogenerals() {
		return this.tipodocumentogenerals;
	}

	public void settipodocumentogenerals(List<TipoDocumentoGeneral> tipodocumentogenerals) {
		this.tipodocumentogenerals = tipodocumentogenerals;
	}
	
	public List<TipoDocumentoGeneral> gettipodocumentogeneralsAux() {
		return this.tipodocumentogeneralsAux;
	}

	public void settipodocumentogeneralsAux(List<TipoDocumentoGeneral> tipodocumentogeneralsAux) {
		this.tipodocumentogeneralsAux = tipodocumentogeneralsAux;
	}
	
	public List<TipoDocumentoGeneral> gettipodocumentogeneralsEliminados() {
		return this.tipodocumentogeneralsEliminados;
	}

	public void setTipoDocumentoGeneralsEliminados(List<TipoDocumentoGeneral> tipodocumentogeneralsEliminados) {
		this.tipodocumentogeneralsEliminados = tipodocumentogeneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDocumentoGeneral() {
		return jComboBoxTiposSeleccionarTipoDocumentoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDocumentoGeneral(
			JComboBox jComboBoxTiposSeleccionarTipoDocumentoGeneral) {
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral = jComboBoxTiposSeleccionarTipoDocumentoGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDocumentoGeneral() {
		return jTextFieldValorCampoGeneralTipoDocumentoGeneral;
	}

	public void setjTextFieldValorCampoGeneralTipoDocumentoGeneral(
			JTextField jTextFieldValorCampoGeneralTipoDocumentoGeneral) {
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral = jTextFieldValorCampoGeneralTipoDocumentoGeneral;
	}

	public void setBorderResaltarValorCampoGeneralTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDocumentoGeneral() {
		return this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral;
	}

	public void setjCheckBoxSeleccionarTodosTipoDocumentoGeneral(
			JCheckBox jCheckBoxSeleccionarTodosTipoDocumentoGeneral) {
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral = jCheckBoxSeleccionarTodosTipoDocumentoGeneral;
	}

	public void setBorderResaltarSeleccionarTodosTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDocumentoGeneral() {
		return this.jCheckBoxSeleccionadosTipoDocumentoGeneral;
	}

	public void setjCheckBoxSeleccionadosTipoDocumentoGeneral(
			JCheckBox jCheckBoxSeleccionadosTipoDocumentoGeneral) {
		this.jCheckBoxSeleccionadosTipoDocumentoGeneral = jCheckBoxSeleccionadosTipoDocumentoGeneral;
	}
	
	public void setBorderResaltarSeleccionadosTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDocumentoGeneral() {
		return this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposArchivosReportesTipoDocumentoGeneral) {
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral = jComboBoxTiposArchivosReportesTipoDocumentoGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDocumentoGeneral() {
		return this.jComboBoxTiposReportesTipoDocumentoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposReportesTipoDocumentoGeneral) {
		this.jComboBoxTiposReportesTipoDocumentoGeneral = jComboBoxTiposReportesTipoDocumentoGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDocumentoGeneral() {
	//	return jComboBoxTiposReportesDinamicoTipoDocumentoGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDocumentoGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDocumentoGeneral) {
	//	this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral = jComboBoxTiposReportesDinamicoTipoDocumentoGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral = jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral;
	//}
	
	public void setBorderResaltarTiposReportesTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDocumentoGeneral() {
		return this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposGraficosReportesTipoDocumentoGeneral) {
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral = jComboBoxTiposGraficosReportesTipoDocumentoGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDocumentoGeneral() {
		return this.jComboBoxTiposPaginacionTipoDocumentoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDocumentoGeneral(
			JComboBox jComboBoxTiposPaginacionTipoDocumentoGeneral) {
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral = jComboBoxTiposPaginacionTipoDocumentoGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDocumentoGeneral() {
		return this.jComboBoxTiposRelacionesTipoDocumentoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumentoGeneral() {
		return this.jComboBoxTiposAccionesTipoDocumentoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposRelacionesTipoDocumentoGeneral) {
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral = jComboBoxTiposRelacionesTipoDocumentoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumentoGeneral(
			JComboBox jComboBoxTiposAccionesTipoDocumentoGeneral) {
		this.jComboBoxTiposAccionesTipoDocumentoGeneral = jComboBoxTiposAccionesTipoDocumentoGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDocumentoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDocumentoGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDocumentoGeneral() {
	//	return jCheckBoxConGraficoDinamicoTipoDocumentoGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDocumentoGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDocumentoGeneral) {
	//	this.jCheckBoxConGraficoDinamicoTipoDocumentoGeneral = jCheckBoxConGraficoDinamicoTipoDocumentoGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDocumentoGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDocumentoGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDocumentoGeneral .setBorder(borderResaltar);		
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
		this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		
		this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento General MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDocumentoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDocumentoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDocumentoGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"nuevo","nuevo","Nuevo"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"duplicar","duplicar","Duplicar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"copiar","copiar","Copiar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"ver_form","ver_form","Ver"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"recargar","recargar","Recargar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDocumentoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,
							"cerrar","cerrar","Salir"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDocumentoGeneral;
			
				this.jButtonProcesarInformacionToolBarTipoDocumentoGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDocumentoGeneral;
				
		//protected JButton jButtonModificarToolBarTipoDocumentoGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDocumentoGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDocumentoGeneral=new JMenuMe("General");
		this.jmenuArchivoTipoDocumentoGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDocumentoGeneral=new JMenuMe("Acciones");
		this.jmenuDatosTipoDocumentoGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumentoGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumentoGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumentoGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDocumentoGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDocumentoGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDocumentoGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDocumentoGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDocumentoGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDocumentoGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumentoGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDocumentoGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDocumentoGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDocumentoGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDocumentoGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDocumentoGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDocumentoGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumentoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumentoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumentoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDocumentoGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDocumentoGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDocumentoGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDocumentoGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDocumentoGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDocumentoGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDocumentoGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDocumentoGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDocumentoGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDocumentoGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDocumentoGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDocumentoGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDocumentoGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDocumentoGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDocumentoGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumentoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumentoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumentoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDocumentoGeneral.add(this.jMenuItemCerrarTipoDocumentoGeneral);
			
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemNuevoTipoDocumentoGeneral);
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral);
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemNuevoRelacionesTipoDocumentoGeneral);
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral);		
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemDuplicarTipoDocumentoGeneral);		
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemCopiarTipoDocumentoGeneral);		
			this.jmenuAccionesTipoDocumentoGeneral.add(this.jMenuItemVerFormTipoDocumentoGeneral);		
			
			this.jmenuDatosTipoDocumentoGeneral.add(this.jMenuItemRecargarInformacionTipoDocumentoGeneral);				
			this.jmenuDatosTipoDocumentoGeneral.add(this.jMenuItemAnterioresTipoDocumentoGeneral);				
			this.jmenuDatosTipoDocumentoGeneral.add(this.jMenuItemSiguientesTipoDocumentoGeneral);				
			this.jmenuDatosTipoDocumentoGeneral.add(this.jMenuItemAbrirOrderByTipoDocumentoGeneral);				
			this.jmenuDatosTipoDocumentoGeneral.add(this.jMenuItemMostrarOcultarTipoDocumentoGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDocumentoGeneral.add(this.jMenuItemGuardarCambiosTipoDocumentoGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDocumentoGeneral.add(this.jmenuArchivoTipoDocumentoGeneral);		
			this.jmenuBarTipoDocumentoGeneral.add(this.jmenuAccionesTipoDocumentoGeneral);		
			this.jmenuBarTipoDocumentoGeneral.add(this.jmenuDatosTipoDocumentoGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDocumentoGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDocumentoGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDocumentoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDocumentoGeneral.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDocumentoGeneral= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDocumentoGeneral.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDocumentoGeneral.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDocumentoGeneral,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTipoDocumentoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoDocumentoGeneral.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoDocumentoGeneral= new JButtonMe();
		this.jButtonBusquedaPorIdTipoDocumentoGeneral.setText("Buscar");
		this.jButtonBusquedaPorIdTipoDocumentoGeneral.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoDocumentoGeneral,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoDocumentoGeneral = new JLabelMe();
		jLabelidBusquedaPorIdTipoDocumentoGeneral.setText("Id :");
		jLabelidBusquedaPorIdTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTipoDocumentoGeneralBusquedaPorId= new JTextFieldMe();
		jTextFieldidTipoDocumentoGeneralBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoGeneralBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoGeneralBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoDocumentoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDocumentoGeneral.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDocumentoGeneral= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDocumentoGeneral.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDocumentoGeneral.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDocumentoGeneral,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDocumentoGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDocumentoGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumentoGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumentoGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDocumentoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDocumentoGeneral = new TipoDocumentoGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Documento General DATOS");
			this.jInternalFrameDetalleFormTipoDocumentoGeneral = new TipoDocumentoGeneralDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentogeneralSessionBean.getConGuardarRelaciones(),this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral = null;//new TipoDocumentoGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumentoGeneral= new GridBagLayout();
		
		
		this.jTableDatosTipoDocumentoGeneral = new JTableMe();      
		
		String sToolTipTipoDocumentoGeneral="";
		sToolTipTipoDocumentoGeneral=TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumentoGeneral+="(Facturacion.TipoDocumentoGeneral)";
		}
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumentoGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDocumentoGeneral.setToolTipText(sToolTipTipoDocumentoGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDocumentoGeneral);
		this.jTableDatosTipoDocumentoGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDocumentoGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDocumentoGeneral.setRowSelectionAllowed(true);
		this.jTableDatosTipoDocumentoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDocumentoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDocumentoGeneral = new JButtonMe();
		this.jButtonDuplicarTipoDocumentoGeneral = new JButtonMe();
		this.jButtonCopiarTipoDocumentoGeneral = new JButtonMe();
		this.jButtonVerFormTipoDocumentoGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDocumentoGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral = new JButtonMe();
		this.jButtonCerrarTipoDocumentoGeneral = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumentoGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDocumentoGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento General";
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumentoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumentoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumentoGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDocumentoGeneral=new ReporteDinamicoJInternalFrame(TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDocumentoGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDocumentoGeneral=new ImportacionJInternalFrame(TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDocumentoGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDocumentoGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDocumentoGeneral.setText("Orden");
		this.jButtonAbrirOrderByTipoDocumentoGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumentoGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumentoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoGeneral,false,this);
			
			//this.cargarOrderByTipoDocumentoGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumentoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoGeneral,true,this);
			
			//this.cargarOrderByTipoDocumentoGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDocumentoGeneral.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDocumentoGeneral.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDocumentoGeneral.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDocumentoGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumentoGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumentoGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDocumentoGeneral.setText("Nuevo");
		this.jButtonDuplicarTipoDocumentoGeneral.setText("Duplicar");
		this.jButtonCopiarTipoDocumentoGeneral.setText("Copiar");
		this.jButtonVerFormTipoDocumentoGeneral.setText("Ver");
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setText("Guardar");
		this.jButtonCerrarTipoDocumentoGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumentoGeneral,"nuevo_button","Nuevo",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDocumentoGeneral,"duplicar_button","Duplicar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDocumentoGeneral,"copiar_button","Copiar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDocumentoGeneral,"ver_form","Ver",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDocumentoGeneral,"nuevorelaciones_button","Nuevo Rel",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumentoGeneral,"guardarcambiostabla_button","Guardar",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumentoGeneral,"cerrar_button","Salir",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDocumentoGeneral.setToolTipText("Nuevo"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDocumentoGeneral.setToolTipText("Duplicar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDocumentoGeneral.setToolTipText("Copiar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDocumentoGeneral.setToolTipText("Ver"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.setToolTipText("Nuevo Rel"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setToolTipText("Guardar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumentoGeneral.setToolTipText("Salir"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumentoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumentoGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDocumentoGeneral";
		inputMap = this.jButtonDuplicarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDocumentoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDocumentoGeneral"));
		
		//COPIAR
		sMapKey = "CopiarTipoDocumentoGeneral";
		inputMap = this.jButtonCopiarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDocumentoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDocumentoGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDocumentoGeneral";
		inputMap = this.jButtonVerFormTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDocumentoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDocumentoGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoRelacionesTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDocumentoGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDocumentoGeneral";
		inputMap = this.jButtonModificarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDocumentoGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumentoGeneral";
		inputMap = this.jButtonCerrarTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumentoGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumentoGeneral";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumentoGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDocumentoGeneral.setName("jPanelParametrosReportesTipoDocumentoGeneral"); 
		
		this.jPanelParametrosReportesAccionesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDocumentoGeneral.setName("jPanelParametrosReportesAccionesTipoDocumentoGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDocumentoGeneral = new JButtonMe();
		this.jButtonRecargarInformacionTipoDocumentoGeneral.setText("Recargar");
		this.jButtonRecargarInformacionTipoDocumentoGeneral.setToolTipText("Recargar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDocumentoGeneral,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDocumentoGeneral = new JButtonMe();
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setText("Procesar");
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setToolTipText("Procesar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumentoGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDocumentoGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDocumentoGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDocumentoGeneral = new JLabelMe();
		
		this.jLabelAccionesTipoDocumentoGeneral.setText("Acciones");		
		this.jLabelAccionesTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDocumentoGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDocumentoGeneral = new JButtonMe();
		//this.jButtonAnterioresTipoDocumentoGeneral.setText("<<");
        this.jButtonAnterioresTipoDocumentoGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDocumentoGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDocumentoGeneral = new JButtonMe();
		//this.jButtonSiguientesTipoDocumentoGeneral.setText(">>");
        this.jButtonSiguientesTipoDocumentoGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDocumentoGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral,"nuevoguardarcambios_button","Nue",this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDocumentoGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDocumentoGeneral";
		inputMap = this.jButtonRecargarInformacionTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDocumentoGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDocumentoGeneral";
		inputMap = this.jButtonSiguientesTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDocumentoGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDocumentoGeneral";
		inputMap = this.jButtonAnterioresTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDocumentoGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDocumentoGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDocumentoGeneral.setMinimumSize(new Dimension(this.getWidth(),TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumentoGeneral.setMaximumSize(new Dimension(this.getWidth(),TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumentoGeneral.setPreferredSize(new Dimension(this.getWidth(),TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDocumentoGeneral = new GridBagLayout();

			this.jPanelPaginacionTipoDocumentoGeneral.setLayout(gridaBagLayoutPaginacionTipoDocumentoGeneral);						
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonAnterioresTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					
						
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
			
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
						
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonSiguientesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonNuevoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
						
			
			
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
				this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonGuardarCambiosTablaTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			}
			
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonDuplicarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonCopiarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonVerFormTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDocumentoGeneral.add(this.jButtonCerrarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
		
		
		this.jButtonRecargarInformacionTipoDocumentoGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumentoGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumentoGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDocumentoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumentoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumentoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDocumentoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDocumentoGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDocumentoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDocumentoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDocumentoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDocumentoGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDocumentoGeneral.setLayout(gridaBagParametrosReportesTipoDocumentoGeneral);
			this.jPanelParametrosReportesAccionesTipoDocumentoGeneral.setLayout(gridaBagParametrosReportesAccionesTipoDocumentoGeneral);
			
			
			this.jPanelParametrosAuxiliar1TipoDocumentoGeneral.setLayout(gridaBagParametrosAuxiliar1TipoDocumentoGeneral);
			this.jPanelParametrosAuxiliar2TipoDocumentoGeneral.setLayout(gridaBagParametrosAuxiliar2TipoDocumentoGeneral);
			this.jPanelParametrosAuxiliar3TipoDocumentoGeneral.setLayout(gridaBagParametrosAuxiliar3TipoDocumentoGeneral);
			this.jPanelParametrosAuxiliar4TipoDocumentoGeneral.setLayout(gridaBagParametrosAuxiliar4TipoDocumentoGeneral);
			//this.jPanelParametrosAuxiliar5TipoDocumentoGeneral.setLayout(gridaBagParametrosAuxiliar2TipoDocumentoGeneral);			
			
			
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jButtonRecargarInformacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoGeneral.add(this.jComboBoxTiposPaginacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoGeneral.add(this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumentoGeneral.add(this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jPanelParametrosAuxiliar1TipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDocumentoGeneral.add(this.jComboBoxTiposReportesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jPanelParametrosAuxiliar4TipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jComboBoxTiposReportesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jCheckBoxGenerarReporteTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jPanelParametrosAuxiliar2TipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jLabelAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jButtonAbrirOrderByTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jComboBoxTiposSeleccionarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			
			
			/*
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumentoGeneral.add(this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);															
				
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumentoGeneral.add(this.jCheckBoxSeleccionadosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jPanelParametrosAuxiliar3TipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jComboBoxTiposRelacionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
				
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jComboBoxTiposAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
	
				
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumentoGeneral.add(this.jTextFieldValorCampoGeneralTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDocumentoGeneral = new GridBagLayout();

			this.jScrollPanelDatosTipoDocumentoGeneral.setLayout(gridaBagLayoutDatosTipoDocumentoGeneral);
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
			
			this.jScrollPanelDatosTipoDocumentoGeneral.add(this.jTableDatosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDocumentoGeneral.setViewportView(this.jTableDatosTipoDocumentoGeneral);
		this.jTableDatosTipoDocumentoGeneral.setFillsViewportHeight(true);
		this.jTableDatosTipoDocumentoGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumentoGeneral= new GridBagLayout();
		this.jPanelAccionesTipoDocumentoGeneral.setLayout(gridaBagLayoutAccionesTipoDocumentoGeneral);
		
		
		/*	
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
			
		this.jPanelAccionesTipoDocumentoGeneral.add(this.jButtonNuevoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDocumentoGeneral.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		jPanelBusquedaPorCodigoTipoDocumentoGeneral.add(jLabelcodigoBusquedaPorCodigoTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
		jPanelBusquedaPorCodigoTipoDocumentoGeneral.add(jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
		gridBagConstraintsTipoDocumentoGeneral.gridx =1;
		jPanelBusquedaPorCodigoTipoDocumentoGeneral.add(jButtonBusquedaPorCodigoTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		jTabbedPaneBusquedasTipoDocumentoGeneral.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDocumentoGeneral);
		jTabbedPaneBusquedasTipoDocumentoGeneral.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoDocumentoGeneral.setLayout(gridaBagLayoutBusquedaPorIdTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		jPanelBusquedaPorIdTipoDocumentoGeneral.add(jLabelidBusquedaPorIdTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
		jPanelBusquedaPorIdTipoDocumentoGeneral.add(jTextFieldidTipoDocumentoGeneralBusquedaPorId, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
		gridBagConstraintsTipoDocumentoGeneral.gridx =1;
		jPanelBusquedaPorIdTipoDocumentoGeneral.add(jButtonBusquedaPorIdTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		jTabbedPaneBusquedasTipoDocumentoGeneral.addTab("2.-Por Id ", jPanelBusquedaPorIdTipoDocumentoGeneral);
		jTabbedPaneBusquedasTipoDocumentoGeneral.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDocumentoGeneral.setLayout(gridaBagLayoutBusquedaPorNombreTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		jPanelBusquedaPorNombreTipoDocumentoGeneral.add(jLabelnombreBusquedaPorNombreTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 0;
		gridBagConstraintsTipoDocumentoGeneral.gridx = 1;
		jPanelBusquedaPorNombreTipoDocumentoGeneral.add(jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumentoGeneral.gridy = 1;
		gridBagConstraintsTipoDocumentoGeneral.gridx =1;
		jPanelBusquedaPorNombreTipoDocumentoGeneral.add(jButtonBusquedaPorNombreTipoDocumentoGeneral, gridBagConstraintsTipoDocumentoGeneral);

		jTabbedPaneBusquedasTipoDocumentoGeneral.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTipoDocumentoGeneral);
		jTabbedPaneBusquedasTipoDocumentoGeneral.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumentoGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumentoGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;		
			//this.gridBagConstraintsTipoDocumentoGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;		
		//this.gridBagConstraintsTipoDocumentoGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDocumentoGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;		
			this.gridBagConstraintsTipoDocumentoGeneral.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDocumentoGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);								
		
		
		/*
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		*/		
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =0;
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumentoGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
				
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDocumentoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumentoGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDocumentoGeneral.setLayout(gridaBagLayoutBusquedasParametrosTipoDocumentoGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
			
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDocumentoGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDocumentoGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDocumentoGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setName("jPanelReporteDinamicoTipoDocumentoGeneral"); 
		
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDocumentoGeneral.setLayout(gridaBagLayoutReporteDinamicoTipoDocumentoGeneral);
		
		
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumentoGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDocumentoGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDocumentoGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jLabelColumnasSelectReporteTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDocumentoGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDocumentoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDocumentoGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDocumentoGeneral=new JScrollPane(this.jListColumnasSelectReporteTipoDocumentoGeneral);
			
			this.jScrollColumnasSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jListColumnasSelectReporteTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jScrollColumnasSelectReporteTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDocumentoGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDocumentoGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDocumentoGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDocumentoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDocumentoGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDocumentoGeneral=new JScrollPane(this.jListRelacionesSelectReporteTipoDocumentoGeneral);
			
			this.jScrollRelacionesSelectReporteTipoDocumentoGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumentoGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumentoGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDocumentoGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDocumentoGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDocumentoGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jLabelGenerarExcelReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral.setToolTipText("Generar EXCEL"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jComboBoxTiposReportesDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jLabelTiposArchivoReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral.setToolTipText("Generar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral.setToolTipText("Cancelar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumentoGeneral.add(this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDocumentoGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral= new JScrollPane(jPanelReporteDinamicoTipoDocumentoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDocumentoGeneral);
		this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDocumentoGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDocumentoGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDocumentoGeneral.setName("jPanelImportacionTipoDocumentoGeneral"); 
		
		this.jPanelImportacionTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDocumentoGeneral.setLayout(gridaBagLayoutImportacionTipoDocumentoGeneral);
		
		
		this.jInternalFrameImportacionTipoDocumentoGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDocumentoGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDocumentoGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumentoGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDocumentoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumentoGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumentoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDocumentoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumentoGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumentoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumentoGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDocumentoGeneral = new JLabelMe();

		this.jLabelArchivoImportacionTipoDocumentoGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jLabelArchivoImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDocumentoGeneral = new JFileChooser();		
		this.jFileChooserImportacionTipoDocumentoGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDocumentoGeneral = new JButtonMe();
		this.jButtonAbrirImportacionTipoDocumentoGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDocumentoGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDocumentoGeneral.setToolTipText("Generar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jButtonAbrirImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDocumentoGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDocumentoGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDocumentoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumentoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumentoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jLabelPathArchivoImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDocumentoGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDocumentoGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumentoGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumentoGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jTextFieldPathArchivoImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDocumentoGeneral = new JButtonMe();
		this.jButtonGenerarImportacionTipoDocumentoGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDocumentoGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDocumentoGeneral.setToolTipText("Generar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jButtonGenerarImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDocumentoGeneral = new JButtonMe();
		this.jButtonCerrarImportacionTipoDocumentoGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDocumentoGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDocumentoGeneral.setToolTipText("Cancelar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumentoGeneral.add(this.jButtonCerrarImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDocumentoGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDocumentoGeneral= new JScrollPane(jPanelImportacionTipoDocumentoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDocumentoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDocumentoGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDocumentoGeneral);
		this.jInternalFrameImportacionTipoDocumentoGeneral.getContentPane().add(this.jScrollPanelImportacionTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDocumentoGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDocumentoGeneral = new JButtonMe();
			this.jButtonAbrirOrderByTipoDocumentoGeneral.setText("Orden");
			this.jButtonAbrirOrderByTipoDocumentoGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumentoGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDocumentoGeneral";
			inputMap = this.jButtonAbrirOrderByTipoDocumentoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDocumentoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDocumentoGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDocumentoGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDocumentoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDocumentoGeneral.setName("jPanelOrderByTipoDocumentoGeneral"); 
			
			this.jPanelOrderByTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDocumentoGeneral.setLayout(gridaBagLayoutOrderByTipoDocumentoGeneral);
			
			
			this.jTableDatosTipoDocumentoGeneralOrderBy = new JTableMe();        
			this.jTableDatosTipoDocumentoGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDocumentoGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDocumentoGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDocumentoGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDocumentoGeneralOrderBy.setViewportView(this.jTableDatosTipoDocumentoGeneralOrderBy);
			this.jTableDatosTipoDocumentoGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDocumentoGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDocumentoGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDocumentoGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDocumentoGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDocumentoGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDocumentoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDocumentoGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDocumentoGeneral.setTitle("Orden");
			this.jInternalFrameOrderByTipoDocumentoGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDocumentoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDocumentoGeneral.setResizable(true);
			this.jInternalFrameOrderByTipoDocumentoGeneral.setClosable(true);
			this.jInternalFrameOrderByTipoDocumentoGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDocumentoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Generals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDocumentoGeneral.ipady =150;
				
			this.jPanelOrderByTipoDocumentoGeneral.add(jScrollPanelDatosTipoDocumentoGeneralOrderBy, this.gridBagConstraintsTipoDocumentoGeneral);//this.jTableDatosTipoDocumentoGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDocumentoGeneral = new JButtonMe();
			this.jButtonCerrarOrderByTipoDocumentoGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDocumentoGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDocumentoGeneral.setToolTipText("Cancelar"+" "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDocumentoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDocumentoGeneral.add(this.jButtonCerrarOrderByTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDocumentoGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDocumentoGeneral= new JScrollPane(jPanelOrderByTipoDocumentoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDocumentoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDocumentoGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumentoGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDocumentoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDocumentoGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDocumentoGeneral);
			
			this.jInternalFrameOrderByTipoDocumentoGeneral.getContentPane().add(this.jScrollPanelOrderByTipoDocumentoGeneral, this.gridBagConstraintsTipoDocumentoGeneral);			
		
		} else {
			this.jButtonAbrirOrderByTipoDocumentoGeneral = new JButtonMe();
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
			&& this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDocumentoGeneral.getRowHeight();//TipoDocumentoGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.isSelected()) {
					iHeightTable=TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumentoGeneral.isSelected()) {
					iHeightTable=TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDocumentoGeneral!=null && this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDocumentoGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDocumentoGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumentoGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumentoGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodocumentogeneralLogic.getTipoDocumentoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentogenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDocumentoGeneral> TraerTipoDocumentoGeneralBeans(List<TipoDocumentoGeneral> tipodocumentogenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDocumentoGeneral tipodocumentogeneral:tipodocumentogenerals) {
					
				if(!(TipoDocumentoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDocumentoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodocumentogeneral.setsDetalleGeneralEntityReporte(TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneral));
										
						
					
						
					
				} else  {
							
					//tipodocumentogeneral.setsDetalleGeneralEntityReporte(tipodocumentogeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodocumentogeneralbeans.add(tipodocumentogeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodocumentogenerals;
    }
	//PARA REPORTES FIN
}
