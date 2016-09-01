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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoMermaEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoMermaEmpresaJInternalFrame extends TipoMermaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMermaEmpresa;
	
	protected JMenuBar jmenuBarTipoMermaEmpresa;
	
	protected JMenu jmenuTipoMermaEmpresa;
	protected JMenu jmenuDatosTipoMermaEmpresa;
	protected JMenu jmenuArchivoTipoMermaEmpresa;
	protected JMenu jmenuAccionesTipoMermaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMermaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoMermaEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMermaEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMermaEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMermaEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMermaEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMermaEmpresa> tipomermaempresas;		
	public List<TipoMermaEmpresa> tipomermaempresasEliminados;	
	public List<TipoMermaEmpresa> tipomermaempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMermaEmpresa;		
	protected JButton jButtonAbrirOrderByTipoMermaEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoMermaEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoMermaEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoMermaEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMermaEmpresaLogic tipomermaempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMermaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoMermaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoMermaEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMermaEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMermaEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoMermaEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoMermaEmpresa;
	
    protected JPanel jPanelPaginacionTipoMermaEmpresa;
    protected JPanel jPanelParametrosReportesTipoMermaEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoMermaEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMermaEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoMermaEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoMermaEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoMermaEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoMermaEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMermaEmpresa;
	//protected JPanel jPanelImportacionTipoMermaEmpresa;
	
	
	public JTable jTableDatosTipoMermaEmpresa;
	
	
	
	//public JTable jTableDatosTipoMermaEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMermaEmpresa;
	protected JButton jButtonDuplicarTipoMermaEmpresa;
	protected JButton jButtonCopiarTipoMermaEmpresa;
	protected JButton jButtonVerFormTipoMermaEmpresa;
	protected JButton jButtonNuevoRelacionesTipoMermaEmpresa;
	protected JButton jButtonModificarTipoMermaEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoMermaEmpresa;
	protected JButton jButtonCerrarTipoMermaEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoMermaEmpresa;
	protected JButton jButtonProcesarInformacionTipoMermaEmpresa;
	
	
	protected JButton jButtonAnterioresTipoMermaEmpresa;
	protected JButton jButtonSiguientesTipoMermaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoMermaEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMermaEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoMermaEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMermaEmpresa;
	//protected JButton jButtonGenerarImportacionTipoMermaEmpresa;
	//protected JButton jButtonCerrarImportacionTipoMermaEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoMermaEmpresa;
	//protected File fileImportacionTipoMermaEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMermaEmpresa;
	protected JButton jButtonDuplicarToolBarTipoMermaEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoMermaEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMermaEmpresa;
	protected JButton jButtonCopiarToolBarTipoMermaEmpresa;
	protected JButton jButtonVerFormToolBarTipoMermaEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMermaEmpresa;
	protected JButton jButtonCerrarToolBarTipoMermaEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMermaEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoMermaEmpresa;
	protected JButton jButtonAnterioresToolBarTipoMermaEmpresa;
	protected JButton jButtonSiguientesToolBarTipoMermaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoMermaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMermaEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoMermaEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMermaEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMermaEmpresa;
	protected JMenuItem jMenuItemCopiarTipoMermaEmpresa;
	protected JMenuItem jMenuItemVerFormTipoMermaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMermaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoMermaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoMermaEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMermaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMermaEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMermaEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoMermaEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoMermaEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoMermaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMermaEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoMermaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoMermaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMermaEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMermaEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoMermaEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMermaEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMermaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMermaEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoMermaEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMermaEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoMermaEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoMermaEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMermaEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMermaEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMermaEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMermaEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMermaEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoMermaEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoMermaEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMermaEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMermaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMermaEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMermaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMermaEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMermaEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMermaEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMermaEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMermaEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMermaEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMermaEmpresa;
	
	
	
	
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
	public TipoMermaEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMermaEmpresa)	{
		this.jButtonRecargarInformacionTipoMermaEmpresa = jButtonRecargarInformacionTipoMermaEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoMermaEmpresa() {
		return this.jButtonProcesarInformacionTipoMermaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMermaEmpresa)	{
		this.jButtonProcesarInformacionTipoMermaEmpresa = jButtonProcesarInformacionTipoMermaEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMermaEmpresa() {
		return this.jButtonRecargarInformacionTipoMermaEmpresa;
	}
	
	
	public List<TipoMermaEmpresa> gettipomermaempresas() {
		return this.tipomermaempresas;
	}

	public void settipomermaempresas(List<TipoMermaEmpresa> tipomermaempresas) {
		this.tipomermaempresas = tipomermaempresas;
	}
	
	public List<TipoMermaEmpresa> gettipomermaempresasAux() {
		return this.tipomermaempresasAux;
	}

	public void settipomermaempresasAux(List<TipoMermaEmpresa> tipomermaempresasAux) {
		this.tipomermaempresasAux = tipomermaempresasAux;
	}
	
	public List<TipoMermaEmpresa> gettipomermaempresasEliminados() {
		return this.tipomermaempresasEliminados;
	}

	public void setTipoMermaEmpresasEliminados(List<TipoMermaEmpresa> tipomermaempresasEliminados) {
		this.tipomermaempresasEliminados = tipomermaempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMermaEmpresa() {
		return jComboBoxTiposSeleccionarTipoMermaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMermaEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoMermaEmpresa) {
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa = jComboBoxTiposSeleccionarTipoMermaEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMermaEmpresa() {
		return jTextFieldValorCampoGeneralTipoMermaEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoMermaEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoMermaEmpresa) {
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa = jTextFieldValorCampoGeneralTipoMermaEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMermaEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoMermaEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoMermaEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoMermaEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa = jCheckBoxSeleccionarTodosTipoMermaEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMermaEmpresa() {
		return this.jCheckBoxSeleccionadosTipoMermaEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoMermaEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoMermaEmpresa) {
		this.jCheckBoxSeleccionadosTipoMermaEmpresa = jCheckBoxSeleccionadosTipoMermaEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMermaEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoMermaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMermaEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoMermaEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa = jComboBoxTiposArchivosReportesTipoMermaEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMermaEmpresa() {
		return this.jComboBoxTiposReportesTipoMermaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMermaEmpresa(
			JComboBox jComboBoxTiposReportesTipoMermaEmpresa) {
		this.jComboBoxTiposReportesTipoMermaEmpresa = jComboBoxTiposReportesTipoMermaEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMermaEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoMermaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMermaEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMermaEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa = jComboBoxTiposReportesDinamicoTipoMermaEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMermaEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoMermaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMermaEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoMermaEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa = jComboBoxTiposGraficosReportesTipoMermaEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMermaEmpresa() {
		return this.jComboBoxTiposPaginacionTipoMermaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMermaEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoMermaEmpresa) {
		this.jComboBoxTiposPaginacionTipoMermaEmpresa = jComboBoxTiposPaginacionTipoMermaEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMermaEmpresa() {
		return this.jComboBoxTiposRelacionesTipoMermaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMermaEmpresa() {
		return this.jComboBoxTiposAccionesTipoMermaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMermaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoMermaEmpresa) {
		this.jComboBoxTiposRelacionesTipoMermaEmpresa = jComboBoxTiposRelacionesTipoMermaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMermaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoMermaEmpresa) {
		this.jComboBoxTiposAccionesTipoMermaEmpresa = jComboBoxTiposAccionesTipoMermaEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMermaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMermaEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMermaEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoMermaEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMermaEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMermaEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoMermaEmpresa = jCheckBoxConGraficoDinamicoTipoMermaEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMermaEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMermaEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMermaEmpresa .setBorder(borderResaltar);		
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
		this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		
		this.tipomermaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomermaempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMermaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Merma Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMermaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMermaEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"copiar","copiar","Copiar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"recargar","recargar","Recargar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMermaEmpresa,this.jTtoolBarTipoMermaEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMermaEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMermaEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoMermaEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMermaEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoMermaEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMermaEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMermaEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoMermaEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMermaEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoMermaEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMermaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMermaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMermaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMermaEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMermaEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMermaEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMermaEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMermaEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMermaEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMermaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMermaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMermaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMermaEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMermaEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMermaEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMermaEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMermaEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMermaEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMermaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMermaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMermaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMermaEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMermaEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMermaEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMermaEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMermaEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMermaEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMermaEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMermaEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMermaEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMermaEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMermaEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMermaEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMermaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMermaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMermaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMermaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMermaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMermaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMermaEmpresa.add(this.jMenuItemCerrarTipoMermaEmpresa);
			
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemNuevoTipoMermaEmpresa);
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoMermaEmpresa);
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemNuevoRelacionesTipoMermaEmpresa);
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoMermaEmpresa);		
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemDuplicarTipoMermaEmpresa);		
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemCopiarTipoMermaEmpresa);		
			this.jmenuAccionesTipoMermaEmpresa.add(this.jMenuItemVerFormTipoMermaEmpresa);		
			
			this.jmenuDatosTipoMermaEmpresa.add(this.jMenuItemRecargarInformacionTipoMermaEmpresa);				
			this.jmenuDatosTipoMermaEmpresa.add(this.jMenuItemAnterioresTipoMermaEmpresa);				
			this.jmenuDatosTipoMermaEmpresa.add(this.jMenuItemSiguientesTipoMermaEmpresa);				
			this.jmenuDatosTipoMermaEmpresa.add(this.jMenuItemAbrirOrderByTipoMermaEmpresa);				
			this.jmenuDatosTipoMermaEmpresa.add(this.jMenuItemMostrarOcultarTipoMermaEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMermaEmpresa.add(this.jMenuItemGuardarCambiosTipoMermaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMermaEmpresa.add(this.jmenuArchivoTipoMermaEmpresa);		
			this.jmenuBarTipoMermaEmpresa.add(this.jmenuAccionesTipoMermaEmpresa);		
			this.jmenuBarTipoMermaEmpresa.add(this.jmenuDatosTipoMermaEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMermaEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMermaEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoMermaEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMermaEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMermaEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMermaEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMermaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMermaEmpresa = new TipoMermaEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Merma Empresa DATOS");
			this.jInternalFrameDetalleFormTipoMermaEmpresa = new TipoMermaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomermaempresaSessionBean.getConGuardarRelaciones(),this.tipomermaempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMermaEmpresa = null;//new TipoMermaEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMermaEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoMermaEmpresa = new JTableMe();      
		
		String sToolTipTipoMermaEmpresa="";
		sToolTipTipoMermaEmpresa=TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMermaEmpresa+="(Produccion.TipoMermaEmpresa)";
		}
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMermaEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMermaEmpresa.setToolTipText(sToolTipTipoMermaEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMermaEmpresa);
		this.jTableDatosTipoMermaEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMermaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMermaEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoMermaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMermaEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoMermaEmpresa = new JButtonMe();
		this.jButtonCopiarTipoMermaEmpresa = new JButtonMe();
		this.jButtonVerFormTipoMermaEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMermaEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoMermaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoMermaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMermaEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Merma Empresa";
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMermaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMermaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoMermaEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMermaEmpresa=new ReporteDinamicoJInternalFrame(TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMermaEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMermaEmpresa=new ImportacionJInternalFrame(TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMermaEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMermaEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMermaEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoMermaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMermaEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMermaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMermaEmpresa,false,this);
			
			//this.cargarOrderByTipoMermaEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMermaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMermaEmpresa,true,this);
			
			//this.cargarOrderByTipoMermaEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMermaEmpresa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMermaEmpresa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMermaEmpresa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoMermaEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMermaEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMermaEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMermaEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoMermaEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoMermaEmpresa.setText("Copiar");
		this.jButtonVerFormTipoMermaEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoMermaEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoMermaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMermaEmpresa,"nuevo_button","Nuevo",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMermaEmpresa,"duplicar_button","Duplicar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMermaEmpresa,"copiar_button","Copiar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMermaEmpresa,"ver_form","Ver",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMermaEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMermaEmpresa,"guardarcambiostabla_button","Guardar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMermaEmpresa,"cerrar_button","Salir",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMermaEmpresa.setToolTipText("Nuevo"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMermaEmpresa.setToolTipText("Duplicar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMermaEmpresa.setToolTipText("Copiar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMermaEmpresa.setToolTipText("Ver"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMermaEmpresa.setToolTipText("Nuevo Rel"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setToolTipText("Guardar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMermaEmpresa.setToolTipText("Salir"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMermaEmpresa";
		inputMap = this.jButtonNuevoTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMermaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMermaEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMermaEmpresa";
		inputMap = this.jButtonDuplicarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMermaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMermaEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoMermaEmpresa";
		inputMap = this.jButtonCopiarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMermaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMermaEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMermaEmpresa";
		inputMap = this.jButtonVerFormTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMermaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMermaEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMermaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMermaEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMermaEmpresa";
		inputMap = this.jButtonModificarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMermaEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMermaEmpresa";
		inputMap = this.jButtonCerrarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMermaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMermaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMermaEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMermaEmpresa.setName("jPanelParametrosReportesTipoMermaEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMermaEmpresa.setName("jPanelParametrosReportesAccionesTipoMermaEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMermaEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoMermaEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoMermaEmpresa.setToolTipText("Recargar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMermaEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMermaEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoMermaEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoMermaEmpresa.setToolTipText("Procesar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMermaEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMermaEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMermaEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMermaEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMermaEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMermaEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMermaEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMermaEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMermaEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMermaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMermaEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMermaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoMermaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMermaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMermaEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMermaEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMermaEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoMermaEmpresa.setText("<<");
        this.jButtonAnterioresTipoMermaEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMermaEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMermaEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoMermaEmpresa.setText(">>");
        this.jButtonSiguientesTipoMermaEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMermaEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMermaEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMermaEmpresa,"nuevoguardarcambios_button","Nue",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMermaEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMermaEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMermaEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMermaEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMermaEmpresa";
		inputMap = this.jButtonSiguientesTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMermaEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMermaEmpresa";
		inputMap = this.jButtonAnterioresTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMermaEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMermaEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMermaEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMermaEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMermaEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMermaEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoMermaEmpresa.setLayout(gridaBagLayoutPaginacionTipoMermaEmpresa);						
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonAnterioresTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					
						
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonNuevoGuardarCambiosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
						
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonSiguientesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonNuevoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
						
			
			
			if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
				this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonGuardarCambiosTablaTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonDuplicarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonCopiarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonVerFormTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMermaEmpresa.add(this.jButtonCerrarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoMermaEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMermaEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMermaEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMermaEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMermaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMermaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMermaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMermaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMermaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMermaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMermaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMermaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMermaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMermaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMermaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMermaEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMermaEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMermaEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMermaEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMermaEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMermaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMermaEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMermaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMermaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMermaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMermaEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMermaEmpresa.setLayout(gridaBagParametrosReportesTipoMermaEmpresa);
			this.jPanelParametrosReportesAccionesTipoMermaEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoMermaEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoMermaEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoMermaEmpresa);
			this.jPanelParametrosAuxiliar2TipoMermaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoMermaEmpresa);
			this.jPanelParametrosAuxiliar3TipoMermaEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoMermaEmpresa);
			this.jPanelParametrosAuxiliar4TipoMermaEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoMermaEmpresa);
			//this.jPanelParametrosAuxiliar5TipoMermaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoMermaEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jButtonRecargarInformacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMermaEmpresa.add(this.jComboBoxTiposPaginacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMermaEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMermaEmpresa.add(this.jComboBoxTiposArchivosReportesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jPanelParametrosAuxiliar1TipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMermaEmpresa.add(this.jComboBoxTiposReportesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jPanelParametrosAuxiliar4TipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jComboBoxTiposReportesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jCheckBoxGenerarReporteTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jPanelParametrosAuxiliar2TipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jLabelAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jButtonAbrirOrderByTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jComboBoxTiposSeleccionarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMermaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);															
				
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMermaEmpresa.add(this.jCheckBoxSeleccionadosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jPanelParametrosAuxiliar3TipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jComboBoxTiposRelacionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
				
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jComboBoxTiposAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
	
				
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMermaEmpresa.add(this.jTextFieldValorCampoGeneralTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMermaEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoMermaEmpresa.setLayout(gridaBagLayoutDatosTipoMermaEmpresa);
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoMermaEmpresa.add(this.jTableDatosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMermaEmpresa.setViewportView(this.jTableDatosTipoMermaEmpresa);
		this.jTableDatosTipoMermaEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoMermaEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMermaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoMermaEmpresa.setLayout(gridaBagLayoutAccionesTipoMermaEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonNuevoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMermaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMermaEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoMermaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMermaEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoMermaEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMermaEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMermaEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		*/		
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMermaEmpresa.gridx =0;
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMermaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
				
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMermaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMermaEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMermaEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoMermaEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMermaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMermaEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMermaEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMermaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMermaEmpresa.setName("jPanelReporteDinamicoTipoMermaEmpresa"); 
		
		this.jPanelReporteDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMermaEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoMermaEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMermaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMermaEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMermaEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jLabelColumnasSelectReporteTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMermaEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMermaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMermaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMermaEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoMermaEmpresa);
			
			this.jScrollColumnasSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jListColumnasSelectReporteTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jScrollColumnasSelectReporteTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMermaEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMermaEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMermaEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMermaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMermaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMermaEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoMermaEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoMermaEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMermaEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMermaEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoMermaEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMermaEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMermaEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa.setToolTipText("Generar EXCEL"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMermaEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMermaEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMermaEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMermaEmpresa.setToolTipText("Generar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jButtonGenerarReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMermaEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMermaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMermaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMermaEmpresa.setToolTipText("Cancelar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMermaEmpresa.add(this.jButtonCerrarReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMermaEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa= new JScrollPane(jPanelReporteDinamicoTipoMermaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMermaEmpresa);
		this.jInternalFrameReporteDinamicoTipoMermaEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMermaEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMermaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMermaEmpresa.setName("jPanelImportacionTipoMermaEmpresa"); 
		
		this.jPanelImportacionTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMermaEmpresa.setLayout(gridaBagLayoutImportacionTipoMermaEmpresa);
		
		
		this.jInternalFrameImportacionTipoMermaEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMermaEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMermaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMermaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMermaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMermaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMermaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMermaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMermaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMermaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMermaEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMermaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMermaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMermaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoMermaEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMermaEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoMermaEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMermaEmpresa.add(this.jLabelArchivoImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMermaEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoMermaEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMermaEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoMermaEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMermaEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMermaEmpresa.setToolTipText("Generar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMermaEmpresa.add(this.jButtonAbrirImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMermaEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMermaEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMermaEmpresa.add(this.jLabelPathArchivoImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMermaEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMermaEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMermaEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMermaEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMermaEmpresa.add(this.jTextFieldPathArchivoImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMermaEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoMermaEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMermaEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMermaEmpresa.setToolTipText("Generar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMermaEmpresa.add(this.jButtonGenerarImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMermaEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoMermaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMermaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMermaEmpresa.setToolTipText("Cancelar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMermaEmpresa.add(this.jButtonCerrarImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMermaEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMermaEmpresa= new JScrollPane(jPanelImportacionTipoMermaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMermaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMermaEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMermaEmpresa);
		this.jInternalFrameImportacionTipoMermaEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMermaEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMermaEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoMermaEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoMermaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMermaEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMermaEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMermaEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMermaEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMermaEmpresa.setName("jPanelOrderByTipoMermaEmpresa"); 
			
			this.jPanelOrderByTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMermaEmpresa.setLayout(gridaBagLayoutOrderByTipoMermaEmpresa);
			
			
			this.jTableDatosTipoMermaEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoMermaEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMermaEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMermaEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMermaEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMermaEmpresaOrderBy.setViewportView(this.jTableDatosTipoMermaEmpresaOrderBy);
			this.jTableDatosTipoMermaEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMermaEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMermaEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMermaEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMermaEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMermaEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMermaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMermaEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMermaEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoMermaEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMermaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMermaEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoMermaEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoMermaEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMermaEmpresa.ipady =150;
				
			this.jPanelOrderByTipoMermaEmpresa.add(jScrollPanelDatosTipoMermaEmpresaOrderBy, this.gridBagConstraintsTipoMermaEmpresa);//this.jTableDatosTipoMermaEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMermaEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoMermaEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMermaEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMermaEmpresa.setToolTipText("Cancelar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMermaEmpresa.add(this.jButtonCerrarOrderByTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMermaEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMermaEmpresa= new JScrollPane(jPanelOrderByTipoMermaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMermaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMermaEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMermaEmpresa);
			
			this.jInternalFrameOrderByTipoMermaEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoMermaEmpresa = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomermaempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMermaEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMermaEmpresa.getRowHeight();//TipoMermaEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.isSelected()) {
					iHeightTable=TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMermaEmpresa.isSelected()) {
					iHeightTable=TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMermaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMermaEmpresa!=null && this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMermaEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMermaEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMermaEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMermaEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomermaempresaLogic.getTipoMermaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermaempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMermaEmpresa> TraerTipoMermaEmpresaBeans(List<TipoMermaEmpresa> tipomermaempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMermaEmpresa tipomermaempresa:tipomermaempresas) {
					
				if(!(TipoMermaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMermaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomermaempresa.setsDetalleGeneralEntityReporte(TipoMermaEmpresaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresa));
										
						
					
						
					
				} else  {
							
					//tipomermaempresa.setsDetalleGeneralEntityReporte(tipomermaempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomermaempresabeans.add(tipomermaempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomermaempresas;
    }
	//PARA REPORTES FIN
}
