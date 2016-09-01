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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.CentroCostoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class CentroCostoJInternalFrame extends CentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCentroCosto;
	
	protected JMenuBar jmenuBarCentroCosto;
	
	protected JMenu jmenuCentroCosto;
	protected JMenu jmenuDatosCentroCosto;
	protected JMenu jmenuArchivoCentroCosto;
	protected JMenu jmenuAccionesCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCosto;	
	protected GridBagConstraints gridBagConstraintsCentroCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CentroCostoDetalleFormJInternalFrame jInternalFrameDetalleFormCentroCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCentroCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCentroCosto;	
	
	
	public CentroCostoBeanSwingJInternalFrameTree jInternalFrameTreeCentroCosto;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoSessionBean centrocostoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CentroCosto> centrocostos;		
	public List<CentroCosto> centrocostosEliminados;	
	public List<CentroCosto> centrocostosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCentroCosto;		
	protected JButton jButtonAbrirOrderByCentroCosto;
	
	
	//protected JPanel jPanelOrderByCentroCosto;
	//public JScrollPane jScrollPanelOrderByCentroCosto;	
	//protected JButton jButtonCerrarOrderByCentroCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CentroCostoLogic centrocostoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralCentroCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosCentroCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCentroCosto;
	//public JScrollPane jScrollPanelImportacionCentroCosto;
	
	
	
	protected JPanel jPanelAccionesCentroCosto;
	
    protected JPanel jPanelPaginacionCentroCosto;
    protected JPanel jPanelParametrosReportesCentroCosto;
	protected JPanel jPanelParametrosReportesAccionesCentroCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CentroCosto;
	protected JPanel jPanelParametrosAuxiliar2CentroCosto;
	protected JPanel jPanelParametrosAuxiliar3CentroCosto;
	protected JPanel jPanelParametrosAuxiliar4CentroCosto;
	//protected JPanel jPanelParametrosAuxiliar5CentroCosto;
	
	
	
	//protected JPanel jPanelReporteDinamicoCentroCosto;
	//protected JPanel jPanelImportacionCentroCosto;
	
	
	public JTable jTableDatosCentroCosto;
	
	
	
	//public JTable jTableDatosCentroCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCentroCosto;
	protected JButton jButtonDuplicarCentroCosto;
	protected JButton jButtonCopiarCentroCosto;
	protected JButton jButtonVerFormCentroCosto;
	protected JButton jButtonNuevoRelacionesCentroCosto;
	protected JButton jButtonModificarCentroCosto;
	
    protected JButton jButtonGuardarCambiosTablaCentroCosto;
	protected JButton jButtonCerrarCentroCosto;
	
	
	protected JButton jButtonRecargarInformacionCentroCosto;
	protected JButton jButtonProcesarInformacionCentroCosto;
	
	
	protected JButton jButtonAnterioresCentroCosto;
	protected JButton jButtonSiguientesCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosCentroCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCentroCosto;
	//protected JButton jButtonCerrarReporteDinamicoCentroCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoCentroCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionCentroCosto;
	//protected JButton jButtonGenerarImportacionCentroCosto;
	//protected JButton jButtonCerrarImportacionCentroCosto;
	//protected JFileChooser jFileChooserImportacionCentroCosto;
	//protected File fileImportacionCentroCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCosto;
	protected JButton jButtonDuplicarToolBarCentroCosto;
	protected JButton jButtonNuevoRelacionesToolBarCentroCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarCentroCosto;
	protected JButton jButtonCopiarToolBarCentroCosto;
	protected JButton jButtonVerFormToolBarCentroCosto;
	public JButton jButtonGuardarCambiosTablaToolBarCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCosto;
	protected JButton jButtonCerrarToolBarCentroCosto;
	
	protected JButton jButtonRecargarInformacionToolBarCentroCosto;
	protected JButton jButtonProcesarInformacionToolBarCentroCosto;
	protected JButton jButtonAnterioresToolBarCentroCosto;
	protected JButton jButtonSiguientesToolBarCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarCentroCosto;
	protected JButton jButtonAbrirOrderByToolBarCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCosto;
	protected JMenuItem jMenuItemDuplicarCentroCosto;
	protected JMenuItem jMenuItemNuevoRelacionesCentroCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCentroCosto;
	protected JMenuItem jMenuItemCopiarCentroCosto;
	protected JMenuItem jMenuItemVerFormCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCosto;
	protected JMenuItem jMenuItemCerrarCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarCentroCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionCentroCosto;
	protected JMenuItem jMenuItemProcesarInformacionCentroCosto;
	protected JMenuItem jMenuItemAnterioresCentroCosto;
	protected JMenuItem jMenuItemSiguientesCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCosto;
	protected JMenuItem jMenuItemAbrirOrderByCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarCentroCosto;
	
	
	//MENU
	
	protected JButton jButtonArbolCentroCosto;	
	
	protected JLabel jLabelAccionesCentroCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCentroCosto;
	protected JCheckBox jCheckBoxSeleccionadosCentroCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCentroCosto;
	protected JCheckBox jCheckBoxConGraficoReporteCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCentroCosto;
	protected JTextField jTextFieldValorCampoGeneralCentroCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCentroCosto;
	//public JList<Reporte> jListColumnasSelectReporteCentroCosto;
	//public JScrollPane jScrollColumnasSelectReporteCentroCosto;
	
	//public JLabel jLabelRelacionesSelectReporteCentroCosto;
	//public JList<Reporte> jListRelacionesSelectReporteCentroCosto;
	//public JScrollPane jScrollRelacionesSelectReporteCentroCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCentroCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCentroCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCentroCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoCentroCosto;
	
		
	//public JLabel jLabelArchivoImportacionCentroCosto;	
	//public JLabel jLabelPathArchivoImportacionCentroCosto;
	//protected JTextField jTextFieldPathArchivoImportacionCentroCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCentroCosto;
	
	//public JLabel jLabelColumnaCategoriaValorCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCentroCosto;
	
	//public JLabel jLabelColumnasValoresGraficoCentroCosto;
	//public JList<Reporte> jListColumnasValoresGraficoCentroCosto;
	//public JScrollPane jScrollColumnasValoresGraficoCentroCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCentroCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCentroCosto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCentroCosto;
	public JPanel jPanelBusquedaPorCodigoCentroCosto;
	public JButton jButtonBusquedaPorCodigoCentroCosto;
	public JPanel jPanelBusquedaPorNombreCentroCosto;
	public JButton jButtonBusquedaPorNombreCentroCosto;
	public JPanel jPanelFK_IdCentroCostoCentroCosto;
	public JButton jButtonFK_IdCentroCostoCentroCosto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoCentroCosto;
	public JLabel jLabelcodigoBusquedaPorCodigoCentroCosto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoCentroCosto;
	public JButton jButtoncodigoBusquedaPorCodigoCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreCentroCosto;
	public JLabel jLabelnombreBusquedaPorNombreCentroCosto;
	public JTextArea jTextAreanombreBusquedaPorNombreCentroCosto;
	public JButton jButtonnombreBusquedaPorNombreCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCentroCosto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto;
	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CentroCostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCentroCosto)	{
		this.jButtonRecargarInformacionCentroCosto = jButtonRecargarInformacionCentroCosto;
	}
	
	public JButton getjButtonProcesarInformacionCentroCosto() {
		return this.jButtonProcesarInformacionCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCosto)	{
		this.jButtonProcesarInformacionCentroCosto = jButtonProcesarInformacionCentroCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionCentroCosto() {
		return this.jButtonRecargarInformacionCentroCosto;
	}
	
	public JButton getjButtonArbolCentroCosto() {
		return this.jButtonArbolCentroCosto;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCentroCosto)	{
		this.jButtonArbolCentroCosto = jButtonArbolCentroCosto;
	}
	
	public List<CentroCosto> getcentrocostos() {
		return this.centrocostos;
	}

	public void setcentrocostos(List<CentroCosto> centrocostos) {
		this.centrocostos = centrocostos;
	}
	
	public List<CentroCosto> getcentrocostosAux() {
		return this.centrocostosAux;
	}

	public void setcentrocostosAux(List<CentroCosto> centrocostosAux) {
		this.centrocostosAux = centrocostosAux;
	}
	
	public List<CentroCosto> getcentrocostosEliminados() {
		return this.centrocostosEliminados;
	}

	public void setCentroCostosEliminados(List<CentroCosto> centrocostosEliminados) {
		this.centrocostosEliminados = centrocostosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCentroCosto() {
		return jComboBoxTiposSeleccionarCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCentroCosto(
			JComboBox jComboBoxTiposSeleccionarCentroCosto) {
		this.jComboBoxTiposSeleccionarCentroCosto = jComboBoxTiposSeleccionarCentroCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCentroCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCentroCosto() {
		return jTextFieldValorCampoGeneralCentroCosto;
	}

	public void setjTextFieldValorCampoGeneralCentroCosto(
			JTextField jTextFieldValorCampoGeneralCentroCosto) {
		this.jTextFieldValorCampoGeneralCentroCosto = jTextFieldValorCampoGeneralCentroCosto;
	}

	public void setBorderResaltarValorCampoGeneralCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCentroCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCentroCosto() {
		return this.jCheckBoxSeleccionarTodosCentroCosto;
	}

	public void setjCheckBoxSeleccionarTodosCentroCosto(
			JCheckBox jCheckBoxSeleccionarTodosCentroCosto) {
		this.jCheckBoxSeleccionarTodosCentroCosto = jCheckBoxSeleccionarTodosCentroCosto;
	}

	public void setBorderResaltarSeleccionarTodosCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCentroCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCentroCosto() {
		return this.jCheckBoxSeleccionadosCentroCosto;
	}

	public void setjCheckBoxSeleccionadosCentroCosto(
			JCheckBox jCheckBoxSeleccionadosCentroCosto) {
		this.jCheckBoxSeleccionadosCentroCosto = jCheckBoxSeleccionadosCentroCosto;
	}
	
	public void setBorderResaltarSeleccionadosCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCentroCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCentroCosto() {
		return this.jComboBoxTiposArchivosReportesCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCentroCosto(
			JComboBox jComboBoxTiposArchivosReportesCentroCosto) {
		this.jComboBoxTiposArchivosReportesCentroCosto = jComboBoxTiposArchivosReportesCentroCosto;
	}

	public void setBorderResaltarTiposArchivosReportesCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCentroCosto() {
		return this.jComboBoxTiposReportesCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCentroCosto(
			JComboBox jComboBoxTiposReportesCentroCosto) {
		this.jComboBoxTiposReportesCentroCosto = jComboBoxTiposReportesCentroCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCentroCosto() {
	//	return jComboBoxTiposReportesDinamicoCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCentroCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoCentroCosto) {
	//	this.jComboBoxTiposReportesDinamicoCentroCosto = jComboBoxTiposReportesDinamicoCentroCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCentroCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCentroCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCentroCosto = jComboBoxTiposArchivosReportesDinamicoCentroCosto;
	//}
	
	public void setBorderResaltarTiposReportesCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCentroCosto() {
		return this.jComboBoxTiposGraficosReportesCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCentroCosto(
			JComboBox jComboBoxTiposGraficosReportesCentroCosto) {
		this.jComboBoxTiposGraficosReportesCentroCosto = jComboBoxTiposGraficosReportesCentroCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCentroCosto() {
		return this.jComboBoxTiposPaginacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCentroCosto(
			JComboBox jComboBoxTiposPaginacionCentroCosto) {
		this.jComboBoxTiposPaginacionCentroCosto = jComboBoxTiposPaginacionCentroCosto;
	}
	
	public void setBorderResaltarTiposPaginacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCentroCosto() {
		return this.jComboBoxTiposRelacionesCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCosto() {
		return this.jComboBoxTiposAccionesCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCosto(
			JComboBox jComboBoxTiposRelacionesCentroCosto) {
		this.jComboBoxTiposRelacionesCentroCosto = jComboBoxTiposRelacionesCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCosto(
			JComboBox jComboBoxTiposAccionesCentroCosto) {
		this.jComboBoxTiposAccionesCentroCosto = jComboBoxTiposAccionesCentroCosto;
	}
	
	public void setBorderResaltarTiposRelacionesCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCentroCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCentroCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCentroCosto() {
	//	return jCheckBoxConGraficoDinamicoCentroCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoCentroCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoCentroCosto) {
	//	this.jCheckBoxConGraficoDinamicoCentroCosto = jCheckBoxConGraficoDinamicoCentroCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCentroCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCentroCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCentroCosto .setBorder(borderResaltar);		
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
		this.centrocostoSessionBean=new CentroCostoSessionBean();
		
		this.centrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
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
		
		CentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCentroCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"nuevo","nuevo","Nuevo"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"duplicar","duplicar","Duplicar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"copiar","copiar","Copiar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"ver_form","ver_form","Ver"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"recargar","recargar","Recargar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCentroCosto,this.jTtoolBarCentroCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCentroCosto,this.jTtoolBarCentroCosto,
							"cerrar","cerrar","Salir"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCentroCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCentroCosto;
			
				this.jButtonProcesarInformacionToolBarCentroCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCentroCosto;
				
		//protected JButton jButtonModificarToolBarCentroCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCentroCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCentroCosto=new JMenuMe("General");
		this.jmenuArchivoCentroCosto=new JMenuMe("Archivo");
		this.jmenuAccionesCentroCosto=new JMenuMe("Acciones");
		this.jmenuDatosCentroCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCentroCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCentroCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCentroCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCentroCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCentroCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCentroCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCentroCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCentroCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCentroCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCentroCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCentroCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCentroCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCentroCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCentroCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCentroCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCentroCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCentroCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCentroCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCentroCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCentroCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCentroCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCentroCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCentroCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCentroCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCentroCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCentroCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCentroCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCentroCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCentroCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCentroCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCentroCosto.add(this.jMenuItemCerrarCentroCosto);
			
			this.jmenuAccionesCentroCosto.add(this.jMenuItemNuevoCentroCosto);
			this.jmenuAccionesCentroCosto.add(this.jMenuItemNuevoGuardarCambiosCentroCosto);
			this.jmenuAccionesCentroCosto.add(this.jMenuItemNuevoRelacionesCentroCosto);
			this.jmenuAccionesCentroCosto.add(this.jMenuItemGuardarCambiosTablaCentroCosto);		
			this.jmenuAccionesCentroCosto.add(this.jMenuItemDuplicarCentroCosto);		
			this.jmenuAccionesCentroCosto.add(this.jMenuItemCopiarCentroCosto);		
			this.jmenuAccionesCentroCosto.add(this.jMenuItemVerFormCentroCosto);		
			
			this.jmenuDatosCentroCosto.add(this.jMenuItemRecargarInformacionCentroCosto);				
			this.jmenuDatosCentroCosto.add(this.jMenuItemAnterioresCentroCosto);				
			this.jmenuDatosCentroCosto.add(this.jMenuItemSiguientesCentroCosto);				
			this.jmenuDatosCentroCosto.add(this.jMenuItemAbrirOrderByCentroCosto);				
			this.jmenuDatosCentroCosto.add(this.jMenuItemMostrarOcultarCentroCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCentroCosto.add(this.jMenuItemGuardarCambiosCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCentroCosto.add(this.jmenuArchivoCentroCosto);		
			this.jmenuBarCentroCosto.add(this.jmenuAccionesCentroCosto);		
			this.jmenuBarCentroCosto.add(this.jmenuDatosCentroCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCentroCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCentroCosto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoCentroCosto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoCentroCosto= new JButtonMe();
		this.jButtonBusquedaPorCodigoCentroCosto.setText("Buscar");
		this.jButtonBusquedaPorCodigoCentroCosto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoCentroCosto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoCentroCosto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoCentroCosto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoCentroCosto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoCentroCosto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCentroCosto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCentroCosto= new JButtonMe();
		this.jButtonBusquedaPorNombreCentroCosto.setText("Buscar");
		this.jButtonBusquedaPorNombreCentroCosto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCentroCosto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCentroCosto = new JLabelMe();
		jLabelnombreBusquedaPorNombreCentroCosto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCentroCosto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCentroCosto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCentroCosto= new JButtonMe();
		this.jButtonFK_IdCentroCostoCentroCosto.setText("Buscar");
		this.jButtonFK_IdCentroCostoCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCentroCosto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.setFocusable(false);


		this.jTabbedPaneBusquedasCentroCosto=new JTabbedPane();


		this.jTabbedPaneBusquedasCentroCosto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCosto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCosto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCentroCosto = new CentroCostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Centro Costo DATOS");
			this.jInternalFrameDetalleFormCentroCosto = new CentroCostoDetalleFormJInternalFrame(jDesktopPane,this.centrocostoSessionBean.getConGuardarRelaciones(),this.centrocostoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCentroCosto = null;//new CentroCostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCosto= new GridBagLayout();
		
		
		this.jTableDatosCentroCosto = new JTableMe();      
		
		String sToolTipCentroCosto="";
		sToolTipCentroCosto=CentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCosto+="(Contabilidad.CentroCosto)";
		}
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCentroCosto.setToolTipText(sToolTipCentroCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCentroCosto);
		this.jTableDatosCentroCosto.setAutoCreateRowSorter(true);
		this.jTableDatosCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCentroCosto.setRowSelectionAllowed(true);
		this.jTableDatosCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCentroCosto = new JButtonMe();
		this.jButtonDuplicarCentroCosto = new JButtonMe();
		this.jButtonCopiarCentroCosto = new JButtonMe();
		this.jButtonVerFormCentroCosto = new JButtonMe();
		this.jButtonNuevoRelacionesCentroCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCentroCosto = new JButtonMe();
		this.jButtonCerrarCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralCentroCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo";
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesCentroCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCentroCosto=new ReporteDinamicoJInternalFrame(CentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCentroCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCentroCosto=new ImportacionJInternalFrame(CentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCentroCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCentroCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByCentroCosto.setText("Orden");
		this.jButtonAbrirOrderByCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCosto,false,this);
			
			//this.cargarOrderByCentroCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCosto,true,this);
			
			//this.cargarOrderByCentroCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCentroCosto.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosCentroCosto.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosCentroCosto.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosCentroCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCentroCosto.setText("Nuevo");
		this.jButtonDuplicarCentroCosto.setText("Duplicar");
		this.jButtonCopiarCentroCosto.setText("Copiar");
		this.jButtonVerFormCentroCosto.setText("Ver");
		this.jButtonNuevoRelacionesCentroCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCentroCosto.setText("Guardar");
		this.jButtonCerrarCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCosto,"nuevo_button","Nuevo",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCentroCosto,"duplicar_button","Duplicar",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCentroCosto,"copiar_button","Copiar",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCentroCosto,"ver_form","Ver",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCentroCosto,"nuevorelaciones_button","Nuevo Rel",this.centrocostoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCosto,"guardarcambiostabla_button","Guardar",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCosto,"cerrar_button","Salir",this.centrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCentroCosto.setToolTipText("Nuevo"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCentroCosto.setToolTipText("Duplicar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCentroCosto.setToolTipText("Copiar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCentroCosto.setToolTipText("Ver"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCentroCosto.setToolTipText("Nuevo Rel"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCentroCosto.setToolTipText("Guardar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCosto.setToolTipText("Salir"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCosto";
		inputMap = this.jButtonNuevoCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarCentroCosto";
		inputMap = this.jButtonDuplicarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCentroCosto"));
		
		//COPIAR
		sMapKey = "CopiarCentroCosto";
		inputMap = this.jButtonCopiarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCentroCosto"));
		
		//VEr FORM
		sMapKey = "VerFormCentroCosto";
		inputMap = this.jButtonVerFormCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCentroCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCentroCosto";
		inputMap = this.jButtonNuevoRelacionesCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCentroCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCentroCosto";
		inputMap = this.jButtonModificarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCentroCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCentroCosto";
		inputMap = this.jButtonCerrarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCentroCosto.setName("jPanelParametrosReportesCentroCosto"); 
		
		this.jPanelParametrosReportesAccionesCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCentroCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCentroCosto.setName("jPanelParametrosReportesAccionesCentroCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCentroCosto = new JButtonMe();
		this.jButtonRecargarInformacionCentroCosto.setText("Recargar");
		this.jButtonRecargarInformacionCentroCosto.setToolTipText("Recargar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCentroCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCentroCosto = new JButtonMe();
		this.jButtonProcesarInformacionCentroCosto.setText("Procesar");
		this.jButtonProcesarInformacionCentroCosto.setToolTipText("Procesar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCentroCosto.setVisible(false);
			
		this.jButtonProcesarInformacionCentroCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolCentroCosto = new JButtonMe();
		this.jButtonArbolCentroCosto.setText("Arbol");		
		this.jButtonArbolCentroCosto.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCentroCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCosto.setText("TIPO");       
		this.jComboBoxTiposReportesCentroCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCentroCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionCentroCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCentroCosto.setText("Accion");
		this.jComboBoxTiposRelacionesCentroCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesCentroCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCentroCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarCentroCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCentroCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCentroCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCentroCosto = new JLabelMe();
		
		this.jLabelAccionesCentroCosto.setText("Acciones");		
		this.jLabelAccionesCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCentroCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCentroCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCentroCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCentroCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCentroCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCentroCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCentroCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteCentroCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCentroCosto = new JButtonMe();
		//this.jButtonAnterioresCentroCosto.setText("<<");
        this.jButtonAnterioresCentroCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCentroCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCentroCosto = new JButtonMe();
		//this.jButtonSiguientesCentroCosto.setText(">>");
        this.jButtonSiguientesCentroCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCentroCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCentroCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCentroCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosCentroCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCentroCosto,"nuevoguardarcambios_button","Nue",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCentroCosto";
		inputMap = this.jButtonNuevoGuardarCambiosCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCentroCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCentroCosto";
		inputMap = this.jButtonRecargarInformacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCentroCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCentroCosto";
		inputMap = this.jButtonSiguientesCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCentroCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCentroCosto";
		inputMap = this.jButtonAnterioresCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCentroCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCentroCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCentroCosto.setMinimumSize(new Dimension(this.getWidth(),CentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCosto.setMaximumSize(new Dimension(this.getWidth(),CentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCosto.setPreferredSize(new Dimension(this.getWidth(),CentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCentroCosto = new GridBagLayout();

			this.jPanelPaginacionCentroCosto.setLayout(gridaBagLayoutPaginacionCentroCosto);						
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 0;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCentroCosto.add(this.jButtonAnterioresCentroCosto, this.gridBagConstraintsCentroCosto);
					
						
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCosto.gridy = 0;
			
			this.jPanelPaginacionCentroCosto.add(this.jButtonNuevoGuardarCambiosCentroCosto, this.gridBagConstraintsCentroCosto);
						
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCosto.gridy = 0;
			this.jPanelPaginacionCentroCosto.add(this.jButtonSiguientesCentroCosto, this.gridBagConstraintsCentroCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 1;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCosto.add(this.jButtonNuevoCentroCosto, this.gridBagConstraintsCentroCosto);
						
			
			
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroCosto.gridy = 1;
				this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCentroCosto.add(this.jButtonGuardarCambiosTablaCentroCosto, this.gridBagConstraintsCentroCosto);
			}
			
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 1;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCosto.add(this.jButtonDuplicarCentroCosto, this.gridBagConstraintsCentroCosto);
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 1;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCosto.add(this.jButtonCopiarCentroCosto, this.gridBagConstraintsCentroCosto);
		
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 1;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCosto.add(this.jButtonVerFormCentroCosto, this.gridBagConstraintsCentroCosto);
		
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 1;
			this.gridBagConstraintsCentroCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCentroCosto.add(this.jButtonCerrarCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		
		this.jButtonRecargarInformacionCentroCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolCentroCosto.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCentroCosto.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCentroCosto.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesCentroCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCentroCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCentroCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCentroCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCentroCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CentroCosto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCentroCosto.setLayout(gridaBagParametrosReportesCentroCosto);
			this.jPanelParametrosReportesAccionesCentroCosto.setLayout(gridaBagParametrosReportesAccionesCentroCosto);
			
			
			this.jPanelParametrosAuxiliar1CentroCosto.setLayout(gridaBagParametrosAuxiliar1CentroCosto);
			this.jPanelParametrosAuxiliar2CentroCosto.setLayout(gridaBagParametrosAuxiliar2CentroCosto);
			this.jPanelParametrosAuxiliar3CentroCosto.setLayout(gridaBagParametrosAuxiliar3CentroCosto);
			this.jPanelParametrosAuxiliar4CentroCosto.setLayout(gridaBagParametrosAuxiliar4CentroCosto);
			//this.jPanelParametrosAuxiliar5CentroCosto.setLayout(gridaBagParametrosAuxiliar2CentroCosto);			
			
			
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCosto.add(this.jButtonRecargarInformacionCentroCosto, this.gridBagConstraintsCentroCosto);			
			
			

			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCosto.add(this.jButtonArbolCentroCosto, this.gridBagConstraintsCentroCosto);
			
			
			
			//PAGINACION
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCosto.add(this.jComboBoxTiposPaginacionCentroCosto, this.gridBagConstraintsCentroCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCosto.add(this.jCheckBoxConAltoMaximoTablaCentroCosto, this.gridBagConstraintsCentroCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCosto.add(this.jComboBoxTiposArchivosReportesCentroCosto, this.gridBagConstraintsCentroCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCosto.add(this.jPanelParametrosAuxiliar1CentroCosto, this.gridBagConstraintsCentroCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CentroCosto.add(this.jComboBoxTiposReportesCentroCosto, this.gridBagConstraintsCentroCosto);																		
			
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CentroCosto.add(this.jComboBoxTiposGraficosReportesCentroCosto, this.gridBagConstraintsCentroCosto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCosto.add(this.jPanelParametrosAuxiliar4CentroCosto, this.gridBagConstraintsCentroCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCosto.add(this.jComboBoxTiposReportesCentroCosto, this.gridBagConstraintsCentroCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCosto.add(this.jCheckBoxGenerarReporteCentroCosto, this.gridBagConstraintsCentroCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCosto.add(this.jPanelParametrosAuxiliar2CentroCosto, this.gridBagConstraintsCentroCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCosto.add(this.jLabelAccionesCentroCosto, this.gridBagConstraintsCentroCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCentroCosto.add(this.jButtonAbrirOrderByCentroCosto, this.gridBagConstraintsCentroCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCosto.add(this.jComboBoxTiposSeleccionarCentroCosto, this.gridBagConstraintsCentroCosto);			
			
			
			/*
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCosto.add(this.jCheckBoxSeleccionarTodosCentroCosto, this.gridBagConstraintsCentroCosto);
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCosto.add(this.jCheckBoxConGraficoReporteCentroCosto, this.gridBagConstraintsCentroCosto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCosto.add(this.jCheckBoxSeleccionarTodosCentroCosto, this.gridBagConstraintsCentroCosto);															
				
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCosto.add(this.jCheckBoxSeleccionadosCentroCosto, this.gridBagConstraintsCentroCosto);															
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCosto.add(this.jCheckBoxConGraficoReporteCentroCosto, this.gridBagConstraintsCentroCosto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCosto.add(this.jPanelParametrosAuxiliar3CentroCosto, this.gridBagConstraintsCentroCosto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCosto.add(this.jComboBoxTiposRelacionesCentroCosto, this.gridBagConstraintsCentroCosto);
				
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCosto.add(this.jComboBoxTiposAccionesCentroCosto, this.gridBagConstraintsCentroCosto);
	
				
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCosto.add(this.jTextFieldValorCampoGeneralCentroCosto, this.gridBagConstraintsCentroCosto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCentroCosto = new GridBagLayout();

			this.jScrollPanelDatosCentroCosto.setLayout(gridaBagLayoutDatosCentroCosto);
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = 0;
			this.gridBagConstraintsCentroCosto.gridx = 0;
			
			this.jScrollPanelDatosCentroCosto.add(this.jTableDatosCentroCosto, this.gridBagConstraintsCentroCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCentroCosto.setViewportView(this.jTableDatosCentroCosto);
		this.jTableDatosCentroCosto.setFillsViewportHeight(true);
		this.jTableDatosCentroCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCentroCosto= new GridBagLayout();
		this.jPanelAccionesCentroCosto.setLayout(gridaBagLayoutAccionesCentroCosto);
		
		
		/*	
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 0;
			
		this.jPanelAccionesCentroCosto.add(this.jButtonNuevoCentroCosto, this.gridBagConstraintsCentroCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoCentroCosto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoCentroCosto.setLayout(gridaBagLayoutBusquedaPorCodigoCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 0;
		jPanelBusquedaPorCodigoCentroCosto.add(jLabelcodigoBusquedaPorCodigoCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 1;
		jPanelBusquedaPorCodigoCentroCosto.add(jTextFieldcodigoBusquedaPorCodigoCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 1;
		gridBagConstraintsCentroCosto.gridx =1;
		jPanelBusquedaPorCodigoCentroCosto.add(jButtonBusquedaPorCodigoCentroCosto, gridBagConstraintsCentroCosto);

		jTabbedPaneBusquedasCentroCosto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoCentroCosto);
		jTabbedPaneBusquedasCentroCosto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCentroCosto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCentroCosto.setLayout(gridaBagLayoutBusquedaPorNombreCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 0;
		jPanelBusquedaPorNombreCentroCosto.add(jLabelnombreBusquedaPorNombreCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 1;
		jPanelBusquedaPorNombreCentroCosto.add(jTextAreanombreBusquedaPorNombreCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 1;
		gridBagConstraintsCentroCosto.gridx =1;
		jPanelBusquedaPorNombreCentroCosto.add(jButtonBusquedaPorNombreCentroCosto, gridBagConstraintsCentroCosto);

		jTabbedPaneBusquedasCentroCosto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreCentroCosto);
		jTabbedPaneBusquedasCentroCosto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCentroCosto.setLayout(gridaBagLayoutFK_IdCentroCostoCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 0;
		jPanelFK_IdCentroCostoCentroCosto.add(jLabelid_centro_costoFK_IdCentroCostoCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 1;
		jPanelFK_IdCentroCostoCentroCosto.add(jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto, gridBagConstraintsCentroCosto);


		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
		gridBagConstraintsCentroCosto.gridy = 0;
		gridBagConstraintsCentroCosto.gridx = 0;
		jPanelFK_IdCentroCostoCentroCosto.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto, gridBagConstraintsCentroCosto);

		gridBagConstraintsCentroCosto = new GridBagConstraints();
		gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCosto.gridy = 1;
		gridBagConstraintsCentroCosto.gridx =1;
		jPanelFK_IdCentroCostoCentroCosto.add(jButtonFK_IdCentroCostoCentroCosto, gridBagConstraintsCentroCosto);

		jTabbedPaneBusquedasCentroCosto.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoCentroCosto);
		jTabbedPaneBusquedasCentroCosto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCosto.gridx = 0;		
			//this.gridBagConstraintsCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCentroCosto, this.gridBagConstraintsCentroCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCentroCosto.gridx = 0;		
		//this.gridBagConstraintsCentroCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCentroCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCentroCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCosto.gridx = 0;		
			this.gridBagConstraintsCentroCosto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCentroCosto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCentroCosto, this.gridBagConstraintsCentroCosto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCentroCosto, this.gridBagConstraintsCentroCosto);								
		
		
		/*
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCentroCosto, this.gridBagConstraintsCentroCosto);
		*/		
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCosto.gridx =0;
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCosto, this.gridBagConstraintsCentroCosto);
				
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCentroCosto, this.gridBagConstraintsCentroCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCentroCosto = new CentroCostoBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCentroCosto.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCentroCosto.setTitle("Centro Costo ARBOL");
		this.jInternalFrameTreeCentroCosto.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCentroCosto.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCentroCosto.setResizable(true);
	    this.jInternalFrameTreeCentroCosto.setClosable(true);
	    this.jInternalFrameTreeCentroCosto.setMaximizable(true);
			
			
		if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosCentroCosto.setLayout(gridaBagLayoutBusquedasParametrosCentroCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCosto, this.gridBagConstraintsCentroCosto);
			
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCosto, this.gridBagConstraintsCentroCosto);
		
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCosto, this.gridBagConstraintsCentroCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCentroCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCentroCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCentroCosto.setName("jPanelReporteDinamicoCentroCosto"); 
		
		this.jPanelReporteDinamicoCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCentroCosto.setLayout(gridaBagLayoutReporteDinamicoCentroCosto);
		
		
		this.jInternalFrameReporteDinamicoCentroCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCentroCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCentroCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoCentroCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoCentroCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCentroCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteCentroCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelColumnasSelectReporteCentroCosto, this.gridBagConstraintsCentroCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCentroCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCentroCosto=new JScrollPane(this.jListColumnasSelectReporteCentroCosto);
			
			this.jScrollColumnasSelectReporteCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroCosto.add(this.jListColumnasSelectReporteCentroCosto, this.gridBagConstraintsCentroCosto);
		this.jPanelReporteDinamicoCentroCosto.add(this.jScrollColumnasSelectReporteCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCentroCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteCentroCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCentroCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCentroCosto=new JScrollPane(this.jListRelacionesSelectReporteCentroCosto);
			
			this.jScrollRelacionesSelectReporteCentroCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCentroCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCentroCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoCentroCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCentroCosto = new JLabelMe();

		this.jLabelConGraficoDinamicoCentroCosto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelConGraficoDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCentroCosto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jCheckBoxConGraficoDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCentroCosto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelColumnaCategoriaGraficoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCentroCosto.add(this.jComboBoxColumnaCategoriaGraficoCentroCosto, this.gridBagConstraintsCentroCosto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaValorCentroCosto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelColumnaCategoriaValorCentroCosto, this.gridBagConstraintsCentroCosto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCentroCosto.add(this.jComboBoxColumnaCategoriaValorCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCentroCosto = new JLabelMe();

		this.jLabelColumnasValoresGraficoCentroCosto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelColumnasValoresGraficoCentroCosto, this.gridBagConstraintsCentroCosto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCentroCosto = new JList<Reporte>();
		this.jListColumnasValoresGraficoCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCentroCosto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCentroCosto=new JScrollPane(this.jListColumnasValoresGraficoCentroCosto);
			
			this.jScrollColumnasValoresGraficoCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCentroCosto.add(this.jListColumnasSelectReporteCentroCosto, this.gridBagConstraintsCentroCosto);
		this.jPanelReporteDinamicoCentroCosto.add(this.jScrollColumnasValoresGraficoCentroCosto, this.gridBagConstraintsCentroCosto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCentroCosto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCentroCosto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelTiposGraficosReportesDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCosto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jComboBoxTiposGraficosReportesDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCentroCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCentroCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelGenerarExcelReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCentroCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCentroCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCentroCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCentroCosto.setToolTipText("Generar EXCEL"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCentroCosto.add(this.jButtonGenerarExcelReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCosto.add(this.jComboBoxTiposReportesDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCentroCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCentroCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCosto.add(this.jLabelTiposArchivoReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCosto.add(this.jComboBoxTiposArchivosReportesDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCentroCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCentroCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCentroCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCentroCosto.setToolTipText("Generar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCosto.add(this.jButtonGenerarReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCentroCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCentroCosto.setToolTipText("Cancelar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCosto.add(this.jButtonCerrarReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCentroCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCentroCosto= new JScrollPane(jPanelReporteDinamicoCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCentroCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCentroCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCentroCosto);
		this.jInternalFrameReporteDinamicoCentroCosto.getContentPane().add(this.jScrollPanelReporteDinamicoCentroCosto, this.gridBagConstraintsCentroCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCentroCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCentroCosto.setName("jPanelImportacionCentroCosto"); 
		
		this.jPanelImportacionCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCentroCosto.setLayout(gridaBagLayoutImportacionCentroCosto);
		
		
		this.jInternalFrameImportacionCentroCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCentroCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionCentroCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionCentroCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCentroCosto = new JLabelMe();

		this.jLabelArchivoImportacionCentroCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCosto.add(this.jLabelArchivoImportacionCentroCosto, this.gridBagConstraintsCentroCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCentroCosto = new JFileChooser();		
		this.jFileChooserImportacionCentroCosto.setToolTipText("ESCOGER ARCHIVO"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCentroCosto = new JButtonMe();
		this.jButtonAbrirImportacionCentroCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCentroCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCentroCosto.setToolTipText("Generar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCosto.add(this.jButtonAbrirImportacionCentroCosto, this.gridBagConstraintsCentroCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCentroCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionCentroCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCosto.add(this.jLabelPathArchivoImportacionCentroCosto, this.gridBagConstraintsCentroCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCentroCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCentroCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCosto.add(this.jTextFieldPathArchivoImportacionCentroCosto, this.gridBagConstraintsCentroCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCentroCosto = new JButtonMe();
		this.jButtonGenerarImportacionCentroCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCentroCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCentroCosto.setToolTipText("Generar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCosto.add(this.jButtonGenerarImportacionCentroCosto, this.gridBagConstraintsCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCentroCosto = new JButtonMe();
		this.jButtonCerrarImportacionCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCentroCosto.setToolTipText("Cancelar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCosto.add(this.jButtonCerrarImportacionCentroCosto, this.gridBagConstraintsCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCentroCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionCentroCosto= new JScrollPane(jPanelImportacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsCentroCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCentroCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCentroCosto);
		this.jInternalFrameImportacionCentroCosto.getContentPane().add(this.jScrollPanelImportacionCentroCosto, this.gridBagConstraintsCentroCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCentroCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCentroCosto = new JButtonMe();
			this.jButtonAbrirOrderByCentroCosto.setText("Orden");
			this.jButtonAbrirOrderByCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCentroCosto";
			inputMap = this.jButtonAbrirOrderByCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCentroCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByCentroCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCentroCosto.setName("jPanelOrderByCentroCosto"); 
			
			this.jPanelOrderByCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCentroCosto.setLayout(gridaBagLayoutOrderByCentroCosto);
			
			
			this.jTableDatosCentroCostoOrderBy = new JTableMe();        
			this.jTableDatosCentroCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCentroCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCentroCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCentroCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCentroCostoOrderBy.setViewportView(this.jTableDatosCentroCostoOrderBy);
			this.jTableDatosCentroCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCentroCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCentroCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCentroCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCentroCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCentroCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCentroCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCentroCosto.setTitle("Orden");
			this.jInternalFrameOrderByCentroCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCentroCosto.setResizable(true);
			this.jInternalFrameOrderByCentroCosto.setClosable(true);
			this.jInternalFrameOrderByCentroCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCentroCosto.ipady =150;
				
			this.jPanelOrderByCentroCosto.add(jScrollPanelDatosCentroCostoOrderBy, this.gridBagConstraintsCentroCosto);//this.jTableDatosCentroCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCentroCosto = new JButtonMe();
			this.jButtonCerrarOrderByCentroCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCentroCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCentroCosto.setToolTipText("Cancelar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCentroCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCentroCosto.add(this.jButtonCerrarOrderByCentroCosto, this.gridBagConstraintsCentroCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCentroCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByCentroCosto= new JScrollPane(jPanelOrderByCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCentroCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCentroCosto);
			
			this.jInternalFrameOrderByCentroCosto.getContentPane().add(this.jScrollPanelOrderByCentroCosto, this.gridBagConstraintsCentroCosto);			
		
		} else {
			this.jButtonAbrirOrderByCentroCosto = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.centrocostoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCentroCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCentroCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCentroCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCentroCosto.getRowHeight();//CentroCostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCosto.isSelected()) {
					iHeightTable=CentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCosto.isSelected()) {
					iHeightTable=CentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCentroCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCentroCosto!=null && this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCentroCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCentroCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCentroCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=centrocostoLogic.getCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CentroCosto> TraerCentroCostoBeans(List<CentroCosto> centrocostos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CentroCosto centrocosto:centrocostos) {
					
				if(!(CentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					centrocosto.setsDetalleGeneralEntityReporte(CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocosto));
										
					centrocosto.setes_final_descripcion(CentroCostoConstantesFunciones.getes_finalDescripcion(centrocosto));	
					
						
					
				} else  {
							
					//centrocosto.setsDetalleGeneralEntityReporte(centrocosto.getsDetalleGeneralEntityReporte());
										
				}
				
				//centrocostobeans.add(centrocostobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return centrocostos;
    }
	//PARA REPORTES FIN
}
