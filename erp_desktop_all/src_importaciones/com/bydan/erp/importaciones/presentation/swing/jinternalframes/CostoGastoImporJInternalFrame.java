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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.CostoGastoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class CostoGastoImporJInternalFrame extends CostoGastoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCostoGastoImpor;
	
	protected JMenuBar jmenuBarCostoGastoImpor;
	
	protected JMenu jmenuCostoGastoImpor;
	protected JMenu jmenuDatosCostoGastoImpor;
	protected JMenu jmenuArchivoCostoGastoImpor;
	protected JMenu jmenuAccionesCostoGastoImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCostoGastoImpor;	
	protected GridBagConstraints gridBagConstraintsCostoGastoImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CostoGastoImporDetalleFormJInternalFrame jInternalFrameDetalleFormCostoGastoImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCostoGastoImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCostoGastoImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoCostoGastoImporBeanSwingJInternalFrame tipocostogastoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocostogastoimpor="";
	
	public CostoGastoImporSessionBean costogastoimporSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CostoGastoImpor> costogastoimpors;		
	public List<CostoGastoImpor> costogastoimporsEliminados;	
	public List<CostoGastoImpor> costogastoimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCostoGastoImpor;		
	protected JButton jButtonAbrirOrderByCostoGastoImpor;
	
	
	//protected JPanel jPanelOrderByCostoGastoImpor;
	//public JScrollPane jScrollPanelOrderByCostoGastoImpor;	
	//protected JButton jButtonCerrarOrderByCostoGastoImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CostoGastoImporLogic costogastoimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCostoGastoImpor;
	public JScrollPane jScrollPanelDatosEdicionCostoGastoImpor;
	public JScrollPane jScrollPanelDatosGeneralCostoGastoImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosCostoGastoImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCostoGastoImpor;
	//public JScrollPane jScrollPanelImportacionCostoGastoImpor;
	
	
	
	protected JPanel jPanelAccionesCostoGastoImpor;
	
    protected JPanel jPanelPaginacionCostoGastoImpor;
    protected JPanel jPanelParametrosReportesCostoGastoImpor;
	protected JPanel jPanelParametrosReportesAccionesCostoGastoImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar2CostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar3CostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar4CostoGastoImpor;
	//protected JPanel jPanelParametrosAuxiliar5CostoGastoImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoCostoGastoImpor;
	//protected JPanel jPanelImportacionCostoGastoImpor;
	
	
	public JTable jTableDatosCostoGastoImpor;
	
	
	
	//public JTable jTableDatosCostoGastoImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCostoGastoImpor;
	protected JButton jButtonDuplicarCostoGastoImpor;
	protected JButton jButtonCopiarCostoGastoImpor;
	protected JButton jButtonVerFormCostoGastoImpor;
	protected JButton jButtonNuevoRelacionesCostoGastoImpor;
	protected JButton jButtonModificarCostoGastoImpor;
	
    protected JButton jButtonGuardarCambiosTablaCostoGastoImpor;
	protected JButton jButtonCerrarCostoGastoImpor;
	
	
	protected JButton jButtonRecargarInformacionCostoGastoImpor;
	protected JButton jButtonProcesarInformacionCostoGastoImpor;
	
	
	protected JButton jButtonAnterioresCostoGastoImpor;
	protected JButton jButtonSiguientesCostoGastoImpor;
	protected JButton jButtonNuevoGuardarCambiosCostoGastoImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCostoGastoImpor;
	//protected JButton jButtonCerrarReporteDinamicoCostoGastoImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoCostoGastoImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionCostoGastoImpor;
	//protected JButton jButtonGenerarImportacionCostoGastoImpor;
	//protected JButton jButtonCerrarImportacionCostoGastoImpor;
	//protected JFileChooser jFileChooserImportacionCostoGastoImpor;
	//protected File fileImportacionCostoGastoImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCostoGastoImpor;
	protected JButton jButtonDuplicarToolBarCostoGastoImpor;
	protected JButton jButtonNuevoRelacionesToolBarCostoGastoImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarCostoGastoImpor;
	protected JButton jButtonCopiarToolBarCostoGastoImpor;
	protected JButton jButtonVerFormToolBarCostoGastoImpor;
	public JButton jButtonGuardarCambiosTablaToolBarCostoGastoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarCostoGastoImpor;
	protected JButton jButtonCerrarToolBarCostoGastoImpor;
	
	protected JButton jButtonRecargarInformacionToolBarCostoGastoImpor;
	protected JButton jButtonProcesarInformacionToolBarCostoGastoImpor;
	protected JButton jButtonAnterioresToolBarCostoGastoImpor;
	protected JButton jButtonSiguientesToolBarCostoGastoImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarCostoGastoImpor;
	protected JButton jButtonAbrirOrderByToolBarCostoGastoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCostoGastoImpor;
	protected JMenuItem jMenuItemDuplicarCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoRelacionesCostoGastoImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCostoGastoImpor;
	protected JMenuItem jMenuItemCopiarCostoGastoImpor;
	protected JMenuItem jMenuItemVerFormCostoGastoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaCostoGastoImpor;
	protected JMenuItem jMenuItemCerrarCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleCerrarCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarCostoGastoImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionCostoGastoImpor;
	protected JMenuItem jMenuItemProcesarInformacionCostoGastoImpor;
	protected JMenuItem jMenuItemAnterioresCostoGastoImpor;
	protected JMenuItem jMenuItemSiguientesCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCostoGastoImpor;
	protected JMenuItem jMenuItemAbrirOrderByCostoGastoImpor;
	protected JMenuItem jMenuItemMostrarOcultarCostoGastoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCostoGastoImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCostoGastoImpor;
	protected JCheckBox jCheckBoxSeleccionadosCostoGastoImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCostoGastoImpor;
	protected JCheckBox jCheckBoxConGraficoReporteCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCostoGastoImpor;
	protected JTextField jTextFieldValorCampoGeneralCostoGastoImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCostoGastoImpor;
	//public JList<Reporte> jListColumnasSelectReporteCostoGastoImpor;
	//public JScrollPane jScrollColumnasSelectReporteCostoGastoImpor;
	
	//public JLabel jLabelRelacionesSelectReporteCostoGastoImpor;
	//public JList<Reporte> jListRelacionesSelectReporteCostoGastoImpor;
	//public JScrollPane jScrollRelacionesSelectReporteCostoGastoImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCostoGastoImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCostoGastoImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCostoGastoImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoCostoGastoImpor;
	
		
	//public JLabel jLabelArchivoImportacionCostoGastoImpor;	
	//public JLabel jLabelPathArchivoImportacionCostoGastoImpor;
	//protected JTextField jTextFieldPathArchivoImportacionCostoGastoImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCostoGastoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCostoGastoImpor;
	
	//public JLabel jLabelColumnaCategoriaValorCostoGastoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCostoGastoImpor;
	
	//public JLabel jLabelColumnasValoresGraficoCostoGastoImpor;
	//public JList<Reporte> jListColumnasValoresGraficoCostoGastoImpor;
	//public JScrollPane jScrollColumnasValoresGraficoCostoGastoImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCostoGastoImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCostoGastoImpor;
	public JPanel jPanelFK_IdTipoCostoGastoImporCostoGastoImpor;
	public JButton jButtonFK_IdTipoCostoGastoImporCostoGastoImpor;
	
	public JPanel jPanelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor;
	public JLabel jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor;
	public JButton jButtonid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor= new JButtonMe();
	public JButton jButtonid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImporBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CostoGastoImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCostoGastoImpor)	{
		this.jButtonRecargarInformacionCostoGastoImpor = jButtonRecargarInformacionCostoGastoImpor;
	}
	
	public JButton getjButtonProcesarInformacionCostoGastoImpor() {
		return this.jButtonProcesarInformacionCostoGastoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCostoGastoImpor)	{
		this.jButtonProcesarInformacionCostoGastoImpor = jButtonProcesarInformacionCostoGastoImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionCostoGastoImpor() {
		return this.jButtonRecargarInformacionCostoGastoImpor;
	}
	
	
	public List<CostoGastoImpor> getcostogastoimpors() {
		return this.costogastoimpors;
	}

	public void setcostogastoimpors(List<CostoGastoImpor> costogastoimpors) {
		this.costogastoimpors = costogastoimpors;
	}
	
	public List<CostoGastoImpor> getcostogastoimporsAux() {
		return this.costogastoimporsAux;
	}

	public void setcostogastoimporsAux(List<CostoGastoImpor> costogastoimporsAux) {
		this.costogastoimporsAux = costogastoimporsAux;
	}
	
	public List<CostoGastoImpor> getcostogastoimporsEliminados() {
		return this.costogastoimporsEliminados;
	}

	public void setCostoGastoImporsEliminados(List<CostoGastoImpor> costogastoimporsEliminados) {
		this.costogastoimporsEliminados = costogastoimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCostoGastoImpor() {
		return jComboBoxTiposSeleccionarCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCostoGastoImpor(
			JComboBox jComboBoxTiposSeleccionarCostoGastoImpor) {
		this.jComboBoxTiposSeleccionarCostoGastoImpor = jComboBoxTiposSeleccionarCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCostoGastoImpor() {
		return jTextFieldValorCampoGeneralCostoGastoImpor;
	}

	public void setjTextFieldValorCampoGeneralCostoGastoImpor(
			JTextField jTextFieldValorCampoGeneralCostoGastoImpor) {
		this.jTextFieldValorCampoGeneralCostoGastoImpor = jTextFieldValorCampoGeneralCostoGastoImpor;
	}

	public void setBorderResaltarValorCampoGeneralCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCostoGastoImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCostoGastoImpor() {
		return this.jCheckBoxSeleccionarTodosCostoGastoImpor;
	}

	public void setjCheckBoxSeleccionarTodosCostoGastoImpor(
			JCheckBox jCheckBoxSeleccionarTodosCostoGastoImpor) {
		this.jCheckBoxSeleccionarTodosCostoGastoImpor = jCheckBoxSeleccionarTodosCostoGastoImpor;
	}

	public void setBorderResaltarSeleccionarTodosCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCostoGastoImpor() {
		return this.jCheckBoxSeleccionadosCostoGastoImpor;
	}

	public void setjCheckBoxSeleccionadosCostoGastoImpor(
			JCheckBox jCheckBoxSeleccionadosCostoGastoImpor) {
		this.jCheckBoxSeleccionadosCostoGastoImpor = jCheckBoxSeleccionadosCostoGastoImpor;
	}
	
	public void setBorderResaltarSeleccionadosCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCostoGastoImpor() {
		return this.jComboBoxTiposArchivosReportesCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCostoGastoImpor(
			JComboBox jComboBoxTiposArchivosReportesCostoGastoImpor) {
		this.jComboBoxTiposArchivosReportesCostoGastoImpor = jComboBoxTiposArchivosReportesCostoGastoImpor;
	}

	public void setBorderResaltarTiposArchivosReportesCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCostoGastoImpor() {
		return this.jComboBoxTiposReportesCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCostoGastoImpor(
			JComboBox jComboBoxTiposReportesCostoGastoImpor) {
		this.jComboBoxTiposReportesCostoGastoImpor = jComboBoxTiposReportesCostoGastoImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCostoGastoImpor() {
	//	return jComboBoxTiposReportesDinamicoCostoGastoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCostoGastoImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoCostoGastoImpor) {
	//	this.jComboBoxTiposReportesDinamicoCostoGastoImpor = jComboBoxTiposReportesDinamicoCostoGastoImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCostoGastoImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCostoGastoImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor = jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor;
	//}
	
	public void setBorderResaltarTiposReportesCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCostoGastoImpor() {
		return this.jComboBoxTiposGraficosReportesCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCostoGastoImpor(
			JComboBox jComboBoxTiposGraficosReportesCostoGastoImpor) {
		this.jComboBoxTiposGraficosReportesCostoGastoImpor = jComboBoxTiposGraficosReportesCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCostoGastoImpor() {
		return this.jComboBoxTiposPaginacionCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCostoGastoImpor(
			JComboBox jComboBoxTiposPaginacionCostoGastoImpor) {
		this.jComboBoxTiposPaginacionCostoGastoImpor = jComboBoxTiposPaginacionCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposPaginacionCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCostoGastoImpor() {
		return this.jComboBoxTiposRelacionesCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCostoGastoImpor() {
		return this.jComboBoxTiposAccionesCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCostoGastoImpor(
			JComboBox jComboBoxTiposRelacionesCostoGastoImpor) {
		this.jComboBoxTiposRelacionesCostoGastoImpor = jComboBoxTiposRelacionesCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesCostoGastoImpor) {
		this.jComboBoxTiposAccionesCostoGastoImpor = jComboBoxTiposAccionesCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposRelacionesCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCostoGastoImpor() {
	//	return jCheckBoxConGraficoDinamicoCostoGastoImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoCostoGastoImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoCostoGastoImpor) {
	//	this.jCheckBoxConGraficoDinamicoCostoGastoImpor = jCheckBoxConGraficoDinamicoCostoGastoImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCostoGastoImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCostoGastoImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCostoGastoImpor .setBorder(borderResaltar);		
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
		this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
		
		this.costogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.costogastoimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CostoGastoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Costo Gasto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
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
		
		CostoGastoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCostoGastoImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"nuevo","nuevo","Nuevo"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"duplicar","duplicar","Duplicar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"copiar","copiar","Copiar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"ver_form","ver_form","Ver"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"recargar","recargar","Recargar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCostoGastoImpor,this.jTtoolBarCostoGastoImpor,
							"cerrar","cerrar","Salir"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCostoGastoImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCostoGastoImpor;
			
				this.jButtonProcesarInformacionToolBarCostoGastoImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCostoGastoImpor;
				
		//protected JButton jButtonModificarToolBarCostoGastoImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCostoGastoImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCostoGastoImpor=new JMenuMe("General");
		this.jmenuArchivoCostoGastoImpor=new JMenuMe("Archivo");
		this.jmenuAccionesCostoGastoImpor=new JMenuMe("Acciones");
		this.jmenuDatosCostoGastoImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCostoGastoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCostoGastoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCostoGastoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCostoGastoImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCostoGastoImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCostoGastoImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCostoGastoImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCostoGastoImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCostoGastoImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCostoGastoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCostoGastoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCostoGastoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCostoGastoImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCostoGastoImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCostoGastoImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCostoGastoImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCostoGastoImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCostoGastoImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCostoGastoImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCostoGastoImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCostoGastoImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCostoGastoImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCostoGastoImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCostoGastoImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCostoGastoImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCostoGastoImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCostoGastoImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCostoGastoImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCostoGastoImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCostoGastoImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCostoGastoImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCostoGastoImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCostoGastoImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCostoGastoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCostoGastoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCostoGastoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCostoGastoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCostoGastoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCostoGastoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCostoGastoImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCostoGastoImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCostoGastoImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCostoGastoImpor.add(this.jMenuItemCerrarCostoGastoImpor);
			
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemNuevoCostoGastoImpor);
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemNuevoGuardarCambiosCostoGastoImpor);
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemNuevoRelacionesCostoGastoImpor);
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemGuardarCambiosTablaCostoGastoImpor);		
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemDuplicarCostoGastoImpor);		
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemCopiarCostoGastoImpor);		
			this.jmenuAccionesCostoGastoImpor.add(this.jMenuItemVerFormCostoGastoImpor);		
			
			this.jmenuDatosCostoGastoImpor.add(this.jMenuItemRecargarInformacionCostoGastoImpor);				
			this.jmenuDatosCostoGastoImpor.add(this.jMenuItemAnterioresCostoGastoImpor);				
			this.jmenuDatosCostoGastoImpor.add(this.jMenuItemSiguientesCostoGastoImpor);				
			this.jmenuDatosCostoGastoImpor.add(this.jMenuItemAbrirOrderByCostoGastoImpor);				
			this.jmenuDatosCostoGastoImpor.add(this.jMenuItemMostrarOcultarCostoGastoImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCostoGastoImpor.add(this.jMenuItemGuardarCambiosCostoGastoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCostoGastoImpor.add(this.jmenuArchivoCostoGastoImpor);		
			this.jmenuBarCostoGastoImpor.add(this.jmenuAccionesCostoGastoImpor);		
			this.jmenuBarCostoGastoImpor.add(this.jmenuDatosCostoGastoImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCostoGastoImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCostoGastoImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor.setToolTipText("Buscar Por Tipo Costo Gasto Impor ");
		this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor= new JButtonMe();
		this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor.setText("Buscar");
		this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor.setToolTipText("Buscar Por Tipo Costo Gasto Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor,"buscar_button","Buscar Por Tipo Costo Gasto Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor = new JLabelMe();
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setText("Tipo Costo Gasto Impor :");
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setToolTipText("Tipo Costo Gasto Impor");
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor= new JComboBoxMe();
		jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCostoGastoImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasCostoGastoImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCostoGastoImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCostoGastoImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCostoGastoImpor = new CostoGastoImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Costo Gasto Impor DATOS");
			this.jInternalFrameDetalleFormCostoGastoImpor = new CostoGastoImporDetalleFormJInternalFrame(jDesktopPane,this.costogastoimporSessionBean.getConGuardarRelaciones(),this.costogastoimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCostoGastoImpor = null;//new CostoGastoImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCostoGastoImpor= new GridBagLayout();
		
		
		this.jTableDatosCostoGastoImpor = new JTableMe();      
		
		String sToolTipCostoGastoImpor="";
		sToolTipCostoGastoImpor=CostoGastoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCostoGastoImpor+="(Importaciones.CostoGastoImpor)";
		}
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipCostoGastoImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCostoGastoImpor.setToolTipText(sToolTipCostoGastoImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCostoGastoImpor);
		this.jTableDatosCostoGastoImpor.setAutoCreateRowSorter(true);
		this.jTableDatosCostoGastoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCostoGastoImpor.setRowSelectionAllowed(true);
		this.jTableDatosCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCostoGastoImpor = new JButtonMe();
		this.jButtonDuplicarCostoGastoImpor = new JButtonMe();
		this.jButtonCopiarCostoGastoImpor = new JButtonMe();
		this.jButtonVerFormCostoGastoImpor = new JButtonMe();
		this.jButtonNuevoRelacionesCostoGastoImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarCostoGastoImpor = new JButtonMe();
		
		this.jScrollPanelDatosCostoGastoImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralCostoGastoImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Costo Gasto Impor";
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesCostoGastoImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCostoGastoImpor=new ReporteDinamicoJInternalFrame(CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCostoGastoImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCostoGastoImpor=new ImportacionJInternalFrame(CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCostoGastoImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCostoGastoImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByCostoGastoImpor.setText("Orden");
		this.jButtonAbrirOrderByCostoGastoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCostoGastoImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCostoGastoImpor,false,this);
			
			//this.cargarOrderByCostoGastoImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCostoGastoImpor,true,this);
			
			//this.cargarOrderByCostoGastoImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCostoGastoImpor.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCostoGastoImpor.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCostoGastoImpor.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCostoGastoImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCostoGastoImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCostoGastoImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCostoGastoImpor.setText("Nuevo");
		this.jButtonDuplicarCostoGastoImpor.setText("Duplicar");
		this.jButtonCopiarCostoGastoImpor.setText("Copiar");
		this.jButtonVerFormCostoGastoImpor.setText("Ver");
		this.jButtonNuevoRelacionesCostoGastoImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.setText("Guardar");
		this.jButtonCerrarCostoGastoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCostoGastoImpor,"nuevo_button","Nuevo",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCostoGastoImpor,"duplicar_button","Duplicar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCostoGastoImpor,"copiar_button","Copiar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCostoGastoImpor,"ver_form","Ver",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCostoGastoImpor,"nuevorelaciones_button","Nuevo Rel",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCostoGastoImpor,"guardarcambiostabla_button","Guardar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCostoGastoImpor,"cerrar_button","Salir",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCostoGastoImpor.setToolTipText("Nuevo"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCostoGastoImpor.setToolTipText("Duplicar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCostoGastoImpor.setToolTipText("Copiar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCostoGastoImpor.setToolTipText("Ver"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCostoGastoImpor.setToolTipText("Nuevo Rel"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.setToolTipText("Guardar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCostoGastoImpor.setToolTipText("Salir"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCostoGastoImpor";
		inputMap = this.jButtonNuevoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCostoGastoImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarCostoGastoImpor";
		inputMap = this.jButtonDuplicarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCostoGastoImpor"));
		
		//COPIAR
		sMapKey = "CopiarCostoGastoImpor";
		inputMap = this.jButtonCopiarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCostoGastoImpor"));
		
		//VEr FORM
		sMapKey = "VerFormCostoGastoImpor";
		inputMap = this.jButtonVerFormCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCostoGastoImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCostoGastoImpor";
		inputMap = this.jButtonNuevoRelacionesCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCostoGastoImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCostoGastoImpor";
		inputMap = this.jButtonModificarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCostoGastoImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCostoGastoImpor";
		inputMap = this.jButtonCerrarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCostoGastoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCostoGastoImpor";
		inputMap = this.jButtonGuardarCambiosTablaCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCostoGastoImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCostoGastoImpor.setName("jPanelParametrosReportesCostoGastoImpor"); 
		
		this.jPanelParametrosReportesAccionesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCostoGastoImpor.setName("jPanelParametrosReportesAccionesCostoGastoImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCostoGastoImpor = new JButtonMe();
		this.jButtonRecargarInformacionCostoGastoImpor.setText("Recargar");
		this.jButtonRecargarInformacionCostoGastoImpor.setToolTipText("Recargar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCostoGastoImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCostoGastoImpor = new JButtonMe();
		this.jButtonProcesarInformacionCostoGastoImpor.setText("Procesar");
		this.jButtonProcesarInformacionCostoGastoImpor.setToolTipText("Procesar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCostoGastoImpor.setVisible(false);
			
		this.jButtonProcesarInformacionCostoGastoImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCostoGastoImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCostoGastoImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCostoGastoImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposReportesCostoGastoImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCostoGastoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCostoGastoImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionCostoGastoImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposRelacionesCostoGastoImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposAccionesCostoGastoImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarCostoGastoImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCostoGastoImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCostoGastoImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCostoGastoImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCostoGastoImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCostoGastoImpor = new JLabelMe();
		
		this.jLabelAccionesCostoGastoImpor.setText("Acciones");		
		this.jLabelAccionesCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCostoGastoImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCostoGastoImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCostoGastoImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCostoGastoImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCostoGastoImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCostoGastoImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCostoGastoImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteCostoGastoImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCostoGastoImpor = new JButtonMe();
		//this.jButtonAnterioresCostoGastoImpor.setText("<<");
        this.jButtonAnterioresCostoGastoImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCostoGastoImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCostoGastoImpor = new JButtonMe();
		//this.jButtonSiguientesCostoGastoImpor.setText(">>");
        this.jButtonSiguientesCostoGastoImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCostoGastoImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCostoGastoImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCostoGastoImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosCostoGastoImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCostoGastoImpor,"nuevoguardarcambios_button","Nue",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCostoGastoImpor";
		inputMap = this.jButtonNuevoGuardarCambiosCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCostoGastoImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCostoGastoImpor";
		inputMap = this.jButtonRecargarInformacionCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCostoGastoImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCostoGastoImpor";
		inputMap = this.jButtonSiguientesCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCostoGastoImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCostoGastoImpor";
		inputMap = this.jButtonAnterioresCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCostoGastoImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCostoGastoImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCostoGastoImpor.setMinimumSize(new Dimension(this.getWidth(),CostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCostoGastoImpor.setMaximumSize(new Dimension(this.getWidth(),CostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCostoGastoImpor.setPreferredSize(new Dimension(this.getWidth(),CostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCostoGastoImpor = new GridBagLayout();

			this.jPanelPaginacionCostoGastoImpor.setLayout(gridaBagLayoutPaginacionCostoGastoImpor);						
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 0;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonAnterioresCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					
						
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCostoGastoImpor.gridy = 0;
			
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonNuevoGuardarCambiosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
						
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCostoGastoImpor.gridy = 0;
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonSiguientesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonNuevoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCostoGastoImpor.gridy = 1;
				this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCostoGastoImpor.add(this.jButtonNuevoRelacionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			}
			
			
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCostoGastoImpor.gridy = 1;
				this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCostoGastoImpor.add(this.jButtonGuardarCambiosTablaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			}
			
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonDuplicarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonCopiarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonVerFormCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCostoGastoImpor.add(this.jButtonCerrarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
		
		
		this.jButtonRecargarInformacionCostoGastoImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCostoGastoImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCostoGastoImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCostoGastoImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCostoGastoImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCostoGastoImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCostoGastoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCostoGastoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCostoGastoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCostoGastoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCostoGastoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCostoGastoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCostoGastoImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCostoGastoImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCostoGastoImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCostoGastoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCostoGastoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCostoGastoImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCostoGastoImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCostoGastoImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCostoGastoImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCostoGastoImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CostoGastoImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCostoGastoImpor.setLayout(gridaBagParametrosReportesCostoGastoImpor);
			this.jPanelParametrosReportesAccionesCostoGastoImpor.setLayout(gridaBagParametrosReportesAccionesCostoGastoImpor);
			
			
			this.jPanelParametrosAuxiliar1CostoGastoImpor.setLayout(gridaBagParametrosAuxiliar1CostoGastoImpor);
			this.jPanelParametrosAuxiliar2CostoGastoImpor.setLayout(gridaBagParametrosAuxiliar2CostoGastoImpor);
			this.jPanelParametrosAuxiliar3CostoGastoImpor.setLayout(gridaBagParametrosAuxiliar3CostoGastoImpor);
			this.jPanelParametrosAuxiliar4CostoGastoImpor.setLayout(gridaBagParametrosAuxiliar4CostoGastoImpor);
			//this.jPanelParametrosAuxiliar5CostoGastoImpor.setLayout(gridaBagParametrosAuxiliar2CostoGastoImpor);			
			
			
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jButtonRecargarInformacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CostoGastoImpor.add(this.jComboBoxTiposPaginacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CostoGastoImpor.add(this.jCheckBoxConAltoMaximoTablaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CostoGastoImpor.add(this.jComboBoxTiposArchivosReportesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jPanelParametrosAuxiliar1CostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CostoGastoImpor.add(this.jComboBoxTiposReportesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jPanelParametrosAuxiliar4CostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jComboBoxTiposReportesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jCheckBoxGenerarReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jPanelParametrosAuxiliar2CostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jLabelAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCostoGastoImpor.add(this.jButtonAbrirOrderByCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jComboBoxTiposSeleccionarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			
			
			/*
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jCheckBoxSeleccionarTodosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CostoGastoImpor.add(this.jCheckBoxSeleccionarTodosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);															
				
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CostoGastoImpor.add(this.jCheckBoxSeleccionadosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jPanelParametrosAuxiliar3CostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jComboBoxTiposRelacionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
				
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jComboBoxTiposAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
	
				
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCostoGastoImpor.add(this.jTextFieldValorCampoGeneralCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCostoGastoImpor = new GridBagLayout();

			this.jScrollPanelDatosCostoGastoImpor.setLayout(gridaBagLayoutDatosCostoGastoImpor);
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = 0;
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;
			
			this.jScrollPanelDatosCostoGastoImpor.add(this.jTableDatosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCostoGastoImpor.setViewportView(this.jTableDatosCostoGastoImpor);
		this.jTableDatosCostoGastoImpor.setFillsViewportHeight(true);
		this.jTableDatosCostoGastoImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesCostoGastoImpor.setLayout(gridaBagLayoutAccionesCostoGastoImpor);
		
		
		/*	
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
			
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonNuevoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCostoGastoImporCostoGastoImpor.setLayout(gridaBagLayoutFK_IdTipoCostoGastoImporCostoGastoImpor);

		gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCostoGastoImpor.gridy = 0;
		gridBagConstraintsCostoGastoImpor.gridx = 0;
		jPanelFK_IdTipoCostoGastoImporCostoGastoImpor.add(jLabelid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor, gridBagConstraintsCostoGastoImpor);

		gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCostoGastoImpor.gridy = 0;
		gridBagConstraintsCostoGastoImpor.gridx = 1;
		jPanelFK_IdTipoCostoGastoImporCostoGastoImpor.add(jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor, gridBagConstraintsCostoGastoImpor);

		gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCostoGastoImpor.gridy = 1;
		gridBagConstraintsCostoGastoImpor.gridx =1;
		jPanelFK_IdTipoCostoGastoImporCostoGastoImpor.add(jButtonFK_IdTipoCostoGastoImporCostoGastoImpor, gridBagConstraintsCostoGastoImpor);

		jTabbedPaneBusquedasCostoGastoImpor.addTab("1.-Por Tipo Costo Gasto Impor ", jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);
		jTabbedPaneBusquedasCostoGastoImpor.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCostoGastoImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();						
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;		
			//this.gridBagConstraintsCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCostoGastoImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;		
		//this.gridBagConstraintsCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCostoGastoImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;		
			this.gridBagConstraintsCostoGastoImpor.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCostoGastoImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);								
		
		
		/*
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		*/		
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCostoGastoImpor.gridx =0;
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCostoGastoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
				
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCostoGastoImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosCostoGastoImpor.setLayout(gridaBagLayoutBusquedasParametrosCostoGastoImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCostoGastoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCostoGastoImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCostoGastoImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCostoGastoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCostoGastoImpor.setName("jPanelReporteDinamicoCostoGastoImpor"); 
		
		this.jPanelReporteDinamicoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCostoGastoImpor.setLayout(gridaBagLayoutReporteDinamicoCostoGastoImpor);
		
		
		this.jInternalFrameReporteDinamicoCostoGastoImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCostoGastoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCostoGastoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCostoGastoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCostoGastoImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCostoGastoImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoCostoGastoImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoCostoGastoImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCostoGastoImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteCostoGastoImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jLabelColumnasSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCostoGastoImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCostoGastoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCostoGastoImpor=new JScrollPane(this.jListColumnasSelectReporteCostoGastoImpor);
			
			this.jScrollColumnasSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCostoGastoImpor.add(this.jListColumnasSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jScrollColumnasSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCostoGastoImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteCostoGastoImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jLabelRelacionesSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCostoGastoImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCostoGastoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCostoGastoImpor=new JScrollPane(this.jListRelacionesSelectReporteCostoGastoImpor);
			
			this.jScrollRelacionesSelectReporteCostoGastoImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCostoGastoImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCostoGastoImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCostoGastoImpor.add(this.jListRelacionesSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jScrollRelacionesSelectReporteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCostoGastoImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCostoGastoImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoCostoGastoImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCostoGastoImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCostoGastoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jLabelGenerarExcelReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor.setToolTipText("Generar EXCEL"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCostoGastoImpor.add(this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jComboBoxTiposReportesDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jLabelTiposArchivoReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jComboBoxTiposArchivosReportesDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCostoGastoImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCostoGastoImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCostoGastoImpor.setToolTipText("Generar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jButtonGenerarReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCostoGastoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCostoGastoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCostoGastoImpor.setToolTipText("Cancelar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCostoGastoImpor.add(this.jButtonCerrarReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCostoGastoImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCostoGastoImpor= new JScrollPane(jPanelReporteDinamicoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCostoGastoImpor);
		this.jInternalFrameReporteDinamicoCostoGastoImpor.getContentPane().add(this.jScrollPanelReporteDinamicoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCostoGastoImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCostoGastoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCostoGastoImpor.setName("jPanelImportacionCostoGastoImpor"); 
		
		this.jPanelImportacionCostoGastoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCostoGastoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCostoGastoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCostoGastoImpor.setLayout(gridaBagLayoutImportacionCostoGastoImpor);
		
		
		this.jInternalFrameImportacionCostoGastoImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCostoGastoImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCostoGastoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCostoGastoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCostoGastoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCostoGastoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCostoGastoImpor.setResizable(true);
	    this.jInternalFrameImportacionCostoGastoImpor.setClosable(true);
	    this.jInternalFrameImportacionCostoGastoImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCostoGastoImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCostoGastoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCostoGastoImpor.setResizable(true);
	    this.jInternalFrameImportacionCostoGastoImpor.setClosable(true);
	    this.jInternalFrameImportacionCostoGastoImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCostoGastoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCostoGastoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCostoGastoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCostoGastoImpor = new JLabelMe();

		this.jLabelArchivoImportacionCostoGastoImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCostoGastoImpor.add(this.jLabelArchivoImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCostoGastoImpor = new JFileChooser();		
		this.jFileChooserImportacionCostoGastoImpor.setToolTipText("ESCOGER ARCHIVO"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCostoGastoImpor = new JButtonMe();
		this.jButtonAbrirImportacionCostoGastoImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCostoGastoImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCostoGastoImpor.setToolTipText("Generar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCostoGastoImpor.add(this.jButtonAbrirImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCostoGastoImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionCostoGastoImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCostoGastoImpor.add(this.jLabelPathArchivoImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCostoGastoImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCostoGastoImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCostoGastoImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCostoGastoImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCostoGastoImpor.add(this.jTextFieldPathArchivoImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarImportacionCostoGastoImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCostoGastoImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCostoGastoImpor.setToolTipText("Generar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCostoGastoImpor.add(this.jButtonGenerarImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarImportacionCostoGastoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCostoGastoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCostoGastoImpor.setToolTipText("Cancelar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCostoGastoImpor.add(this.jButtonCerrarImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCostoGastoImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionCostoGastoImpor= new JScrollPane(jPanelImportacionCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsCostoGastoImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCostoGastoImpor);
		this.jInternalFrameImportacionCostoGastoImpor.getContentPane().add(this.jScrollPanelImportacionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCostoGastoImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCostoGastoImpor = new JButtonMe();
			this.jButtonAbrirOrderByCostoGastoImpor.setText("Orden");
			this.jButtonAbrirOrderByCostoGastoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCostoGastoImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCostoGastoImpor";
			inputMap = this.jButtonAbrirOrderByCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCostoGastoImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByCostoGastoImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCostoGastoImpor.setName("jPanelOrderByCostoGastoImpor"); 
			
			this.jPanelOrderByCostoGastoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCostoGastoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCostoGastoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCostoGastoImpor.setLayout(gridaBagLayoutOrderByCostoGastoImpor);
			
			
			this.jTableDatosCostoGastoImporOrderBy = new JTableMe();        
			this.jTableDatosCostoGastoImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCostoGastoImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCostoGastoImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCostoGastoImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCostoGastoImporOrderBy.setViewportView(this.jTableDatosCostoGastoImporOrderBy);
			this.jTableDatosCostoGastoImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCostoGastoImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCostoGastoImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCostoGastoImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCostoGastoImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCostoGastoImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCostoGastoImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCostoGastoImpor.setTitle("Orden");
			this.jInternalFrameOrderByCostoGastoImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCostoGastoImpor.setResizable(true);
			this.jInternalFrameOrderByCostoGastoImpor.setClosable(true);
			this.jInternalFrameOrderByCostoGastoImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCostoGastoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCostoGastoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCostoGastoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCostoGastoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCostoGastoImpor.ipady =150;
				
			this.jPanelOrderByCostoGastoImpor.add(jScrollPanelDatosCostoGastoImporOrderBy, this.gridBagConstraintsCostoGastoImpor);//this.jTableDatosCostoGastoImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCostoGastoImpor = new JButtonMe();
			this.jButtonCerrarOrderByCostoGastoImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCostoGastoImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCostoGastoImpor.setToolTipText("Cancelar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCostoGastoImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCostoGastoImpor.add(this.jButtonCerrarOrderByCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCostoGastoImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByCostoGastoImpor= new JScrollPane(jPanelOrderByCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsCostoGastoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCostoGastoImpor);
			
			this.jInternalFrameOrderByCostoGastoImpor.getContentPane().add(this.jScrollPanelOrderByCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
		
		} else {
			this.jButtonAbrirOrderByCostoGastoImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.costogastoimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCostoGastoImpor.getRowHeight();//CostoGastoImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.isSelected()) {
					iHeightTable=CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCostoGastoImpor.isSelected()) {
					iHeightTable=CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCostoGastoImpor!=null && this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCostoGastoImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCostoGastoImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCostoGastoImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=costogastoimporLogic.getCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costogastoimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CostoGastoImpor> TraerCostoGastoImporBeans(List<CostoGastoImpor> costogastoimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(CostoGastoImpor costogastoimpor:costogastoimpors) {
					
				if(!(CostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					costogastoimpor.setsDetalleGeneralEntityReporte(CostoGastoImporConstantesFunciones.getCostoGastoImporDescripcion(costogastoimpor));
										
					costogastoimpor.setes_activo_descripcion(CostoGastoImporConstantesFunciones.getes_activoDescripcion(costogastoimpor));costogastoimpor.setcon_agrupa_descripcion(CostoGastoImporConstantesFunciones.getcon_agrupaDescripcion(costogastoimpor));costogastoimpor.setcon_prorratea_descripcion(CostoGastoImporConstantesFunciones.getcon_prorrateaDescripcion(costogastoimpor));costogastoimpor.setcon_factura_descripcion(CostoGastoImporConstantesFunciones.getcon_facturaDescripcion(costogastoimpor));costogastoimpor.setcon_flete_descripcion(CostoGastoImporConstantesFunciones.getcon_fleteDescripcion(costogastoimpor));costogastoimpor.setcon_arancel_descripcion(CostoGastoImporConstantesFunciones.getcon_arancelDescripcion(costogastoimpor));costogastoimpor.setcon_seguro_descripcion(CostoGastoImporConstantesFunciones.getcon_seguroDescripcion(costogastoimpor));costogastoimpor.setcon_total_general_descripcion(CostoGastoImporConstantesFunciones.getcon_total_generalDescripcion(costogastoimpor));costogastoimpor.setcon_digitado_descripcion(CostoGastoImporConstantesFunciones.getcon_digitadoDescripcion(costogastoimpor));	
					
					

					if(costogastoimpor.getDetalleLiquidacionImpors()!=null && Funciones.existeClass(classes,DetalleLiquidacionImpor.class)) {
						try{costogastoimpor.setdetalleliquidacionimporsDescripcionReporte(new JRBeanCollectionDataSource(DetalleLiquidacionImporJInternalFrame.TraerDetalleLiquidacionImporBeans(costogastoimpor.getDetalleLiquidacionImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//costogastoimpor.setsDetalleGeneralEntityReporte(costogastoimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//costogastoimporbeans.add(costogastoimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return costogastoimpors;
    }
	//PARA REPORTES FIN
}
