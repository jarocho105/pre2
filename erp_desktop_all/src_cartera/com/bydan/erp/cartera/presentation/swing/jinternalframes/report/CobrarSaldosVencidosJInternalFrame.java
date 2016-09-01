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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarSaldosVencidosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarSaldosVencidosJInternalFrame extends CobrarSaldosVencidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarSaldosVencidos;
	
	protected JMenuBar jmenuBarCobrarSaldosVencidos;
	
	protected JMenu jmenuCobrarSaldosVencidos;
	protected JMenu jmenuDatosCobrarSaldosVencidos;
	protected JMenu jmenuArchivoCobrarSaldosVencidos;
	protected JMenu jmenuAccionesCobrarSaldosVencidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarSaldosVencidos;	
	protected GridBagConstraints gridBagConstraintsCobrarSaldosVencidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarSaldosVencidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarSaldosVencidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarSaldosVencidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarSaldosVencidosSessionBean cobrarsaldosvencidosSessionBean;
		
	
	
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarSaldosVencidos> cobrarsaldosvencidoss;		
	public List<CobrarSaldosVencidos> cobrarsaldosvencidossEliminados;	
	public List<CobrarSaldosVencidos> cobrarsaldosvencidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarSaldosVencidos;		
	protected JButton jButtonAbrirOrderByCobrarSaldosVencidos;
	
	
	//protected JPanel jPanelOrderByCobrarSaldosVencidos;
	//public JScrollPane jScrollPanelOrderByCobrarSaldosVencidos;	
	//protected JButton jButtonCerrarOrderByCobrarSaldosVencidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarSaldosVencidosLogic cobrarsaldosvencidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarSaldosVencidos;
	public JScrollPane jScrollPanelDatosEdicionCobrarSaldosVencidos;
	public JScrollPane jScrollPanelDatosGeneralCobrarSaldosVencidos;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarSaldosVencidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarSaldosVencidos;
	//public JScrollPane jScrollPanelImportacionCobrarSaldosVencidos;
	
	
	
	protected JPanel jPanelAccionesCobrarSaldosVencidos;
	
    protected JPanel jPanelPaginacionCobrarSaldosVencidos;
    protected JPanel jPanelParametrosReportesCobrarSaldosVencidos;
	protected JPanel jPanelParametrosReportesAccionesCobrarSaldosVencidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarSaldosVencidos;
	protected JPanel jPanelParametrosAuxiliar2CobrarSaldosVencidos;
	protected JPanel jPanelParametrosAuxiliar3CobrarSaldosVencidos;
	protected JPanel jPanelParametrosAuxiliar4CobrarSaldosVencidos;
	//protected JPanel jPanelParametrosAuxiliar5CobrarSaldosVencidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarSaldosVencidos;
	//protected JPanel jPanelImportacionCobrarSaldosVencidos;
	
	
	public JTable jTableDatosCobrarSaldosVencidos;
	
	
	
	//public JTable jTableDatosCobrarSaldosVencidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarSaldosVencidos;
	protected JButton jButtonDuplicarCobrarSaldosVencidos;
	protected JButton jButtonCopiarCobrarSaldosVencidos;
	protected JButton jButtonVerFormCobrarSaldosVencidos;
	protected JButton jButtonNuevoRelacionesCobrarSaldosVencidos;
	protected JButton jButtonModificarCobrarSaldosVencidos;
	
    protected JButton jButtonGuardarCambiosTablaCobrarSaldosVencidos;
	protected JButton jButtonCerrarCobrarSaldosVencidos;
	
	
	protected JButton jButtonRecargarInformacionCobrarSaldosVencidos;
	protected JButton jButtonProcesarInformacionCobrarSaldosVencidos;
	
	
	protected JButton jButtonAnterioresCobrarSaldosVencidos;
	protected JButton jButtonSiguientesCobrarSaldosVencidos;
	protected JButton jButtonNuevoGuardarCambiosCobrarSaldosVencidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarSaldosVencidos;
	//protected JButton jButtonCerrarReporteDinamicoCobrarSaldosVencidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarSaldosVencidos;
	//protected JButton jButtonGenerarImportacionCobrarSaldosVencidos;
	//protected JButton jButtonCerrarImportacionCobrarSaldosVencidos;
	//protected JFileChooser jFileChooserImportacionCobrarSaldosVencidos;
	//protected File fileImportacionCobrarSaldosVencidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarSaldosVencidos;
	protected JButton jButtonDuplicarToolBarCobrarSaldosVencidos;
	protected JButton jButtonNuevoRelacionesToolBarCobrarSaldosVencidos;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarSaldosVencidos;
	protected JButton jButtonCopiarToolBarCobrarSaldosVencidos;
	protected JButton jButtonVerFormToolBarCobrarSaldosVencidos;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarSaldosVencidos;
	protected JButton jButtonCerrarToolBarCobrarSaldosVencidos;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarSaldosVencidos;
	protected JButton jButtonProcesarInformacionToolBarCobrarSaldosVencidos;
	protected JButton jButtonAnterioresToolBarCobrarSaldosVencidos;
	protected JButton jButtonSiguientesToolBarCobrarSaldosVencidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos;
	protected JButton jButtonAbrirOrderByToolBarCobrarSaldosVencidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDuplicarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarSaldosVencidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarSaldosVencidos;
	protected JMenuItem jMenuItemCopiarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemVerFormCobrarSaldosVencidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarSaldosVencidos;
	protected JMenuItem jMenuItemCerrarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarSaldosVencidos;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarSaldosVencidos;
	protected JMenuItem jMenuItemProcesarInformacionCobrarSaldosVencidos;
	protected JMenuItem jMenuItemAnterioresCobrarSaldosVencidos;
	protected JMenuItem jMenuItemSiguientesCobrarSaldosVencidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos;
	protected JMenuItem jMenuItemAbrirOrderByCobrarSaldosVencidos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarSaldosVencidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarSaldosVencidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarSaldosVencidos;
	protected JCheckBox jCheckBoxSeleccionadosCobrarSaldosVencidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarSaldosVencidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarSaldosVencidos;
	protected JTextField jTextFieldValorCampoGeneralCobrarSaldosVencidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarSaldosVencidos;
	//public JList<Reporte> jListColumnasSelectReporteCobrarSaldosVencidos;
	//public JScrollPane jScrollColumnasSelectReporteCobrarSaldosVencidos;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarSaldosVencidos;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarSaldosVencidos;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarSaldosVencidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarSaldosVencidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarSaldosVencidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos;
	
		
	//public JLabel jLabelArchivoImportacionCobrarSaldosVencidos;	
	//public JLabel jLabelPathArchivoImportacionCobrarSaldosVencidos;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarSaldosVencidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarSaldosVencidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarSaldosVencidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarSaldosVencidos;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarSaldosVencidos;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarSaldosVencidos;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarSaldosVencidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarSaldosVencidos;
	public JPanel jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos;
	public JButton jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos;
	
	public JPanel jPanelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos;
	public JLabel jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos;
	public JButton jButtonid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarSaldosVencidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarSaldosVencidos)	{
		this.jButtonRecargarInformacionCobrarSaldosVencidos = jButtonRecargarInformacionCobrarSaldosVencidos;
	}
	
	public JButton getjButtonProcesarInformacionCobrarSaldosVencidos() {
		return this.jButtonProcesarInformacionCobrarSaldosVencidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarSaldosVencidos)	{
		this.jButtonProcesarInformacionCobrarSaldosVencidos = jButtonProcesarInformacionCobrarSaldosVencidos;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarSaldosVencidos() {
		return this.jButtonRecargarInformacionCobrarSaldosVencidos;
	}
	
	
	public List<CobrarSaldosVencidos> getcobrarsaldosvencidoss() {
		return this.cobrarsaldosvencidoss;
	}

	public void setcobrarsaldosvencidoss(List<CobrarSaldosVencidos> cobrarsaldosvencidoss) {
		this.cobrarsaldosvencidoss = cobrarsaldosvencidoss;
	}
	
	public List<CobrarSaldosVencidos> getcobrarsaldosvencidossAux() {
		return this.cobrarsaldosvencidossAux;
	}

	public void setcobrarsaldosvencidossAux(List<CobrarSaldosVencidos> cobrarsaldosvencidossAux) {
		this.cobrarsaldosvencidossAux = cobrarsaldosvencidossAux;
	}
	
	public List<CobrarSaldosVencidos> getcobrarsaldosvencidossEliminados() {
		return this.cobrarsaldosvencidossEliminados;
	}

	public void setCobrarSaldosVencidossEliminados(List<CobrarSaldosVencidos> cobrarsaldosvencidossEliminados) {
		this.cobrarsaldosvencidossEliminados = cobrarsaldosvencidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarSaldosVencidos() {
		return jComboBoxTiposSeleccionarCobrarSaldosVencidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarSaldosVencidos(
			JComboBox jComboBoxTiposSeleccionarCobrarSaldosVencidos) {
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos = jComboBoxTiposSeleccionarCobrarSaldosVencidos;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarSaldosVencidos() {
		return jTextFieldValorCampoGeneralCobrarSaldosVencidos;
	}

	public void setjTextFieldValorCampoGeneralCobrarSaldosVencidos(
			JTextField jTextFieldValorCampoGeneralCobrarSaldosVencidos) {
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos = jTextFieldValorCampoGeneralCobrarSaldosVencidos;
	}

	public void setBorderResaltarValorCampoGeneralCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarSaldosVencidos() {
		return this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos;
	}

	public void setjCheckBoxSeleccionarTodosCobrarSaldosVencidos(
			JCheckBox jCheckBoxSeleccionarTodosCobrarSaldosVencidos) {
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos = jCheckBoxSeleccionarTodosCobrarSaldosVencidos;
	}

	public void setBorderResaltarSeleccionarTodosCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarSaldosVencidos() {
		return this.jCheckBoxSeleccionadosCobrarSaldosVencidos;
	}

	public void setjCheckBoxSeleccionadosCobrarSaldosVencidos(
			JCheckBox jCheckBoxSeleccionadosCobrarSaldosVencidos) {
		this.jCheckBoxSeleccionadosCobrarSaldosVencidos = jCheckBoxSeleccionadosCobrarSaldosVencidos;
	}
	
	public void setBorderResaltarSeleccionadosCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarSaldosVencidos() {
		return this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposArchivosReportesCobrarSaldosVencidos) {
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos = jComboBoxTiposArchivosReportesCobrarSaldosVencidos;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarSaldosVencidos() {
		return this.jComboBoxTiposReportesCobrarSaldosVencidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposReportesCobrarSaldosVencidos) {
		this.jComboBoxTiposReportesCobrarSaldosVencidos = jComboBoxTiposReportesCobrarSaldosVencidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarSaldosVencidos() {
	//	return jComboBoxTiposReportesDinamicoCobrarSaldosVencidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarSaldosVencidos(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarSaldosVencidos) {
	//	this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos = jComboBoxTiposReportesDinamicoCobrarSaldosVencidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos = jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos;
	//}
	
	public void setBorderResaltarTiposReportesCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarSaldosVencidos() {
		return this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposGraficosReportesCobrarSaldosVencidos) {
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos = jComboBoxTiposGraficosReportesCobrarSaldosVencidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarSaldosVencidos() {
		return this.jComboBoxTiposPaginacionCobrarSaldosVencidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarSaldosVencidos(
			JComboBox jComboBoxTiposPaginacionCobrarSaldosVencidos) {
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos = jComboBoxTiposPaginacionCobrarSaldosVencidos;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarSaldosVencidos() {
		return this.jComboBoxTiposRelacionesCobrarSaldosVencidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarSaldosVencidos() {
		return this.jComboBoxTiposAccionesCobrarSaldosVencidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposRelacionesCobrarSaldosVencidos) {
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos = jComboBoxTiposRelacionesCobrarSaldosVencidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposAccionesCobrarSaldosVencidos) {
		this.jComboBoxTiposAccionesCobrarSaldosVencidos = jComboBoxTiposAccionesCobrarSaldosVencidos;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarSaldosVencidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarSaldosVencidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarSaldosVencidos() {
	//	return jCheckBoxConGraficoDinamicoCobrarSaldosVencidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarSaldosVencidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarSaldosVencidos) {
	//	this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos = jCheckBoxConGraficoDinamicoCobrarSaldosVencidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarSaldosVencidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarSaldosVencidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos .setBorder(borderResaltar);		
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
		this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
		
		this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarsaldosvencidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarSaldosVencidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Saldos Vencidos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarSaldosVencidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarSaldosVencidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"nuevo","nuevo","Nuevo"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"duplicar","duplicar","Duplicar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"copiar","copiar","Copiar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"ver_form","ver_form","Ver"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"recargar","recargar","Buscar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarSaldosVencidos,this.jTtoolBarCobrarSaldosVencidos,
							"cerrar","cerrar","Salir"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarSaldosVencidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarSaldosVencidos;
			
				this.jButtonProcesarInformacionToolBarCobrarSaldosVencidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarSaldosVencidos;
				
		//protected JButton jButtonModificarToolBarCobrarSaldosVencidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarSaldosVencidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarSaldosVencidos=new JMenuMe("General");
		this.jmenuArchivoCobrarSaldosVencidos=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarSaldosVencidos=new JMenuMe("Acciones");
		this.jmenuDatosCobrarSaldosVencidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarSaldosVencidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarSaldosVencidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarSaldosVencidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarSaldosVencidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarSaldosVencidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarSaldosVencidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarSaldosVencidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarSaldosVencidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarSaldosVencidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarSaldosVencidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarSaldosVencidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarSaldosVencidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarSaldosVencidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarSaldosVencidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarSaldosVencidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarSaldosVencidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarSaldosVencidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarSaldosVencidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarSaldosVencidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarSaldosVencidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarSaldosVencidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarSaldosVencidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarSaldosVencidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarSaldosVencidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarSaldosVencidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarSaldosVencidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarSaldosVencidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarSaldosVencidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarSaldosVencidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarSaldosVencidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarSaldosVencidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarSaldosVencidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarSaldosVencidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarSaldosVencidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarSaldosVencidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarSaldosVencidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarSaldosVencidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarSaldosVencidos.add(this.jMenuItemCerrarCobrarSaldosVencidos);
			
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemNuevoCobrarSaldosVencidos);
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos);
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemNuevoRelacionesCobrarSaldosVencidos);
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemGuardarCambiosTablaCobrarSaldosVencidos);		
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemDuplicarCobrarSaldosVencidos);		
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemCopiarCobrarSaldosVencidos);		
			this.jmenuAccionesCobrarSaldosVencidos.add(this.jMenuItemVerFormCobrarSaldosVencidos);		
			
			this.jmenuDatosCobrarSaldosVencidos.add(this.jMenuItemRecargarInformacionCobrarSaldosVencidos);				
			this.jmenuDatosCobrarSaldosVencidos.add(this.jMenuItemAnterioresCobrarSaldosVencidos);				
			this.jmenuDatosCobrarSaldosVencidos.add(this.jMenuItemSiguientesCobrarSaldosVencidos);				
			this.jmenuDatosCobrarSaldosVencidos.add(this.jMenuItemAbrirOrderByCobrarSaldosVencidos);				
			this.jmenuDatosCobrarSaldosVencidos.add(this.jMenuItemMostrarOcultarCobrarSaldosVencidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarSaldosVencidos.add(this.jMenuItemGuardarCambiosCobrarSaldosVencidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarSaldosVencidos.add(this.jmenuArchivoCobrarSaldosVencidos);		
			this.jmenuBarCobrarSaldosVencidos.add(this.jmenuAccionesCobrarSaldosVencidos);		
			this.jmenuBarCobrarSaldosVencidos.add(this.jmenuDatosCobrarSaldosVencidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarSaldosVencidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarSaldosVencidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setToolTipText("Buscar Por Grupo Cliente ");
		this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos= new JButtonMe();
		this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setText("Buscar");
		this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setToolTipText("Buscar Por Grupo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos,"buscar_button","Buscar Por Grupo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCobrarSaldosVencidos=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarSaldosVencidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarSaldosVencidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarSaldosVencidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarSaldosVencidos = new CobrarSaldosVencidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Saldos Vencidos DATOS");
			this.jInternalFrameDetalleFormCobrarSaldosVencidos = new CobrarSaldosVencidosDetalleFormJInternalFrame(jDesktopPane,this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones(),this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarSaldosVencidos = null;//new CobrarSaldosVencidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarSaldosVencidos= new GridBagLayout();
		
		
		this.jTableDatosCobrarSaldosVencidos = new JTableMe();      
		
		String sToolTipCobrarSaldosVencidos="";
		sToolTipCobrarSaldosVencidos=CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarSaldosVencidos+="(Cartera.CobrarSaldosVencidos)";
		}
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarSaldosVencidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarSaldosVencidos.setToolTipText(sToolTipCobrarSaldosVencidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarSaldosVencidos);
		this.jTableDatosCobrarSaldosVencidos.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarSaldosVencidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarSaldosVencidos.setRowSelectionAllowed(true);
		this.jTableDatosCobrarSaldosVencidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarSaldosVencidos = new JButtonMe();
		this.jButtonDuplicarCobrarSaldosVencidos = new JButtonMe();
		this.jButtonCopiarCobrarSaldosVencidos = new JButtonMe();
		this.jButtonVerFormCobrarSaldosVencidos = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarSaldosVencidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos = new JButtonMe();
		this.jButtonCerrarCobrarSaldosVencidos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarSaldosVencidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarSaldosVencidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Saldos Vencidos";
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarSaldosVencidos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarSaldosVencidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarSaldosVencidos=new ReporteDinamicoJInternalFrame(CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarSaldosVencidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarSaldosVencidos=new ImportacionJInternalFrame(CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarSaldosVencidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarSaldosVencidos = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarSaldosVencidos.setText("Orden");
		this.jButtonAbrirOrderByCobrarSaldosVencidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarSaldosVencidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarSaldosVencidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarSaldosVencidos,false,this);
			
			//this.cargarOrderByCobrarSaldosVencidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarSaldosVencidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarSaldosVencidos,true,this);
			
			//this.cargarOrderByCobrarSaldosVencidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarSaldosVencidos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosCobrarSaldosVencidos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosCobrarSaldosVencidos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosCobrarSaldosVencidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarSaldosVencidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarSaldosVencidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarSaldosVencidos.setText("Nuevo");
		this.jButtonDuplicarCobrarSaldosVencidos.setText("Duplicar");
		this.jButtonCopiarCobrarSaldosVencidos.setText("Copiar");
		this.jButtonVerFormCobrarSaldosVencidos.setText("Ver");
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setText("Guardar");
		this.jButtonCerrarCobrarSaldosVencidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarSaldosVencidos,"nuevo_button","Nuevo",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarSaldosVencidos,"duplicar_button","Duplicar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarSaldosVencidos,"copiar_button","Copiar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarSaldosVencidos,"ver_form","Ver",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarSaldosVencidos,"nuevorelaciones_button","Nuevo Rel",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarSaldosVencidos,"guardarcambiostabla_button","Guardar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarSaldosVencidos,"cerrar_button","Salir",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarSaldosVencidos.setToolTipText("Nuevo"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarSaldosVencidos.setToolTipText("Duplicar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarSaldosVencidos.setToolTipText("Copiar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarSaldosVencidos.setToolTipText("Ver"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.setToolTipText("Nuevo Rel"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setToolTipText("Guardar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarSaldosVencidos.setToolTipText("Salir"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarSaldosVencidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarSaldosVencidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarSaldosVencidos";
		inputMap = this.jButtonDuplicarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarSaldosVencidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarSaldosVencidos"));
		
		//COPIAR
		sMapKey = "CopiarCobrarSaldosVencidos";
		inputMap = this.jButtonCopiarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarSaldosVencidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarSaldosVencidos"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarSaldosVencidos";
		inputMap = this.jButtonVerFormCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarSaldosVencidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarSaldosVencidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoRelacionesCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarSaldosVencidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarSaldosVencidos";
		inputMap = this.jButtonModificarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarSaldosVencidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarSaldosVencidos";
		inputMap = this.jButtonCerrarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarSaldosVencidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarSaldosVencidos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarSaldosVencidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarSaldosVencidos.setName("jPanelParametrosReportesCobrarSaldosVencidos"); 
		
		this.jPanelParametrosReportesAccionesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarSaldosVencidos.setName("jPanelParametrosReportesAccionesCobrarSaldosVencidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarSaldosVencidos = new JButtonMe();
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setText("Buscar");
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setToolTipText("Buscar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarSaldosVencidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarSaldosVencidos = new JButtonMe();
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setText("Procesar");
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setToolTipText("Procesar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarSaldosVencidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarSaldosVencidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarSaldosVencidos.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarSaldosVencidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarSaldosVencidos = new JLabelMe();
		
		this.jLabelAccionesCobrarSaldosVencidos.setText("Acciones");		
		this.jLabelAccionesCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarSaldosVencidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarSaldosVencidos = new JButtonMe();
		//this.jButtonAnterioresCobrarSaldosVencidos.setText("<<");
        this.jButtonAnterioresCobrarSaldosVencidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarSaldosVencidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarSaldosVencidos = new JButtonMe();
		//this.jButtonSiguientesCobrarSaldosVencidos.setText(">>");
        this.jButtonSiguientesCobrarSaldosVencidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarSaldosVencidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos,"nuevoguardarcambios_button","Nue",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarSaldosVencidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarSaldosVencidos";
		inputMap = this.jButtonRecargarInformacionCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarSaldosVencidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarSaldosVencidos";
		inputMap = this.jButtonSiguientesCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarSaldosVencidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarSaldosVencidos";
		inputMap = this.jButtonAnterioresCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarSaldosVencidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarSaldosVencidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarSaldosVencidos.setMinimumSize(new Dimension(this.getWidth(),CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarSaldosVencidos.setMaximumSize(new Dimension(this.getWidth(),CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarSaldosVencidos.setPreferredSize(new Dimension(this.getWidth(),CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarSaldosVencidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarSaldosVencidos = new GridBagLayout();

			this.jPanelPaginacionCobrarSaldosVencidos.setLayout(gridaBagLayoutPaginacionCobrarSaldosVencidos);						
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonAnterioresCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					
						
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
			
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonNuevoGuardarCambiosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
						
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonSiguientesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonNuevoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
						
			
			
			if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
				this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonGuardarCambiosTablaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			}
			
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonDuplicarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonCopiarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonVerFormCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarSaldosVencidos.add(this.jButtonCerrarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarSaldosVencidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarSaldosVencidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarSaldosVencidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarSaldosVencidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarSaldosVencidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarSaldosVencidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarSaldosVencidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarSaldosVencidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarSaldosVencidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarSaldosVencidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarSaldosVencidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarSaldosVencidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.setLayout(gridaBagParametrosReportesCobrarSaldosVencidos);
			this.jPanelParametrosReportesAccionesCobrarSaldosVencidos.setLayout(gridaBagParametrosReportesAccionesCobrarSaldosVencidos);
			
			
			this.jPanelParametrosAuxiliar1CobrarSaldosVencidos.setLayout(gridaBagParametrosAuxiliar1CobrarSaldosVencidos);
			this.jPanelParametrosAuxiliar2CobrarSaldosVencidos.setLayout(gridaBagParametrosAuxiliar2CobrarSaldosVencidos);
			this.jPanelParametrosAuxiliar3CobrarSaldosVencidos.setLayout(gridaBagParametrosAuxiliar3CobrarSaldosVencidos);
			this.jPanelParametrosAuxiliar4CobrarSaldosVencidos.setLayout(gridaBagParametrosAuxiliar4CobrarSaldosVencidos);
			//this.jPanelParametrosAuxiliar5CobrarSaldosVencidos.setLayout(gridaBagParametrosAuxiliar2CobrarSaldosVencidos);			
			
			
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jButtonRecargarInformacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarSaldosVencidos.add(this.jComboBoxTiposPaginacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarSaldosVencidos.add(this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarSaldosVencidos.add(this.jComboBoxTiposArchivosReportesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jPanelParametrosAuxiliar1CobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarSaldosVencidos.add(this.jComboBoxTiposReportesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);																		
			
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarSaldosVencidos.add(this.jComboBoxTiposGraficosReportesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jPanelParametrosAuxiliar4CobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jComboBoxTiposReportesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jCheckBoxGenerarReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jPanelParametrosAuxiliar2CobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jLabelAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jButtonAbrirOrderByCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jComboBoxTiposSeleccionarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
			
			
			/*
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jCheckBoxConGraficoReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarSaldosVencidos.add(this.jCheckBoxSeleccionarTodosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);															
				
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarSaldosVencidos.add(this.jCheckBoxSeleccionadosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);															
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarSaldosVencidos.add(this.jCheckBoxConGraficoReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jPanelParametrosAuxiliar3CobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarSaldosVencidos.add(this.jComboBoxTiposAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarSaldosVencidos = new GridBagLayout();

			this.jScrollPanelDatosCobrarSaldosVencidos.setLayout(gridaBagLayoutDatosCobrarSaldosVencidos);
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
			
			this.jScrollPanelDatosCobrarSaldosVencidos.add(this.jTableDatosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarSaldosVencidos.setViewportView(this.jTableDatosCobrarSaldosVencidos);
		this.jTableDatosCobrarSaldosVencidos.setFillsViewportHeight(true);
		this.jTableDatosCobrarSaldosVencidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarSaldosVencidos= new GridBagLayout();
		this.jPanelAccionesCobrarSaldosVencidos.setLayout(gridaBagLayoutAccionesCobrarSaldosVencidos);
		
		
		/*	
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
			
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonNuevoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.setLayout(gridaBagLayoutBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);

		gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
		jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.add(jLabelid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);

		gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
		jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.add(jComboBoxid_grupo_clienteBusquedaCobrarSaldosVencidosCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);

		gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarSaldosVencidos.gridy = 1;
		gridBagConstraintsCobrarSaldosVencidos.gridx =1;
		jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos.add(jButtonBusquedaCobrarSaldosVencidosCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);

		jTabbedPaneBusquedasCobrarSaldosVencidos.addTab("1.-Por Grupo Cliente ", jPanelBusquedaCobrarSaldosVencidosCobrarSaldosVencidos);
		jTabbedPaneBusquedasCobrarSaldosVencidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarSaldosVencidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;		
			//this.gridBagConstraintsCobrarSaldosVencidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;		
		//this.gridBagConstraintsCobrarSaldosVencidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarSaldosVencidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;		
			this.gridBagConstraintsCobrarSaldosVencidos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);								
		
		
		/*
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		*/		
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =0;
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarSaldosVencidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
				
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarSaldosVencidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarSaldosVencidos = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarSaldosVencidos.setLayout(gridaBagLayoutBusquedasParametrosCobrarSaldosVencidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarSaldosVencidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarSaldosVencidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarSaldosVencidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setName("jPanelReporteDinamicoCobrarSaldosVencidos"); 
		
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarSaldosVencidos.setLayout(gridaBagLayoutReporteDinamicoCobrarSaldosVencidos);
		
		
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarSaldosVencidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarSaldosVencidos = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarSaldosVencidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelColumnasSelectReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarSaldosVencidos = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarSaldosVencidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarSaldosVencidos=new JScrollPane(this.jListColumnasSelectReporteCobrarSaldosVencidos);
			
			this.jScrollColumnasSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jListColumnasSelectReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jScrollColumnasSelectReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarSaldosVencidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarSaldosVencidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarSaldosVencidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarSaldosVencidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarSaldosVencidos=new JScrollPane(this.jListRelacionesSelectReporteCobrarSaldosVencidos);
			
			this.jScrollRelacionesSelectReporteCobrarSaldosVencidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarSaldosVencidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarSaldosVencidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarSaldosVencidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarSaldosVencidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelConGraficoDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jCheckBoxConGraficoDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelColumnaCategoriaGraficoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarSaldosVencidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarSaldosVencidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelColumnaCategoriaValorCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jComboBoxColumnaCategoriaValorCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarSaldosVencidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelColumnasValoresGraficoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarSaldosVencidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarSaldosVencidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarSaldosVencidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarSaldosVencidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarSaldosVencidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarSaldosVencidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarSaldosVencidos=new JScrollPane(this.jListColumnasValoresGraficoCobrarSaldosVencidos);
			
			this.jScrollColumnasValoresGraficoCobrarSaldosVencidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarSaldosVencidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarSaldosVencidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jListColumnasSelectReporteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jScrollColumnasValoresGraficoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelTiposGraficosReportesDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarSaldosVencidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelGenerarExcelReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos.setToolTipText("Generar EXCEL"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jButtonGenerarExcelReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jComboBoxTiposReportesDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jLabelTiposArchivoReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos.setToolTipText("Generar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jButtonGenerarReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos.setToolTipText("Cancelar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarSaldosVencidos.add(this.jButtonCerrarReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarSaldosVencidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos= new JScrollPane(jPanelReporteDinamicoCobrarSaldosVencidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarSaldosVencidos);
		this.jInternalFrameReporteDinamicoCobrarSaldosVencidos.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarSaldosVencidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarSaldosVencidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarSaldosVencidos.setName("jPanelImportacionCobrarSaldosVencidos"); 
		
		this.jPanelImportacionCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarSaldosVencidos.setLayout(gridaBagLayoutImportacionCobrarSaldosVencidos);
		
		
		this.jInternalFrameImportacionCobrarSaldosVencidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarSaldosVencidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarSaldosVencidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarSaldosVencidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarSaldosVencidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarSaldosVencidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarSaldosVencidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setResizable(true);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setClosable(true);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarSaldosVencidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarSaldosVencidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarSaldosVencidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setResizable(true);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setClosable(true);
	    this.jInternalFrameImportacionCobrarSaldosVencidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarSaldosVencidos = new JLabelMe();

		this.jLabelArchivoImportacionCobrarSaldosVencidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jLabelArchivoImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarSaldosVencidos = new JFileChooser();		
		this.jFileChooserImportacionCobrarSaldosVencidos.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarSaldosVencidos = new JButtonMe();
		this.jButtonAbrirImportacionCobrarSaldosVencidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarSaldosVencidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarSaldosVencidos.setToolTipText("Generar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jButtonAbrirImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarSaldosVencidos = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarSaldosVencidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jLabelPathArchivoImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarSaldosVencidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarSaldosVencidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarSaldosVencidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarSaldosVencidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jTextFieldPathArchivoImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarSaldosVencidos = new JButtonMe();
		this.jButtonGenerarImportacionCobrarSaldosVencidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarSaldosVencidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarSaldosVencidos.setToolTipText("Generar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jButtonGenerarImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarSaldosVencidos = new JButtonMe();
		this.jButtonCerrarImportacionCobrarSaldosVencidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarSaldosVencidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarSaldosVencidos.setToolTipText("Cancelar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarSaldosVencidos.add(this.jButtonCerrarImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarSaldosVencidos = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarSaldosVencidos= new JScrollPane(jPanelImportacionCobrarSaldosVencidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarSaldosVencidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarSaldosVencidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarSaldosVencidos);
		this.jInternalFrameImportacionCobrarSaldosVencidos.getContentPane().add(this.jScrollPanelImportacionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarSaldosVencidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarSaldosVencidos = new JButtonMe();
			this.jButtonAbrirOrderByCobrarSaldosVencidos.setText("Orden");
			this.jButtonAbrirOrderByCobrarSaldosVencidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarSaldosVencidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarSaldosVencidos";
			inputMap = this.jButtonAbrirOrderByCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarSaldosVencidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarSaldosVencidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarSaldosVencidos.setName("jPanelOrderByCobrarSaldosVencidos"); 
			
			this.jPanelOrderByCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarSaldosVencidos.setLayout(gridaBagLayoutOrderByCobrarSaldosVencidos);
			
			
			this.jTableDatosCobrarSaldosVencidosOrderBy = new JTableMe();        
			this.jTableDatosCobrarSaldosVencidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarSaldosVencidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarSaldosVencidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarSaldosVencidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarSaldosVencidosOrderBy.setViewportView(this.jTableDatosCobrarSaldosVencidosOrderBy);
			this.jTableDatosCobrarSaldosVencidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarSaldosVencidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarSaldosVencidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarSaldosVencidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarSaldosVencidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarSaldosVencidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarSaldosVencidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarSaldosVencidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarSaldosVencidos.setTitle("Orden");
			this.jInternalFrameOrderByCobrarSaldosVencidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarSaldosVencidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarSaldosVencidos.setResizable(true);
			this.jInternalFrameOrderByCobrarSaldosVencidos.setClosable(true);
			this.jInternalFrameOrderByCobrarSaldosVencidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarSaldosVencidos.ipady =150;
				
			this.jPanelOrderByCobrarSaldosVencidos.add(jScrollPanelDatosCobrarSaldosVencidosOrderBy, this.gridBagConstraintsCobrarSaldosVencidos);//this.jTableDatosCobrarSaldosVencidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarSaldosVencidos = new JButtonMe();
			this.jButtonCerrarOrderByCobrarSaldosVencidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarSaldosVencidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarSaldosVencidos.setToolTipText("Cancelar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarSaldosVencidos.add(this.jButtonCerrarOrderByCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarSaldosVencidos = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarSaldosVencidos= new JScrollPane(jPanelOrderByCobrarSaldosVencidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarSaldosVencidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarSaldosVencidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarSaldosVencidos);
			
			this.jInternalFrameOrderByCobrarSaldosVencidos.getContentPane().add(this.jScrollPanelOrderByCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
		
		} else {
			this.jButtonAbrirOrderByCobrarSaldosVencidos = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarSaldosVencidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarSaldosVencidos.getRowHeight();//CobrarSaldosVencidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.isSelected()) {
					iHeightTable=CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarSaldosVencidos.isSelected()) {
					iHeightTable=CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarSaldosVencidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarSaldosVencidos!=null && this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarSaldosVencidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarsaldosvencidosLogic.getCobrarSaldosVencidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarsaldosvencidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarSaldosVencidos> TraerCobrarSaldosVencidosBeans(List<CobrarSaldosVencidos> cobrarsaldosvencidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarSaldosVencidos cobrarsaldosvencidos:cobrarsaldosvencidoss) {
					
				if(!(CobrarSaldosVencidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarSaldosVencidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarsaldosvencidos.setsDetalleGeneralEntityReporte(CobrarSaldosVencidosConstantesFunciones.getCobrarSaldosVencidosDescripcion(cobrarsaldosvencidos));
										
						
					
						
					
				} else  {
							
					//cobrarsaldosvencidos.setsDetalleGeneralEntityReporte(cobrarsaldosvencidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarsaldosvencidosbeans.add(cobrarsaldosvencidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarsaldosvencidoss;
    }
	//PARA REPORTES FIN
}
