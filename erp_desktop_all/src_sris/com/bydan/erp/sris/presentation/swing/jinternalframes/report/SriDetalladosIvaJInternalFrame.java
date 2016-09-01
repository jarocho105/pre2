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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriDetalladosIvaConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriDetalladosIvaJInternalFrame extends SriDetalladosIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSriDetalladosIva;
	
	protected JMenuBar jmenuBarSriDetalladosIva;
	
	protected JMenu jmenuSriDetalladosIva;
	protected JMenu jmenuDatosSriDetalladosIva;
	protected JMenu jmenuArchivoSriDetalladosIva;
	protected JMenu jmenuAccionesSriDetalladosIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriDetalladosIva;	
	protected GridBagConstraints gridBagConstraintsSriDetalladosIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriDetalladosIvaDetalleFormJInternalFrame jInternalFrameDetalleFormSriDetalladosIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSriDetalladosIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSriDetalladosIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriDetalladosIvaSessionBean sridetalladosivaSessionBean;
		
	
	
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SriDetalladosIva> sridetalladosivas;		
	public List<SriDetalladosIva> sridetalladosivasEliminados;	
	public List<SriDetalladosIva> sridetalladosivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySriDetalladosIva;		
	protected JButton jButtonAbrirOrderBySriDetalladosIva;
	
	
	//protected JPanel jPanelOrderBySriDetalladosIva;
	//public JScrollPane jScrollPanelOrderBySriDetalladosIva;	
	//protected JButton jButtonCerrarOrderBySriDetalladosIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SriDetalladosIvaLogic sridetalladosivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSriDetalladosIva;
	public JScrollPane jScrollPanelDatosEdicionSriDetalladosIva;
	public JScrollPane jScrollPanelDatosGeneralSriDetalladosIva;
    
	
	
	//public JScrollPane jScrollPanelDatosSriDetalladosIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSriDetalladosIva;
	//public JScrollPane jScrollPanelImportacionSriDetalladosIva;
	
	
	
	protected JPanel jPanelAccionesSriDetalladosIva;
	
    protected JPanel jPanelPaginacionSriDetalladosIva;
    protected JPanel jPanelParametrosReportesSriDetalladosIva;
	protected JPanel jPanelParametrosReportesAccionesSriDetalladosIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SriDetalladosIva;
	protected JPanel jPanelParametrosAuxiliar2SriDetalladosIva;
	protected JPanel jPanelParametrosAuxiliar3SriDetalladosIva;
	protected JPanel jPanelParametrosAuxiliar4SriDetalladosIva;
	//protected JPanel jPanelParametrosAuxiliar5SriDetalladosIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoSriDetalladosIva;
	//protected JPanel jPanelImportacionSriDetalladosIva;
	
	
	public JTable jTableDatosSriDetalladosIva;
	
	
	
	//public JTable jTableDatosSriDetalladosIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSriDetalladosIva;
	protected JButton jButtonDuplicarSriDetalladosIva;
	protected JButton jButtonCopiarSriDetalladosIva;
	protected JButton jButtonVerFormSriDetalladosIva;
	protected JButton jButtonNuevoRelacionesSriDetalladosIva;
	protected JButton jButtonModificarSriDetalladosIva;
	
    protected JButton jButtonGuardarCambiosTablaSriDetalladosIva;
	protected JButton jButtonCerrarSriDetalladosIva;
	
	
	protected JButton jButtonRecargarInformacionSriDetalladosIva;
	protected JButton jButtonProcesarInformacionSriDetalladosIva;
	
	
	protected JButton jButtonAnterioresSriDetalladosIva;
	protected JButton jButtonSiguientesSriDetalladosIva;
	protected JButton jButtonNuevoGuardarCambiosSriDetalladosIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSriDetalladosIva;
	//protected JButton jButtonCerrarReporteDinamicoSriDetalladosIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoSriDetalladosIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionSriDetalladosIva;
	//protected JButton jButtonGenerarImportacionSriDetalladosIva;
	//protected JButton jButtonCerrarImportacionSriDetalladosIva;
	//protected JFileChooser jFileChooserImportacionSriDetalladosIva;
	//protected File fileImportacionSriDetalladosIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriDetalladosIva;
	protected JButton jButtonDuplicarToolBarSriDetalladosIva;
	protected JButton jButtonNuevoRelacionesToolBarSriDetalladosIva;
	
	
	public JButton jButtonGuardarCambiosToolBarSriDetalladosIva;
	protected JButton jButtonCopiarToolBarSriDetalladosIva;
	protected JButton jButtonVerFormToolBarSriDetalladosIva;
	public JButton jButtonGuardarCambiosTablaToolBarSriDetalladosIva;
	protected JButton jButtonMostrarOcultarTablaToolBarSriDetalladosIva;
	protected JButton jButtonCerrarToolBarSriDetalladosIva;
	
	protected JButton jButtonRecargarInformacionToolBarSriDetalladosIva;
	protected JButton jButtonProcesarInformacionToolBarSriDetalladosIva;
	protected JButton jButtonAnterioresToolBarSriDetalladosIva;
	protected JButton jButtonSiguientesToolBarSriDetalladosIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarSriDetalladosIva;
	protected JButton jButtonAbrirOrderByToolBarSriDetalladosIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriDetalladosIva;
	protected JMenuItem jMenuItemDuplicarSriDetalladosIva;
	protected JMenuItem jMenuItemNuevoRelacionesSriDetalladosIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSriDetalladosIva;
	protected JMenuItem jMenuItemCopiarSriDetalladosIva;
	protected JMenuItem jMenuItemVerFormSriDetalladosIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriDetalladosIva;
	protected JMenuItem jMenuItemCerrarSriDetalladosIva;
	protected JMenuItem jMenuItemDetalleCerrarSriDetalladosIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySriDetalladosIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriDetalladosIva;
	
	protected JMenuItem jMenuItemRecargarInformacionSriDetalladosIva;
	protected JMenuItem jMenuItemProcesarInformacionSriDetalladosIva;
	protected JMenuItem jMenuItemAnterioresSriDetalladosIva;
	protected JMenuItem jMenuItemSiguientesSriDetalladosIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriDetalladosIva;
	protected JMenuItem jMenuItemAbrirOrderBySriDetalladosIva;
	protected JMenuItem jMenuItemMostrarOcultarSriDetalladosIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriDetalladosIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSriDetalladosIva;
	protected JCheckBox jCheckBoxSeleccionadosSriDetalladosIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSriDetalladosIva;
	protected JCheckBox jCheckBoxConGraficoReporteSriDetalladosIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSriDetalladosIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSriDetalladosIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSriDetalladosIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSriDetalladosIva;
	protected JTextField jTextFieldValorCampoGeneralSriDetalladosIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSriDetalladosIva;
	//public JList<Reporte> jListColumnasSelectReporteSriDetalladosIva;
	//public JScrollPane jScrollColumnasSelectReporteSriDetalladosIva;
	
	//public JLabel jLabelRelacionesSelectReporteSriDetalladosIva;
	//public JList<Reporte> jListRelacionesSelectReporteSriDetalladosIva;
	//public JScrollPane jScrollRelacionesSelectReporteSriDetalladosIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSriDetalladosIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSriDetalladosIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSriDetalladosIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoSriDetalladosIva;
	
		
	//public JLabel jLabelArchivoImportacionSriDetalladosIva;	
	//public JLabel jLabelPathArchivoImportacionSriDetalladosIva;
	//protected JTextField jTextFieldPathArchivoImportacionSriDetalladosIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSriDetalladosIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSriDetalladosIva;
	
	//public JLabel jLabelColumnaCategoriaValorSriDetalladosIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSriDetalladosIva;
	
	//public JLabel jLabelColumnasValoresGraficoSriDetalladosIva;
	//public JList<Reporte> jListColumnasValoresGraficoSriDetalladosIva;
	//public JScrollPane jScrollColumnasValoresGraficoSriDetalladosIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSriDetalladosIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSriDetalladosIva;
	public JPanel jPanelBusquedaSriDetalladosIvaSriDetalladosIva;
	public JButton jButtonBusquedaSriDetalladosIvaSriDetalladosIva;
	
	public JPanel jPanelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva;
	public JLabel jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva;
	public JButton jButtonid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva;
	public JLabel jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva;
	public JButton jButtonid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaSriDetalladosIvaSriDetalladosIva;
	public JLabel jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva;
	public JTextField jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva;
	public JButton jButtonrucBusquedaSriDetalladosIvaSriDetalladosIvaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriDetalladosIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSriDetalladosIva)	{
		this.jButtonRecargarInformacionSriDetalladosIva = jButtonRecargarInformacionSriDetalladosIva;
	}
	
	public JButton getjButtonProcesarInformacionSriDetalladosIva() {
		return this.jButtonProcesarInformacionSriDetalladosIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriDetalladosIva)	{
		this.jButtonProcesarInformacionSriDetalladosIva = jButtonProcesarInformacionSriDetalladosIva;
	}
	
	
	public JButton getjButtonRecargarInformacionSriDetalladosIva() {
		return this.jButtonRecargarInformacionSriDetalladosIva;
	}
	
	
	public List<SriDetalladosIva> getsridetalladosivas() {
		return this.sridetalladosivas;
	}

	public void setsridetalladosivas(List<SriDetalladosIva> sridetalladosivas) {
		this.sridetalladosivas = sridetalladosivas;
	}
	
	public List<SriDetalladosIva> getsridetalladosivasAux() {
		return this.sridetalladosivasAux;
	}

	public void setsridetalladosivasAux(List<SriDetalladosIva> sridetalladosivasAux) {
		this.sridetalladosivasAux = sridetalladosivasAux;
	}
	
	public List<SriDetalladosIva> getsridetalladosivasEliminados() {
		return this.sridetalladosivasEliminados;
	}

	public void setSriDetalladosIvasEliminados(List<SriDetalladosIva> sridetalladosivasEliminados) {
		this.sridetalladosivasEliminados = sridetalladosivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSriDetalladosIva() {
		return jComboBoxTiposSeleccionarSriDetalladosIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSriDetalladosIva(
			JComboBox jComboBoxTiposSeleccionarSriDetalladosIva) {
		this.jComboBoxTiposSeleccionarSriDetalladosIva = jComboBoxTiposSeleccionarSriDetalladosIva;
	}
	
	public void setBorderResaltarTiposSeleccionarSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSriDetalladosIva() {
		return jTextFieldValorCampoGeneralSriDetalladosIva;
	}

	public void setjTextFieldValorCampoGeneralSriDetalladosIva(
			JTextField jTextFieldValorCampoGeneralSriDetalladosIva) {
		this.jTextFieldValorCampoGeneralSriDetalladosIva = jTextFieldValorCampoGeneralSriDetalladosIva;
	}

	public void setBorderResaltarValorCampoGeneralSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSriDetalladosIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSriDetalladosIva() {
		return this.jCheckBoxSeleccionarTodosSriDetalladosIva;
	}

	public void setjCheckBoxSeleccionarTodosSriDetalladosIva(
			JCheckBox jCheckBoxSeleccionarTodosSriDetalladosIva) {
		this.jCheckBoxSeleccionarTodosSriDetalladosIva = jCheckBoxSeleccionarTodosSriDetalladosIva;
	}

	public void setBorderResaltarSeleccionarTodosSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSriDetalladosIva() {
		return this.jCheckBoxSeleccionadosSriDetalladosIva;
	}

	public void setjCheckBoxSeleccionadosSriDetalladosIva(
			JCheckBox jCheckBoxSeleccionadosSriDetalladosIva) {
		this.jCheckBoxSeleccionadosSriDetalladosIva = jCheckBoxSeleccionadosSriDetalladosIva;
	}
	
	public void setBorderResaltarSeleccionadosSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSriDetalladosIva() {
		return this.jComboBoxTiposArchivosReportesSriDetalladosIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSriDetalladosIva(
			JComboBox jComboBoxTiposArchivosReportesSriDetalladosIva) {
		this.jComboBoxTiposArchivosReportesSriDetalladosIva = jComboBoxTiposArchivosReportesSriDetalladosIva;
	}

	public void setBorderResaltarTiposArchivosReportesSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSriDetalladosIva() {
		return this.jComboBoxTiposReportesSriDetalladosIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSriDetalladosIva(
			JComboBox jComboBoxTiposReportesSriDetalladosIva) {
		this.jComboBoxTiposReportesSriDetalladosIva = jComboBoxTiposReportesSriDetalladosIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSriDetalladosIva() {
	//	return jComboBoxTiposReportesDinamicoSriDetalladosIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSriDetalladosIva(
	//		JComboBox jComboBoxTiposReportesDinamicoSriDetalladosIva) {
	//	this.jComboBoxTiposReportesDinamicoSriDetalladosIva = jComboBoxTiposReportesDinamicoSriDetalladosIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSriDetalladosIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSriDetalladosIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva = jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva;
	//}
	
	public void setBorderResaltarTiposReportesSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSriDetalladosIva() {
		return this.jComboBoxTiposGraficosReportesSriDetalladosIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSriDetalladosIva(
			JComboBox jComboBoxTiposGraficosReportesSriDetalladosIva) {
		this.jComboBoxTiposGraficosReportesSriDetalladosIva = jComboBoxTiposGraficosReportesSriDetalladosIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSriDetalladosIva() {
		return this.jComboBoxTiposPaginacionSriDetalladosIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSriDetalladosIva(
			JComboBox jComboBoxTiposPaginacionSriDetalladosIva) {
		this.jComboBoxTiposPaginacionSriDetalladosIva = jComboBoxTiposPaginacionSriDetalladosIva;
	}
	
	public void setBorderResaltarTiposPaginacionSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSriDetalladosIva() {
		return this.jComboBoxTiposRelacionesSriDetalladosIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriDetalladosIva() {
		return this.jComboBoxTiposAccionesSriDetalladosIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriDetalladosIva(
			JComboBox jComboBoxTiposRelacionesSriDetalladosIva) {
		this.jComboBoxTiposRelacionesSriDetalladosIva = jComboBoxTiposRelacionesSriDetalladosIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriDetalladosIva(
			JComboBox jComboBoxTiposAccionesSriDetalladosIva) {
		this.jComboBoxTiposAccionesSriDetalladosIva = jComboBoxTiposAccionesSriDetalladosIva;
	}
	
	public void setBorderResaltarTiposRelacionesSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSriDetalladosIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSriDetalladosIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSriDetalladosIva() {
	//	return jCheckBoxConGraficoDinamicoSriDetalladosIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoSriDetalladosIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoSriDetalladosIva) {
	//	this.jCheckBoxConGraficoDinamicoSriDetalladosIva = jCheckBoxConGraficoDinamicoSriDetalladosIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSriDetalladosIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSriDetalladosIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSriDetalladosIva .setBorder(borderResaltar);		
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
		this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
		
		this.sridetalladosivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sridetalladosivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sridetalladosivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriDetalladosIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Detallados Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
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
		
		SriDetalladosIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSriDetalladosIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"nuevo","nuevo","Nuevo"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"duplicar","duplicar","Duplicar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"copiar","copiar","Copiar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"ver_form","ver_form","Ver"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"recargar","recargar","Buscar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSriDetalladosIva,this.jTtoolBarSriDetalladosIva,
							"cerrar","cerrar","Salir"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSriDetalladosIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSriDetalladosIva;
			
				this.jButtonProcesarInformacionToolBarSriDetalladosIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSriDetalladosIva;
				
		//protected JButton jButtonModificarToolBarSriDetalladosIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSriDetalladosIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSriDetalladosIva=new JMenuMe("General");
		this.jmenuArchivoSriDetalladosIva=new JMenuMe("Archivo");
		this.jmenuAccionesSriDetalladosIva=new JMenuMe("Acciones");
		this.jmenuDatosSriDetalladosIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriDetalladosIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriDetalladosIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriDetalladosIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSriDetalladosIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSriDetalladosIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSriDetalladosIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSriDetalladosIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSriDetalladosIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSriDetalladosIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSriDetalladosIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriDetalladosIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriDetalladosIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSriDetalladosIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSriDetalladosIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSriDetalladosIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSriDetalladosIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSriDetalladosIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSriDetalladosIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSriDetalladosIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSriDetalladosIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSriDetalladosIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriDetalladosIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriDetalladosIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriDetalladosIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSriDetalladosIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSriDetalladosIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSriDetalladosIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSriDetalladosIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSriDetalladosIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSriDetalladosIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSriDetalladosIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSriDetalladosIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSriDetalladosIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSriDetalladosIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSriDetalladosIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSriDetalladosIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySriDetalladosIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySriDetalladosIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySriDetalladosIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriDetalladosIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriDetalladosIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriDetalladosIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySriDetalladosIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySriDetalladosIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySriDetalladosIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriDetalladosIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriDetalladosIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriDetalladosIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSriDetalladosIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSriDetalladosIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSriDetalladosIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSriDetalladosIva.add(this.jMenuItemCerrarSriDetalladosIva);
			
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemNuevoSriDetalladosIva);
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemNuevoGuardarCambiosSriDetalladosIva);
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemNuevoRelacionesSriDetalladosIva);
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemGuardarCambiosTablaSriDetalladosIva);		
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemDuplicarSriDetalladosIva);		
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemCopiarSriDetalladosIva);		
			this.jmenuAccionesSriDetalladosIva.add(this.jMenuItemVerFormSriDetalladosIva);		
			
			this.jmenuDatosSriDetalladosIva.add(this.jMenuItemRecargarInformacionSriDetalladosIva);				
			this.jmenuDatosSriDetalladosIva.add(this.jMenuItemAnterioresSriDetalladosIva);				
			this.jmenuDatosSriDetalladosIva.add(this.jMenuItemSiguientesSriDetalladosIva);				
			this.jmenuDatosSriDetalladosIva.add(this.jMenuItemAbrirOrderBySriDetalladosIva);				
			this.jmenuDatosSriDetalladosIva.add(this.jMenuItemMostrarOcultarSriDetalladosIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSriDetalladosIva.add(this.jMenuItemGuardarCambiosSriDetalladosIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSriDetalladosIva.add(this.jmenuArchivoSriDetalladosIva);		
			this.jmenuBarSriDetalladosIva.add(this.jmenuAccionesSriDetalladosIva);		
			this.jmenuBarSriDetalladosIva.add(this.jmenuDatosSriDetalladosIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSriDetalladosIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSriDetalladosIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva.setToolTipText("Buscar Por Periodo Declara Por Tipo Comprobante Por Ruc ");
		this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva= new JButtonMe();
		this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva.setText("Buscar");
		this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva.setToolTipText("Buscar Por Periodo Declara Por Tipo Comprobante Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva,"buscar_button","Buscar Por Periodo Declara Por Tipo Comprobante Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva = new JLabelMe();
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setText("Periodo Declara :");
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva = new JLabelMe();
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setText("Tipo Comprobante :");
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setToolTipText("Tipo Comprobante");
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva = new JLabelMe();
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva.setText("Ruc :");
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva.setToolTipText("Ruc");
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva= new JTextFieldMe();
		jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSriDetalladosIva=new JTabbedPane();


		this.jTabbedPaneBusquedasSriDetalladosIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriDetalladosIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriDetalladosIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSriDetalladosIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSriDetalladosIva = new SriDetalladosIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri Detallados Iva DATOS");
			this.jInternalFrameDetalleFormSriDetalladosIva = new SriDetalladosIvaDetalleFormJInternalFrame(jDesktopPane,this.sridetalladosivaSessionBean.getConGuardarRelaciones(),this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSriDetalladosIva = null;//new SriDetalladosIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriDetalladosIva= new GridBagLayout();
		
		
		this.jTableDatosSriDetalladosIva = new JTableMe();      
		
		String sToolTipSriDetalladosIva="";
		sToolTipSriDetalladosIva=SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriDetalladosIva+="(Sris.SriDetalladosIva)";
		}
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriDetalladosIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSriDetalladosIva.setToolTipText(sToolTipSriDetalladosIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSriDetalladosIva);
		this.jTableDatosSriDetalladosIva.setAutoCreateRowSorter(true);
		this.jTableDatosSriDetalladosIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSriDetalladosIva.setRowSelectionAllowed(true);
		this.jTableDatosSriDetalladosIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSriDetalladosIva = new JButtonMe();
		this.jButtonDuplicarSriDetalladosIva = new JButtonMe();
		this.jButtonCopiarSriDetalladosIva = new JButtonMe();
		this.jButtonVerFormSriDetalladosIva = new JButtonMe();
		this.jButtonNuevoRelacionesSriDetalladosIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva = new JButtonMe();
		this.jButtonCerrarSriDetalladosIva = new JButtonMe();
		
		this.jScrollPanelDatosSriDetalladosIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralSriDetalladosIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Detallados Iva";
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosSriDetalladosIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriDetalladosIva.setToolTipText("Acciones");
        this.jPanelAccionesSriDetalladosIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSriDetalladosIva=new ReporteDinamicoJInternalFrame(SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSriDetalladosIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSriDetalladosIva=new ImportacionJInternalFrame(SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSriDetalladosIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySriDetalladosIva = new JButtonMe();
		
		this.jButtonAbrirOrderBySriDetalladosIva.setText("Orden");
		this.jButtonAbrirOrderBySriDetalladosIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriDetalladosIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriDetalladosIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriDetalladosIva,false,this);
			
			//this.cargarOrderBySriDetalladosIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriDetalladosIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriDetalladosIva,true,this);
			
			//this.cargarOrderBySriDetalladosIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSriDetalladosIva.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosSriDetalladosIva.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosSriDetalladosIva.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosSriDetalladosIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriDetalladosIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriDetalladosIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSriDetalladosIva.setText("Nuevo");
		this.jButtonDuplicarSriDetalladosIva.setText("Duplicar");
		this.jButtonCopiarSriDetalladosIva.setText("Copiar");
		this.jButtonVerFormSriDetalladosIva.setText("Ver");
		this.jButtonNuevoRelacionesSriDetalladosIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.setText("Guardar");
		this.jButtonCerrarSriDetalladosIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriDetalladosIva,"nuevo_button","Nuevo",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSriDetalladosIva,"duplicar_button","Duplicar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSriDetalladosIva,"copiar_button","Copiar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSriDetalladosIva,"ver_form","Ver",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSriDetalladosIva,"nuevorelaciones_button","Nuevo Rel",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriDetalladosIva,"guardarcambiostabla_button","Guardar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriDetalladosIva,"cerrar_button","Salir",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSriDetalladosIva.setToolTipText("Nuevo"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSriDetalladosIva.setToolTipText("Duplicar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSriDetalladosIva.setToolTipText("Copiar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSriDetalladosIva.setToolTipText("Ver"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSriDetalladosIva.setToolTipText("Nuevo Rel"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.setToolTipText("Guardar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriDetalladosIva.setToolTipText("Salir"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriDetalladosIva";
		inputMap = this.jButtonNuevoSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriDetalladosIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriDetalladosIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarSriDetalladosIva";
		inputMap = this.jButtonDuplicarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSriDetalladosIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSriDetalladosIva"));
		
		//COPIAR
		sMapKey = "CopiarSriDetalladosIva";
		inputMap = this.jButtonCopiarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSriDetalladosIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSriDetalladosIva"));
		
		//VEr FORM
		sMapKey = "VerFormSriDetalladosIva";
		inputMap = this.jButtonVerFormSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSriDetalladosIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSriDetalladosIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSriDetalladosIva";
		inputMap = this.jButtonNuevoRelacionesSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSriDetalladosIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSriDetalladosIva";
		inputMap = this.jButtonModificarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSriDetalladosIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSriDetalladosIva";
		inputMap = this.jButtonCerrarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriDetalladosIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriDetalladosIva";
		inputMap = this.jButtonGuardarCambiosTablaSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriDetalladosIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSriDetalladosIva.setName("jPanelParametrosReportesSriDetalladosIva"); 
		
		this.jPanelParametrosReportesAccionesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSriDetalladosIva.setName("jPanelParametrosReportesAccionesSriDetalladosIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSriDetalladosIva = new JButtonMe();
		this.jButtonRecargarInformacionSriDetalladosIva.setText("Buscar");
		this.jButtonRecargarInformacionSriDetalladosIva.setToolTipText("Buscar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSriDetalladosIva,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSriDetalladosIva.setVisible(false);
		
		
		this.jButtonProcesarInformacionSriDetalladosIva = new JButtonMe();
		this.jButtonProcesarInformacionSriDetalladosIva.setText("Procesar");
		this.jButtonProcesarInformacionSriDetalladosIva.setToolTipText("Procesar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSriDetalladosIva.setVisible(false);
			
		this.jButtonProcesarInformacionSriDetalladosIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriDetalladosIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriDetalladosIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriDetalladosIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSriDetalladosIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriDetalladosIva.setText("TIPO");       
		this.jComboBoxTiposReportesSriDetalladosIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriDetalladosIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSriDetalladosIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSriDetalladosIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionSriDetalladosIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSriDetalladosIva.setText("Accion");
		this.jComboBoxTiposRelacionesSriDetalladosIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriDetalladosIva.setText("Accion");
		this.jComboBoxTiposAccionesSriDetalladosIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSriDetalladosIva.setText("Accion");
		this.jComboBoxTiposSeleccionarSriDetalladosIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSriDetalladosIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSriDetalladosIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriDetalladosIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriDetalladosIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSriDetalladosIva = new JLabelMe();
		
		this.jLabelAccionesSriDetalladosIva.setText("Acciones");		
		this.jLabelAccionesSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSriDetalladosIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSriDetalladosIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSriDetalladosIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSriDetalladosIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSriDetalladosIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSriDetalladosIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSriDetalladosIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteSriDetalladosIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSriDetalladosIva = new JButtonMe();
		//this.jButtonAnterioresSriDetalladosIva.setText("<<");
        this.jButtonAnterioresSriDetalladosIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSriDetalladosIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSriDetalladosIva = new JButtonMe();
		//this.jButtonSiguientesSriDetalladosIva.setText(">>");
        this.jButtonSiguientesSriDetalladosIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSriDetalladosIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSriDetalladosIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSriDetalladosIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosSriDetalladosIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSriDetalladosIva,"nuevoguardarcambios_button","Nue",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSriDetalladosIva";
		inputMap = this.jButtonNuevoGuardarCambiosSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSriDetalladosIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSriDetalladosIva";
		inputMap = this.jButtonRecargarInformacionSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSriDetalladosIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSriDetalladosIva";
		inputMap = this.jButtonSiguientesSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSriDetalladosIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSriDetalladosIva";
		inputMap = this.jButtonAnterioresSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSriDetalladosIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSriDetalladosIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSriDetalladosIva.setMinimumSize(new Dimension(this.getWidth(),SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriDetalladosIva.setMaximumSize(new Dimension(this.getWidth(),SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriDetalladosIva.setPreferredSize(new Dimension(this.getWidth(),SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriDetalladosIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSriDetalladosIva = new GridBagLayout();

			this.jPanelPaginacionSriDetalladosIva.setLayout(gridaBagLayoutPaginacionSriDetalladosIva);						
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 0;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonAnterioresSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					
						
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriDetalladosIva.gridy = 0;
			
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonNuevoGuardarCambiosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
						
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriDetalladosIva.gridy = 0;
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonSiguientesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 1;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonNuevoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
						
			
			
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
				this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSriDetalladosIva.gridy = 1;
				this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSriDetalladosIva.add(this.jButtonGuardarCambiosTablaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			}
			
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 1;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonDuplicarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 1;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonCopiarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 1;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonVerFormSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 1;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSriDetalladosIva.add(this.jButtonCerrarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		
		this.jButtonRecargarInformacionSriDetalladosIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriDetalladosIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriDetalladosIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSriDetalladosIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriDetalladosIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriDetalladosIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSriDetalladosIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriDetalladosIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriDetalladosIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSriDetalladosIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriDetalladosIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriDetalladosIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSriDetalladosIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriDetalladosIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriDetalladosIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSriDetalladosIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriDetalladosIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriDetalladosIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSriDetalladosIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriDetalladosIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriDetalladosIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSriDetalladosIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriDetalladosIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriDetalladosIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSriDetalladosIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriDetalladosIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriDetalladosIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSriDetalladosIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriDetalladosIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriDetalladosIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSriDetalladosIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriDetalladosIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriDetalladosIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSriDetalladosIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSriDetalladosIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SriDetalladosIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SriDetalladosIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SriDetalladosIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SriDetalladosIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSriDetalladosIva.setLayout(gridaBagParametrosReportesSriDetalladosIva);
			this.jPanelParametrosReportesAccionesSriDetalladosIva.setLayout(gridaBagParametrosReportesAccionesSriDetalladosIva);
			
			
			this.jPanelParametrosAuxiliar1SriDetalladosIva.setLayout(gridaBagParametrosAuxiliar1SriDetalladosIva);
			this.jPanelParametrosAuxiliar2SriDetalladosIva.setLayout(gridaBagParametrosAuxiliar2SriDetalladosIva);
			this.jPanelParametrosAuxiliar3SriDetalladosIva.setLayout(gridaBagParametrosAuxiliar3SriDetalladosIva);
			this.jPanelParametrosAuxiliar4SriDetalladosIva.setLayout(gridaBagParametrosAuxiliar4SriDetalladosIva);
			//this.jPanelParametrosAuxiliar5SriDetalladosIva.setLayout(gridaBagParametrosAuxiliar2SriDetalladosIva);			
			
			
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jButtonRecargarInformacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriDetalladosIva.add(this.jComboBoxTiposPaginacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriDetalladosIva.add(this.jCheckBoxConAltoMaximoTablaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriDetalladosIva.add(this.jComboBoxTiposArchivosReportesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jPanelParametrosAuxiliar1SriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SriDetalladosIva.add(this.jComboBoxTiposReportesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);																		
			
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SriDetalladosIva.add(this.jComboBoxTiposGraficosReportesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jPanelParametrosAuxiliar4SriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jComboBoxTiposReportesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jCheckBoxGenerarReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jPanelParametrosAuxiliar2SriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jLabelAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
				this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSriDetalladosIva.add(this.jButtonAbrirOrderBySriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jComboBoxTiposSeleccionarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
			
			
			/*
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jCheckBoxSeleccionarTodosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jCheckBoxConGraficoReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriDetalladosIva.add(this.jCheckBoxSeleccionarTodosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);															
				
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriDetalladosIva.add(this.jCheckBoxSeleccionadosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);															
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriDetalladosIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriDetalladosIva.add(this.jCheckBoxConGraficoReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jPanelParametrosAuxiliar3SriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriDetalladosIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriDetalladosIva.add(this.jComboBoxTiposAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSriDetalladosIva = new GridBagLayout();

			this.jScrollPanelDatosSriDetalladosIva.setLayout(gridaBagLayoutDatosSriDetalladosIva);
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = 0;
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;
			
			this.jScrollPanelDatosSriDetalladosIva.add(this.jTableDatosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSriDetalladosIva.setViewportView(this.jTableDatosSriDetalladosIva);
		this.jTableDatosSriDetalladosIva.setFillsViewportHeight(true);
		this.jTableDatosSriDetalladosIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSriDetalladosIva= new GridBagLayout();
		this.jPanelAccionesSriDetalladosIva.setLayout(gridaBagLayoutAccionesSriDetalladosIva);
		
		
		/*	
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
			
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonNuevoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva= new GridBagLayout();
		gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.setLayout(gridaBagLayoutBusquedaSriDetalladosIvaSriDetalladosIva);

		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 0;
		gridBagConstraintsSriDetalladosIva.gridx = 0;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jLabelid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);

		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 0;
		gridBagConstraintsSriDetalladosIva.gridx = 1;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);


		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 1;
		gridBagConstraintsSriDetalladosIva.gridx = 0;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jLabelid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);

		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 1;
		gridBagConstraintsSriDetalladosIva.gridx = 1;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);


		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 2;
		gridBagConstraintsSriDetalladosIva.gridx = 0;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jLabelrucBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);

		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 2;
		gridBagConstraintsSriDetalladosIva.gridx = 1;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);

		gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriDetalladosIva.gridy = 3;
		gridBagConstraintsSriDetalladosIva.gridx =1;
		jPanelBusquedaSriDetalladosIvaSriDetalladosIva.add(jButtonBusquedaSriDetalladosIvaSriDetalladosIva, gridBagConstraintsSriDetalladosIva);

		jTabbedPaneBusquedasSriDetalladosIva.addTab("1.-Por Periodo Declara Por Tipo Comprobante Por Ruc ", jPanelBusquedaSriDetalladosIvaSriDetalladosIva);
		jTabbedPaneBusquedasSriDetalladosIva.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriDetalladosIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();						
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;		
			//this.gridBagConstraintsSriDetalladosIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriDetalladosIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;		
		//this.gridBagConstraintsSriDetalladosIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSriDetalladosIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;		
			this.gridBagConstraintsSriDetalladosIva.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSriDetalladosIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);								
		
		
		/*
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		*/		
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriDetalladosIva.gridx =0;
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriDetalladosIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
				
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSriDetalladosIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriDetalladosIva = new GridBagLayout();
			this.jPanelBusquedasParametrosSriDetalladosIva.setLayout(gridaBagLayoutBusquedasParametrosSriDetalladosIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSriDetalladosIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriDetalladosIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriDetalladosIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriDetalladosIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSriDetalladosIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSriDetalladosIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSriDetalladosIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSriDetalladosIva.setName("jPanelReporteDinamicoSriDetalladosIva"); 
		
		this.jPanelReporteDinamicoSriDetalladosIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriDetalladosIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriDetalladosIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSriDetalladosIva.setLayout(gridaBagLayoutReporteDinamicoSriDetalladosIva);
		
		
		this.jInternalFrameReporteDinamicoSriDetalladosIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSriDetalladosIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriDetalladosIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSriDetalladosIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSriDetalladosIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSriDetalladosIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSriDetalladosIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSriDetalladosIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSriDetalladosIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoSriDetalladosIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoSriDetalladosIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSriDetalladosIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriDetalladosIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriDetalladosIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSriDetalladosIva = new JLabelMe();

		this.jLabelColumnasSelectReporteSriDetalladosIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelColumnasSelectReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSriDetalladosIva = new JList<Reporte>();
		this.jListColumnasSelectReporteSriDetalladosIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSriDetalladosIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSriDetalladosIva=new JScrollPane(this.jListColumnasSelectReporteSriDetalladosIva);
			
			this.jScrollColumnasSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSriDetalladosIva.add(this.jListColumnasSelectReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jScrollColumnasSelectReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSriDetalladosIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteSriDetalladosIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSriDetalladosIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteSriDetalladosIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSriDetalladosIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSriDetalladosIva=new JScrollPane(this.jListRelacionesSelectReporteSriDetalladosIva);
			
			this.jScrollRelacionesSelectReporteSriDetalladosIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriDetalladosIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriDetalladosIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSriDetalladosIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoSriDetalladosIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSriDetalladosIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSriDetalladosIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSriDetalladosIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriDetalladosIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriDetalladosIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSriDetalladosIva = new JLabelMe();

		this.jLabelConGraficoDinamicoSriDetalladosIva.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelConGraficoDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSriDetalladosIva.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSriDetalladosIva.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSriDetalladosIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriDetalladosIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriDetalladosIva.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jCheckBoxConGraficoDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSriDetalladosIva = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSriDetalladosIva.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelColumnaCategoriaGraficoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSriDetalladosIva = new JLabelMe();

		this.jLabelColumnaCategoriaValorSriDetalladosIva.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelColumnaCategoriaValorSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSriDetalladosIva.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSriDetalladosIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSriDetalladosIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriDetalladosIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriDetalladosIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jComboBoxColumnaCategoriaValorSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSriDetalladosIva = new JLabelMe();

		this.jLabelColumnasValoresGraficoSriDetalladosIva.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelColumnasValoresGraficoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSriDetalladosIva = new JList<Reporte>();
		this.jListColumnasValoresGraficoSriDetalladosIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSriDetalladosIva.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSriDetalladosIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriDetalladosIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriDetalladosIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSriDetalladosIva=new JScrollPane(this.jListColumnasValoresGraficoSriDetalladosIva);
			
			this.jScrollColumnasValoresGraficoSriDetalladosIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriDetalladosIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriDetalladosIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSriDetalladosIva.add(this.jListColumnasSelectReporteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jScrollColumnasValoresGraficoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelTiposGraficosReportesDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriDetalladosIva.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jComboBoxTiposGraficosReportesDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelGenerarExcelReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva.setToolTipText("Generar EXCEL"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSriDetalladosIva.add(this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jComboBoxTiposReportesDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jLabelTiposArchivoReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jComboBoxTiposArchivosReportesDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSriDetalladosIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSriDetalladosIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSriDetalladosIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSriDetalladosIva.setToolTipText("Generar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jButtonGenerarReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSriDetalladosIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSriDetalladosIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSriDetalladosIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSriDetalladosIva.setToolTipText("Cancelar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriDetalladosIva.add(this.jButtonCerrarReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSriDetalladosIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSriDetalladosIva= new JScrollPane(jPanelReporteDinamicoSriDetalladosIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSriDetalladosIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriDetalladosIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriDetalladosIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSriDetalladosIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSriDetalladosIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSriDetalladosIva);
		this.jInternalFrameReporteDinamicoSriDetalladosIva.getContentPane().add(this.jScrollPanelReporteDinamicoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSriDetalladosIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSriDetalladosIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSriDetalladosIva.setName("jPanelImportacionSriDetalladosIva"); 
		
		this.jPanelImportacionSriDetalladosIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriDetalladosIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriDetalladosIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSriDetalladosIva.setLayout(gridaBagLayoutImportacionSriDetalladosIva);
		
		
		this.jInternalFrameImportacionSriDetalladosIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSriDetalladosIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSriDetalladosIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriDetalladosIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSriDetalladosIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriDetalladosIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriDetalladosIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSriDetalladosIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriDetalladosIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriDetalladosIva.setResizable(true);
	    this.jInternalFrameImportacionSriDetalladosIva.setClosable(true);
	    this.jInternalFrameImportacionSriDetalladosIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSriDetalladosIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriDetalladosIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriDetalladosIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSriDetalladosIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriDetalladosIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriDetalladosIva.setResizable(true);
	    this.jInternalFrameImportacionSriDetalladosIva.setClosable(true);
	    this.jInternalFrameImportacionSriDetalladosIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSriDetalladosIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriDetalladosIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriDetalladosIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSriDetalladosIva = new JLabelMe();

		this.jLabelArchivoImportacionSriDetalladosIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriDetalladosIva.add(this.jLabelArchivoImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSriDetalladosIva = new JFileChooser();		
		this.jFileChooserImportacionSriDetalladosIva.setToolTipText("ESCOGER ARCHIVO"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSriDetalladosIva = new JButtonMe();
		this.jButtonAbrirImportacionSriDetalladosIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSriDetalladosIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSriDetalladosIva.setToolTipText("Generar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriDetalladosIva.add(this.jButtonAbrirImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSriDetalladosIva = new JLabelMe();

		this.jLabelPathArchivoImportacionSriDetalladosIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriDetalladosIva.add(this.jLabelPathArchivoImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSriDetalladosIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSriDetalladosIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriDetalladosIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriDetalladosIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriDetalladosIva.add(this.jTextFieldPathArchivoImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSriDetalladosIva = new JButtonMe();
		this.jButtonGenerarImportacionSriDetalladosIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSriDetalladosIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSriDetalladosIva.setToolTipText("Generar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriDetalladosIva.add(this.jButtonGenerarImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSriDetalladosIva = new JButtonMe();
		this.jButtonCerrarImportacionSriDetalladosIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSriDetalladosIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSriDetalladosIva.setToolTipText("Cancelar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriDetalladosIva.add(this.jButtonCerrarImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSriDetalladosIva = new GridBagLayout();
		
		this.jScrollPanelImportacionSriDetalladosIva= new JScrollPane(jPanelImportacionSriDetalladosIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iPosYImportacion;
		this.gridBagConstraintsSriDetalladosIva.gridx =iPosXImportacion;
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSriDetalladosIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSriDetalladosIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSriDetalladosIva);
		this.jInternalFrameImportacionSriDetalladosIva.getContentPane().add(this.jScrollPanelImportacionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySriDetalladosIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySriDetalladosIva = new JButtonMe();
			this.jButtonAbrirOrderBySriDetalladosIva.setText("Orden");
			this.jButtonAbrirOrderBySriDetalladosIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriDetalladosIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySriDetalladosIva";
			inputMap = this.jButtonAbrirOrderBySriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySriDetalladosIva"));
		
		
			GridBagLayout gridaBagLayoutOrderBySriDetalladosIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySriDetalladosIva.setName("jPanelOrderBySriDetalladosIva"); 
			
			this.jPanelOrderBySriDetalladosIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriDetalladosIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriDetalladosIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySriDetalladosIva.setLayout(gridaBagLayoutOrderBySriDetalladosIva);
			
			
			this.jTableDatosSriDetalladosIvaOrderBy = new JTableMe();        
			this.jTableDatosSriDetalladosIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriDetalladosIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriDetalladosIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriDetalladosIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriDetalladosIvaOrderBy.setViewportView(this.jTableDatosSriDetalladosIvaOrderBy);
			this.jTableDatosSriDetalladosIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriDetalladosIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySriDetalladosIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySriDetalladosIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySriDetalladosIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSriDetalladosIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySriDetalladosIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySriDetalladosIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySriDetalladosIva.setTitle("Orden");
			this.jInternalFrameOrderBySriDetalladosIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySriDetalladosIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySriDetalladosIva.setResizable(true);
			this.jInternalFrameOrderBySriDetalladosIva.setClosable(true);
			this.jInternalFrameOrderBySriDetalladosIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySriDetalladosIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriDetalladosIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriDetalladosIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSriDetalladosIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSriDetalladosIva.ipady =150;
				
			this.jPanelOrderBySriDetalladosIva.add(jScrollPanelDatosSriDetalladosIvaOrderBy, this.gridBagConstraintsSriDetalladosIva);//this.jTableDatosSriDetalladosIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySriDetalladosIva = new JButtonMe();
			this.jButtonCerrarOrderBySriDetalladosIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySriDetalladosIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySriDetalladosIva.setToolTipText("Cancelar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSriDetalladosIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySriDetalladosIva.add(this.jButtonCerrarOrderBySriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSriDetalladosIva = new GridBagLayout();
			
			this.jScrollPanelOrderBySriDetalladosIva= new JScrollPane(jPanelOrderBySriDetalladosIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsSriDetalladosIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySriDetalladosIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySriDetalladosIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSriDetalladosIva);
			
			this.jInternalFrameOrderBySriDetalladosIva.getContentPane().add(this.jScrollPanelOrderBySriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
		
		} else {
			this.jButtonAbrirOrderBySriDetalladosIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.sridetalladosivaSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSriDetalladosIva.getRowHeight();//SriDetalladosIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.isSelected()) {
					iHeightTable=SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriDetalladosIva.isSelected()) {
					iHeightTable=SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriDetalladosIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSriDetalladosIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriDetalladosIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriDetalladosIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSriDetalladosIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriDetalladosIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriDetalladosIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySriDetalladosIva!=null && this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy()!=null) {
			//if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySriDetalladosIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySriDetalladosIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySriDetalladosIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSriDetalladosIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriDetalladosIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriDetalladosIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=sridetalladosivaLogic.getSriDetalladosIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sridetalladosivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SriDetalladosIva> TraerSriDetalladosIvaBeans(List<SriDetalladosIva> sridetalladosivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(SriDetalladosIva sridetalladosiva:sridetalladosivas) {
					
				if(!(SriDetalladosIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriDetalladosIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sridetalladosiva.setsDetalleGeneralEntityReporte(SriDetalladosIvaConstantesFunciones.getSriDetalladosIvaDescripcion(sridetalladosiva));
										
						
					
						
					
				} else  {
							
					//sridetalladosiva.setsDetalleGeneralEntityReporte(sridetalladosiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//sridetalladosivabeans.add(sridetalladosivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sridetalladosivas;
    }
	//PARA REPORTES FIN
}
