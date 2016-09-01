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
import com.bydan.erp.inventario.util.TipoConversionInvenConstantesFunciones;

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
public class TipoConversionInvenJInternalFrame extends TipoConversionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoConversionInven;
	
	protected JMenuBar jmenuBarTipoConversionInven;
	
	protected JMenu jmenuTipoConversionInven;
	protected JMenu jmenuDatosTipoConversionInven;
	protected JMenu jmenuArchivoTipoConversionInven;
	protected JMenu jmenuAccionesTipoConversionInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConversionInven;	
	protected GridBagConstraints gridBagConstraintsTipoConversionInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoConversionInvenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoConversionInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoConversionInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoConversionInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoConversionInvenSessionBean tipoconversioninvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoConversionInven> tipoconversioninvens;		
	public List<TipoConversionInven> tipoconversioninvensEliminados;	
	public List<TipoConversionInven> tipoconversioninvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoConversionInven;		
	protected JButton jButtonAbrirOrderByTipoConversionInven;
	
	
	//protected JPanel jPanelOrderByTipoConversionInven;
	//public JScrollPane jScrollPanelOrderByTipoConversionInven;	
	//protected JButton jButtonCerrarOrderByTipoConversionInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoConversionInvenLogic tipoconversioninvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoConversionInven;
	public JScrollPane jScrollPanelDatosEdicionTipoConversionInven;
	public JScrollPane jScrollPanelDatosGeneralTipoConversionInven;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoConversionInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoConversionInven;
	//public JScrollPane jScrollPanelImportacionTipoConversionInven;
	
	
	
	protected JPanel jPanelAccionesTipoConversionInven;
	
    protected JPanel jPanelPaginacionTipoConversionInven;
    protected JPanel jPanelParametrosReportesTipoConversionInven;
	protected JPanel jPanelParametrosReportesAccionesTipoConversionInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoConversionInven;
	protected JPanel jPanelParametrosAuxiliar2TipoConversionInven;
	protected JPanel jPanelParametrosAuxiliar3TipoConversionInven;
	protected JPanel jPanelParametrosAuxiliar4TipoConversionInven;
	//protected JPanel jPanelParametrosAuxiliar5TipoConversionInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoConversionInven;
	//protected JPanel jPanelImportacionTipoConversionInven;
	
	
	public JTable jTableDatosTipoConversionInven;
	
	
	
	//public JTable jTableDatosTipoConversionInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoConversionInven;
	protected JButton jButtonDuplicarTipoConversionInven;
	protected JButton jButtonCopiarTipoConversionInven;
	protected JButton jButtonVerFormTipoConversionInven;
	protected JButton jButtonNuevoRelacionesTipoConversionInven;
	protected JButton jButtonModificarTipoConversionInven;
	
    protected JButton jButtonGuardarCambiosTablaTipoConversionInven;
	protected JButton jButtonCerrarTipoConversionInven;
	
	
	protected JButton jButtonRecargarInformacionTipoConversionInven;
	protected JButton jButtonProcesarInformacionTipoConversionInven;
	
	
	protected JButton jButtonAnterioresTipoConversionInven;
	protected JButton jButtonSiguientesTipoConversionInven;
	protected JButton jButtonNuevoGuardarCambiosTipoConversionInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoConversionInven;
	//protected JButton jButtonCerrarReporteDinamicoTipoConversionInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoConversionInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoConversionInven;
	//protected JButton jButtonGenerarImportacionTipoConversionInven;
	//protected JButton jButtonCerrarImportacionTipoConversionInven;
	//protected JFileChooser jFileChooserImportacionTipoConversionInven;
	//protected File fileImportacionTipoConversionInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConversionInven;
	protected JButton jButtonDuplicarToolBarTipoConversionInven;
	protected JButton jButtonNuevoRelacionesToolBarTipoConversionInven;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoConversionInven;
	protected JButton jButtonCopiarToolBarTipoConversionInven;
	protected JButton jButtonVerFormToolBarTipoConversionInven;
	public JButton jButtonGuardarCambiosTablaToolBarTipoConversionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConversionInven;
	protected JButton jButtonCerrarToolBarTipoConversionInven;
	
	protected JButton jButtonRecargarInformacionToolBarTipoConversionInven;
	protected JButton jButtonProcesarInformacionToolBarTipoConversionInven;
	protected JButton jButtonAnterioresToolBarTipoConversionInven;
	protected JButton jButtonSiguientesToolBarTipoConversionInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoConversionInven;
	protected JButton jButtonAbrirOrderByToolBarTipoConversionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConversionInven;
	protected JMenuItem jMenuItemDuplicarTipoConversionInven;
	protected JMenuItem jMenuItemNuevoRelacionesTipoConversionInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoConversionInven;
	protected JMenuItem jMenuItemCopiarTipoConversionInven;
	protected JMenuItem jMenuItemVerFormTipoConversionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConversionInven;
	protected JMenuItem jMenuItemCerrarTipoConversionInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoConversionInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoConversionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConversionInven;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoConversionInven;
	protected JMenuItem jMenuItemProcesarInformacionTipoConversionInven;
	protected JMenuItem jMenuItemAnterioresTipoConversionInven;
	protected JMenuItem jMenuItemSiguientesTipoConversionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConversionInven;
	protected JMenuItem jMenuItemAbrirOrderByTipoConversionInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoConversionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConversionInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoConversionInven;
	protected JCheckBox jCheckBoxSeleccionadosTipoConversionInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoConversionInven;
	protected JCheckBox jCheckBoxConGraficoReporteTipoConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoConversionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConversionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoConversionInven;
	protected JTextField jTextFieldValorCampoGeneralTipoConversionInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoConversionInven;
	//public JList<Reporte> jListColumnasSelectReporteTipoConversionInven;
	//public JScrollPane jScrollColumnasSelectReporteTipoConversionInven;
	
	//public JLabel jLabelRelacionesSelectReporteTipoConversionInven;
	//public JList<Reporte> jListRelacionesSelectReporteTipoConversionInven;
	//public JScrollPane jScrollRelacionesSelectReporteTipoConversionInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoConversionInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoConversionInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoConversionInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoConversionInven;
	
		
	//public JLabel jLabelArchivoImportacionTipoConversionInven;	
	//public JLabel jLabelPathArchivoImportacionTipoConversionInven;
	//protected JTextField jTextFieldPathArchivoImportacionTipoConversionInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoConversionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoConversionInven;
	
	//public JLabel jLabelColumnaCategoriaValorTipoConversionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoConversionInven;
	
	//public JLabel jLabelColumnasValoresGraficoTipoConversionInven;
	//public JList<Reporte> jListColumnasValoresGraficoTipoConversionInven;
	//public JScrollPane jScrollColumnasValoresGraficoTipoConversionInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoConversionInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoConversionInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoConversionInven;
	public JPanel jPanelBusquedaPorCodigoTipoConversionInven;
	public JButton jButtonBusquedaPorCodigoTipoConversionInven;
	public JPanel jPanelBusquedaPorNombreTipoConversionInven;
	public JButton jButtonBusquedaPorNombreTipoConversionInven;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoConversionInven;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoConversionInven;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoConversionInven;
	public JButton jButtoncodigoBusquedaPorCodigoTipoConversionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoConversionInven;
	public JLabel jLabelnombreBusquedaPorNombreTipoConversionInven;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoConversionInven;
	public JButton jButtonnombreBusquedaPorNombreTipoConversionInvenBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoConversionInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoConversionInven)	{
		this.jButtonRecargarInformacionTipoConversionInven = jButtonRecargarInformacionTipoConversionInven;
	}
	
	public JButton getjButtonProcesarInformacionTipoConversionInven() {
		return this.jButtonProcesarInformacionTipoConversionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConversionInven)	{
		this.jButtonProcesarInformacionTipoConversionInven = jButtonProcesarInformacionTipoConversionInven;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoConversionInven() {
		return this.jButtonRecargarInformacionTipoConversionInven;
	}
	
	
	public List<TipoConversionInven> gettipoconversioninvens() {
		return this.tipoconversioninvens;
	}

	public void settipoconversioninvens(List<TipoConversionInven> tipoconversioninvens) {
		this.tipoconversioninvens = tipoconversioninvens;
	}
	
	public List<TipoConversionInven> gettipoconversioninvensAux() {
		return this.tipoconversioninvensAux;
	}

	public void settipoconversioninvensAux(List<TipoConversionInven> tipoconversioninvensAux) {
		this.tipoconversioninvensAux = tipoconversioninvensAux;
	}
	
	public List<TipoConversionInven> gettipoconversioninvensEliminados() {
		return this.tipoconversioninvensEliminados;
	}

	public void setTipoConversionInvensEliminados(List<TipoConversionInven> tipoconversioninvensEliminados) {
		this.tipoconversioninvensEliminados = tipoconversioninvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoConversionInven() {
		return jComboBoxTiposSeleccionarTipoConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoConversionInven(
			JComboBox jComboBoxTiposSeleccionarTipoConversionInven) {
		this.jComboBoxTiposSeleccionarTipoConversionInven = jComboBoxTiposSeleccionarTipoConversionInven;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoConversionInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoConversionInven() {
		return jTextFieldValorCampoGeneralTipoConversionInven;
	}

	public void setjTextFieldValorCampoGeneralTipoConversionInven(
			JTextField jTextFieldValorCampoGeneralTipoConversionInven) {
		this.jTextFieldValorCampoGeneralTipoConversionInven = jTextFieldValorCampoGeneralTipoConversionInven;
	}

	public void setBorderResaltarValorCampoGeneralTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoConversionInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoConversionInven() {
		return this.jCheckBoxSeleccionarTodosTipoConversionInven;
	}

	public void setjCheckBoxSeleccionarTodosTipoConversionInven(
			JCheckBox jCheckBoxSeleccionarTodosTipoConversionInven) {
		this.jCheckBoxSeleccionarTodosTipoConversionInven = jCheckBoxSeleccionarTodosTipoConversionInven;
	}

	public void setBorderResaltarSeleccionarTodosTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoConversionInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoConversionInven() {
		return this.jCheckBoxSeleccionadosTipoConversionInven;
	}

	public void setjCheckBoxSeleccionadosTipoConversionInven(
			JCheckBox jCheckBoxSeleccionadosTipoConversionInven) {
		this.jCheckBoxSeleccionadosTipoConversionInven = jCheckBoxSeleccionadosTipoConversionInven;
	}
	
	public void setBorderResaltarSeleccionadosTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoConversionInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoConversionInven() {
		return this.jComboBoxTiposArchivosReportesTipoConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoConversionInven(
			JComboBox jComboBoxTiposArchivosReportesTipoConversionInven) {
		this.jComboBoxTiposArchivosReportesTipoConversionInven = jComboBoxTiposArchivosReportesTipoConversionInven;
	}

	public void setBorderResaltarTiposArchivosReportesTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoConversionInven() {
		return this.jComboBoxTiposReportesTipoConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoConversionInven(
			JComboBox jComboBoxTiposReportesTipoConversionInven) {
		this.jComboBoxTiposReportesTipoConversionInven = jComboBoxTiposReportesTipoConversionInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoConversionInven() {
	//	return jComboBoxTiposReportesDinamicoTipoConversionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoConversionInven(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoConversionInven) {
	//	this.jComboBoxTiposReportesDinamicoTipoConversionInven = jComboBoxTiposReportesDinamicoTipoConversionInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoConversionInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoConversionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoConversionInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConversionInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven = jComboBoxTiposArchivosReportesDinamicoTipoConversionInven;
	//}
	
	public void setBorderResaltarTiposReportesTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoConversionInven() {
		return this.jComboBoxTiposGraficosReportesTipoConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoConversionInven(
			JComboBox jComboBoxTiposGraficosReportesTipoConversionInven) {
		this.jComboBoxTiposGraficosReportesTipoConversionInven = jComboBoxTiposGraficosReportesTipoConversionInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoConversionInven() {
		return this.jComboBoxTiposPaginacionTipoConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoConversionInven(
			JComboBox jComboBoxTiposPaginacionTipoConversionInven) {
		this.jComboBoxTiposPaginacionTipoConversionInven = jComboBoxTiposPaginacionTipoConversionInven;
	}
	
	public void setBorderResaltarTiposPaginacionTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoConversionInven() {
		return this.jComboBoxTiposRelacionesTipoConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConversionInven() {
		return this.jComboBoxTiposAccionesTipoConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConversionInven(
			JComboBox jComboBoxTiposRelacionesTipoConversionInven) {
		this.jComboBoxTiposRelacionesTipoConversionInven = jComboBoxTiposRelacionesTipoConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConversionInven(
			JComboBox jComboBoxTiposAccionesTipoConversionInven) {
		this.jComboBoxTiposAccionesTipoConversionInven = jComboBoxTiposAccionesTipoConversionInven;
	}
	
	public void setBorderResaltarTiposRelacionesTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoConversionInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoConversionInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoConversionInven() {
	//	return jCheckBoxConGraficoDinamicoTipoConversionInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoConversionInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoConversionInven) {
	//	this.jCheckBoxConGraficoDinamicoTipoConversionInven = jCheckBoxConGraficoDinamicoTipoConversionInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoConversionInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoConversionInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoConversionInven .setBorder(borderResaltar);		
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
		this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		
		this.tipoconversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconversioninvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConversionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Conversion Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoConversionInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"nuevo","nuevo","Nuevo"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"duplicar","duplicar","Duplicar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"copiar","copiar","Copiar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"ver_form","ver_form","Ver"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"recargar","recargar","Recargar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoConversionInven,this.jTtoolBarTipoConversionInven,
							"cerrar","cerrar","Salir"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoConversionInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoConversionInven;
			
				this.jButtonProcesarInformacionToolBarTipoConversionInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoConversionInven;
				
		//protected JButton jButtonModificarToolBarTipoConversionInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoConversionInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoConversionInven=new JMenuMe("General");
		this.jmenuArchivoTipoConversionInven=new JMenuMe("Archivo");
		this.jmenuAccionesTipoConversionInven=new JMenuMe("Acciones");
		this.jmenuDatosTipoConversionInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConversionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConversionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConversionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoConversionInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoConversionInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoConversionInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoConversionInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoConversionInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoConversionInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoConversionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConversionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConversionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoConversionInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoConversionInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoConversionInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoConversionInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoConversionInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoConversionInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoConversionInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoConversionInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoConversionInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoConversionInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoConversionInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoConversionInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoConversionInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoConversionInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoConversionInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoConversionInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoConversionInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoConversionInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoConversionInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoConversionInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoConversionInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoConversionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoConversionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoConversionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoConversionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoConversionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoConversionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoConversionInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoConversionInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoConversionInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoConversionInven.add(this.jMenuItemCerrarTipoConversionInven);
			
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemNuevoTipoConversionInven);
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemNuevoGuardarCambiosTipoConversionInven);
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemNuevoRelacionesTipoConversionInven);
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemGuardarCambiosTablaTipoConversionInven);		
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemDuplicarTipoConversionInven);		
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemCopiarTipoConversionInven);		
			this.jmenuAccionesTipoConversionInven.add(this.jMenuItemVerFormTipoConversionInven);		
			
			this.jmenuDatosTipoConversionInven.add(this.jMenuItemRecargarInformacionTipoConversionInven);				
			this.jmenuDatosTipoConversionInven.add(this.jMenuItemAnterioresTipoConversionInven);				
			this.jmenuDatosTipoConversionInven.add(this.jMenuItemSiguientesTipoConversionInven);				
			this.jmenuDatosTipoConversionInven.add(this.jMenuItemAbrirOrderByTipoConversionInven);				
			this.jmenuDatosTipoConversionInven.add(this.jMenuItemMostrarOcultarTipoConversionInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoConversionInven.add(this.jMenuItemGuardarCambiosTipoConversionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoConversionInven.add(this.jmenuArchivoTipoConversionInven);		
			this.jmenuBarTipoConversionInven.add(this.jmenuAccionesTipoConversionInven);		
			this.jmenuBarTipoConversionInven.add(this.jmenuDatosTipoConversionInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoConversionInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoConversionInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoConversionInven.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoConversionInven= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoConversionInven.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoConversionInven.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoConversionInven,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoConversionInven = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoConversionInven.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoConversionInven.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoConversionInven= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoConversionInven.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoConversionInven= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoConversionInven.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoConversionInven.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoConversionInven,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoConversionInven = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoConversionInven.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoConversionInven.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoConversionInven= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoConversionInven=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoConversionInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoConversionInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoConversionInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoConversionInven = new TipoConversionInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Conversion Inven DATOS");
			this.jInternalFrameDetalleFormTipoConversionInven = new TipoConversionInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoconversioninvenSessionBean.getConGuardarRelaciones(),this.tipoconversioninvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoConversionInven = null;//new TipoConversionInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConversionInven= new GridBagLayout();
		
		
		this.jTableDatosTipoConversionInven = new JTableMe();      
		
		String sToolTipTipoConversionInven="";
		sToolTipTipoConversionInven=TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConversionInven+="(Inventario.TipoConversionInven)";
		}
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConversionInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoConversionInven.setToolTipText(sToolTipTipoConversionInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoConversionInven);
		this.jTableDatosTipoConversionInven.setAutoCreateRowSorter(true);
		this.jTableDatosTipoConversionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoConversionInven.setRowSelectionAllowed(true);
		this.jTableDatosTipoConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoConversionInven = new JButtonMe();
		this.jButtonDuplicarTipoConversionInven = new JButtonMe();
		this.jButtonCopiarTipoConversionInven = new JButtonMe();
		this.jButtonVerFormTipoConversionInven = new JButtonMe();
		this.jButtonNuevoRelacionesTipoConversionInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoConversionInven = new JButtonMe();
		this.jButtonCerrarTipoConversionInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoConversionInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoConversionInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Conversion Inven";
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoConversionInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoConversionInven=new ReporteDinamicoJInternalFrame(TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoConversionInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoConversionInven=new ImportacionJInternalFrame(TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoConversionInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoConversionInven = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoConversionInven.setText("Orden");
		this.jButtonAbrirOrderByTipoConversionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConversionInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConversionInven,false,this);
			
			//this.cargarOrderByTipoConversionInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConversionInven,true,this);
			
			//this.cargarOrderByTipoConversionInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoConversionInven.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConversionInven.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConversionInven.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoConversionInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConversionInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConversionInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoConversionInven.setText("Nuevo");
		this.jButtonDuplicarTipoConversionInven.setText("Duplicar");
		this.jButtonCopiarTipoConversionInven.setText("Copiar");
		this.jButtonVerFormTipoConversionInven.setText("Ver");
		this.jButtonNuevoRelacionesTipoConversionInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.setText("Guardar");
		this.jButtonCerrarTipoConversionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConversionInven,"nuevo_button","Nuevo",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoConversionInven,"duplicar_button","Duplicar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoConversionInven,"copiar_button","Copiar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoConversionInven,"ver_form","Ver",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoConversionInven,"nuevorelaciones_button","Nuevo Rel",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConversionInven,"guardarcambiostabla_button","Guardar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConversionInven,"cerrar_button","Salir",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoConversionInven.setToolTipText("Nuevo"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoConversionInven.setToolTipText("Duplicar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoConversionInven.setToolTipText("Copiar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoConversionInven.setToolTipText("Ver"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoConversionInven.setToolTipText("Nuevo Rel"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.setToolTipText("Guardar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConversionInven.setToolTipText("Salir"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConversionInven";
		inputMap = this.jButtonNuevoTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConversionInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoConversionInven";
		inputMap = this.jButtonDuplicarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoConversionInven"));
		
		//COPIAR
		sMapKey = "CopiarTipoConversionInven";
		inputMap = this.jButtonCopiarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoConversionInven"));
		
		//VEr FORM
		sMapKey = "VerFormTipoConversionInven";
		inputMap = this.jButtonVerFormTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoConversionInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoConversionInven";
		inputMap = this.jButtonNuevoRelacionesTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoConversionInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoConversionInven";
		inputMap = this.jButtonModificarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoConversionInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoConversionInven";
		inputMap = this.jButtonCerrarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConversionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConversionInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConversionInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoConversionInven.setName("jPanelParametrosReportesTipoConversionInven"); 
		
		this.jPanelParametrosReportesAccionesTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoConversionInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoConversionInven.setName("jPanelParametrosReportesAccionesTipoConversionInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoConversionInven = new JButtonMe();
		this.jButtonRecargarInformacionTipoConversionInven.setText("Recargar");
		this.jButtonRecargarInformacionTipoConversionInven.setToolTipText("Recargar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoConversionInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoConversionInven = new JButtonMe();
		this.jButtonProcesarInformacionTipoConversionInven.setText("Procesar");
		this.jButtonProcesarInformacionTipoConversionInven.setToolTipText("Procesar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoConversionInven.setVisible(false);
			
		this.jButtonProcesarInformacionTipoConversionInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConversionInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConversionInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConversionInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoConversionInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConversionInven.setText("TIPO");       
		this.jComboBoxTiposReportesTipoConversionInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConversionInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoConversionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoConversionInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoConversionInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoConversionInven.setText("Accion");
		this.jComboBoxTiposRelacionesTipoConversionInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConversionInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoConversionInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoConversionInven.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoConversionInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoConversionInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoConversionInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConversionInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConversionInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoConversionInven = new JLabelMe();
		
		this.jLabelAccionesTipoConversionInven.setText("Acciones");		
		this.jLabelAccionesTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoConversionInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoConversionInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoConversionInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoConversionInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoConversionInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoConversionInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoConversionInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoConversionInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoConversionInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoConversionInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoConversionInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoConversionInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoConversionInven = new JButtonMe();
		//this.jButtonAnterioresTipoConversionInven.setText("<<");
        this.jButtonAnterioresTipoConversionInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoConversionInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoConversionInven = new JButtonMe();
		//this.jButtonSiguientesTipoConversionInven.setText(">>");
        this.jButtonSiguientesTipoConversionInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoConversionInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoConversionInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoConversionInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoConversionInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoConversionInven,"nuevoguardarcambios_button","Nue",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoConversionInven";
		inputMap = this.jButtonNuevoGuardarCambiosTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoConversionInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoConversionInven";
		inputMap = this.jButtonRecargarInformacionTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoConversionInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoConversionInven";
		inputMap = this.jButtonSiguientesTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoConversionInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoConversionInven";
		inputMap = this.jButtonAnterioresTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoConversionInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoConversionInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoConversionInven.setMinimumSize(new Dimension(this.getWidth(),TipoConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConversionInven.setMaximumSize(new Dimension(this.getWidth(),TipoConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConversionInven.setPreferredSize(new Dimension(this.getWidth(),TipoConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoConversionInven = new GridBagLayout();

			this.jPanelPaginacionTipoConversionInven.setLayout(gridaBagLayoutPaginacionTipoConversionInven);						
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 0;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonAnterioresTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					
						
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConversionInven.gridy = 0;
			
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonNuevoGuardarCambiosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
						
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConversionInven.gridy = 0;
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonSiguientesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 1;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonNuevoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
				this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConversionInven.gridy = 1;
				this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoConversionInven.add(this.jButtonNuevoRelacionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			}
			
			
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
				this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConversionInven.gridy = 1;
				this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoConversionInven.add(this.jButtonGuardarCambiosTablaTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			}
			
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 1;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonDuplicarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 1;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonCopiarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 1;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonVerFormTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 1;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoConversionInven.add(this.jButtonCerrarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
		
		
		this.jButtonRecargarInformacionTipoConversionInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConversionInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConversionInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoConversionInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConversionInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConversionInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoConversionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConversionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConversionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoConversionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConversionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConversionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoConversionInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConversionInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConversionInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoConversionInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConversionInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConversionInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoConversionInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConversionInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConversionInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoConversionInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConversionInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConversionInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoConversionInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoConversionInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoConversionInven.setLayout(gridaBagParametrosReportesTipoConversionInven);
			this.jPanelParametrosReportesAccionesTipoConversionInven.setLayout(gridaBagParametrosReportesAccionesTipoConversionInven);
			
			
			this.jPanelParametrosAuxiliar1TipoConversionInven.setLayout(gridaBagParametrosAuxiliar1TipoConversionInven);
			this.jPanelParametrosAuxiliar2TipoConversionInven.setLayout(gridaBagParametrosAuxiliar2TipoConversionInven);
			this.jPanelParametrosAuxiliar3TipoConversionInven.setLayout(gridaBagParametrosAuxiliar3TipoConversionInven);
			this.jPanelParametrosAuxiliar4TipoConversionInven.setLayout(gridaBagParametrosAuxiliar4TipoConversionInven);
			//this.jPanelParametrosAuxiliar5TipoConversionInven.setLayout(gridaBagParametrosAuxiliar2TipoConversionInven);			
			
			
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConversionInven.add(this.jButtonRecargarInformacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConversionInven.add(this.jComboBoxTiposPaginacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConversionInven.add(this.jCheckBoxConAltoMaximoTablaTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConversionInven.add(this.jComboBoxTiposArchivosReportesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConversionInven.add(this.jPanelParametrosAuxiliar1TipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoConversionInven.add(this.jComboBoxTiposReportesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConversionInven.add(this.jPanelParametrosAuxiliar4TipoConversionInven, this.gridBagConstraintsTipoConversionInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConversionInven.add(this.jComboBoxTiposReportesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConversionInven.add(this.jCheckBoxGenerarReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConversionInven.add(this.jPanelParametrosAuxiliar2TipoConversionInven, this.gridBagConstraintsTipoConversionInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConversionInven.add(this.jLabelAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
				this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoConversionInven.add(this.jButtonAbrirOrderByTipoConversionInven, this.gridBagConstraintsTipoConversionInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConversionInven.add(this.jComboBoxTiposSeleccionarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			
			
			/*
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConversionInven.add(this.jCheckBoxSeleccionarTodosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConversionInven.add(this.jCheckBoxSeleccionarTodosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);															
				
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConversionInven.add(this.jCheckBoxSeleccionadosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConversionInven.add(this.jPanelParametrosAuxiliar3TipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConversionInven.add(this.jComboBoxTiposRelacionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
				
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConversionInven.add(this.jComboBoxTiposAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
	
				
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConversionInven.add(this.jTextFieldValorCampoGeneralTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoConversionInven = new GridBagLayout();

			this.jScrollPanelDatosTipoConversionInven.setLayout(gridaBagLayoutDatosTipoConversionInven);
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = 0;
			this.gridBagConstraintsTipoConversionInven.gridx = 0;
			
			this.jScrollPanelDatosTipoConversionInven.add(this.jTableDatosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoConversionInven.setViewportView(this.jTableDatosTipoConversionInven);
		this.jTableDatosTipoConversionInven.setFillsViewportHeight(true);
		this.jTableDatosTipoConversionInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoConversionInven= new GridBagLayout();
		this.jPanelAccionesTipoConversionInven.setLayout(gridaBagLayoutAccionesTipoConversionInven);
		
		
		/*	
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
			
		this.jPanelAccionesTipoConversionInven.add(this.jButtonNuevoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoConversionInven= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoConversionInven.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoConversionInven.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoConversionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoConversionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoConversionInven.setLayout(gridaBagLayoutBusquedaPorCodigoTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 0;
		gridBagConstraintsTipoConversionInven.gridx = 0;
		jPanelBusquedaPorCodigoTipoConversionInven.add(jLabelcodigoBusquedaPorCodigoTipoConversionInven, gridBagConstraintsTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 0;
		gridBagConstraintsTipoConversionInven.gridx = 1;
		jPanelBusquedaPorCodigoTipoConversionInven.add(jTextFieldcodigoBusquedaPorCodigoTipoConversionInven, gridBagConstraintsTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 1;
		gridBagConstraintsTipoConversionInven.gridx =1;
		jPanelBusquedaPorCodigoTipoConversionInven.add(jButtonBusquedaPorCodigoTipoConversionInven, gridBagConstraintsTipoConversionInven);

		jTabbedPaneBusquedasTipoConversionInven.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoConversionInven);
		jTabbedPaneBusquedasTipoConversionInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoConversionInven= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoConversionInven.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoConversionInven.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoConversionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoConversionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoConversionInven.setLayout(gridaBagLayoutBusquedaPorNombreTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 0;
		gridBagConstraintsTipoConversionInven.gridx = 0;
		jPanelBusquedaPorNombreTipoConversionInven.add(jLabelnombreBusquedaPorNombreTipoConversionInven, gridBagConstraintsTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 0;
		gridBagConstraintsTipoConversionInven.gridx = 1;
		jPanelBusquedaPorNombreTipoConversionInven.add(jTextAreanombreBusquedaPorNombreTipoConversionInven, gridBagConstraintsTipoConversionInven);

		gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConversionInven.gridy = 1;
		gridBagConstraintsTipoConversionInven.gridx =1;
		jPanelBusquedaPorNombreTipoConversionInven.add(jButtonBusquedaPorNombreTipoConversionInven, gridBagConstraintsTipoConversionInven);

		jTabbedPaneBusquedasTipoConversionInven.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoConversionInven);
		jTabbedPaneBusquedasTipoConversionInven.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConversionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConversionInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConversionInven.gridx = 0;		
			//this.gridBagConstraintsTipoConversionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConversionInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoConversionInven.gridx = 0;		
		//this.gridBagConstraintsTipoConversionInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoConversionInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoConversionInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConversionInven.gridx = 0;		
			this.gridBagConstraintsTipoConversionInven.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoConversionInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoConversionInven, this.gridBagConstraintsTipoConversionInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);								
		
		
		/*
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		*/		
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConversionInven.gridx =0;
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConversionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
				
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConversionInven = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoConversionInven.setLayout(gridaBagLayoutBusquedasParametrosTipoConversionInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoConversionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoConversionInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoConversionInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoConversionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoConversionInven.setName("jPanelReporteDinamicoTipoConversionInven"); 
		
		this.jPanelReporteDinamicoTipoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoConversionInven.setLayout(gridaBagLayoutReporteDinamicoTipoConversionInven);
		
		
		this.jInternalFrameReporteDinamicoTipoConversionInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoConversionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConversionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoConversionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoConversionInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoConversionInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoConversionInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoConversionInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoConversionInven = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoConversionInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jLabelColumnasSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoConversionInven = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoConversionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoConversionInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConversionInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConversionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoConversionInven=new JScrollPane(this.jListColumnasSelectReporteTipoConversionInven);
			
			this.jScrollColumnasSelectReporteTipoConversionInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConversionInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConversionInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConversionInven.add(this.jListColumnasSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jScrollColumnasSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoConversionInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoConversionInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jLabelRelacionesSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoConversionInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoConversionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoConversionInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConversionInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConversionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoConversionInven=new JScrollPane(this.jListRelacionesSelectReporteTipoConversionInven);
			
			this.jScrollRelacionesSelectReporteTipoConversionInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConversionInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConversionInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConversionInven.add(this.jListRelacionesSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jScrollRelacionesSelectReporteTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoConversionInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoConversionInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoConversionInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoConversionInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoConversionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoConversionInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoConversionInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jLabelGenerarExcelReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoConversionInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoConversionInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoConversionInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoConversionInven.setToolTipText("Generar EXCEL"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoConversionInven.add(this.jButtonGenerarExcelReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jComboBoxTiposReportesDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoConversionInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoConversionInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jLabelTiposArchivoReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jComboBoxTiposArchivosReportesDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoConversionInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoConversionInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoConversionInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoConversionInven.setToolTipText("Generar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jButtonGenerarReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoConversionInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoConversionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoConversionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoConversionInven.setToolTipText("Cancelar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConversionInven.add(this.jButtonCerrarReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoConversionInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoConversionInven= new JScrollPane(jPanelReporteDinamicoTipoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoConversionInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoConversionInven);
		this.jInternalFrameReporteDinamicoTipoConversionInven.getContentPane().add(this.jScrollPanelReporteDinamicoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoConversionInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoConversionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoConversionInven.setName("jPanelImportacionTipoConversionInven"); 
		
		this.jPanelImportacionTipoConversionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConversionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConversionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoConversionInven.setLayout(gridaBagLayoutImportacionTipoConversionInven);
		
		
		this.jInternalFrameImportacionTipoConversionInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoConversionInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoConversionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConversionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConversionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoConversionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConversionInven.setResizable(true);
	    this.jInternalFrameImportacionTipoConversionInven.setClosable(true);
	    this.jInternalFrameImportacionTipoConversionInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConversionInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoConversionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConversionInven.setResizable(true);
	    this.jInternalFrameImportacionTipoConversionInven.setClosable(true);
	    this.jInternalFrameImportacionTipoConversionInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoConversionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConversionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConversionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoConversionInven = new JLabelMe();

		this.jLabelArchivoImportacionTipoConversionInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConversionInven.add(this.jLabelArchivoImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoConversionInven = new JFileChooser();		
		this.jFileChooserImportacionTipoConversionInven.setToolTipText("ESCOGER ARCHIVO"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoConversionInven = new JButtonMe();
		this.jButtonAbrirImportacionTipoConversionInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoConversionInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoConversionInven.setToolTipText("Generar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConversionInven.add(this.jButtonAbrirImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoConversionInven = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoConversionInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConversionInven.add(this.jLabelPathArchivoImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoConversionInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoConversionInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConversionInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConversionInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConversionInven.add(this.jTextFieldPathArchivoImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoConversionInven = new JButtonMe();
		this.jButtonGenerarImportacionTipoConversionInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoConversionInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoConversionInven.setToolTipText("Generar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConversionInven.add(this.jButtonGenerarImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoConversionInven = new JButtonMe();
		this.jButtonCerrarImportacionTipoConversionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoConversionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoConversionInven.setToolTipText("Cancelar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConversionInven.add(this.jButtonCerrarImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoConversionInven = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoConversionInven= new JScrollPane(jPanelImportacionTipoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoConversionInven.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoConversionInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoConversionInven);
		this.jInternalFrameImportacionTipoConversionInven.getContentPane().add(this.jScrollPanelImportacionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoConversionInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoConversionInven = new JButtonMe();
			this.jButtonAbrirOrderByTipoConversionInven.setText("Orden");
			this.jButtonAbrirOrderByTipoConversionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConversionInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoConversionInven";
			inputMap = this.jButtonAbrirOrderByTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoConversionInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoConversionInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoConversionInven.setName("jPanelOrderByTipoConversionInven"); 
			
			this.jPanelOrderByTipoConversionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConversionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConversionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoConversionInven.setLayout(gridaBagLayoutOrderByTipoConversionInven);
			
			
			this.jTableDatosTipoConversionInvenOrderBy = new JTableMe();        
			this.jTableDatosTipoConversionInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoConversionInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoConversionInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoConversionInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoConversionInvenOrderBy.setViewportView(this.jTableDatosTipoConversionInvenOrderBy);
			this.jTableDatosTipoConversionInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoConversionInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoConversionInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoConversionInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoConversionInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoConversionInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoConversionInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoConversionInven.setTitle("Orden");
			this.jInternalFrameOrderByTipoConversionInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoConversionInven.setResizable(true);
			this.jInternalFrameOrderByTipoConversionInven.setClosable(true);
			this.jInternalFrameOrderByTipoConversionInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoConversionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConversionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConversionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoConversionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoConversionInven.ipady =150;
				
			this.jPanelOrderByTipoConversionInven.add(jScrollPanelDatosTipoConversionInvenOrderBy, this.gridBagConstraintsTipoConversionInven);//this.jTableDatosTipoConversionInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoConversionInven = new JButtonMe();
			this.jButtonCerrarOrderByTipoConversionInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoConversionInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoConversionInven.setToolTipText("Cancelar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoConversionInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoConversionInven.add(this.jButtonCerrarOrderByTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoConversionInven = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoConversionInven= new JScrollPane(jPanelOrderByTipoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoConversionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoConversionInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoConversionInven);
			
			this.jInternalFrameOrderByTipoConversionInven.getContentPane().add(this.jScrollPanelOrderByTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
		
		} else {
			this.jButtonAbrirOrderByTipoConversionInven = new JButtonMe();
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
			&& this.tipoconversioninvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoConversionInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoConversionInven.getRowHeight();//TipoConversionInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConversionInven.isSelected()) {
					iHeightTable=TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConversionInven.isSelected()) {
					iHeightTable=TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoConversionInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConversionInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConversionInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoConversionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConversionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConversionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoConversionInven!=null && this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoConversionInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoConversionInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoConversionInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoConversionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConversionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConversionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoconversioninvenLogic.getTipoConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconversioninvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoConversionInven> TraerTipoConversionInvenBeans(List<TipoConversionInven> tipoconversioninvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoConversionInven tipoconversioninven:tipoconversioninvens) {
					
				if(!(TipoConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoconversioninven.setsDetalleGeneralEntityReporte(TipoConversionInvenConstantesFunciones.getTipoConversionInvenDescripcion(tipoconversioninven));
										
						
					
					

					if(tipoconversioninven.getConversionInvens()!=null && Funciones.existeClass(classes,ConversionInven.class)) {
						try{tipoconversioninven.setconversioninvensDescripcionReporte(new JRBeanCollectionDataSource(ConversionInvenJInternalFrame.TraerConversionInvenBeans(tipoconversioninven.getConversionInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoconversioninven.setsDetalleGeneralEntityReporte(tipoconversioninven.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoconversioninvenbeans.add(tipoconversioninvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoconversioninvens;
    }
	//PARA REPORTES FIN
}
