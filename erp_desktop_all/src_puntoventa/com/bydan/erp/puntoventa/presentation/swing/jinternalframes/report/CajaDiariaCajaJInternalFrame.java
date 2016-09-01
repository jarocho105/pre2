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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.CajaDiariaCajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class CajaDiariaCajaJInternalFrame extends CajaDiariaCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaDiariaCaja;
	
	protected JMenuBar jmenuBarCajaDiariaCaja;
	
	protected JMenu jmenuCajaDiariaCaja;
	protected JMenu jmenuDatosCajaDiariaCaja;
	protected JMenu jmenuArchivoCajaDiariaCaja;
	protected JMenu jmenuAccionesCajaDiariaCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaDiariaCaja;	
	protected GridBagConstraints gridBagConstraintsCajaDiariaCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaDiariaCajaDetalleFormJInternalFrame jInternalFrameDetalleFormCajaDiariaCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaDiariaCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaDiariaCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public CajaDiariaCajaSessionBean cajadiariacajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaDiariaCaja> cajadiariacajas;		
	public List<CajaDiariaCaja> cajadiariacajasEliminados;	
	public List<CajaDiariaCaja> cajadiariacajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaDiariaCaja;		
	protected JButton jButtonAbrirOrderByCajaDiariaCaja;
	
	
	//protected JPanel jPanelOrderByCajaDiariaCaja;
	//public JScrollPane jScrollPanelOrderByCajaDiariaCaja;	
	//protected JButton jButtonCerrarOrderByCajaDiariaCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaDiariaCajaLogic cajadiariacajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaDiariaCaja;
	public JScrollPane jScrollPanelDatosEdicionCajaDiariaCaja;
	public JScrollPane jScrollPanelDatosGeneralCajaDiariaCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaDiariaCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaDiariaCaja;
	//public JScrollPane jScrollPanelImportacionCajaDiariaCaja;
	
	
	
	protected JPanel jPanelAccionesCajaDiariaCaja;
	
    protected JPanel jPanelPaginacionCajaDiariaCaja;
    protected JPanel jPanelParametrosReportesCajaDiariaCaja;
	protected JPanel jPanelParametrosReportesAccionesCajaDiariaCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaDiariaCaja;
	protected JPanel jPanelParametrosAuxiliar2CajaDiariaCaja;
	protected JPanel jPanelParametrosAuxiliar3CajaDiariaCaja;
	protected JPanel jPanelParametrosAuxiliar4CajaDiariaCaja;
	//protected JPanel jPanelParametrosAuxiliar5CajaDiariaCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaDiariaCaja;
	//protected JPanel jPanelImportacionCajaDiariaCaja;
	
	
	public JTable jTableDatosCajaDiariaCaja;
	
	
	
	//public JTable jTableDatosCajaDiariaCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaDiariaCaja;
	protected JButton jButtonDuplicarCajaDiariaCaja;
	protected JButton jButtonCopiarCajaDiariaCaja;
	protected JButton jButtonVerFormCajaDiariaCaja;
	protected JButton jButtonNuevoRelacionesCajaDiariaCaja;
	protected JButton jButtonModificarCajaDiariaCaja;
	
    protected JButton jButtonGuardarCambiosTablaCajaDiariaCaja;
	protected JButton jButtonCerrarCajaDiariaCaja;
	
	
	protected JButton jButtonRecargarInformacionCajaDiariaCaja;
	protected JButton jButtonProcesarInformacionCajaDiariaCaja;
	
	
	protected JButton jButtonAnterioresCajaDiariaCaja;
	protected JButton jButtonSiguientesCajaDiariaCaja;
	protected JButton jButtonNuevoGuardarCambiosCajaDiariaCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaDiariaCaja;
	//protected JButton jButtonCerrarReporteDinamicoCajaDiariaCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaDiariaCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaDiariaCaja;
	//protected JButton jButtonGenerarImportacionCajaDiariaCaja;
	//protected JButton jButtonCerrarImportacionCajaDiariaCaja;
	//protected JFileChooser jFileChooserImportacionCajaDiariaCaja;
	//protected File fileImportacionCajaDiariaCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaDiariaCaja;
	protected JButton jButtonDuplicarToolBarCajaDiariaCaja;
	protected JButton jButtonNuevoRelacionesToolBarCajaDiariaCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaDiariaCaja;
	protected JButton jButtonCopiarToolBarCajaDiariaCaja;
	protected JButton jButtonVerFormToolBarCajaDiariaCaja;
	public JButton jButtonGuardarCambiosTablaToolBarCajaDiariaCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaDiariaCaja;
	protected JButton jButtonCerrarToolBarCajaDiariaCaja;
	
	protected JButton jButtonRecargarInformacionToolBarCajaDiariaCaja;
	protected JButton jButtonProcesarInformacionToolBarCajaDiariaCaja;
	protected JButton jButtonAnterioresToolBarCajaDiariaCaja;
	protected JButton jButtonSiguientesToolBarCajaDiariaCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja;
	protected JButton jButtonAbrirOrderByToolBarCajaDiariaCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaDiariaCaja;
	protected JMenuItem jMenuItemDuplicarCajaDiariaCaja;
	protected JMenuItem jMenuItemNuevoRelacionesCajaDiariaCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaDiariaCaja;
	protected JMenuItem jMenuItemCopiarCajaDiariaCaja;
	protected JMenuItem jMenuItemVerFormCajaDiariaCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaDiariaCaja;
	protected JMenuItem jMenuItemCerrarCajaDiariaCaja;
	protected JMenuItem jMenuItemDetalleCerrarCajaDiariaCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaDiariaCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaDiariaCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaDiariaCaja;
	protected JMenuItem jMenuItemProcesarInformacionCajaDiariaCaja;
	protected JMenuItem jMenuItemAnterioresCajaDiariaCaja;
	protected JMenuItem jMenuItemSiguientesCajaDiariaCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaDiariaCaja;
	protected JMenuItem jMenuItemAbrirOrderByCajaDiariaCaja;
	protected JMenuItem jMenuItemMostrarOcultarCajaDiariaCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaDiariaCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaDiariaCaja;
	protected JCheckBox jCheckBoxSeleccionadosCajaDiariaCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaDiariaCaja;
	protected JCheckBox jCheckBoxConGraficoReporteCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaDiariaCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaDiariaCaja;
	protected JTextField jTextFieldValorCampoGeneralCajaDiariaCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaDiariaCaja;
	//public JList<Reporte> jListColumnasSelectReporteCajaDiariaCaja;
	//public JScrollPane jScrollColumnasSelectReporteCajaDiariaCaja;
	
	//public JLabel jLabelRelacionesSelectReporteCajaDiariaCaja;
	//public JList<Reporte> jListRelacionesSelectReporteCajaDiariaCaja;
	//public JScrollPane jScrollRelacionesSelectReporteCajaDiariaCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaDiariaCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaDiariaCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaDiariaCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaDiariaCaja;
	
		
	//public JLabel jLabelArchivoImportacionCajaDiariaCaja;	
	//public JLabel jLabelPathArchivoImportacionCajaDiariaCaja;
	//protected JTextField jTextFieldPathArchivoImportacionCajaDiariaCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaDiariaCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaDiariaCaja;
	
	//public JLabel jLabelColumnaCategoriaValorCajaDiariaCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaDiariaCaja;
	
	//public JLabel jLabelColumnasValoresGraficoCajaDiariaCaja;
	//public JList<Reporte> jListColumnasValoresGraficoCajaDiariaCaja;
	//public JScrollPane jScrollColumnasValoresGraficoCajaDiariaCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaDiariaCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaDiariaCaja;
	public JPanel jPanelBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JButton jButtonBusquedaCajaDiariaCajaCajaDiariaCaja;
	
	public JPanel jPanelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JLabel jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JButton jButtonid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja= new JButtonMe();
	public JButton jButtonid_cajaBusquedaCajaDiariaCajaCajaDiariaCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaBusquedaCajaDiariaCajaCajaDiariaCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JLabel jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja;

	public JDateChooser jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JButton jButtonfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JLabel jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja;
	//public JFormattedTextField jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja;

	public JDateChooser jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja;
	public JButton jButtonfecha_finBusquedaCajaDiariaCajaCajaDiariaCajaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajaDiariaCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaDiariaCaja)	{
		this.jButtonRecargarInformacionCajaDiariaCaja = jButtonRecargarInformacionCajaDiariaCaja;
	}
	
	public JButton getjButtonProcesarInformacionCajaDiariaCaja() {
		return this.jButtonProcesarInformacionCajaDiariaCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaDiariaCaja)	{
		this.jButtonProcesarInformacionCajaDiariaCaja = jButtonProcesarInformacionCajaDiariaCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaDiariaCaja() {
		return this.jButtonRecargarInformacionCajaDiariaCaja;
	}
	
	
	public List<CajaDiariaCaja> getcajadiariacajas() {
		return this.cajadiariacajas;
	}

	public void setcajadiariacajas(List<CajaDiariaCaja> cajadiariacajas) {
		this.cajadiariacajas = cajadiariacajas;
	}
	
	public List<CajaDiariaCaja> getcajadiariacajasAux() {
		return this.cajadiariacajasAux;
	}

	public void setcajadiariacajasAux(List<CajaDiariaCaja> cajadiariacajasAux) {
		this.cajadiariacajasAux = cajadiariacajasAux;
	}
	
	public List<CajaDiariaCaja> getcajadiariacajasEliminados() {
		return this.cajadiariacajasEliminados;
	}

	public void setCajaDiariaCajasEliminados(List<CajaDiariaCaja> cajadiariacajasEliminados) {
		this.cajadiariacajasEliminados = cajadiariacajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaDiariaCaja() {
		return jComboBoxTiposSeleccionarCajaDiariaCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaDiariaCaja(
			JComboBox jComboBoxTiposSeleccionarCajaDiariaCaja) {
		this.jComboBoxTiposSeleccionarCajaDiariaCaja = jComboBoxTiposSeleccionarCajaDiariaCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaDiariaCaja() {
		return jTextFieldValorCampoGeneralCajaDiariaCaja;
	}

	public void setjTextFieldValorCampoGeneralCajaDiariaCaja(
			JTextField jTextFieldValorCampoGeneralCajaDiariaCaja) {
		this.jTextFieldValorCampoGeneralCajaDiariaCaja = jTextFieldValorCampoGeneralCajaDiariaCaja;
	}

	public void setBorderResaltarValorCampoGeneralCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaDiariaCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaDiariaCaja() {
		return this.jCheckBoxSeleccionarTodosCajaDiariaCaja;
	}

	public void setjCheckBoxSeleccionarTodosCajaDiariaCaja(
			JCheckBox jCheckBoxSeleccionarTodosCajaDiariaCaja) {
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja = jCheckBoxSeleccionarTodosCajaDiariaCaja;
	}

	public void setBorderResaltarSeleccionarTodosCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaDiariaCaja() {
		return this.jCheckBoxSeleccionadosCajaDiariaCaja;
	}

	public void setjCheckBoxSeleccionadosCajaDiariaCaja(
			JCheckBox jCheckBoxSeleccionadosCajaDiariaCaja) {
		this.jCheckBoxSeleccionadosCajaDiariaCaja = jCheckBoxSeleccionadosCajaDiariaCaja;
	}
	
	public void setBorderResaltarSeleccionadosCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaDiariaCaja() {
		return this.jComboBoxTiposArchivosReportesCajaDiariaCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaDiariaCaja(
			JComboBox jComboBoxTiposArchivosReportesCajaDiariaCaja) {
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja = jComboBoxTiposArchivosReportesCajaDiariaCaja;
	}

	public void setBorderResaltarTiposArchivosReportesCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaDiariaCaja() {
		return this.jComboBoxTiposReportesCajaDiariaCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaDiariaCaja(
			JComboBox jComboBoxTiposReportesCajaDiariaCaja) {
		this.jComboBoxTiposReportesCajaDiariaCaja = jComboBoxTiposReportesCajaDiariaCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaDiariaCaja() {
	//	return jComboBoxTiposReportesDinamicoCajaDiariaCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaDiariaCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaDiariaCaja) {
	//	this.jComboBoxTiposReportesDinamicoCajaDiariaCaja = jComboBoxTiposReportesDinamicoCajaDiariaCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja = jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja;
	//}
	
	public void setBorderResaltarTiposReportesCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaDiariaCaja() {
		return this.jComboBoxTiposGraficosReportesCajaDiariaCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaDiariaCaja(
			JComboBox jComboBoxTiposGraficosReportesCajaDiariaCaja) {
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja = jComboBoxTiposGraficosReportesCajaDiariaCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaDiariaCaja() {
		return this.jComboBoxTiposPaginacionCajaDiariaCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaDiariaCaja(
			JComboBox jComboBoxTiposPaginacionCajaDiariaCaja) {
		this.jComboBoxTiposPaginacionCajaDiariaCaja = jComboBoxTiposPaginacionCajaDiariaCaja;
	}
	
	public void setBorderResaltarTiposPaginacionCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaDiariaCaja() {
		return this.jComboBoxTiposRelacionesCajaDiariaCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaDiariaCaja() {
		return this.jComboBoxTiposAccionesCajaDiariaCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaDiariaCaja(
			JComboBox jComboBoxTiposRelacionesCajaDiariaCaja) {
		this.jComboBoxTiposRelacionesCajaDiariaCaja = jComboBoxTiposRelacionesCajaDiariaCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaDiariaCaja(
			JComboBox jComboBoxTiposAccionesCajaDiariaCaja) {
		this.jComboBoxTiposAccionesCajaDiariaCaja = jComboBoxTiposAccionesCajaDiariaCaja;
	}
	
	public void setBorderResaltarTiposRelacionesCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaDiariaCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaDiariaCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaDiariaCaja() {
	//	return jCheckBoxConGraficoDinamicoCajaDiariaCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaDiariaCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaDiariaCaja) {
	//	this.jCheckBoxConGraficoDinamicoCajaDiariaCaja = jCheckBoxConGraficoDinamicoCajaDiariaCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaDiariaCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaDiariaCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaDiariaCaja .setBorder(borderResaltar);		
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
		this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
		
		this.cajadiariacajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariacajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajadiariacajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaDiariaCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaDiariaCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Diaria Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaDiariaCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaDiariaCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaDiariaCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"nuevo","nuevo","Nuevo"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"duplicar","duplicar","Duplicar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"copiar","copiar","Copiar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"ver_form","ver_form","Ver"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"recargar","recargar","Buscar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaDiariaCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,
							"cerrar","cerrar","Salir"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaDiariaCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaDiariaCaja;
			
				this.jButtonProcesarInformacionToolBarCajaDiariaCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaDiariaCaja;
				
		//protected JButton jButtonModificarToolBarCajaDiariaCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaDiariaCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaDiariaCaja=new JMenuMe("General");
		this.jmenuArchivoCajaDiariaCaja=new JMenuMe("Archivo");
		this.jmenuAccionesCajaDiariaCaja=new JMenuMe("Acciones");
		this.jmenuDatosCajaDiariaCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaDiariaCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaDiariaCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaDiariaCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaDiariaCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaDiariaCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaDiariaCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaDiariaCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaDiariaCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaDiariaCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaDiariaCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaDiariaCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaDiariaCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaDiariaCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaDiariaCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaDiariaCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaDiariaCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaDiariaCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaDiariaCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaDiariaCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaDiariaCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaDiariaCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaDiariaCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaDiariaCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaDiariaCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaDiariaCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaDiariaCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaDiariaCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaDiariaCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaDiariaCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaDiariaCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaDiariaCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaDiariaCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaDiariaCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaDiariaCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaDiariaCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaDiariaCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaDiariaCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaDiariaCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaDiariaCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaDiariaCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaDiariaCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaDiariaCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaDiariaCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaDiariaCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaDiariaCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaDiariaCaja.add(this.jMenuItemCerrarCajaDiariaCaja);
			
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemNuevoCajaDiariaCaja);
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja);
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemNuevoRelacionesCajaDiariaCaja);
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemGuardarCambiosTablaCajaDiariaCaja);		
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemDuplicarCajaDiariaCaja);		
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemCopiarCajaDiariaCaja);		
			this.jmenuAccionesCajaDiariaCaja.add(this.jMenuItemVerFormCajaDiariaCaja);		
			
			this.jmenuDatosCajaDiariaCaja.add(this.jMenuItemRecargarInformacionCajaDiariaCaja);				
			this.jmenuDatosCajaDiariaCaja.add(this.jMenuItemAnterioresCajaDiariaCaja);				
			this.jmenuDatosCajaDiariaCaja.add(this.jMenuItemSiguientesCajaDiariaCaja);				
			this.jmenuDatosCajaDiariaCaja.add(this.jMenuItemAbrirOrderByCajaDiariaCaja);				
			this.jmenuDatosCajaDiariaCaja.add(this.jMenuItemMostrarOcultarCajaDiariaCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaDiariaCaja.add(this.jMenuItemGuardarCambiosCajaDiariaCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaDiariaCaja.add(this.jmenuArchivoCajaDiariaCaja);		
			this.jmenuBarCajaDiariaCaja.add(this.jmenuAccionesCajaDiariaCaja);		
			this.jmenuBarCajaDiariaCaja.add(this.jmenuDatosCajaDiariaCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaDiariaCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaDiariaCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.setToolTipText("Buscar Por Caja Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja= new JButtonMe();
		this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja.setText("Buscar");
		this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja.setToolTipText("Buscar Por Caja Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja,"buscar_button","Buscar Por Caja Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja = new JLabelMe();
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setText("Caja :");
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setToolTipText("Caja");
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja= new JComboBoxMe();
		jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja = new JLabelMe();
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja= new JDateChooser();
		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setDate(new Date());
		jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja = new JLabelMe();
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setText("Fecha Fin :");
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja= new JDateChooser();
		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setDate(new Date());
		jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCajaDiariaCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaDiariaCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCajaDiariaCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCajaDiariaCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaDiariaCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaDiariaCaja = new CajaDiariaCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Diaria Caja DATOS");
			this.jInternalFrameDetalleFormCajaDiariaCaja = new CajaDiariaCajaDetalleFormJInternalFrame(jDesktopPane,this.cajadiariacajaSessionBean.getConGuardarRelaciones(),this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaDiariaCaja = null;//new CajaDiariaCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaDiariaCaja= new GridBagLayout();
		
		
		this.jTableDatosCajaDiariaCaja = new JTableMe();      
		
		String sToolTipCajaDiariaCaja="";
		sToolTipCajaDiariaCaja=CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaDiariaCaja+="(PuntoVenta.CajaDiariaCaja)";
		}
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaDiariaCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaDiariaCaja.setToolTipText(sToolTipCajaDiariaCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaDiariaCaja);
		this.jTableDatosCajaDiariaCaja.setAutoCreateRowSorter(true);
		this.jTableDatosCajaDiariaCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaDiariaCaja.setRowSelectionAllowed(true);
		this.jTableDatosCajaDiariaCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaDiariaCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaDiariaCaja = new JButtonMe();
		this.jButtonDuplicarCajaDiariaCaja = new JButtonMe();
		this.jButtonCopiarCajaDiariaCaja = new JButtonMe();
		this.jButtonVerFormCajaDiariaCaja = new JButtonMe();
		this.jButtonNuevoRelacionesCajaDiariaCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja = new JButtonMe();
		this.jButtonCerrarCajaDiariaCaja = new JButtonMe();
		
		this.jScrollPanelDatosCajaDiariaCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaDiariaCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Diaria Caja";
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaDiariaCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaDiariaCaja.setToolTipText("Acciones");
        this.jPanelAccionesCajaDiariaCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaDiariaCaja=new ReporteDinamicoJInternalFrame(CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaDiariaCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaDiariaCaja=new ImportacionJInternalFrame(CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaDiariaCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaDiariaCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaDiariaCaja.setText("Orden");
		this.jButtonAbrirOrderByCajaDiariaCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaDiariaCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaDiariaCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaCaja,false,this);
			
			//this.cargarOrderByCajaDiariaCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaDiariaCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaCaja,true,this);
			
			//this.cargarOrderByCajaDiariaCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaDiariaCaja.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCajaDiariaCaja.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCajaDiariaCaja.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCajaDiariaCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaDiariaCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaDiariaCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaDiariaCaja.setText("Nuevo");
		this.jButtonDuplicarCajaDiariaCaja.setText("Duplicar");
		this.jButtonCopiarCajaDiariaCaja.setText("Copiar");
		this.jButtonVerFormCajaDiariaCaja.setText("Ver");
		this.jButtonNuevoRelacionesCajaDiariaCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.setText("Guardar");
		this.jButtonCerrarCajaDiariaCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaDiariaCaja,"nuevo_button","Nuevo",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaDiariaCaja,"duplicar_button","Duplicar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaDiariaCaja,"copiar_button","Copiar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaDiariaCaja,"ver_form","Ver",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaDiariaCaja,"nuevorelaciones_button","Nuevo Rel",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaDiariaCaja,"guardarcambiostabla_button","Guardar",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaDiariaCaja,"cerrar_button","Salir",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaDiariaCaja.setToolTipText("Nuevo"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaDiariaCaja.setToolTipText("Duplicar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaDiariaCaja.setToolTipText("Copiar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaDiariaCaja.setToolTipText("Ver"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaDiariaCaja.setToolTipText("Nuevo Rel"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.setToolTipText("Guardar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaDiariaCaja.setToolTipText("Salir"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaDiariaCaja";
		inputMap = this.jButtonNuevoCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaDiariaCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaDiariaCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaDiariaCaja";
		inputMap = this.jButtonDuplicarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaDiariaCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaDiariaCaja"));
		
		//COPIAR
		sMapKey = "CopiarCajaDiariaCaja";
		inputMap = this.jButtonCopiarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaDiariaCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaDiariaCaja"));
		
		//VEr FORM
		sMapKey = "VerFormCajaDiariaCaja";
		inputMap = this.jButtonVerFormCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaDiariaCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaDiariaCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaDiariaCaja";
		inputMap = this.jButtonNuevoRelacionesCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaDiariaCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaDiariaCaja";
		inputMap = this.jButtonModificarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaDiariaCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaDiariaCaja";
		inputMap = this.jButtonCerrarCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaDiariaCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaDiariaCaja";
		inputMap = this.jButtonGuardarCambiosTablaCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaDiariaCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaDiariaCaja.setName("jPanelParametrosReportesCajaDiariaCaja"); 
		
		this.jPanelParametrosReportesAccionesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaDiariaCaja.setName("jPanelParametrosReportesAccionesCajaDiariaCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaDiariaCaja = new JButtonMe();
		this.jButtonRecargarInformacionCajaDiariaCaja.setText("Buscar");
		this.jButtonRecargarInformacionCajaDiariaCaja.setToolTipText("Buscar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaDiariaCaja,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCajaDiariaCaja.setVisible(false);
		
		
		this.jButtonProcesarInformacionCajaDiariaCaja = new JButtonMe();
		this.jButtonProcesarInformacionCajaDiariaCaja.setText("Procesar");
		this.jButtonProcesarInformacionCajaDiariaCaja.setToolTipText("Procesar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaDiariaCaja.setVisible(false);
			
		this.jButtonProcesarInformacionCajaDiariaCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaDiariaCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaDiariaCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setText("TIPO");       
		this.jComboBoxTiposReportesCajaDiariaCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaDiariaCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaDiariaCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaDiariaCaja.setText("Accion");
		this.jComboBoxTiposRelacionesCajaDiariaCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaDiariaCaja.setText("Accion");
		this.jComboBoxTiposAccionesCajaDiariaCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaDiariaCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaDiariaCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaDiariaCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaDiariaCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaDiariaCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaDiariaCaja = new JLabelMe();
		
		this.jLabelAccionesCajaDiariaCaja.setText("Acciones");		
		this.jLabelAccionesCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaDiariaCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaDiariaCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaDiariaCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaDiariaCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaDiariaCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaDiariaCaja = new JButtonMe();
		//this.jButtonAnterioresCajaDiariaCaja.setText("<<");
        this.jButtonAnterioresCajaDiariaCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaDiariaCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaDiariaCaja = new JButtonMe();
		//this.jButtonSiguientesCajaDiariaCaja.setText(">>");
        this.jButtonSiguientesCajaDiariaCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaDiariaCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaDiariaCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaDiariaCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaDiariaCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaDiariaCaja,"nuevoguardarcambios_button","Nue",this.cajadiariacajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaDiariaCaja";
		inputMap = this.jButtonNuevoGuardarCambiosCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaDiariaCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaDiariaCaja";
		inputMap = this.jButtonRecargarInformacionCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaDiariaCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaDiariaCaja";
		inputMap = this.jButtonSiguientesCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaDiariaCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaDiariaCaja";
		inputMap = this.jButtonAnterioresCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaDiariaCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaDiariaCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaDiariaCaja.setMinimumSize(new Dimension(this.getWidth(),CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaDiariaCaja.setMaximumSize(new Dimension(this.getWidth(),CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaDiariaCaja.setPreferredSize(new Dimension(this.getWidth(),CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaDiariaCaja = new GridBagLayout();

			this.jPanelPaginacionCajaDiariaCaja.setLayout(gridaBagLayoutPaginacionCajaDiariaCaja);						
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonAnterioresCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					
						
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
			
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonNuevoGuardarCambiosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
						
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonSiguientesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonNuevoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
						
			
			
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
				this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonGuardarCambiosTablaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			}
			
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonDuplicarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonCopiarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonVerFormCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 1;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaDiariaCaja.add(this.jButtonCerrarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		
		this.jButtonRecargarInformacionCajaDiariaCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaDiariaCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaDiariaCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaDiariaCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaDiariaCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaDiariaCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaDiariaCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaDiariaCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaDiariaCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaDiariaCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaDiariaCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaDiariaCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaDiariaCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaDiariaCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaDiariaCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaDiariaCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaDiariaCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaDiariaCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaDiariaCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaDiariaCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaDiariaCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaDiariaCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaDiariaCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaDiariaCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaDiariaCaja.setLayout(gridaBagParametrosReportesCajaDiariaCaja);
			this.jPanelParametrosReportesAccionesCajaDiariaCaja.setLayout(gridaBagParametrosReportesAccionesCajaDiariaCaja);
			
			
			this.jPanelParametrosAuxiliar1CajaDiariaCaja.setLayout(gridaBagParametrosAuxiliar1CajaDiariaCaja);
			this.jPanelParametrosAuxiliar2CajaDiariaCaja.setLayout(gridaBagParametrosAuxiliar2CajaDiariaCaja);
			this.jPanelParametrosAuxiliar3CajaDiariaCaja.setLayout(gridaBagParametrosAuxiliar3CajaDiariaCaja);
			this.jPanelParametrosAuxiliar4CajaDiariaCaja.setLayout(gridaBagParametrosAuxiliar4CajaDiariaCaja);
			//this.jPanelParametrosAuxiliar5CajaDiariaCaja.setLayout(gridaBagParametrosAuxiliar2CajaDiariaCaja);			
			
			
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jButtonRecargarInformacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaCaja.add(this.jComboBoxTiposPaginacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaCaja.add(this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaCaja.add(this.jComboBoxTiposArchivosReportesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jPanelParametrosAuxiliar1CajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaDiariaCaja.add(this.jComboBoxTiposReportesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);																		
			
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CajaDiariaCaja.add(this.jComboBoxTiposGraficosReportesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jPanelParametrosAuxiliar4CajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jComboBoxTiposReportesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jCheckBoxGenerarReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jPanelParametrosAuxiliar2CajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jLabelAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaDiariaCaja.add(this.jButtonAbrirOrderByCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jComboBoxTiposSeleccionarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
			
			
			/*
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jCheckBoxSeleccionarTodosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jCheckBoxConGraficoReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaCaja.add(this.jCheckBoxSeleccionarTodosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);															
				
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaCaja.add(this.jCheckBoxSeleccionadosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);															
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaCaja.add(this.jCheckBoxConGraficoReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jPanelParametrosAuxiliar3CajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaCaja.add(this.jComboBoxTiposAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaDiariaCaja = new GridBagLayout();

			this.jScrollPanelDatosCajaDiariaCaja.setLayout(gridaBagLayoutDatosCajaDiariaCaja);
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
			
			this.jScrollPanelDatosCajaDiariaCaja.add(this.jTableDatosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaDiariaCaja.setViewportView(this.jTableDatosCajaDiariaCaja);
		this.jTableDatosCajaDiariaCaja.setFillsViewportHeight(true);
		this.jTableDatosCajaDiariaCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaDiariaCaja= new GridBagLayout();
		this.jPanelAccionesCajaDiariaCaja.setLayout(gridaBagLayoutAccionesCajaDiariaCaja);
		
		
		/*	
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = 0;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
			
		this.jPanelAccionesCajaDiariaCaja.add(this.jButtonNuevoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja= new GridBagLayout();
		gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.setLayout(gridaBagLayoutBusquedaCajaDiariaCajaCajaDiariaCaja);

		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 0;
		gridBagConstraintsCajaDiariaCaja.gridx = 0;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jLabelid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);

		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 0;
		gridBagConstraintsCajaDiariaCaja.gridx = 1;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);


		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 1;
		gridBagConstraintsCajaDiariaCaja.gridx = 0;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jLabelfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);

		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 1;
		gridBagConstraintsCajaDiariaCaja.gridx = 1;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);


		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 2;
		gridBagConstraintsCajaDiariaCaja.gridx = 0;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jLabelfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);

		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 2;
		gridBagConstraintsCajaDiariaCaja.gridx = 1;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);

		gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaCaja.gridy = 3;
		gridBagConstraintsCajaDiariaCaja.gridx =1;
		jPanelBusquedaCajaDiariaCajaCajaDiariaCaja.add(jButtonBusquedaCajaDiariaCajaCajaDiariaCaja, gridBagConstraintsCajaDiariaCaja);

		jTabbedPaneBusquedasCajaDiariaCaja.addTab("1.-Por Caja Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);
		jTabbedPaneBusquedasCajaDiariaCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaDiariaCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaDiariaCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();						
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;		
			//this.gridBagConstraintsCajaDiariaCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaDiariaCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;		
		//this.gridBagConstraintsCajaDiariaCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaDiariaCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaDiariaCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaCaja.gridx = 0;		
			this.gridBagConstraintsCajaDiariaCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaDiariaCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);								
		
		
		/*
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		*/		
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaCaja.gridx =0;
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaDiariaCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
				
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaDiariaCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaDiariaCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaDiariaCaja.setLayout(gridaBagLayoutBusquedasParametrosCajaDiariaCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaDiariaCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
			
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaDiariaCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaDiariaCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaDiariaCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaDiariaCaja.setName("jPanelReporteDinamicoCajaDiariaCaja"); 
		
		this.jPanelReporteDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaDiariaCaja.setLayout(gridaBagLayoutReporteDinamicoCajaDiariaCaja);
		
		
		this.jInternalFrameReporteDinamicoCajaDiariaCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaDiariaCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaDiariaCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaDiariaCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaDiariaCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaDiariaCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaDiariaCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaDiariaCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaDiariaCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaDiariaCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelColumnasSelectReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaDiariaCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaDiariaCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaDiariaCaja=new JScrollPane(this.jListColumnasSelectReporteCajaDiariaCaja);
			
			this.jScrollColumnasSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jListColumnasSelectReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jScrollColumnasSelectReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaDiariaCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaDiariaCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaDiariaCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaDiariaCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaDiariaCaja=new JScrollPane(this.jListRelacionesSelectReporteCajaDiariaCaja);
			
			this.jScrollRelacionesSelectReporteCajaDiariaCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaDiariaCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaDiariaCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajaDiariaCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaDiariaCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaDiariaCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaDiariaCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajaDiariaCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoCajaDiariaCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelConGraficoDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajaDiariaCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajaDiariaCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajaDiariaCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jCheckBoxConGraficoDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajaDiariaCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajaDiariaCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelColumnaCategoriaGraficoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajaDiariaCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajaDiariaCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelColumnaCategoriaValorCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajaDiariaCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaDiariaCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jComboBoxColumnaCategoriaValorCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajaDiariaCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajaDiariaCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelColumnasValoresGraficoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajaDiariaCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajaDiariaCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajaDiariaCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajaDiariaCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaDiariaCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaDiariaCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajaDiariaCaja=new JScrollPane(this.jListColumnasValoresGraficoCajaDiariaCaja);
			
			this.jScrollColumnasValoresGraficoCajaDiariaCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaDiariaCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaDiariaCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jListColumnasSelectReporteCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jScrollColumnasValoresGraficoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelTiposGraficosReportesDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaDiariaCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelGenerarExcelReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja.setToolTipText("Generar EXCEL"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jComboBoxTiposReportesDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jLabelTiposArchivoReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaDiariaCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaDiariaCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaDiariaCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaDiariaCaja.setToolTipText("Generar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jButtonGenerarReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaDiariaCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaDiariaCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaDiariaCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaDiariaCaja.setToolTipText("Cancelar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaCaja.add(this.jButtonCerrarReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaDiariaCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaDiariaCaja= new JScrollPane(jPanelReporteDinamicoCajaDiariaCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaDiariaCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaDiariaCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaDiariaCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaDiariaCaja);
		this.jInternalFrameReporteDinamicoCajaDiariaCaja.getContentPane().add(this.jScrollPanelReporteDinamicoCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaDiariaCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaDiariaCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaDiariaCaja.setName("jPanelImportacionCajaDiariaCaja"); 
		
		this.jPanelImportacionCajaDiariaCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaDiariaCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaDiariaCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaDiariaCaja.setLayout(gridaBagLayoutImportacionCajaDiariaCaja);
		
		
		this.jInternalFrameImportacionCajaDiariaCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaDiariaCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaDiariaCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaDiariaCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaDiariaCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaDiariaCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaDiariaCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaDiariaCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaDiariaCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaDiariaCaja.setResizable(true);
	    this.jInternalFrameImportacionCajaDiariaCaja.setClosable(true);
	    this.jInternalFrameImportacionCajaDiariaCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaDiariaCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaDiariaCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaDiariaCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaDiariaCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaDiariaCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaDiariaCaja.setResizable(true);
	    this.jInternalFrameImportacionCajaDiariaCaja.setClosable(true);
	    this.jInternalFrameImportacionCajaDiariaCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaDiariaCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaDiariaCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaDiariaCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaDiariaCaja = new JLabelMe();

		this.jLabelArchivoImportacionCajaDiariaCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaDiariaCaja.add(this.jLabelArchivoImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaDiariaCaja = new JFileChooser();		
		this.jFileChooserImportacionCajaDiariaCaja.setToolTipText("ESCOGER ARCHIVO"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaDiariaCaja = new JButtonMe();
		this.jButtonAbrirImportacionCajaDiariaCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaDiariaCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaDiariaCaja.setToolTipText("Generar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaCaja.add(this.jButtonAbrirImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaDiariaCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaDiariaCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaDiariaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaDiariaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaDiariaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaDiariaCaja.add(this.jLabelPathArchivoImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaDiariaCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaDiariaCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaDiariaCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaDiariaCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaCaja.add(this.jTextFieldPathArchivoImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaDiariaCaja = new JButtonMe();
		this.jButtonGenerarImportacionCajaDiariaCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaDiariaCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaDiariaCaja.setToolTipText("Generar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaCaja.add(this.jButtonGenerarImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaDiariaCaja = new JButtonMe();
		this.jButtonCerrarImportacionCajaDiariaCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaDiariaCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaDiariaCaja.setToolTipText("Cancelar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaCaja.add(this.jButtonCerrarImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaDiariaCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaDiariaCaja= new JScrollPane(jPanelImportacionCajaDiariaCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaDiariaCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaDiariaCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaDiariaCaja);
		this.jInternalFrameImportacionCajaDiariaCaja.getContentPane().add(this.jScrollPanelImportacionCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaDiariaCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaDiariaCaja = new JButtonMe();
			this.jButtonAbrirOrderByCajaDiariaCaja.setText("Orden");
			this.jButtonAbrirOrderByCajaDiariaCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaDiariaCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaDiariaCaja";
			inputMap = this.jButtonAbrirOrderByCajaDiariaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaDiariaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaDiariaCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaDiariaCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaDiariaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaDiariaCaja.setName("jPanelOrderByCajaDiariaCaja"); 
			
			this.jPanelOrderByCajaDiariaCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaDiariaCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaDiariaCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaDiariaCaja.setLayout(gridaBagLayoutOrderByCajaDiariaCaja);
			
			
			this.jTableDatosCajaDiariaCajaOrderBy = new JTableMe();        
			this.jTableDatosCajaDiariaCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaDiariaCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaDiariaCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaDiariaCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaDiariaCajaOrderBy.setViewportView(this.jTableDatosCajaDiariaCajaOrderBy);
			this.jTableDatosCajaDiariaCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaDiariaCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaDiariaCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaDiariaCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaDiariaCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaDiariaCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaDiariaCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaDiariaCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaDiariaCaja.setTitle("Orden");
			this.jInternalFrameOrderByCajaDiariaCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaDiariaCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaDiariaCaja.setResizable(true);
			this.jInternalFrameOrderByCajaDiariaCaja.setClosable(true);
			this.jInternalFrameOrderByCajaDiariaCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaDiariaCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaDiariaCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaDiariaCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaDiariaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaDiariaCaja.ipady =150;
				
			this.jPanelOrderByCajaDiariaCaja.add(jScrollPanelDatosCajaDiariaCajaOrderBy, this.gridBagConstraintsCajaDiariaCaja);//this.jTableDatosCajaDiariaCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaDiariaCaja = new JButtonMe();
			this.jButtonCerrarOrderByCajaDiariaCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaDiariaCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaDiariaCaja.setToolTipText("Cancelar"+" "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaDiariaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaDiariaCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaDiariaCaja.add(this.jButtonCerrarOrderByCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaDiariaCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaDiariaCaja= new JScrollPane(jPanelOrderByCajaDiariaCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaDiariaCaja = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaDiariaCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaDiariaCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaDiariaCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaDiariaCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaDiariaCaja);
			
			this.jInternalFrameOrderByCajaDiariaCaja.getContentPane().add(this.jScrollPanelOrderByCajaDiariaCaja, this.gridBagConstraintsCajaDiariaCaja);			
		
		} else {
			this.jButtonAbrirOrderByCajaDiariaCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cajadiariacajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCajaDiariaCaja.getRowHeight();//CajaDiariaCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.isSelected()) {
					iHeightTable=CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaDiariaCaja.isSelected()) {
					iHeightTable=CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaDiariaCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaDiariaCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaDiariaCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaDiariaCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaDiariaCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaDiariaCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaDiariaCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaDiariaCaja!=null && this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaDiariaCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaDiariaCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaDiariaCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaDiariaCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaDiariaCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaDiariaCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cajadiariacajaLogic.getCajaDiariaCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariacajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaDiariaCaja> TraerCajaDiariaCajaBeans(List<CajaDiariaCaja> cajadiariacajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaDiariaCaja cajadiariacaja:cajadiariacajas) {
					
				if(!(CajaDiariaCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaDiariaCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajadiariacaja.setsDetalleGeneralEntityReporte(CajaDiariaCajaConstantesFunciones.getCajaDiariaCajaDescripcion(cajadiariacaja));
										
						
					
						
					
				} else  {
							
					//cajadiariacaja.setsDetalleGeneralEntityReporte(cajadiariacaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajadiariacajabeans.add(cajadiariacajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajadiariacajas;
    }
	//PARA REPORTES FIN
}
