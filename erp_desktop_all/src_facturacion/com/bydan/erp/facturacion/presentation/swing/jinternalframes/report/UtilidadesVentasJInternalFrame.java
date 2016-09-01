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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.UtilidadesVentasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class UtilidadesVentasJInternalFrame extends UtilidadesVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUtilidadesVentas;
	
	protected JMenuBar jmenuBarUtilidadesVentas;
	
	protected JMenu jmenuUtilidadesVentas;
	protected JMenu jmenuDatosUtilidadesVentas;
	protected JMenu jmenuArchivoUtilidadesVentas;
	protected JMenu jmenuAccionesUtilidadesVentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadesVentas;	
	protected GridBagConstraints gridBagConstraintsUtilidadesVentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UtilidadesVentasDetalleFormJInternalFrame jInternalFrameDetalleFormUtilidadesVentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUtilidadesVentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUtilidadesVentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public UtilidadesVentasSessionBean utilidadesventasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UtilidadesVentas> utilidadesventass;		
	public List<UtilidadesVentas> utilidadesventassEliminados;	
	public List<UtilidadesVentas> utilidadesventassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUtilidadesVentas;		
	protected JButton jButtonAbrirOrderByUtilidadesVentas;
	
	
	//protected JPanel jPanelOrderByUtilidadesVentas;
	//public JScrollPane jScrollPanelOrderByUtilidadesVentas;	
	//protected JButton jButtonCerrarOrderByUtilidadesVentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UtilidadesVentasLogic utilidadesventasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUtilidadesVentas;
	public JScrollPane jScrollPanelDatosEdicionUtilidadesVentas;
	public JScrollPane jScrollPanelDatosGeneralUtilidadesVentas;
    
	
	
	//public JScrollPane jScrollPanelDatosUtilidadesVentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUtilidadesVentas;
	//public JScrollPane jScrollPanelImportacionUtilidadesVentas;
	
	
	
	protected JPanel jPanelAccionesUtilidadesVentas;
	
    protected JPanel jPanelPaginacionUtilidadesVentas;
    protected JPanel jPanelParametrosReportesUtilidadesVentas;
	protected JPanel jPanelParametrosReportesAccionesUtilidadesVentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UtilidadesVentas;
	protected JPanel jPanelParametrosAuxiliar2UtilidadesVentas;
	protected JPanel jPanelParametrosAuxiliar3UtilidadesVentas;
	protected JPanel jPanelParametrosAuxiliar4UtilidadesVentas;
	//protected JPanel jPanelParametrosAuxiliar5UtilidadesVentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoUtilidadesVentas;
	//protected JPanel jPanelImportacionUtilidadesVentas;
	
	
	public JTable jTableDatosUtilidadesVentas;
	
	
	
	//public JTable jTableDatosUtilidadesVentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUtilidadesVentas;
	protected JButton jButtonDuplicarUtilidadesVentas;
	protected JButton jButtonCopiarUtilidadesVentas;
	protected JButton jButtonVerFormUtilidadesVentas;
	protected JButton jButtonNuevoRelacionesUtilidadesVentas;
	protected JButton jButtonModificarUtilidadesVentas;
	
    protected JButton jButtonGuardarCambiosTablaUtilidadesVentas;
	protected JButton jButtonCerrarUtilidadesVentas;
	
	
	protected JButton jButtonRecargarInformacionUtilidadesVentas;
	protected JButton jButtonProcesarInformacionUtilidadesVentas;
	
	
	protected JButton jButtonAnterioresUtilidadesVentas;
	protected JButton jButtonSiguientesUtilidadesVentas;
	protected JButton jButtonNuevoGuardarCambiosUtilidadesVentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUtilidadesVentas;
	//protected JButton jButtonCerrarReporteDinamicoUtilidadesVentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoUtilidadesVentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionUtilidadesVentas;
	//protected JButton jButtonGenerarImportacionUtilidadesVentas;
	//protected JButton jButtonCerrarImportacionUtilidadesVentas;
	//protected JFileChooser jFileChooserImportacionUtilidadesVentas;
	//protected File fileImportacionUtilidadesVentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadesVentas;
	protected JButton jButtonDuplicarToolBarUtilidadesVentas;
	protected JButton jButtonNuevoRelacionesToolBarUtilidadesVentas;
	
	
	public JButton jButtonGuardarCambiosToolBarUtilidadesVentas;
	protected JButton jButtonCopiarToolBarUtilidadesVentas;
	protected JButton jButtonVerFormToolBarUtilidadesVentas;
	public JButton jButtonGuardarCambiosTablaToolBarUtilidadesVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadesVentas;
	protected JButton jButtonCerrarToolBarUtilidadesVentas;
	
	protected JButton jButtonRecargarInformacionToolBarUtilidadesVentas;
	protected JButton jButtonProcesarInformacionToolBarUtilidadesVentas;
	protected JButton jButtonAnterioresToolBarUtilidadesVentas;
	protected JButton jButtonSiguientesToolBarUtilidadesVentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarUtilidadesVentas;
	protected JButton jButtonAbrirOrderByToolBarUtilidadesVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadesVentas;
	protected JMenuItem jMenuItemDuplicarUtilidadesVentas;
	protected JMenuItem jMenuItemNuevoRelacionesUtilidadesVentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUtilidadesVentas;
	protected JMenuItem jMenuItemCopiarUtilidadesVentas;
	protected JMenuItem jMenuItemVerFormUtilidadesVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadesVentas;
	protected JMenuItem jMenuItemCerrarUtilidadesVentas;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadesVentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUtilidadesVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadesVentas;
	
	protected JMenuItem jMenuItemRecargarInformacionUtilidadesVentas;
	protected JMenuItem jMenuItemProcesarInformacionUtilidadesVentas;
	protected JMenuItem jMenuItemAnterioresUtilidadesVentas;
	protected JMenuItem jMenuItemSiguientesUtilidadesVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadesVentas;
	protected JMenuItem jMenuItemAbrirOrderByUtilidadesVentas;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadesVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadesVentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUtilidadesVentas;
	protected JCheckBox jCheckBoxSeleccionadosUtilidadesVentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUtilidadesVentas;
	protected JCheckBox jCheckBoxConGraficoReporteUtilidadesVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUtilidadesVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUtilidadesVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUtilidadesVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUtilidadesVentas;
	protected JTextField jTextFieldValorCampoGeneralUtilidadesVentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUtilidadesVentas;
	//public JList<Reporte> jListColumnasSelectReporteUtilidadesVentas;
	//public JScrollPane jScrollColumnasSelectReporteUtilidadesVentas;
	
	//public JLabel jLabelRelacionesSelectReporteUtilidadesVentas;
	//public JList<Reporte> jListRelacionesSelectReporteUtilidadesVentas;
	//public JScrollPane jScrollRelacionesSelectReporteUtilidadesVentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUtilidadesVentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUtilidadesVentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUtilidadesVentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoUtilidadesVentas;
	
		
	//public JLabel jLabelArchivoImportacionUtilidadesVentas;	
	//public JLabel jLabelPathArchivoImportacionUtilidadesVentas;
	//protected JTextField jTextFieldPathArchivoImportacionUtilidadesVentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUtilidadesVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUtilidadesVentas;
	
	//public JLabel jLabelColumnaCategoriaValorUtilidadesVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUtilidadesVentas;
	
	//public JLabel jLabelColumnasValoresGraficoUtilidadesVentas;
	//public JList<Reporte> jListColumnasValoresGraficoUtilidadesVentas;
	//public JScrollPane jScrollColumnasValoresGraficoUtilidadesVentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUtilidadesVentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUtilidadesVentas;
	public JPanel jPanelBusquedaUtilidadesVentasUtilidadesVentas;
	public JButton jButtonBusquedaUtilidadesVentasUtilidadesVentas;
	
	public JPanel jPanelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas;
	public JLabel jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas;
	public JButton jButtonfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas;
	public JLabel jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas;
	public JButton jButtonfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UtilidadesVentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUtilidadesVentas)	{
		this.jButtonRecargarInformacionUtilidadesVentas = jButtonRecargarInformacionUtilidadesVentas;
	}
	
	public JButton getjButtonProcesarInformacionUtilidadesVentas() {
		return this.jButtonProcesarInformacionUtilidadesVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadesVentas)	{
		this.jButtonProcesarInformacionUtilidadesVentas = jButtonProcesarInformacionUtilidadesVentas;
	}
	
	
	public JButton getjButtonRecargarInformacionUtilidadesVentas() {
		return this.jButtonRecargarInformacionUtilidadesVentas;
	}
	
	
	public List<UtilidadesVentas> getutilidadesventass() {
		return this.utilidadesventass;
	}

	public void setutilidadesventass(List<UtilidadesVentas> utilidadesventass) {
		this.utilidadesventass = utilidadesventass;
	}
	
	public List<UtilidadesVentas> getutilidadesventassAux() {
		return this.utilidadesventassAux;
	}

	public void setutilidadesventassAux(List<UtilidadesVentas> utilidadesventassAux) {
		this.utilidadesventassAux = utilidadesventassAux;
	}
	
	public List<UtilidadesVentas> getutilidadesventassEliminados() {
		return this.utilidadesventassEliminados;
	}

	public void setUtilidadesVentassEliminados(List<UtilidadesVentas> utilidadesventassEliminados) {
		this.utilidadesventassEliminados = utilidadesventassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUtilidadesVentas() {
		return jComboBoxTiposSeleccionarUtilidadesVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUtilidadesVentas(
			JComboBox jComboBoxTiposSeleccionarUtilidadesVentas) {
		this.jComboBoxTiposSeleccionarUtilidadesVentas = jComboBoxTiposSeleccionarUtilidadesVentas;
	}
	
	public void setBorderResaltarTiposSeleccionarUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUtilidadesVentas() {
		return jTextFieldValorCampoGeneralUtilidadesVentas;
	}

	public void setjTextFieldValorCampoGeneralUtilidadesVentas(
			JTextField jTextFieldValorCampoGeneralUtilidadesVentas) {
		this.jTextFieldValorCampoGeneralUtilidadesVentas = jTextFieldValorCampoGeneralUtilidadesVentas;
	}

	public void setBorderResaltarValorCampoGeneralUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUtilidadesVentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUtilidadesVentas() {
		return this.jCheckBoxSeleccionarTodosUtilidadesVentas;
	}

	public void setjCheckBoxSeleccionarTodosUtilidadesVentas(
			JCheckBox jCheckBoxSeleccionarTodosUtilidadesVentas) {
		this.jCheckBoxSeleccionarTodosUtilidadesVentas = jCheckBoxSeleccionarTodosUtilidadesVentas;
	}

	public void setBorderResaltarSeleccionarTodosUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUtilidadesVentas() {
		return this.jCheckBoxSeleccionadosUtilidadesVentas;
	}

	public void setjCheckBoxSeleccionadosUtilidadesVentas(
			JCheckBox jCheckBoxSeleccionadosUtilidadesVentas) {
		this.jCheckBoxSeleccionadosUtilidadesVentas = jCheckBoxSeleccionadosUtilidadesVentas;
	}
	
	public void setBorderResaltarSeleccionadosUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUtilidadesVentas() {
		return this.jComboBoxTiposArchivosReportesUtilidadesVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUtilidadesVentas(
			JComboBox jComboBoxTiposArchivosReportesUtilidadesVentas) {
		this.jComboBoxTiposArchivosReportesUtilidadesVentas = jComboBoxTiposArchivosReportesUtilidadesVentas;
	}

	public void setBorderResaltarTiposArchivosReportesUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUtilidadesVentas() {
		return this.jComboBoxTiposReportesUtilidadesVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUtilidadesVentas(
			JComboBox jComboBoxTiposReportesUtilidadesVentas) {
		this.jComboBoxTiposReportesUtilidadesVentas = jComboBoxTiposReportesUtilidadesVentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUtilidadesVentas() {
	//	return jComboBoxTiposReportesDinamicoUtilidadesVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUtilidadesVentas(
	//		JComboBox jComboBoxTiposReportesDinamicoUtilidadesVentas) {
	//	this.jComboBoxTiposReportesDinamicoUtilidadesVentas = jComboBoxTiposReportesDinamicoUtilidadesVentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUtilidadesVentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUtilidadesVentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas = jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas;
	//}
	
	public void setBorderResaltarTiposReportesUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUtilidadesVentas() {
		return this.jComboBoxTiposGraficosReportesUtilidadesVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUtilidadesVentas(
			JComboBox jComboBoxTiposGraficosReportesUtilidadesVentas) {
		this.jComboBoxTiposGraficosReportesUtilidadesVentas = jComboBoxTiposGraficosReportesUtilidadesVentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUtilidadesVentas() {
		return this.jComboBoxTiposPaginacionUtilidadesVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUtilidadesVentas(
			JComboBox jComboBoxTiposPaginacionUtilidadesVentas) {
		this.jComboBoxTiposPaginacionUtilidadesVentas = jComboBoxTiposPaginacionUtilidadesVentas;
	}
	
	public void setBorderResaltarTiposPaginacionUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUtilidadesVentas() {
		return this.jComboBoxTiposRelacionesUtilidadesVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadesVentas() {
		return this.jComboBoxTiposAccionesUtilidadesVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadesVentas(
			JComboBox jComboBoxTiposRelacionesUtilidadesVentas) {
		this.jComboBoxTiposRelacionesUtilidadesVentas = jComboBoxTiposRelacionesUtilidadesVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadesVentas(
			JComboBox jComboBoxTiposAccionesUtilidadesVentas) {
		this.jComboBoxTiposAccionesUtilidadesVentas = jComboBoxTiposAccionesUtilidadesVentas;
	}
	
	public void setBorderResaltarTiposRelacionesUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUtilidadesVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUtilidadesVentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUtilidadesVentas() {
	//	return jCheckBoxConGraficoDinamicoUtilidadesVentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoUtilidadesVentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoUtilidadesVentas) {
	//	this.jCheckBoxConGraficoDinamicoUtilidadesVentas = jCheckBoxConGraficoDinamicoUtilidadesVentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUtilidadesVentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUtilidadesVentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUtilidadesVentas .setBorder(borderResaltar);		
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
		this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
		
		this.utilidadesventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadesventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadesventasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadesVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidades Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
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
		
		UtilidadesVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUtilidadesVentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"nuevo","nuevo","Nuevo"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"duplicar","duplicar","Duplicar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"copiar","copiar","Copiar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"ver_form","ver_form","Ver"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"recargar","recargar","Buscar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUtilidadesVentas,this.jTtoolBarUtilidadesVentas,
							"cerrar","cerrar","Salir"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUtilidadesVentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUtilidadesVentas;
			
				this.jButtonProcesarInformacionToolBarUtilidadesVentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUtilidadesVentas;
				
		//protected JButton jButtonModificarToolBarUtilidadesVentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUtilidadesVentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUtilidadesVentas=new JMenuMe("General");
		this.jmenuArchivoUtilidadesVentas=new JMenuMe("Archivo");
		this.jmenuAccionesUtilidadesVentas=new JMenuMe("Acciones");
		this.jmenuDatosUtilidadesVentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadesVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadesVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadesVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUtilidadesVentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUtilidadesVentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUtilidadesVentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUtilidadesVentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUtilidadesVentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUtilidadesVentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUtilidadesVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadesVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadesVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUtilidadesVentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUtilidadesVentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUtilidadesVentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUtilidadesVentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUtilidadesVentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUtilidadesVentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUtilidadesVentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUtilidadesVentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUtilidadesVentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadesVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadesVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadesVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUtilidadesVentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUtilidadesVentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUtilidadesVentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUtilidadesVentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUtilidadesVentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUtilidadesVentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUtilidadesVentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUtilidadesVentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUtilidadesVentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUtilidadesVentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUtilidadesVentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUtilidadesVentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUtilidadesVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUtilidadesVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUtilidadesVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadesVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadesVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadesVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUtilidadesVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUtilidadesVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUtilidadesVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadesVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadesVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadesVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUtilidadesVentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUtilidadesVentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUtilidadesVentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUtilidadesVentas.add(this.jMenuItemCerrarUtilidadesVentas);
			
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemNuevoUtilidadesVentas);
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemNuevoGuardarCambiosUtilidadesVentas);
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemNuevoRelacionesUtilidadesVentas);
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemGuardarCambiosTablaUtilidadesVentas);		
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemDuplicarUtilidadesVentas);		
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemCopiarUtilidadesVentas);		
			this.jmenuAccionesUtilidadesVentas.add(this.jMenuItemVerFormUtilidadesVentas);		
			
			this.jmenuDatosUtilidadesVentas.add(this.jMenuItemRecargarInformacionUtilidadesVentas);				
			this.jmenuDatosUtilidadesVentas.add(this.jMenuItemAnterioresUtilidadesVentas);				
			this.jmenuDatosUtilidadesVentas.add(this.jMenuItemSiguientesUtilidadesVentas);				
			this.jmenuDatosUtilidadesVentas.add(this.jMenuItemAbrirOrderByUtilidadesVentas);				
			this.jmenuDatosUtilidadesVentas.add(this.jMenuItemMostrarOcultarUtilidadesVentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUtilidadesVentas.add(this.jMenuItemGuardarCambiosUtilidadesVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUtilidadesVentas.add(this.jmenuArchivoUtilidadesVentas);		
			this.jmenuBarUtilidadesVentas.add(this.jmenuAccionesUtilidadesVentas);		
			this.jmenuBarUtilidadesVentas.add(this.jmenuDatosUtilidadesVentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUtilidadesVentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUtilidadesVentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaUtilidadesVentasUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaUtilidadesVentasUtilidadesVentas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaUtilidadesVentasUtilidadesVentas= new JButtonMe();
		this.jButtonBusquedaUtilidadesVentasUtilidadesVentas.setText("Buscar");
		this.jButtonBusquedaUtilidadesVentasUtilidadesVentas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaUtilidadesVentasUtilidadesVentas,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaUtilidadesVentasUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasUtilidadesVentas=new JTabbedPane();


		this.jTabbedPaneBusquedasUtilidadesVentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadesVentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadesVentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUtilidadesVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUtilidadesVentas = new UtilidadesVentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Utilidades Ventas DATOS");
			this.jInternalFrameDetalleFormUtilidadesVentas = new UtilidadesVentasDetalleFormJInternalFrame(jDesktopPane,this.utilidadesventasSessionBean.getConGuardarRelaciones(),this.utilidadesventasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUtilidadesVentas = null;//new UtilidadesVentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadesVentas= new GridBagLayout();
		
		
		this.jTableDatosUtilidadesVentas = new JTableMe();      
		
		String sToolTipUtilidadesVentas="";
		sToolTipUtilidadesVentas=UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadesVentas+="(Facturacion.UtilidadesVentas)";
		}
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadesVentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUtilidadesVentas.setToolTipText(sToolTipUtilidadesVentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUtilidadesVentas);
		this.jTableDatosUtilidadesVentas.setAutoCreateRowSorter(true);
		this.jTableDatosUtilidadesVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUtilidadesVentas.setRowSelectionAllowed(true);
		this.jTableDatosUtilidadesVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUtilidadesVentas = new JButtonMe();
		this.jButtonDuplicarUtilidadesVentas = new JButtonMe();
		this.jButtonCopiarUtilidadesVentas = new JButtonMe();
		this.jButtonVerFormUtilidadesVentas = new JButtonMe();
		this.jButtonNuevoRelacionesUtilidadesVentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas = new JButtonMe();
		this.jButtonCerrarUtilidadesVentas = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadesVentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralUtilidadesVentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidades Ventas";
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadesVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadesVentas.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadesVentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUtilidadesVentas=new ReporteDinamicoJInternalFrame(UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUtilidadesVentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUtilidadesVentas=new ImportacionJInternalFrame(UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUtilidadesVentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUtilidadesVentas = new JButtonMe();
		
		this.jButtonAbrirOrderByUtilidadesVentas.setText("Orden");
		this.jButtonAbrirOrderByUtilidadesVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadesVentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadesVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadesVentas,false,this);
			
			//this.cargarOrderByUtilidadesVentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadesVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadesVentas,true,this);
			
			//this.cargarOrderByUtilidadesVentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUtilidadesVentas.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosUtilidadesVentas.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosUtilidadesVentas.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosUtilidadesVentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadesVentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadesVentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUtilidadesVentas.setText("Nuevo");
		this.jButtonDuplicarUtilidadesVentas.setText("Duplicar");
		this.jButtonCopiarUtilidadesVentas.setText("Copiar");
		this.jButtonVerFormUtilidadesVentas.setText("Ver");
		this.jButtonNuevoRelacionesUtilidadesVentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.setText("Guardar");
		this.jButtonCerrarUtilidadesVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadesVentas,"nuevo_button","Nuevo",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUtilidadesVentas,"duplicar_button","Duplicar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUtilidadesVentas,"copiar_button","Copiar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUtilidadesVentas,"ver_form","Ver",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUtilidadesVentas,"nuevorelaciones_button","Nuevo Rel",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadesVentas,"guardarcambiostabla_button","Guardar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadesVentas,"cerrar_button","Salir",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUtilidadesVentas.setToolTipText("Nuevo"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUtilidadesVentas.setToolTipText("Duplicar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUtilidadesVentas.setToolTipText("Copiar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUtilidadesVentas.setToolTipText("Ver"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUtilidadesVentas.setToolTipText("Nuevo Rel"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.setToolTipText("Guardar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadesVentas.setToolTipText("Salir"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadesVentas";
		inputMap = this.jButtonNuevoUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadesVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadesVentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarUtilidadesVentas";
		inputMap = this.jButtonDuplicarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUtilidadesVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUtilidadesVentas"));
		
		//COPIAR
		sMapKey = "CopiarUtilidadesVentas";
		inputMap = this.jButtonCopiarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUtilidadesVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUtilidadesVentas"));
		
		//VEr FORM
		sMapKey = "VerFormUtilidadesVentas";
		inputMap = this.jButtonVerFormUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUtilidadesVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUtilidadesVentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUtilidadesVentas";
		inputMap = this.jButtonNuevoRelacionesUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUtilidadesVentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUtilidadesVentas";
		inputMap = this.jButtonModificarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUtilidadesVentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUtilidadesVentas";
		inputMap = this.jButtonCerrarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadesVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadesVentas";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadesVentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUtilidadesVentas.setName("jPanelParametrosReportesUtilidadesVentas"); 
		
		this.jPanelParametrosReportesAccionesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUtilidadesVentas.setName("jPanelParametrosReportesAccionesUtilidadesVentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUtilidadesVentas = new JButtonMe();
		this.jButtonRecargarInformacionUtilidadesVentas.setText("Buscar");
		this.jButtonRecargarInformacionUtilidadesVentas.setToolTipText("Buscar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUtilidadesVentas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionUtilidadesVentas.setVisible(false);
		
		
		this.jButtonProcesarInformacionUtilidadesVentas = new JButtonMe();
		this.jButtonProcesarInformacionUtilidadesVentas.setText("Procesar");
		this.jButtonProcesarInformacionUtilidadesVentas.setToolTipText("Procesar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUtilidadesVentas.setVisible(false);
			
		this.jButtonProcesarInformacionUtilidadesVentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadesVentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadesVentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadesVentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUtilidadesVentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadesVentas.setText("TIPO");       
		this.jComboBoxTiposReportesUtilidadesVentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadesVentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUtilidadesVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUtilidadesVentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionUtilidadesVentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUtilidadesVentas.setText("Accion");
		this.jComboBoxTiposRelacionesUtilidadesVentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadesVentas.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadesVentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUtilidadesVentas.setText("Accion");
		this.jComboBoxTiposSeleccionarUtilidadesVentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUtilidadesVentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUtilidadesVentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadesVentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadesVentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUtilidadesVentas = new JLabelMe();
		
		this.jLabelAccionesUtilidadesVentas.setText("Acciones");		
		this.jLabelAccionesUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUtilidadesVentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUtilidadesVentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUtilidadesVentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUtilidadesVentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUtilidadesVentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUtilidadesVentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUtilidadesVentas.setText("Graf.");
		this.jCheckBoxConGraficoReporteUtilidadesVentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUtilidadesVentas = new JButtonMe();
		//this.jButtonAnterioresUtilidadesVentas.setText("<<");
        this.jButtonAnterioresUtilidadesVentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUtilidadesVentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUtilidadesVentas = new JButtonMe();
		//this.jButtonSiguientesUtilidadesVentas.setText(">>");
        this.jButtonSiguientesUtilidadesVentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUtilidadesVentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUtilidadesVentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUtilidadesVentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosUtilidadesVentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUtilidadesVentas,"nuevoguardarcambios_button","Nue",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUtilidadesVentas";
		inputMap = this.jButtonNuevoGuardarCambiosUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUtilidadesVentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUtilidadesVentas";
		inputMap = this.jButtonRecargarInformacionUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUtilidadesVentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUtilidadesVentas";
		inputMap = this.jButtonSiguientesUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUtilidadesVentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUtilidadesVentas";
		inputMap = this.jButtonAnterioresUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUtilidadesVentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUtilidadesVentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUtilidadesVentas.setMinimumSize(new Dimension(this.getWidth(),UtilidadesVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadesVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadesVentas.setMaximumSize(new Dimension(this.getWidth(),UtilidadesVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadesVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadesVentas.setPreferredSize(new Dimension(this.getWidth(),UtilidadesVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadesVentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUtilidadesVentas = new GridBagLayout();

			this.jPanelPaginacionUtilidadesVentas.setLayout(gridaBagLayoutPaginacionUtilidadesVentas);						
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 0;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonAnterioresUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					
						
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadesVentas.gridy = 0;
			
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonNuevoGuardarCambiosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
						
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadesVentas.gridy = 0;
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonSiguientesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 1;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonNuevoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
						
			
			
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
				this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUtilidadesVentas.gridy = 1;
				this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUtilidadesVentas.add(this.jButtonGuardarCambiosTablaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			}
			
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 1;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonDuplicarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 1;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonCopiarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 1;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonVerFormUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 1;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUtilidadesVentas.add(this.jButtonCerrarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		
		this.jButtonRecargarInformacionUtilidadesVentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadesVentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadesVentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUtilidadesVentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadesVentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadesVentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUtilidadesVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadesVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadesVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUtilidadesVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadesVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadesVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUtilidadesVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadesVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadesVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUtilidadesVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadesVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadesVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUtilidadesVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadesVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadesVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUtilidadesVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadesVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadesVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUtilidadesVentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadesVentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadesVentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUtilidadesVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadesVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadesVentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUtilidadesVentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadesVentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadesVentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUtilidadesVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUtilidadesVentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UtilidadesVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UtilidadesVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UtilidadesVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UtilidadesVentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUtilidadesVentas.setLayout(gridaBagParametrosReportesUtilidadesVentas);
			this.jPanelParametrosReportesAccionesUtilidadesVentas.setLayout(gridaBagParametrosReportesAccionesUtilidadesVentas);
			
			
			this.jPanelParametrosAuxiliar1UtilidadesVentas.setLayout(gridaBagParametrosAuxiliar1UtilidadesVentas);
			this.jPanelParametrosAuxiliar2UtilidadesVentas.setLayout(gridaBagParametrosAuxiliar2UtilidadesVentas);
			this.jPanelParametrosAuxiliar3UtilidadesVentas.setLayout(gridaBagParametrosAuxiliar3UtilidadesVentas);
			this.jPanelParametrosAuxiliar4UtilidadesVentas.setLayout(gridaBagParametrosAuxiliar4UtilidadesVentas);
			//this.jPanelParametrosAuxiliar5UtilidadesVentas.setLayout(gridaBagParametrosAuxiliar2UtilidadesVentas);			
			
			
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jButtonRecargarInformacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadesVentas.add(this.jComboBoxTiposPaginacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadesVentas.add(this.jCheckBoxConAltoMaximoTablaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadesVentas.add(this.jComboBoxTiposArchivosReportesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jPanelParametrosAuxiliar1UtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UtilidadesVentas.add(this.jComboBoxTiposReportesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);																		
			
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4UtilidadesVentas.add(this.jComboBoxTiposGraficosReportesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jPanelParametrosAuxiliar4UtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jComboBoxTiposReportesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jCheckBoxGenerarReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jPanelParametrosAuxiliar2UtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jLabelAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
				this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUtilidadesVentas.add(this.jButtonAbrirOrderByUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jComboBoxTiposSeleccionarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
			
			
			/*
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jCheckBoxSeleccionarTodosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jCheckBoxConGraficoReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadesVentas.add(this.jCheckBoxSeleccionarTodosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);															
				
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadesVentas.add(this.jCheckBoxSeleccionadosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);															
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadesVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadesVentas.add(this.jCheckBoxConGraficoReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jPanelParametrosAuxiliar3UtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadesVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadesVentas.add(this.jComboBoxTiposAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUtilidadesVentas = new GridBagLayout();

			this.jScrollPanelDatosUtilidadesVentas.setLayout(gridaBagLayoutDatosUtilidadesVentas);
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = 0;
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;
			
			this.jScrollPanelDatosUtilidadesVentas.add(this.jTableDatosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUtilidadesVentas.setViewportView(this.jTableDatosUtilidadesVentas);
		this.jTableDatosUtilidadesVentas.setFillsViewportHeight(true);
		this.jTableDatosUtilidadesVentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUtilidadesVentas= new GridBagLayout();
		this.jPanelAccionesUtilidadesVentas.setLayout(gridaBagLayoutAccionesUtilidadesVentas);
		
		
		/*	
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
			
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonNuevoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas= new GridBagLayout();
		gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.setLayout(gridaBagLayoutBusquedaUtilidadesVentasUtilidadesVentas);

		gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadesVentas.gridy = 0;
		gridBagConstraintsUtilidadesVentas.gridx = 0;
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.add(jLabelfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas, gridBagConstraintsUtilidadesVentas);

		gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadesVentas.gridy = 0;
		gridBagConstraintsUtilidadesVentas.gridx = 1;
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.add(jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas, gridBagConstraintsUtilidadesVentas);


		gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadesVentas.gridy = 1;
		gridBagConstraintsUtilidadesVentas.gridx = 0;
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.add(jLabelfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas, gridBagConstraintsUtilidadesVentas);

		gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadesVentas.gridy = 1;
		gridBagConstraintsUtilidadesVentas.gridx = 1;
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.add(jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas, gridBagConstraintsUtilidadesVentas);

		gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadesVentas.gridy = 2;
		gridBagConstraintsUtilidadesVentas.gridx =1;
		jPanelBusquedaUtilidadesVentasUtilidadesVentas.add(jButtonBusquedaUtilidadesVentasUtilidadesVentas, gridBagConstraintsUtilidadesVentas);

		jTabbedPaneBusquedasUtilidadesVentas.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaUtilidadesVentasUtilidadesVentas);
		jTabbedPaneBusquedasUtilidadesVentas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadesVentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;		
			//this.gridBagConstraintsUtilidadesVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadesVentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;		
		//this.gridBagConstraintsUtilidadesVentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUtilidadesVentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;		
			this.gridBagConstraintsUtilidadesVentas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUtilidadesVentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);								
		
		
		/*
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		*/		
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadesVentas.gridx =0;
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadesVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
				
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUtilidadesVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadesVentas = new GridBagLayout();
			this.jPanelBusquedasParametrosUtilidadesVentas.setLayout(gridaBagLayoutBusquedasParametrosUtilidadesVentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUtilidadesVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadesVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadesVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadesVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUtilidadesVentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUtilidadesVentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUtilidadesVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUtilidadesVentas.setName("jPanelReporteDinamicoUtilidadesVentas"); 
		
		this.jPanelReporteDinamicoUtilidadesVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadesVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadesVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUtilidadesVentas.setLayout(gridaBagLayoutReporteDinamicoUtilidadesVentas);
		
		
		this.jInternalFrameReporteDinamicoUtilidadesVentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUtilidadesVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadesVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUtilidadesVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUtilidadesVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUtilidadesVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUtilidadesVentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUtilidadesVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUtilidadesVentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoUtilidadesVentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoUtilidadesVentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUtilidadesVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadesVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadesVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUtilidadesVentas = new JLabelMe();

		this.jLabelColumnasSelectReporteUtilidadesVentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelColumnasSelectReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUtilidadesVentas = new JList<Reporte>();
		this.jListColumnasSelectReporteUtilidadesVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUtilidadesVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUtilidadesVentas=new JScrollPane(this.jListColumnasSelectReporteUtilidadesVentas);
			
			this.jScrollColumnasSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUtilidadesVentas.add(this.jListColumnasSelectReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jScrollColumnasSelectReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUtilidadesVentas = new JLabelMe();

		this.jLabelRelacionesSelectReporteUtilidadesVentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUtilidadesVentas = new JList<Reporte>();
		this.jListRelacionesSelectReporteUtilidadesVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUtilidadesVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUtilidadesVentas=new JScrollPane(this.jListRelacionesSelectReporteUtilidadesVentas);
			
			this.jScrollRelacionesSelectReporteUtilidadesVentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadesVentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadesVentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUtilidadesVentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoUtilidadesVentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUtilidadesVentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUtilidadesVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUtilidadesVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadesVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadesVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoUtilidadesVentas = new JLabelMe();

		this.jLabelConGraficoDinamicoUtilidadesVentas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelConGraficoDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoUtilidadesVentas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoUtilidadesVentas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoUtilidadesVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadesVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadesVentas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jCheckBoxConGraficoDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoUtilidadesVentas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoUtilidadesVentas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelColumnaCategoriaGraficoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorUtilidadesVentas = new JLabelMe();

		this.jLabelColumnaCategoriaValorUtilidadesVentas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelColumnaCategoriaValorUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorUtilidadesVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorUtilidadesVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorUtilidadesVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadesVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadesVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jComboBoxColumnaCategoriaValorUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoUtilidadesVentas = new JLabelMe();

		this.jLabelColumnasValoresGraficoUtilidadesVentas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelColumnasValoresGraficoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoUtilidadesVentas = new JList<Reporte>();
		this.jListColumnasValoresGraficoUtilidadesVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoUtilidadesVentas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoUtilidadesVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadesVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadesVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoUtilidadesVentas=new JScrollPane(this.jListColumnasValoresGraficoUtilidadesVentas);
			
			this.jScrollColumnasValoresGraficoUtilidadesVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadesVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadesVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoUtilidadesVentas.add(this.jListColumnasSelectReporteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jScrollColumnasValoresGraficoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelTiposGraficosReportesDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadesVentas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jComboBoxTiposGraficosReportesDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelGenerarExcelReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas.setToolTipText("Generar EXCEL"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUtilidadesVentas.add(this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jComboBoxTiposReportesDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jLabelTiposArchivoReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jComboBoxTiposArchivosReportesDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUtilidadesVentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUtilidadesVentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUtilidadesVentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUtilidadesVentas.setToolTipText("Generar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jButtonGenerarReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUtilidadesVentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUtilidadesVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUtilidadesVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUtilidadesVentas.setToolTipText("Cancelar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadesVentas.add(this.jButtonCerrarReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUtilidadesVentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUtilidadesVentas= new JScrollPane(jPanelReporteDinamicoUtilidadesVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUtilidadesVentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadesVentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadesVentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUtilidadesVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUtilidadesVentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUtilidadesVentas);
		this.jInternalFrameReporteDinamicoUtilidadesVentas.getContentPane().add(this.jScrollPanelReporteDinamicoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUtilidadesVentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUtilidadesVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUtilidadesVentas.setName("jPanelImportacionUtilidadesVentas"); 
		
		this.jPanelImportacionUtilidadesVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadesVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadesVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUtilidadesVentas.setLayout(gridaBagLayoutImportacionUtilidadesVentas);
		
		
		this.jInternalFrameImportacionUtilidadesVentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUtilidadesVentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUtilidadesVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadesVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUtilidadesVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadesVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadesVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUtilidadesVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadesVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadesVentas.setResizable(true);
	    this.jInternalFrameImportacionUtilidadesVentas.setClosable(true);
	    this.jInternalFrameImportacionUtilidadesVentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUtilidadesVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadesVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadesVentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUtilidadesVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadesVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadesVentas.setResizable(true);
	    this.jInternalFrameImportacionUtilidadesVentas.setClosable(true);
	    this.jInternalFrameImportacionUtilidadesVentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUtilidadesVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadesVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadesVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUtilidadesVentas = new JLabelMe();

		this.jLabelArchivoImportacionUtilidadesVentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadesVentas.add(this.jLabelArchivoImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUtilidadesVentas = new JFileChooser();		
		this.jFileChooserImportacionUtilidadesVentas.setToolTipText("ESCOGER ARCHIVO"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUtilidadesVentas = new JButtonMe();
		this.jButtonAbrirImportacionUtilidadesVentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUtilidadesVentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUtilidadesVentas.setToolTipText("Generar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadesVentas.add(this.jButtonAbrirImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUtilidadesVentas = new JLabelMe();

		this.jLabelPathArchivoImportacionUtilidadesVentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadesVentas.add(this.jLabelPathArchivoImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUtilidadesVentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUtilidadesVentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadesVentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadesVentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadesVentas.add(this.jTextFieldPathArchivoImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUtilidadesVentas = new JButtonMe();
		this.jButtonGenerarImportacionUtilidadesVentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUtilidadesVentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUtilidadesVentas.setToolTipText("Generar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadesVentas.add(this.jButtonGenerarImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUtilidadesVentas = new JButtonMe();
		this.jButtonCerrarImportacionUtilidadesVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUtilidadesVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUtilidadesVentas.setToolTipText("Cancelar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadesVentas.add(this.jButtonCerrarImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUtilidadesVentas = new GridBagLayout();
		
		this.jScrollPanelImportacionUtilidadesVentas= new JScrollPane(jPanelImportacionUtilidadesVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iPosYImportacion;
		this.gridBagConstraintsUtilidadesVentas.gridx =iPosXImportacion;
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUtilidadesVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUtilidadesVentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUtilidadesVentas);
		this.jInternalFrameImportacionUtilidadesVentas.getContentPane().add(this.jScrollPanelImportacionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUtilidadesVentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUtilidadesVentas = new JButtonMe();
			this.jButtonAbrirOrderByUtilidadesVentas.setText("Orden");
			this.jButtonAbrirOrderByUtilidadesVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadesVentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUtilidadesVentas";
			inputMap = this.jButtonAbrirOrderByUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUtilidadesVentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByUtilidadesVentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUtilidadesVentas.setName("jPanelOrderByUtilidadesVentas"); 
			
			this.jPanelOrderByUtilidadesVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadesVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadesVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUtilidadesVentas.setLayout(gridaBagLayoutOrderByUtilidadesVentas);
			
			
			this.jTableDatosUtilidadesVentasOrderBy = new JTableMe();        
			this.jTableDatosUtilidadesVentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUtilidadesVentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUtilidadesVentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUtilidadesVentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUtilidadesVentasOrderBy.setViewportView(this.jTableDatosUtilidadesVentasOrderBy);
			this.jTableDatosUtilidadesVentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUtilidadesVentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUtilidadesVentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUtilidadesVentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUtilidadesVentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUtilidadesVentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUtilidadesVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUtilidadesVentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUtilidadesVentas.setTitle("Orden");
			this.jInternalFrameOrderByUtilidadesVentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUtilidadesVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUtilidadesVentas.setResizable(true);
			this.jInternalFrameOrderByUtilidadesVentas.setClosable(true);
			this.jInternalFrameOrderByUtilidadesVentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUtilidadesVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadesVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadesVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUtilidadesVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUtilidadesVentas.ipady =150;
				
			this.jPanelOrderByUtilidadesVentas.add(jScrollPanelDatosUtilidadesVentasOrderBy, this.gridBagConstraintsUtilidadesVentas);//this.jTableDatosUtilidadesVentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUtilidadesVentas = new JButtonMe();
			this.jButtonCerrarOrderByUtilidadesVentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUtilidadesVentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUtilidadesVentas.setToolTipText("Cancelar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUtilidadesVentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUtilidadesVentas.add(this.jButtonCerrarOrderByUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUtilidadesVentas = new GridBagLayout();
			
			this.jScrollPanelOrderByUtilidadesVentas= new JScrollPane(jPanelOrderByUtilidadesVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsUtilidadesVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUtilidadesVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUtilidadesVentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUtilidadesVentas);
			
			this.jInternalFrameOrderByUtilidadesVentas.getContentPane().add(this.jScrollPanelOrderByUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
		
		} else {
			this.jButtonAbrirOrderByUtilidadesVentas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.utilidadesventasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosUtilidadesVentas.getRowHeight();//UtilidadesVentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.isSelected()) {
					iHeightTable=UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadesVentas.isSelected()) {
					iHeightTable=UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadesVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUtilidadesVentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadesVentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadesVentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUtilidadesVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadesVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadesVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUtilidadesVentas!=null && this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy()!=null) {
			//if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUtilidadesVentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUtilidadesVentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUtilidadesVentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUtilidadesVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadesVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadesVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=utilidadesventasLogic.getUtilidadesVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadesventass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UtilidadesVentas> TraerUtilidadesVentasBeans(List<UtilidadesVentas> utilidadesventass,ArrayList<Classe> classes)throws Exception {
		try {
			for(UtilidadesVentas utilidadesventas:utilidadesventass) {
					
				if(!(UtilidadesVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UtilidadesVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					utilidadesventas.setsDetalleGeneralEntityReporte(UtilidadesVentasConstantesFunciones.getUtilidadesVentasDescripcion(utilidadesventas));
										
						
					
						
					
				} else  {
							
					//utilidadesventas.setsDetalleGeneralEntityReporte(utilidadesventas.getsDetalleGeneralEntityReporte());
										
				}
				
				//utilidadesventasbeans.add(utilidadesventasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return utilidadesventass;
    }
	//PARA REPORTES FIN
}
