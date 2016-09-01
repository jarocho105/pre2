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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoPago_NMConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoPago_NMJInternalFrame extends TipoPago_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPago_NM;
	
	protected JMenuBar jmenuBarTipoPago_NM;
	
	protected JMenu jmenuTipoPago_NM;
	protected JMenu jmenuDatosTipoPago_NM;
	protected JMenu jmenuArchivoTipoPago_NM;
	protected JMenu jmenuAccionesTipoPago_NM;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPago_NM;	
	protected GridBagConstraints gridBagConstraintsTipoPago_NM;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPago_NMDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPago_NM;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPago_NM;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPago_NM;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPago_NM> tipopago_nms;		
	public List<TipoPago_NM> tipopago_nmsEliminados;	
	public List<TipoPago_NM> tipopago_nmsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPago_NM;		
	protected JButton jButtonAbrirOrderByTipoPago_NM;
	
	
	//protected JPanel jPanelOrderByTipoPago_NM;
	//public JScrollPane jScrollPanelOrderByTipoPago_NM;	
	//protected JButton jButtonCerrarOrderByTipoPago_NM;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPago_NMLogic tipopago_nmLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPago_NM;
	public JScrollPane jScrollPanelDatosEdicionTipoPago_NM;
	public JScrollPane jScrollPanelDatosGeneralTipoPago_NM;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPago_NMOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPago_NM;
	//public JScrollPane jScrollPanelImportacionTipoPago_NM;
	
	
	
	protected JPanel jPanelAccionesTipoPago_NM;
	
    protected JPanel jPanelPaginacionTipoPago_NM;
    protected JPanel jPanelParametrosReportesTipoPago_NM;
	protected JPanel jPanelParametrosReportesAccionesTipoPago_NM;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPago_NM;
	protected JPanel jPanelParametrosAuxiliar2TipoPago_NM;
	protected JPanel jPanelParametrosAuxiliar3TipoPago_NM;
	protected JPanel jPanelParametrosAuxiliar4TipoPago_NM;
	//protected JPanel jPanelParametrosAuxiliar5TipoPago_NM;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPago_NM;
	//protected JPanel jPanelImportacionTipoPago_NM;
	
	
	public JTable jTableDatosTipoPago_NM;
	
	
	
	//public JTable jTableDatosTipoPago_NMOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPago_NM;
	protected JButton jButtonDuplicarTipoPago_NM;
	protected JButton jButtonCopiarTipoPago_NM;
	protected JButton jButtonVerFormTipoPago_NM;
	protected JButton jButtonNuevoRelacionesTipoPago_NM;
	protected JButton jButtonModificarTipoPago_NM;
	
    protected JButton jButtonGuardarCambiosTablaTipoPago_NM;
	protected JButton jButtonCerrarTipoPago_NM;
	
	
	protected JButton jButtonRecargarInformacionTipoPago_NM;
	protected JButton jButtonProcesarInformacionTipoPago_NM;
	
	
	protected JButton jButtonAnterioresTipoPago_NM;
	protected JButton jButtonSiguientesTipoPago_NM;
	protected JButton jButtonNuevoGuardarCambiosTipoPago_NM;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPago_NM;
	//protected JButton jButtonCerrarReporteDinamicoTipoPago_NM;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPago_NM;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPago_NM;
	//protected JButton jButtonGenerarImportacionTipoPago_NM;
	//protected JButton jButtonCerrarImportacionTipoPago_NM;
	//protected JFileChooser jFileChooserImportacionTipoPago_NM;
	//protected File fileImportacionTipoPago_NM;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPago_NM;
	protected JButton jButtonDuplicarToolBarTipoPago_NM;
	protected JButton jButtonNuevoRelacionesToolBarTipoPago_NM;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPago_NM;
	protected JButton jButtonCopiarToolBarTipoPago_NM;
	protected JButton jButtonVerFormToolBarTipoPago_NM;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPago_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPago_NM;
	protected JButton jButtonCerrarToolBarTipoPago_NM;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPago_NM;
	protected JButton jButtonProcesarInformacionToolBarTipoPago_NM;
	protected JButton jButtonAnterioresToolBarTipoPago_NM;
	protected JButton jButtonSiguientesToolBarTipoPago_NM;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPago_NM;
	protected JButton jButtonAbrirOrderByToolBarTipoPago_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPago_NM;
	protected JMenuItem jMenuItemDuplicarTipoPago_NM;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPago_NM;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPago_NM;
	protected JMenuItem jMenuItemCopiarTipoPago_NM;
	protected JMenuItem jMenuItemVerFormTipoPago_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPago_NM;
	protected JMenuItem jMenuItemCerrarTipoPago_NM;
	protected JMenuItem jMenuItemDetalleCerrarTipoPago_NM;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPago_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPago_NM;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPago_NM;
	protected JMenuItem jMenuItemProcesarInformacionTipoPago_NM;
	protected JMenuItem jMenuItemAnterioresTipoPago_NM;
	protected JMenuItem jMenuItemSiguientesTipoPago_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPago_NM;
	protected JMenuItem jMenuItemAbrirOrderByTipoPago_NM;
	protected JMenuItem jMenuItemMostrarOcultarTipoPago_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPago_NM;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPago_NM;
	protected JCheckBox jCheckBoxSeleccionadosTipoPago_NM;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPago_NM;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPago_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPago_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPago_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPago_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPago_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPago_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPago_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPago_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPago_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPago_NM;
	protected JTextField jTextFieldValorCampoGeneralTipoPago_NM;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPago_NM;
	//public JList<Reporte> jListColumnasSelectReporteTipoPago_NM;
	//public JScrollPane jScrollColumnasSelectReporteTipoPago_NM;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPago_NM;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPago_NM;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPago_NM;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPago_NM;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPago_NM;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPago_NM;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPago_NM;
	
		
	//public JLabel jLabelArchivoImportacionTipoPago_NM;	
	//public JLabel jLabelPathArchivoImportacionTipoPago_NM;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPago_NM;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPago_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPago_NM;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPago_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPago_NM;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPago_NM;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPago_NM;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPago_NM;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPago_NM;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPago_NM;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPago_NM;
	
	
	
	
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
	public TipoPago_NMJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPago_NM)	{
		this.jButtonRecargarInformacionTipoPago_NM = jButtonRecargarInformacionTipoPago_NM;
	}
	
	public JButton getjButtonProcesarInformacionTipoPago_NM() {
		return this.jButtonProcesarInformacionTipoPago_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPago_NM)	{
		this.jButtonProcesarInformacionTipoPago_NM = jButtonProcesarInformacionTipoPago_NM;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPago_NM() {
		return this.jButtonRecargarInformacionTipoPago_NM;
	}
	
	
	public List<TipoPago_NM> gettipopago_nms() {
		return this.tipopago_nms;
	}

	public void settipopago_nms(List<TipoPago_NM> tipopago_nms) {
		this.tipopago_nms = tipopago_nms;
	}
	
	public List<TipoPago_NM> gettipopago_nmsAux() {
		return this.tipopago_nmsAux;
	}

	public void settipopago_nmsAux(List<TipoPago_NM> tipopago_nmsAux) {
		this.tipopago_nmsAux = tipopago_nmsAux;
	}
	
	public List<TipoPago_NM> gettipopago_nmsEliminados() {
		return this.tipopago_nmsEliminados;
	}

	public void setTipoPago_NMsEliminados(List<TipoPago_NM> tipopago_nmsEliminados) {
		this.tipopago_nmsEliminados = tipopago_nmsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPago_NM() {
		return jComboBoxTiposSeleccionarTipoPago_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPago_NM(
			JComboBox jComboBoxTiposSeleccionarTipoPago_NM) {
		this.jComboBoxTiposSeleccionarTipoPago_NM = jComboBoxTiposSeleccionarTipoPago_NM;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPago_NM .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPago_NM() {
		return jTextFieldValorCampoGeneralTipoPago_NM;
	}

	public void setjTextFieldValorCampoGeneralTipoPago_NM(
			JTextField jTextFieldValorCampoGeneralTipoPago_NM) {
		this.jTextFieldValorCampoGeneralTipoPago_NM = jTextFieldValorCampoGeneralTipoPago_NM;
	}

	public void setBorderResaltarValorCampoGeneralTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPago_NM .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPago_NM() {
		return this.jCheckBoxSeleccionarTodosTipoPago_NM;
	}

	public void setjCheckBoxSeleccionarTodosTipoPago_NM(
			JCheckBox jCheckBoxSeleccionarTodosTipoPago_NM) {
		this.jCheckBoxSeleccionarTodosTipoPago_NM = jCheckBoxSeleccionarTodosTipoPago_NM;
	}

	public void setBorderResaltarSeleccionarTodosTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPago_NM .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPago_NM() {
		return this.jCheckBoxSeleccionadosTipoPago_NM;
	}

	public void setjCheckBoxSeleccionadosTipoPago_NM(
			JCheckBox jCheckBoxSeleccionadosTipoPago_NM) {
		this.jCheckBoxSeleccionadosTipoPago_NM = jCheckBoxSeleccionadosTipoPago_NM;
	}
	
	public void setBorderResaltarSeleccionadosTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPago_NM .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPago_NM() {
		return this.jComboBoxTiposArchivosReportesTipoPago_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPago_NM(
			JComboBox jComboBoxTiposArchivosReportesTipoPago_NM) {
		this.jComboBoxTiposArchivosReportesTipoPago_NM = jComboBoxTiposArchivosReportesTipoPago_NM;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPago_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPago_NM() {
		return this.jComboBoxTiposReportesTipoPago_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPago_NM(
			JComboBox jComboBoxTiposReportesTipoPago_NM) {
		this.jComboBoxTiposReportesTipoPago_NM = jComboBoxTiposReportesTipoPago_NM;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPago_NM() {
	//	return jComboBoxTiposReportesDinamicoTipoPago_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPago_NM(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPago_NM) {
	//	this.jComboBoxTiposReportesDinamicoTipoPago_NM = jComboBoxTiposReportesDinamicoTipoPago_NM;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPago_NM() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPago_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPago_NM(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPago_NM) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM = jComboBoxTiposArchivosReportesDinamicoTipoPago_NM;
	//}
	
	public void setBorderResaltarTiposReportesTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPago_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPago_NM() {
		return this.jComboBoxTiposGraficosReportesTipoPago_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPago_NM(
			JComboBox jComboBoxTiposGraficosReportesTipoPago_NM) {
		this.jComboBoxTiposGraficosReportesTipoPago_NM = jComboBoxTiposGraficosReportesTipoPago_NM;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPago_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPago_NM() {
		return this.jComboBoxTiposPaginacionTipoPago_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPago_NM(
			JComboBox jComboBoxTiposPaginacionTipoPago_NM) {
		this.jComboBoxTiposPaginacionTipoPago_NM = jComboBoxTiposPaginacionTipoPago_NM;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPago_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPago_NM() {
		return this.jComboBoxTiposRelacionesTipoPago_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPago_NM() {
		return this.jComboBoxTiposAccionesTipoPago_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPago_NM(
			JComboBox jComboBoxTiposRelacionesTipoPago_NM) {
		this.jComboBoxTiposRelacionesTipoPago_NM = jComboBoxTiposRelacionesTipoPago_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPago_NM(
			JComboBox jComboBoxTiposAccionesTipoPago_NM) {
		this.jComboBoxTiposAccionesTipoPago_NM = jComboBoxTiposAccionesTipoPago_NM;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPago_NM .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPago_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPago_NM .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPago_NM() {
	//	return jCheckBoxConGraficoDinamicoTipoPago_NM;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPago_NM(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPago_NM) {
	//	this.jCheckBoxConGraficoDinamicoTipoPago_NM = jCheckBoxConGraficoDinamicoTipoPago_NM;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPago_NM() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPago_NM.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPago_NM .setBorder(borderResaltar);		
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
		this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		
		this.tipopago_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopago_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopago_nmSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPago_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPago_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPago_NM= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"nuevo","nuevo","Nuevo"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"duplicar","duplicar","Duplicar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"copiar","copiar","Copiar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"ver_form","ver_form","Ver"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"recargar","recargar","Recargar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPago_NM,this.jTtoolBarTipoPago_NM,
							"cerrar","cerrar","Salir"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPago_NM=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPago_NM;
			
				this.jButtonProcesarInformacionToolBarTipoPago_NM=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPago_NM;
				
		//protected JButton jButtonModificarToolBarTipoPago_NM;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPago_NM=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPago_NM=new JMenuMe("General");
		this.jmenuArchivoTipoPago_NM=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPago_NM=new JMenuMe("Acciones");
		this.jmenuDatosTipoPago_NM=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPago_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPago_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPago_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPago_NM= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPago_NM.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPago_NM,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPago_NM= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPago_NM.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPago_NM,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPago_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPago_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPago_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPago_NM= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPago_NM.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPago_NM,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPago_NM= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPago_NM.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPago_NM,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPago_NM= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPago_NM.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPago_NM,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPago_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPago_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPago_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPago_NM= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPago_NM.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPago_NM,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPago_NM= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPago_NM.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPago_NM,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPago_NM= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPago_NM.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPago_NM,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPago_NM= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPago_NM.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPago_NM,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPago_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPago_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPago_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPago_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPago_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPago_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPago_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPago_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPago_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPago_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPago_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPago_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPago_NM= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPago_NM.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPago_NM,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPago_NM.add(this.jMenuItemCerrarTipoPago_NM);
			
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemNuevoTipoPago_NM);
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemNuevoGuardarCambiosTipoPago_NM);
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemNuevoRelacionesTipoPago_NM);
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemGuardarCambiosTablaTipoPago_NM);		
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemDuplicarTipoPago_NM);		
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemCopiarTipoPago_NM);		
			this.jmenuAccionesTipoPago_NM.add(this.jMenuItemVerFormTipoPago_NM);		
			
			this.jmenuDatosTipoPago_NM.add(this.jMenuItemRecargarInformacionTipoPago_NM);				
			this.jmenuDatosTipoPago_NM.add(this.jMenuItemAnterioresTipoPago_NM);				
			this.jmenuDatosTipoPago_NM.add(this.jMenuItemSiguientesTipoPago_NM);				
			this.jmenuDatosTipoPago_NM.add(this.jMenuItemAbrirOrderByTipoPago_NM);				
			this.jmenuDatosTipoPago_NM.add(this.jMenuItemMostrarOcultarTipoPago_NM);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPago_NM.add(this.jMenuItemGuardarCambiosTipoPago_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPago_NM.add(this.jmenuArchivoTipoPago_NM);		
			this.jmenuBarTipoPago_NM.add(this.jmenuAccionesTipoPago_NM);		
			this.jmenuBarTipoPago_NM.add(this.jmenuDatosTipoPago_NM);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPago_NM);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPago_NM() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoPago_NM=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPago_NM.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPago_NM.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPago_NM.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPago_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPago_NM,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPago_NM = new TipoPago_NMDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Pago_ N M DATOS");
			this.jInternalFrameDetalleFormTipoPago_NM = new TipoPago_NMDetalleFormJInternalFrame(jDesktopPane,this.tipopago_nmSessionBean.getConGuardarRelaciones(),this.tipopago_nmSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPago_NM = null;//new TipoPago_NMDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPago_NM= new GridBagLayout();
		
		
		this.jTableDatosTipoPago_NM = new JTableMe();      
		
		String sToolTipTipoPago_NM="";
		sToolTipTipoPago_NM=TipoPago_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPago_NM+="(Nomina.TipoPago_NM)";
		}
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPago_NM+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPago_NM.setToolTipText(sToolTipTipoPago_NM);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPago_NM);
		this.jTableDatosTipoPago_NM.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPago_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPago_NM.setRowSelectionAllowed(true);
		this.jTableDatosTipoPago_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPago_NM,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPago_NM = new JButtonMe();
		this.jButtonDuplicarTipoPago_NM = new JButtonMe();
		this.jButtonCopiarTipoPago_NM = new JButtonMe();
		this.jButtonVerFormTipoPago_NM = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPago_NM = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPago_NM = new JButtonMe();
		this.jButtonCerrarTipoPago_NM = new JButtonMe();
		
		this.jScrollPanelDatosTipoPago_NM = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPago_NM = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago_ N M";
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPago_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPago_NM.setToolTipText("Acciones");
        this.jPanelAccionesTipoPago_NM.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPago_NM=new ReporteDinamicoJInternalFrame(TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPago_NM();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPago_NM=new ImportacionJInternalFrame(TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPago_NM();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPago_NM = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPago_NM.setText("Orden");
		this.jButtonAbrirOrderByTipoPago_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPago_NM,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPago_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago_NM,false,this);
			
			//this.cargarOrderByTipoPago_NM(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPago_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago_NM,true,this);
			
			//this.cargarOrderByTipoPago_NM(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPago_NM.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPago_NM.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPago_NM.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPago_NM.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPago_NM.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPago_NM.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPago_NM.setText("Nuevo");
		this.jButtonDuplicarTipoPago_NM.setText("Duplicar");
		this.jButtonCopiarTipoPago_NM.setText("Copiar");
		this.jButtonVerFormTipoPago_NM.setText("Ver");
		this.jButtonNuevoRelacionesTipoPago_NM.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.setText("Guardar");
		this.jButtonCerrarTipoPago_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPago_NM,"nuevo_button","Nuevo",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPago_NM,"duplicar_button","Duplicar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPago_NM,"copiar_button","Copiar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPago_NM,"ver_form","Ver",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPago_NM,"nuevorelaciones_button","Nuevo Rel",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPago_NM,"guardarcambiostabla_button","Guardar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPago_NM,"cerrar_button","Salir",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPago_NM.setToolTipText("Nuevo"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPago_NM.setToolTipText("Duplicar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPago_NM.setToolTipText("Copiar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPago_NM.setToolTipText("Ver"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPago_NM.setToolTipText("Nuevo Rel"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.setToolTipText("Guardar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPago_NM.setToolTipText("Salir"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPago_NM";
		inputMap = this.jButtonNuevoTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPago_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPago_NM"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPago_NM";
		inputMap = this.jButtonDuplicarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPago_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPago_NM"));
		
		//COPIAR
		sMapKey = "CopiarTipoPago_NM";
		inputMap = this.jButtonCopiarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPago_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPago_NM"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPago_NM";
		inputMap = this.jButtonVerFormTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPago_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPago_NM"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPago_NM";
		inputMap = this.jButtonNuevoRelacionesTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPago_NM"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPago_NM";
		inputMap = this.jButtonModificarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPago_NM"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPago_NM";
		inputMap = this.jButtonCerrarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPago_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPago_NM";
		inputMap = this.jButtonGuardarCambiosTablaTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPago_NM"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPago_NM.setName("jPanelParametrosReportesTipoPago_NM"); 
		
		this.jPanelParametrosReportesAccionesTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPago_NM.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPago_NM.setName("jPanelParametrosReportesAccionesTipoPago_NM"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPago_NM = new JButtonMe();
		this.jButtonRecargarInformacionTipoPago_NM.setText("Recargar");
		this.jButtonRecargarInformacionTipoPago_NM.setToolTipText("Recargar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPago_NM,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPago_NM = new JButtonMe();
		this.jButtonProcesarInformacionTipoPago_NM.setText("Procesar");
		this.jButtonProcesarInformacionTipoPago_NM.setToolTipText("Procesar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPago_NM.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPago_NM.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPago_NM.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPago_NM.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago_NM.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPago_NM.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago_NM.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPago_NM.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago_NM.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPago_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPago_NM.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPago_NM.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPago_NM.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPago_NM.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPago_NM.setText("Accion");
		this.jComboBoxTiposAccionesTipoPago_NM.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPago_NM.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPago_NM.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPago_NM=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPago_NM.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPago_NM.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPago_NM.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPago_NM = new JLabelMe();
		
		this.jLabelAccionesTipoPago_NM.setText("Acciones");		
		this.jLabelAccionesTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPago_NM = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPago_NM.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPago_NM.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPago_NM = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPago_NM.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPago_NM.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPago_NM = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPago_NM.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPago_NM.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPago_NM = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPago_NM.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPago_NM.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPago_NM = new JButtonMe();
		//this.jButtonAnterioresTipoPago_NM.setText("<<");
        this.jButtonAnterioresTipoPago_NM.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPago_NM,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPago_NM = new JButtonMe();
		//this.jButtonSiguientesTipoPago_NM.setText(">>");
        this.jButtonSiguientesTipoPago_NM.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPago_NM,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPago_NM = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPago_NM.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPago_NM.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPago_NM,"nuevoguardarcambios_button","Nue",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPago_NM";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPago_NM"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPago_NM";
		inputMap = this.jButtonRecargarInformacionTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPago_NM"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPago_NM";
		inputMap = this.jButtonSiguientesTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPago_NM"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPago_NM";
		inputMap = this.jButtonAnterioresTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPago_NM"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPago_NM();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPago_NM.setMinimumSize(new Dimension(this.getWidth(),TipoPago_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPago_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPago_NM.setMaximumSize(new Dimension(this.getWidth(),TipoPago_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPago_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPago_NM.setPreferredSize(new Dimension(this.getWidth(),TipoPago_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPago_NMBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPago_NM = new GridBagLayout();

			this.jPanelPaginacionTipoPago_NM.setLayout(gridaBagLayoutPaginacionTipoPago_NM);						
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 0;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonAnterioresTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					
						
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPago_NM.gridy = 0;
			
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonNuevoGuardarCambiosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
						
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPago_NM.gridy = 0;
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonSiguientesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 1;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonNuevoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPago_NM.gridy = 1;
				this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoPago_NM.add(this.jButtonNuevoRelacionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			}
			
			
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPago_NM.gridy = 1;
				this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPago_NM.add(this.jButtonGuardarCambiosTablaTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			}
			
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 1;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonDuplicarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 1;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonCopiarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 1;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonVerFormTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 1;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPago_NM.add(this.jButtonCerrarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
		
		
		this.jButtonRecargarInformacionTipoPago_NM.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPago_NM.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPago_NM.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPago_NM.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPago_NM.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPago_NM.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPago_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPago_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPago_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPago_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPago_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPago_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPago_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPago_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPago_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPago_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPago_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPago_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPago_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPago_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPago_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPago_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPago_NM.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPago_NM.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPago_NM.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPago_NM.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPago_NM.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPago_NM.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPago_NM.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPago_NM.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPago_NM.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPago_NM.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPago_NM.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPago_NM.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPago_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPago_NM = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPago_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPago_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPago_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPago_NM = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPago_NM.setLayout(gridaBagParametrosReportesTipoPago_NM);
			this.jPanelParametrosReportesAccionesTipoPago_NM.setLayout(gridaBagParametrosReportesAccionesTipoPago_NM);
			
			
			this.jPanelParametrosAuxiliar1TipoPago_NM.setLayout(gridaBagParametrosAuxiliar1TipoPago_NM);
			this.jPanelParametrosAuxiliar2TipoPago_NM.setLayout(gridaBagParametrosAuxiliar2TipoPago_NM);
			this.jPanelParametrosAuxiliar3TipoPago_NM.setLayout(gridaBagParametrosAuxiliar3TipoPago_NM);
			this.jPanelParametrosAuxiliar4TipoPago_NM.setLayout(gridaBagParametrosAuxiliar4TipoPago_NM);
			//this.jPanelParametrosAuxiliar5TipoPago_NM.setLayout(gridaBagParametrosAuxiliar2TipoPago_NM);			
			
			
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago_NM.add(this.jButtonRecargarInformacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago_NM.add(this.jComboBoxTiposPaginacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago_NM.add(this.jCheckBoxConAltoMaximoTablaTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago_NM.add(this.jComboBoxTiposArchivosReportesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago_NM.add(this.jPanelParametrosAuxiliar1TipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPago_NM.add(this.jComboBoxTiposReportesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago_NM.add(this.jPanelParametrosAuxiliar4TipoPago_NM, this.gridBagConstraintsTipoPago_NM);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago_NM.add(this.jComboBoxTiposReportesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago_NM.add(this.jCheckBoxGenerarReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago_NM.add(this.jPanelParametrosAuxiliar2TipoPago_NM, this.gridBagConstraintsTipoPago_NM);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago_NM.add(this.jLabelAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPago_NM.add(this.jButtonAbrirOrderByTipoPago_NM, this.gridBagConstraintsTipoPago_NM);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago_NM.add(this.jComboBoxTiposSeleccionarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			
			
			/*
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago_NM.add(this.jCheckBoxSeleccionarTodosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPago_NM.add(this.jCheckBoxSeleccionarTodosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);															
				
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPago_NM.add(this.jCheckBoxSeleccionadosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago_NM.add(this.jPanelParametrosAuxiliar3TipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago_NM.add(this.jComboBoxTiposRelacionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
				
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago_NM.add(this.jComboBoxTiposAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
	
				
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago_NM.add(this.jTextFieldValorCampoGeneralTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPago_NM = new GridBagLayout();

			this.jScrollPanelDatosTipoPago_NM.setLayout(gridaBagLayoutDatosTipoPago_NM);
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = 0;
			this.gridBagConstraintsTipoPago_NM.gridx = 0;
			
			this.jScrollPanelDatosTipoPago_NM.add(this.jTableDatosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPago_NM.setViewportView(this.jTableDatosTipoPago_NM);
		this.jTableDatosTipoPago_NM.setFillsViewportHeight(true);
		this.jTableDatosTipoPago_NM.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPago_NM= new GridBagLayout();
		this.jPanelAccionesTipoPago_NM.setLayout(gridaBagLayoutAccionesTipoPago_NM);
		
		
		/*	
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
			
		this.jPanelAccionesTipoPago_NM.add(this.jButtonNuevoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPago_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPago_NM);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();						
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPago_NM.gridx = 0;		
			//this.gridBagConstraintsTipoPago_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPago_NM.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPago_NM.gridx = 0;		
		//this.gridBagConstraintsTipoPago_NM.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPago_NM.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPago_NM);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);								
		
		
		/*
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		*/		
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPago_NM.gridx =0;
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPago_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
				
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPago_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPago_NM = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPago_NM.setLayout(gridaBagLayoutBusquedasParametrosTipoPago_NM);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPago_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPago_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPago_NM;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPago_NM() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPago_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPago_NM.setName("jPanelReporteDinamicoTipoPago_NM"); 
		
		this.jPanelReporteDinamicoTipoPago_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPago_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPago_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPago_NM.setLayout(gridaBagLayoutReporteDinamicoTipoPago_NM);
		
		
		this.jInternalFrameReporteDinamicoTipoPago_NM= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPago_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPago_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPago_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPago_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPago_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPago_NM.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPago_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPago_NM.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPago_NM.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPago_NM.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPago_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPago_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPago_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPago_NM = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPago_NM.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jLabelColumnasSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPago_NM = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPago_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPago_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPago_NM.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPago_NM.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPago_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPago_NM=new JScrollPane(this.jListColumnasSelectReporteTipoPago_NM);
			
			this.jScrollColumnasSelectReporteTipoPago_NM.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPago_NM.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPago_NM.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPago_NM.add(this.jListColumnasSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jScrollColumnasSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPago_NM = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPago_NM.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jLabelRelacionesSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPago_NM = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPago_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPago_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPago_NM.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPago_NM.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPago_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPago_NM=new JScrollPane(this.jListRelacionesSelectReporteTipoPago_NM);
			
			this.jScrollRelacionesSelectReporteTipoPago_NM.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPago_NM.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPago_NM.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPago_NM.add(this.jListRelacionesSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jScrollRelacionesSelectReporteTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoPago_NM = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPago_NM = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPago_NM = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPago_NM = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPago_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPago_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPago_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPago_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPago_NM = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPago_NM.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jLabelGenerarExcelReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPago_NM = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPago_NM.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPago_NM,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPago_NM.setToolTipText("Generar EXCEL"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPago_NM.add(this.jButtonGenerarExcelReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jComboBoxTiposReportesDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPago_NM = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPago_NM.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jLabelTiposArchivoReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPago_NM = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPago_NM.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPago_NM,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPago_NM.setToolTipText("Generar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jButtonGenerarReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPago_NM = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPago_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPago_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPago_NM.setToolTipText("Cancelar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago_NM.add(this.jButtonCerrarReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPago_NM = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPago_NM= new JScrollPane(jPanelReporteDinamicoTipoPago_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPago_NM.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPago_NM.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPago_NM.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPago_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPago_NM.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPago_NM);
		this.jInternalFrameReporteDinamicoTipoPago_NM.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPago_NM() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPago_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPago_NM.setName("jPanelImportacionTipoPago_NM"); 
		
		this.jPanelImportacionTipoPago_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPago_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPago_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPago_NM.setLayout(gridaBagLayoutImportacionTipoPago_NM);
		
		
		this.jInternalFrameImportacionTipoPago_NM= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPago_NM= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPago_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPago_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPago_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPago_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPago_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPago_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPago_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPago_NM.setResizable(true);
	    this.jInternalFrameImportacionTipoPago_NM.setClosable(true);
	    this.jInternalFrameImportacionTipoPago_NM.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPago_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPago_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPago_NM.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPago_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPago_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPago_NM.setResizable(true);
	    this.jInternalFrameImportacionTipoPago_NM.setClosable(true);
	    this.jInternalFrameImportacionTipoPago_NM.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPago_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPago_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPago_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPago_NM = new JLabelMe();

		this.jLabelArchivoImportacionTipoPago_NM.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPago_NM.add(this.jLabelArchivoImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPago_NM = new JFileChooser();		
		this.jFileChooserImportacionTipoPago_NM.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPago_NM = new JButtonMe();
		this.jButtonAbrirImportacionTipoPago_NM.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPago_NM,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPago_NM.setToolTipText("Generar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago_NM.add(this.jButtonAbrirImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPago_NM = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPago_NM.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPago_NM.add(this.jLabelPathArchivoImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPago_NM=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPago_NM.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPago_NM.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPago_NM.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago_NM.add(this.jTextFieldPathArchivoImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPago_NM = new JButtonMe();
		this.jButtonGenerarImportacionTipoPago_NM.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPago_NM,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPago_NM.setToolTipText("Generar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago_NM.add(this.jButtonGenerarImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPago_NM = new JButtonMe();
		this.jButtonCerrarImportacionTipoPago_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPago_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPago_NM.setToolTipText("Cancelar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago_NM.add(this.jButtonCerrarImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPago_NM = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPago_NM= new JScrollPane(jPanelImportacionTipoPago_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPago_NM.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPago_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPago_NM.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPago_NM);
		this.jInternalFrameImportacionTipoPago_NM.getContentPane().add(this.jScrollPanelImportacionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPago_NM(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPago_NM = new JButtonMe();
			this.jButtonAbrirOrderByTipoPago_NM.setText("Orden");
			this.jButtonAbrirOrderByTipoPago_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPago_NM,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPago_NM";
			inputMap = this.jButtonAbrirOrderByTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPago_NM"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPago_NM = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPago_NM.setName("jPanelOrderByTipoPago_NM"); 
			
			this.jPanelOrderByTipoPago_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPago_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPago_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPago_NM.setLayout(gridaBagLayoutOrderByTipoPago_NM);
			
			
			this.jTableDatosTipoPago_NMOrderBy = new JTableMe();        
			this.jTableDatosTipoPago_NMOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPago_NMOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPago_NMOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPago_NMOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPago_NMOrderBy.setViewportView(this.jTableDatosTipoPago_NMOrderBy);
			this.jTableDatosTipoPago_NMOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPago_NMOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPago_NM= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPago_NM= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPago_NM = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPago_NM= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPago_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPago_NM.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPago_NM.setTitle("Orden");
			this.jInternalFrameOrderByTipoPago_NM.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPago_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPago_NM.setResizable(true);
			this.jInternalFrameOrderByTipoPago_NM.setClosable(true);
			this.jInternalFrameOrderByTipoPago_NM.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPago_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPago_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPago_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPago_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPago_NM.ipady =150;
				
			this.jPanelOrderByTipoPago_NM.add(jScrollPanelDatosTipoPago_NMOrderBy, this.gridBagConstraintsTipoPago_NM);//this.jTableDatosTipoPago_NMTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPago_NM = new JButtonMe();
			this.jButtonCerrarOrderByTipoPago_NM.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPago_NM,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPago_NM.setToolTipText("Cancelar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPago_NM.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPago_NM.add(this.jButtonCerrarOrderByTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPago_NM = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPago_NM= new JScrollPane(jPanelOrderByTipoPago_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPago_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPago_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPago_NM.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPago_NM);
			
			this.jInternalFrameOrderByTipoPago_NM.getContentPane().add(this.jScrollPanelOrderByTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
		
		} else {
			this.jButtonAbrirOrderByTipoPago_NM = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipopago_nmSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPago_NM.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPago_NM.getRowHeight();//TipoPago_NMConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPago_NM.isSelected()) {
					iHeightTable=TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPago_NM.isSelected()) {
					iHeightTable=TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPago_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPago_NM.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPago_NM.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPago_NM.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPago_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPago_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPago_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPago_NM!=null && this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy()!=null) {
			//if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPago_NM.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPago_NM.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPago_NM.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPago_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPago_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPago_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipopago_nmLogic.getTipoPago_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopago_nms.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPago_NM> TraerTipoPago_NMBeans(List<TipoPago_NM> tipopago_nms,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPago_NM tipopago_nm:tipopago_nms) {
					
				if(!(TipoPago_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPago_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipopago_nm.setsDetalleGeneralEntityReporte(TipoPago_NMConstantesFunciones.getTipoPago_NMDescripcion(tipopago_nm));
										
						
					
					

					if(tipopago_nm.getEstructuras()!=null && Funciones.existeClass(classes,Estructura.class)) {
						try{tipopago_nm.setestructurasDescripcionReporte(new JRBeanCollectionDataSource(EstructuraJInternalFrame.TraerEstructuraBeans(tipopago_nm.getEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipopago_nm.getCargos()!=null && Funciones.existeClass(classes,Cargo.class)) {
						try{tipopago_nm.setcargosDescripcionReporte(new JRBeanCollectionDataSource(CargoJInternalFrame.TraerCargoBeans(tipopago_nm.getCargos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipopago_nm.setsDetalleGeneralEntityReporte(tipopago_nm.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopago_nmbeans.add(tipopago_nmbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipopago_nms;
    }
	//PARA REPORTES FIN
}
