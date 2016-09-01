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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoNivelEduConstantesFunciones;

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
public class TipoNivelEduJInternalFrame extends TipoNivelEduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoNivelEdu;
	
	protected JMenuBar jmenuBarTipoNivelEdu;
	
	protected JMenu jmenuTipoNivelEdu;
	protected JMenu jmenuDatosTipoNivelEdu;
	protected JMenu jmenuArchivoTipoNivelEdu;
	protected JMenu jmenuAccionesTipoNivelEdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNivelEdu;	
	protected GridBagConstraints gridBagConstraintsTipoNivelEdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoNivelEduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoNivelEdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoNivelEdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoNivelEdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoNivelEdu> tiponiveledus;		
	public List<TipoNivelEdu> tiponiveledusEliminados;	
	public List<TipoNivelEdu> tiponiveledusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoNivelEdu;		
	protected JButton jButtonAbrirOrderByTipoNivelEdu;
	
	
	//protected JPanel jPanelOrderByTipoNivelEdu;
	//public JScrollPane jScrollPanelOrderByTipoNivelEdu;	
	//protected JButton jButtonCerrarOrderByTipoNivelEdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoNivelEduLogic tiponiveleduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoNivelEdu;
	public JScrollPane jScrollPanelDatosEdicionTipoNivelEdu;
	public JScrollPane jScrollPanelDatosGeneralTipoNivelEdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoNivelEduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoNivelEdu;
	//public JScrollPane jScrollPanelImportacionTipoNivelEdu;
	
	
	
	protected JPanel jPanelAccionesTipoNivelEdu;
	
    protected JPanel jPanelPaginacionTipoNivelEdu;
    protected JPanel jPanelParametrosReportesTipoNivelEdu;
	protected JPanel jPanelParametrosReportesAccionesTipoNivelEdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoNivelEdu;
	protected JPanel jPanelParametrosAuxiliar2TipoNivelEdu;
	protected JPanel jPanelParametrosAuxiliar3TipoNivelEdu;
	protected JPanel jPanelParametrosAuxiliar4TipoNivelEdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoNivelEdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoNivelEdu;
	//protected JPanel jPanelImportacionTipoNivelEdu;
	
	
	public JTable jTableDatosTipoNivelEdu;
	
	
	
	//public JTable jTableDatosTipoNivelEduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoNivelEdu;
	protected JButton jButtonDuplicarTipoNivelEdu;
	protected JButton jButtonCopiarTipoNivelEdu;
	protected JButton jButtonVerFormTipoNivelEdu;
	protected JButton jButtonNuevoRelacionesTipoNivelEdu;
	protected JButton jButtonModificarTipoNivelEdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoNivelEdu;
	protected JButton jButtonCerrarTipoNivelEdu;
	
	
	protected JButton jButtonRecargarInformacionTipoNivelEdu;
	protected JButton jButtonProcesarInformacionTipoNivelEdu;
	
	
	protected JButton jButtonAnterioresTipoNivelEdu;
	protected JButton jButtonSiguientesTipoNivelEdu;
	protected JButton jButtonNuevoGuardarCambiosTipoNivelEdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoNivelEdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoNivelEdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoNivelEdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoNivelEdu;
	//protected JButton jButtonGenerarImportacionTipoNivelEdu;
	//protected JButton jButtonCerrarImportacionTipoNivelEdu;
	//protected JFileChooser jFileChooserImportacionTipoNivelEdu;
	//protected File fileImportacionTipoNivelEdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNivelEdu;
	protected JButton jButtonDuplicarToolBarTipoNivelEdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoNivelEdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoNivelEdu;
	protected JButton jButtonCopiarToolBarTipoNivelEdu;
	protected JButton jButtonVerFormToolBarTipoNivelEdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoNivelEdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNivelEdu;
	protected JButton jButtonCerrarToolBarTipoNivelEdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoNivelEdu;
	protected JButton jButtonProcesarInformacionToolBarTipoNivelEdu;
	protected JButton jButtonAnterioresToolBarTipoNivelEdu;
	protected JButton jButtonSiguientesToolBarTipoNivelEdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoNivelEdu;
	protected JButton jButtonAbrirOrderByToolBarTipoNivelEdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNivelEdu;
	protected JMenuItem jMenuItemDuplicarTipoNivelEdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoNivelEdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoNivelEdu;
	protected JMenuItem jMenuItemCopiarTipoNivelEdu;
	protected JMenuItem jMenuItemVerFormTipoNivelEdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNivelEdu;
	protected JMenuItem jMenuItemCerrarTipoNivelEdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoNivelEdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoNivelEdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNivelEdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoNivelEdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoNivelEdu;
	protected JMenuItem jMenuItemAnterioresTipoNivelEdu;
	protected JMenuItem jMenuItemSiguientesTipoNivelEdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNivelEdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoNivelEdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoNivelEdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNivelEdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoNivelEdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoNivelEdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoNivelEdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoNivelEdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoNivelEdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoNivelEdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoNivelEdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoNivelEdu;
	protected JTextField jTextFieldValorCampoGeneralTipoNivelEdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoNivelEdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoNivelEdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoNivelEdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoNivelEdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoNivelEdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoNivelEdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoNivelEdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoNivelEdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoNivelEdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoNivelEdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoNivelEdu;	
	//public JLabel jLabelPathArchivoImportacionTipoNivelEdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoNivelEdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoNivelEdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoNivelEdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoNivelEdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoNivelEdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoNivelEdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoNivelEdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoNivelEdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoNivelEdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoNivelEdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoNivelEdu;
	
	
	
	
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
	public TipoNivelEduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoNivelEdu)	{
		this.jButtonRecargarInformacionTipoNivelEdu = jButtonRecargarInformacionTipoNivelEdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoNivelEdu() {
		return this.jButtonProcesarInformacionTipoNivelEdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNivelEdu)	{
		this.jButtonProcesarInformacionTipoNivelEdu = jButtonProcesarInformacionTipoNivelEdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoNivelEdu() {
		return this.jButtonRecargarInformacionTipoNivelEdu;
	}
	
	
	public List<TipoNivelEdu> gettiponiveledus() {
		return this.tiponiveledus;
	}

	public void settiponiveledus(List<TipoNivelEdu> tiponiveledus) {
		this.tiponiveledus = tiponiveledus;
	}
	
	public List<TipoNivelEdu> gettiponiveledusAux() {
		return this.tiponiveledusAux;
	}

	public void settiponiveledusAux(List<TipoNivelEdu> tiponiveledusAux) {
		this.tiponiveledusAux = tiponiveledusAux;
	}
	
	public List<TipoNivelEdu> gettiponiveledusEliminados() {
		return this.tiponiveledusEliminados;
	}

	public void setTipoNivelEdusEliminados(List<TipoNivelEdu> tiponiveledusEliminados) {
		this.tiponiveledusEliminados = tiponiveledusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoNivelEdu() {
		return jComboBoxTiposSeleccionarTipoNivelEdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoNivelEdu(
			JComboBox jComboBoxTiposSeleccionarTipoNivelEdu) {
		this.jComboBoxTiposSeleccionarTipoNivelEdu = jComboBoxTiposSeleccionarTipoNivelEdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoNivelEdu() {
		return jTextFieldValorCampoGeneralTipoNivelEdu;
	}

	public void setjTextFieldValorCampoGeneralTipoNivelEdu(
			JTextField jTextFieldValorCampoGeneralTipoNivelEdu) {
		this.jTextFieldValorCampoGeneralTipoNivelEdu = jTextFieldValorCampoGeneralTipoNivelEdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoNivelEdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoNivelEdu() {
		return this.jCheckBoxSeleccionarTodosTipoNivelEdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoNivelEdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoNivelEdu) {
		this.jCheckBoxSeleccionarTodosTipoNivelEdu = jCheckBoxSeleccionarTodosTipoNivelEdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoNivelEdu() {
		return this.jCheckBoxSeleccionadosTipoNivelEdu;
	}

	public void setjCheckBoxSeleccionadosTipoNivelEdu(
			JCheckBox jCheckBoxSeleccionadosTipoNivelEdu) {
		this.jCheckBoxSeleccionadosTipoNivelEdu = jCheckBoxSeleccionadosTipoNivelEdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoNivelEdu() {
		return this.jComboBoxTiposArchivosReportesTipoNivelEdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoNivelEdu(
			JComboBox jComboBoxTiposArchivosReportesTipoNivelEdu) {
		this.jComboBoxTiposArchivosReportesTipoNivelEdu = jComboBoxTiposArchivosReportesTipoNivelEdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoNivelEdu() {
		return this.jComboBoxTiposReportesTipoNivelEdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoNivelEdu(
			JComboBox jComboBoxTiposReportesTipoNivelEdu) {
		this.jComboBoxTiposReportesTipoNivelEdu = jComboBoxTiposReportesTipoNivelEdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoNivelEdu() {
	//	return jComboBoxTiposReportesDinamicoTipoNivelEdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoNivelEdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoNivelEdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoNivelEdu = jComboBoxTiposReportesDinamicoTipoNivelEdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoNivelEdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoNivelEdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu = jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoNivelEdu() {
		return this.jComboBoxTiposGraficosReportesTipoNivelEdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoNivelEdu(
			JComboBox jComboBoxTiposGraficosReportesTipoNivelEdu) {
		this.jComboBoxTiposGraficosReportesTipoNivelEdu = jComboBoxTiposGraficosReportesTipoNivelEdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoNivelEdu() {
		return this.jComboBoxTiposPaginacionTipoNivelEdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoNivelEdu(
			JComboBox jComboBoxTiposPaginacionTipoNivelEdu) {
		this.jComboBoxTiposPaginacionTipoNivelEdu = jComboBoxTiposPaginacionTipoNivelEdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoNivelEdu() {
		return this.jComboBoxTiposRelacionesTipoNivelEdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNivelEdu() {
		return this.jComboBoxTiposAccionesTipoNivelEdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNivelEdu(
			JComboBox jComboBoxTiposRelacionesTipoNivelEdu) {
		this.jComboBoxTiposRelacionesTipoNivelEdu = jComboBoxTiposRelacionesTipoNivelEdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNivelEdu(
			JComboBox jComboBoxTiposAccionesTipoNivelEdu) {
		this.jComboBoxTiposAccionesTipoNivelEdu = jComboBoxTiposAccionesTipoNivelEdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoNivelEdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoNivelEdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoNivelEdu() {
	//	return jCheckBoxConGraficoDinamicoTipoNivelEdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoNivelEdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoNivelEdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoNivelEdu = jCheckBoxConGraficoDinamicoTipoNivelEdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoNivelEdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoNivelEdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoNivelEdu .setBorder(borderResaltar);		
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
		this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		
		this.tiponiveleduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponiveleduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponiveleduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNivelEduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Nivel Edu MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoNivelEduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoNivelEdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"nuevo","nuevo","Nuevo"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"duplicar","duplicar","Duplicar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"copiar","copiar","Copiar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"ver_form","ver_form","Ver"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"recargar","recargar","Recargar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoNivelEdu,this.jTtoolBarTipoNivelEdu,
							"cerrar","cerrar","Salir"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoNivelEdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoNivelEdu;
			
				this.jButtonProcesarInformacionToolBarTipoNivelEdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoNivelEdu;
				
		//protected JButton jButtonModificarToolBarTipoNivelEdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoNivelEdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoNivelEdu=new JMenuMe("General");
		this.jmenuArchivoTipoNivelEdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoNivelEdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoNivelEdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNivelEdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNivelEdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNivelEdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoNivelEdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoNivelEdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoNivelEdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoNivelEdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoNivelEdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoNivelEdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoNivelEdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNivelEdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNivelEdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoNivelEdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoNivelEdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoNivelEdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoNivelEdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoNivelEdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoNivelEdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoNivelEdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoNivelEdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoNivelEdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNivelEdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNivelEdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNivelEdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoNivelEdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoNivelEdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoNivelEdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoNivelEdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoNivelEdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoNivelEdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoNivelEdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoNivelEdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoNivelEdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoNivelEdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoNivelEdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoNivelEdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoNivelEdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoNivelEdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoNivelEdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNivelEdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNivelEdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNivelEdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoNivelEdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoNivelEdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoNivelEdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNivelEdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNivelEdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNivelEdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoNivelEdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoNivelEdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoNivelEdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoNivelEdu.add(this.jMenuItemCerrarTipoNivelEdu);
			
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemNuevoTipoNivelEdu);
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemNuevoGuardarCambiosTipoNivelEdu);
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemNuevoRelacionesTipoNivelEdu);
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemGuardarCambiosTablaTipoNivelEdu);		
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemDuplicarTipoNivelEdu);		
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemCopiarTipoNivelEdu);		
			this.jmenuAccionesTipoNivelEdu.add(this.jMenuItemVerFormTipoNivelEdu);		
			
			this.jmenuDatosTipoNivelEdu.add(this.jMenuItemRecargarInformacionTipoNivelEdu);				
			this.jmenuDatosTipoNivelEdu.add(this.jMenuItemAnterioresTipoNivelEdu);				
			this.jmenuDatosTipoNivelEdu.add(this.jMenuItemSiguientesTipoNivelEdu);				
			this.jmenuDatosTipoNivelEdu.add(this.jMenuItemAbrirOrderByTipoNivelEdu);				
			this.jmenuDatosTipoNivelEdu.add(this.jMenuItemMostrarOcultarTipoNivelEdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoNivelEdu.add(this.jMenuItemGuardarCambiosTipoNivelEdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoNivelEdu.add(this.jmenuArchivoTipoNivelEdu);		
			this.jmenuBarTipoNivelEdu.add(this.jmenuAccionesTipoNivelEdu);		
			this.jmenuBarTipoNivelEdu.add(this.jmenuDatosTipoNivelEdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoNivelEdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoNivelEdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoNivelEdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoNivelEdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoNivelEdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoNivelEdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoNivelEdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoNivelEdu = new TipoNivelEduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Nivel Edu DATOS");
			this.jInternalFrameDetalleFormTipoNivelEdu = new TipoNivelEduDetalleFormJInternalFrame(jDesktopPane,this.tiponiveleduSessionBean.getConGuardarRelaciones(),this.tiponiveleduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoNivelEdu = null;//new TipoNivelEduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNivelEdu= new GridBagLayout();
		
		
		this.jTableDatosTipoNivelEdu = new JTableMe();      
		
		String sToolTipTipoNivelEdu="";
		sToolTipTipoNivelEdu=TipoNivelEduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNivelEdu+="(Cartera.TipoNivelEdu)";
		}
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNivelEdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoNivelEdu.setToolTipText(sToolTipTipoNivelEdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoNivelEdu);
		this.jTableDatosTipoNivelEdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoNivelEdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoNivelEdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoNivelEdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoNivelEdu = new JButtonMe();
		this.jButtonDuplicarTipoNivelEdu = new JButtonMe();
		this.jButtonCopiarTipoNivelEdu = new JButtonMe();
		this.jButtonVerFormTipoNivelEdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoNivelEdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu = new JButtonMe();
		this.jButtonCerrarTipoNivelEdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoNivelEdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoNivelEdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Nivel Edu";
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNivelEdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNivelEdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoNivelEdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoNivelEdu=new ReporteDinamicoJInternalFrame(TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoNivelEdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoNivelEdu=new ImportacionJInternalFrame(TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoNivelEdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoNivelEdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoNivelEdu.setText("Orden");
		this.jButtonAbrirOrderByTipoNivelEdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNivelEdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNivelEdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNivelEdu,false,this);
			
			//this.cargarOrderByTipoNivelEdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNivelEdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNivelEdu,true,this);
			
			//this.cargarOrderByTipoNivelEdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoNivelEdu.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoNivelEdu.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoNivelEdu.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoNivelEdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNivelEdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNivelEdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoNivelEdu.setText("Nuevo");
		this.jButtonDuplicarTipoNivelEdu.setText("Duplicar");
		this.jButtonCopiarTipoNivelEdu.setText("Copiar");
		this.jButtonVerFormTipoNivelEdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoNivelEdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.setText("Guardar");
		this.jButtonCerrarTipoNivelEdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNivelEdu,"nuevo_button","Nuevo",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoNivelEdu,"duplicar_button","Duplicar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoNivelEdu,"copiar_button","Copiar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoNivelEdu,"ver_form","Ver",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoNivelEdu,"nuevorelaciones_button","Nuevo Rel",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNivelEdu,"guardarcambiostabla_button","Guardar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNivelEdu,"cerrar_button","Salir",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoNivelEdu.setToolTipText("Nuevo"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoNivelEdu.setToolTipText("Duplicar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoNivelEdu.setToolTipText("Copiar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoNivelEdu.setToolTipText("Ver"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoNivelEdu.setToolTipText("Nuevo Rel"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.setToolTipText("Guardar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNivelEdu.setToolTipText("Salir"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNivelEdu";
		inputMap = this.jButtonNuevoTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNivelEdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNivelEdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoNivelEdu";
		inputMap = this.jButtonDuplicarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoNivelEdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoNivelEdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoNivelEdu";
		inputMap = this.jButtonCopiarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoNivelEdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoNivelEdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoNivelEdu";
		inputMap = this.jButtonVerFormTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoNivelEdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoNivelEdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoNivelEdu";
		inputMap = this.jButtonNuevoRelacionesTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoNivelEdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoNivelEdu";
		inputMap = this.jButtonModificarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoNivelEdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoNivelEdu";
		inputMap = this.jButtonCerrarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNivelEdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNivelEdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNivelEdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoNivelEdu.setName("jPanelParametrosReportesTipoNivelEdu"); 
		
		this.jPanelParametrosReportesAccionesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoNivelEdu.setName("jPanelParametrosReportesAccionesTipoNivelEdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoNivelEdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoNivelEdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoNivelEdu.setToolTipText("Recargar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoNivelEdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoNivelEdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoNivelEdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoNivelEdu.setToolTipText("Procesar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoNivelEdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoNivelEdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNivelEdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNivelEdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNivelEdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoNivelEdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNivelEdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoNivelEdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNivelEdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoNivelEdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoNivelEdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoNivelEdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoNivelEdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoNivelEdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNivelEdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoNivelEdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoNivelEdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoNivelEdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoNivelEdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoNivelEdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNivelEdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNivelEdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoNivelEdu = new JLabelMe();
		
		this.jLabelAccionesTipoNivelEdu.setText("Acciones");		
		this.jLabelAccionesTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoNivelEdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoNivelEdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoNivelEdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoNivelEdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoNivelEdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoNivelEdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoNivelEdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoNivelEdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoNivelEdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoNivelEdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoNivelEdu = new JButtonMe();
		//this.jButtonAnterioresTipoNivelEdu.setText("<<");
        this.jButtonAnterioresTipoNivelEdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoNivelEdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoNivelEdu = new JButtonMe();
		//this.jButtonSiguientesTipoNivelEdu.setText(">>");
        this.jButtonSiguientesTipoNivelEdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoNivelEdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoNivelEdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoNivelEdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoNivelEdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoNivelEdu,"nuevoguardarcambios_button","Nue",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoNivelEdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoNivelEdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoNivelEdu";
		inputMap = this.jButtonRecargarInformacionTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoNivelEdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoNivelEdu";
		inputMap = this.jButtonSiguientesTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoNivelEdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoNivelEdu";
		inputMap = this.jButtonAnterioresTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoNivelEdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoNivelEdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoNivelEdu.setMinimumSize(new Dimension(this.getWidth(),TipoNivelEduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNivelEduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNivelEdu.setMaximumSize(new Dimension(this.getWidth(),TipoNivelEduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNivelEduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNivelEdu.setPreferredSize(new Dimension(this.getWidth(),TipoNivelEduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNivelEduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoNivelEdu = new GridBagLayout();

			this.jPanelPaginacionTipoNivelEdu.setLayout(gridaBagLayoutPaginacionTipoNivelEdu);						
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 0;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonAnterioresTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					
						
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNivelEdu.gridy = 0;
			
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonNuevoGuardarCambiosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
						
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNivelEdu.gridy = 0;
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonSiguientesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 1;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonNuevoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNivelEdu.gridy = 1;
				this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoNivelEdu.add(this.jButtonNuevoRelacionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			}
			
			
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNivelEdu.gridy = 1;
				this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoNivelEdu.add(this.jButtonGuardarCambiosTablaTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			}
			
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 1;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonDuplicarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 1;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonCopiarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 1;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonVerFormTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 1;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoNivelEdu.add(this.jButtonCerrarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
		
		
		this.jButtonRecargarInformacionTipoNivelEdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNivelEdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNivelEdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoNivelEdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNivelEdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNivelEdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoNivelEdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNivelEdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNivelEdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoNivelEdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNivelEdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNivelEdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoNivelEdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNivelEdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNivelEdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoNivelEdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNivelEdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNivelEdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoNivelEdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNivelEdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNivelEdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoNivelEdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNivelEdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNivelEdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoNivelEdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNivelEdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNivelEdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoNivelEdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNivelEdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNivelEdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoNivelEdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNivelEdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNivelEdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoNivelEdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoNivelEdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoNivelEdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoNivelEdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoNivelEdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoNivelEdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoNivelEdu.setLayout(gridaBagParametrosReportesTipoNivelEdu);
			this.jPanelParametrosReportesAccionesTipoNivelEdu.setLayout(gridaBagParametrosReportesAccionesTipoNivelEdu);
			
			
			this.jPanelParametrosAuxiliar1TipoNivelEdu.setLayout(gridaBagParametrosAuxiliar1TipoNivelEdu);
			this.jPanelParametrosAuxiliar2TipoNivelEdu.setLayout(gridaBagParametrosAuxiliar2TipoNivelEdu);
			this.jPanelParametrosAuxiliar3TipoNivelEdu.setLayout(gridaBagParametrosAuxiliar3TipoNivelEdu);
			this.jPanelParametrosAuxiliar4TipoNivelEdu.setLayout(gridaBagParametrosAuxiliar4TipoNivelEdu);
			//this.jPanelParametrosAuxiliar5TipoNivelEdu.setLayout(gridaBagParametrosAuxiliar2TipoNivelEdu);			
			
			
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jButtonRecargarInformacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNivelEdu.add(this.jComboBoxTiposPaginacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNivelEdu.add(this.jCheckBoxConAltoMaximoTablaTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNivelEdu.add(this.jComboBoxTiposArchivosReportesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jPanelParametrosAuxiliar1TipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoNivelEdu.add(this.jComboBoxTiposReportesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jPanelParametrosAuxiliar4TipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jComboBoxTiposReportesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jCheckBoxGenerarReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jPanelParametrosAuxiliar2TipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jLabelAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoNivelEdu.add(this.jButtonAbrirOrderByTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jComboBoxTiposSeleccionarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			
			
			/*
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jCheckBoxSeleccionarTodosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNivelEdu.add(this.jCheckBoxSeleccionarTodosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);															
				
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNivelEdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNivelEdu.add(this.jCheckBoxSeleccionadosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jPanelParametrosAuxiliar3TipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jComboBoxTiposRelacionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
				
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jComboBoxTiposAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
	
				
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNivelEdu.add(this.jTextFieldValorCampoGeneralTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoNivelEdu = new GridBagLayout();

			this.jScrollPanelDatosTipoNivelEdu.setLayout(gridaBagLayoutDatosTipoNivelEdu);
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = 0;
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;
			
			this.jScrollPanelDatosTipoNivelEdu.add(this.jTableDatosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoNivelEdu.setViewportView(this.jTableDatosTipoNivelEdu);
		this.jTableDatosTipoNivelEdu.setFillsViewportHeight(true);
		this.jTableDatosTipoNivelEdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoNivelEdu= new GridBagLayout();
		this.jPanelAccionesTipoNivelEdu.setLayout(gridaBagLayoutAccionesTipoNivelEdu);
		
		
		/*	
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
			
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonNuevoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNivelEdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;		
			//this.gridBagConstraintsTipoNivelEdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNivelEdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;		
		//this.gridBagConstraintsTipoNivelEdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoNivelEdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);								
		
		
		/*
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		*/		
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNivelEdu.gridx =0;
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNivelEdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
				
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoNivelEdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNivelEdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoNivelEdu.setLayout(gridaBagLayoutBusquedasParametrosTipoNivelEdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoNivelEdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNivelEdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNivelEdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNivelEdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoNivelEdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoNivelEdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoNivelEdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoNivelEdu.setName("jPanelReporteDinamicoTipoNivelEdu"); 
		
		this.jPanelReporteDinamicoTipoNivelEdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNivelEdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNivelEdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoNivelEdu.setLayout(gridaBagLayoutReporteDinamicoTipoNivelEdu);
		
		
		this.jInternalFrameReporteDinamicoTipoNivelEdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoNivelEdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNivelEdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoNivelEdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoNivelEdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoNivelEdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoNivelEdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoNivelEdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoNivelEdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoNivelEdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoNivelEdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoNivelEdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNivelEdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNivelEdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoNivelEdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoNivelEdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jLabelColumnasSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoNivelEdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoNivelEdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoNivelEdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoNivelEdu=new JScrollPane(this.jListColumnasSelectReporteTipoNivelEdu);
			
			this.jScrollColumnasSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNivelEdu.add(this.jListColumnasSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jScrollColumnasSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoNivelEdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoNivelEdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jLabelRelacionesSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoNivelEdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoNivelEdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoNivelEdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoNivelEdu=new JScrollPane(this.jListRelacionesSelectReporteTipoNivelEdu);
			
			this.jScrollRelacionesSelectReporteTipoNivelEdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNivelEdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNivelEdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNivelEdu.add(this.jListRelacionesSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jScrollRelacionesSelectReporteTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoNivelEdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoNivelEdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoNivelEdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoNivelEdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoNivelEdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoNivelEdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNivelEdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNivelEdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jLabelGenerarExcelReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu.setToolTipText("Generar EXCEL"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoNivelEdu.add(this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jComboBoxTiposReportesDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jLabelTiposArchivoReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoNivelEdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoNivelEdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoNivelEdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoNivelEdu.setToolTipText("Generar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jButtonGenerarReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoNivelEdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoNivelEdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoNivelEdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoNivelEdu.setToolTipText("Cancelar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNivelEdu.add(this.jButtonCerrarReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoNivelEdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoNivelEdu= new JScrollPane(jPanelReporteDinamicoTipoNivelEdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoNivelEdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNivelEdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNivelEdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoNivelEdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoNivelEdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoNivelEdu);
		this.jInternalFrameReporteDinamicoTipoNivelEdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoNivelEdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoNivelEdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoNivelEdu.setName("jPanelImportacionTipoNivelEdu"); 
		
		this.jPanelImportacionTipoNivelEdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNivelEdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNivelEdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoNivelEdu.setLayout(gridaBagLayoutImportacionTipoNivelEdu);
		
		
		this.jInternalFrameImportacionTipoNivelEdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoNivelEdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoNivelEdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNivelEdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoNivelEdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNivelEdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNivelEdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoNivelEdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNivelEdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNivelEdu.setResizable(true);
	    this.jInternalFrameImportacionTipoNivelEdu.setClosable(true);
	    this.jInternalFrameImportacionTipoNivelEdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoNivelEdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNivelEdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNivelEdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoNivelEdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNivelEdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNivelEdu.setResizable(true);
	    this.jInternalFrameImportacionTipoNivelEdu.setClosable(true);
	    this.jInternalFrameImportacionTipoNivelEdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoNivelEdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNivelEdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNivelEdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoNivelEdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoNivelEdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNivelEdu.add(this.jLabelArchivoImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoNivelEdu = new JFileChooser();		
		this.jFileChooserImportacionTipoNivelEdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoNivelEdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoNivelEdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoNivelEdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoNivelEdu.setToolTipText("Generar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNivelEdu.add(this.jButtonAbrirImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoNivelEdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoNivelEdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNivelEdu.add(this.jLabelPathArchivoImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoNivelEdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoNivelEdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNivelEdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNivelEdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNivelEdu.add(this.jTextFieldPathArchivoImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoNivelEdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoNivelEdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoNivelEdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoNivelEdu.setToolTipText("Generar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNivelEdu.add(this.jButtonGenerarImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoNivelEdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoNivelEdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoNivelEdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoNivelEdu.setToolTipText("Cancelar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNivelEdu.add(this.jButtonCerrarImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoNivelEdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoNivelEdu= new JScrollPane(jPanelImportacionTipoNivelEdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoNivelEdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoNivelEdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoNivelEdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoNivelEdu);
		this.jInternalFrameImportacionTipoNivelEdu.getContentPane().add(this.jScrollPanelImportacionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoNivelEdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoNivelEdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoNivelEdu.setText("Orden");
			this.jButtonAbrirOrderByTipoNivelEdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNivelEdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoNivelEdu";
			inputMap = this.jButtonAbrirOrderByTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoNivelEdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoNivelEdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoNivelEdu.setName("jPanelOrderByTipoNivelEdu"); 
			
			this.jPanelOrderByTipoNivelEdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNivelEdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNivelEdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoNivelEdu.setLayout(gridaBagLayoutOrderByTipoNivelEdu);
			
			
			this.jTableDatosTipoNivelEduOrderBy = new JTableMe();        
			this.jTableDatosTipoNivelEduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoNivelEduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoNivelEduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoNivelEduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoNivelEduOrderBy.setViewportView(this.jTableDatosTipoNivelEduOrderBy);
			this.jTableDatosTipoNivelEduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoNivelEduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoNivelEdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoNivelEdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoNivelEdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoNivelEdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoNivelEdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoNivelEdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoNivelEdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoNivelEdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoNivelEdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoNivelEdu.setResizable(true);
			this.jInternalFrameOrderByTipoNivelEdu.setClosable(true);
			this.jInternalFrameOrderByTipoNivelEdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoNivelEdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNivelEdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNivelEdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoNivelEdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoNivelEdu.ipady =150;
				
			this.jPanelOrderByTipoNivelEdu.add(jScrollPanelDatosTipoNivelEduOrderBy, this.gridBagConstraintsTipoNivelEdu);//this.jTableDatosTipoNivelEduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoNivelEdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoNivelEdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoNivelEdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoNivelEdu.setToolTipText("Cancelar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoNivelEdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoNivelEdu.add(this.jButtonCerrarOrderByTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoNivelEdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoNivelEdu= new JScrollPane(jPanelOrderByTipoNivelEdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoNivelEdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoNivelEdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoNivelEdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoNivelEdu);
			
			this.jInternalFrameOrderByTipoNivelEdu.getContentPane().add(this.jScrollPanelOrderByTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoNivelEdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiponiveleduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoNivelEdu.getRowHeight();//TipoNivelEduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.isSelected()) {
					iHeightTable=TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNivelEdu.isSelected()) {
					iHeightTable=TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNivelEduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoNivelEdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNivelEdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNivelEdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoNivelEdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNivelEdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNivelEdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoNivelEdu!=null && this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoNivelEdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoNivelEdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoNivelEdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoNivelEdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNivelEdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNivelEdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiponiveleduLogic.getTipoNivelEdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponiveledus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoNivelEdu> TraerTipoNivelEduBeans(List<TipoNivelEdu> tiponiveledus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoNivelEdu tiponiveledu:tiponiveledus) {
					
				if(!(TipoNivelEduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoNivelEduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiponiveledu.setsDetalleGeneralEntityReporte(TipoNivelEduConstantesFunciones.getTipoNivelEduDescripcion(tiponiveledu));
										
					tiponiveledu.setes_defecto_descripcion(TipoNivelEduConstantesFunciones.getes_defectoDescripcion(tiponiveledu));	
					
					

					if(tiponiveledu.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tiponiveledu.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tiponiveledu.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tiponiveledu.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{tiponiveledu.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(tiponiveledu.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tiponiveledu.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{tiponiveledu.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(tiponiveledu.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiponiveledu.setsDetalleGeneralEntityReporte(tiponiveledu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiponiveledubeans.add(tiponiveledubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiponiveledus;
    }
	//PARA REPORTES FIN
}
