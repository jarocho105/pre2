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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.activosfijos.util.TipoActivoFijoEmpresaConstantesFunciones;

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
public class TipoActivoFijoEmpresaJInternalFrame extends TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoActivoFijoEmpresa;
	
	protected JMenuBar jmenuBarTipoActivoFijoEmpresa;
	
	protected JMenu jmenuTipoActivoFijoEmpresa;
	protected JMenu jmenuDatosTipoActivoFijoEmpresa;
	protected JMenu jmenuArchivoTipoActivoFijoEmpresa;
	protected JMenu jmenuAccionesTipoActivoFijoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoActivoFijoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoActivoFijoEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoActivoFijoEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoActivoFijoEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoActivoFijoEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoActivoFijoEmpresa> tipoactivofijoempresas;		
	public List<TipoActivoFijoEmpresa> tipoactivofijoempresasEliminados;	
	public List<TipoActivoFijoEmpresa> tipoactivofijoempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoActivoFijoEmpresa;		
	protected JButton jButtonAbrirOrderByTipoActivoFijoEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoActivoFijoEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoActivoFijoEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoActivoFijoEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoActivoFijoEmpresaLogic tipoactivofijoempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoActivoFijoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoActivoFijoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoActivoFijoEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoActivoFijoEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoActivoFijoEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoActivoFijoEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoActivoFijoEmpresa;
	
    protected JPanel jPanelPaginacionTipoActivoFijoEmpresa;
    protected JPanel jPanelParametrosReportesTipoActivoFijoEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoActivoFijoEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoActivoFijoEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoActivoFijoEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoActivoFijoEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoActivoFijoEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoActivoFijoEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoActivoFijoEmpresa;
	//protected JPanel jPanelImportacionTipoActivoFijoEmpresa;
	
	
	public JTable jTableDatosTipoActivoFijoEmpresa;
	
	
	
	//public JTable jTableDatosTipoActivoFijoEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoActivoFijoEmpresa;
	protected JButton jButtonDuplicarTipoActivoFijoEmpresa;
	protected JButton jButtonCopiarTipoActivoFijoEmpresa;
	protected JButton jButtonVerFormTipoActivoFijoEmpresa;
	protected JButton jButtonNuevoRelacionesTipoActivoFijoEmpresa;
	protected JButton jButtonModificarTipoActivoFijoEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoActivoFijoEmpresa;
	protected JButton jButtonCerrarTipoActivoFijoEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoActivoFijoEmpresa;
	protected JButton jButtonProcesarInformacionTipoActivoFijoEmpresa;
	
	
	protected JButton jButtonAnterioresTipoActivoFijoEmpresa;
	protected JButton jButtonSiguientesTipoActivoFijoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoActivoFijoEmpresa;
	//protected JButton jButtonGenerarImportacionTipoActivoFijoEmpresa;
	//protected JButton jButtonCerrarImportacionTipoActivoFijoEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoActivoFijoEmpresa;
	//protected File fileImportacionTipoActivoFijoEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonDuplicarToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonCopiarToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonVerFormToolBarTipoActivoFijoEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonCerrarToolBarTipoActivoFijoEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonAnterioresToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonSiguientesToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoActivoFijoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoActivoFijoEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemCopiarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemVerFormTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoActivoFijoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoActivoFijoEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoActivoFijoEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoActivoFijoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoActivoFijoEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoActivoFijoEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoActivoFijoEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoActivoFijoEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoActivoFijoEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoActivoFijoEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoActivoFijoEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoActivoFijoEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoActivoFijoEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoActivoFijoEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoActivoFijoEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoActivoFijoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoActivoFijoEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoActivoFijoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoActivoFijoEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoActivoFijoEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoActivoFijoEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoActivoFijoEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoActivoFijoEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoActivoFijoEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoActivoFijoEmpresa;
	
	
	
	
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
	public TipoActivoFijoEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoActivoFijoEmpresa)	{
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa = jButtonRecargarInformacionTipoActivoFijoEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoActivoFijoEmpresa() {
		return this.jButtonProcesarInformacionTipoActivoFijoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoActivoFijoEmpresa)	{
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa = jButtonProcesarInformacionTipoActivoFijoEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoActivoFijoEmpresa() {
		return this.jButtonRecargarInformacionTipoActivoFijoEmpresa;
	}
	
	
	public List<TipoActivoFijoEmpresa> gettipoactivofijoempresas() {
		return this.tipoactivofijoempresas;
	}

	public void settipoactivofijoempresas(List<TipoActivoFijoEmpresa> tipoactivofijoempresas) {
		this.tipoactivofijoempresas = tipoactivofijoempresas;
	}
	
	public List<TipoActivoFijoEmpresa> gettipoactivofijoempresasAux() {
		return this.tipoactivofijoempresasAux;
	}

	public void settipoactivofijoempresasAux(List<TipoActivoFijoEmpresa> tipoactivofijoempresasAux) {
		this.tipoactivofijoempresasAux = tipoactivofijoempresasAux;
	}
	
	public List<TipoActivoFijoEmpresa> gettipoactivofijoempresasEliminados() {
		return this.tipoactivofijoempresasEliminados;
	}

	public void setTipoActivoFijoEmpresasEliminados(List<TipoActivoFijoEmpresa> tipoactivofijoempresasEliminados) {
		this.tipoactivofijoempresasEliminados = tipoactivofijoempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoActivoFijoEmpresa() {
		return jComboBoxTiposSeleccionarTipoActivoFijoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoActivoFijoEmpresa) {
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa = jComboBoxTiposSeleccionarTipoActivoFijoEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoActivoFijoEmpresa() {
		return jTextFieldValorCampoGeneralTipoActivoFijoEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoActivoFijoEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoActivoFijoEmpresa) {
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa = jTextFieldValorCampoGeneralTipoActivoFijoEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoActivoFijoEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoActivoFijoEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa = jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoActivoFijoEmpresa() {
		return this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoActivoFijoEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoActivoFijoEmpresa) {
		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa = jCheckBoxSeleccionadosTipoActivoFijoEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa = jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposReportesTipoActivoFijoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposReportesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa = jComboBoxTiposReportesTipoActivoFijoEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa = jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa = jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoActivoFijoEmpresa) {
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa = jComboBoxTiposPaginacionTipoActivoFijoEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa = jComboBoxTiposRelacionesTipoActivoFijoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa = jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoActivoFijoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa = jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoActivoFijoEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoActivoFijoEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa .setBorder(borderResaltar);		
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
		this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		
		this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoActivoFijoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Activo Fijo Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoActivoFijoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoActivoFijoEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"copiar","copiar","Copiar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"recargar","recargar","Recargar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoActivoFijoEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoActivoFijoEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoActivoFijoEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoActivoFijoEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoActivoFijoEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoActivoFijoEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoActivoFijoEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoActivoFijoEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoActivoFijoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoActivoFijoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoActivoFijoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoActivoFijoEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoActivoFijoEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoActivoFijoEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoActivoFijoEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoActivoFijoEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoActivoFijoEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoActivoFijoEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoActivoFijoEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoActivoFijoEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoActivoFijoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoActivoFijoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoActivoFijoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoActivoFijoEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoActivoFijoEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoActivoFijoEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoActivoFijoEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoActivoFijoEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoActivoFijoEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoActivoFijoEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoActivoFijoEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoActivoFijoEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoActivoFijoEmpresa.add(this.jMenuItemCerrarTipoActivoFijoEmpresa);
			
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemNuevoTipoActivoFijoEmpresa);
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa);
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa);
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa);		
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemDuplicarTipoActivoFijoEmpresa);		
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemCopiarTipoActivoFijoEmpresa);		
			this.jmenuAccionesTipoActivoFijoEmpresa.add(this.jMenuItemVerFormTipoActivoFijoEmpresa);		
			
			this.jmenuDatosTipoActivoFijoEmpresa.add(this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa);				
			this.jmenuDatosTipoActivoFijoEmpresa.add(this.jMenuItemAnterioresTipoActivoFijoEmpresa);				
			this.jmenuDatosTipoActivoFijoEmpresa.add(this.jMenuItemSiguientesTipoActivoFijoEmpresa);				
			this.jmenuDatosTipoActivoFijoEmpresa.add(this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa);				
			this.jmenuDatosTipoActivoFijoEmpresa.add(this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoActivoFijoEmpresa.add(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoActivoFijoEmpresa.add(this.jmenuArchivoTipoActivoFijoEmpresa);		
			this.jmenuBarTipoActivoFijoEmpresa.add(this.jmenuAccionesTipoActivoFijoEmpresa);		
			this.jmenuBarTipoActivoFijoEmpresa.add(this.jmenuDatosTipoActivoFijoEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoActivoFijoEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoActivoFijoEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoActivoFijoEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoActivoFijoEmpresa = new TipoActivoFijoEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Activo Fijo Empresa DATOS");
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa = new TipoActivoFijoEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones(),this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa = null;//new TipoActivoFijoEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoActivoFijoEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoActivoFijoEmpresa = new JTableMe();      
		
		String sToolTipTipoActivoFijoEmpresa="";
		sToolTipTipoActivoFijoEmpresa=TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoActivoFijoEmpresa+="(ActivosFijos.TipoActivoFijoEmpresa)";
		}
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoActivoFijoEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoActivoFijoEmpresa.setToolTipText(sToolTipTipoActivoFijoEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoActivoFijoEmpresa);
		this.jTableDatosTipoActivoFijoEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoActivoFijoEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoActivoFijoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonCopiarTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonVerFormTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoActivoFijoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoActivoFijoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Activo Fijo Empresa";
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoActivoFijoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoActivoFijoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoActivoFijoEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa=new ReporteDinamicoJInternalFrame(TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoActivoFijoEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoActivoFijoEmpresa=new ImportacionJInternalFrame(TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoActivoFijoEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoActivoFijoEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoActivoFijoEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoActivoFijoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijoEmpresa,false,this);
			
			//this.cargarOrderByTipoActivoFijoEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoActivoFijoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijoEmpresa,true,this);
			
			//this.cargarOrderByTipoActivoFijoEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoActivoFijoEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoActivoFijoEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoActivoFijoEmpresa.setText("Copiar");
		this.jButtonVerFormTipoActivoFijoEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoActivoFijoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoActivoFijoEmpresa,"nuevo_button","Nuevo",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoActivoFijoEmpresa,"duplicar_button","Duplicar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoActivoFijoEmpresa,"copiar_button","Copiar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoActivoFijoEmpresa,"ver_form","Ver",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoActivoFijoEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa,"guardarcambiostabla_button","Guardar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoActivoFijoEmpresa,"cerrar_button","Salir",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoActivoFijoEmpresa.setToolTipText("Nuevo"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoActivoFijoEmpresa.setToolTipText("Duplicar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoActivoFijoEmpresa.setToolTipText("Copiar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoActivoFijoEmpresa.setToolTipText("Ver"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.setToolTipText("Nuevo Rel"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setToolTipText("Guardar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoActivoFijoEmpresa.setToolTipText("Salir"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoActivoFijoEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoActivoFijoEmpresa";
		inputMap = this.jButtonDuplicarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoActivoFijoEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCopiarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoActivoFijoEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoActivoFijoEmpresa";
		inputMap = this.jButtonVerFormTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoActivoFijoEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoActivoFijoEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoActivoFijoEmpresa";
		inputMap = this.jButtonModificarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoActivoFijoEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCerrarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoActivoFijoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoActivoFijoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoActivoFijoEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoActivoFijoEmpresa.setName("jPanelParametrosReportesTipoActivoFijoEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa.setName("jPanelParametrosReportesAccionesTipoActivoFijoEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.setToolTipText("Recargar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoActivoFijoEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setToolTipText("Procesar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoActivoFijoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoActivoFijoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoActivoFijoEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoActivoFijoEmpresa.setText("<<");
        this.jButtonAnterioresTipoActivoFijoEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoActivoFijoEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoActivoFijoEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoActivoFijoEmpresa.setText(">>");
        this.jButtonSiguientesTipoActivoFijoEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoActivoFijoEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa,"nuevoguardarcambios_button","Nue",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoActivoFijoEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoActivoFijoEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoActivoFijoEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoActivoFijoEmpresa";
		inputMap = this.jButtonSiguientesTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoActivoFijoEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoActivoFijoEmpresa";
		inputMap = this.jButtonAnterioresTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoActivoFijoEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoActivoFijoEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoActivoFijoEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoActivoFijoEmpresa.setLayout(gridaBagLayoutPaginacionTipoActivoFijoEmpresa);						
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonAnterioresTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					
						
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
						
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonSiguientesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonNuevoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
						
			
			
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonDuplicarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonCopiarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonVerFormTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoActivoFijoEmpresa.add(this.jButtonCerrarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoActivoFijoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoActivoFijoEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoActivoFijoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoActivoFijoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoActivoFijoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoActivoFijoEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.setLayout(gridaBagParametrosReportesTipoActivoFijoEmpresa);
			this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoActivoFijoEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoActivoFijoEmpresa);
			this.jPanelParametrosAuxiliar2TipoActivoFijoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoActivoFijoEmpresa);
			this.jPanelParametrosAuxiliar3TipoActivoFijoEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoActivoFijoEmpresa);
			this.jPanelParametrosAuxiliar4TipoActivoFijoEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoActivoFijoEmpresa);
			//this.jPanelParametrosAuxiliar5TipoActivoFijoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoActivoFijoEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jButtonRecargarInformacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa.add(this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa.add(this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jPanelParametrosAuxiliar1TipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoActivoFijoEmpresa.add(this.jComboBoxTiposReportesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jPanelParametrosAuxiliar4TipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jComboBoxTiposReportesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jCheckBoxGenerarReporteTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jPanelParametrosAuxiliar2TipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jLabelAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jButtonAbrirOrderByTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoActivoFijoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);															
				
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoActivoFijoEmpresa.add(this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jPanelParametrosAuxiliar3TipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
				
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jComboBoxTiposAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
	
				
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.add(this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoActivoFijoEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoActivoFijoEmpresa.setLayout(gridaBagLayoutDatosTipoActivoFijoEmpresa);
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoActivoFijoEmpresa.add(this.jTableDatosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setViewportView(this.jTableDatosTipoActivoFijoEmpresa);
		this.jTableDatosTipoActivoFijoEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoActivoFijoEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoActivoFijoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoActivoFijoEmpresa.setLayout(gridaBagLayoutAccionesTipoActivoFijoEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonNuevoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoActivoFijoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoActivoFijoEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoActivoFijoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/		
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoActivoFijoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
				
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoActivoFijoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoActivoFijoEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoActivoFijoEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoActivoFijoEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoActivoFijoEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoActivoFijoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setName("jPanelReporteDinamicoTipoActivoFijoEmpresa"); 
		
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoActivoFijoEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jLabelColumnasSelectReporteTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoActivoFijoEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoActivoFijoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoActivoFijoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoActivoFijoEmpresa);
			
			this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jListColumnasSelectReporteTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoActivoFijoEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoActivoFijoEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoActivoFijoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoActivoFijoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoActivoFijoEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoActivoFijoEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoActivoFijoEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoActivoFijoEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoActivoFijoEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoActivoFijoEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoActivoFijoEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.setToolTipText("Generar EXCEL"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa.setToolTipText("Generar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa.setToolTipText("Cancelar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijoEmpresa.add(this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoActivoFijoEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa= new JScrollPane(jPanelReporteDinamicoTipoActivoFijoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoActivoFijoEmpresa);
		this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoActivoFijoEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoActivoFijoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoActivoFijoEmpresa.setName("jPanelImportacionTipoActivoFijoEmpresa"); 
		
		this.jPanelImportacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoActivoFijoEmpresa.setLayout(gridaBagLayoutImportacionTipoActivoFijoEmpresa);
		
		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoActivoFijoEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoActivoFijoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoActivoFijoEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoActivoFijoEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jLabelArchivoImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoActivoFijoEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoActivoFijoEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoActivoFijoEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoActivoFijoEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoActivoFijoEmpresa.setToolTipText("Generar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jButtonAbrirImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jLabelPathArchivoImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jTextFieldPathArchivoImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoActivoFijoEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoActivoFijoEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoActivoFijoEmpresa.setToolTipText("Generar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jButtonGenerarImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoActivoFijoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoActivoFijoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoActivoFijoEmpresa.setToolTipText("Cancelar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijoEmpresa.add(this.jButtonCerrarImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoActivoFijoEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoActivoFijoEmpresa= new JScrollPane(jPanelImportacionTipoActivoFijoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoActivoFijoEmpresa);
		this.jInternalFrameImportacionTipoActivoFijoEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoActivoFijoEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoActivoFijoEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoActivoFijoEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoActivoFijoEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoActivoFijoEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoActivoFijoEmpresa.setName("jPanelOrderByTipoActivoFijoEmpresa"); 
			
			this.jPanelOrderByTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoActivoFijoEmpresa.setLayout(gridaBagLayoutOrderByTipoActivoFijoEmpresa);
			
			
			this.jTableDatosTipoActivoFijoEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoActivoFijoEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoActivoFijoEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoActivoFijoEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoActivoFijoEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoActivoFijoEmpresaOrderBy.setViewportView(this.jTableDatosTipoActivoFijoEmpresaOrderBy);
			this.jTableDatosTipoActivoFijoEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoActivoFijoEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoActivoFijoEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoActivoFijoEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoActivoFijoEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoActivoFijoEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoActivoFijoEmpresa.ipady =150;
				
			this.jPanelOrderByTipoActivoFijoEmpresa.add(jScrollPanelDatosTipoActivoFijoEmpresaOrderBy, this.gridBagConstraintsTipoActivoFijoEmpresa);//this.jTableDatosTipoActivoFijoEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoActivoFijoEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoActivoFijoEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoActivoFijoEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoActivoFijoEmpresa.setToolTipText("Cancelar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoActivoFijoEmpresa.add(this.jButtonCerrarOrderByTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoActivoFijoEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoActivoFijoEmpresa= new JScrollPane(jPanelOrderByTipoActivoFijoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoActivoFijoEmpresa);
			
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa = new JButtonMe();
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
			&& this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoActivoFijoEmpresa.getRowHeight();//TipoActivoFijoEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.isSelected()) {
					iHeightTable=TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoActivoFijoEmpresa.isSelected()) {
					iHeightTable=TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoActivoFijoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoActivoFijoEmpresa!=null && this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijoempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoActivoFijoEmpresa> TraerTipoActivoFijoEmpresaBeans(List<TipoActivoFijoEmpresa> tipoactivofijoempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresas) {
					
				if(!(TipoActivoFijoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoActivoFijoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoactivofijoempresa.setsDetalleGeneralEntityReporte(TipoActivoFijoEmpresaConstantesFunciones.getTipoActivoFijoEmpresaDescripcion(tipoactivofijoempresa));
										
						
					
						
					
				} else  {
							
					//tipoactivofijoempresa.setsDetalleGeneralEntityReporte(tipoactivofijoempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoactivofijoempresabeans.add(tipoactivofijoempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoactivofijoempresas;
    }
	//PARA REPORTES FIN
}
